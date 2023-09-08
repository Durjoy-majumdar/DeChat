package j34;

import java.util.regex.Pattern;

/* renamed from: j34.c */
public class C117296c {
    static {
        Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*://\\S+");
    }

    /* renamed from: a */
    public static void m165374a(String str, String str2) {
        boolean z = str != null && !str.trim().equals("");
        if (str2 == null || str2.trim().length() <= 0) {
            str2 = "Received an invalid parameter";
        }
        if (!z) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m165375b(Object obj, String str) {
        boolean z = obj != null;
        if (str == null || str.trim().length() <= 0) {
            str = "Received an invalid parameter";
        }
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
