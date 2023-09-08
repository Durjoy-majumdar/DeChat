package wd3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76901s0;

/* renamed from: wd3.b0 */
public class C78550b0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C65953v0 f230088d;

    /* renamed from: e */
    public final /* synthetic */ View f230089e;

    /* renamed from: f */
    public final /* synthetic */ C76901s0 f230090f;

    public C78550b0(C65953v0 v0Var, View view, C76901s0 s0Var) {
        this.f230088d = v0Var;
        this.f230089e = view;
        this.f230090f = s0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65953v0 v0Var = this.f230088d;
        if (v0Var != null) {
            v0Var.mo23a(true, C78575u.m94932a(this.f230089e), C78575u.m94933b(this.f230089e));
        }
        this.f230090f.dismiss();
        this.f230090f.setFocusable(false);
        this.f230090f.setTouchable(false);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
