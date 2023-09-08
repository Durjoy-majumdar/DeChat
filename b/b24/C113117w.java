package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.w */
public class C113117w extends C113107m0 {

    /* renamed from: f */
    public int f338504f = 0;

    public C113117w() {
        this.f338498e = 296;
    }

    /* renamed from: i */
    public byte[] mo165635i(int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        int i5 = 32;
        if (bArr == null) {
            i5 = 0;
        } else if (bArr.length <= 32) {
            i5 = bArr.length;
        }
        int i6 = 16;
        if (bArr2 == null) {
            i6 = 0;
        } else if (bArr2.length <= 16) {
            i6 = bArr2.length;
        }
        int i7 = i5 + 11;
        int i8 = i7 + 2;
        int i9 = i8 + i6;
        int i15 = i9 + 2;
        this.f338504f = i15;
        byte[] bArr3 = new byte[i15];
        C117790util.m166193o(bArr3, 0, 0);
        bArr3[2] = (byte) (i >> 0);
        bArr3[3] = (byte) (i2 >> 0);
        bArr3[4] = (byte) (i3 >> 0);
        C117790util.m166194p(bArr3, 5, i4);
        C117790util.m166193o(bArr3, 9, i5);
        System.arraycopy(bArr, 0, bArr3, 11, i5);
        C117790util.m166193o(bArr3, i7, i6);
        System.arraycopy(bArr2, 0, bArr3, i8, i6);
        C117790util.m166193o(bArr3, i9, 0);
        mo165627b(this.f338498e);
        mo165626a(bArr3, this.f338504f);
        mo165632g();
        return mo165628c();
    }
}
