package uz0;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import te3.C22502jn;
import te3.C51997xn;
import wz0.C53246b;

/* renamed from: uz0.f0 */
public final class C22675f0 implements MRecyclerView.C40583d {

    /* renamed from: a */
    public final /* synthetic */ HistoryCardListUI f65210a;

    public C22675f0(HistoryCardListUI historyCardListUI) {
        this.f65210a = historyCardListUI;
    }

    /* renamed from: a */
    public final void mo23073a(RecyclerView recyclerView, View view, int i, long j) {
        C22502jn jnVar;
        int i2 = i;
        HistoryCardListUI historyCardListUI = this.f65210a;
        C22676g gVar = historyCardListUI.f52273o;
        if (gVar != null) {
            C22668a F4 = gVar.mo35787F4(i2);
            if (F4 != null && (jnVar = F4.f65201c) != null) {
                int i3 = jnVar.f64064v;
                if (i3 == 1) {
                    C53246b.m59678j((MMActivity) historyCardListUI.getContext(), jnVar.f64065w, 0);
                } else if (i3 != 2) {
                    Intent intent = new Intent(historyCardListUI.getContext(), CardDetailUI.class);
                    intent.putExtra("key_card_id", jnVar.f64049d);
                    intent.addFlags(131072);
                    intent.putExtra("key_from_scene", 3);
                    AppCompatActivity context = historyCardListUI.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    AppCompatActivity appCompatActivity = context;
                    C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v4/HistoryCardListUI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/card/ui/v4/HistoryCardListUI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    C51997xn xnVar = jnVar.f64066x;
                    if (xnVar != null) {
                        C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                    }
                }
                int i4 = historyCardListUI.f52274p;
                int i5 = (i4 == 2 || i4 != 3) ? 2 : 1;
                Log.m105924i("MicroMsg.HistoryCardListUI", "go to card detail ui, cardIndex: " + i2 + ", cardID: " + jnVar.f64049d + ", pageScene: " + i5 + ", cardType: " + jnVar.f64064v);
                C115669n.INSTANCE.mo160131h(21329, Integer.valueOf(i5), 1, jnVar.f64049d, Integer.valueOf(i));
                return;
            }
            return;
        }
        C87412m.m108603p("mHistoryCardListAdapter");
        throw null;
    }
}
