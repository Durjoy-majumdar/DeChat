package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import di3.C86312j;
import dp1.C58413v0;
import gy3.C87412m;
import ht1.C60152b4;
import ht1.C60165e4;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C64586nn1;
import ve1.C14472b8;
import ve1.C14486c8;

/* renamed from: com.tencent.mm.plugin.finder.feed.y */
public final class C3113y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f14977d;

    /* renamed from: e */
    public final /* synthetic */ int f14978e;

    /* renamed from: f */
    public final /* synthetic */ FinderTimelinePresenter f14979f;

    public C3113y(RecyclerView recyclerView, int i, FinderTimelinePresenter finderTimelinePresenter) {
        this.f14977d = recyclerView;
        this.f14978e = i;
        this.f14979f = finderTimelinePresenter;
    }

    public final void run() {
        FinderRedDotManager finderRedDotManager;
        RecyclerView recyclerView = this.f14977d;
        if (recyclerView != null) {
            int i = this.f14978e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$3$1$call$1$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$3$1$call$1$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        C14486c8 c8Var = C14486c8.f40161a;
        FinderTimelinePresenter finderTimelinePresenter = this.f14979f;
        MMActivity mMActivity = finderTimelinePresenter.f13266g;
        int i2 = finderTimelinePresenter.f13272p;
        C87412m.m108594g(mMActivity, "context");
        String str = i2 != 1 ? i2 != 3 ? i2 != 4 ? "" : "finder_tl_hot_tab" : "TLFollow" : "TLRecommendTab";
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62443b(mMActivity).mo75002a(C13442s8.class)).mo12861q3();
        String str2 = q3.f134671e;
        if (str2 == null) {
            str2 = "";
        }
        C55718s0 G5 = Nx0.mo77227G5(str);
        C64586nn1 R5 = Nx0.mo77246R5(str);
        if (G5 == null || R5 == null) {
            finderRedDotManager = Nx0;
        } else {
            finderRedDotManager = Nx0;
            C58413v0.m67780h(C58413v0.f167346a, "2", G5, R5, 2, q3, 1, i2, (String) null, 0, 3, (String) null, 0, (C60165e4.C46105a) null, 7552, (Object) null);
        }
        FinderRedDotManager finderRedDotManager2 = finderRedDotManager;
        c8Var.mo13743a(finderRedDotManager2, str, str2);
        finderRedDotManager2.mo77239M5(str);
        c8Var.mo13743a(finderRedDotManager2, "FinderEntrance", str2);
        finderRedDotManager2.mo77239M5("FinderEntrance");
        c8Var.mo13743a(finderRedDotManager2, "Discovery", str2);
        C60152b4.C8759a.m8563c(finderRedDotManager2, "Discovery", C14472b8.f40113d, true, (String) null, 8, (Object) null);
        C14486c8.f40162b = null;
        C14486c8.f40163c = null;
        C14486c8.f40164d = -1;
        C14486c8.f40165e = -1;
    }
}
