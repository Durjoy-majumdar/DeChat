package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$e */
public class t1$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245037d;

    public t1$$e(C83928t1 t1Var) {
        this.f245037d = t1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C83231l.m102146g(this.f245037d.getAppId(), C83231l.C83235e.CLOSE);
        this.f245037d.f245017a1.mo113063k();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
