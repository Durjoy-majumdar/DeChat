package androidx.camera.core.impl;

import p1167z8.C112608f;

public final /* synthetic */ class DeferrableSurfaces$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112608f f44347d;

    public /* synthetic */ DeferrableSurfaces$$c(C112608f fVar) {
        this.f44347d = fVar;
    }

    public final void run() {
        this.f44347d.cancel(true);
    }
}
