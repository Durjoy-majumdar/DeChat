package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.l8 */
public final class C9844l8 extends C87413o implements C32226l<Void, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9745g8 f30419d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9844l8(C9745g8 g8Var) {
        super(1);
        this.f30419d = g8Var;
    }

    public Object invoke(Object obj) {
        Void voidR = (Void) obj;
        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f30419d.f30199f;
        C58784w3 w3Var = C58784w3.f168295a;
        long currentTimeMillis = System.currentTimeMillis();
        w3Var.getClass();
        long j = currentTimeMillis / ((long) 1000);
        C9831k8 k8Var = new C9831k8(this.f30419d);
        finderProfileTimelineContract$ProfileTimelinePresenter.getClass();
        finderProfileTimelineContract$ProfileTimelinePresenter.mo2583x().setInitDone(k8Var);
        BaseFeedLoader.requestInit$default(finderProfileTimelineContract$ProfileTimelinePresenter.mo2583x(), false, 1, (Object) null);
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30419d.f30200g;
        if (refreshLoadMoreLayout != null) {
            RefreshLoadMoreLayout.m66897N(refreshLoadMoreLayout, 0, false, 3, (Object) null);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }
}
