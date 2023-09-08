package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import com.tencent.p014mm.plugin.appbrand.page.m0$$d0;
import com.tencent.p014mm.plugin.appbrand.pip.C84021a;
import com.tencent.p014mm.sdk.platformtools.Log;
import hm0.C87564i;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.i */
public class C84044i extends C83231l.C83234d {

    /* renamed from: d */
    public final /* synthetic */ C84059t f245392d;

    public C84044i(C84059t tVar) {
        this.f245392d = tVar;
    }

    /* renamed from: c */
    public void mo109497c() {
        C87564i iVar;
        Log.m105924i(this.f245392d.f245415a, "onDestroy");
        C84021a.C84024c cVar = this.f245392d.f245429o;
        if (!(cVar == null || (iVar = cVar.f245308g) == null)) {
            iVar.release();
        }
        this.f245392d.f245418d.setPipPageLifeCycleListener((m0$$d0) null);
        C83231l.m102144e(this.f245392d.f245417c.f238147j, this);
    }

    /* renamed from: e */
    public void mo74049e(C83231l.C83235e eVar) {
        String str = this.f245392d.f245415a;
        Log.m105924i(str, "onPause, type: " + eVar);
        this.f245392d.f245414C = true;
        C84059t tVar = this.f245392d;
        if (tVar.f245432r) {
            Log.m105924i(tVar.f245415a, "pipVideo has stopped, skip");
        } else if (tVar.f245429o != null) {
            if (tVar.f245426l != null) {
                tVar.mo116707a("onPause");
            }
            C87564i iVar = this.f245392d.f245429o.f245308g;
            if (iVar == null) {
                return;
            }
            if (iVar.mo110196i()) {
                Log.m105924i(this.f245392d.f245415a, "background play enabled, skip");
                return;
            }
            C82732k0 k = iVar.mo110199k();
            Log.m105925i(this.f245392d.f245415a, "onPause, autoPauseStrategy: %s", k);
            if (!k.mo114992a(this.f245392d.f245417c.mo113047b0(), eVar)) {
                Log.m105924i(this.f245392d.f245415a, "onPause, not need pause video play");
                return;
            }
            Log.m105924i(this.f245392d.f245415a, "onPause, pause");
            iVar.pause();
        }
    }

    /* renamed from: f */
    public void mo109498f() {
        Log.m105924i(this.f245392d.f245415a, "onResume");
        this.f245392d.f245414C = false;
        C84059t tVar = this.f245392d;
        if (tVar.f245432r) {
            Log.m105924i(tVar.f245415a, "pipVideo has stopped, skip");
        } else if (tVar.f245429o != null) {
            if (tVar.f245426l != null) {
                C84059t.m103573b(tVar, "onResume");
            }
            C87564i iVar = this.f245392d.f245429o.f245308g;
            if (iVar == null) {
                return;
            }
            if (iVar.mo110196i()) {
                Log.m105924i(this.f245392d.f245415a, "background play enabled, skip");
                return;
            }
            Log.m105924i(this.f245392d.f245415a, "onResume, start");
            iVar.start();
        }
    }
}
