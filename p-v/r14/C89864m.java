package r14;

import gy3.C87412m;
import z04.C112551y;

/* renamed from: r14.m */
public final class C89864m {

    /* renamed from: a */
    public static final String[] f258301a;

    static {
        String[] strArr = new String[128];
        for (int i = 0; i <= 31; i++) {
            char c = m112381c(i >> 12);
            char c2 = m112381c(i >> 8);
            char c3 = m112381c(i >> 4);
            char c4 = m112381c(i);
            strArr[i] = "\\u" + c + c2 + c3 + c4;
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f258301a = strArr;
    }

    /* renamed from: a */
    public static final void m112379a(StringBuilder sb, String str) {
        String str2;
        C87412m.m108594g(sb, "$this$printQuoted");
        C87412m.m108594g(str, "value");
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = f258301a;
            if (charAt < strArr.length && (str2 = strArr[charAt]) != null) {
                sb.append(str, i, i2);
                sb.append(str2);
                i = i2 + 1;
            }
        }
        sb.append(str, i, length);
        sb.append('\"');
    }

    /* renamed from: b */
    public static final boolean m112380b(String str) {
        C87412m.m108594g(str, "$this$toBooleanStrict");
        Boolean bool = C112551y.m153809i(str, "true", true) ? Boolean.TRUE : C112551y.m153809i(str, "false", true) ? Boolean.FALSE : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException(str + " does not represent a Boolean");
    }

    /* renamed from: c */
    public static final char m112381c(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }
}
