package kf1;

import com.tencent.p014mm.autogen.events.ActivityFeedRemoveEvent;
import com.tencent.p014mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import on1.C11514d;
import rx3.C13598b0;

/* renamed from: kf1.t */
public final class C9979t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ActivityFeedRemoveEvent f30662d;

    /* renamed from: e */
    public final /* synthetic */ FinderCampaignFeedUIContract$TopicFeedPresenter f30663e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9979t(ActivityFeedRemoveEvent activityFeedRemoveEvent, FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter) {
        super(0);
        this.f30662d = activityFeedRemoveEvent;
        this.f30663e = finderCampaignFeedUIContract$TopicFeedPresenter;
    }

    public Object invoke() {
        ActivityFeedRemoveEvent.C0993a aVar = this.f30662d.f9022d;
        long j = aVar.f9023a;
        if (j != 0) {
            this.f30663e.f30443e.mo11504f3(j, false);
        } else {
            this.f30663e.f30443e.mo11503e3(new C11514d(0, 0, aVar.f9024b, 3, (C8480h) null), false);
        }
        return C13598b0.f38549a;
    }
}
