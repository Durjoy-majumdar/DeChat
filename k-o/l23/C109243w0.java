package l23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: l23.w0 */
public final class C109243w0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C109235u0 f327068d;

    public C109243w0(C109235u0 u0Var) {
        this.f327068d = u0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/VLogTrackEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C109235u0 u0Var = this.f327068d;
        u0Var.f327050q = true;
        u0Var.f327042f.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/VLogTrackEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
