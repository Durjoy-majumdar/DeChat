package nw3;

import android.text.TextUtils;

/* renamed from: nw3.h0 */
public class C109801h0 {
    /* renamed from: a */
    public static boolean m149216a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("client_");
    }
}
