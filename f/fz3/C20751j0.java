package fz3;

import gy3.C87412m;
import my3.C34690i;
import sx3.C36904l0;
import u04.C90591a;
import vz3.C22830f;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: fz3.j0 */
public final class C20751j0 {
    /* renamed from: a */
    public static C22830f m22702a(C22830f fVar, String str, boolean z, String str2, int i, Object obj) {
        Object obj2;
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!fVar.f65638e) {
            String c = fVar.mo35996c();
            C87412m.m108593f(c, "methodName.identifier");
            boolean z2 = false;
            if (C112551y.m153819s(c, str, false) && c.length() != str.length()) {
                char charAt = c.charAt(str.length());
                if (!('a' <= charAt && charAt < '{')) {
                    if (str2 != null) {
                        return C22830f.m26794f(str2 + C112550d0.m153777M(c, str));
                    } else if (!z) {
                        return fVar;
                    } else {
                        String M = C112550d0.m153777M(c, str);
                        if (!(M.length() == 0) && C90591a.m113488b(M, 0, true)) {
                            if (M.length() == 1 || !C90591a.m113488b(M, 1, true)) {
                                if (!(M.length() == 0)) {
                                    char charAt2 = M.charAt(0);
                                    if ('A' <= charAt2 && charAt2 < '[') {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        char lowerCase = Character.toLowerCase(charAt2);
                                        String substring = M.substring(1);
                                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                                        M = lowerCase + substring;
                                    }
                                }
                            } else {
                                C36904l0 i2 = C112550d0.m153806z(M).iterator();
                                while (true) {
                                    if (!((C34690i) i2).f93287f) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = i2.next();
                                    if (!C90591a.m113488b(M, ((Number) obj2).intValue(), true)) {
                                        break;
                                    }
                                }
                                Integer num = (Integer) obj2;
                                if (num != null) {
                                    int intValue = num.intValue() - 1;
                                    StringBuilder sb = new StringBuilder();
                                    String substring2 = M.substring(0, intValue);
                                    C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    sb.append(C90591a.m113489c(substring2));
                                    String substring3 = M.substring(intValue);
                                    C87412m.m108593f(substring3, "this as java.lang.String).substring(startIndex)");
                                    sb.append(substring3);
                                    M = sb.toString();
                                } else {
                                    M = C90591a.m113489c(M);
                                }
                            }
                        }
                        if (C22830f.m26795g(M)) {
                            return C22830f.m26794f(M);
                        }
                    }
                }
            }
        }
        return null;
    }
}
