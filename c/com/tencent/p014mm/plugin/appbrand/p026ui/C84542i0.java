package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.i0 */
public class C84542i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84552k0 f246705d;

    public C84542i0(C84552k0 k0Var) {
        this.f246705d = k0Var;
    }

    public void run() {
        this.f246705d.f246734P = true;
        Log.m105924i("MicroMsg.AppBrandGameUILoadingSplash", "mCustomSplashScreenDelayTimeEnd");
        C84552k0 k0Var = this.f246705d;
        if (k0Var.f246733N) {
            C84552k0.m104137U(k0Var);
        }
    }
}
