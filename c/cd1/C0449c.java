package cd1;

import gy3.C87412m;

/* renamed from: cd1.c */
public final class C0449c {
    /* renamed from: a */
    public static final CharSequence m383a(String str, int i) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() != 0) {
            z = false;
        }
        if (z) {
            return "";
        }
        int i2 = i / 2;
        if (i2 > 0 && str.length() - i2 > 0) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, i2);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("...");
            String substring2 = str.substring(str.length() - i2, str.length());
            C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring2);
            str = sb.toString();
        }
        return str;
    }
}
