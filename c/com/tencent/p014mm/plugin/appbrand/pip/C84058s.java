package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.s */
public class C84058s implements C82724i0.C29521a {

    /* renamed from: a */
    public final /* synthetic */ C84059t f245411a;

    public C84058s(C84059t tVar) {
        this.f245411a = tVar;
    }

    /* renamed from: a */
    public final boolean mo116706a() {
        if (this.f245411a.f245414C) {
            Log.m105924i(this.f245411a.f245415a, "interceptAudioFocusChange, runtime paused");
            return true;
        }
        C84059t tVar = this.f245411a;
        if (tVar.f245429o == null) {
            Log.m105918d(tVar.f245415a, "interceptAudioFocusChange, mPipVideoSession is null");
            return true;
        } else if (tVar.f245426l != null && (!tVar.f245434t || !tVar.f245435u)) {
            return false;
        } else {
            Log.m105918d(tVar.f245415a, "interceptAudioFocusChange, mPipVideoRelatedKey is null or is transfering from");
            return true;
        }
    }

    public void onPause() {
        Log.m105924i(this.f245411a.f245415a, "onPause");
        if (!mo116706a()) {
            this.f245411a.f245429o.f245308g.pause();
        }
    }

    public void onResume() {
        Log.m105924i(this.f245411a.f245415a, "onResume");
        if (!mo116706a()) {
            this.f245411a.f245429o.f245308g.start();
        }
    }

    public void onStop() {
        Log.m105924i(this.f245411a.f245415a, "onStop");
        if (!mo116706a()) {
            this.f245411a.f245429o.f245308g.pause();
        }
    }
}
