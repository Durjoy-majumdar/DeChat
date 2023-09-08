package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$d */
public class t1$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245036d;

    public t1$$d(C83928t1 t1Var) {
        this.f245036d = t1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C83928t1 t1Var = this.f245036d;
        t1Var.mo116181i1(t1Var.mo116154I0(), (Runnable) null, (Runnable) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
