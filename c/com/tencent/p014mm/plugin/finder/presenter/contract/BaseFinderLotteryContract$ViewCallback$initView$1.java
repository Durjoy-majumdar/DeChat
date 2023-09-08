package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.BaseFinderLotteryContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import tf0.C64916p1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/BaseFinderLotteryContract$ViewCallback$initView$1", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.BaseFinderLotteryContract$ViewCallback$initView$1 */
public final class BaseFinderLotteryContract$ViewCallback$initView$1 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ BaseFinderLotteryContract.ViewCallback f15889a;

    /* renamed from: b */
    public final /* synthetic */ RecyclerView f15890b;

    public BaseFinderLotteryContract$ViewCallback$initView$1(BaseFinderLotteryContract.ViewCallback viewCallback, RecyclerView recyclerView) {
        this.f15889a = viewCallback;
        this.f15890b = recyclerView;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        BaseFeedLoader.requestLoadMore$default(this.f15889a.f15886e.f15880d, false, 1, (Object) null);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        this.f15889a.f15886e.f15880d.requestRefresh();
        this.f15890b.setItemAnimator(((C64916p1) C86312j.m106911c(C64916p1.class)).Xd0());
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        RefreshLoadMoreLayout.m66898r(this.f15889a.mo3712p(), (C32224a) null, 1, (Object) null);
        RecyclerView recyclerView = this.f15890b;
        recyclerView.postDelayed(new BaseFinderLotteryContract$ViewCallback$initView$1$onRefreshEnd$1(recyclerView), 1000);
        this.f15889a.mo3711C0(false);
    }
}
