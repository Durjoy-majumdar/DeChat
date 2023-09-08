package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import kotlin.Metadata;
import zp3.C16389w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback$proxyRLayout$1", "Lzp3/w;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$proxyRLayout$1 */
public final class C3419xed6b735 implements C16389w {

    /* renamed from: d */
    public final /* synthetic */ FinderLivePurchaseListContract.PurchaseListViewCallback f16084d;

    public C3419xed6b735(FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback) {
        this.f16084d = purchaseListViewCallback;
    }

    public void onChanged() {
        this.f16084d.f16071d.onChanged();
    }

    public void onItemRangeChanged(int i, int i2) {
        FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = this.f16084d;
        purchaseListViewCallback.f16071d.onItemRangeChanged(i + purchaseListViewCallback.f16069b.mo3754e().mo85796c6(), i2);
    }

    public void onItemRangeInserted(int i, int i2) {
        FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = this.f16084d;
        purchaseListViewCallback.f16071d.onItemRangeInserted(i + purchaseListViewCallback.f16069b.mo3754e().mo85796c6(), i2);
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = this.f16084d;
        purchaseListViewCallback.f16071d.onItemRangeMoved(i + purchaseListViewCallback.f16069b.mo3754e().mo85796c6(), i2 + this.f16084d.f16069b.mo3754e().mo85796c6(), i3);
    }

    public void onItemRangeRemoved(int i, int i2) {
        FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = this.f16084d;
        purchaseListViewCallback.f16071d.onItemRangeRemoved(i + purchaseListViewCallback.f16069b.mo3754e().mo85796c6(), i2);
    }

    public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16084d.f16071d;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.mo82441G(cVar);
    }

    public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f16084d.f16071d.onPreFinishLoadMoreSmooth(cVar);
    }

    public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f16084d.f16071d.onPreFinishRefresh(cVar);
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        FinderLivePurchaseListContract.PurchaseListViewCallback purchaseListViewCallback = this.f16084d;
        purchaseListViewCallback.f16071d.onItemRangeChanged(i + purchaseListViewCallback.f16069b.mo3754e().mo85796c6(), i2, obj);
    }
}
