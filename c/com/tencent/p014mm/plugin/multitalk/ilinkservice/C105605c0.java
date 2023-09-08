package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105612d0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.c0 */
public class C105605c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105612d0.C105613a f314071d;

    public C105605c0(C105612d0.C105613a aVar) {
        this.f314071d = aVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "ack succ, enter view");
        C105724z zVar = C105612d0.this.f314086e.f314109a;
        zVar.f314386e.mo150568c(12, zVar.f314359N);
        C105724z zVar2 = C105612d0.this.f314086e.f314109a;
        zVar2.f314386e.mo150568c(13, zVar2.f314360P);
        C105724z zVar3 = C105612d0.this.f314086e.f314109a;
        C105608d dVar = zVar3.f314406p0;
        dVar.f314075a.mo150632I(dVar.mo150488a(zVar3.f314388f));
        C105612d0.this.f314086e.f314109a.f314401n = 3;
    }
}
