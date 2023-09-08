package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105169q;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C49918iz;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y */
public class C105188y implements C105169q.C105170a<C49918iz, String> {

    /* renamed from: a */
    public final /* synthetic */ C85147b f312412a;

    /* renamed from: b */
    public final /* synthetic */ C105181w f312413b;

    public C105188y(C105181w wVar, C85147b bVar) {
        this.f312413b = wVar;
        this.f312412a = bVar;
    }

    /* renamed from: a */
    public Object mo118176a(byte[] bArr) {
        C49918iz izVar = new C49918iz();
        try {
            izVar.parseFrom(bArr);
            return izVar;
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
        this.f312413b.mo149500g(new C105186x(this, (C49918iz) obj));
        return "";
    }

    /* renamed from: d */
    public boolean mo118179d() {
        return false;
    }
}
