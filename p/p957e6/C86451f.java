package p957e6;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: e6.f */
public class C86451f implements C86445c {
    /* renamed from: a */
    public String mo120872a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String substring = (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i])}));
            }
            String stringBuffer2 = stringBuffer.toString();
            if (TextUtils.isEmpty(substring)) {
                return stringBuffer2;
            }
            return stringBuffer2 + "." + substring;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
