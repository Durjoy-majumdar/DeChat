package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kf1.C9916p2;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.p */
public final class C4339p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTwoFlowTimelineUIC f18818d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4339p(FinderTwoFlowTimelineUIC finderTwoFlowTimelineUIC) {
        super(0);
        this.f18818d = finderTwoFlowTimelineUIC;
    }

    public Object invoke() {
        RecyclerView.C16613e adapter;
        C37521f.f99374d.getClass();
        boolean z = false;
        boolean z2 = C37521f.f99355a6.mo60266n().intValue() == 1;
        FinderHomeUIC finderHomeUIC = (FinderHomeUIC) C39818r.f106831a.mo62444c(this.f18818d.getActivity()).mo62449e(FinderHomeUIC.class);
        if (finderHomeUIC != null) {
            if (finderHomeUIC.mo5128d3() != this.f18818d.mo5178c3()) {
                z = true;
            }
        }
        Log.m105924i("FinderTwoFlowTimelineUIC", "FinderNextTabPreloadEvent: showPreloadResultWhenSwitchTab=" + z2 + ", isFragmentUnFocus=" + z);
        if (z2 && z) {
            FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter = this.f18818d.f18796e;
            if (finderFollowFeedUIContract$Presenter != null) {
                finderFollowFeedUIContract$Presenter.f30175e.getDataListJustForAdapter().clear();
                C9916p2 p2Var = this.f18818d.f18797f;
                if (p2Var != null) {
                    RecyclerView recyclerView = p2Var.getRecyclerView();
                    if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
