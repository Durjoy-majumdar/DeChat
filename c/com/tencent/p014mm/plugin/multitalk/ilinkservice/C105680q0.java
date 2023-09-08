package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.q0 */
public class C105680q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314230d;

    /* renamed from: e */
    public final /* synthetic */ C105684r0 f314231e;

    public C105680q0(C105684r0 r0Var, int i) {
        this.f314231e = r0Var;
        this.f314230d = i;
    }

    public void run() {
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "init engine fail %d", Integer.valueOf(this.f314230d));
        C105724z zVar = this.f314231e.f314244b;
        zVar.f314375X = false;
        zVar.f314377Y = true;
        zVar.mo150589E();
        C105724z zVar2 = this.f314231e.f314244b;
        zVar2.f314386e.mo150568c(2, zVar2.f314354I);
        C105598b bVar = this.f314231e.f314243a;
        if (bVar != null) {
            bVar.mo150477a(0, this.f314230d, (String) null, null);
        }
    }
}
