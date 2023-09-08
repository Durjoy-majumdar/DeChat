package p823sg;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;

/* renamed from: sg.p */
public final class C90196p {
    /* renamed from: a */
    public static int m112884a(byte[] bArr) {
        return m112885b(bArr, 0);
    }

    /* renamed from: b */
    public static int m112885b(byte[] bArr, int i) {
        return ((bArr[i + 3] & ExifInterface.MARKER) << 0) | ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i + 1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[i + 2] & ExifInterface.MARKER) << 8);
    }

    /* renamed from: c */
    public static long m112886c(byte[] bArr) {
        return ((255 & ((long) bArr[7])) << 0) | ((((long) bArr[0]) & 255) << 56) | ((((long) bArr[1]) & 255) << 48) | ((((long) bArr[2]) & 255) << 40) | ((((long) bArr[3]) & 255) << 32) | ((((long) bArr[4]) & 255) << 24) | ((((long) bArr[5]) & 255) << 16) | ((((long) bArr[6]) & 255) << 8);
    }

    /* renamed from: d */
    public static int m112887d(byte[] bArr) {
        return ((bArr[0] & ExifInterface.MARKER) << 0) | ((bArr[3] & ExifInterface.MARKER) << 24) | ((bArr[2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr[1] & ExifInterface.MARKER) << 8);
    }

    /* renamed from: e */
    public static byte[] m112888e(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        byte[] bArr2 = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            bArr2[i3] = bArr[3 - i3];
        }
        return bArr2;
    }
}
