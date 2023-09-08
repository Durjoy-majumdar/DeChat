package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.LinkedList;
import te3.C50612nz;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.w0 */
public class C105715w0 implements C105703u.C105704a<C50612nz, String> {

    /* renamed from: a */
    public final /* synthetic */ LinkedList f314303a;

    /* renamed from: b */
    public final /* synthetic */ C105598b f314304b;

    /* renamed from: c */
    public final /* synthetic */ C105724z f314305c;

    public C105715w0(C105724z zVar, LinkedList linkedList, C105598b bVar) {
        this.f314305c = zVar;
        this.f314303a = linkedList;
        this.f314304b = bVar;
    }

    /* renamed from: a */
    public Object mo150478a(byte[] bArr) {
        C50612nz nzVar = new C50612nz();
        try {
            nzVar.parseFrom(bArr);
            return nzVar;
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
        this.f314305c.mo150614x(new C105710v0(this, (C50612nz) obj));
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return false;
    }
}
