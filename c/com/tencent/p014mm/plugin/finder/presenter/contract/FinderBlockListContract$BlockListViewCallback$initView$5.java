package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import tr1.C78080i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback$initView$5", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$5 */
public final class FinderBlockListContract$BlockListViewCallback$initView$5 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15925a;

    public FinderBlockListContract$BlockListViewCallback$initView$5(FinderBlockListContract.BlockListViewCallback blockListViewCallback) {
        this.f15925a = blockListViewCallback;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        this.f15925a.f15899d.mo3714e();
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        this.f15925a.f15899d.mo3714e();
        RecyclerView recyclerView = this.f15925a.f15902g;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(new C78080i());
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15925a.f15903h;
        if (refreshLoadMoreLayout != null) {
            RefreshLoadMoreLayout.m66898r(refreshLoadMoreLayout, (C32224a) null, 1, (Object) null);
            FinderBlockListContract.BlockListViewCallback blockListViewCallback = this.f15925a;
            RecyclerView recyclerView = blockListViewCallback.f15902g;
            if (recyclerView != null) {
                recyclerView.postDelayed(new C3382x8837bc6e(blockListViewCallback), 1000);
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else {
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }
}
