package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.c1 */
public class C105606c1 implements C105703u.C105704a<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314072a;

    public C105606c1(C105724z zVar) {
        this.f314072a = zVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
        return "";
    }

    /* renamed from: b */
    public byte[] mo150479b(Object obj) {
        String str = (String) obj;
        return new byte[0];
    }

    /* renamed from: c */
    public Object mo150480c(int i, Object obj) {
        String str = (String) obj;
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "accept call timeout");
        C105724z zVar = this.f314072a;
        C105608d dVar = zVar.f314406p0;
        C105689s sVar = zVar.f314388f;
        dVar.getClass();
        MMHandlerThread.postToMainThread(new C105604c(dVar, sVar));
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return false;
    }
}
