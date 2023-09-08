package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import ym0.C91516n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.o3 */
public class C82866o3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f242311d;

    public C82866o3(JsApiLaunchApplicationDirectly jsApiLaunchApplicationDirectly, C81925i2 i2Var) {
        this.f242311d = i2Var;
    }

    public void run() {
        C81925i2 i2Var = this.f242311d;
        if (i2Var != null && C91516n.m114822a(i2Var.getAppId()) && this.f242311d.getContext() != null && (this.f242311d.getContext() instanceof Activity)) {
            C84545i3.m104130g(((Activity) this.f242311d.getContext()).getWindow(), true, false);
        }
    }
}
