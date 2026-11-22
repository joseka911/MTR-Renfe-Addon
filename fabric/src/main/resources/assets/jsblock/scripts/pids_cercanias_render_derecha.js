// Render del formato "derecha" (tiempo estimado en un panel a la derecha).
// Posiciones idénticas al original. Solo se han sustituido los textos
// y el cálculo de paradas por llamadas a PIDSCustomUtil.
// Las imágenes (fondo y logo) se pueden cambiar por script con el parámetro 'theme'.

function cercaniasRenderDerecha(ctx, state, pids, theme) {
    // Imágenes: si el script no pasa 'theme', se usan las de Renfe de siempre.
    let background = (theme && theme.background) ? theme.background : "jsblock:textures/background_cercanias.png";
    let logo = (theme && theme.logo) ? theme.logo : "jsblock:textures/renfe-logo-white.png";
    let logoWidth = (theme && theme.logoWidth) ? theme.logoWidth : 90;
    let logoHeight = (theme && theme.logoHeight) ? theme.logoHeight : 45;

    let whiteColor = 0xFFFFFF;

    let arrival = pids.arrivals().get(0);
    Texture.create("Background") // <----------
    .texture(background)
    .size(pids.width, pids.height)
    .draw(ctx);

    if (arrival != null && !pids.isRowHidden(0)) {
        let willArriveIn = arrival.arrivalTime() - Date.now();
        let stops = arrival.route().getPlatforms().toArray().map((platform) => platform.stationName);
        let stops_at = PIDSCustomUtil.getStopsText(stops, pids.station().getName());

        if (willArriveIn <= 60000) {
            Texture.create("Route Colored")
                .texture("jsblock:textures/white_route_template.png")
                .color(arrival.routeColor()) // Note this part!
                .pos(0, 0)
                .size(50, 60)
                .draw(ctx);

            Texture.create("Route Colored")
                .texture("jsblock:textures/white_route_template.png")
                .color(arrival.routeColor()) // Note this part!
                .pos(136, 0)
                .size(1, pids.height)
                .draw(ctx);

            let words = arrival.routeNumber().split("\\|");
            for (let j = 0; j < words.length; j++) {
                Text.create("Ruta")
                    .text(words[j])
                    .color(whiteColor)
                    .centerAlign()
                    .size(24,20)
                    //.scaleXY()
                    .stretchXY()
                    .pos(25, 10 + (j * 20))
                    .scale(2)
                    .draw(ctx);
            }
            Text.create()
                .text(PIDSCustomUtil.t("destination"))
                .color(arrival.routeColor())
                .pos(50, 1)
                .scale(1.1)
                .draw(ctx);

            Text.create()
                .text(PIDSCustomUtil.t("eta2"))
                .color(arrival.routeColor())
                .size(50,40)
                .wrapText()
                .pos(162, 15)
                .centerAlign()
                .scale(0.9)
                .draw(ctx);

            Text.create("Estación destino")
                .text(TextUtil.cycleString(arrival.destination()))
                .color(whiteColor)
                .pos(50, 11)
                .scale(0.9)
                .draw(ctx);

            Text.create()
                .text(PIDSCustomUtil.t("stopsAt"))
                .color(arrival.routeColor())
                .pos(50, 35)
                .scale(1.1)
                .draw(ctx);

            Text.create("Estaciones que para")
                .text(stops_at)
                .color(whiteColor)
                .size(80, 6)
                .marquee()
                .pos(50, 47)
                .scale(1)
                .draw(ctx);

            Text.create("ETA.")
                .text(PIDSCustomUtil.getETAText(arrival.arrivalTime()))
                .color(whiteColor)
                .pos(160.7, 35)
                .centerAlign()
                .scale(0.9)
                .draw(ctx);
        } else {

            Texture.create("Ferrocarril Logo")
                .texture(logo)
                .pos(2, 8)
                .size(logoWidth, logoHeight)
                .draw(ctx);

            Text.create("Clock")
                .text(PIDSCustomUtil.formatTime(MinecraftClient.worldDayTime(), true)) // Note this here!
                .color(0xFFFFFF)
                .pos(148, 25)
                .scale(1.5)
                .draw(ctx);
        }
    } else {
            Texture.create("Ferrocarril Logo")
                .texture(logo)
                .pos(2, 8)
                .size(logoWidth, logoHeight)
                .draw(ctx);

            Text.create("Clock")
                .text(PIDSCustomUtil.formatTime(MinecraftClient.worldDayTime(), true)) // Note this here!
                .color(0xFFFFFF)
                .pos(148, 25)
                .scale(1.5)
                .draw(ctx);
    }
}
