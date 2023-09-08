package zs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zs1.g */
public final class C53809g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53810h f150990d;

    public C53809g(C53810h hVar) {
        this.f150990d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/ad/FinderViewScrollContainer$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f150990d.mo74384a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/webview/ad/FinderViewScrollContainer$initRootView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
