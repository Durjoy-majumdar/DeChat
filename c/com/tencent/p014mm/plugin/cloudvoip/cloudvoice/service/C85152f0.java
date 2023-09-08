package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f0 */
public class C85152f0 implements C105169q.C105170a<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C105181w f248104a;

    public C85152f0(C105181w wVar) {
        this.f248104a = wVar;
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
        Log.m105929w("MicroMsg.OpenVoice.OpenVoiceService", "hy: call broken! %d, %s", Integer.valueOf(i), (String) obj);
        this.f248104a.mo149500g(new C85151e0(this));
        return "";
    }

    /* renamed from: d */
    public boolean mo118179d() {
        return false;
    }
}
