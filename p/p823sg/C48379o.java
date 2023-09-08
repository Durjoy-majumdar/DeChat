package p823sg;

import com.google.android.gms.common.util.AndroidUtilsLight;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

/* renamed from: sg.o */
public class C48379o {
    /* renamed from: a */
    public static String m53724a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(r1 * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: b */
    public static String m53725b(String str) {
        MessageDigest instance = MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(str.getBytes("UTF-8"));
        return m53724a(instance.digest(byteArrayOutputStream.toByteArray()));
    }
}
