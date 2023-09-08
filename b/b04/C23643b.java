package b04;

import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import n04.C25143j0;
import ty3.C26336h;
import ty3.C26343l;
import wy3.C26448e0;

/* renamed from: b04.b */
public class C23643b extends C23649g<List<? extends C23649g<?>>> {

    /* renamed from: b */
    public final C32226l<C26448e0, C25143j0> f67836b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23643b(List<? extends C23649g<?>> list, C32226l<? super C26448e0, ? extends C25143j0> lVar) {
        super(list);
        C87412m.m108594g(list, "value");
        C87412m.m108594g(lVar, "computeType");
        this.f67836b = lVar;
    }

    /* renamed from: a */
    public C25143j0 mo37191a(C26448e0 e0Var) {
        C87412m.m108594g(e0Var, "module");
        C25143j0 invoke = this.f67836b.invoke(e0Var);
        if (!C26336h.m33842z(invoke) && !C26336h.m33830G(invoke) && !C26336h.m33826C(invoke, C26343l.C26344a.f73403W.mo35982i()) && !C26336h.m33826C(invoke, C26343l.C26344a.f73404X.mo35982i()) && !C26336h.m33826C(invoke, C26343l.C26344a.f73405Y.mo35982i())) {
            C26336h.m33826C(invoke, C26343l.C26344a.f73406Z.mo35982i());
        }
        return invoke;
    }
}
