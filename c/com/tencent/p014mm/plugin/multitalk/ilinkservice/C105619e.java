package com.tencent.p014mm.plugin.multitalk.ilinkservice;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.e */
public class C105619e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105689s f314094d;

    /* renamed from: e */
    public final /* synthetic */ C105608d f314095e;

    public C105619e(C105608d dVar, C105689s sVar) {
        this.f314095e = dVar;
        this.f314094d = sVar;
    }

    public void run() {
        C105608d dVar = this.f314095e;
        if (dVar.f314075a != null) {
            this.f314095e.f314075a.mo150628E(dVar.mo150488a(this.f314094d));
        }
    }
}
