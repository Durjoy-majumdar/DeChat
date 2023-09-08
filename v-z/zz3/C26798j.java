package zz3;

import d04.C24442a;
import gy3.C87412m;
import n04.C25143j0;
import n04.C25176s0;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C26434a;
import wy3.C26447e;
import wy3.C26455f1;
import wy3.C26466i1;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26506s0;
import wy3.C26519x;

/* renamed from: zz3.j */
public final class C26798j {
    static {
        C26408b.m33992l(new C22826c("kotlin.jvm.JvmInline"));
    }

    /* renamed from: a */
    public static final boolean m35238a(C26434a aVar) {
        C87412m.m108594g(aVar, "<this>");
        if (aVar instanceof C26506s0) {
            C26504r0 u0 = ((C26506s0) aVar).mo53467u0();
            C87412m.m108593f(u0, "correspondingProperty");
            if (m35241d(u0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m35239b(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        return (kVar instanceof C26447e) && (((C26447e) kVar).mo51789K() instanceof C26519x);
    }

    /* renamed from: c */
    public static final boolean m35240c(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C22935h o = j0Var.mo37081K0().mo37094o();
        if (o != null) {
            return m35239b(o);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m35241d(C26466i1 i1Var) {
        C87412m.m108594g(i1Var, "<this>");
        if (i1Var.mo52627I() == null) {
            C26469k b = i1Var.mo51892b();
            C22830f fVar = null;
            C26447e eVar = b instanceof C26447e ? (C26447e) b : null;
            if (eVar != null) {
                int i = C24442a.f69893a;
                C26455f1<C25176s0> K = eVar.mo51789K();
                C26519x xVar = K instanceof C26519x ? (C26519x) K : null;
                if (xVar != null) {
                    fVar = xVar.f73806a;
                }
            }
            if (C87412m.m108589b(fVar, i1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final C25143j0 m35242e(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C22935h o = j0Var.mo37081K0().mo37094o();
        if (!(o instanceof C26447e)) {
            o = null;
        }
        C26447e eVar = (C26447e) o;
        if (eVar == null) {
            return null;
        }
        int i = C24442a.f69893a;
        C26455f1<C25176s0> K = eVar.mo51789K();
        C26519x xVar = K instanceof C26519x ? (C26519x) K : null;
        if (xVar != null) {
            return (C25176s0) xVar.f73807b;
        }
        return null;
    }
}
