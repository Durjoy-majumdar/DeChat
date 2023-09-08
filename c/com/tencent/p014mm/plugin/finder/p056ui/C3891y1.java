package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderFavDrawer;
import gy3.C87412m;
import kf1.C9713f2;

/* renamed from: com.tencent.mm.plugin.finder.ui.y1 */
public final class C3891y1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgFeedDetailUI f17470d;

    public C3891y1(FinderMsgFeedDetailUI finderMsgFeedDetailUI) {
        this.f17470d = finderMsgFeedDetailUI;
    }

    public final void run() {
        FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f17470d;
        BaseFinderFeed baseFinderFeed = finderMsgFeedDetailUI.f16998y;
        if (baseFinderFeed != null) {
            C9713f2 f2Var = finderMsgFeedDetailUI.f16991r;
            if (f2Var != null) {
                FinderFavDrawer finderFavDrawer = f2Var.f30127i;
                if (finderFavDrawer != null) {
                    FinderItem o = baseFinderFeed.mo3513o();
                    C87412m.m108594g(o, "feedObj");
                    if (!finderFavDrawer.mo82541i()) {
                        finderFavDrawer.f162099B = o;
                        finderFavDrawer.mo82542j(true, true, 0);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("favDrawer");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
