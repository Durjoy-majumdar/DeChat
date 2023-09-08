package uy3;

import g04.C24534e;
import gy3.C87412m;
import java.util.List;
import m04.C24980n;
import sx3.C26236u;
import sx3.C64186f0;
import wy3.C26447e;
import wy3.C26516w;

/* renamed from: uy3.d */
public final class C26374d extends C24534e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26374d(C24980n nVar, C26369b bVar) {
        super(nVar, bVar);
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(bVar, "containingClass");
    }

    /* renamed from: h */
    public List<C26516w> mo51217h() {
        C26447e eVar = this.f70116b;
        C87412m.m108592e(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int ordinal = ((C26369b) eVar).f73559j.ordinal();
        return ordinal != 0 ? ordinal != 1 ? C64186f0.f181907d : C26236u.m33719b(C26375e.f73575K.mo53362a((C26369b) this.f70116b, true)) : C26236u.m33719b(C26375e.f73575K.mo53362a((C26369b) this.f70116b, false));
    }
}
