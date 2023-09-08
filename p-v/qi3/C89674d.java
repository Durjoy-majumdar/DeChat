package qi3;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: qi3.d */
public class C89674d {

    /* renamed from: a */
    public static final char[] f257919a = "0123456789ABCDEF".toCharArray();

    /* renamed from: a */
    public static String m112123a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & ExifInterface.MARKER;
            int i2 = i * 2;
            char[] cArr2 = f257919a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
