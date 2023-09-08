package az3;

import gy3.C87412m;
import java.util.Map;
import wy3.C26470k1;
import wy3.C26481l1;

/* renamed from: az3.b */
public final class C23638b extends C26481l1 {

    /* renamed from: c */
    public static final C23638b f67834c = new C23638b();

    public C23638b() {
        super("protected_and_package", true);
    }

    /* renamed from: a */
    public Integer mo37187a(C26481l1 l1Var) {
        C87412m.m108594g(l1Var, "visibility");
        boolean z = false;
        if (C87412m.m108589b(this, l1Var)) {
            return 0;
        }
        if (l1Var == C26470k1.C26472b.f73764c) {
            return null;
        }
        Map<C26481l1, Integer> map = C26470k1.f73762a;
        int i = 1;
        if (l1Var == C26470k1.C26475e.f73767c || l1Var == C26470k1.C26476f.f73768c) {
            z = true;
        }
        if (!z) {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: b */
    public String mo37188b() {
        return "protected/*protected and package*/";
    }

    /* renamed from: c */
    public C26481l1 mo37189c() {
        return C26470k1.C26477g.f73769c;
    }
}
