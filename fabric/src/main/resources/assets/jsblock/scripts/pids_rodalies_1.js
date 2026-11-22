include(Resources.id("jsblock:scripts/pids_cercanias_util.js"));
include(Resources.id("jsblock:scripts/pids_cercanias_render_abajo.js"));
include(Resources.id("jsblock:scripts/pids_util.js")); // se mantiene por si algo más lo usa

PIDSCustomUtil.lang = "ca";

// Marca propia de Rodalies. Cambia la ruta si tu PNG se llama de otra forma.
const THEME = {
    logo: "jsblock:textures/rodalies.png",
    // background: "jsblock:textures/background_rodalies.png" // descomenta si el fondo también cambia
    logoWidth: 95,
    logoHeight: 35
};

function create(ctx, state, pids) {
    print("Hello World ^^");
}

function render(ctx, state, pids) {
    cercaniasRenderAbajo(ctx, state, pids, THEME);
}

function dispose(ctx, state, pids) {
    print("Goodbye World ^^;");
}
