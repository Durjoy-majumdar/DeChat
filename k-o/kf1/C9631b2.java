package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import dp1.C20480e0;
import dp1.C58391n;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: kf1.b2 */
public final class C9631b2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10037x1 f29952d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9631b2(C10037x1 x1Var) {
        super(0);
        this.f29952d = x1Var;
    }

    public Object invoke() {
        C9707f fVar;
        RefreshLoadMoreLayout D;
        C10037x1 x1Var = this.f29952d;
        if (x1Var.f30763E && x1Var.f30775z && (fVar = x1Var.f29964g) != null && (D = fVar.mo10308D()) != null) {
            D.mo82442H(0);
        }
        C58391n.f167292a.mo83229e(this.f29952d.f29961d.hashCode());
        C10037x1 x1Var2 = this.f29952d;
        if (x1Var2.f30775z) {
            BaseFeedLoader<C0740i2> baseFeedLoader = x1Var2.f13124s;
            C87412m.m108592e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader");
            C10037x1 x1Var3 = this.f29952d;
            ((FinderFeedShareRelativeListLoader) baseFeedLoader).f13561d = x1Var3.f30772w;
            BaseFeedLoader<C0740i2> baseFeedLoader2 = x1Var3.f13124s;
            if (baseFeedLoader2 != null) {
                baseFeedLoader2.requestRefresh();
            }
        } else {
            C20480e0.m22094n(C20480e0.f57583a, x1Var2.f29967j, false, (C49712hj1) null, false, 0, false, 60, (Object) null);
            C9707f fVar2 = this.f29952d.f29964g;
            RefreshLoadMoreLayout D2 = fVar2 != null ? fVar2.mo10308D() : null;
            if (D2 != null) {
                D2.setEnableLoadMore(false);
            }
        }
        return C13598b0.f38549a;
    }
}
