package xk1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xk1.x0 */
public final class C15791x0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C66352v0 f42553d;

    public C15791x0(C66352v0 v0Var) {
        this.f42553d = v0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42553d.getActivity().finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
