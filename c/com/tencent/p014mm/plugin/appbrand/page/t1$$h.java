package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$h */
public class t1$$h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245039d;

    public t1$$h(C83928t1 t1Var) {
        this.f245039d = t1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C84240s.m103840f(this.f245039d.getAppId(), this.f245039d.mo116162Q0(), 22, "", Util.nowSecond(), 1, 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
