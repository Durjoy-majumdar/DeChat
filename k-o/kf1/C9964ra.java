package kf1;

import cm1.C0740i2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.ra */
public final class C9964ra extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9941qa f30624d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9964ra(C9941qa qaVar) {
        super(0);
        this.f30624d = qaVar;
    }

    public Object invoke() {
        C9930p9<C0740i2> p9Var = this.f30624d.f30579e;
        C87412m.m108592e(p9Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTimelineLbsPresenter");
        ((C9720fa) p9Var).f30152i.requestRefresh();
        return C13598b0.f38549a;
    }
}
