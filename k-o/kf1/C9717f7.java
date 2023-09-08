package kf1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import zt3.C119157j;

/* renamed from: kf1.f7 */
public final class C9717f7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9669c7 f30144d;

    public C9717f7(C9669c7 c7Var) {
        this.f30144d = c7Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initBottomView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9669c7 c7Var = this.f30144d;
        if (c7Var.f30038A > 0) {
            c7Var.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C9686d7(c7Var));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initBottomView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
