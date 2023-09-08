package androidx.camera.core.impl;

import java.util.concurrent.Executor;
import p1167z8.C112608f;
import p202m2.C117512b;

public final /* synthetic */ class DeferrableSurfaces$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Executor f44343d;

    /* renamed from: e */
    public final /* synthetic */ C112608f f44344e;

    /* renamed from: f */
    public final /* synthetic */ C117512b.C117513a f44345f;

    /* renamed from: g */
    public final /* synthetic */ long f44346g;

    public /* synthetic */ DeferrableSurfaces$$b(Executor executor, C112608f fVar, C117512b.C117513a aVar, long j) {
        this.f44343d = executor;
        this.f44344e = fVar;
        this.f44345f = aVar;
        this.f44346g = j;
    }

    public final void run() {
        this.f44343d.execute(new DeferrableSurfaces$$a(this.f44344e, this.f44345f, this.f44346g));
    }
}
