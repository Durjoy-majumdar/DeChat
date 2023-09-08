package kf1;

import cm1.C0716c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.da */
public final class C9690da extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9675ca f30096d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9690da(C9675ca caVar) {
        super(0);
        this.f30096d = caVar;
    }

    public Object invoke() {
        C9930p9<C0716c> p9Var = this.f30096d.f30061e;
        C87412m.m108592e(p9Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTimelineLbsMixPresenter");
        ((C9957r9) p9Var).mo10459q().requestRefresh();
        return C13598b0.f38549a;
    }
}
