package zn1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77407n;

/* renamed from: zn1.i */
public final class C16320i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16322k f43627d;

    public C16320i(C16322k kVar) {
        this.f43627d = kVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16322k kVar = this.f43627d;
        C77407n nVar = new C77407n(kVar.mo14803b(), 1, false);
        nVar.f225771i = C16317f.f43624d;
        nVar.f225782p = new C16318g(kVar);
        nVar.f225795v = new C16319h(kVar);
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
