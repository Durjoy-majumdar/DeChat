package p194lc;

import c30.C104289g;
import p284zb.C91635f;
import rx3.C13598b0;

/* renamed from: lc.j */
public final class C88450j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91635f f255476d;

    /* renamed from: e */
    public final /* synthetic */ int f255477e;

    public C88450j(C91635f fVar, int i) {
        this.f255476d = fVar;
        this.f255477e = i;
    }

    public final void run() {
        C91635f fVar = this.f255476d;
        C104289g gVar = new C104289g();
        gVar.mo145953n("id", this.f255477e);
        C13598b0 b0Var = C13598b0.f38549a;
        fVar.mo109652f("onSkylineWindowReady", gVar.toString(), 0);
    }
}
