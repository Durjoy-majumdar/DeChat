package p172io.flutter.embedding.android;

import android.view.Choreographer;

/* renamed from: io.flutter.embedding.android.SwapSurfaceViewRenderSurface$$a */
public final /* synthetic */ class SwapSurfaceViewRenderSurface$$a implements Choreographer.FrameCallback {

    /* renamed from: d */
    public final /* synthetic */ SwapSurfaceViewRenderSurface f351093d;

    public /* synthetic */ SwapSurfaceViewRenderSurface$$a(SwapSurfaceViewRenderSurface swapSurfaceViewRenderSurface) {
        this.f351093d = swapSurfaceViewRenderSurface;
    }

    public final void doFrame(long j) {
        this.f351093d.lambda$invokeNextSurfaceUpdate$0(j);
    }
}
