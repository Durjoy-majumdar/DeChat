package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105612d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.f0 */
public class C105625f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105612d0.C105615c f314103d;

    public C105625f0(C105612d0.C105615c cVar) {
        this.f314103d = cVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "mRecvInviteOtherDevice notify, dismiss view");
        C105724z zVar = C105612d0.this.f314086e.f314109a;
        zVar.f314386e.mo150568c(12, zVar.f314359N);
        C105724z zVar2 = C105612d0.this.f314086e.f314109a;
        zVar2.f314386e.mo150568c(13, zVar2.f314360P);
        C105724z zVar3 = C105612d0.this.f314086e.f314109a;
        zVar3.f314386e.mo150568c(17, zVar3.f314369U);
        C105612d0.this.f314086e.f314109a.mo150603m();
        C105724z zVar4 = C105612d0.this.f314086e.f314109a;
        zVar4.f314401n = 0;
        zVar4.f314371V = false;
        C105608d dVar = zVar4.f314406p0;
        String str = zVar4.f314366S0;
        dVar.getClass();
        MMHandlerThread.postToMainThread(new C105645j(dVar, str));
    }
}
