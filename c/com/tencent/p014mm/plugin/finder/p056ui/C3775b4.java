package com.tencent.p014mm.plugin.finder.p056ui;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.b4 */
public final class C3775b4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17248d;

    public C3775b4(FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f17248d = finderShareFeedRelUI;
    }

    public final void run() {
        ShareRelPresenter shareRelPresenter = this.f17248d.f17167t;
        if (shareRelPresenter != null) {
            shareRelPresenter.mo10495y1();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
