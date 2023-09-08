package b04;

import gy3.C87412m;
import n04.C25143j0;
import n04.C25176s0;
import wy3.C26448e0;

/* renamed from: b04.w */
public final class C23670w extends C23649g<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23670w(String str) {
        super(str);
        C87412m.m108594g(str, "value");
    }

    /* renamed from: a */
    public C25143j0 mo37191a(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "module");
        C25176s0 v = e0Var.mo52623m().mo53328v();
        C87412m.m108593f(v, "module.builtIns.stringType");
        return v;
    }

    public String toString() {
        return '\"' + ((String) this.f67839a) + '\"';
    }
}
