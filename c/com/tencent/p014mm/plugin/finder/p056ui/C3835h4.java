package com.tencent.p014mm.plugin.finder.p056ui;

import gy3.C87412m;
import kf1.C9662c2;
import tr1.C78077h;

/* renamed from: com.tencent.mm.plugin.finder.ui.h4 */
public final class C3835h4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17372d;

    public C3835h4(FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f17372d = finderShareFeedRelUI;
    }

    public final void run() {
        C9662c2 c2Var = this.f17372d.f17168u;
        if (c2Var != null) {
            c2Var.getRecyclerView().setItemAnimator(new C78077h());
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
