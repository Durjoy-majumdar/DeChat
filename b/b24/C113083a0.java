package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.a0 */
public class C113083a0 extends C113107m0 {
    public C113083a0() {
        this.f338498e = 322;
    }

    /* renamed from: i */
    public byte[] mo165617i(byte[] bArr) {
        int length = bArr.length + 4;
        byte[] bArr2 = new byte[length];
        C117790util.m166193o(bArr2, 0, 0);
        C117790util.m166193o(bArr2, 2, bArr.length);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        mo165627b(this.f338498e);
        mo165626a(bArr2, length);
        mo165632g();
        return mo165628c();
    }
}
