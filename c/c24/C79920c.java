package c24;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;

/* renamed from: c24.c */
public class C79920c {

    /* renamed from: e */
    public static final byte[] f234141e;

    /* renamed from: a */
    public long[] f234142a = new long[4];

    /* renamed from: b */
    public long[] f234143b = new long[2];

    /* renamed from: c */
    public byte[] f234144c = new byte[64];

    /* renamed from: d */
    public byte[] f234145d = new byte[16];

    static {
        byte[] bArr = new byte[64];
        bArr[0] = Byte.MIN_VALUE;
        f234141e = bArr;
    }

    public C79920c() {
        mo110089h();
    }

    /* renamed from: g */
    public static String m97090g(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr2 = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static byte[] m97091l(byte[] bArr) {
        return new C79920c().mo110088f(bArr);
    }

    /* renamed from: a */
    public final void mo110083a(byte[] bArr, long[] jArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 4) {
            long j = jArr[i2];
            bArr[i3] = (byte) ((int) (j & 255));
            bArr[i3 + 1] = (byte) ((int) ((j >>> 8) & 255));
            bArr[i3 + 2] = (byte) ((int) ((j >>> 16) & 255));
            bArr[i3 + 3] = (byte) ((int) ((j >>> 24) & 255));
            i2++;
        }
    }

    /* renamed from: b */
    public final long mo110084b(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j2;
        long j9 = j6;
        int i = (int) (((j3 & j8) | ((~j8) & j4)) + j5 + j7 + j);
        return ((long) ((i >>> ((int) (32 - j9))) | (i << ((int) j9)))) + j8;
    }

