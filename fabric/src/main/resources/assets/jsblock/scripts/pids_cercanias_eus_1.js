include(Resources.id("jsblock:scripts/pids_cercanias_util.js"));
include(Resources.id("jsblock:scripts/pids_cercanias_render_abajo.js"));
include(Resources.id("jsblock:scripts/pids_util.js"));

PIDSCustomUtil.lang = "eu";

function create(ctx, state, pids) {
    print("Hello World ^^");
}

function render(ctx, state, pids) {
    cercaniasRenderAbajo(ctx, state, pids);
}

function dispose(ctx, state, pids) {
    print("Goodbye World ^^;");
}
