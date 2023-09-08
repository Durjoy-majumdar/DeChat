package b04;

import gy3.C87412m;
import n04.C25143j0;
import n04.C25176s0;
import p04.C25416i;
import p04.C25417j;
import ty3.C26343l;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26510v;

/* renamed from: b04.a0 */
public final class C23642a0 extends C23644b0<Short> {
    public C23642a0(short s) {
        super(Short.valueOf(s));
    }

    /* renamed from: a */
    public C25143j0 mo37191a(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "module");
        C26447e a = C26510v.m34216a(e0Var, C26343l.C26344a.f73400T);
        C25176s0 s = a != null ? a.mo36111s() : null;
        return s == null ? C25417j.m32698c(C25416i.NOT_FOUND_UNSIGNED_TYPE, "UShort") : s;
    }

    public String toString() {
        return ((Number) this.f67839a).intValue() + ".toUShort()";
    }
}
