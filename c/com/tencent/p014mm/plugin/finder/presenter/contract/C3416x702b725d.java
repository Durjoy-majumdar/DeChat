package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import tf0.C64916p1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback$initView$2", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$2 */
public final class C3416x702b725d extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderLivePurchaseListContract.PurchaseListViewCallback f16081a;

    public C3416x702b725d(FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback) {
        this.f16081a = purchaseListViewCallback;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        BaseFeedLoader.requestLoadMore$default(this.f16081a.f16069b.f16064d, false, 1, (Object) null);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f16081a.mo3757a(false);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        this.f16081a.f16069b.f16064d.requestRefresh();
        this.f16081a.f16072e.setItemAnimator(((C64916p1) C86312j.m106911c(C64916p1.class)).Xd0());
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16081a.f16071d;
        C87412m.m108593f(refreshLoadMoreLayout, "rfLayout");
        RefreshLoadMoreLayout.m66898r(refreshLoadMoreLayout, (C32224a) null, 1, (Object) null);
        FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = this.f16081a;
        purchaseListViewCallback.f16072e.postDelayed(new C3417xcf2b3533(purchaseListViewCallback), 1000);
        this.f16081a.mo3757a(false);
    }
}
