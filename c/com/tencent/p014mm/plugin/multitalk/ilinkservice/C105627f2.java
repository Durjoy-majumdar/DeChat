package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C64718sz;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.f2 */
public class C105627f2 implements C105703u.C105704a<C64718sz, String> {

    /* renamed from: a */
    public final /* synthetic */ String f314105a;

    /* renamed from: b */
    public final /* synthetic */ String f314106b;

    /* renamed from: c */
    public final /* synthetic */ C105724z f314107c;

    public C105627f2(C105724z zVar, String str, String str2) {
        this.f314107c = zVar;
        this.f314105a = str;
        this.f314106b = str2;
    }

    /* renamed from: a */
    public Object mo150478a(byte[] bArr) {
        C64718sz szVar = new C64718sz();
        try {
            szVar.parseFrom(bArr);
            return szVar;
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
        this.f314107c.mo150614x(new C105622e2(this, (C64718sz) obj));
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return false;
    }
}
