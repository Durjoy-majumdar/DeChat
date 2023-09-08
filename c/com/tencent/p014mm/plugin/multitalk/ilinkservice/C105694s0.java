package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s0 */
public class C105694s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105598b f314267d;

    public C105694s0(C105724z zVar, C105598b bVar) {
        this.f314267d = bVar;
    }

    public void run() {
        C30282x xVar = C30282x.INSTANCE;
        Log.m105924i("MicroMsg.Multitalk.ILinkNetworkMgr", "hy: start listen to network change");
        xVar.mo57266a(0);
        C105598b bVar = this.f314267d;
        if (bVar != null) {
            bVar.mo150477a(0, 0, (String) null, null);
        }
    }
}
