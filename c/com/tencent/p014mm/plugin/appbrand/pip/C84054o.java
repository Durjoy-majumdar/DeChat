package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.pip.C84021a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.o */
public class C84054o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f245405d;

    /* renamed from: e */
    public final /* synthetic */ C84048m f245406e;

    public C84054o(C84048m mVar, boolean z) {
        this.f245406e = mVar;
        this.f245405d = z;
    }

    public void run() {
        C84021a.C84024c cVar;
        if (this.f245406e.f245397a.mo116714l(false)) {
            C84059t tVar = this.f245406e.f245397a;
            C84036e eVar = tVar.f245413B;
            if (!(eVar == null || (cVar = tVar.f245429o) == null)) {
                ((C84025a0) eVar).mo116680b(cVar.f245309h, this.f245405d ? C84043h.OTHER_VIDEO_AUTO_PLAY : C84043h.OTHER_VIDEO_PLAY);
            }
            this.f245406e.f245397a.mo116707a("processTransferFromOnPlay");
            Log.m105924i(this.f245406e.f245397a.f245415a, "processTransferFromOnPlay, clearPipVideoRelated");
            this.f245406e.f245397a.mo116709f(true, true);
        }
    }
}
