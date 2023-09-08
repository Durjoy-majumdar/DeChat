package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gu0.C87386b;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$n */
public class AppBrandRuntimeWC$$n implements C81925i2.C81930e {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntimeWC f238331a;

    /* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$n$a */
    public class C81094a implements C84253s4 {
        public C81094a() {
        }
    }

    public AppBrandRuntimeWC$$n(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238331a = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public void mo113226a(C84073q2 q2Var) {
        Log.m105924i("MicroMsg.AppBrandRuntimeWC", "WorkerContainer had installed. watchAdWorkerCreate");
        C81546b bVar = this.f238331a.f238295w1;
        bVar.getClass();
        synchronized (q2Var.f245482g) {
            C87386b bVar2 = q2Var.f245481f;
            if (bVar2.f253237b != null) {
                bVar.mo113814c(bVar2);
            }
            q2Var.f245482g.add(bVar);
        }
        this.f238331a.f238295w1.f239169i = new C81094a();
    }
}
