package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.u0 */
public class C105705u0 implements C105703u.C105704a<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314288a;

    public C105705u0(C105724z zVar) {
        this.f314288a = zVar;
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
        Log.m105928w("MicroMsg.Multitalk.ILinkService", "hy: session key expired!! reset session key");
        this.f314288a.mo150614x(new C105699t0(this));
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return true;
    }
}
