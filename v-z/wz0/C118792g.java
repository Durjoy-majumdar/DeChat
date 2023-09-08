package wz0;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: wz0.g */
public class C118792g {
    /* renamed from: a */
    public static String m167485a(String str, String str2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            String encodeToString = Base64.encodeToString(instance.doFinal(str.getBytes()), 2);
            Log.m105924i("MicroMsg.CardDymanicQrcodeOfflineHelper", "hash is: " + encodeToString);
            return encodeToString;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", e, "", new Object[0]);
            return "";
        }
    }

    /* renamed from: b */
    public static String m167486b(String str, String str2) {
        byte[] d = m167488d(str.getBytes());
        int length = str2.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str2.substring(i2, i2 + 2), 16).byteValue();
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(d, "AES");
        Cipher instance = Cipher.getInstance("AES");
        instance.init(2, secretKeySpec);
        return new String(instance.doFinal(bArr));
    }

    /* renamed from: c */
    public static String m167487c(String str, String str2) {
        byte[] d = m167488d(str.getBytes());
        byte[] bytes = str2.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(d, "AES");
        Cipher instance = Cipher.getInstance("AES");
        instance.init(1, secretKeySpec);
        byte[] doFinal = instance.doFinal(bytes);
        if (doFinal == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(doFinal.length * 2);
        for (int i = 0; i < doFinal.length; i++) {
            sb.append("0123456789ABCDEF".charAt((doFinal[i] >> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(doFinal[i] & 15));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static byte[] m167488d(byte[] bArr) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        SecureRandom instance2 = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        instance2.setSeed(bArr);
        instance.init(128, instance2);
        return instance.generateKey().getEncoded();
    }
}
