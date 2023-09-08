package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l0 */
public class C105158l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105181w f312265d;

    public C105158l0(C105181w wVar) {
        this.f312265d = wVar;
    }

    public void run() {
        C105181w wVar = this.f312265d;
        if (!wVar.f312359T) {
            wVar.f312359T = true;
            MultiProcessMMKV.getMMKV("" + this.f312265d.f312383p + "_wxa_voip").putBoolean("isCameraStart", this.f312265d.f312359T);
            C105181w wVar2 = this.f312265d;
            C105172s.f312297c.SwitchAV(wVar2.f312357S ? 1 : 0, wVar2.f312359T ? 1 : 0, 0);
        }
    }
}
