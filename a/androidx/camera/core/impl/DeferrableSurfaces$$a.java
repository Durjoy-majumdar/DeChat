package androidx.camera.core.impl;

import p1167z8.C112608f;
import p202m2.C117512b;

public final /* synthetic */ class DeferrableSurfaces$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112608f f44340d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44341e;

    /* renamed from: f */
    public final /* synthetic */ long f44342f;

    public /* synthetic */ DeferrableSurfaces$$a(C112608f fVar, C117512b.C117513a aVar, long j) {
        this.f44340d = fVar;
        this.f44341e = aVar;
        this.f44342f = j;
    }

    public final void run() {
        DeferrableSurfaces.lambda$surfaceListWithTimeout$0(this.f44340d, this.f44341e, this.f44342f);
    }
}
