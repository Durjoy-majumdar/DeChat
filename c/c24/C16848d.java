package c24;

import com.tencent.xweb.util.WXWebReporter;

/* renamed from: c24.d */
public class C16848d {
    /* renamed from: a */
    public static byte[] m16500a(byte[] bArr, int i, int i2, byte[] bArr2) {
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        C16847a aVar = new C16847a();
        aVar.f45520e = 0;
        aVar.f45519d = 0;
        aVar.f45523h = bArr2;
        byte[] bArr4 = new byte[8];
        if (i2 % 8 != 0 || i2 < 16) {
            return null;
        }
        byte[] a = aVar.mo17899a(bArr3, 0);
        aVar.f45517b = a;
        byte b = a[0] & 7;
        aVar.f45521f = b;
        int i3 = (i2 - b) - 10;
        if (i3 < 0) {
            return null;
        }
        for (int i4 = 0; i4 < 8; i4++) {
            bArr4[i4] = 0;
        }
        aVar.f45518c = new byte[i3];
        aVar.f45520e = 0;
        aVar.f45519d = 8;
        aVar.f45525j = 8;
        aVar.f45521f++;
        aVar.f45522g = 1;
        while (true) {
            int i5 = aVar.f45522g;
            if (i5 > 2) {
                int i6 = 0;
                while (i3 != 0) {
                    int i7 = aVar.f45521f;
                    if (i7 < 8) {
                        aVar.f45518c[i6] = (byte) (bArr4[(aVar.f45520e + 0) + i7] ^ aVar.f45517b[i7]);
                        i6++;
                        i3--;
                        aVar.f45521f = i7 + 1;
                    }
                    if (aVar.f45521f == 8) {
                        aVar.f45520e = aVar.f45519d - 8;
                        if (!aVar.mo17900b(bArr3, 0, i2)) {
                            return null;
                        }
                        bArr4 = bArr3;
                    }
                }
                aVar.f45522g = 1;
                while (aVar.f45522g < 8) {
                    int i8 = aVar.f45521f;
                    if (i8 < 8) {
                        if ((bArr4[(aVar.f45520e + 0) + i8] ^ aVar.f45517b[i8]) != 0) {
                            return null;
                        }
                        aVar.f45521f = i8 + 1;
                    }
                    if (aVar.f45521f == 8) {
                        aVar.f45520e = aVar.f45519d;
                        if (!aVar.mo17900b(bArr3, 0, i2)) {
                            return null;
                        }
                        bArr4 = bArr3;
                    }
                    aVar.f45522g++;
                }
                return aVar.f45518c;
            }
            int i9 = aVar.f45521f;
            if (i9 < 8) {
                aVar.f45521f = i9 + 1;
                aVar.f45522g = i5 + 1;
            }
            if (aVar.f45521f == 8) {
                if (!aVar.mo17900b(bArr3, 0, i2)) {
                    return null;
                }
                bArr4 = bArr3;
            }
        }
    }

    /* renamed from: b */
    public static byte[] m16501b(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3;
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        C16847a aVar = new C16847a();
        byte[] bArr4 = new byte[8];
        aVar.f45516a = bArr4;
        aVar.f45517b = new byte[8];
        aVar.f45521f = 1;
        aVar.f45522g = 0;
        aVar.f45520e = 0;
        aVar.f45519d = 0;
        aVar.f45523h = bArr2;
        aVar.f45524i = true;
        int i4 = (i2 + 10) % 8;
        aVar.f45521f = i4;
        if (i4 != 0) {
            aVar.f45521f = 8 - i4;
        }
        aVar.f45518c = new byte[(aVar.f45521f + i2 + 10)];
        bArr4[0] = (byte) ((aVar.f45526k.nextInt() & WXWebReporter.KEY_TRY_FIX_DEX_FAILED) | aVar.f45521f);
        int i5 = 1;
        while (true) {
            i3 = aVar.f45521f;
            if (i5 > i3) {
                break;
            }
            aVar.f45516a[i5] = (byte) (aVar.f45526k.nextInt() & 255);
            i5++;
        }
        aVar.f45521f = i3 + 1;
        for (int i6 = 0; i6 < 8; i6++) {
            aVar.f45517b[i6] = 0;
        }
        aVar.f45522g = 1;
        while (aVar.f45522g <= 2) {
            int i7 = aVar.f45521f;
            if (i7 < 8) {
                byte[] bArr5 = aVar.f45516a;
                aVar.f45521f = i7 + 1;
                bArr5[i7] = (byte) (aVar.f45526k.nextInt() & 255);
                aVar.f45522g++;
            }
            if (aVar.f45521f == 8) {
                aVar.mo17901c();
            }
        }
        int i8 = 0;
        while (i2 > 0) {
            int i9 = aVar.f45521f;
            if (i9 < 8) {
                byte[] bArr6 = aVar.f45516a;
                aVar.f45521f = i9 + 1;
                bArr6[i9] = bArr3[i8];
                i2--;
                i8++;
            }
            if (aVar.f45521f == 8) {
                aVar.mo17901c();
            }
        }
        aVar.f45522g = 1;
        while (true) {
            int i15 = aVar.f45522g;
            if (i15 > 7) {
                return aVar.f45518c;
            }
            int i16 = aVar.f45521f;
            if (i16 < 8) {
                byte[] bArr7 = aVar.f45516a;
                aVar.f45521f = i16 + 1;
                bArr7[i16] = 0;
                aVar.f45522g = i15 + 1;
            }
            if (aVar.f45521f == 8) {
                aVar.mo17901c();
            }
        }
    }
}
