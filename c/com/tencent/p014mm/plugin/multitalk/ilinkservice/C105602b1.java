package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.b1 */
public class C105602b1 implements C105703u.C105704a<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C105598b f314066a;

    /* renamed from: b */
    public final /* synthetic */ C105724z f314067b;

    public C105602b1(C105724z zVar, C105598b bVar) {
        this.f314067b = zVar;
        this.f314066a = bVar;
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
        this.f314067b.mo150604n();
        C105724z zVar = this.f314067b;
        C105598b bVar = this.f314066a;
        zVar.mo150601k(bVar, -10086, -6, "join room talk callback failed: " + i, (byte[]) null);
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return false;
    }
}
