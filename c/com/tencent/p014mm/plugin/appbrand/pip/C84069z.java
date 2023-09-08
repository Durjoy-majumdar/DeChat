package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.utils.C84790v1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.z */
public class C84069z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84059t f245451d;

    public C84069z(C84059t tVar) {
        this.f245451d = tVar;
    }

    public void run() {
        Log.m105924i(this.f245451d.f245415a, "transferTo, run pendingCancelableShowTask");
        C84059t tVar = this.f245451d;
        C84790v1 v1Var = tVar.f245437w;
        if (v1Var == null) {
            Log.m105924i(tVar.f245415a, "transferTo, pendingCancelableShowTask is null");
            return;
        }
        v1Var.mo117505a();
        if (!(this.f245451d.f245437w.f247219g.get() <= 0)) {
            C84059t tVar2 = this.f245451d;
            Runnable runnable = tVar2.f245437w.f247217e;
            if (runnable != null) {
                Log.m105924i(tVar2.f245415a, "transferTo, run extraTask");
                runnable.run();
            }
        }
        this.f245451d.f245437w = null;
    }
}
