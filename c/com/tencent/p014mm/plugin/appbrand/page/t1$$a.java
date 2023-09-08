package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84213o;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84223s;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$a */
public final /* synthetic */ class t1$$a implements C82531i.C82533b {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245032d;

    public /* synthetic */ t1$$a(C83928t1 t1Var) {
        this.f245032d = t1Var;
    }

    /* renamed from: b */
    public final void mo22089b() {
        C84223s T1;
        C83928t1 t1Var = this.f245032d;
        C84213o N1 = t1Var.mo116526N1(false);
        if (N1 == null) {
            return;
        }
        if ((N1.f245965b || N1.f245966c) && !N1.f245967d && (T1 = t1Var.getRuntime().mo113189T1()) != null) {
            try {
                if (T1.f246013b) {
                    if (!T1.mo116910c(t1Var)) {
                        T1.mo116909b(t1Var, C84213o.C84214a.kPageLeave, 0);
                    }
                }
            } finally {
                N1.f245967d = true;
            }
        }
    }
}
