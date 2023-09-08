package o04;

import fy3.C32224a;
import g04.C20770i;
import gy3.C87412m;
import java.util.Collection;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25156m;
import q04.C25526i;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26469k;

/* renamed from: o04.e */
public abstract class C25323e extends C25156m {

    /* renamed from: o04.e$a */
    public static final class C25324a extends C25323e {

        /* renamed from: a */
        public static final C25324a f71823a = new C25324a();

        /* renamed from: a */
        public C25526i mo52294a(C25526i iVar) {
            C87412m.m108594g(iVar, "type");
            return (C25143j0) iVar;
        }

        /* renamed from: b */
        public C26447e mo52408b(C26408b bVar) {
            C87412m.m108594g(bVar, "classId");
            return null;
        }

        /* renamed from: c */
        public <S extends C20770i> S mo52409c(C26447e eVar, C32224a<? extends S> aVar) {
            C87412m.m108594g(eVar, "classDescriptor");
            C87412m.m108594g(aVar, "compute");
            return (C20770i) aVar.invoke();
        }

        /* renamed from: d */
        public boolean mo52410d(C26448e0 e0Var) {
            C87412m.m108594g(e0Var, "moduleDescriptor");
            return false;
        }

        /* renamed from: e */
        public boolean mo52411e(C25144j1 j1Var) {
            C87412m.m108594g(j1Var, "typeConstructor");
            return false;
        }

        /* renamed from: f */
        public C22935h mo52412f(C26469k kVar) {
            C87412m.m108594g(kVar, "descriptor");
            return null;
        }

        /* renamed from: g */
        public Collection<C25143j0> mo52413g(C26447e eVar) {
            C87412m.m108594g(eVar, "classDescriptor");
            Collection<C25143j0> r = eVar.mo36110l().mo37096r();
            C87412m.m108593f(r, "classDescriptor.typeConstructor.supertypes");
            return r;
        }

        /* renamed from: h */
        public C25143j0 mo52414h(C25526i iVar) {
            C87412m.m108594g(iVar, "type");
            return (C25143j0) iVar;
        }
    }

    /* renamed from: b */
    public abstract C26447e mo52408b(C26408b bVar);

    /* renamed from: c */
    public abstract <S extends C20770i> S mo52409c(C26447e eVar, C32224a<? extends S> aVar);

    /* renamed from: d */
    public abstract boolean mo52410d(C26448e0 e0Var);

    /* renamed from: e */
    public abstract boolean mo52411e(C25144j1 j1Var);

    /* renamed from: f */
    public abstract C22935h mo52412f(C26469k kVar);

    /* renamed from: g */
    public abstract Collection<C25143j0> mo52413g(C26447e eVar);

    /* renamed from: h */
    public abstract C25143j0 mo52414h(C25526i iVar);
}
