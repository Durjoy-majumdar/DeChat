package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.autogen.events.FinderTimelineRefreshEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kf1.C9753h;
import kf1.C9916p2;
import kf1.C9934q2;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.j */
public final class C2650j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelineRefreshEvent f13504d;

    /* renamed from: e */
    public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13505e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2650j(FinderTimelineRefreshEvent finderTimelineRefreshEvent, FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter) {
        super(0);
        this.f13504d = finderTimelineRefreshEvent;
        this.f13505e = finderFollowFeedUIContract$Presenter;
    }

    public Object invoke() {
        if (this.f13504d.f9256d.f9257a == this.f13505e.f13046i) {
            Log.m105924i("FinderFollowFeedUIContract.Presenter", "autoRefreshEventListener: trigger refresh tabType = " + this.f13505e.f13046i);
            C9753h hVar = this.f13505e.f30176f;
            C9916p2 p2Var = hVar instanceof C9916p2 ? (C9916p2) hVar : null;
            if (p2Var != null) {
                p2Var.f30220j.postDelayed(new C9934q2(p2Var, false), 150);
            }
        }
        return C13598b0.f38549a;
    }
}
