package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C64670qz;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b0 */
public class C105129b0 implements C105169q.C105170a<C64670qz, String> {

    /* renamed from: a */
    public final /* synthetic */ C105181w f312150a;

    public C105129b0(C105181w wVar) {
        this.f312150a = wVar;
    }

    /* renamed from: a */
    public Object mo118176a(byte[] bArr) {
        C64670qz qzVar = new C64670qz();
        try {
            qzVar.parseFrom(bArr);
            return qzVar;
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceService", e, "hy: unable to parse from data", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public byte[] mo118177b(Object obj) {
        String str = (String) obj;
        return new byte[0];
    }

    /* renamed from: c */
    public Object mo118178c(int i, Object obj) {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: on member changed");
        this.f312150a.mo149500g(new C105127a0(this, (C64670qz) obj, i));
        return "";
    }

    /* renamed from: d */
    public boolean mo118179d() {
        return true;
    }
}
