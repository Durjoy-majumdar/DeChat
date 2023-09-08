package wy3;

import gy3.C87412m;
import java.util.Map;
import tx3.C26317d;

/* renamed from: wy3.l1 */
public abstract class C26481l1 {

    /* renamed from: a */
    public final String f73772a;

    /* renamed from: b */
    public final boolean f73773b;

    public C26481l1(String str, boolean z) {
        C87412m.m108594g(str, "name");
        this.f73772a = str;
        this.f73773b = z;
    }

    /* renamed from: a */
    public Integer mo37187a(C26481l1 l1Var) {
        C87412m.m108594g(l1Var, "visibility");
        Map<C26481l1, Integer> map = C26470k1.f73762a;
        if (this == l1Var) {
            return 0;
        }
        C26317d dVar = (C26317d) C26470k1.f73762a;
        Integer num = (Integer) dVar.get(this);
        Integer num2 = (Integer) dVar.get(l1Var);
        if (num == null || num2 == null || C87412m.m108589b(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public String mo37188b() {
        return this.f73772a;
    }

    /* renamed from: c */
    public C26481l1 mo37189c() {
        return this;
    }

    public final String toString() {
        return mo37188b();
    }
}
