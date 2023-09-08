package n04;

import q04.C25524g;
import q04.C25526i;
import q04.C25528k;
import q04.C25529m;
import q04.C25532p;

/* renamed from: n04.d */
public final class C25112d {

    /* renamed from: a */
    public static final C25112d f71547a = new C25112d();

    /* renamed from: a */
    public final boolean mo52245a(C25532p pVar, C25528k kVar, C25528k kVar2) {
        if (pVar.mo52444V(kVar) == pVar.mo52444V(kVar2) && pVar.mo52436M(kVar) == pVar.mo52436M(kVar2)) {
            if ((pVar.mo52473q(kVar) == null) == (pVar.mo52473q(kVar2) == null) && pVar.mo52431G(pVar.mo52402e(kVar), pVar.mo52402e(kVar2))) {
                if (pVar.mo52455g(kVar, kVar2)) {
                    return true;
                }
                int V = pVar.mo52444V(kVar);
                for (int i = 0; i < V; i++) {
                    C25529m t = pVar.mo52478t(kVar, i);
                    C25529m t2 = pVar.mo52478t(kVar2, i);
                    if (pVar.mo52440Q(t) != pVar.mo52440Q(t2)) {
                        return false;
                    }
                    if (!pVar.mo52440Q(t) && (pVar.mo52441R(t) != pVar.mo52441R(t2) || !mo52246b(pVar, pVar.mo52466m(t), pVar.mo52466m(t2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo52246b(C25532p pVar, C25526i iVar, C25526i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        C25528k a = pVar.mo52398a(iVar);
        C25528k a2 = pVar.mo52398a(iVar2);
        if (a != null && a2 != null) {
            return mo52245a(pVar, a, a2);
        }
        C25524g b0 = pVar.mo52450b0(iVar);
        C25524g b05 = pVar.mo52450b0(iVar2);
        return b0 != null && b05 != null && mo52245a(pVar, pVar.mo52403f(b0), pVar.mo52403f(b05)) && mo52245a(pVar, pVar.mo52399b(b0), pVar.mo52399b(b05));
    }
}
