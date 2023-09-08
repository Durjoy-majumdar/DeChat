package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.o */
public class C113109o extends C113107m0 {

    /* renamed from: f */
    public int f338499f = 0;

    public C113109o() {
        this.f338498e = 278;
    }

    /* renamed from: i */
    public byte[] mo165633i(int i, int i2, long[] jArr) {
        long[] jArr2 = jArr == null ? new long[0] : (long[]) jArr.clone();
        int i3 = 10;
        int length = (jArr2.length * 4) + 10;
        this.f338499f = length;
        byte[] bArr = new byte[length];
        bArr[0] = (byte) 0;
        C117790util.m166194p(bArr, 1, i);
        C117790util.m166194p(bArr, 5, i2);
        bArr[9] = (byte) (jArr2.length >> 0);
        for (long j : jArr2) {
            C117790util.m166194p(bArr, i3, (int) j);
            i3 += 4;
        }
        mo165627b(this.f338498e);
        mo165626a(bArr, this.f338499f);
        mo165632g();
        return mo165628c();
    }
}
