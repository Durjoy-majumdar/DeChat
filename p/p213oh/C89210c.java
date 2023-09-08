package p213oh;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: oh.c */
public class C89210c {

    /* renamed from: a */
    public static char[] f257055a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static ThreadLocal<MessageDigest> f257056b = new C89211a();

    /* renamed from: oh.c$a */
    public class C89211a extends ThreadLocal<MessageDigest> {
        public Object initialValue() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Initialize MD5 failed.", e);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static String m111505a(String str) {
        byte[] digest = f257056b.get().digest(str.getBytes());
        int length = digest.length;
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        int i = length + 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = digest[i2];
            char[] cArr = f257055a;
            char c = cArr[(b & 240) >> 4];
            char c2 = cArr[b & 15];
            stringBuffer.append(c);
            stringBuffer.append(c2);
        }
        return stringBuffer.toString();
    }
}
