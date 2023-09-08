package j53;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: j53.t */
public class C87882t {

    /* renamed from: j53.t$a */
    public static class C87883a {
        /* renamed from: a */
        public static byte[] m109363a(byte[] bArr, byte[] bArr2) {
            if (bArr2 == null) {
                try {
                    bArr2 = "DFG#$%^#%$RGHR(&*M<><".getBytes("UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    bArr2 = null;
                }
            }
            if (bArr2 != null && bArr2.length > 16) {
                try {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr2);
                    bArr2 = instance.digest();
                } catch (NoSuchAlgorithmException unused2) {
                    bArr2 = null;
                }
            }
            if (bArr == null || bArr2 == null || bArr.length == 0) {
                return bArr;
            }
            int i = 4;
            if (bArr.length % 4 == 0) {
                int i2 = 8;
                if (bArr.length >= 8) {
                    int length = bArr.length >>> 2;
                    int[] iArr = new int[length];
                    m109364b(bArr, iArr);
                    int length2 = bArr2.length % 4 == 0 ? bArr2.length >>> 2 : (bArr2.length >>> 2) + 1;
                    if (length2 >= 4) {
                        i = length2;
                    }
                    int[] iArr2 = new int[i];
                    int i3 = 0;
                    for (int i4 = 0; i4 < i; i4++) {
                        iArr2[i4] = 0;
                    }
                    m109364b(bArr2, iArr2);
                    int i5 = length - 1;
                    int i6 = iArr[i5];
                    int i7 = iArr[0];
                    for (int i8 = ((52 / (i5 + 1)) + 6) * -1640531527; i8 != 0; i8 -= -1640531527) {
                        int i9 = (i8 >>> 2) & 3;
                        int i15 = i5;
                        while (i15 > 0) {
                            int i16 = iArr[i15 - 1];
                            i7 = iArr[i15] - (((i7 ^ i8) + (i16 ^ iArr2[(i15 & 3) ^ i9])) ^ (((i16 >>> 5) ^ (i7 << 2)) + ((i7 >>> 3) ^ (i16 << 4))));
                            iArr[i15] = i7;
                            i15--;
                        }
                        int i17 = iArr[i5];
                        i7 = iArr[0] - (((i7 ^ i8) + (iArr2[i9 ^ (i15 & 3)] ^ i17)) ^ (((i17 >>> 5) ^ (i7 << 2)) + ((i7 >>> 3) ^ (i17 << 4))));
                        iArr[0] = i7;
                    }
                    int i18 = iArr[i5];
                    if (i18 >= 0 && i18 <= (i5 << 2)) {
                        byte[] bArr3 = new byte[i18];
                        int i19 = i18 >> 2;
                        if (i19 > i5) {
                            i19 = i5;
                        }
                        int i25 = 0;
                        while (i3 < i19) {
                            int i26 = i25 + 1;
                            int i27 = iArr[i3];
                            bArr3[i25] = (byte) (i27 & 255);
                            int i28 = i26 + 1;
                            bArr3[i26] = (byte) ((i27 >>> 8) & 255);
                            int i29 = i28 + 1;
                            bArr3[i28] = (byte) ((i27 >>> 16) & 255);
                            i25 = i29 + 1;
                            bArr3[i29] = (byte) ((i27 >>> 24) & 255);
                            i3++;
                        }
                        if (i5 > i19 && i25 < i18) {
                            int i35 = i25 + 1;
                            bArr3[i25] = (byte) (iArr[i3] & 255);
                            while (i2 <= 24 && i35 < i18) {
                                bArr3[i35] = (byte) ((iArr[i3] >>> i2) & 255);
                                i2 += 8;
                                i35++;
                            }
                        }
                        return bArr3;
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m109364b(byte[] bArr, int[] iArr) {
            int length = bArr.length >> 2;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                int i4 = bArr[i2] & ExifInterface.MARKER;
                iArr[i] = i4;
                int i5 = i3 + 1;
                int i6 = i4 | ((bArr[i3] & ExifInterface.MARKER) << 8);
                iArr[i] = i6;
                int i7 = i5 + 1;
                int i8 = i6 | ((bArr[i5] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
                iArr[i] = i8;
                iArr[i] = i8 | ((bArr[i7] & ExifInterface.MARKER) << 24);
                i++;
                i2 = i7 + 1;
            }
            if (i2 < bArr.length) {
                int i9 = i2 + 1;
                iArr[i] = bArr[i2] & ExifInterface.MARKER;
                int i15 = 8;
                while (i9 < bArr.length) {
                    iArr[i] = iArr[i] | ((bArr[i9] & ExifInterface.MARKER) << i15);
                    i9++;
                    i15 += 8;
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(11:1|2|3|4|5|6|7|(2:8|(1:10)(1:29))|11|12|13)|14|15|(1:31)(2:28|30)|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0035 A[SYNTHETIC, Splitter:B:23:0x0035] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m109360a(java.lang.String r5) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0030 }
            r1.<init>(r5)     // Catch:{ all -> 0x0030 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x002d }
            int r2 = r1.available()     // Catch:{ all -> 0x002d }
            r5.<init>(r2)     // Catch:{ all -> 0x002d }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x002b }
        L_0x0013:
            int r3 = r1.read(r2)     // Catch:{ all -> 0x002b }
            if (r3 < 0) goto L_0x001e
            r4 = 0
            r5.write(r2, r4, r3)     // Catch:{ all -> 0x002b }
            goto L_0x0013
        L_0x001e:
            byte[] r0 = r5.toByteArray()     // Catch:{ all -> 0x002b }
            r5.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            r1.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x003d
        L_0x0029:
            goto L_0x003d
        L_0x002b:
            goto L_0x0033
        L_0x002d:
            r5 = r0
            goto L_0x0033
        L_0x0030:
            r5 = r0
            r1 = r5
        L_0x0033:
            if (r5 == 0) goto L_0x003a
            r5.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003a
        L_0x0039:
        L_0x003a:
            if (r1 == 0) goto L_0x003d
            goto L_0x0025
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            goto L_0x0046
        L_0x0040:
            java.lang.String r5 = ""
            byte[] r0 = r5.getBytes()
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j53.C87882t.m109360a(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002e, code lost:
        r0 = m109360a(r1.getAbsolutePath());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m109361b() {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS
            r0.append(r1)
            java.lang.String r1 = "/.tmfs/sk_g.dat"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r1.getAbsolutePath()
            byte[] r0 = m109360a(r0)
            if (r0 == 0) goto L_0x0041
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0041
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        L_0x0041:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j53.C87882t.m109361b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        r0 = m109360a(r0.getAbsolutePath());
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m109362c() {
        /*
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = "/com.tencent.qqpimsecure_TMF_4_C"
            r1.append(r2)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r3 = "/files/sk_g"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = ".dat"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0037
            return r2
        L_0x0037:
            java.lang.String r0 = r0.getAbsolutePath()
            byte[] r0 = m109360a(r0)
            if (r0 == 0) goto L_0x004a
            int r1 = r0.length
            if (r1 <= 0) goto L_0x004a
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j53.C87882t.m109362c():java.lang.String");
    }
}
