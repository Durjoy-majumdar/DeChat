package u04;

import gy3.C87412m;

/* renamed from: u04.a */
public final class C90591a {
    /* renamed from: a */
    public static final String m113487a(String str) {
        C87412m.m108594g(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    /* renamed from: b */
    public static final boolean m113488b(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        return z ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    /* renamed from: c */
    public static final String m113489c(String str) {
        C87412m.m108594g(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "builder.toString()");
        return sb4;
    }
}
