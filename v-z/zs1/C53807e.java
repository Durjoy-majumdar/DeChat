package zs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zs1.e */
public final class C53807e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53808f f150975d;

    public C53807e(C53808f fVar) {
        this.f150975d = fVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/ad/FinderScrollDialog$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f150975d.mo74373c();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/webview/ad/FinderScrollDialog$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
