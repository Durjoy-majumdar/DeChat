package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.pip.C84021a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.k */
public class C84046k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84047l f245394d;

    public C84046k(C84047l lVar) {
        this.f245394d = lVar;
    }

    public void run() {
        C84021a.C84024c cVar;
        if (this.f245394d.f245396b.mo116714l(false)) {
            C84059t tVar = this.f245394d.f245396b;
            C84036e eVar = tVar.f245413B;
            if (!(eVar == null || (cVar = tVar.f245429o) == null)) {
                ((C84025a0) eVar).mo116680b(cVar.f245309h, C84043h.OTHER_VIDEO_PLAY);
            }
            this.f245394d.f245396b.mo116707a("onPageSwitchEnd 1");
            Log.m105924i(this.f245394d.f245396b.f245415a, "onPageSwitchEnd, clearPipVideoRelated");
            this.f245394d.f245396b.mo116709f(true, true);
        }
    }
}
