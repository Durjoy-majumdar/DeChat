package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n0 */
public class C105164n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f312276d;

    /* renamed from: e */
    public final /* synthetic */ C105181w f312277e;

    public C105164n0(C105181w wVar, boolean z) {
        this.f312277e = wVar;
        this.f312276d = z;
    }

    public void run() {
        boolean z = !this.f312276d;
        C105181w wVar = this.f312277e;
        if (z != wVar.f312357S) {
            wVar.f312357S = z;
            C105172s.f312297c.SwitchAV(z ? 1 : 0, wVar.f312359T ? 1 : 0, 0);
        }
    }
}
