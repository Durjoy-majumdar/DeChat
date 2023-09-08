package uz0;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import gy3.C87412m;

/* renamed from: uz0.e0 */
public final class C22673e0 implements LoadMoreRecyclerView.C40579c {

    /* renamed from: a */
    public final /* synthetic */ HistoryCardListUI f65207a;

    public C22673e0(HistoryCardListUI historyCardListUI) {
        this.f65207a = historyCardListUI;
    }

    /* renamed from: a */
    public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
        HistoryCardListUI historyCardListUI = this.f65207a;
        C22680h hVar = historyCardListUI.f52272n;
        if (hVar != null) {
            hVar.mo35793f3(historyCardListUI);
        } else {
            C87412m.m108603p("mViewModel");
            throw null;
        }
    }
}
