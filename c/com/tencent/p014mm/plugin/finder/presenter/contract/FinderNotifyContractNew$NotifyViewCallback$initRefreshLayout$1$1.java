package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContractNew;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import on1.C11548q;
import tr1.C78080i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback$initRefreshLayout$1$1", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$initRefreshLayout$1$1 */
public final class FinderNotifyContractNew$NotifyViewCallback$initRefreshLayout$1$1 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ RefreshLoadMoreLayout f160566a;

    /* renamed from: b */
    public final /* synthetic */ FinderNotifyContractNew.NotifyViewCallback f160567b;

    public FinderNotifyContractNew$NotifyViewCallback$initRefreshLayout$1$1(RefreshLoadMoreLayout refreshLoadMoreLayout, FinderNotifyContractNew.NotifyViewCallback notifyViewCallback) {
        this.f160566a = refreshLoadMoreLayout;
        this.f160567b = notifyViewCallback;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f160567b.f160543e;
        C11548q<C55011a> qVar = notifyPresenter.f160536r;
        if (qVar != null) {
            qVar.mo11508k3(new FinderNotifyContractNew$NotifyPresenter$loadMore$1(notifyPresenter));
        } else {
            C87412m.m108603p("loader");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        this.f160566a.getRecyclerView().setItemAnimator(new C78080i());
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        RefreshLoadMoreLayout.m66898r(this.f160566a, (C32224a) null, 1, (Object) null);
        this.f160566a.getRecyclerView().postDelayed(new C56200x3047100d(this.f160566a), 1000);
    }
}
