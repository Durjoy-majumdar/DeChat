package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.k0 */
public class C113103k0 extends C113107m0 {
    public C113103k0() {
        this.f338498e = 1;
    }

    /* renamed from: h */
    public Boolean mo165621h() {
        return this.f338496c < 20 ? Boolean.FALSE : Boolean.TRUE;
    }

    /* renamed from: i */
    public byte[] mo165625i(long j, byte[] bArr) {
        byte[] bArr2 = new byte[20];
        C117790util.m166193o(bArr2, 0, 1);
        C117790util.m166194p(bArr2, 2, C117790util.m166191m());
        C117790util.m166194p(bArr2, 6, (int) j);
        C117790util.m166196r(bArr2, 10, System.currentTimeMillis() / 1000);
        System.arraycopy(bArr, 0, bArr2, 14, bArr.length);
        C117790util.m166193o(bArr2, bArr.length + 14, 0);
        mo165627b(this.f338498e);
        mo165626a(bArr2, 20);
        mo165632g();
        return mo165628c();
    }
}
