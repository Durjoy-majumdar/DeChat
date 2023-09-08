package sz0;

import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: sz0.r */
public final class C48515r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48517t f129760d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f129761e;

    public C48515r(C48517t tVar, C32224a<C13598b0> aVar) {
        this.f129760d = tVar;
        this.f129761e = aVar;
    }

    public final void run() {
        C48517t tVar = this.f129760d;
        tVar.f129771z = tVar.f44854d.getHeight();
        C48517t tVar2 = this.f129760d;
        tVar2.f129764A = tVar2.f44854d.getWidth();
        this.f129761e.invoke();
    }
}
