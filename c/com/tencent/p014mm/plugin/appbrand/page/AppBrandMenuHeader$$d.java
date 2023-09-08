package com.tencent.p014mm.plugin.appbrand.page;

import android.os.Bundle;
import android.view.View;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$d */
public class AppBrandMenuHeader$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f244394d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f244395e;

    public AppBrandMenuHeader$$d(AppBrandMenuHeader appBrandMenuHeader, C83928t1 t1Var, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f244394d = t1Var;
        this.f244395e = appBrandRuntimeWC;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C83845l0 l0Var = this.f244394d.f245023g1;
        if (l0Var != null) {
            l0Var.mo116321e();
        }
        AppBrandSysConfigWC S1 = this.f244394d.getRuntime().mo113213o1();
        WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
        bVar.f239557a = S1.f261062e;
        bVar.f239566j = 3;
        C83928t1 t1Var = this.f244394d;
        bVar.f239567k = t1Var.f244558J == null ? "" : t1Var.mo116162Q0();
        bVar.f239564h = S1.f261072r.f238585d;
        bVar.f239563g = S1.f261072r.pkgVersion;
        AppBrandProfileUI.m104017R7(this.f244394d.getContext(), this.f244395e.mo113210l1().f234839s, 12, "", false, bVar.mo113977a(), (Bundle) null, ActivityStarterIpcDelegate.m893a(this.f244394d.getContext()));
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
