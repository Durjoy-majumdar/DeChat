package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C49918iz;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.a1 */
public class C105596a1 implements C105703u.C105704a<C49918iz, String> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314055a;

    public C105596a1(C105724z zVar) {
        this.f314055a = zVar;
    }

    /* renamed from: a */
    public Object mo150478a(byte[] bArr) {
        C49918iz izVar = new C49918iz();
        try {
            izVar.parseFrom(bArr);
            return izVar;
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e, "hy: unable to parse from data", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public byte[] mo150479b(Object obj) {
        String str = (String) obj;
        return new byte[0];
    }

    /* renamed from: c */
    public Object mo150480c(int i, Object obj) {
        this.f314055a.mo150614x(new C105744z0(this, (C49918iz) obj));
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return false;
    }
}
