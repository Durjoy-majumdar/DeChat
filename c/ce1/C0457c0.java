package ce1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ce1.c0 */
public final class C0457c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0461e0 f1092d;

    public C0457c0(C0461e0 e0Var) {
        this.f1092d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C0461e0 e0Var = this.f1092d;
        if (e0Var.f1107r) {
            e0Var.getClass();
            e0Var.f1105p = "";
            C0461e0 e0Var2 = this.f1092d;
            e0Var2.f1106q = true;
            e0Var2.mo505g3("");
            this.f1092d.mo503e3();
        } else {
            C0461e0.m394c3(e0Var);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
