package sz0;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardInvalidTicketListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: sz0.j */
public final class C13806j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CardInvalidTicketListUI f38936d;

    /* renamed from: sz0.j$a */
    public static final class C13807a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardInvalidTicketListUI f38937d;

        public C13807a(CardInvalidTicketListUI cardInvalidTicketListUI) {
            this.f38937d = cardInvalidTicketListUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CardInvalidTicketListUI cardInvalidTicketListUI = this.f38937d;
            int i2 = CardInvalidTicketListUI.f109914v;
            cardInvalidTicketListUI.getClass();
            Log.m105924i("MicroMsg.CardInvalidTicketListUI", "do clear invalid ticket list");
            C115669n.INSTANCE.mo160131h(16322, 11);
        }
    }

    /* renamed from: sz0.j$b */
    public static final class C13808b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C13808b f38938d = new C13808b();

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C115669n.INSTANCE.mo160131h(16322, 12);
        }
    }

    public C13806j(CardInvalidTicketListUI cardInvalidTicketListUI) {
        this.f38936d = cardInvalidTicketListUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C76879j.m92717K(this.f38936d.getContext(), false, this.f38936d.getString(C0966R.string.ays), "", this.f38936d.getString(C0966R.string.bjb), this.f38936d.getString(C0966R.string.bj_), new C13807a(this.f38936d), C13808b.f38938d);
        C115669n.INSTANCE.mo160131h(16322, 10);
        return false;
    }
}
