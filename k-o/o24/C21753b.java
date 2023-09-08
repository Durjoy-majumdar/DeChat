package o24;

import gy3.C87412m;

/* renamed from: o24.b */
public final class C21753b {
    /* renamed from: a */
    public static final boolean m24815a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C87412m.m108594g(bArr, "a");
        C87412m.m108594g(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m24816b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }
}
