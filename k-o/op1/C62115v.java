package op1;

import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: op1.v */
public final class C62115v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62084h f176629d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62115v(C62084h hVar) {
        super(0);
        this.f176629d = hVar;
    }

    public Object invoke() {
        this.f176629d.notifyDataSetChanged();
        C61926c.m72666K(1000, new C62114u(this.f176629d));
        return C13598b0.f38549a;
    }
}
