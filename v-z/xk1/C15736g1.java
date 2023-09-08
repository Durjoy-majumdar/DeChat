package xk1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xk1.g1 */
public final class C15736g1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15728e1 f42452d;

    public C15736g1(C15728e1 e1Var) {
        this.f42452d = e1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42452d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC$initViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
