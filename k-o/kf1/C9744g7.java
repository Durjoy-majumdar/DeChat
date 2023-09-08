package kf1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kf1.g7 */
public final class C9744g7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9669c7 f30196d;

    public C9744g7(C9669c7 c7Var) {
        this.f30196d = c7Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initHeader$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f30196d.mo10288b1();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initHeader$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
