package wl0;

import com.tencent.p014mm.sdk.platformtools.Log;
import wl0.C91030h;

/* renamed from: wl0.i */
public class C91034i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91030h.C91032b f261183d;

    public C91034i(C91030h.C91032b bVar) {
        this.f261183d = bVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo HCEService timer check, timeLimit: %d, hasCommandNotResponded: %b", Integer.valueOf(C91030h.this.f261172c), Boolean.valueOf(C91030h.this.f261174e));
        C91030h hVar = C91030h.this;
        hVar.f261176g = true;
        C91030h.m114195a(hVar, C91030h.f261167l, true, hVar.f261180k);
    }
}
