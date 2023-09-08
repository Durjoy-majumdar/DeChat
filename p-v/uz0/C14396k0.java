package uz0;

import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: uz0.k0 */
public final class C14396k0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ HistoryCardListUI f39969d;

    /* renamed from: e */
    public final /* synthetic */ C22668a f39970e;

    /* renamed from: f */
    public final /* synthetic */ int f39971f;

    public C14396k0(HistoryCardListUI historyCardListUI, C22668a aVar, int i) {
        this.f39969d = historyCardListUI;
        this.f39970e = aVar;
        this.f39971f = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        HistoryCardListUI historyCardListUI = this.f39969d;
        C22668a aVar = this.f39970e;
        int i2 = this.f39971f;
        int i3 = HistoryCardListUI.f52269r;
        C77407n nVar = new C77407n((Context) historyCardListUI.getContext(), 1, true);
        TextView textView = new TextView(historyCardListUI.getContext());
        textView.setText(historyCardListUI.getString(C0966R.string.ay_));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(historyCardListUI.getResources().getColor(C0966R.color.f3552xi));
        textView.setGravity(17);
        int dimensionPixelSize = historyCardListUI.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
        int dimensionPixelSize2 = historyCardListUI.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        nVar.mo107569n(textView, false);
        nVar.f225771i = new C14394h0(historyCardListUI);
        nVar.f225782p = new C22682i0(historyCardListUI, aVar, i2);
        nVar.mo107573q();
    }
}
