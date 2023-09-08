package xj0;

import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.sdk.platformtools.Log;
import vj0.C90807f;
import xj0.C91237o;
import yj0.C91465c;

/* renamed from: xj0.v */
public class C91252v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91216b0 f261838d;

    /* renamed from: e */
    public final /* synthetic */ C91237o f261839e;

    public C91252v(C91237o oVar, C91216b0 b0Var) {
        this.f261839e = oVar;
        this.f261838d = b0Var;
    }

    public void run() {
        if (!C91237o.m114471a(this.f261839e)) {
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: resume failed: not started");
            this.f261838d.mo123718a(2, 301, "not start yet!", null);
            return;
        }
        C91237o oVar = this.f261839e;
        C91237o.C91243f fVar = oVar.f261809d;
        C91237o.C91243f fVar2 = C91237o.C91243f.Running;
        if (fVar == fVar2) {
            Log.m105928w("MicroMsg.GameRecorderMgr", "hy: resume failed: already running!");
            this.f261838d.mo123718a(2, 302, "already running!", null);
            return;
        }
        oVar.f261809d = fVar2;
        C91220f fVar3 = (C91220f) oVar.f261807b;
        if (fVar3.f261768c == null) {
            this.f261838d.mo123718a(0, 0, "ok", null);
            return;
        }
        MagicBrushView magicBrushView = fVar3.f261763b.get();
        if (magicBrushView == null) {
            this.f261838d.mo123718a(0, 0, "ok", null);
            return;
        }
        C90807f fVar4 = (C90807f) magicBrushView.getRendererView();
        if (fVar4 == null) {
            this.f261838d.mo123718a(0, 0, "ok", null);
            return;
        }
        if (!fVar4.isAvailable()) {
            this.f261838d.mo123718a(0, 0, "ok", null);
        }
        fVar3.f261768c.mo159620q(0, fVar4.getSurfaceWidth(), fVar4.getSurfaceHeight());
        this.f261838d.mo123718a(0, 0, "ok", null);
        C91465c cVar = fVar3.f261771f;
        if (cVar != null) {
            cVar.mo125405d();
        }
    }
}
