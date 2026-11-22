function cercaniasRenderAbajo(ctx, state, pids, theme) {
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
                .pos(0, 60)
                .size(pids.width, 1)
                .draw(ctx);

            let words = arrival.routeNumber().split("\\|");
            for (let j = 0; j < words.length; j++) {
                Text.create("Ruta")
                    .text(words[j])
                    .color(whiteColor)
                    .centerAlign()
                    .size(24,20)
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
                .text(PIDSCustomUtil.t("eta"))
                .color(arrival.routeColor())
                .pos(0, 63.65)
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
                .pos(pids.width, 63.65)
                .rightAlign()
                .scale(0.9)
                .draw(ctx);
        } else {

            Texture.create("Ferrocarril Logo")
                .texture(logo)
                .pos(2, 14)
                .size(logoWidth, logoHeight)
                .draw(ctx);

            Text.create("Clock")
                .text(PIDSCustomUtil.formatTime(MinecraftClient.worldDayTime(), true))
                .color(0xFFFFFF)
                .pos(96, 32)
                .scale(1.5)
                .draw(ctx);
        }
    } else {
        Texture.create("Ferrocarril Logo")
                .texture(logo)
                .pos(2, 14)
                .size(logoWidth, logoHeight)
                .draw(ctx);

            Text.create("Clock")
                .text(PIDSCustomUtil.formatTime(MinecraftClient.worldDayTime(), true))
                .color(0xFFFFFF)
                .pos(96, 32)
                .scale(1.5)
                .draw(ctx);
    }
}
