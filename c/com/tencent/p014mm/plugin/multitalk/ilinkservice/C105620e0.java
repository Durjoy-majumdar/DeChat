package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105612d0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.e0 */
public class C105620e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105612d0.C105614b f314096d;

    public C105620e0(C105612d0.C105614b bVar) {
        this.f314096d = bVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "recv timeout invite");
        C105724z zVar = C105612d0.this.f314086e.f314109a;
        zVar.f314386e.mo150568c(12, zVar.f314359N);
        C105724z zVar2 = C105612d0.this.f314086e.f314109a;
        zVar2.f314386e.mo150568c(13, zVar2.f314360P);
        C105612d0.this.f314086e.f314109a.mo150603m();
    }
}
