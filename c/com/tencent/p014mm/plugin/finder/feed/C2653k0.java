package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.autogen.events.ActivityFeedRemoveEvent;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.k0 */
public final class C2653k0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ActivityFeedRemoveEvent f13509d;

    /* renamed from: e */
    public final /* synthetic */ FinderTopicFeedUIContract$TopicFeedPresenter f13510e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2653k0(ActivityFeedRemoveEvent activityFeedRemoveEvent, FinderTopicFeedUIContract$TopicFeedPresenter finderTopicFeedUIContract$TopicFeedPresenter) {
        super(0);
        this.f13509d = activityFeedRemoveEvent;
        this.f13510e = finderTopicFeedUIContract$TopicFeedPresenter;
    }

    public Object invoke() {
        ActivityFeedRemoveEvent.C0993a aVar = this.f13509d.f9022d;
        long j = aVar.f9023a;
        if (j != 0) {
            BaseFinderFeedLoader baseFinderFeedLoader = this.f13510e.f30175e;
            if (baseFinderFeedLoader != null) {
                baseFinderFeedLoader.remove(j, true);
            }
        } else {
            BaseFinderFeedLoader baseFinderFeedLoader2 = this.f13510e.f30175e;
            if (baseFinderFeedLoader2 != null) {
                baseFinderFeedLoader2.removeByLocalId(aVar.f9024b, true);
            }
        }
        return C13598b0.f38549a;
    }
}
