package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z */
public class C105190z implements C105169q.C105170a<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C85147b f312416a;

    /* renamed from: b */
    public final /* synthetic */ C105181w f312417b;

    public C105190z(C105181w wVar, C85147b bVar) {
        this.f312417b = wVar;
        this.f312416a = bVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo118176a(byte[] bArr) {
        return "";
    }

    /* renamed from: b */
    public byte[] mo118177b(Object obj) {
        String str = (String) obj;
        return new byte[0];
    }

    /* renamed from: c */
    public Object mo118178c(int i, Object obj) {
        String str = (String) obj;
        C105181w wVar = this.f312417b;
        wVar.f312362U0 = false;
        wVar.f312364V0 = false;
        wVar.f312366W0 = false;
        C85147b bVar = this.f312416a;
        wVar.mo149497c(bVar, -10086, -6, "join room talk callback failed: " + i);
        return "";
    }

    /* renamed from: d */
    public boolean mo118179d() {
        return false;
    }
}
