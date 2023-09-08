package n04;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayDeque;
import java.util.Set;
import n04.C25134i1;
import q04.C25526i;
import q04.C25528k;
import q04.C25532p;
import sx3.C110818d0;
import w04.C22850f;

/* renamed from: n04.c */
public final class C25108c {

    /* renamed from: a */
    public static final C25108c f71539a = new C25108c();

    /* renamed from: a */
    public final boolean mo52241a(C25134i1 i1Var, C25528k kVar, C25134i1.C25135b bVar) {
        C25134i1 i1Var2 = i1Var;
        C25528k kVar2 = kVar;
        C87412m.m108594g(i1Var2, "<this>");
        C87412m.m108594g(kVar2, "type");
        C25134i1.C25135b bVar2 = bVar;
        C87412m.m108594g(bVar2, "supertypesPolicy");
        C25532p pVar = i1Var2.f71577c;
        if (!((pVar.mo52446X(kVar2) && !pVar.mo52436M(kVar2)) || pVar.mo52426B(kVar2))) {
            i1Var.mo52283c();
            ArrayDeque<C25528k> arrayDeque = i1Var2.f71581g;
            C87412m.m108591d(arrayDeque);
            Set<C25528k> set = i1Var2.f71582h;
            C87412m.m108591d(set);
            arrayDeque.push(kVar2);
            while (!arrayDeque.isEmpty()) {
                C22850f fVar = (C22850f) set;
                if (fVar.f65676e <= 1000) {
                    C25528k pop = arrayDeque.pop();
                    C87412m.m108593f(pop, "current");
                    if (fVar.add(pop)) {
                        C25134i1.C25135b bVar3 = pVar.mo52436M(pop) ? C25134i1.C25135b.C25138c.f71584a : bVar2;
                        if (!(!C87412m.m108589b(bVar3, C25134i1.C25135b.C25138c.f71584a))) {
                            bVar3 = null;
                        }
                        if (bVar3 == null) {
                            continue;
                        } else {
                            C25532p pVar2 = i1Var2.f71577c;
                            for (C25526i a : pVar2.mo52428D(pVar2.mo52402e(pop))) {
                                C25528k a2 = bVar3.mo52285a(i1Var2, a);
                                if ((pVar.mo52446X(a2) && !pVar.mo52436M(a2)) || pVar.mo52426B(a2)) {
                                    i1Var.mo52281a();
                                } else {
                                    arrayDeque.add(a2);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + kVar2 + ". Supertypes = " + C110818d0.m150921S(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null)).toString());
                }
            }
            i1Var.mo52281a();
            return false;
        }
        return true;
    }
}
