package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.p026ui.C84524e3;
import com.tencent.p014mm.plugin.appbrand.performance.C83999e;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.c3 */
public class C84501c3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f246618d;

    /* renamed from: e */
    public final /* synthetic */ String f246619e;

    /* renamed from: f */
    public final /* synthetic */ C84524e3 f246620f;

    public C84501c3(C84524e3 e3Var, int i, String str) {
        this.f246620f = e3Var;
        this.f246618d = i;
        this.f246619e = str;
    }

    public void run() {
        C84524e3 e3Var = this.f246620f;
        int i = this.f246618d;
        String str = this.f246619e;
        e3Var.getClass();
        Integer num = C83999e.f245240b.get(i);
        if (num == null) {
            Log.m105921e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceData no such performance type: %d", Integer.valueOf(i));
            return;
        }
        String string = e3Var.getContext().getString(num.intValue());
        C84524e3.C84525b bVar = e3Var.f246669g.get(i);
        if (bVar == null) {
            bVar = new C84524e3.C84525b(e3Var, e3Var.getContext());
            bVar.f246671d = string;
            bVar.mo117211a();
            int i2 = (i / 100) - 1;
            if (i2 >= 4) {
                Log.m105920e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceLabelView group index is invalid.");
                bVar = null;
            } else {
                if (i2 == 3) {
                    e3Var.addView(bVar);
                } else {
                    e3Var.addView(bVar, e3Var.indexOfChild(e3Var.f246667e[i2 + 1]));
                }
                e3Var.f246669g.put(i, bVar);
            }
        }
        if (bVar == null) {
            Log.m105920e("MicroMsg.AppBrandUIPerformancePanel", "insertPerformanceData label view is null.");
            return;
        }
        bVar.f246672e = str;
        bVar.mo117211a();
    }
}
