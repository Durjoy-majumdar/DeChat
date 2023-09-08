package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.autogen.events.FinderTimelineRefreshEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import kf1.C9878n9;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.t */
public final class C2858t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelineRefreshEvent f14185d;

    /* renamed from: e */
    public final /* synthetic */ FinderTimelinePresenter f14186e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2858t(FinderTimelineRefreshEvent finderTimelineRefreshEvent, FinderTimelinePresenter finderTimelinePresenter) {
        super(0);
        this.f14185d = finderTimelineRefreshEvent;
        this.f14186e = finderTimelinePresenter;
    }

    public Object invoke() {
        int i = this.f14185d.f9256d.f9257a;
        FinderTimelinePresenter finderTimelinePresenter = this.f14186e;
        if (i == finderTimelinePresenter.f13272p) {
            String str = finderTimelinePresenter.f13249I;
            Log.m105924i(str, "autoRefreshEventListener: trigger refresh tabType = " + this.f14186e.f13272p);
            C9878n9 n9Var = this.f14186e.f13269j;
            if (n9Var != null) {
                C9878n9.C9879a.m9643a(n9Var, 150, false, false, 4, (Object) null);
            }
        }
        return C13598b0.f38549a;
    }
}
