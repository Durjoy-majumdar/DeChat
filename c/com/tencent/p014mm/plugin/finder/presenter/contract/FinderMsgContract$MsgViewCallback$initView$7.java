package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C55011a;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import sx3.C110818d0;
import tr1.C78080i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$initView$7", "Lcom/tencent/mm/view/RefreshLoadMoreLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$initView$7 */
public final class FinderMsgContract$MsgViewCallback$initView$7 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160422a;

    public FinderMsgContract$MsgViewCallback$initView$7(FinderMsgContract.MsgViewCallback msgViewCallback) {
        this.f160422a = msgViewCallback;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        FinderMsgContract.MsgPresenter msgPresenter = this.f160422a.f160389f;
        long j = ((C55011a) C110818d0.m150923U(msgPresenter.f160381i)).f154465d.field_id;
        FinderMsgContract.f160373a.getClass();
        msgPresenter.mo78474n(j, FinderMsgContract.f160375c, true, false);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        this.f160422a.f160389f.mo78473e();
        RecyclerView recyclerView = this.f160422a.f160392i;
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
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f160422a.f160393j;
        if (refreshLoadMoreLayout != null) {
            RefreshLoadMoreLayout.m66898r(refreshLoadMoreLayout, (C32224a) null, 1, (Object) null);
            FinderMsgContract.MsgViewCallback msgViewCallback = this.f160422a;
            RecyclerView recyclerView = msgViewCallback.f160392i;
            if (recyclerView != null) {
                recyclerView.postDelayed(new FinderMsgContract$MsgViewCallback$initView$7$onRefreshEnd$1(msgViewCallback), 1000);
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
