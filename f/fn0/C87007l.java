package fn0;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: fn0.l */
public class C87007l {

    /* renamed from: a */
    public static final byte[] f252489a = {18, 52, 86, 120, -112, -85, -51, -17};

    /* renamed from: b */
    public static String f252490b = null;

    /* renamed from: a */
    public static String m108031a(String str, String str2, String str3) {
        if (str == null || str.isEmpty() || !str.equals("des")) {
            return null;
        }
        if (str2 == null || str2.length() < 8) {
            throw new Exception("secret key is not available");
        }
        byte[] a = C86997b.m107999a(str3);
        if (a.length == 0) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C87002g.m108023q(3, "SecretUtils", "start decode milles time = " + currentTimeMillis, (Throwable) null);
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str2.getBytes()));
            Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
            instance.init(2, generateSecret, new IvParameterSpec(f252489a));
            String str4 = new String(instance.doFinal(a));
            C87002g.m108023q(3, "SecretUtils", "end decode milles time = " + (System.currentTimeMillis() - currentTimeMillis), (Throwable) null);
            return str4;
        } catch (Exception e) {
            C87002g.m108023q(6, "SecretUtils", "decode des error" + C87002g.m108014h(e, false), (Throwable) null);
            throw e;
        }
    }

    /* renamed from: b */
    public static String m108032b(String str, String str2, String str3) {
        if (str == null || str.isEmpty() || !str.equals("des")) {
            return null;
        }
        if (str2 == null || str2.length() < 8) {
            throw new Exception("secret key is not available");
        } else if (str3 == null || str3.isEmpty()) {
            return null;
        } else {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                C87002g.m108023q(3, "SecretUtils", "start encode milles time = " + currentTimeMillis, (Throwable) null);
                SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str2.getBytes()));
                Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
                instance.init(1, generateSecret, new IvParameterSpec(f252489a));
                String b = C86997b.m108000b(instance.doFinal(str3.getBytes()));
                C87002g.m108023q(3, "SecretUtils", "end encode milles time = " + (System.currentTimeMillis() - currentTimeMillis), (Throwable) null);
                return b;
            } catch (Exception e) {
                C87002g.m108023q(6, "SecretUtils", "encode des error" + C87002g.m108014h(e, false), (Throwable) null);
                throw e;
            }
        }
    }

    /* renamed from: c */
    public static synchronized String m108033c() {
        String str;
        String str2;
        synchronized (C87007l.class) {
            if (f252490b == null) {
                try {
                    byte[] bArr = new byte[20];
                    SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                    StringBuffer stringBuffer = new StringBuffer(40);
                    for (int i = 0; i < 20; i++) {
                        byte b = bArr[i];
                        stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
                        stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
                    }
                    str2 = stringBuffer.toString();
                } catch (Exception unused) {
                    str2 = null;
                }
                f252490b = str2;
            }
            str = f252490b;
        }
        return str;
    }
}
