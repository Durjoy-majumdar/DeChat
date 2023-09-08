package sz0;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardHomePageNewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import nj3.C11184p0;
import nj3.C76879j;
import p447aw.C103918d;
import te3.C118431fo;

/* renamed from: sz0.d */
public final class C22418d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CardHomePageNewUI f63530d;

    /* renamed from: sz0.d$a */
    public static final class C22419a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardHomePageNewUI f63531d;

        public C22419a(CardHomePageNewUI cardHomePageNewUI) {
            this.f63531d = cardHomePageNewUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125785lI(this.f63531d.getContext(), 564);
        }
    }

    public C22418d(CardHomePageNewUI cardHomePageNewUI) {
        this.f63530d = cardHomePageNewUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        Log.m105925i("MicroMsg.CardHomePageNewUI", "click item: %s, sortType: %s", Integer.valueOf(itemId), Integer.valueOf(this.f63530d.f51969E));
        C118431fo foVar = this.f63530d.f51970F.get(itemId);
        C87412m.m108593f(foVar, "cardSortInfoList[itemId]");
        C118431fo foVar2 = foVar;
        CardHomePageNewUI cardHomePageNewUI = this.f63530d;
        cardHomePageNewUI.f51983q = foVar2.f354005e;
        int i2 = foVar2.f354004d;
        if (i2 != 1 || cardHomePageNewUI.f51969E == 1) {
            if (i2 == 2 && cardHomePageNewUI.f51969E != 2) {
                cardHomePageNewUI.f51975K = true;
                cardHomePageNewUI.f51982p = 0;
                cardHomePageNewUI.f51969E = 2;
                cardHomePageNewUI.mo23419M7();
                C115669n.INSTANCE.mo160131h(16322, 16);
            } else if (i2 == 3 && cardHomePageNewUI.f51969E != 3) {
                cardHomePageNewUI.f51975K = true;
                cardHomePageNewUI.f51982p = 0;
                cardHomePageNewUI.f51969E = 3;
                cardHomePageNewUI.mo23419M7();
                C115669n.INSTANCE.mo160131h(16322, 17);
            }
        } else if (!cardHomePageNewUI.f52075f) {
            C76879j.m92709C(cardHomePageNewUI.getContext(), this.f63530d.getString(C0966R.string.ayo), this.f63530d.getString(C0966R.string.hif), this.f63530d.getString(C0966R.string.fyd), this.f63530d.getString(C0966R.string.bj_), false, new C22419a(this.f63530d), (DialogInterface.OnClickListener) null);
        } else {
            cardHomePageNewUI.f51975K = true;
            cardHomePageNewUI.f51982p = 0;
            cardHomePageNewUI.f51969E = 1;
            cardHomePageNewUI.mo23419M7();
            C115669n.INSTANCE.mo160131h(16322, 15);
        }
    }
}
