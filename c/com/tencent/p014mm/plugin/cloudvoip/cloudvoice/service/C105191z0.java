package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z0 */
public class C105191z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f312418d;

    /* renamed from: e */
    public final /* synthetic */ C105128a1 f312419e;

    public C105191z0(C105128a1 a1Var, int i) {
        this.f312419e = a1Var;
        this.f312418d = i;
    }

    public void run() {
        C105128a1 a1Var = this.f312419e;
        C105181w wVar = a1Var.f312149b;
        C105181w wVar2 = C105181w.INSTANCE;
        wVar.f312362U0 = false;
        wVar.f312364V0 = false;
        wVar.f312366W0 = false;
        C85147b bVar = a1Var.f312148a;
        wVar.mo149497c(bVar, -10086, -5, "join room callback failed: " + this.f312418d);
    }
}
