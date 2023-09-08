package xk1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: xk1.u1 */
public final class C15781u1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f42541d;

    public C15781u1(C32224a<C13598b0> aVar) {
        this.f42541d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostEditDescUIC$initOuterDescEt$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f42541d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostEditDescUIC$initOuterDescEt$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
