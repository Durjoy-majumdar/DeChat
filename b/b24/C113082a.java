package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.a */
public class C113082a extends C113107m0 {
    public C113082a() {
        this.f338498e = 256;
    }

    /* renamed from: i */
    public byte[] mo165616i(long j, long j2, int i, int i2) {
        byte[] bArr = new byte[22];
        C117790util.m166193o(bArr, 0, 1);
        C117790util.m166194p(bArr, 2, 5);
        C117790util.m166194p(bArr, 6, (int) j);
        C117790util.m166194p(bArr, 10, (int) j2);
        C117790util.m166194p(bArr, 14, i);
        C117790util.m166194p(bArr, 18, i2);
        mo165627b(this.f338498e);
        mo165626a(bArr, 22);
        mo165632g();
        return mo165628c();
    }
}
