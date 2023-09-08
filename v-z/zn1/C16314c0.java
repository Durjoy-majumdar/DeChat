package zn1;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: zn1.c0 */
public final class C16314c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f43617d;

    public C16314c0(C32224a<C13598b0> aVar) {
        this.f43617d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback$showRetryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f43617d.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback$showRetryView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
