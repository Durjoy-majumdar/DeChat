package hz2;

import gy3.C87412m;
import java.util.List;
import sx3.C64197v;
import uz2.C65488a0;

/* renamed from: hz2.c */
public final class C60236c {
    /* renamed from: a */
    public static final boolean m70511a(List<? extends C65488a0> list, List<? extends C65488a0> list2) {
        C87412m.m108594g(list, "<this>");
        if (list2 == null || list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C64197v.m75542k();
                throw null;
            } else if (!m70512b((C65488a0) next, (C65488a0) list2.get(i))) {
                return false;
            } else {
                i = i2;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m70512b(C65488a0 a0Var, C65488a0 a0Var2) {
        C87412m.m108594g(a0Var, "<this>");
        if (a0Var2 == null || !C87412m.m108589b(a0Var.f188439d, a0Var2.f188439d) || !C87412m.m108589b(a0Var.f188441f, a0Var2.f188441f)) {
            return false;
        }
        String str = a0Var.f188442g;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = a0Var2.f188442g;
        if (str3 != null) {
            str2 = str3;
        }
        return C87412m.m108589b(str, str2);
    }
}
