package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.v0 */
public class C105180v0 implements C105169q.C105170a<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C105181w f312333a;

    public C105180v0(C105181w wVar) {
        this.f312333a = wVar;
    }

    /* renamed from: a */
    public Object mo118176a(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new String(bArr);
    }

    /* renamed from: b */
    public byte[] mo118177b(Object obj) {
        String str = (String) obj;
        return new byte[0];
    }

    /* renamed from: c */
    public Object mo118178c(int i, Object obj) {
        String str = (String) obj;
        Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: session key expired!! reset session key");
        this.f312333a.mo149500g(new C105177u0(this));
        return "";
    }

    /* renamed from: d */
    public boolean mo118179d() {
        return true;
    }
}
