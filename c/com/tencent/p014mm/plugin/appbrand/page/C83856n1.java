package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.n1 */
public class C83856n1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f244838d;

    public C83856n1(C83780d1 d1Var) {
        this.f244838d = d1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C83231l.m102146g(this.f244838d.getAppId(), C83231l.C83235e.CLOSE);
        this.f244838d.f244549A.mo113063k();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
