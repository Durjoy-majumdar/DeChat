package com.tencent.p014mm.plugin.finder.feed;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kf1.C9753h;
import kf1.C9965rb;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.g0 */
public final class C2645g0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13497d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2645g0(FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter) {
        super(0);
        this.f13497d = finderTopicFeedUIContract$TopicFeedPresenter;
    }

    public Object invoke() {
        int size = this.f13497d.f30175e.getDataListJustForAdapter().size();
        C9753h hVar = this.f13497d.f30176f;
        int c6 = hVar != null ? hVar.mo10346D().mo85796c6() : 0;
        this.f13497d.f30175e.getDataListJustForAdapter().clear();
        C9753h hVar2 = this.f13497d.f30176f;
        if (hVar2 != null) {
            hVar2.mo10346D().notifyItemRangeRemoved(c6, size);
        }
        C9753h hVar3 = this.f13497d.f30176f;
        C87412m.m108592e(hVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
        ((C9965rb) hVar3).mo10468f1(true);
        this.f13497d.requestRefresh();
        return C13598b0.f38549a;
    }
}
