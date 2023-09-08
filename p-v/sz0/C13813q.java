package sz0;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardInvalidTicketListUI;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardTicketListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: sz0.q */
public final class C13813q implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CardTicketListUI f38945d;

    /* renamed from: sz0.q$a */
    public static final class C13814a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ CardTicketListUI f38946d;

        public C13814a(CardTicketListUI cardTicketListUI) {
            this.f38946d = cardTicketListUI;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.add(0, 0, 1, (CharSequence) this.f38946d.getString(C0966R.string.k2h));
        }
    }

    /* renamed from: sz0.q$b */
    public static final class C13815b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ CardTicketListUI f38947d;

        public C13815b(CardTicketListUI cardTicketListUI) {
            this.f38947d = cardTicketListUI;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                Log.m105924i("MicroMsg.CardTicketListUI", "click history wording");
                Intent intent = new Intent(this.f38947d, CardInvalidTicketListUI.class);
                CardTicketListUI cardTicketListUI = this.f38947d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                CardTicketListUI cardTicketListUI2 = cardTicketListUI;
                C117292a.m165358d(cardTicketListUI2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v2/CardTicketListUI$updateTextMenu$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                cardTicketListUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(cardTicketListUI2, "com/tencent/mm/plugin/card/ui/v2/CardTicketListUI$updateTextMenu$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C115669n.INSTANCE.mo160131h(16322, 8);
            }
        }
    }

    public C13813q(CardTicketListUI cardTicketListUI) {
        this.f38945d = cardTicketListUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f38945d.getContext(), 1, false);
        CardTicketListUI cardTicketListUI = this.f38945d;
        nVar.f225771i = new C13814a(cardTicketListUI);
        nVar.f225782p = new C13815b(cardTicketListUI);
        nVar.mo107573q();
        return false;
    }
}
