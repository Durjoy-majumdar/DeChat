package com.tencent.p014mm.plugin.multitalk.ilinkservice;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.f */
public class C105624f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105689s f314101d;

    /* renamed from: e */
    public final /* synthetic */ C105608d f314102e;

    public C105624f(C105608d dVar, C105689s sVar) {
        this.f314102e = dVar;
        this.f314101d = sVar;
    }

    public void run() {
        C105608d dVar = this.f314102e;
        if (dVar.f314075a != null) {
            this.f314102e.f314075a.mo150633J(dVar.mo150488a(this.f314101d));
        }
    }
}
