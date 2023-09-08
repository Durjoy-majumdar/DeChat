package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$c */
public class AppBrandMenuHeader$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83897r f244392d;

    /* renamed from: e */
    public final /* synthetic */ C83928t1 f244393e;

    public AppBrandMenuHeader$$c(AppBrandMenuHeader appBrandMenuHeader, C83897r rVar, C83928t1 t1Var) {
        this.f244392d = rVar;
        this.f244393e = t1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C83897r rVar = this.f244392d;
        C83928t1 t1Var = this.f244393e;
        rVar.getClass();
        new C83908s(rVar, t1Var).run();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
