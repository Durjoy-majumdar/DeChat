package androidx.camera.core.impl;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p202m2.C117512b;

public final /* synthetic */ class DeferrableSurfaces$$d implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ List f44348a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorService f44349b;

    /* renamed from: c */
    public final /* synthetic */ Executor f44350c;

    /* renamed from: d */
    public final /* synthetic */ long f44351d;

    /* renamed from: e */
    public final /* synthetic */ boolean f44352e;

    public /* synthetic */ DeferrableSurfaces$$d(List list, ScheduledExecutorService scheduledExecutorService, Executor executor, long j, boolean z) {
        this.f44348a = list;
        this.f44349b = scheduledExecutorService;
        this.f44350c = executor;
        this.f44351d = j;
        this.f44352e = z;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return DeferrableSurfaces.lambda$surfaceListWithTimeout$3(this.f44348a, this.f44349b, this.f44350c, this.f44351d, this.f44352e, aVar);
    }
}
