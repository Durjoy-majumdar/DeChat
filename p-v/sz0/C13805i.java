package sz0;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardInvalidTicketListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kz0.C46817i;
import nj3.C11184p0;
import te3.C50655oa3;

/* renamed from: sz0.i */
public final class C13805i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CardInvalidTicketListUI f38934d;

    /* renamed from: e */
    public final /* synthetic */ C50655oa3 f38935e;

    public C13805i(CardInvalidTicketListUI cardInvalidTicketListUI, C50655oa3 oa32) {
        this.f38934d = cardInvalidTicketListUI;
        this.f38935e = oa32;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            CardInvalidTicketListUI cardInvalidTicketListUI = this.f38934d;
            C50655oa3 oa32 = this.f38935e;
            C87412m.m108591d(oa32);
            String str = oa32.f139060d;
            C87412m.m108593f(str, "ticketElement!!.user_card_id");
            int i2 = CardInvalidTicketListUI.f109914v;
            cardInvalidTicketListUI.getClass();
            Log.m105925i("MicroMsg.CardInvalidTicketListUI", "do delete ticket: %s", str);
            cardInvalidTicketListUI.mo63845O7(Boolean.TRUE);
            new C46817i(str).mo9225i().mo123062e(new C48512e(cardInvalidTicketListUI, str));
        }
    }
}
