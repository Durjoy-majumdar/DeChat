package m63;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

/* renamed from: m63.a */
public class C76746a {

    /* renamed from: a */
    public static final byte[] f224517a = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* renamed from: a */
    public static byte[] m92458a(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = f224517a;
        byte[] bArr2 = new byte[(((length * 3) / 4) + 2)];
        byte[] bArr3 = new byte[4];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i4 = i + 0;
            byte b = (byte) (bytes[i4] & Byte.MAX_VALUE);
            byte b2 = bArr[b];
            if (b2 >= -5) {
                if (b2 >= -1) {
                    if (b == 61) {
                        int i5 = length - i;
                        byte b3 = (byte) (bytes[(length - 1) + 0] & Byte.MAX_VALUE);
                        if (i2 == 0 || i2 == 1) {
                            throw new C76747b("invalid padding byte '=' at byte offset " + i);
                        } else if ((i2 == 3 && i5 > 2) || (i2 == 4 && i5 > 1)) {
                            throw new C76747b("padding byte '=' falsely signals end of encoded value at offset " + i);
                        } else if (b3 != 61 && b3 != 10) {
                            throw new C76747b("encoded value has invalid trailing byte");
                        }
                    } else {
                        int i6 = i2 + 1;
                        bArr3[i2] = b;
                        if (i6 == 4) {
                            i3 += m92459b(bArr3, 0, bArr2, i3, bArr);
                            i2 = 0;
                        } else {
                            i2 = i6;
                        }
                    }
                }
                i++;
            } else {
                throw new C76747b("Bad Base64 input character at " + i + ": " + bytes[i4] + "(decimal)");
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                bArr3[i2] = 61;
                i3 += m92459b(bArr3, 0, bArr2, i3, bArr);
            } else {
                throw new C76747b("single trailing character at offset " + (length - 1));
            }
        }
        byte[] bArr4 = new byte[i3];
        System.arraycopy(bArr2, 0, bArr4, 0, i3);
        return bArr4;
    }

    /* renamed from: b */
    public static int m92459b(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        byte b = bArr[i + 2];
        if (b == 61) {
            bArr2[i2] = (byte) ((((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b2 = bArr[i + 3];
        if (b2 == 61) {
            int i3 = ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18);
            bArr2[i2] = (byte) (i3 >>> 16);
            bArr2[i2 + 1] = (byte) (i3 >>> 8);
            return 2;
        }
        int i4 = ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18) | ((bArr3[b2] << 24) >>> 24);
        bArr2[i2] = (byte) (i4 >> 16);
        bArr2[i2 + 1] = (byte) (i4 >> 8);
        bArr2[i2 + 2] = (byte) i4;
        return 3;
    }
}
