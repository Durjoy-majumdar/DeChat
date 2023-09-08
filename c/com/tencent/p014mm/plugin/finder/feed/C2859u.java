package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import fy3.C32224a;
import gy3.C87413o;
import rs1.C63586o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.u */
public final class C2859u extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelinePresenter f14187d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2859u(FinderTimelinePresenter finderTimelinePresenter) {
        super(0);
        this.f14187d = finderTimelinePresenter;
    }

    public Object invoke() {
        FinderHomeTabFragment finderHomeTabFragment = this.f14187d.f13267h;
        if (finderHomeTabFragment != null) {
            ((C63586o) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class)).mo88437f3();
        }
        return C13598b0.f38549a;
    }
}
