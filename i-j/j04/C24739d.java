package j04;

import b04.C23649g;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import i04.C24617a;
import j04.C24736c0;
import java.util.ArrayList;
import java.util.List;
import n04.C25143j0;
import qz3.C26009b;
import qz3.C26023d;
import qz3.C26034g;
import qz3.C26041i;
import qz3.C26052n;
import qz3.C26065q;
import qz3.C26075s;
import qz3.C26082u;
import sx3.C36907w;
import sx3.C64186f0;
import sz3.C26243c;
import sz3.C26245e;
import wy3.C26448e0;
import wy3.C26458h0;
import xy3.C26566c;
import xz3.C26607p;

/* renamed from: j04.d */
public final class C24739d implements C24735c<C26566c, C23649g<?>> {

    /* renamed from: a */
    public final C24617a f70585a;

    /* renamed from: b */
    public final C24742e f70586b;

    public C24739d(C26448e0 e0Var, C26458h0 h0Var, C24617a aVar) {
        C87412m.m108594g(e0Var, "module");
        C87412m.m108594g(h0Var, "notFoundClasses");
        C87412m.m108594g(aVar, "protocol");
        this.f70585a = aVar;
        this.f70586b = new C24742e(e0Var, h0Var);
    }

    /* renamed from: a */
    public List<C26566c> mo51715a(C24736c0 c0Var, C26052n nVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        return C64186f0.f181907d;
    }

    /* renamed from: b */
    public Object mo51711b(C24736c0 c0Var, C26052n nVar, C25143j0 j0Var) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(j0Var, "expectedType");
        C26009b.C26011b.C26014c cVar = (C26009b.C26011b.C26014c) C26245e.m33733a(nVar, this.f70585a.f70228i);
        if (cVar == null) {
            return null;
        }
        return this.f70586b.mo51727c(j0Var, cVar, c0Var.f70576a);
    }

    /* renamed from: c */
    public List<C26566c> mo51716c(C26065q qVar, C26243c cVar) {
        C87412m.m108594g(qVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        Iterable<C26009b> iterable = (List) qVar.mo53571f(this.f70585a.f70230k);
        if (iterable == null) {
            iterable = C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (C26009b a : iterable) {
            arrayList.add(this.f70586b.mo51725a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<C26566c> mo51717d(C24736c0 c0Var, C26607p pVar, C24733b bVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(pVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(bVar, "kind");
        return C64186f0.f181907d;
    }

    /* renamed from: e */
    public List<C26566c> mo51718e(C24736c0.C24737a aVar) {
        C87412m.m108594g(aVar, "container");
        Iterable<C26009b> iterable = (List) aVar.f70579d.mo53571f(this.f70585a.f70222c);
        if (iterable == null) {
            iterable = C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (C26009b a : iterable) {
            arrayList.add(this.f70586b.mo51725a(a, aVar.f70576a));
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<C26566c> mo51719f(C24736c0 c0Var, C26607p pVar, C24733b bVar) {
        Iterable<C26009b> iterable;
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(pVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(bVar, "kind");
        if (pVar instanceof C26023d) {
            iterable = (List) ((C26023d) pVar).mo53571f(this.f70585a.f70221b);
        } else if (pVar instanceof C26041i) {
            iterable = (List) ((C26041i) pVar).mo53571f(this.f70585a.f70223d);
        } else if (pVar instanceof C26052n) {
            int ordinal = bVar.ordinal();
            if (ordinal == 1) {
                iterable = (List) ((C26052n) pVar).mo53571f(this.f70585a.f70224e);
            } else if (ordinal == 2) {
                iterable = (List) ((C26052n) pVar).mo53571f(this.f70585a.f70225f);
            } else if (ordinal == 3) {
                iterable = (List) ((C26052n) pVar).mo53571f(this.f70585a.f70226g);
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + pVar).toString());
        }
        if (iterable == null) {
            iterable = C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (C26009b a : iterable) {
            arrayList.add(this.f70586b.mo51725a(a, c0Var.f70576a));
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<C26566c> mo51720g(C26075s sVar, C26243c cVar) {
        C87412m.m108594g(sVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(cVar, "nameResolver");
        Iterable<C26009b> iterable = (List) sVar.mo53571f(this.f70585a.f70231l);
        if (iterable == null) {
            iterable = C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (C26009b a : iterable) {
            arrayList.add(this.f70586b.mo51725a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: h */
    public List<C26566c> mo51721h(C24736c0 c0Var, C26034g gVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(gVar, TPReportKeys.Common.COMMON_PROTO);
        Iterable<C26009b> iterable = (List) gVar.mo53571f(this.f70585a.f70227h);
        if (iterable == null) {
            iterable = C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (C26009b a : iterable) {
            arrayList.add(this.f70586b.mo51725a(a, c0Var.f70576a));
        }
        return arrayList;
    }

    /* renamed from: i */
    public Object mo51712i(C24736c0 c0Var, C26052n nVar, C25143j0 j0Var) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        C87412m.m108594g(j0Var, "expectedType");
        return null;
    }

    /* renamed from: j */
    public List<C26566c> mo51722j(C24736c0 c0Var, C26607p pVar, C24733b bVar, int i, C26082u uVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(pVar, "callableProto");
        C87412m.m108594g(bVar, "kind");
        C87412m.m108594g(uVar, TPReportKeys.Common.COMMON_PROTO);
        Iterable<C26009b> iterable = (List) uVar.mo53571f(this.f70585a.f70229j);
        if (iterable == null) {
            iterable = C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(C36907w.m41090l(iterable, 10));
        for (C26009b a : iterable) {
            arrayList.add(this.f70586b.mo51725a(a, c0Var.f70576a));
        }
        return arrayList;
    }

    /* renamed from: k */
    public List<C26566c> mo51723k(C24736c0 c0Var, C26052n nVar) {
        C87412m.m108594g(c0Var, "container");
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        return C64186f0.f181907d;
    }
}
