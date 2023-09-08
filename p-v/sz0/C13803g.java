package sz0;

import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardInvalidTicketListUI;
import nj3.C11184p0;
import qo3.C77407n;
import te3.C50655oa3;

/* renamed from: sz0.g */
public final class C13803g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CardInvalidTicketListUI f38931d;

    /* renamed from: e */
    public final /* synthetic */ C50655oa3 f38932e;

    public C13803g(CardInvalidTicketListUI cardInvalidTicketListUI, C50655oa3 oa32) {
        this.f38931d = cardInvalidTicketListUI;
        this.f38932e = oa32;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        CardInvalidTicketListUI cardInvalidTicketListUI = this.f38931d;
        C50655oa3 oa32 = this.f38932e;
        int i2 = CardInvalidTicketListUI.f109914v;
        if (oa32 == null) {
            cardInvalidTicketListUI.getClass();
            return;
        }
        C77407n nVar = new C77407n((Context) cardInvalidTicketListUI.getContext(), 1, true);
        TextView textView = new TextView(cardInvalidTicketListUI.getContext());
        textView.setText(cardInvalidTicketListUI.getString(C0966R.string.ay_));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(cardInvalidTicketListUI.getResources().getColor(C0966R.color.f3552xi));
        textView.setGravity(17);
        int dimensionPixelSize = cardInvalidTicketListUI.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
        int dimensionPixelSize2 = cardInvalidTicketListUI.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        nVar.mo107569n(textView, false);
        nVar.f225771i = new C13804h(cardInvalidTicketListUI);
        nVar.f225782p = new C13805i(cardInvalidTicketListUI, oa32);
        nVar.mo107573q();
    }
}
