package uz0;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import te3.C22517nn;
import te3.C51997xn;
import wz0.C53246b;

/* renamed from: uz0.a0 */
public final class C22669a0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ HistoryCardListUI f65202d;

    public C22669a0(HistoryCardListUI historyCardListUI) {
        this.f65202d = historyCardListUI;
    }

    public void onChanged(Object obj) {
        C51997xn xnVar;
        C22517nn nnVar = (C22517nn) obj;
        HistoryCardListUI historyCardListUI = this.f65202d;
        int i = HistoryCardListUI.f52269r;
        historyCardListUI.getClass();
        if (nnVar != null) {
            int i2 = nnVar.f64330e;
            if (i2 == 1) {
                String str = nnVar.f64331f;
                if (str != null) {
                    C53246b.m59678j(historyCardListUI, str, 0);
                }
            } else if (i2 == 2 && (xnVar = nnVar.f64332g) != null) {
                C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
            }
        }
    }
}
