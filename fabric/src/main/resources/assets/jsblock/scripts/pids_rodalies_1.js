include(Resources.id("jsblock:scripts/pids_cercanias_util.js"));
include(Resources.id("jsblock:scripts/pids_cercanias_render_abajo.js"));
include(Resources.id("jsblock:scripts/pids_util.js"));

PIDSCustomUtil.lang = "ca";


const THEME = {
    logo: "jsblock:textures/rodalies.png",
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
