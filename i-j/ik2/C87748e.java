package ik2;

import androidx.exifinterface.media.ExifInterface;
import gy3.C8480h;
import gy3.C87412m;
import java.security.MessageDigest;
import z04.C112551y;

/* renamed from: ik2.e */
public final class C87748e {

    /* renamed from: a */
    public static final C87749a f254041a = new C87749a((C8480h) null);

    /* renamed from: ik2.e$a */
    public static final class C87749a {
        public C87749a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo122150a(String str) {
            C87412m.m108594g(str, "input");
            if (str.length() > 0) {
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    C87412m.m108593f(instance, "getInstance(\"SHA-256\")");
                    instance.update(C112551y.m153807g(str));
                    byte[] digest = instance.digest();
                    StringBuffer stringBuffer = new StringBuffer();
                    C87412m.m108593f(digest, "byteBuffer");
                    for (byte b : digest) {
                        String hexString = Integer.toHexString(b & ExifInterface.MARKER);
                        if (hexString.length() == 1) {
                            stringBuffer.append('0');
                        }
                        stringBuffer.append(hexString);
                    }
                    String stringBuffer2 = stringBuffer.toString();
                    C87412m.m108593f(stringBuffer2, "sb.toString()");
                    return stringBuffer2;
                } catch (Exception unused) {
                }
            }
            return "";
        }
    }
}
