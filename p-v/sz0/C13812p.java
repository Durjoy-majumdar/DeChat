package sz0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardTicketListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import nj3.C11184p0;
import te3.C50655oa3;

/* renamed from: sz0.p */
public final class C13812p implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CardTicketListUI f38943d;

    /* renamed from: e */
    public final /* synthetic */ C50655oa3 f38944e;

    public C13812p(CardTicketListUI cardTicketListUI, C50655oa3 oa32) {
        this.f38943d = cardTicketListUI;
        this.f38944e = oa32;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            CardTicketListUI cardTicketListUI = this.f38943d;
            C50655oa3 oa32 = this.f38944e;
            C87412m.m108591d(oa32);
            String str = oa32.f139060d;
            C87412m.m108593f(str, "ticketElement!!.user_card_id");
            int i2 = CardTicketListUI.f109930A;
            cardTicketListUI.mo63848L7(str);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            C50655oa3 oa33 = this.f38944e;
            C87412m.m108591d(oa33);
            objArr[0] = Integer.valueOf(oa33.f139064h);
            C50655oa3 oa34 = this.f38944e;
            C87412m.m108591d(oa34);
            objArr[1] = oa34.f139060d;
            C48513k kVar = this.f38943d.f109932j;
            if (kVar != null) {
                C50655oa3 oa35 = this.f38944e;
                C87412m.m108591d(oa35);
                String str2 = oa35.f139060d;
                C87412m.m108593f(str2, "ticketElement!!.user_card_id");
                C50655oa3 oa36 = this.f38944e;
                C87412m.m108591d(oa36);
                objArr[2] = Integer.valueOf(kVar.mo73144G4(str2, oa36.f139064h));
                objArr[3] = 4;
                nVar.mo160131h(16326, objArr);
                return;
            }
            C87412m.m108603p("mTicketAdapter");
            throw null;
        }
    }
}
