package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C64433hz;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d0 */
public class C105133d0 implements C105169q.C105170a<C64433hz, String> {

    /* renamed from: a */
    public final /* synthetic */ C105181w f312157a;

    public C105133d0(C105181w wVar) {
        this.f312157a = wVar;
    }

    /* renamed from: a */
    public Object mo118176a(byte[] bArr) {
        C64433hz hzVar = new C64433hz();
        try {
            hzVar.parseFrom(bArr);
            return hzVar;
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
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: on avmembers changed errCode: " + i);
        this.f312157a.mo149500g(new C105131c0(this, (C64433hz) obj, i));
        return "";
    }

    /* renamed from: d */
    public boolean mo118179d() {
        return true;
    }
}
