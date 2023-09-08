package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.report.d0 */
public final class C84110d0 {

    /* renamed from: a */
    public boolean f245576a;

    /* renamed from: b */
    public boolean f245577b;

    /* renamed from: c */
    public boolean f245578c;

    /* renamed from: a */
    public final void mo116783a(int i) {
        C115669n.INSTANCE.mo175911u(1520, i);
        Log.m105924i("HalfScreenReporter", "[report] key=" + i);
    }

    /* renamed from: b */
    public final void mo116784b(AppBrandInitConfigWC appBrandInitConfigWC, boolean z) {
        C80247h hVar = C80247h.PRE_RENDER;
        C87412m.m108594g(appBrandInitConfigWC, "newConfig");
        if (appBrandInitConfigWC.f234815R0.mo76931c()) {
            mo116783a(1);
            if (appBrandInitConfigWC.f234829Y0 != hVar) {
                mo116783a(6);
                if (this.f245576a) {
                    mo116783a(8);
                }
                if (!this.f245578c) {
                    mo116783a(7);
                    if (this.f245576a) {
                        mo116783a(9);
                    }
                    this.f245578c = true;
                }
            }
        }
        if (z) {
            mo116783a(4);
        }
        if (!(this.f245577b == appBrandInitConfigWC.f234815R0.mo76931c() || appBrandInitConfigWC.f234829Y0 == hVar)) {
            if (appBrandInitConfigWC.f234815R0.mo76931c()) {
                mo116783a(3);
            } else {
                mo116783a(2);
            }
        }
        if (appBrandInitConfigWC.f234829Y0 != hVar) {
            this.f245577b = appBrandInitConfigWC.f234815R0.mo76931c();
        }
    }
}
