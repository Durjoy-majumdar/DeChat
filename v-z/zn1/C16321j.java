package zn1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: zn1.j */
public final class C16321j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f43628d;

    public C16321j(C32224a<C13598b0> aVar) {
        this.f43628d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$showRetryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f43628d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$showRetryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