    /* renamed from: c */
    public final long mo110085c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j4;
        long j9 = j6;
        int i = (int) ((((~j8) & j3) | (j2 & j8)) + j5 + j7 + j);
        return ((long) ((i << ((int) j9)) | (i >>> ((int) (32 - j9))))) + j2;
    }

    /* renamed from: d */
    public final long mo110086d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        int i = (int) (j + ((j3 ^ j2) ^ j4) + j5 + j7);
        return ((long) ((i << ((int) j6)) | (i >>> ((int) (32 - j6))))) + j2;
    }

    /* renamed from: e */
    public final long mo110087e(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        int i = (int) (j + (j3 ^ ((~j4) | j2)) + j5 + j7);
        return ((long) ((i << ((int) j6)) | (i >>> ((int) (32 - j6))))) + j2;
    }

    /* renamed from: f */
    public byte[] mo110088f(byte[] bArr) {
        byte[] bArr2 = bArr;
        mo110089h();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
        long length = (long) bArr2.length;
        byte[] bArr3 = new byte[64];
        long[] jArr = this.f234143b;
        long j = jArr[0];
        int i = ((int) (j >>> 3)) & 63;
        long j2 = length << 3;
        long j3 = j + j2;
        jArr[0] = j3;
        if (j3 < j2) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (length >>> 29);
        int i2 = 64 - i;
        if (length >= ((long) i2)) {
            byte[] bArr4 = new byte[i2];
            try {
                byteArrayInputStream.read(bArr4, 0, i2);
                mo110090i(this.f234144c, bArr4, i, 0, i2);
                mo110091j(this.f234144c);
                while (((long) (i2 + 63)) < length) {
                    byteArrayInputStream.read(bArr3);
                    mo110091j(bArr3);
                    i2 += 64;
                }
                i = 0;
            } catch (Exception unused) {
            }
        } else {
            i2 = 0;
        }
        int i3 = (int) (length - ((long) i2));
        byte[] bArr5 = new byte[i3];
        byteArrayInputStream.read(bArr5);
        mo110090i(this.f234144c, bArr5, i, 0, i3);
        byte[] bArr6 = new byte[8];
        mo110083a(bArr6, this.f234143b, 8);
        int i4 = ((int) (this.f234143b[0] >>> 3)) & 63;
        mo110092k(f234141e, i4 < 56 ? 56 - i4 : 120 - i4);
        mo110092k(bArr6, 8);
        mo110083a(this.f234145d, this.f234142a, 16);
        return this.f234145d;
    }

    /* renamed from: h */
    public final void mo110089h() {
        long[] jArr = this.f234143b;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.f234142a;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
    }

    /* renamed from: i */
    public final void mo110090i(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i + i4] = bArr2[i2 + i4];
        }
    }

    /* renamed from: j */
    public final void mo110091j(byte[] bArr) {
        long[] jArr = this.f234142a;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long[] jArr2 = new long[16];
        int i = 0;
        int i2 = 0;
        while (i < 64) {
            long[] jArr3 = jArr2;
            byte b = bArr[i];
            if (b < 0) {
                b &= ExifInterface.MARKER;
            }
            long j5 = (long) b;
            byte b2 = bArr[i + 1];
            if (b2 < 0) {
                b2 &= ExifInterface.MARKER;
            }
            long j6 = j5 | (((long) b2) << 8);
            byte b3 = bArr[i + 2];
            if (b3 < 0) {
                b3 &= ExifInterface.MARKER;
            }
            long j7 = j6 | (((long) b3) << 16);
            byte b4 = bArr[i + 3];
            if (b4 < 0) {
                b4 &= ExifInterface.MARKER;
            }
            jArr3[i2] = j7 | (((long) b4) << 24);
            i2++;
            i += 4;
            jArr2 = jArr3;
        }
        long[] jArr4 = jArr2;
        long b5 = mo110084b(j, j2, j3, j4, jArr2[0], 7, 3614090360L);
        long b6 = mo110084b(j4, b5, j2, j3, jArr4[1], 12, 3905402710L);
        long b7 = mo110084b(j3, b6, b5, j2, jArr4[2], 17, 606105819);
        long b8 = mo110084b(j2, b7, b6, b5, jArr4[3], 22, 3250441966L);
        long b9 = mo110084b(b5, b8, b7, b6, jArr4[4], 7, 4118548399L);
        long b15 = mo110084b(b6, b9, b8, b7, jArr4[5], 12, 1200080426);
        long b16 = mo110084b(b7, b15, b9, b8, jArr4[6], 17, 2821735955L);
        long b17 = mo110084b(b8, b16, b15, b9, jArr4[7], 22, 4249261313L);
        long b18 = mo110084b(b9, b17, b16, b15, jArr4[8], 7, 1770035416);
        long b19 = mo110084b(b15, b18, b17, b16, jArr4[9], 12, 2336552879L);
        long b25 = mo110084b(b16, b19, b18, b17, jArr4[10], 17, 4294925233L);
        long b26 = mo110084b(b17, b25, b19, b18, jArr4[11], 22, 2304563134L);
        long b27 = mo110084b(b18, b26, b25, b19, jArr4[12], 7, 1804603682);
        long b28 = mo110084b(b19, b27, b26, b25, jArr4[13], 12, 4254626195L);
        long b29 = mo110084b(b25, b28, b27, b26, jArr4[14], 17, 2792965006L);
        long b35 = mo110084b(b26, b29, b28, b27, jArr4[15], 22, 1236535329);
        long c = mo110085c(b27, b35, b29, b28, jArr4[1], 5, 4129170786L);
        long c2 = mo110085c(b28, c, b35, b29, jArr4[6], 9, 3225465664L);
        long c3 = mo110085c(b29, c2, c, b35, jArr4[11], 14, 643717713);
        long c4 = mo110085c(b35, c3, c2, c, jArr4[0], 20, 3921069994L);
        long c5 = mo110085c(c, c4, c3, c2, jArr4[5], 5, 3593408605L);
        long c6 = mo110085c(c2, c5, c4, c3, jArr4[10], 9, 38016083);
        long c7 = mo110085c(c3, c6, c5, c4, jArr4[15], 14, 3634488961L);
        long c8 = mo110085c(c4, c7, c6, c5, jArr4[4], 20, 3889429448L);
        long c9 = mo110085c(c5, c8, c7, c6, jArr4[9], 5, 568446438);
        long c15 = mo110085c(c6, c9, c8, c7, jArr4[14], 9, 3275163606L);
        long c16 = mo110085c(c7, c15, c9, c8, jArr4[3], 14, 4107603335L);
        long c17 = mo110085c(c8, c16, c15, c9, jArr4[8], 20, 1163531501);
        long c18 = mo110085c(c9, c17, c16, c15, jArr4[13], 5, 2850285829L);
        long c19 = mo110085c(c15, c18, c17, c16, jArr4[2], 9, 4243563512L);
        long c25 = mo110085c(c16, c19, c18, c17, jArr4[7], 14, 1735328473);
        long c26 = mo110085c(c17, c25, c19, c18, jArr4[12], 20, 2368359562L);
        long d = mo110086d(c18, c26, c25, c19, jArr4[5], 4, 4294588738L);
        long d2 = mo110086d(c19, d, c26, c25, jArr4[8], 11, 2272392833L);
        long d3 = mo110086d(c25, d2, d, c26, jArr4[11], 16, 1839030562);
        long d4 = mo110086d(c26, d3, d2, d, jArr4[14], 23, 4259657740L);
        long d5 = mo110086d(d, d4, d3, d2, jArr4[1], 4, 2763975236L);
        long d6 = mo110086d(d2, d5, d4, d3, jArr4[4], 11, 1272893353);
        long d7 = mo110086d(d3, d6, d5, d4, jArr4[7], 16, 4139469664L);
        long d8 = mo110086d(d4, d7, d6, d5, jArr4[10], 23, 3200236656L);
        long d9 = mo110086d(d5, d8, d7, d6, jArr4[13], 4, 681279174);
        long d15 = mo110086d(d6, d9, d8, d7, jArr4[0], 11, 3936430074L);
        long d16 = mo110086d(d7, d15, d9, d8, jArr4[3], 16, 3572445317L);
        long d17 = mo110086d(d8, d16, d15, d9, jArr4[6], 23, 76029189);
        long d18 = mo110086d(d9, d17, d16, d15, jArr4[9], 4, 3654602809L);
        long d19 = mo110086d(d15, d18, d17, d16, jArr4[12], 11, 3873151461L);
        long d25 = mo110086d(d16, d19, d18, d17, jArr4[15], 16, 530742520);
        long d26 = mo110086d(d17, d25, d19, d18, jArr4[2], 23, 3299628645L);
        long e = mo110087e(d18, d26, d25, d19, jArr4[0], 6, 4096336452L);
        long e2 = mo110087e(d19, e, d26, d25, jArr4[7], 10, 1126891415);
        long e3 = mo110087e(d25, e2, e, d26, jArr4[14], 15, 2878612391L);
        long e4 = mo110087e(d26, e3, e2, e, jArr4[5], 21, 4237533241L);
        long e5 = mo110087e(e, e4, e3, e2, jArr4[12], 6, 1700485571);
        long e6 = mo110087e(e2, e5, e4, e3, jArr4[3], 10, 2399980690L);
        long e7 = mo110087e(e3, e6, e5, e4, jArr4[10], 15, 4293915773L);
        long e8 = mo110087e(e4, e7, e6, e5, jArr4[1], 21, 2240044497L);
        long e9 = mo110087e(e5, e8, e7, e6, jArr4[8], 6, 1873313359);
        long e15 = mo110087e(e6, e9, e8, e7, jArr4[15], 10, 4264355552L);
        long e16 = mo110087e(e7, e15, e9, e8, jArr4[6], 15, 2734768916L);
        long e17 = mo110087e(e8, e16, e15, e9, jArr4[13], 21, 1309151649);
        long e18 = mo110087e(e9, e17, e16, e15, jArr4[4], 6, 4149444226L);
        long e19 = mo110087e(e15, e18, e17, e16, jArr4[11], 10, 3174756917L);
        long e25 = mo110087e(e16, e19, e18, e17, jArr4[2], 15, 718787259);
        long e26 = mo110087e(e17, e25, e19, e18, jArr4[9], 21, 3951481745L);
        long[] jArr5 = this.f234142a;
        jArr5[0] = jArr5[0] + e18;
        jArr5[1] = jArr5[1] + e26;
        jArr5[2] = jArr5[2] + e25;
        jArr5[3] = jArr5[3] + e19;
    }

    /* renamed from: k */
    public final void mo110092k(byte[] bArr, int i) {
        int i2;
        byte[] bArr2 = new byte[64];
        long[] jArr = this.f234143b;
        long j = jArr[0];
        int i3 = ((int) (j >>> 3)) & 63;
        long j2 = (long) (i << 3);
        long j3 = j + j2;
        jArr[0] = j3;
        if (j3 < j2) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + ((long) (i >>> 29));
        int i4 = 64 - i3;
        if (i >= i4) {
            mo110090i(this.f234144c, bArr, i3, 0, i4);
            mo110091j(this.f234144c);
            while (i4 + 63 < i) {
                mo110090i(bArr2, bArr, 0, i4, 64);
                mo110091j(bArr2);
                i4 += 64;
            }
            i2 = i4;
            i3 = 0;
        } else {
            i2 = 0;
        }
        mo110090i(this.f234144c, bArr, i3, i2, i - i2);
    }
}
