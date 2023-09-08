package tl1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C0082q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import rl1.C13022d0;
import rl1.C13064o0;
import te3.C49540gb3;
import te3.C51633v21;
import te3.C52204z21;

/* renamed from: tl1.s */
public final class C14003s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14012y f39331d;

    public C14003s(C14012y yVar) {
        this.f39331d = yVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C58739j4.f168176a.mo83683L()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C14012y yVar = this.f39331d;
        C0082q qVar = ((C13022d0) yVar.f39350a.mo87696x0(C13022d0.class)).f37098n;
        C52204z21 z212 = qVar != null ? qVar.f509d : null;
        if (z212 == null) {
            Log.m105920e("VisitorLotteryCardDoneWidget", "onClaimClick but lotteryInfo is null!");
        } else {
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w wVar = (C54116w) c;
            C54067f0.C0071v0 v0Var = C54067f0.C0071v0.CLICK_LOTTERY_CARD_CLAIM_BTN;
            C13064o0 o0Var = C13064o0.f37206a;
            C51633v21 v212 = z212.f145653t;
            int i = v212 != null ? v212.f143256d : 0;
            C54116w.my0(wVar, v0Var, i != 1 ? i != 2 ? "1" : "3" : "2", (String) null, 0, 12, (Object) null);
            C51633v21 v213 = z212.f145653t;
            Integer valueOf = v213 != null ? Integer.valueOf(v213.f143256d) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                Context context = yVar.f39351b.getContext();
                C87412m.m108593f(context, "doneContainer.context");
                String str = ((C54991o) yVar.f39350a.mo87696x0(C54991o.class)).f154345o;
                C49540gb3 gb32 = z212.f145651r;
                int i2 = gb32 != null ? gb32.f133951d : 0;
                String str2 = z212.f145640d;
                if (str2 == null) {
                    str2 = "";
                }
                o0Var.mo12564c(context, str, i2, str2, ((C55001u) yVar.f39350a.mo87696x0(C55001u.class)).f154416j, yVar.f39350a.f177937h);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                Context context2 = yVar.f39351b.getContext();
                C87412m.m108593f(context2, "doneContainer.context");
                Intent intent = new Intent();
                intent.putExtra("launch_from_select_addr", true);
                C88144b.m109796n(context2, "address", ".ui.WalletSelectAddrUI", intent, 1001, false);
            } else if (valueOf == null || valueOf.intValue() != 2) {
                Log.m105920e("VisitorLotteryCardDoneWidget", "onClaimClick but claim type is error!");
            } else if (!(yVar.f39351b.getContext() instanceof Activity)) {
                Log.m105920e("VisitorLotteryCardDoneWidget", "claimByCustomize but context isn't Activity!");
            } else {
                Context context3 = yVar.f39351b.getContext();
                C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                yVar.f39366q = o0Var.mo12563a((Activity) context3, z212, new C14011x(yVar, z212));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
