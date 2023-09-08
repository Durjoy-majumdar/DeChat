package androidx.camera.core.impl;

public final /* synthetic */ class DeferrableSurface$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DeferrableSurface f44338d;

    /* renamed from: e */
    public final /* synthetic */ String f44339e;

    public /* synthetic */ DeferrableSurface$$b(DeferrableSurface deferrableSurface, String str) {
        this.f44338d = deferrableSurface;
        this.f44339e = str;
    }

    public final void run() {
        this.f44338d.lambda$new$1(this.f44339e);
    }
}
