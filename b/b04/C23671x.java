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

/* renamed from: b04.x */
public final class C23671x extends C23644b0<Byte> {
    public C23671x(byte b) {
        super(Byte.valueOf(b));
    }

    /* renamed from: a */
    public C25143j0 mo37191a(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "module");
        C26447e a = C26510v.m34216a(e0Var, C26343l.C26344a.f73399S);
        C25176s0 s = a != null ? a.mo36111s() : null;
        return s == null ? C25417j.m32698c(C25416i.NOT_FOUND_UNSIGNED_TYPE, "UByte") : s;
    }

    public String toString() {
        return ((Number) this.f67839a).intValue() + ".toUByte()";
    }
}
