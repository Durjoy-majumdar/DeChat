package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.f0 */
public class C113093f0 extends C113107m0 {
    public C113093f0() {
        this.f338498e = 327;
    }

    /* renamed from: i */
    public byte[] mo165622i(long j, byte[] bArr, byte[] bArr2) {
        int i = 32;
        int length = bArr != null ? bArr.length > 32 ? 32 : bArr.length : 0;
        if (bArr2 == null) {
            i = 0;
        } else if (bArr2.length <= 32) {
            i = bArr2.length;
        }
        int i2 = length + 6;
        int i3 = i2 + 2;
        int i4 = i3 + i;
        byte[] bArr3 = new byte[i4];
        C117790util.m166196r(bArr3, 0, j);
        C117790util.m166193o(bArr3, 4, length);
        System.arraycopy(bArr, 0, bArr3, 6, length);
        C117790util.m166193o(bArr3, i2, i);
        System.arraycopy(bArr2, 0, bArr3, i3, i);
        mo165627b(this.f338498e);
        mo165626a(bArr3, i4);
        mo165632g();
        return mo165628c();
    }
}
