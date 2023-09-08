package uz0;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import te3.C22502jn;
import te3.C51997xn;
import wz0.C53246b;

/* renamed from: uz0.o */
public final class C22694o implements MRecyclerView.C40583d {

    /* renamed from: a */
    public final /* synthetic */ CouponAndGiftCardListV4UI f65252a;

    public C22694o(CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f65252a = couponAndGiftCardListV4UI;
    }

    /* renamed from: a */
    public final void mo23073a(RecyclerView recyclerView, View view, int i, long j) {
        int i2 = i;
        CouponAndGiftCardListV4UI couponAndGiftCardListV4UI = this.f65252a;
        C22676g gVar = couponAndGiftCardListV4UI.f52265p;
        if (gVar != null) {
            C22668a F4 = gVar.mo35787F4(i2);
            if (F4 != null) {
                int i3 = F4.f65199a;
                int i4 = i3 != 1 ? i3 != 2 ? -1 : i2 - 1 : i2 - 2;
                C22502jn jnVar = F4.f65201c;
                if (jnVar != null) {
                    String str = couponAndGiftCardListV4UI.f52261i;
                    Log.m105924i(str, "go to card detail ui, cardIndex: " + i4 + ", cardID: " + jnVar.f64049d + ", cardType: " + jnVar.f64064v);
                    C115669n.INSTANCE.mo160131h(19748, 3, Long.valueOf(System.currentTimeMillis() / ((long) 1000)), jnVar.f64049d, Integer.valueOf(i4), 0);
                    int i5 = jnVar.f64064v;
                    if (i5 == 1) {
                        C53246b.m59678j((MMActivity) couponAndGiftCardListV4UI.getContext(), jnVar.f64065w, 0);
                    } else if (i5 != 2) {
                        Intent intent = new Intent(couponAndGiftCardListV4UI.getContext(), CardDetailUI.class);
                        intent.putExtra("key_card_id", jnVar.f64049d);
                        intent.addFlags(131072);
                        intent.putExtra("key_from_scene", 3);
                        AppCompatActivity context = couponAndGiftCardListV4UI.getContext();
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        AppCompatActivity appCompatActivity = context;
                        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        C51997xn xnVar = jnVar.f64066x;
                        if (xnVar != null) {
                            C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                        }
                    }
                    couponAndGiftCardListV4UI.f52266q = true;
                    return;
                }
                return;
            }
            return;
        }
        C87412m.m108603p("mCardsCardListAdapter");
        throw null;
    }
}
