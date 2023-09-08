package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.j0 */
public class C113101j0 extends C113107m0 {
    public C113101j0() {
        this.f338498e = 24;
    }

    /* renamed from: i */
    public byte[] mo165624i(long j, int i, long j2, int i2) {
        byte[] bArr = new byte[22];
        C117790util.m166193o(bArr, 0, 1);
        C117790util.m166194p(bArr, 2, 1536);
        C117790util.m166194p(bArr, 6, (int) j);
        C117790util.m166194p(bArr, 10, i);
        C117790util.m166194p(bArr, 14, (int) j2);
        C117790util.m166193o(bArr, 18, i2);
        C117790util.m166193o(bArr, 20, 0);
        mo165627b(this.f338498e);
        mo165626a(bArr, 22);
        mo165632g();
        return mo165628c();
    }
}
