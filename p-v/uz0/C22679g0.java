package uz0;

import android.graphics.Point;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import gy3.C87412m;
import uo3.C78253a;
import wz0.C102526o;

/* renamed from: uz0.g0 */
public final class C22679g0 implements MRecyclerView.C40584e {

    /* renamed from: a */
    public final /* synthetic */ HistoryCardListUI f65224a;

    public C22679g0(HistoryCardListUI historyCardListUI) {
        this.f65224a = historyCardListUI;
    }

    /* renamed from: a */
    public final boolean mo23457a(RecyclerView recyclerView, View view, int i, long j) {
        HistoryCardListUI historyCardListUI = this.f65224a;
        C87412m.m108593f(view, "view");
        C22676g gVar = historyCardListUI.f52273o;
        if (gVar != null) {
            C22668a F4 = gVar.mo35787F4(i);
            if (F4 == null) {
                return false;
            }
            int i2 = F4.f65199a;
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                return false;
            }
            C78253a aVar = new C78253a(historyCardListUI.getContext(), view);
            aVar.f229249r = new C14395j0(historyCardListUI);
            aVar.f229251t = new C14396k0(historyCardListUI, F4, i);
            Point a = C102526o.m135341a(view);
            aVar.mo71743n(a.x, a.y);
            return false;
        }
        C87412m.m108603p("mHistoryCardListAdapter");
        throw null;
    }
}
