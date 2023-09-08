package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.m0 */
public class C105160m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105181w f312273d;

    public C105160m0(C105181w wVar) {
        this.f312273d = wVar;
    }

    public void run() {
        C105181w wVar = this.f312273d;
        if (wVar.f312359T) {
            wVar.f312359T = false;
            MultiProcessMMKV.getMMKV("" + this.f312273d.f312383p + "_wxa_voip").putBoolean("isCameraStart", this.f312273d.f312359T);
            C105181w wVar2 = this.f312273d;
            C105172s.f312297c.SwitchAV(wVar2.f312357S ? 1 : 0, wVar2.f312359T ? 1 : 0, 0);
        }
    }
}
