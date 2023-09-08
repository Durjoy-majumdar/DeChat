package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import sx3.C110818d0;
import tr1.C78080i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback$initRefreshLayout$2$1", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initRefreshLayout$2$1 */
public final class FinderNotifyContract$NotifyViewCallback$initRefreshLayout$2$1 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ RefreshLoadMoreLayout f160495a;

    /* renamed from: b */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160496b;

    public FinderNotifyContract$NotifyViewCallback$initRefreshLayout$2$1(RefreshLoadMoreLayout refreshLoadMoreLayout, FinderNotifyContract.NotifyViewCallback notifyViewCallback) {
        this.f160495a = refreshLoadMoreLayout;
        this.f160496b = notifyViewCallback;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f160496b;
        FinderNotifyContract.NotifyPresenter notifyPresenter = notifyViewCallback.f160455g;
        notifyPresenter.mo78486q(((C55011a) C110818d0.m150923U(notifyPresenter.mo78485n(notifyViewCallback.f160452d))).f154465d.field_id, 20, this.f160496b.f160452d, true, false);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        this.f160495a.getRecyclerView().setItemAnimator(new C78080i());
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        RefreshLoadMoreLayout.m66898r(this.f160495a, (C32224a) null, 1, (Object) null);
        this.f160495a.getRecyclerView().postDelayed(new C56193x76571d0e(this.f160495a), 1000);
    }
}
