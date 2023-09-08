package wm1;

import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: wm1.e */
public final class C15528e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15522a f42089d;

    /* renamed from: e */
    public final /* synthetic */ C49712hj1 f42090e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15528e(C15522a aVar, C49712hj1 hj12) {
        super(0);
        this.f42089d = aVar;
        this.f42090e = hj12;
    }

    public Object invoke() {
        C15522a aVar = this.f42089d;
        if (!aVar.f42077o) {
            aVar.f42077o = true;
            C61926c.m72657B("LbsPresenter_requestLbs", true, new C15527d(aVar, this.f42090e));
        }
        return C13598b0.f38549a;
    }
}
