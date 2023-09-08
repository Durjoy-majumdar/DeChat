package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import kf1.C9878n9;

/* renamed from: com.tencent.mm.plugin.finder.feed.b0 */
public final class C2634b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelinePresenter f13473d;

    /* renamed from: e */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13474e;

    public C2634b0(FinderTimelinePresenter finderTimelinePresenter, RefreshLoadMoreLayout.C7080c<Object> cVar) {
        this.f13473d = finderTimelinePresenter;
        this.f13474e = cVar;
    }

    public final void run() {
        RefreshLoadMoreLayout c;
        C9878n9 n9Var = this.f13473d.f13269j;
        if (!(n9Var == null || (c = n9Var.mo10416c()) == null)) {
            RefreshLoadMoreLayout.m66898r(c, (C32224a) null, 1, (Object) null);
        }
        this.f13473d.onRefreshEnd(this.f13474e);
    }
}
