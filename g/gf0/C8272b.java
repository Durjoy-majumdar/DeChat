package gf0;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: gf0.b */
public class C8272b {
    /* renamed from: a */
    public static final String m8352a(byte[] bArr) {
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
}
