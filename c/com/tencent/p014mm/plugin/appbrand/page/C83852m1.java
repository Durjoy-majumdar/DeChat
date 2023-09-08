package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m1 */
public class C83852m1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f244830d;

    public C83852m1(C83780d1 d1Var) {
        this.f244830d = d1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f244830d.mo116170Y0()) {
            this.f244830d.f244549A.mo113042Z().mo116379y(this.f244830d.f244572U, "scene_actionbar_back");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
