package z04;

import gy3.C87412m;
import my3.C34690i;
import my3.C61594j;
import sx3.C36904l0;

/* renamed from: z04.y */
public class C112551y extends C66731x {
    /* renamed from: g */
    public static final byte[] m153807g(String str) {
        C87412m.m108594g(str, "<this>");
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: h */
    public static boolean m153808h(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m153812l(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: i */
    public static final boolean m153809i(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: j */
    public static /* synthetic */ boolean m153810j(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m153809i(str, str2, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m153811k(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            my3.j r0 = z04.C112550d0.m153806z(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            sx3.l0 r3 = (sx3.C36904l0) r3
            int r3 = r3.mo59695a()
            char r3 = r4.charAt(r3)
            boolean r3 = z04.C66713a.m78713b(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z04.C112551y.m153811k(java.lang.CharSequence):boolean");
    }

    /* renamed from: l */
    public static final boolean m153812l(String str, int i, String str2, int i2, int i3, boolean z) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: m */
    public static final String m153813m(CharSequence charSequence, int i) {
        C87412m.m108594g(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                C36904l0 i2 = new C61594j(1, i).iterator();
                while (((C34690i) i2).f93287f) {
                    i2.mo59695a();
                    sb.append(charSequence);
                }
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "{\n                    va…tring()\n                }");
                return sb4;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: n */
    public static final String m153814n(String str, String str2, String str3, boolean z) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "oldValue");
        C87412m.m108594g(str3, "newValue");
        int i = 0;
        int B = C112550d0.m153766B(str, str2, 0, z);
        if (B < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = 1;
        if (length >= 1) {
            i2 = length;
        }
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, B);
                sb.append(str3);
                i = B + length;
                if (B >= str.length() || (B = C112550d0.m153766B(str, str2, B + i2, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb4 = sb.toString();
                    C87412m.m108593f(sb4, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, B);
                sb.append(str3);
                i = B + length;
                break;
            } while ((B = C112550d0.m153766B(str, str2, B + i2, z)) <= 0);
            sb.append(str, i, str.length());
            String sb42 = sb.toString();
            C87412m.m108593f(sb42, "stringBuilder.append(this, i, length).toString()");
            return sb42;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: o */
    public static String m153815o(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        C87412m.m108594g(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            C87412m.m108593f(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (C112547b.m153763c(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder(capacity).…builderAction).toString()");
        return sb4;
    }

    /* renamed from: p */
    public static /* synthetic */ String m153816p(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m153814n(str, str2, str3, z);
    }

    /* renamed from: q */
    public static final String m153817q(String str, String str2, String str3, boolean z) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "oldValue");
        C87412m.m108594g(str3, "newValue");
        int E = C112550d0.m153769E(str, str2, 0, z, 2, (Object) null);
        return E < 0 ? str : C112550d0.m153781Q(str, E, str2.length() + E, str3).toString();
    }

    /* renamed from: r */
    public static /* synthetic */ String m153818r(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m153817q(str, str2, str3, z);
    }

    /* renamed from: s */
    public static final boolean m153819s(String str, String str2, boolean z) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m153812l(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m153820t(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m153819s(str, str2, z);
    }
}
