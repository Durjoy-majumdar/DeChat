package p429c.p790t.p791m.sapp.p792c;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.t.m.sapp.c.m */
public class C79909m {

    /* renamed from: a */
    public static final byte[] f234105a = {84, 101, 110, 99, 101, 110, 116, 76, 111, 99, 97, 116, 105, 111, 110, 49};

    /* renamed from: b */
    public static final byte[] f234106b = new byte[0];

    /* renamed from: c */
    public static final byte[] f234107c = new byte[0];

    /* renamed from: a */
    public static String m97058a(String str) {
        try {
            return new String(m97063a(Base64.decode(str.getBytes(), 2)), "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m97068b(String str, String str2) {
        return m97060a(str, str2, 1);
    }

    /* renamed from: b */
    public static byte[] m97069b(byte[] bArr, String str) {
        return m97067a(bArr, str, 1);
    }

    /* renamed from: a */
    public static byte[] m97063a(byte[] bArr) {
        return m97064a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static byte[] m97064a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        return m97065a(bArr, i + 16, i2 - 16, bArr2, bArr2, 2);
    }

    /* renamed from: a */
    public static byte[] m97065a(byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3, int i3) {
        if (i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("wrong mode.");
        } else if (bArr == null || bArr.length == 0 || i < 0 || i2 <= 0) {
            return f234107c;
        } else {
            try {
                Cipher a = m97062a(bArr2, bArr3, i3);
                return a == null ? f234107c : a.doFinal(bArr, i, i2);
            } catch (Throwable unused) {
                return f234107c;
            }
        }
    }

    /* renamed from: a */
    public static Cipher m97062a(byte[] bArr, byte[] bArr2, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, new IvParameterSpec(bArr2));
        return instance;
    }

    /* renamed from: a */
    public static Cipher m97061a(String str, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, new IvParameterSpec(f234105a));
        return instance;
    }

    /* renamed from: a */
    public static String m97060a(String str, String str2, int i) {
        byte[] bArr;
        if (i == 1 || i == 2) {
            if (!(str == null || str.length() == 0)) {
                if (i == 1) {
                    try {
                        bArr = str.getBytes();
                    } catch (Throwable unused) {
                    }
                } else {
                    bArr = i == 2 ? Base64.decode(str.getBytes(), 2) : null;
                }
                if (bArr != null) {
                    if (bArr.length != 0) {
                        byte[] a = m97067a(bArr, str2, i);
                        if (i == 1) {
                            return Base64.encodeToString(a, 2);
                        }
                        if (i == 2) {
                            return new String(a);
                        }
                        return null;
                    }
                }
            }
            return "";
        }
        throw new IllegalArgumentException("wrong mode.");
    }

    /* renamed from: a */
    public static byte[] m97067a(byte[] bArr, String str, int i) {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("wrong mode.");
        } else if (bArr == null || bArr.length == 0) {
            return f234106b;
        } else {
            try {
                Cipher a = m97061a(str, i);
                if (a == null) {
                    return f234106b;
                }
                return a.doFinal(bArr);
            } catch (Throwable unused) {
                return f234106b;
            }
        }
    }

    /* renamed from: a */
    public static String m97059a(String str, String str2) {
        return m97060a(str, str2, 2);
    }

    /* renamed from: a */
    public static byte[] m97066a(byte[] bArr, String str) {
        return m97067a(bArr, str, 2);
    }
}
