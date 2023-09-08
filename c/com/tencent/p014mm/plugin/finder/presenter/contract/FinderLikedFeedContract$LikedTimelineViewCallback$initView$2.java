package com.tencent.p014mm.plugin.finder.presenter.contract;

import ak1.C0075i;
import ak1.C54067f0;
import android.view.View;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import ef1.C58556f;
import ef1.C58563g;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rs1.C13442s8;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback$initView$2 */
public final class FinderLikedFeedContract$LikedTimelineViewCallback$initView$2 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public boolean f16039a = true;

    /* renamed from: b */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelineViewCallback f16040b;

    /* renamed from: c */
    public final /* synthetic */ View f16041c;

    public FinderLikedFeedContract$LikedTimelineViewCallback$initView$2(FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback, View view) {
        this.f16040b = likedTimelineViewCallback;
        this.f16041c = view;
    }

    /* renamed from: a */
    public void mo3747a(int i) {
        if (this.f16039a && i > 0) {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f16040b.f15989f).mo75002a(C13442s8.class);
            C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C58556f j3 = ((C13442s8) a).mo12854j3(-1);
            if (j3 != null) {
                FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f16040b;
                C58563g gVar = new C58563g(j3);
                RecyclerView recyclerView = likedTimelineViewCallback.f15991h;
                if (recyclerView != null) {
                    gVar.onScrollStateChanged(recyclerView, 5);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            this.f16039a = false;
        }
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        Log.m105924i(this.f16040b.f15987d, "onRequestLoadMore");
        ((C119157j) C119157j.f356862d).mo183875f(new C3409xdc96b4d4(this.f16040b));
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        Log.m105924i(this.f16040b.f15987d, "onRequestRefresh");
        ((C119157j) C119157j.f356862d).mo183875f(new C3410xf9d260c2(this.f16040b));
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f16040b;
        View view = likedTimelineViewCallback.f15992i;
        if (view != null) {
            View view2 = this.f16041c;
            RecyclerView.C16613e adapter = likedTimelineViewCallback.getRecyclerView().getAdapter();
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0) <= 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view4 = view2;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view5 = view;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (view2 != null) {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view6 = view2;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback$initView$2", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (cVar.f24953h > 0) {
                FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = this.f16040b;
                RecyclerView recyclerView = likedTimelineViewCallback2.f15991h;
                if (recyclerView != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                    int C = ((FinderLinearLayoutManager) layoutManager).mo16957C() + 1;
                    String str = likedTimelineViewCallback2.f15987d;
                    Log.m105924i(str, "[smoothScrollToNextPosition] nextPosition=" + C);
                    recyclerView.post(new C3411x4f12938(recyclerView, C));
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, this.f16040b.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "2", C0075i.EVENT_ON_REFRESH, 0, 0, 0, 112, (Object) null);
            return;
        }
        C87412m.m108603p("mEmptyView");
        throw null;
    }
}
