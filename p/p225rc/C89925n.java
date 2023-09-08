package p225rc;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rc.n */
public class C89925n {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = r2.indexOf(63);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m112488a(java.lang.String r2) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0007
            return r2
        L_0x0007:
            r0 = 63
            int r0 = r2.indexOf(r0)
            if (r0 >= 0) goto L_0x0010
            return r2
        L_0x0010:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p225rc.C89925n.m112488a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static Map<String, String> m112489b(String str) {
        int indexOf;
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(63)) < 0) {
            return hashMap;
        }
        int i = indexOf + 1;
        int lastIndexOf = str.lastIndexOf(38);
        int lastIndexOf2 = str.lastIndexOf(35);
        String substring = lastIndexOf2 < 0 ? str.substring(i, str.length()) : lastIndexOf2 > lastIndexOf ? i > lastIndexOf2 ? str.substring(i, str.length()) : str.substring(i, lastIndexOf2) : str.substring(i, str.length());
        if (TextUtils.isEmpty(substring)) {
            return hashMap;
        }
        int i2 = 0;
        int length = substring.length();
        while (true) {
            int indexOf2 = substring.indexOf(38, i2);
            int i3 = indexOf2 != -1 ? indexOf2 : length;
            int indexOf3 = substring.indexOf(61, i2);
            if (indexOf3 > i3 || indexOf3 == -1) {
                indexOf3 = i3;
            }
            hashMap.put(Uri.decode(substring.substring(i2, indexOf3)), indexOf3 == i3 ? "" : substring.substring(indexOf3 + 1, i3));
            if (indexOf2 == -1) {
                return hashMap;
            }
            i2 = indexOf2 + 1;
        }
    }

    /* renamed from: c */
    public static boolean m112490c(String str, String str2) {
        return str != null && str2 != null && str.length() >= 0 && str2.length() >= 0 && str2.length() <= str.length() && str2.equalsIgnoreCase(str.substring(0, str2.length()));
    }
}
