package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.z */
public final class C3114z extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderHomeTabFragment f14980d;

    /* renamed from: e */
    public final /* synthetic */ FinderTimelinePresenter f14981e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3114z(FinderHomeTabFragment finderHomeTabFragment, FinderTimelinePresenter finderTimelinePresenter) {
        super(0);
        this.f14980d = finderHomeTabFragment;
        this.f14981e = finderTimelinePresenter;
    }

    public Object invoke() {
        ((FinderTimelineUIC) C39818r.f106831a.mo62445d(this.f14980d).mo75002a(FinderTimelineUIC.class)).mo5171c3(this.f14981e.f13266g.getIntent());
        return C13598b0.f38549a;
    }
}
