package p206nj;

import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.util.BitSet;

/* renamed from: nj.q */
public class C117627q {

    /* renamed from: a */
    public static BitSet f351869a = new BitSet(256);

    /* renamed from: b */
    public static String f351870b = ((String) AccessController.doPrivileged(new C117626j("file.encoding")));

    static {
        for (int i = 97; i <= 122; i++) {
            f351869a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f351869a.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f351869a.set(i3);
        }
        f351869a.set(45);
        f351869a.set(95);
        f351869a.set(46);
        f351869a.set(42);
    }

    @Deprecated
    /* renamed from: a */
    public static String m165908a(String str) {
        try {
            return m165909b(str, f351870b);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m165909b(String str, String str2) {
        BitSet bitSet;
        int i;
        char charAt;
        StringBuffer stringBuffer = new StringBuffer(str.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        if (str2 != null) {
            try {
                Charset forName = Charset.forName(str2);
                int i2 = 0;
                boolean z = false;
                while (i2 < str.length()) {
                    char charAt2 = str.charAt(i2);
                    if (f351869a.get(charAt2)) {
                        if (charAt2 == ' ') {
                            z = true;
                        }
                        stringBuffer.append((char) charAt2);
                        i2++;
                    } else {
                        do {
                            charArrayWriter.write(charAt2);
                            if (charAt2 >= 55296 && charAt2 <= 56319 && (i = i2 + 1) < str.length() && (charAt = str.charAt(i)) >= 56320 && charAt <= 57343) {
                                charArrayWriter.write(charAt);
                                i2 = i;
                            }
                            i2++;
                            if (i2 >= str.length()) {
                                break;
                            }
                            bitSet = f351869a;
                            charAt2 = str.charAt(i2);
                        } while (!bitSet.get(charAt2));
                        charArrayWriter.flush();
                        String str3 = new String(charArrayWriter.toCharArray());
                        byte[] bytes = str3.getBytes(forName);
                        if (bytes == null) {
                            bytes = str3.getBytes();
                        }
                        for (int i3 = 0; i3 < bytes.length; i3++) {
                            stringBuffer.append('%');
                            char forDigit = Character.forDigit((bytes[i3] >> 4) & 15, 16);
                            if (Character.isLetter(forDigit)) {
                                forDigit = (char) (forDigit - ' ');
                            }
                            stringBuffer.append(forDigit);
                            char forDigit2 = Character.forDigit(bytes[i3] & 15, 16);
                            if (Character.isLetter(forDigit2)) {
                                forDigit2 = (char) (forDigit2 - ' ');
                            }
                            stringBuffer.append(forDigit2);
                        }
                        charArrayWriter.reset();
                        z = true;
                    }
                }
                return z ? stringBuffer.toString() : str;
            } catch (IllegalCharsetNameException unused) {
                throw new UnsupportedEncodingException(str2);
            } catch (UnsupportedCharsetException unused2) {
                throw new UnsupportedEncodingException(str2);
            }
        } else {
            throw new NullPointerException("charsetName");
        }
    }
}
