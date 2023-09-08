package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82549j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87362k;
import p1042u.C90590d;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1$$h */
public class d1$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f244597d;

    public d1$$h(C83780d1 d1Var) {
        this.f244597d = d1Var;
    }

    public void run() {
        if (!this.f244597d.isRunning()) {
            Log.m105921e("MicroMsg.AppBrandPageView", "onInitReady but not running, return, appId[%s] url[%s]", this.f244597d.getAppId(), this.f244597d.mo116162Q0());
            return;
        }
        C87362k kVar = this.f244597d.getRuntime().f238156u;
        ((C90590d) kVar.f253206q).add(this.f244597d.f244580p0);
        if (this.f244597d.mo116158M0() != null) {
            this.f244597d.mo116158M0().mo111238C();
        }
        this.f244597d.mo116186n1();
        C82549j jVar = this.f244597d.f244657w;
        jVar.f241654p.set(true);
        for (C82531i.C82538g onReady : jVar.f241645d) {
            onReady.onReady();
        }
    }
}
