package uz0;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import gy3.C87412m;
import wz0.C22945n;

/* renamed from: uz0.c0 */
public final class C22671c0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ HistoryCardListUI f65204d;

    public C22671c0(HistoryCardListUI historyCardListUI) {
        this.f65204d = historyCardListUI;
    }

    public void onChanged(Object obj) {
        C22707x xVar = (C22707x) obj;
        HistoryCardListUI historyCardListUI = this.f65204d;
        int i = HistoryCardListUI.f52269r;
        historyCardListUI.getClass();
        if (xVar != null) {
            int ordinal = xVar.ordinal();
            boolean z = true;
            if (ordinal == 3) {
                LoadMoreRecyclerView loadMoreRecyclerView = historyCardListUI.f52270i;
                if (loadMoreRecyclerView != null) {
                    loadMoreRecyclerView.mo63430I(true);
                } else {
                    C87412m.m108603p("mHistoryCardListRv");
                    throw null;
                }
            } else if (ordinal == 4) {
                LoadMoreRecyclerView loadMoreRecyclerView2 = historyCardListUI.f52270i;
                if (loadMoreRecyclerView2 != null) {
                    loadMoreRecyclerView2.mo63430I(false);
                } else {
                    C87412m.m108603p("mHistoryCardListRv");
                    throw null;
                }
            } else if (ordinal == 5) {
                String str = xVar.f65286d;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    C22945n.m27017q(historyCardListUI.getContext(), "");
                } else {
                    C22945n.m27018r(historyCardListUI.getContext(), xVar.f65286d);
                }
            }
        }
    }
}
