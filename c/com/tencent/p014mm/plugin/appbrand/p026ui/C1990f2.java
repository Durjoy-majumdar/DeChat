package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.f2 */
public class C1990f2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f11914d;

    public C1990f2(AppBrandProfileUI appBrandProfileUI) {
        this.f11914d = appBrandProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppBrandProfileUI.m104015H7(this.f11914d, 32);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
