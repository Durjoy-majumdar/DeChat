package com.tencent.p014mm.plugin.finder.feed;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.k */
public final class C2652k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13508d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2652k(FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter) {
        super(0);
        this.f13508d = finderFollowFeedUIContract$Presenter;
    }

    public Object invoke() {
        this.f13508d.f30175e.requestRefresh();
        return C13598b0.f38549a;
    }
}
