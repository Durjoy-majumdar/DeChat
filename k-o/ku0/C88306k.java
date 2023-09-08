package ku0;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C83183s;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ku0.k */
public final class C88306k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88288a f255258d;

    /* renamed from: e */
    public final /* synthetic */ int f255259e;

    public C88306k(C88288a aVar, int i) {
        this.f255258d = aVar;
        this.f255259e = i;
    }

    public final void run() {
        if (this.f255258d.f255224y.compareAndSet(this.f255259e, 0)) {
            Log.m105924i(this.f255258d.f255208f, "stopCustomVideoCaptureIfNeed, release the existBuffer");
            C83183s C = this.f255258d.mo122665C();
            if (C != null) {
                C.mo115415j1(this.f255259e);
            }
        }
    }
}
