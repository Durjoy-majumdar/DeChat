package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C83608m4;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$f */
public class t1$$f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245038d;

    public t1$$f(C83928t1 t1Var) {
        this.f245038d = t1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C83928t1 t1Var = this.f245038d;
        C83608m4.m102643b(t1Var.f245017a1, t1Var.mo116163R0());
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
