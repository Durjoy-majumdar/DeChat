package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.k2 */
public class C105652k2 implements C105703u.C105704a<String, String> {

    /* renamed from: a */
    public final /* synthetic */ C105724z f314146a;

    public C105652k2(C105724z zVar) {
        this.f314146a = zVar;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
        return "";
    }

    /* renamed from: b */
    public byte[] mo150479b(Object obj) {
        String str = (String) obj;
        return new byte[0];
    }

    /* renamed from: c */
    public Object mo150480c(int i, Object obj) {
        String str = (String) obj;
        this.f314146a.mo150604n();
        C105724z zVar = this.f314146a;
        zVar.mo150602l((C105598b<ArrayList<C105683r>>) null, -10086, -6, "join room talk callback failed: " + i);
        return "";
    }

    /* renamed from: d */
    public boolean mo150481d() {
        return false;
    }
}
