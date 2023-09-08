package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.o0 */
public class C105670o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314189d;

    /* renamed from: e */
    public final /* synthetic */ C105675p0 f314190e;

    public C105670o0(C105675p0 p0Var, int i) {
        this.f314190e = p0Var;
        this.f314189d = i;
    }

    public void run() {
        C30282x xVar = C30282x.INSTANCE;
        Log.m105924i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: start listen to network change");
        xVar.mo57266a(0);
        C105724z zVar = this.f314190e.f314220b;
        zVar.f314373W = true;
        zVar.f314375X = false;
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "init engine success");
        C105724z zVar2 = this.f314190e.f314220b;
        zVar2.f314386e.mo150568c(1, zVar2.f314353H);
        C105598b bVar = this.f314190e.f314219a;
        if (bVar != null) {
            bVar.mo150477a(0, this.f314189d, (String) null, null);
        }
    }
}
