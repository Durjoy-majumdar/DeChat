package sz0;

import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardTicketListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import nj3.C11184p0;
import qo3.C77407n;
import te3.C50655oa3;

/* renamed from: sz0.n */
public final class C13810n implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CardTicketListUI f38940d;

    /* renamed from: e */
    public final /* synthetic */ C50655oa3 f38941e;

    public C13810n(CardTicketListUI cardTicketListUI, C50655oa3 oa32) {
        this.f38940d = cardTicketListUI;
        this.f38941e = oa32;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        CardTicketListUI cardTicketListUI = this.f38940d;
        C50655oa3 oa32 = this.f38941e;
        int i2 = CardTicketListUI.f109930A;
        if (oa32 == null) {
            cardTicketListUI.getClass();
            return;
        }
        C77407n nVar = new C77407n((Context) cardTicketListUI.getContext(), 1, true);
        TextView textView = new TextView(cardTicketListUI.getContext());
        textView.setText(cardTicketListUI.getString(C0966R.string.ay_));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(cardTicketListUI.getResources().getColor(C0966R.color.f3552xi));
        textView.setGravity(17);
        int dimensionPixelSize = cardTicketListUI.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
        int dimensionPixelSize2 = cardTicketListUI.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        nVar.mo107569n(textView, false);
        nVar.f225771i = new C13811o(cardTicketListUI);
        nVar.f225782p = new C13812p(cardTicketListUI, oa32);
        C115669n nVar2 = C115669n.INSTANCE;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(oa32.f139064h);
        String str = oa32.f139060d;
        objArr[1] = str;
        C48513k kVar = cardTicketListUI.f109932j;
        if (kVar != null) {
            C87412m.m108593f(str, "ticketElement!!.user_card_id");
            objArr[2] = Integer.valueOf(kVar.mo73144G4(str, oa32.f139064h));
            objArr[3] = 3;
            nVar2.mo160131h(16326, objArr);
            nVar.mo107573q();
            return;
        }
        C87412m.m108603p("mTicketAdapter");
        throw null;
    }
}
