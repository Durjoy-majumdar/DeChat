package ft3;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: ft3.d */
public class C45807d {
    /* renamed from: a */
    public static final String m51084a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static byte[] m51085b(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i2 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i2])) << 4));
        }
        return bArr;
    }
}
