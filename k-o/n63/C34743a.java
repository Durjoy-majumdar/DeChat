package n63;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: n63.a */
public class C34743a {
    /* renamed from: a */
    public static boolean m40456a(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        String str3 = null;
        String[] split = str.split("&");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String[] split2 = split[i].split("=");
            if (split2.length > 1 && split2[0].equals("prepay_id")) {
                str3 = split2[1];
                break;
            }
            i++;
        }
        if (Util.isNullOrNil(str3)) {
            return false;
        }
        return str3.startsWith(str2);
    }
}
