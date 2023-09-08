package wg1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wg1.u */
public final class C66084u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66076t f189974d;

    public C66084u(C66076t tVar) {
        this.f189974d = tVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$applyBundle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C66083t1 t1Var = this.f189974d.f189965h;
        if (t1Var != null) {
            t1Var.mo90134b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback$applyBundle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
