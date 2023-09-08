package et3;

import androidx.exifinterface.media.ExifInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: et3.a */
public class C86679a {
    /* renamed from: a */
    public static String m107499a(byte[] bArr) {
        byte[] bArr2;
        try {
            byte[] bArr3 = new byte[3];
            for (int i = 0; i < 3; i++) {
                int i2 = i * 2;
                bArr3[i] = Integer.valueOf("4D4435".substring(i2, i2 + 2), 16).byteValue();
            }
            MessageDigest instance = MessageDigest.getInstance(new String(bArr3));
            instance.update(bArr);
            bArr2 = instance.digest();
        } catch (NoSuchAlgorithmException unused) {
            bArr2 = null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr2.length);
        for (byte b : bArr2) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase(Locale.getDefault()));
        }
        return stringBuffer.toString();
    }
}
