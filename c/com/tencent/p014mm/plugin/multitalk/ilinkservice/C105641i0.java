package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C64718sz;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.i0 */
public class C105641i0 implements C105703u.C105704a<C64718sz, String> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314132a;

    public C105641i0(C105724z zVar) {
        this.f314132a = zVar;
    }

    /* renamed from: a */
    public Object mo150478a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
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
        this.f314132a.mo150614x(new C105633h0(this, (C64718sz) obj));
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return false;
    }
}
