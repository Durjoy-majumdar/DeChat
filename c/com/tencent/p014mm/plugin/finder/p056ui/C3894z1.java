package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import gy3.C87412m;
import jq3.C60905o;
import kf1.C9713f2;
import pe3.C89349b;

/* renamed from: com.tencent.mm.plugin.finder.ui.z1 */
public final class C3894z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgFeedDetailUI f17474d;

    public C3894z1(FinderMsgFeedDetailUI finderMsgFeedDetailUI) {
        this.f17474d = finderMsgFeedDetailUI;
    }

    public final void run() {
        FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f17474d;
        BaseFinderFeed baseFinderFeed = finderMsgFeedDetailUI.f16998y;
        if (baseFinderFeed != null) {
            C9713f2 f2Var = finderMsgFeedDetailUI.f16991r;
            if (f2Var != null) {
                FinderLikeDrawer y = f2Var.mo10314y();
                FinderItem o = baseFinderFeed.mo3513o();
                FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
                y.mo4616m((C60905o) null, o, (C89349b) null, 0);
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
