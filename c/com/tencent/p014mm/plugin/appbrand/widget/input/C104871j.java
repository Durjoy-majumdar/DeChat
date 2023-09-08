package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.j */
public class C104871j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104873k f311413d;

    public C104871j(C104873k kVar) {
        this.f311413d = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104930w0 w0Var = this.f311413d.f311430q;
        if (w0Var == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (w0Var.hasFocus()) {
            this.f311413d.mo148830B();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            C104873k kVar = this.f311413d;
            if (kVar.f311430q == view) {
                kVar.mo148834l();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputInvokeHandler$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
