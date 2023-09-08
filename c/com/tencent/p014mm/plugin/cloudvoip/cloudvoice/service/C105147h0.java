package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import a43.C103310i;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C110966jz;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.h0 */
public class C105147h0 implements C105169q.C105170a<String, C110966jz> {

    /* renamed from: a */
    public final /* synthetic */ C105181w f312197a;

    public C105147h0(C105181w wVar) {
        this.f312197a = wVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo118176a(byte[] bArr) {
        return null;
    }

    /* renamed from: b */
    public byte[] mo118177b(Object obj) {
        C110966jz jzVar = (C110966jz) obj;
        if (jzVar != null) {
            try {
                return jzVar.toByteArray();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceService", e, "hy: error when convert to byte array", new Object[0]);
            }
        }
        return new byte[0];
    }

    /* renamed from: c */
    public Object mo118178c(int i, Object obj) {
        String str = (String) obj;
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "onResult");
        if (this.f312197a.f312351N) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "call end, stop ring");
            C103310i iVar = this.f312197a.f312379i;
            if (iVar != null) {
                iVar.mo143090f();
            }
        }
        C105179v.f312327d = this.f312197a.f312377g.f312174a.f312216c.mo161473O();
        C105141g gVar = this.f312197a.f312377g;
        int i2 = 0;
        C105179v.f312328e = gVar.f312175b == null ? 0 : gVar.f312175b.f330226e;
        C106336d dVar = this.f312197a.f312377g.f312174a.f312216c.f327637m;
        int i3 = -1;
        C105179v.f312329f = dVar != null ? dVar.mo152548g() : -1;
        C105141g gVar2 = this.f312197a.f312377g;
        C105179v.f312330g = gVar2.f312174a.f312216c.f327636l ? 1 : 0;
        if (gVar2.f312175b != null) {
            i2 = gVar2.f312175b.mo161897b();
        }
        C105179v.f312331h = i2;
        C106336d dVar2 = this.f312197a.f312377g.f312174a.f312216c.f327637m;
        if (dVar2 != null) {
            i3 = dVar2.mo152550i();
        }
        C105179v.f312332i = i3;
        C110966jz jzVar = new C110966jz();
        jzVar.f332114d = C105179v.f312324a;
        jzVar.f332116f = C105179v.f312325b;
        jzVar.f332117g = C105179v.f312326c;
        jzVar.f332125r = C105179v.f312331h;
        jzVar.f332124q = C105179v.f312330g;
        jzVar.f332120j = C105179v.f312328e;
        jzVar.f332118h = C105179v.f312327d;
        jzVar.f332121n = C105179v.f312329f;
        jzVar.f332126s = C105179v.f312332i;
        this.f312197a.mo149500g(new C105143g0(this, i));
        return jzVar;
    }

    /* renamed from: d */
    public boolean mo118179d() {
        return true;
    }
}
