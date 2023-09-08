package wy3;

import ez3.C24473b;
import g04.C20770i;
import gy3.C87412m;
import vz3.C22826c;
import vz3.C22830f;

/* renamed from: wy3.q */
public final class C26489q {
    /* renamed from: a */
    public static final C22935h m34174a(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        C26469k b = kVar.mo51892b();
        if (b == null || (kVar instanceof C26465i0)) {
            return null;
        }
        if (!(b.mo51892b() instanceof C26465i0)) {
            return m34174a(b);
        }
        if (b instanceof C22935h) {
            return (C22935h) b;
        }
        return null;
    }

    /* renamed from: b */
    public static final C26447e m34175b(C26448e0 e0Var, C22826c cVar, C24473b bVar) {
        C26483n nVar;
        C20770i f0;
        C87412m.m108594g(e0Var, "<this>");
        C87412m.m108594g(cVar, "fqName");
        C87412m.m108594g(bVar, "lookupLocation");
        if (cVar.mo35975d()) {
            return null;
        }
        C22826c e = cVar.mo35976e();
        C87412m.m108593f(e, "fqName.parent()");
        C20770i n = e0Var.mo52620b0(e).mo53462n();
        C22830f f = cVar.mo35978f();
        C87412m.m108593f(f, "fqName.shortName()");
        C22935h g = n.mo32462g(f, bVar);
        C26447e eVar = g instanceof C26447e ? (C26447e) g : null;
        if (eVar != null) {
            return eVar;
        }
        C22826c e2 = cVar.mo35976e();
        C87412m.m108593f(e2, "fqName.parent()");
        C26447e b = m34175b(e0Var, e2, bVar);
        if (b == null || (f0 = b.mo51797f0()) == null) {
            nVar = null;
        } else {
            C22830f f2 = cVar.mo35978f();
            C87412m.m108593f(f2, "fqName.shortName()");
            nVar = f0.mo32462g(f2, bVar);
        }
        if (nVar instanceof C26447e) {
            return (C26447e) nVar;
        }
        return null;
    }
}
