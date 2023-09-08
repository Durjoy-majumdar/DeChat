package xj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import m90.C88716b;
import xj0.C91237o;
import yj0.C91465c;

/* renamed from: xj0.w */
public class C91253w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91216b0 f261840d;

    /* renamed from: e */
    public final /* synthetic */ C91237o f261841e;

    /* renamed from: xj0.w$a */
    public class C91254a implements C91216b0<String> {
        public C91254a() {
        }

        /* renamed from: b */
        public void mo123718a(int i, int i2, String str, String str2) {
            if (C91253w.this.f261841e.f261807b.f261763b.get() == null) {
                Log.m105928w("MicroMsg.GameRecorderMgr", "hy: stop failed: view lost");
                C91253w.this.f261840d.mo123718a(1, -2, "view lost", null);
            } else if (i == 0 && i2 == 0) {
                C91237o oVar = C91253w.this.f261841e;
                C91237o.C91244g gVar = new C91237o.C91244g(oVar);
                gVar.f261827a = oVar.f261810e;
                gVar.f261828b = oVar.f261811f;
                oVar.f261807b.getClass();
                oVar.f261809d = C91237o.C91243f.Inited;
                oVar.f261810e = null;
                C91220f fVar = (C91220f) oVar.f261807b;
                synchronized (fVar) {
                    fVar.f261769d = null;
                }
                C91253w.this.f261840d.mo123718a(0, 0, "ok", gVar);
            } else {
                C91253w.this.f261840d.mo123718a(i, i2, str, null);
            }
        }
    }

    public C91253w(C91237o oVar, C91216b0 b0Var) {
        this.f261841e = oVar;
        this.f261840d = b0Var;
    }

    public void run() {
        if (!C91237o.m114471a(this.f261841e)) {
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: stop failed: not started");
            this.f261840d.mo123718a(0, 501, "not start yet!", null);
            return;
        }
        C91215b bVar = this.f261841e.f261807b;
        C91254a aVar = new C91254a();
        C91220f fVar = (C91220f) bVar;
        C88716b bVar2 = fVar.f261768c;
        if (bVar2 == null) {
            aVar.mo123718a(1, -1, "no recorder", "");
            return;
        }
        bVar2.mo159616n(new C91219e(fVar, aVar));
        C91465c cVar = fVar.f261771f;
        if (cVar != null) {
            cVar.mo125406e();
        }
    }
}
