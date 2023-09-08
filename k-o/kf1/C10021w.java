package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import on1.C11520f0;
import rx3.C13598b0;

/* renamed from: kf1.w */
public final class C10021w extends C87413o implements C32226l<C11520f0<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCampaignFeedUIContract$TopicFeedPresenter f30722d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10021w(FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter) {
        super(1);
        this.f30722d = finderCampaignFeedUIContract$TopicFeedPresenter;
    }

    public Object invoke(Object obj) {
        C11520f0 f0Var = (C11520f0) obj;
        C87412m.m108594g(f0Var, "state");
        if (f0Var instanceof C11520f0.C11523c) {
            C61926c.m72668M(new C9992u(f0Var, this.f30722d));
        } else if (f0Var instanceof C11520f0.C11522b) {
            C61926c.m72668M(new C10007v(this.f30722d, f0Var));
        }
        return C13598b0.f38549a;
    }
}
