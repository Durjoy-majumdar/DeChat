package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C51176rz;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.g0 */
public class C105629g0 implements C105703u.C105704a<C51176rz, String> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314109a;

    public C105629g0(C105724z zVar) {
        this.f314109a = zVar;
    }

    /* renamed from: a */
    public Object mo150478a(byte[] bArr) {
        C51176rz rzVar = new C51176rz();
        try {
            rzVar.parseFrom(bArr);
            return rzVar;
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
        this.f314109a.mo150614x(new C105612d0(this, (C51176rz) obj));
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return false;
    }
}
