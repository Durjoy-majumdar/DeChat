package r14;

import gy3.C87412m;
import n14.C25205c;
import n14.C25207d;
import n14.C25217e;
import n14.C25223i;
import n14.C25226j;
import q14.C25537a;
import q14.C25541i;

/* renamed from: r14.o */
public final class C26108o {
    /* renamed from: a */
    public static final C26107n m33516a(C25537a aVar, C25217e eVar) {
        C87412m.m108594g(aVar, "$this$switchMode");
        C87412m.m108594g(eVar, "desc");
        C25223i f = eVar.mo52323f();
        if (f instanceof C25205c) {
            return C26107n.POLY_OBJ;
        }
        if (C87412m.m108589b(f, C25226j.C25228b.f71697a)) {
            return C26107n.LIST;
        }
        if (!C87412m.m108589b(f, C25226j.C25229c.f71698a)) {
            return C26107n.OBJ;
        }
        C25217e l = eVar.mo52330l(0);
        C25223i f2 = l.mo52323f();
        if ((f2 instanceof C25207d) || C87412m.m108589b(f2, C25223i.C25225b.f71695a)) {
            return C26107n.MAP;
        }
        if (aVar.f72231a.f72940d) {
            return C26107n.LIST;
        }
        throw C25541i.m33034b(l);
    }
}
