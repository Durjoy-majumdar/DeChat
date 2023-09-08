package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x0 */
public class C105187x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105189y0 f312411d;

    public C105187x0(C105189y0 y0Var) {
        this.f312411d = y0Var;
    }

    public void run() {
        C105189y0 y0Var = this.f312411d;
        C105181w wVar = y0Var.f312415b;
        if (wVar.f312381n == C105181w.C85161i.NotInRoom) {
            wVar.f312381n = C105181w.C85161i.SdkInRoom;
        }
        wVar.f312364V0 = true;
        wVar.mo149506m(y0Var.f312414a);
    }
}
