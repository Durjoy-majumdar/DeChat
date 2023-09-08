package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83930t3;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;

/* renamed from: com.tencent.mm.plugin.appbrand.page.v3 */
public class C83956v3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83930t3.C83934c f245102d;

    public C83956v3(C83930t3.C83934c cVar) {
        this.f245102d = cVar;
    }

    public void run() {
        C83226n.m102128e(C83930t3.this.mo125215b0(), KSProcessWeAppLaunch.stepInjectWAPageFrameHtml);
    }
}
