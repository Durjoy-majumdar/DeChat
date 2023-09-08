package p172io.flutter.embedding.android;

import p172io.flutter.embedding.engine.renderer.RenderSurface;

/* renamed from: io.flutter.embedding.android.SwapSurfaceController$$c */
public final /* synthetic */ class SwapSurfaceController$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SwapSurfaceController f351090d;

    /* renamed from: e */
    public final /* synthetic */ RenderSurface f351091e;

    public /* synthetic */ SwapSurfaceController$$c(SwapSurfaceController swapSurfaceController, RenderSurface renderSurface) {
        this.f351090d = swapSurfaceController;
        this.f351091e = renderSurface;
    }

    public final void run() {
        this.f351090d.lambda$resumeSurface$3(this.f351091e);
    }
}
