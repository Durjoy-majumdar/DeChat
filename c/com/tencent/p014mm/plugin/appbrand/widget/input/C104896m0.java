package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104901n0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.m0 */
public class C104896m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104901n0 f311467d;

    public C104896m0(C104901n0 n0Var) {
        this.f311467d = n0Var;
    }

    public void onClick(View view) {
        C104901n0.C104902a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104901n0 n0Var = this.f311467d;
        int i = C104901n0.f311479o;
        if (!n0Var.f311481e && (aVar = n0Var.f311482f) != null) {
            n0Var.f311481e = true;
            aVar.onDone();
            n0Var.f311481e = false;
        }
        this.f311467d.setVisibility(8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
