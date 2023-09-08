package qy3;

import gy3.C87412m;
import rx3.C13598b0;
import wy3.C26504r0;
import wy3.C26516w;
import zy3.C26762o;

/* renamed from: qy3.a */
public class C25905a extends C26762o<C25914e<?>, C13598b0> {

    /* renamed from: a */
    public final C22167o f72248a;

    public C25905a(C22167o oVar) {
        C87412m.m108594g(oVar, "container");
        this.f72248a = oVar;
    }

    /* renamed from: a */
    public Object mo52797a(C26516w wVar, Object obj) {
        C87412m.m108594g(wVar, "descriptor");
        C87412m.m108594g((C13598b0) obj, "data");
        return new C25978s(this.f72248a, wVar);
    }

    /* renamed from: m */
    public Object mo52798m(C26504r0 r0Var, Object obj) {
        C87412m.m108594g(r0Var, "descriptor");
        C87412m.m108594g((C13598b0) obj, "data");
        int i = 0;
        int i2 = r0Var.mo52626H() != null ? 1 : 0;
        if (r0Var.mo52627I() != null) {
            i = 1;
        }
        int i3 = i2 + i;
        if (r0Var.mo52631c0()) {
            if (i3 == 0) {
                return new C25981t(this.f72248a, r0Var);
            }
            if (i3 == 1) {
                return new C25984u(this.f72248a, r0Var);
            }
            if (i3 == 2) {
                return new C25988v(this.f72248a, r0Var);
            }
        } else if (i3 == 0) {
            return new C26003z(this.f72248a, r0Var);
        } else {
            if (i3 == 1) {
                return new C25906a0(this.f72248a, r0Var);
            }
            if (i3 == 2) {
                return new C25910b0(this.f72248a, r0Var);
            }
        }
        throw new C118215l0("Unsupported property: " + r0Var);
    }
}
