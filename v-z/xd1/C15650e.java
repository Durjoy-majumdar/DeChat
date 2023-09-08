package xd1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: xd1.e */
public final class C15650e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15644c f42316d;

    public C15650e(C15644c cVar) {
        this.f42316d = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$initDrawerHeader$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<Boolean> aVar = this.f42316d.f42306y;
        if (aVar != null) {
            Boolean invoke = aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$initDrawerHeader$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
