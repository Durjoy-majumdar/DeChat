package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FinderTopicEvent;
import com.tencent.p014mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import on1.C11507a;
import on1.C11520f0;
import on1.C11575y;
import rx3.C13598b0;
import sd1.C13653b;
import te3.C51270sn1;

/* renamed from: kf1.u */
public final class C9992u extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11520f0<C0740i2> f30680d;

    /* renamed from: e */
    public final /* synthetic */ FinderCampaignFeedUIContract$TopicFeedPresenter f30681e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9992u(C11520f0<C0740i2> f0Var, FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter) {
        super(0);
        this.f30680d = f0Var;
        this.f30681e = finderCampaignFeedUIContract$TopicFeedPresenter;
    }

    public Object invoke() {
        C11575y<T> yVar = ((C11520f0.C11523c) this.f30680d).f33841a;
        C13653b bVar = yVar instanceof C13653b ? (C13653b) yVar : null;
        if (bVar != null) {
            C9897o<T> oVar = this.f30681e.f30444f;
            C87412m.m108592e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract.TopicFeedViewCallback");
            C10048y yVar2 = (C10048y) oVar;
            C51270sn1 sn12 = bVar.f38682k;
            int i = bVar.f33809g;
            String str = bVar.f33810h;
            long j = yVar2.f30790q;
            if (j == 0) {
                if (sn12 != null) {
                    j = sn12.f141618e;
                }
                yVar2.f30790q = j;
            }
            if (yVar2.f30787n == 7 && yVar2.f30791r <= 2) {
                if (yVar2.mo10435Z() instanceof FinderCampaignFeedUIContract$TopicFeedPresenter) {
                    ((FinderCampaignFeedUIContract$TopicFeedPresenter) yVar2.mo10435Z()).f13018j.f30538a = sn12;
                }
                FinderTopicEvent finderTopicEvent = new FinderTopicEvent();
                FinderTopicEvent.C1067a aVar = finderTopicEvent.f9258d;
                aVar.f9259a = yVar2.f30787n;
                aVar.f9260b = i;
                aVar.f9261c = str;
                finderTopicEvent.publish();
            }
        }
        FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter = this.f30681e;
        C11575y<T> yVar3 = ((C11520f0.C11523c) this.f30680d).f33841a;
        C87412m.m108592e(yVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.CgiLoaderData<com.tencent.mm.plugin.finder.model.RVFeed>");
        FinderCampaignFeedUIContract$TopicFeedPresenter.m2387e(finderCampaignFeedUIContract$TopicFeedPresenter, (C11507a) yVar3);
        return C13598b0.f38549a;
    }
}
