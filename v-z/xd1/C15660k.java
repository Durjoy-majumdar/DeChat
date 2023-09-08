package xd1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: xd1.k */
public final class C15660k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f42332d;

    public C15660k(C32224a<C13598b0> aVar) {
        this.f42332d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$refreshHeader$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42332d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/poi/uic/FinderPoiHeaderUIC$refreshHeader$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
