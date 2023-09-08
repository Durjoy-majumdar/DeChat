package zz3;

import fy3.C32227p;
import gy3.C87412m;
import java.util.Collection;
import n04.C25143j0;
import o04.C25320d;
import o04.C25323e;
import sx3.C110818d0;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26438b0;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26465i0;
import wy3.C26469k;
import wy3.C26521y0;
import zz3.C26802n;

/* renamed from: zz3.f */
public final class C26791f {

    /* renamed from: a */
    public static final C26791f f74522a = new C26791f();

    /* renamed from: a */
    public final boolean mo53755a(C26469k kVar, C26469k kVar2, boolean z, boolean z2) {
        if ((kVar instanceof C26447e) && (kVar2 instanceof C26447e)) {
            return C87412m.m108589b(((C26447e) kVar).mo36110l(), ((C26447e) kVar2).mo36110l());
        }
        if ((kVar instanceof C26446d1) && (kVar2 instanceof C26446d1)) {
            return mo53756b((C26446d1) kVar, (C26446d1) kVar2, z, C112693e.f337415d);
        }
        if (!(kVar instanceof C26434a) || !(kVar2 instanceof C26434a)) {
            return (!(kVar instanceof C26465i0) || !(kVar2 instanceof C26465i0)) ? C87412m.m108589b(kVar, kVar2) : C87412m.m108589b(((C26465i0) kVar).mo53444d(), ((C26465i0) kVar2).mo53444d());
        }
        C26434a aVar = (C26434a) kVar;
        C26434a aVar2 = (C26434a) kVar2;
        C25323e.C25324a aVar3 = C25323e.C25324a.f71823a;
        C87412m.m108594g(aVar, "a");
        C87412m.m108594g(aVar2, "b");
        C87412m.m108594g(aVar3, "kotlinTypeRefiner");
        if (C87412m.m108589b(aVar, aVar2)) {
            return true;
        }
        if (C87412m.m108589b(aVar.getName(), aVar2.getName()) && ((!z2 || !(aVar instanceof C26438b0) || !(aVar2 instanceof C26438b0) || ((C26438b0) aVar).mo51792P() == ((C26438b0) aVar2).mo51792P()) && ((!C87412m.m108589b(aVar.mo51892b(), aVar2.mo51892b()) || (z && C87412m.m108589b(mo53758d(aVar), mo53758d(aVar2)))) && !C26794h.m35228p(aVar) && !C26794h.m35228p(aVar2) && mo53757c(aVar, aVar2, C112692c.f337414d, z)))) {
            C26802n nVar = new C26802n(new C26789d(z, aVar, aVar2), aVar3, C25320d.C25321a.f71822a, (C32227p<C25143j0, C25143j0, Boolean>) null);
            C26802n.C26805c.C26806a c = nVar.mo53765m(aVar, aVar2, (C26447e) null, true).mo53767c();
            C26802n.C26805c.C26806a aVar4 = C26802n.C26805c.C26806a.OVERRIDABLE;
            return c == aVar4 && nVar.mo53765m(aVar2, aVar, (C26447e) null, true).mo53767c() == aVar4;
        }
    }

    /* renamed from: b */
    public final boolean mo53756b(C26446d1 d1Var, C26446d1 d1Var2, boolean z, C32227p<? super C26469k, ? super C26469k, Boolean> pVar) {
        C87412m.m108594g(d1Var, "a");
        C87412m.m108594g(d1Var2, "b");
        C87412m.m108594g(pVar, "equivalentCallables");
        if (C87412m.m108589b(d1Var, d1Var2)) {
            return true;
        }
        return !C87412m.m108589b(d1Var.mo51892b(), d1Var2.mo51892b()) && mo53757c(d1Var, d1Var2, pVar, z) && d1Var.getIndex() == d1Var2.getIndex();
    }

    /* renamed from: c */
    public final boolean mo53757c(C26469k kVar, C26469k kVar2, C32227p<? super C26469k, ? super C26469k, Boolean> pVar, boolean z) {
        C26469k b = kVar.mo51892b();
        C26469k b2 = kVar2.mo51892b();
        return ((b instanceof C26436b) || (b2 instanceof C26436b)) ? pVar.invoke(b, b2).booleanValue() : mo53755a(b, b2, z, true);
    }

    /* renamed from: d */
    public final C26521y0 mo53758d(C26434a aVar) {
        while (aVar instanceof C26436b) {
            C26436b bVar = (C26436b) aVar;
            if (bVar.mo52634f() != C26436b.C26437a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends C26436b> e = bVar.mo52633e();
            C87412m.m108593f(e, "overriddenDescriptors");
            aVar = (C26436b) C110818d0.m150939k0(e);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.getSource();
    }
}
