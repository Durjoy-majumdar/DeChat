package uz0;

import android.content.DialogInterface;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import qo3.C89779i0;

/* renamed from: uz0.d0 */
public final class C14393d0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ HistoryCardListUI f39966d;

    public C14393d0(HistoryCardListUI historyCardListUI) {
        this.f39966d = historyCardListUI;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        HistoryCardListUI historyCardListUI = this.f39966d;
        int i = HistoryCardListUI.f52269r;
        historyCardListUI.getClass();
        if (bool != null) {
            C89779i0 i0Var = null;
            if (bool.booleanValue()) {
                i0Var = C89779i0.m112248e(historyCardListUI.getContext(), historyCardListUI.getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            } else {
                C89779i0 i0Var2 = historyCardListUI.f52275q;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
            }
            historyCardListUI.f52275q = i0Var;
        }
    }
}
