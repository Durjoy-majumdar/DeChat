package xk1;

import android.view.View;
import fy3.C32226l;
import it1.C9247b;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: xk1.h1 */
public final class C66314h1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66316i1 f190902d;

    public C66314h1(C66316i1 i1Var) {
        this.f190902d = i1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCountDownUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C66316i1 i1Var = this.f190902d;
        i1Var.f190911i.stopTimer();
        i1Var.f190910h = 3;
        C9247b bVar = i1Var.f190909g;
        if (bVar != null) {
            bVar.mo8913b();
        }
        C32226l<? super Boolean, C13598b0> lVar = this.f190902d.f190906d;
        if (lVar != null) {
            lVar.invoke(Boolean.FALSE);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCountDownUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
