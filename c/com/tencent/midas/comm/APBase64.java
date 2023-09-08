package com.tencent.midas.comm;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import com.tencent.xweb.file.XVFSFile;

public class APBase64 {
    private static byte[] base64DecodeChars = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    private static final char[] base64EncodeChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', XVFSFile.SEPARATOR_CHAR};

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d A[LOOP:0: B:1:0x000b->B:32:0x007d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087 A[EDGE_INSN: B:37:0x0087->B:33:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0087 A[EDGE_INSN: B:38:0x0087->B:33:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0087 A[EDGE_INSN: B:40:0x0087->B:33:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087 A[EDGE_INSN: B:41:0x0087->B:33:0x0087 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021 A[LOOP:2: B:7:0x0021->B:10:0x002e, LOOP_START, PHI: r4 
      PHI: (r4v1 int) = (r4v0 int), (r4v8 int) binds: [B:6:0x001d, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] decode(java.lang.String r8) {
        /*
            byte[] r8 = r8.getBytes()
            int r0 = r8.length
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            r2 = 0
        L_0x000b:
            if (r2 >= r0) goto L_0x0087
        L_0x000d:
            byte[] r3 = base64DecodeChars
            int r4 = r2 + 1
            byte r2 = r8[r2]
            byte r2 = r3[r2]
            r3 = -1
            if (r4 >= r0) goto L_0x001d
            if (r2 == r3) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2 = r4
            goto L_0x000d
        L_0x001d:
            if (r2 != r3) goto L_0x0021
            goto L_0x0087
        L_0x0021:
            byte[] r5 = base64DecodeChars
            int r6 = r4 + 1
            byte r4 = r8[r4]
            byte r4 = r5[r4]
            if (r6 >= r0) goto L_0x0030
            if (r4 == r3) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r4 = r6
            goto L_0x0021
        L_0x0030:
            if (r4 != r3) goto L_0x0033
            goto L_0x0087
        L_0x0033:
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            r1.write(r2)
        L_0x003d:
            int r2 = r6 + 1
            byte r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L_0x004a
            byte[] r8 = r1.toByteArray()
            return r8
        L_0x004a:
            byte[] r7 = base64DecodeChars
            byte r5 = r7[r5]
            if (r2 >= r0) goto L_0x0055
            if (r5 == r3) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r6 = r2
            goto L_0x003d
        L_0x0055:
            if (r5 != r3) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            r1.write(r4)
        L_0x0064:
            int r4 = r2 + 1
            byte r2 = r8[r2]
            if (r2 != r6) goto L_0x006f
            byte[] r8 = r1.toByteArray()
            return r8
        L_0x006f:
            byte[] r7 = base64DecodeChars
            byte r2 = r7[r2]
            if (r4 >= r0) goto L_0x007a
            if (r2 == r3) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r4
            goto L_0x0064
        L_0x007a:
            if (r2 != r3) goto L_0x007d
            goto L_0x0087
        L_0x007d:
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            r1.write(r2)
            r2 = r4
            goto L_0x000b
        L_0x0087:
            byte[] r8 = r1.toByteArray()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.comm.APBase64.decode(java.lang.String):byte[]");
    }

    public static String encode(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            byte b = bArr[i] & ExifInterface.MARKER;
            if (i2 == length) {
                char[] cArr = base64EncodeChars;
                stringBuffer.append(cArr[b >>> 2]);
                stringBuffer.append(cArr[(b & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i3 = i2 + 1;
            byte b2 = bArr[i2] & ExifInterface.MARKER;
            if (i3 == length) {
                char[] cArr2 = base64EncodeChars;
                stringBuffer.append(cArr2[b >>> 2]);
                stringBuffer.append(cArr2[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(b2 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            int i4 = i3 + 1;
            byte b3 = bArr[i3] & ExifInterface.MARKER;
            char[] cArr3 = base64EncodeChars;
            stringBuffer.append(cArr3[b >>> 2]);
            stringBuffer.append(cArr3[((b & 3) << 4) | ((b2 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((b2 & 15) << 2) | ((b3 & 192) >>> 6)]);
            stringBuffer.append(cArr3[b3 & 63]);
            i = i4;
        }
        return stringBuffer.toString();
    }
}
