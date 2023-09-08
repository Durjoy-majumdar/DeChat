package p823sg;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: sg.m */
public class C90194m {
    /* renamed from: a */
    public static byte[] m112880a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr3[i] = (byte) i;
        }
        if (bArr2 == null || bArr2.length == 0) {
            bArr3 = null;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                byte b = bArr2[i2] & ExifInterface.MARKER;
                byte b2 = bArr3[i4];
                i3 = (b + (b2 & ExifInterface.MARKER) + i3) & 255;
                bArr3[i4] = bArr3[i3];
                bArr3[i3] = b2;
                i2 = (i2 + 1) % bArr2.length;
            }
        }
        byte[] bArr4 = new byte[bArr.length];
        int i5 = 0;
        byte b3 = 0;
        for (int i6 = 0; i6 < bArr.length; i6++) {
            i5 = (i5 + 1) & 255;
            byte b4 = bArr3[i5];
            b3 = ((b4 & ExifInterface.MARKER) + b3) & ExifInterface.MARKER;
            bArr3[i5] = bArr3[b3];
            bArr3[b3] = b4;
            int i7 = ((bArr3[i5] & ExifInterface.MARKER) + (b4 & ExifInterface.MARKER)) & 255;
            bArr4[i6] = (byte) (bArr3[i7] ^ bArr[i6]);
        }
        return bArr4;
    }

    /* renamed from: b */
    public static byte[] m112881b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return m112880a(bArr, bArr2);
    }

    /* renamed from: c */
    public static byte[] m112882c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return m112880a(bArr, bArr2);
    }
}
