package zs0;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2encoder;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: zs0.a */
public class C91932a {

    /* renamed from: a */
    public static final byte[] f263193a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    public static final byte[] f263194b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c */
    public static final byte[] f263195c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d */
    public static final byte[] f263196d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e */
    public static final byte[] f263197e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: f */
    public static final byte[] f263198f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX WARNING: Can't wrap try/catch for region: R(15:42|43|44|45|46|47|48|(3:49|50|(1:52)(1:98))|53|54|55|56|57|58|59) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:42|(10:43|44|45|46|47|48|(3:49|50|(1:52)(1:98))|53|54|55)|56|57|58|59) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:81|82|83|84|85|86|87|88) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0102 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0105 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0133 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x0136 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m115444a(java.lang.String r16, int r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "MicroMsg.AppBrandNetWork.Base64"
            r3 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "Input string was null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            byte[] r0 = new byte[r3]
            return r0
        L_0x0011:
            java.lang.String r4 = "US-ASCII"
            byte[] r0 = r0.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x0018 }
            goto L_0x001c
        L_0x0018:
            byte[] r0 = r16.getBytes()
        L_0x001c:
            int r4 = r0.length
            r5 = 2
            int r6 = r3 + r4
            int r7 = r0.length
            r8 = 3
            r9 = 4
            r10 = 1
            if (r6 <= r7) goto L_0x0045
            java.lang.Object[] r6 = new java.lang.Object[r8]
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r6[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r6[r5] = r0
            java.lang.String r0 = "Source array with length %d cannot have offset of %d and process %d bytes."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r6)
            byte[] r0 = new byte[r3]
        L_0x0042:
            r4 = r0
            goto L_0x00be
        L_0x0045:
            if (r4 != 0) goto L_0x004a
            byte[] r0 = new byte[r3]
            goto L_0x0042
        L_0x004a:
            if (r4 >= r9) goto L_0x0063
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Base64-encoded string must have at least four characters, but length specified was "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            byte[] r0 = new byte[r3]
            goto L_0x0042
        L_0x0063:
            byte[] r7 = m115448e(r17)
            int r4 = r4 * 3
            int r4 = r4 / r9
            byte[] r4 = new byte[r4]
            byte[] r11 = new byte[r9]
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0071:
            if (r12 >= r6) goto L_0x00b8
            byte r15 = r0[r12]
            r9 = r15 & 255(0xff, float:3.57E-43)
            byte r9 = r7[r9]
            r10 = -5
            if (r9 < r10) goto L_0x0099
            r10 = -1
            if (r9 < r10) goto L_0x0094
            int r9 = r13 + 1
            r11[r13] = r15
            if (r9 <= r8) goto L_0x0093
            int r9 = m115445b(r11, r3, r4, r14, r1)
            int r14 = r14 + r9
            byte r9 = r0[r12]
            r10 = 61
            if (r9 != r10) goto L_0x0091
            goto L_0x00b8
        L_0x0091:
            r13 = 0
            goto L_0x0094
        L_0x0093:
            r13 = r9
        L_0x0094:
            int r12 = r12 + 1
            r9 = 4
            r10 = 1
            goto L_0x0071
        L_0x0099:
            java.io.IOException r1 = new java.io.IOException
            java.lang.Object[] r2 = new java.lang.Object[r5]
            byte r0 = r0[r12]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "Bad Base64 input character decimal %d in array position %d"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x00b8:
            byte[] r0 = new byte[r14]
            java.lang.System.arraycopy(r4, r3, r0, r3, r14)
            goto L_0x0042
        L_0x00be:
            r0 = 4
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c4
            r1 = 1
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            int r5 = r4.length
            if (r5 < r0) goto L_0x013a
            if (r1 != 0) goto L_0x013a
            byte r0 = r4[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            byte r1 = r4[r1]
            int r1 = r1 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r5
            r0 = r0 | r1
            r1 = 35615(0x8b1f, float:4.9907E-41)
            if (r1 != r0) goto L_0x013a
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0121, all -> 0x011d }
            r5.<init>()     // Catch:{ IOException -> 0x0121, all -> 0x011d }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0118, all -> 0x0113 }
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0110, all -> 0x010d }
            r7.<init>(r6)     // Catch:{ IOException -> 0x0110, all -> 0x010d }
        L_0x00f1:
            int r1 = r7.read(r0)     // Catch:{ IOException -> 0x010b, all -> 0x0109 }
            if (r1 < 0) goto L_0x00fb
            r5.write(r0, r3, r1)     // Catch:{ IOException -> 0x010b, all -> 0x0109 }
            goto L_0x00f1
        L_0x00fb:
            byte[] r4 = r5.toByteArray()     // Catch:{ IOException -> 0x010b, all -> 0x0109 }
            r5.close()     // Catch:{ Exception -> 0x0102 }
        L_0x0102:
            r7.close()     // Catch:{ Exception -> 0x0105 }
        L_0x0105:
            r6.close()     // Catch:{ Exception -> 0x013a }
            goto L_0x013a
        L_0x0109:
            r0 = move-exception
            goto L_0x0116
        L_0x010b:
            r0 = move-exception
            goto L_0x011b
        L_0x010d:
            r0 = move-exception
            r7 = r1
            goto L_0x0116
        L_0x0110:
            r0 = move-exception
            r7 = r1
            goto L_0x011b
        L_0x0113:
            r0 = move-exception
            r6 = r1
            r7 = r6
        L_0x0116:
            r1 = r5
            goto L_0x0130
        L_0x0118:
            r0 = move-exception
            r6 = r1
            r7 = r6
        L_0x011b:
            r1 = r5
            goto L_0x0124
        L_0x011d:
            r0 = move-exception
            r6 = r1
            r7 = r6
            goto L_0x0130
        L_0x0121:
            r0 = move-exception
            r6 = r1
            r7 = r6
        L_0x0124:
            java.lang.String r5 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x012f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r3)     // Catch:{ all -> 0x012f }
            r1.close()     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x012f:
            r0 = move-exception
        L_0x0130:
            r1.close()     // Catch:{ Exception -> 0x0133 }
        L_0x0133:
            r7.close()     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            r6.close()     // Catch:{ Exception -> 0x0139 }
        L_0x0139:
            throw r0
        L_0x013a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zs0.C91932a.m115444a(java.lang.String, int):byte[]");
    }

    /* renamed from: b */
    public static int m115445b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr == null) {
            Log.m105924i("MicroMsg.AppBrandNetWork.Base64", "Source array was null.");
            return 0;
        } else if (bArr2 == null) {
            Log.m105924i("MicroMsg.AppBrandNetWork.Base64", "Destination array was null.");
            return 0;
        } else if (i < 0 || (i4 = i + 3) >= bArr.length) {
            Log.m105924i("MicroMsg.AppBrandNetWork.Base64", "srcOffset < 0 || srcOffset + 3 >= source.length");
            return 0;
        } else if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
            Log.m105924i("MicroMsg.AppBrandNetWork.Base64", "Destination array with length cannot have offset of and still store three bytes.");
            return 0;
        } else {
            byte[] e = m115448e(i3);
            byte b = bArr[i + 2];
            if (b == 61) {
                bArr2[i2] = (byte) ((((e[bArr[i + 1]] & ExifInterface.MARKER) << 12) | ((e[bArr[i]] & ExifInterface.MARKER) << 18)) >>> 16);
                return 1;
            }
            byte b2 = bArr[i4];
            if (b2 == 61) {
                int i6 = ((e[bArr[i + 1]] & ExifInterface.MARKER) << 12) | ((e[bArr[i]] & ExifInterface.MARKER) << 18) | ((e[b] & ExifInterface.MARKER) << 6);
                bArr2[i2] = (byte) (i6 >>> 16);
                bArr2[i2 + 1] = (byte) (i6 >>> 8);
                return 2;
            }
            byte b3 = ((e[bArr[i + 1]] & ExifInterface.MARKER) << 12) | ((e[bArr[i]] & ExifInterface.MARKER) << 18) | ((e[b] & ExifInterface.MARKER) << 6) | (e[b2] & ExifInterface.MARKER);
            bArr2[i2] = (byte) (b3 >> v2encoder.enumCODEC_vcodec2);
            bArr2[i2 + 1] = (byte) (b3 >> 8);
            bArr2[i5] = (byte) b3;
            return 3;
        }
    }

    /* renamed from: c */
    public static byte[] m115446c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArr3 = (i4 & 16) == 16 ? f263195c : (i4 & 32) == 32 ? f263197e : f263193a;
        int i5 = 0;
        int i6 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0);
        if (i2 > 2) {
            i5 = (bArr[i + 2] << 24) >>> 24;
        }
        int i7 = i6 | i5;
        if (i2 == 1) {
            bArr2[i3] = bArr3[i7 >>> 18];
            bArr2[i3 + 1] = bArr3[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = bArr3[i7 >>> 18];
            bArr2[i3 + 1] = bArr3[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i7 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = bArr3[i7 >>> 18];
            bArr2[i3 + 1] = bArr3[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i7 >>> 6) & 63];
            bArr2[i3 + 3] = bArr3[i7 & 63];
            return bArr2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: zs0.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: zs0.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: zs0.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: zs0.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: zs0.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: zs0.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.io.ByteArrayOutputStream} */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:17|18|19|20|21|22|23|24|25|26|27) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:15|16|17|18|19|20|21|22|23|24|25|26|27) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:29|48|49|50|51|52|53|54|55) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0076 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00a9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m115447d(byte[] r19, int r20, int r21, int r22) {
        /*
            r0 = r19
            r7 = r20
            r8 = r21
            java.lang.String r1 = "MicroMsg.AppBrandNetWork.Base64"
            r9 = 0
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "Cannot serialize a null array."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            byte[] r0 = new byte[r9]
            goto L_0x011c
        L_0x0014:
            if (r7 >= 0) goto L_0x002e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Cannot have negative offset: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            byte[] r0 = new byte[r9]
            goto L_0x011c
        L_0x002e:
            if (r8 >= 0) goto L_0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Cannot have length offset: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            byte[] r0 = new byte[r9]
            goto L_0x011c
        L_0x0048:
            int r2 = r7 + r8
            int r3 = r0.length
            if (r2 <= r3) goto L_0x0056
            java.lang.String r0 = "off + len > source.length  "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            byte[] r0 = new byte[r9]
            goto L_0x011c
        L_0x0056:
            r1 = r22 & 2
            r10 = 1
            if (r1 == 0) goto L_0x00ad
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x009b, all -> 0x0097 }
            r2.<init>()     // Catch:{ IOException -> 0x009b, all -> 0x0097 }
            zs0.a$a r3 = new zs0.a$a     // Catch:{ IOException -> 0x008f, all -> 0x008c }
            r4 = r22 | 1
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x008f, all -> 0x008c }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            r4.write(r0, r7, r8)     // Catch:{ IOException -> 0x0084, all -> 0x0082 }
            r4.close()     // Catch:{ IOException -> 0x0084, all -> 0x0082 }
            r4.close()     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            r3.close()     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            r2.close()     // Catch:{ Exception -> 0x007c }
        L_0x007c:
            byte[] r0 = r2.toByteArray()
            goto L_0x011c
        L_0x0082:
            r0 = move-exception
            goto L_0x00a2
        L_0x0084:
            r0 = move-exception
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            goto L_0x00a3
        L_0x0088:
            r0 = move-exception
            r4 = r1
        L_0x008a:
            r1 = r3
            goto L_0x0091
        L_0x008c:
            r0 = move-exception
            r3 = r1
            goto L_0x00a3
        L_0x008f:
            r0 = move-exception
            r4 = r1
        L_0x0091:
            r18 = r2
            r2 = r1
            r1 = r18
            goto L_0x009e
        L_0x0097:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L_0x00a3
        L_0x009b:
            r0 = move-exception
            r2 = r1
            r4 = r2
        L_0x009e:
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r0 = move-exception
            r3 = r2
            r2 = r1
        L_0x00a2:
            r1 = r4
        L_0x00a3:
            r1.close()     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            r3.close()     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            r2.close()     // Catch:{ Exception -> 0x00ac }
        L_0x00ac:
            throw r0
        L_0x00ad:
            r1 = r22 & 8
            if (r1 == 0) goto L_0x00b3
            r11 = 1
            goto L_0x00b4
        L_0x00b3:
            r11 = 0
        L_0x00b4:
            int r1 = r8 / 3
            r12 = 4
            int r1 = r1 * 4
            int r2 = r8 % 3
            if (r2 <= 0) goto L_0x00bf
            r2 = 4
            goto L_0x00c0
        L_0x00bf:
            r2 = 0
        L_0x00c0:
            int r1 = r1 + r2
            if (r11 == 0) goto L_0x00c6
            int r2 = r1 / 76
            int r1 = r1 + r2
        L_0x00c6:
            r13 = r1
            byte[] r14 = new byte[r13]
            int r15 = r8 + -2
            r6 = 0
            r16 = 0
            r17 = 0
        L_0x00d0:
            if (r6 >= r15) goto L_0x00fb
            int r2 = r6 + r7
            r3 = 3
            r1 = r19
            r4 = r14
            r5 = r16
            r9 = r6
            r6 = r22
            m115446c(r1, r2, r3, r4, r5, r6)
            int r1 = r17 + 4
            if (r11 == 0) goto L_0x00f3
            r2 = 76
            if (r1 < r2) goto L_0x00f3
            int r1 = r16 + 4
            r2 = 10
            r14[r1] = r2
            int r16 = r16 + 1
            r17 = 0
            goto L_0x00f5
        L_0x00f3:
            r17 = r1
        L_0x00f5:
            int r6 = r9 + 3
            int r16 = r16 + 4
            r9 = 0
            goto L_0x00d0
        L_0x00fb:
            r9 = r6
            if (r9 >= r8) goto L_0x010e
            int r2 = r9 + r7
            int r3 = r8 - r9
            r1 = r19
            r4 = r14
            r5 = r16
            r6 = r22
            m115446c(r1, r2, r3, r4, r5, r6)
            int r16 = r16 + 4
        L_0x010e:
            r0 = r16
            int r13 = r13 - r10
            if (r0 > r13) goto L_0x011b
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r14, r2, r1, r2, r0)
            r0 = r1
            goto L_0x011c
        L_0x011b:
            r0 = r14
        L_0x011c:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0124 }
            java.lang.String r2 = "US-ASCII"
            r1.<init>(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0124 }
            return r1
        L_0x0124:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zs0.C91932a.m115447d(byte[], int, int, int):java.lang.String");
    }

    /* renamed from: e */
    public static final byte[] m115448e(int i) {
        return (i & 16) == 16 ? f263196d : (i & 32) == 32 ? f263198f : f263194b;
    }

    /* renamed from: zs0.a$a */
    public static class C91933a extends FilterOutputStream {

        /* renamed from: d */
        public boolean f263199d;

        /* renamed from: e */
        public int f263200e;

        /* renamed from: f */
        public byte[] f263201f;

        /* renamed from: g */
        public int f263202g;

        /* renamed from: h */
        public int f263203h;

        /* renamed from: i */
        public boolean f263204i;

        /* renamed from: j */
        public byte[] f263205j;

        /* renamed from: n */
        public int f263206n;

        /* renamed from: o */
        public byte[] f263207o;

        public C91933a(OutputStream outputStream, int i) {
            super(outputStream);
            boolean z = true;
            this.f263204i = (i & 8) != 0;
            z = (i & 1) == 0 ? false : z;
            this.f263199d = z;
            int i2 = z ? 3 : 4;
            this.f263202g = i2;
            this.f263201f = new byte[i2];
            this.f263200e = 0;
            this.f263203h = 0;
            this.f263205j = new byte[4];
            this.f263206n = i;
            this.f263207o = C91932a.m115448e(i);
        }

        public void close() {
            int i = this.f263200e;
            if (i > 0) {
                if (this.f263199d) {
                    OutputStream outputStream = this.out;
                    byte[] bArr = this.f263205j;
                    C91932a.m115446c(this.f263201f, 0, i, bArr, 0, this.f263206n);
                    outputStream.write(bArr);
                    this.f263200e = 0;
                } else {
                    throw new IOException("Base64 input not properly padded.");
                }
            }
            super.close();
            this.f263201f = null;
            this.out = null;
        }

        public void write(int i) {
            if (this.f263199d) {
                byte[] bArr = this.f263201f;
                int i2 = this.f263200e;
                int i3 = i2 + 1;
                this.f263200e = i3;
                bArr[i2] = (byte) i;
                int i4 = this.f263202g;
                if (i3 >= i4) {
                    OutputStream outputStream = this.out;
                    byte[] bArr2 = this.f263205j;
                    C91932a.m115446c(bArr, 0, i4, bArr2, 0, this.f263206n);
                    outputStream.write(bArr2);
                    int i5 = this.f263203h + 4;
                    this.f263203h = i5;
                    if (this.f263204i && i5 >= 76) {
                        this.out.write(10);
                        this.f263203h = 0;
                    }
                    this.f263200e = 0;
                    return;
                }
                return;
            }
            byte b = this.f263207o[i & 127];
            if (b > -5) {
                byte[] bArr3 = this.f263201f;
                int i6 = this.f263200e;
                int i7 = i6 + 1;
                this.f263200e = i7;
                bArr3[i6] = (byte) i;
                if (i7 >= this.f263202g) {
                    this.out.write(this.f263205j, 0, C91932a.m115445b(bArr3, 0, this.f263205j, 0, this.f263206n));
                    this.f263200e = 0;
                }
            } else if (b != -5) {
                throw new IOException("Invalid character in Base64 data.");
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }
}
