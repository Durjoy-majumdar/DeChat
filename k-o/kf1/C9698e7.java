package kf1;

import android.view.View;
import cm1.C0740i2;
import cm1.C0800z1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: kf1.e7 */
public final class C9698e7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9669c7 f30105d;

    public C9698e7(C9669c7 c7Var) {
        this.f30105d = c7Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9669c7 c7Var = this.f30105d;
        int size = c7Var.mo10348I0().f30175e.getSize();
        if (size > 0) {
            if (c7Var.f30038A == size) {
                Iterator it = c7Var.mo10348I0().f30175e.getDataListJustForAdapter().iterator();
                while (it.hasNext()) {
                    C0740i2 i2Var = (C0740i2) it.next();
                    if (i2Var instanceof C0800z1) {
                        ((C0800z1) i2Var).f1861e = false;
                    }
                }
                c7Var.mo10346D().notifyDataSetChanged();
                c7Var.f30038A = 0;
                c7Var.mo10290d1();
            } else {
                Iterator it4 = c7Var.mo10348I0().f30175e.getDataListJustForAdapter().iterator();
                while (it4.hasNext()) {
                    C0740i2 i2Var2 = (C0740i2) it4.next();
                    if (i2Var2 instanceof C0800z1) {
                        ((C0800z1) i2Var2).f1861e = true;
                    }
                }
                c7Var.mo10346D().notifyDataSetChanged();
                c7Var.f30038A = size;
                c7Var.mo10290d1();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiRelateUIContract$PoiRelateViewCallback$initBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
