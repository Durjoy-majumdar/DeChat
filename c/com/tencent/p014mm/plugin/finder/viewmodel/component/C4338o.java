package com.tencent.p014mm.plugin.finder.viewmodel.component;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kf1.C9860m9;
import kf1.C9878n9;
import kf1.C9881nb;
import rx3.C13598b0;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.o */
public final class C4338o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTimelineUIC f18817d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4338o(FinderTimelineUIC finderTimelineUIC) {
        super(0);
        this.f18817d = finderTimelineUIC;
    }

    public Object invoke() {
        RecyclerView.C16613e adapter;
        C37521f.f99374d.getClass();
        boolean z = false;
        boolean z2 = C37521f.f99355a6.mo60266n().intValue() == 1;
        FinderHomeUIC finderHomeUIC = (FinderHomeUIC) C39818r.f106831a.mo62444c(this.f18817d.getActivity()).mo62449e(FinderHomeUIC.class);
        if (finderHomeUIC != null) {
            if (finderHomeUIC.mo5128d3() != this.f18817d.mo5173e3()) {
                z = true;
            }
        }
        Log.m105924i("Finder.TimelineUIC", "FinderNextTabPreloadEvent: tabType=" + this.f18817d.mo5173e3() + ", showPreloadResultWhenSwitchTab=" + z2 + ", isFragmentUnFocus=" + z);
        if (z2 && z) {
            C9860m9 m9Var = this.f18817d.f18785d;
            if (m9Var != null) {
                ((FinderTimelinePresenter) m9Var).f13285z.getDataListJustForAdapter().clear();
                C9878n9 n9Var = this.f18817d.f18786e;
                if (n9Var != null) {
                    RecyclerView recyclerView = ((C9881nb) n9Var).getRecyclerView();
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
