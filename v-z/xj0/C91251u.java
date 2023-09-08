package xj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import m90.C88716b;
import xj0.C91237o;
import yj0.C91465c;

/* renamed from: xj0.u */
public class C91251u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91216b0 f261836d;

    /* renamed from: e */
    public final /* synthetic */ C91237o f261837e;

    public C91251u(C91237o oVar, C91216b0 b0Var) {
        this.f261837e = oVar;
        this.f261836d = b0Var;
    }

    public void run() {
        if (!C91237o.m114471a(this.f261837e)) {
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: pause failed: not started");
            this.f261836d.mo123718a(2, 201, "not start yet!", null);
            return;
        }
        C91237o oVar = this.f261837e;
        C91237o.C91243f fVar = oVar.f261809d;
        C91237o.C91243f fVar2 = C91237o.C91243f.Paused;
        if (fVar == fVar2) {
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: pause failed: already paused!");
            this.f261836d.mo123718a(2, 202, "already paused!", null);
            return;
        }
        oVar.f261809d = fVar2;
        C91220f fVar3 = (C91220f) oVar.f261807b;
        C88716b bVar = fVar3.f261768c;
        if (bVar == null) {
            this.f261836d.mo123718a(0, 0, "ok", null);
            return;
        }
        bVar.pause();
        C91465c cVar = fVar3.f261771f;
        if (cVar != null) {
            cVar.mo125404c();
        }
        this.f261836d.mo123718a(0, 0, "ok", null);
    }
}
