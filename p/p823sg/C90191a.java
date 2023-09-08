package p823sg;

import android.util.Base64;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: sg.a */
public class C90191a {
    /* renamed from: a */
    public static byte[] m112871a(byte[] bArr, String str) {
        byte[] decode = Base64.decode(str.getBytes(), 0);
        SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        instance.init(2, secretKeySpec, new IvParameterSpec(Arrays.copyOf(decode, decode.length)));
        return instance.doFinal(bArr);
    }
}
