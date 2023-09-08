package com.tencent.tmassistantsdk.util;

import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class MD5 {
    public static final byte[] PADDING = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final int S11 = 7;
    public static final int S12 = 12;
    public static final int S13 = 17;
    public static final int S14 = 22;
    public static final int S21 = 5;
    public static final int S22 = 9;
    public static final int S23 = 14;
    public static final int S24 = 20;
    public static final int S31 = 4;
    public static final int S32 = 11;
    public static final int S33 = 16;
    public static final int S34 = 23;
    public static final int S41 = 6;
    public static final int S42 = 10;
    public static final int S43 = 15;
    public static final int S44 = 21;
    public final byte[] buffer = new byte[64];
    public final long[] count = new long[2];
    public final byte[] digest = new byte[16];
    public final long[] state = new long[4];

    public MD5() {
        md5Init();
    }

    private void Decode(long[] jArr, byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 4) {
            jArr[i2] = b2iu(bArr[i3]) | (b2iu(bArr[i3 + 1]) << 8) | (b2iu(bArr[i3 + 2]) << 16) | (b2iu(bArr[i3 + 3]) << 24);
            i2++;
        }
    }

    private void Encode(byte[] bArr, long[] jArr, int i) {
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

    /* renamed from: F */
    private long m106540F(long j, long j2, long j3) {
        return ((~j) & j3) | (j2 & j);
    }

    /* renamed from: FF */
    private long m106541FF(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j6;
        int F = (int) (m106540F(j2, j3, j4) + j5 + j7 + j);
        return ((long) ((F >>> ((int) (32 - j8))) | (F << ((int) j8)))) + j2;
    }

    /* renamed from: G */
    private long m106542G(long j, long j2, long j3) {
        return (j & j3) | (j2 & (~j3));
    }

    /* renamed from: GG */
    private long m106543GG(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j6;
        int G = (int) (m106542G(j2, j3, j4) + j5 + j7 + j);
        return ((long) ((G >>> ((int) (32 - j8))) | (G << ((int) j8)))) + j2;
    }

    /* renamed from: H */
    private long m106544H(long j, long j2, long j3) {
        return (j ^ j2) ^ j3;
    }

    /* renamed from: HH */
    private long m106545HH(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j6;
        int H = (int) (m106544H(j2, j3, j4) + j5 + j7 + j);
        return ((long) ((H >>> ((int) (32 - j8))) | (H << ((int) j8)))) + j2;
    }

    /* renamed from: I */
    private long m106546I(long j, long j2, long j3) {
        return (j | (~j3)) ^ j2;
    }

    /* renamed from: II */
    private long m106547II(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        long j8 = j6;
        int I = (int) (m106546I(j2, j3, j4) + j5 + j7 + j);
        return ((long) ((I >>> ((int) (32 - j8))) | (I << ((int) j8)))) + j2;
    }

    public static long b2iu(byte b) {
        if (b < 0) {
            b &= ExifInterface.MARKER;
        }
        return (long) b;
    }

    public static String byteHEX(byte b) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        return new String(new char[]{cArr[(b >>> 4) & 15], cArr[b & 15]});
    }

    public static String convertHashToString(byte[] bArr) {
        String str = "";
        if (bArr == null) {
            return str;
        }
        for (int i = 0; i < bArr.length; i++) {
            str = str + Integer.toString((bArr[i] & ExifInterface.MARKER) + 256, 16).substring(1);
        }
        return str.toUpperCase();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC, Splitter:B:22:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003e A[SYNTHETIC, Splitter:B:29:0x003e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String fileToMD5(java.lang.String r7) {
        /*
            r0 = 0
            java.io.InputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106423E(r7)     // Catch:{ Exception -> 0x003a, all -> 0x0030 }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            r3 = 0
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 == r5) goto L_0x001e
            int r4 = r7.read(r1)     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            if (r4 <= 0) goto L_0x0011
            r2.update(r1, r3, r4)     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            goto L_0x0011
        L_0x001e:
            byte[] r1 = r2.digest()     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            java.lang.String r0 = convertHashToString(r1)     // Catch:{ Exception -> 0x002e, all -> 0x002c }
            if (r7 == 0) goto L_0x002b
            r7.close()     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            return r0
        L_0x002c:
            r0 = move-exception
            goto L_0x0034
        L_0x002e:
            goto L_0x003c
        L_0x0030:
            r7 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
        L_0x0034:
            if (r7 == 0) goto L_0x0039
            r7.close()     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            throw r0
        L_0x003a:
            r7 = r0
        L_0x003c:
            if (r7 == 0) goto L_0x0041
            r7.close()     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.util.MD5.fileToMD5(java.lang.String):java.lang.String");
    }

    private void md5Final() {
        byte[] bArr = new byte[8];
        Encode(bArr, this.count, 8);
        int i = ((int) (this.count[0] >>> 3)) & 63;
        md5Update(PADDING, i < 56 ? 56 - i : 120 - i);
        md5Update(bArr, 8);
        Encode(this.digest, this.state, 16);
    }

    private void md5Init() {
        long[] jArr = this.count;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.state;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
    }

    private void md5Memcpy(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i + i4] = bArr2[i2 + i4];
        }
    }

    private void md5Transform(byte[] bArr) {
        long[] jArr = this.state;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long[] jArr2 = new long[16];
        Decode(jArr2, bArr, 64);
        long[] jArr3 = jArr2;
        long FF = m106541FF(j, j2, j3, j4, jArr2[0], 7, 3614090360L);
        long FF2 = m106541FF(j4, FF, j2, j3, jArr3[1], 12, 3905402710L);
        long FF3 = m106541FF(j3, FF2, FF, j2, jArr3[2], 17, 606105819);
        long FF4 = m106541FF(j2, FF3, FF2, FF, jArr3[3], 22, 3250441966L);
        long FF5 = m106541FF(FF, FF4, FF3, FF2, jArr3[4], 7, 4118548399L);
        long FF6 = m106541FF(FF2, FF5, FF4, FF3, jArr3[5], 12, 1200080426);
        long FF7 = m106541FF(FF3, FF6, FF5, FF4, jArr3[6], 17, 2821735955L);
        long FF8 = m106541FF(FF4, FF7, FF6, FF5, jArr3[7], 22, 4249261313L);
        long FF9 = m106541FF(FF5, FF8, FF7, FF6, jArr3[8], 7, 1770035416);
        long FF10 = m106541FF(FF6, FF9, FF8, FF7, jArr3[9], 12, 2336552879L);
        long FF11 = m106541FF(FF7, FF10, FF9, FF8, jArr3[10], 17, 4294925233L);
        long FF12 = m106541FF(FF8, FF11, FF10, FF9, jArr3[11], 22, 2304563134L);
        long FF13 = m106541FF(FF9, FF12, FF11, FF10, jArr3[12], 7, 1804603682);
        long FF14 = m106541FF(FF10, FF13, FF12, FF11, jArr3[13], 12, 4254626195L);
        long FF15 = m106541FF(FF11, FF14, FF13, FF12, jArr3[14], 17, 2792965006L);
        long FF16 = m106541FF(FF12, FF15, FF14, FF13, jArr3[15], 22, 1236535329);
        long GG = m106543GG(FF13, FF16, FF15, FF14, jArr3[1], 5, 4129170786L);
        long GG2 = m106543GG(FF14, GG, FF16, FF15, jArr3[6], 9, 3225465664L);
        long GG3 = m106543GG(FF15, GG2, GG, FF16, jArr3[11], 14, 643717713);
        long GG4 = m106543GG(FF16, GG3, GG2, GG, jArr3[0], 20, 3921069994L);
        long GG5 = m106543GG(GG, GG4, GG3, GG2, jArr3[5], 5, 3593408605L);
        long GG6 = m106543GG(GG2, GG5, GG4, GG3, jArr3[10], 9, 38016083);
        long GG7 = m106543GG(GG3, GG6, GG5, GG4, jArr3[15], 14, 3634488961L);
        long GG8 = m106543GG(GG4, GG7, GG6, GG5, jArr3[4], 20, 3889429448L);
        long GG9 = m106543GG(GG5, GG8, GG7, GG6, jArr3[9], 5, 568446438);
        long GG10 = m106543GG(GG6, GG9, GG8, GG7, jArr3[14], 9, 3275163606L);
        long GG11 = m106543GG(GG7, GG10, GG9, GG8, jArr3[3], 14, 4107603335L);
        long GG12 = m106543GG(GG8, GG11, GG10, GG9, jArr3[8], 20, 1163531501);
        long GG13 = m106543GG(GG9, GG12, GG11, GG10, jArr3[13], 5, 2850285829L);
        long GG14 = m106543GG(GG10, GG13, GG12, GG11, jArr3[2], 9, 4243563512L);
        long GG15 = m106543GG(GG11, GG14, GG13, GG12, jArr3[7], 14, 1735328473);
        long GG16 = m106543GG(GG12, GG15, GG14, GG13, jArr3[12], 20, 2368359562L);
        long HH = m106545HH(GG13, GG16, GG15, GG14, jArr3[5], 4, 4294588738L);
        long HH2 = m106545HH(GG14, HH, GG16, GG15, jArr3[8], 11, 2272392833L);
        long HH3 = m106545HH(GG15, HH2, HH, GG16, jArr3[11], 16, 1839030562);
        long HH4 = m106545HH(GG16, HH3, HH2, HH, jArr3[14], 23, 4259657740L);
        long HH5 = m106545HH(HH, HH4, HH3, HH2, jArr3[1], 4, 2763975236L);
        long HH6 = m106545HH(HH2, HH5, HH4, HH3, jArr3[4], 11, 1272893353);
        long HH7 = m106545HH(HH3, HH6, HH5, HH4, jArr3[7], 16, 4139469664L);
        long HH8 = m106545HH(HH4, HH7, HH6, HH5, jArr3[10], 23, 3200236656L);
        long HH9 = m106545HH(HH5, HH8, HH7, HH6, jArr3[13], 4, 681279174);
        long HH10 = m106545HH(HH6, HH9, HH8, HH7, jArr3[0], 11, 3936430074L);
        long HH11 = m106545HH(HH7, HH10, HH9, HH8, jArr3[3], 16, 3572445317L);
        long HH12 = m106545HH(HH8, HH11, HH10, HH9, jArr3[6], 23, 76029189);
        long HH13 = m106545HH(HH9, HH12, HH11, HH10, jArr3[9], 4, 3654602809L);
        long HH14 = m106545HH(HH10, HH13, HH12, HH11, jArr3[12], 11, 3873151461L);
        long HH15 = m106545HH(HH11, HH14, HH13, HH12, jArr3[15], 16, 530742520);
        long HH16 = m106545HH(HH12, HH15, HH14, HH13, jArr3[2], 23, 3299628645L);
        long II = m106547II(HH13, HH16, HH15, HH14, jArr3[0], 6, 4096336452L);
        long II2 = m106547II(HH14, II, HH16, HH15, jArr3[7], 10, 1126891415);
        long II3 = m106547II(HH15, II2, II, HH16, jArr3[14], 15, 2878612391L);
        long II4 = m106547II(HH16, II3, II2, II, jArr3[5], 21, 4237533241L);
        long II5 = m106547II(II, II4, II3, II2, jArr3[12], 6, 1700485571);
        long II6 = m106547II(II2, II5, II4, II3, jArr3[3], 10, 2399980690L);
        long II7 = m106547II(II3, II6, II5, II4, jArr3[10], 15, 4293915773L);
        long II8 = m106547II(II4, II7, II6, II5, jArr3[1], 21, 2240044497L);
        long II9 = m106547II(II5, II8, II7, II6, jArr3[8], 6, 1873313359);
        long II10 = m106547II(II6, II9, II8, II7, jArr3[15], 10, 4264355552L);
        long II11 = m106547II(II7, II10, II9, II8, jArr3[6], 15, 2734768916L);
        long II12 = m106547II(II8, II11, II10, II9, jArr3[13], 21, 1309151649);
        long II13 = m106547II(II9, II12, II11, II10, jArr3[4], 6, 4149444226L);
        long II14 = m106547II(II10, II13, II12, II11, jArr3[11], 10, 3174756917L);
        long II15 = m106547II(II11, II14, II13, II12, jArr3[2], 15, 718787259);
        long II16 = m106547II(II12, II15, II14, II13, jArr3[9], 21, 3951481745L);
        long[] jArr4 = this.state;
        jArr4[0] = jArr4[0] + II13;
        jArr4[1] = jArr4[1] + II16;
        jArr4[2] = jArr4[2] + II15;
        jArr4[3] = jArr4[3] + II14;
    }

    private boolean md5Update(InputStream inputStream, long j) {
        int i;
        InputStream inputStream2 = inputStream;
        byte[] bArr = new byte[64];
        long[] jArr = this.count;
        long j2 = jArr[0];
        int i2 = ((int) (j2 >>> 3)) & 63;
        long j3 = j << 3;
        long j4 = j2 + j3;
        jArr[0] = j4;
        if (j4 < j3) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (j >>> 29);
        int i3 = 64 - i2;
        if (j >= ((long) i3)) {
            byte[] bArr2 = new byte[i3];
            try {
                inputStream.read(bArr2, 0, i3);
                md5Memcpy(this.buffer, bArr2, i2, 0, i3);
                md5Transform(this.buffer);
                while (((long) (i3 + 63)) < j) {
                    try {
                        inputStream.read(bArr);
                        md5Transform(bArr);
                        i3 += 64;
                    } catch (Exception unused) {
                        return false;
                    }
                }
                i = 0;
            } catch (Exception unused2) {
                return false;
            }
        } else {
            i = i2;
            i3 = 0;
        }
        int i4 = (int) (j - ((long) i3));
        byte[] bArr3 = new byte[i4];
        try {
            inputStream.read(bArr3);
            md5Memcpy(this.buffer, bArr3, i, 0, i4);
            return true;
        } catch (Exception unused3) {
            return false;
        }
    }

    public static String toMD5(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("ISO8859_1");
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        byte[] md5 = new MD5().getMD5(bArr);
        String str2 = "";
        for (int i = 0; i < 16; i++) {
            str2 = str2 + byteHEX(md5[i]);
        }
        return str2;
    }

    public byte[] getMD5(byte[] bArr) {
        md5Init();
        md5Update((InputStream) new ByteArrayInputStream(bArr), (long) bArr.length);
        md5Final();
        return this.digest;
    }

    private void md5Update(byte[] bArr, int i) {
        int i2;
        byte[] bArr2 = new byte[64];
        long[] jArr = this.count;
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
            md5Memcpy(this.buffer, bArr, i3, 0, i4);
            md5Transform(this.buffer);
            while (i4 + 63 < i) {
                md5Memcpy(bArr2, bArr, 0, i4, 64);
                md5Transform(bArr2);
                i4 += 64;
            }
            i2 = i4;
            i3 = 0;
        } else {
            i2 = 0;
        }
        md5Memcpy(this.buffer, bArr, i3, i2, i - i2);
    }
}
