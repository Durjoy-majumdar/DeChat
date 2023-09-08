package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84213o;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84223s;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$b */
public final /* synthetic */ class t1$$b implements C82531i.C82538g {

    /* renamed from: a */
    public final /* synthetic */ C83928t1 f245033a;

    public /* synthetic */ t1$$b(C83928t1 t1Var) {
        this.f245033a = t1Var;
    }

    public final void onReady() {
        C83928t1 t1Var = this.f245033a;
        C84223s T1 = t1Var.getRuntime().mo113189T1();
        if (T1 != null && T1.f246013b && !T1.mo116910c(t1Var)) {
            T1.mo116909b(t1Var, C84213o.C84214a.kInitReady, t1Var.mo116520A1() != null ? T1.f246016e : T1.f246015d);
        }
    }
}
