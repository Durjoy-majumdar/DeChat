package p346hh;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: hh.a */
public class C117081a {
    /* renamed from: a */
    public static short[] m165100a(byte[] bArr, int i) {
        int i2 = i / 2;
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 2;
            sArr[i3] = (short) (((bArr[i4 + 1] & ExifInterface.MARKER) << 8) | (bArr[i4] & ExifInterface.MARKER));
        }
        return sArr;
    }

    /* renamed from: b */
    public static byte[] m165101b(short s, boolean z) {
        byte[] bArr = new byte[2];
        if (z) {
            bArr[1] = (byte) (s & 255);
            bArr[0] = (byte) (((short) (s >> 8)) & 255);
        } else {
            bArr[0] = (byte) (s & 255);
            bArr[1] = (byte) (((short) (s >> 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: c */
    public static short m165102c(byte b, byte b2, boolean z) {
        byte b3;
        if (z) {
            b3 = ((short) (((short) ((b & ExifInterface.MARKER) | 0)) << 8)) | (b2 & ExifInterface.MARKER);
        } else {
            b3 = (b & ExifInterface.MARKER) | ((short) (((short) ((b2 & ExifInterface.MARKER) | 0)) << 8));
        }
        return (short) b3;
    }

    /* renamed from: d */
    public static byte[] m165103d(short[] sArr) {
        byte[] bArr = new byte[(sArr.length << 1)];
        for (int i = 0; i < sArr.length; i++) {
            int i2 = i * 2;
            short s = sArr[i];
            bArr[i2] = (byte) (s & 255);
            bArr[i2 + 1] = (byte) ((s & 65280) >> 8);
        }
        return bArr;
    }
}
