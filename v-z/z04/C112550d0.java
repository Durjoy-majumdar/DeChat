package z04;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import my3.C34690i;
import my3.C61593h;
import my3.C61594j;
import sx3.C110821n;
import sx3.C110823p;
import sx3.C26236u;
import sx3.C36904l0;
import sx3.C36907w;
import y04.C112353q;
import y04.C112354s;
import y04.C15925h;

/* renamed from: z04.d0 */
public class C112550d0 extends C112551y {
    /* renamed from: A */
    public static final int m153765A(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: B */
    public static final int m153766B(CharSequence charSequence, String str, int i, boolean z) {
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m153767C(charSequence, str, i, charSequence.length(), z, false);
    }

    /* renamed from: C */
    public static final int m153767C(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C61593h hVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            hVar = new C61594j(i, i2);
        } else {
            int A = m153765A(charSequence);
            if (i > A) {
                i = A;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            hVar = new C61593h(i, i2, -1);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = hVar.f175174d;
            int i4 = hVar.f175175e;
            int i5 = hVar.f175176f;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!m153776L(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        return i3;
                    }
                }
            }
        } else {
            int i6 = hVar.f175174d;
            int i7 = hVar.f175175e;
            int i8 = hVar.f175176f;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (!C112551y.m153812l((String) charSequence2, 0, (String) charSequence, i6, charSequence2.length(), z)) {
                        if (i6 == i7) {
                            break;
                        }
                        i6 += i8;
                    } else {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: D */
    public static int m153768D(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C87412m.m108594g(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m153770F(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: E */
    public static /* synthetic */ int m153769E(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m153766B(charSequence, str, i, z);
    }

    /* renamed from: F */
    public static final int m153770F(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            C36904l0 i2 = new C61594j(i, m153765A(charSequence)).iterator();
            while (((C34690i) i2).f93287f) {
                int a = i2.mo59695a();
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C112547b.m153763c(cArr[i3], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return a;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C110823p.m150992R(cArr), i);
    }

    /* renamed from: G */
    public static int m153771G(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        boolean z2;
        if ((i2 & 2) != 0) {
            i = m153765A(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        C87412m.m108594g(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (z || !(charSequence instanceof String)) {
            int A = m153765A(charSequence);
            if (i > A) {
                i = A;
            }
            while (-1 < i) {
                char charAt = charSequence.charAt(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= 1) {
                        z2 = false;
                        break;
                    } else if (C112547b.m153763c(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C110823p.m150992R(cArr), i);
    }

    /* renamed from: H */
    public static int m153772H(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m153765A(charSequence);
        }
        int i3 = i;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(str, "string");
        return (z2 || !(charSequence instanceof String)) ? m153767C(charSequence, str, i3, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    /* renamed from: I */
    public static final List<String> m153773I(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "<this>");
        return C112354s.m153296s(C112354s.m153290m(m153775K(charSequence, new String[]{APLogFileUtil.SEPARATOR_LINE, "\n", "\r"}, 0, false, 0, 2, (Object) null), new C39295b0(charSequence)));
    }

    /* renamed from: J */
    public static C15925h m153774J(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        m153782R(i2);
        return new C112548d(charSequence, i, i2, new C39299z(cArr, z));
    }

    /* renamed from: K */
    public static C15925h m153775K(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        m153782R(i2);
        return new C112548d(charSequence, i, i2, new C66714a0(C110821n.m150958e(strArr), z));
    }

    /* renamed from: L */
    public static final boolean m153776L(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C112547b.m153763c(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public static final String m153777M(String str, CharSequence charSequence) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(charSequence, "prefix");
        if (!m153788X(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: N */
    public static final CharSequence m153778N(CharSequence charSequence, int i, int i2) {
        C87412m.m108594g(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
    }

    /* renamed from: O */
    public static final CharSequence m153779O(CharSequence charSequence, CharSequence charSequence2) {
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(charSequence2, "suffix");
        return m153805y(charSequence, charSequence2, false, 2, (Object) null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    /* renamed from: P */
    public static final String m153780P(String str, CharSequence charSequence) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(charSequence, "suffix");
        if (!m153805y(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: Q */
    public static final CharSequence m153781Q(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* renamed from: R */
    public static final void m153782R(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: S */
    public static final List<String> m153783S(CharSequence charSequence, String str, boolean z, int i) {
        m153782R(i);
        int i2 = 0;
        int B = m153766B(charSequence, str, 0, z);
        if (B == -1 || i == 1) {
            return C26236u.m33719b(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2 && i <= 10) {
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, B).toString());
            i2 = str.length() + B;
            if ((z2 && arrayList.size() == i - 1) || (B = m153766B(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, B).toString());
            i2 = str.length() + B;
            break;
        } while ((B = m153766B(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: T */
    public static List m153784T(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(cArr, "delimiters");
        if (cArr.length == 1) {
            return m153783S(charSequence, String.valueOf(cArr[0]), z2, i3);
        }
        C112353q qVar = new C112353q(m153774J(charSequence, cArr, 0, z2, i3, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C36907w.m41090l(qVar, 10));
        Iterator<Object> it = qVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m153789Y(charSequence, (C61594j) it.next()));
        }
        return arrayList;
    }

    /* renamed from: U */
    public static List m153785U(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        boolean z2 = false;
        boolean z3 = (i2 & 2) != 0 ? false : z;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return m153783S(charSequence, str, z3, i3);
            }
        }
        C112353q qVar = new C112353q(m153775K(charSequence, strArr, 0, z3, i3, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C36907w.m41090l(qVar, 10));
        Iterator<Object> it = qVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m153789Y(charSequence, (C61594j) it.next()));
        }
        return arrayList;
    }

    /* renamed from: V */
    public static C15925h m153786V(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(cArr, "delimiters");
        return C112354s.m153290m(m153774J(charSequence, cArr, 0, z2, i3, 2, (Object) null), new C39296c0(charSequence));
    }

    /* renamed from: W */
    public static boolean m153787W(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        C87412m.m108594g(charSequence, "<this>");
        return charSequence.length() > 0 && C112547b.m153763c(charSequence.charAt(0), c, z);
    }

    /* renamed from: X */
    public static boolean m153788X(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean z2 = (i & 2) != 0 ? false : z;
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(charSequence2, "prefix");
        if (!z2 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C112551y.m153819s((String) charSequence, (String) charSequence2, false);
        }
        return m153776L(charSequence, 0, charSequence2, 0, charSequence2.length(), z2);
    }

    /* renamed from: Y */
    public static final String m153789Y(CharSequence charSequence, C61594j jVar) {
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(jVar, "range");
        return charSequence.subSequence(jVar.mo59687f0().intValue(), jVar.mo59688g0().intValue() + 1).toString();
    }

    /* renamed from: Z */
    public static final String m153790Z(String str, C61594j jVar) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(jVar, "range");
        String substring = str.substring(jVar.mo59687f0().intValue(), jVar.mo59688g0().intValue() + 1);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a0 */
    public static final String m153791a0(String str, String str2, String str3) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "delimiter");
        C87412m.m108594g(str3, "missingDelimiterValue");
        int E = m153769E(str, str2, 0, false, 6, (Object) null);
        if (E == -1) {
            return str3;
        }
        String substring = str.substring(E + str2.length(), str.length());
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b0 */
    public static String m153792b0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "missingDelimiterValue");
        int D = m153768D(str, c, 0, false, 6, (Object) null);
        if (D == -1) {
            return str2;
        }
        String substring = str.substring(D + 1, str.length());
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c0 */
    public static final String m153793c0(String str, char c, String str2) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "missingDelimiterValue");
        int G = m153771G(str, c, 0, false, 6, (Object) null);
        if (G == -1) {
            return str2;
        }
        String substring = str.substring(G + 1, str.length());
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d0 */
    public static final String m153794d0(String str, String str2, String str3) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "delimiter");
        C87412m.m108594g(str3, "missingDelimiterValue");
        int H = m153772H(str, str2, 0, false, 6, (Object) null);
        if (H == -1) {
            return str3;
        }
        String substring = str.substring(H + str2.length(), str.length());
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e0 */
    public static final String m153795e0(String str, String str2, String str3) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "delimiter");
        C87412m.m108594g(str3, "missingDelimiterValue");
        int E = m153769E(str, str2, 0, false, 6, (Object) null);
        if (E == -1) {
            return str3;
        }
        String substring = str.substring(0, E);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: f0 */
    public static String m153796f0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "missingDelimiterValue");
        int D = m153768D(str, c, 0, false, 6, (Object) null);
        if (D == -1) {
            return str2;
        }
        String substring = str.substring(0, D);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g0 */
    public static final String m153797g0(String str, String str2, String str3) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "delimiter");
        C87412m.m108594g(str3, "missingDelimiterValue");
        int H = m153772H(str, str2, 0, false, 6, (Object) null);
        if (H == -1) {
            return str3;
        }
        String substring = str.substring(0, H);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: h0 */
    public static String m153798h0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "missingDelimiterValue");
        int G = m153771G(str, c, 0, false, 6, (Object) null);
        if (G == -1) {
            return str2;
        }
        String substring = str.substring(0, G);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: i0 */
    public static final CharSequence m153799i0(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean b = C66713a.m78713b(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!b) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!b) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: j0 */
    public static final String m153800j0(String str, char... cArr) {
        Object obj;
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C110823p.m151007w(cArr, str.charAt(length))) {
                    obj = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return obj.toString();
        }
        obj = "";
        return obj.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m153801u(java.lang.CharSequence r7, java.lang.CharSequence r8, boolean r9) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "other"
            gy3.C87412m.m108594g(r8, r0)
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x001d
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r4 = r9
            int r7 = m153769E(r1, r2, r3, r4, r5, r6)
            if (r7 < 0) goto L_0x002e
            goto L_0x002c
        L_0x001d:
            r2 = 0
            int r3 = r7.length()
            r5 = 0
            r0 = r7
            r1 = r8
            r4 = r9
            int r7 = m153767C(r0, r1, r2, r3, r4, r5)
            if (r7 < 0) goto L_0x002e
        L_0x002c:
            r7 = 1
            goto L_0x002f
        L_0x002e:
            r7 = 0
        L_0x002f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z04.C112550d0.m153801u(java.lang.CharSequence, java.lang.CharSequence, boolean):boolean");
    }

    /* renamed from: v */
    public static boolean m153802v(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        boolean z2 = (i & 2) != 0 ? false : z;
        C87412m.m108594g(charSequence, "<this>");
        return m153768D(charSequence, c, 0, z2, 2, (Object) null) >= 0;
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m153803w(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m153801u(charSequence, charSequence2, z);
    }

    /* renamed from: x */
    public static boolean m153804x(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        C87412m.m108594g(charSequence, "<this>");
        return charSequence.length() > 0 && C112547b.m153763c(charSequence.charAt(m153765A(charSequence)), c, z);
    }

    /* renamed from: y */
    public static boolean m153805y(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean z2 = (i & 2) != 0 ? false : z;
        C87412m.m108594g(charSequence, "<this>");
        C87412m.m108594g(charSequence2, "suffix");
        if (!z2 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C112551y.m153808h((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m153776L(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z2);
    }

    /* renamed from: z */
    public static final C61594j m153806z(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "<this>");
        return new C61594j(0, charSequence.length() - 1);
    }
}
