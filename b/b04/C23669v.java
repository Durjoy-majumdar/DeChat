package b04;

import gy3.C87412m;
import n04.C25143j0;
import n04.C25176s0;
import ty3.C22558j;
import ty3.C26336h;
import wy3.C26448e0;

/* renamed from: b04.v */
public final class C23669v extends C23661q<Short> {
    public C23669v(short s) {
        super(Short.valueOf(s));
    }

    /* renamed from: a */
    public C25143j0 mo37191a(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "module");
        C26336h m = e0Var.mo52623m();
        m.getClass();
        C25176s0 t = m.mo53327t(C22558j.SHORT);
        if (t != null) {
            return t;
        }
        C26336h.m33836a(57);
        throw null;
    }

    public String toString() {
        return ((Number) this.f67839a).intValue() + ".toShort()";
    }
}
