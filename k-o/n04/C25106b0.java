package n04;

import java.util.HashSet;
import q04.C25526i;
import q04.C25528k;
import q04.C25530n;
import q04.C25531o;

/* renamed from: n04.b0 */
public final class C25106b0 {
    /* renamed from: a */
    public static final C25526i m31835a(C25184u1 u1Var, C25526i iVar, HashSet<C25530n> hashSet) {
        C25526i iVar2;
        C25526i iVar3;
        C25530n y = u1Var.mo52485y(iVar);
        if (!hashSet.add(y)) {
            return null;
        }
        C25531o r0 = u1Var.mo52476r0(y);
        if (r0 != null) {
            C25526i T = u1Var.mo52316T(r0);
            iVar2 = m31835a(u1Var, T, hashSet);
            if (iVar2 == null) {
                return null;
            }
            boolean z = u1Var.mo52317k0(u1Var.mo52485y(T)) || ((T instanceof C25528k) && u1Var.mo52461j((C25528k) T));
            if ((iVar2 instanceof C25528k) && u1Var.mo52461j((C25528k) iVar2) && u1Var.mo52452d0(iVar) && z) {
                iVar3 = u1Var.mo52318n0(T);
            } else if (!u1Var.mo52452d0(iVar2) && u1Var.mo52451c0(iVar)) {
                iVar3 = u1Var.mo52318n0(iVar2);
            }
            return iVar3;
        } else if (!u1Var.mo52317k0(y)) {
            return iVar;
        } else {
            C25526i s = u1Var.mo52319s(iVar);
            if (s == null || (iVar2 = m31835a(u1Var, s, hashSet)) == null) {
                return null;
            }
            if (u1Var.mo52452d0(iVar)) {
                return u1Var.mo52452d0(iVar2) ? iVar : (!(iVar2 instanceof C25528k) || !u1Var.mo52461j((C25528k) iVar2)) ? u1Var.mo52318n0(iVar2) : iVar;
            }
        }
        return iVar2;
    }
}
