include(Resources.id("jsblock:scripts/pids_cercanias_util.js"));
include(Resources.id("jsblock:scripts/pids_cercanias_render_derecha.js"));
include(Resources.id("jsblock:scripts/pids_util.js"));

PIDSCustomUtil.lang = "es";

function create(ctx, state, pids) {
    print("Hello World ^^");
}

function render(ctx, state, pids) {
    cercaniasRenderDerecha(ctx, state, pids);
}

function dispose(ctx, state, pids) {
    print("Goodbye World ^^;");
}
