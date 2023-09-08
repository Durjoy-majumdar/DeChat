package fz3;

import gy3.C87412m;
import jz3.C24796c;
import wy3.C26434a;
import wy3.C26447e;
import wy3.C26504r0;
import zz3.C26795i;

/* renamed from: fz3.r */
public final class C24512r implements C26795i {
    /* renamed from: a */
    public C26795i.C26797b mo51196a(C26434a aVar, C26434a aVar2, C26447e eVar) {
        C26795i.C26797b bVar = C26795i.C26797b.UNKNOWN;
        C87412m.m108594g(aVar, "superDescriptor");
        C87412m.m108594g(aVar2, "subDescriptor");
        if (!(aVar2 instanceof C26504r0) || !(aVar instanceof C26504r0)) {
            return bVar;
        }
        C26504r0 r0Var = (C26504r0) aVar2;
        C26504r0 r0Var2 = (C26504r0) aVar;
        return !C87412m.m108589b(r0Var.getName(), r0Var2.getName()) ? bVar : (!C24796c.m31212a(r0Var) || !C24796c.m31212a(r0Var2)) ? (C24796c.m31212a(r0Var) || C24796c.m31212a(r0Var2)) ? C26795i.C26797b.INCOMPATIBLE : bVar : C26795i.C26797b.OVERRIDABLE;
    }

    /* renamed from: b */
    public C26795i.C26796a mo51197b() {
        return C26795i.C26796a.BOTH;
    }
}
