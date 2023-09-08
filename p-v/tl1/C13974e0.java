package tl1;

import al1.C0082q;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import rl1.C13022d0;
import te3.C52204z21;

/* renamed from: tl1.e0 */
public final class C13974e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C13985j0 f39257d;

    public C13974e0(C13985j0 j0Var) {
        this.f39257d = j0Var;
    }

    public final void onClick(View view) {
        C52204z21 z212;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardWinnerListWidget$initWinnerListView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0082q qVar = ((C13022d0) this.f39257d.f39273a.mo87696x0(C13022d0.class)).f37098n;
        if (!(qVar == null || (z212 = qVar.f509d) == null)) {
            C13998p pVar = this.f39257d.f39273a;
            pVar.getClass();
            C14012y yVar = pVar.f39321H;
            if (yVar != null) {
                yVar.mo13442d(z212, false);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardWinnerListWidget$initWinnerListView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
