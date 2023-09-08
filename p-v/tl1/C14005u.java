package tl1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: tl1.u */
public final class C14005u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14012y f39333d;

    public C14005u(C14012y yVar) {
        this.f39333d = yVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f39333d.f39350a.mo13434e1(1);
        this.f39333d.f39350a.mo13435f1(true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
