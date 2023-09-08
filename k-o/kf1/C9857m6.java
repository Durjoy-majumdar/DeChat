package kf1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: kf1.m6 */
public final class C9857m6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f30436d;

    public C9857m6(C32224a<C13598b0> aVar) {
        this.f30436d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback$refreshHeader$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f30436d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderPoiFeedUIContract$PoiFeedViewCallback$refreshHeader$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
