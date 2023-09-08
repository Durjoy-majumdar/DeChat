package uz0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nj3.C11184p0;
import te3.C22502jn;

/* renamed from: uz0.i0 */
public final class C22682i0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ HistoryCardListUI f65231d;

    /* renamed from: e */
    public final /* synthetic */ C22668a f65232e;

    /* renamed from: f */
    public final /* synthetic */ int f65233f;

    public C22682i0(HistoryCardListUI historyCardListUI, C22668a aVar, int i) {
        this.f65231d = historyCardListUI;
        this.f65232e = aVar;
        this.f65233f = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            int i2 = this.f65231d.f52274p;
            int i3 = (i2 == 2 || i2 != 3) ? 2 : 1;
            C22502jn jnVar = this.f65232e.f65201c;
            String str = jnVar != null ? jnVar.f64049d : null;
            if (str == null) {
                str = "";
            }
            Log.m105924i("MicroMsg.HistoryCardListUI", "delete card, cardIndex: " + this.f65233f + ", cardID: " + str + ", pageScene: " + i3);
            C115669n.INSTANCE.mo160131h(21329, Integer.valueOf(i3), 1, str, Integer.valueOf(this.f65233f));
            C22680h hVar = this.f65231d.f52272n;
            if (hVar != null) {
                hVar.mo35792e3(this.f65232e);
            } else {
                C87412m.m108603p("mViewModel");
                throw null;
            }
        }
    }
}
