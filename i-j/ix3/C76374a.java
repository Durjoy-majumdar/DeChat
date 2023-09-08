package ix3;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: ix3.a */
public final class C76374a {
    /* renamed from: a */
    public static String m91797a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = b & ExifInterface.MARKER;
            sb.append("0123456789abcdef".charAt(b2 >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static byte[] m91798b(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
            if (digit > 127) {
                digit -= 256;
            }
            bArr[i] = (byte) digit;
        }
        return bArr;
    }
}
