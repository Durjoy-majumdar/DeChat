package xd1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: xd1.d */
public final class C15649d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15644c f42315d;

    public C15649d(C15644c cVar) {
        this.f42315d = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$initDrawerHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f42315d.f42304w;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$initDrawerHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
