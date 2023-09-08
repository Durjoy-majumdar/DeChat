package com.tencent.p014mm.plugin.finder.presenter.contract;

import ak1.C0075i;
import ak1.C54067f0;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$4", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$4 */
public final class FinderFollowListContract$FollowListViewCallback$initView$4 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderFollowListContract.FollowListViewCallback f15959a;

    public FinderFollowListContract$FollowListViewCallback$initView$4(FinderFollowListContract.FollowListViewCallback followListViewCallback) {
        this.f15959a = followListViewCallback;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        this.f15959a.f15937f.mo3727e(true);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f15959a.mo3731y();
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        FinderFollowListContract.FollowListPresent followListPresent = this.f15959a.f15937f;
        followListPresent.f15929f = null;
        followListPresent.mo3727e(false);
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        View findViewById;
        TextView textView;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (cVar.f24951f) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15959a.f15944p;
            if (refreshLoadMoreLayout == null) {
                C87412m.m108603p("rlLayout");
                throw null;
            } else if (!refreshLoadMoreLayout.f165608I) {
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setHasBottomMore(true);
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15959a.f15944p;
                    if (refreshLoadMoreLayout2 != null) {
                        View loadMoreFooter = refreshLoadMoreLayout2.getLoadMoreFooter();
                        if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView.setVisibility(0);
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f15959a.f15944p;
                        if (refreshLoadMoreLayout3 != null) {
                            View loadMoreFooter2 = refreshLoadMoreLayout3.getLoadMoreFooter();
                            if (!(loadMoreFooter2 == null || (findViewById = loadMoreFooter2.findViewById(C0966R.C0970id.g2s)) == null)) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        } else {
                            C87412m.m108603p("rlLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            }
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f15959a.f15944p;
        if (refreshLoadMoreLayout4 != null) {
            RefreshLoadMoreLayout.m66898r(refreshLoadMoreLayout4, (C32224a) null, 1, (Object) null);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "12", C0075i.EVENT_ON_REFRESH, 0, 0, 0, 112, (Object) null);
            return;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }
}
