package h04;

import gy3.C87412m;
import n04.C25143j0;
import wy3.C26447e;

/* renamed from: h04.b */
public final class C24599b extends C24598a {

    /* renamed from: c */
    public final C26447e f70197c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24599b(C26447e eVar, C25143j0 j0Var, C24603f fVar) {
        super(j0Var, fVar);
        C87412m.m108594g(eVar, "classDescriptor");
        C87412m.m108594g(j0Var, "receiverType");
        this.f70197c = eVar;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f70197c + " }";
    }
}
