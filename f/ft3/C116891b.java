package ft3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: ft3.b */
public class C116891b {
    /* renamed from: a */
    public static void m164877a(int[] iArr, int i, byte[] bArr) {
        int length = bArr.length >> 2;
        if (length > i) {
            length = i;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int i5 = iArr[i2];
            bArr[i3] = (byte) (i5 & 255);
            int i6 = i4 + 1;
            bArr[i4] = (byte) ((i5 >>> 8) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((i5 >>> 16) & 255);
            i3 = i7 + 1;
            bArr[i7] = (byte) ((i5 >>> 24) & 255);
            i2++;
        }
        if (i > length && i3 < bArr.length) {
            int i8 = i3 + 1;
            bArr[i3] = (byte) (iArr[i2] & 255);
            int i9 = 8;
            while (i9 <= 24 && i8 < bArr.length) {
                bArr[i8] = (byte) ((iArr[i2] >>> i9) & 255);
                i9 += 8;
                i8++;
            }
        }
    }

    /* renamed from: b */
    public static byte[] m164878b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr4 != null && bArr4.length > 16) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(bArr4);
                bArr4 = instance.digest();
            } catch (NoSuchAlgorithmException unused) {
                bArr4 = null;
            }
        }
        if (bArr3 == null || bArr4 == null || bArr3.length == 0) {
            return bArr3;
        }
        int i = 4;
        int length = bArr3.length % 4 == 0 ? (bArr3.length >>> 2) + 1 : (bArr3.length >>> 2) + 2;
        int[] iArr = new int[length];
        m164879c(bArr3, iArr);
        int i2 = length - 1;
        iArr[i2] = bArr3.length;
        int length2 = bArr4.length % 4 == 0 ? bArr4.length >>> 2 : (bArr4.length >>> 2) + 1;
        if (length2 >= 4) {
            i = length2;
        }
        int[] iArr2 = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            iArr2[i3] = 0;
        }
        m164879c(bArr4, iArr2);
        int i4 = iArr[i2];
        int i5 = iArr[0];
        int i6 = (52 / (i2 + 1)) + 6;
        int i7 = 0;
        while (true) {
            int i8 = i6 - 1;
            if (i6 > 0) {
                i7 -= 1640531527;
                int i9 = (i7 >>> 2) & 3;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i15 + 1;
                    int i17 = iArr[i16];
                    i4 = ((((i4 >>> 5) ^ (i17 << 2)) + ((i17 >>> 3) ^ (i4 << 4))) ^ ((i17 ^ i7) + (i4 ^ iArr2[(i15 & 3) ^ i9]))) + iArr[i15];
                    iArr[i15] = i4;
                    i15 = i16;
                }
                int i18 = iArr[0];
                i4 = ((((i4 >>> 5) ^ (i18 << 2)) + ((i18 >>> 3) ^ (i4 << 4))) ^ ((i18 ^ i7) + (i4 ^ iArr2[i9 ^ (i15 & 3)]))) + iArr[i2];
                iArr[i2] = i4;
                i6 = i8;
            } else {
                byte[] bArr5 = new byte[(length << 2)];
                m164877a(iArr, length, bArr5);
                return bArr5;
            }
        }
    }

    /* renamed from: c */
    public static void m164879c(byte[] bArr, int[] iArr) {
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

    /* renamed from: d */
    public static byte[] m164880d() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            int[] iArr = {-36, -46, -45, -77, -22, -10, 47, -77, -72, -69, -32, 25, 21, -21, -6, -75, -71, 31, -39, -49, -49};
            for (int i = 0; i < 21; i++) {
                stringBuffer.append((char) ("http://pmir.3g.qq.com".charAt(i) + iArr[i]));
            }
            return stringBuffer.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
