package com.tencent.p014mm.plugin.finder.feed.model;

import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hr1.C8730k;
import kf1.C9860m9;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.l */
public final class C2805l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderHomeTabFragment f14033d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2805l(FinderHomeTabFragment finderHomeTabFragment) {
        super(0);
        this.f14033d = finderHomeTabFragment;
    }

    public Object invoke() {
        C8730k kVar;
        FinderTimelineUIC finderTimelineUIC = (FinderTimelineUIC) C39818r.f106831a.mo62445d(this.f14033d).mo62449e(FinderTimelineUIC.class);
        if (finderTimelineUIC != null) {
            C9860m9 m9Var = finderTimelineUIC.f18785d;
            if (m9Var != null) {
                FinderVideoCore p1 = ((FinderTimelinePresenter) m9Var).mo2578p1();
                if (!(p1 == null || (kVar = p1.f161828n) == null)) {
                    kVar.mo9563s1("GetCommentDetail");
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
