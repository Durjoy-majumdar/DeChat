package xj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import m90.C88716b;
import xj0.C91237o;
import yj0.C91465c;

/* renamed from: xj0.x */
public class C91255x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91216b0 f261843d;

    /* renamed from: e */
    public final /* synthetic */ C91237o f261844e;

    public C91255x(C91237o oVar, C91216b0 b0Var) {
        this.f261844e = oVar;
        this.f261843d = b0Var;
    }

    public void run() {
        if (!C91237o.m114471a(this.f261844e)) {
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: abort failed: not started");
            this.f261843d.mo123718a(2, 401, "not start yet!", null);
            return;
        }
        C91220f fVar = (C91220f) this.f261844e.f261807b;
        C88716b bVar = fVar.f261768c;
        if (bVar != null) {
            bVar.cancel();
            fVar.f261768c.clear();
        }
        C91237o oVar = this.f261844e;
        oVar.f261807b.getClass();
        oVar.f261809d = C91237o.C91243f.Inited;
        oVar.f261810e = null;
        C91220f fVar2 = (C91220f) oVar.f261807b;
        synchronized (fVar2) {
            fVar2.f261769d = null;
        }
        if (this.f261844e.f261807b.f261763b.get() == null) {
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: abort failed: view lost");
            this.f261843d.mo123718a(0, 0, "ok", null);
        } else {
            this.f261843d.mo123718a(0, 0, "ok", null);
        }
        C91465c cVar = fVar.f261771f;
        if (cVar != null) {
            cVar.mo125406e();
        }
    }
}
