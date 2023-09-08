package s04;

import a04.C23605b;
import d04.C24442a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n04.C25119f0;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25158m1;
import n04.C25164o1;
import n04.C25174r1;
import n04.C25176s0;
import n04.C25180t1;
import n04.C25187v1;
import n04.C25194x1;
import n04.C25202z1;
import o04.C25318c;
import o04.C25332l;
import r04.C26094c;
import rx3.C13603j;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36907w;
import ty3.C26336h;
import wy3.C26446d1;
import xy3.C26571h;

/* renamed from: s04.d */
public final class C26157d {
    /* renamed from: a */
    public static final C36615a<C25143j0> m33577a(C25143j0 j0Var) {
        Object obj;
        C26158e eVar;
        C87412m.m108594g(j0Var, "type");
        if (C25119f0.m31892b(j0Var)) {
            C36615a<C25143j0> a = m33577a(C25119f0.m31893c(j0Var));
            C36615a<C25143j0> a2 = m33577a(C25119f0.m31894d(j0Var));
            return new C36615a<>(C25194x1.m32121b(C25146k0.m31957c(C25119f0.m31893c((C25143j0) a.f97346a), C25119f0.m31894d((C25143j0) a2.f97346a)), j0Var), C25194x1.m32121b(C25146k0.m31957c(C25119f0.m31893c((C25143j0) a.f97347b), C25119f0.m31894d((C25143j0) a2.f97347b)), j0Var));
        }
        C25144j1 K0 = j0Var.mo37081K0();
        boolean z = true;
        if (j0Var.mo37081K0() instanceof C23605b) {
            C87412m.m108592e(K0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            C25158m1 projection = ((C23605b) K0).getProjection();
            C25143j0 type = projection.getType();
            C87412m.m108593f(type, "typeProjection.type");
            C25143j0 k = C25187v1.m32091k(type, j0Var.mo37082L0());
            C87412m.m108593f(k, "makeNullableIfNeeded(this, type.isMarkedNullable)");
            int ordinal = projection.mo52295a().ordinal();
            if (ordinal == 1) {
                C25176s0 p = C26094c.m33425e(j0Var).mo53324p();
                C87412m.m108593f(p, "type.builtIns.nullableAnyType");
                return new C36615a<>(k, p);
            } else if (ordinal == 2) {
                C25176s0 o = C26094c.m33425e(j0Var).mo53323o();
                C87412m.m108593f(o, "type.builtIns.nothingType");
                C25143j0 k2 = C25187v1.m32091k(o, j0Var.mo37082L0());
                C87412m.m108593f(k2, "makeNullableIfNeeded(this, type.isMarkedNullable)");
                return new C36615a<>(k2, k);
            } else {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
            }
        } else if (j0Var.mo37079I0().isEmpty() || j0Var.mo37079I0().size() != K0.getParameters().size()) {
            return new C36615a<>(j0Var, j0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<C25158m1> I0 = j0Var.mo37079I0();
            List<C26446d1> parameters = K0.getParameters();
            C87412m.m108593f(parameters, "typeConstructor.parameters");
            Iterator it = ((ArrayList) C110818d0.m150908F0(I0, parameters)).iterator();
            while (it.hasNext()) {
                C13604l lVar = (C13604l) it.next();
                C25158m1 m1Var = (C25158m1) lVar.f38555d;
                C26446d1 d1Var = (C26446d1) lVar.f38556e;
                C87412m.m108593f(d1Var, "typeParameter");
                C25202z1 o2 = d1Var.mo53423o();
                if (o2 == null) {
                    C25180t1.m32040a(35);
                    throw null;
                } else if (m1Var != null) {
                    C25180t1 t1Var = C25180t1.f71631b;
                    int ordinal2 = (m1Var.mo52296b() ? C25202z1.OUT_VARIANCE : C25180t1.m32041b(o2, m1Var.mo52295a())).ordinal();
                    if (ordinal2 == 0) {
                        C25143j0 type2 = m1Var.getType();
                        C87412m.m108593f(type2, "type");
                        C25143j0 type3 = m1Var.getType();
                        C87412m.m108593f(type3, "type");
                        eVar = new C26158e(d1Var, type2, type3);
                    } else if (ordinal2 == 1) {
                        C25143j0 type4 = m1Var.getType();
                        C87412m.m108593f(type4, "type");
                        C25176s0 p2 = C24442a.m30538e(d1Var).mo53324p();
                        C87412m.m108593f(p2, "typeParameter.builtIns.nullableAnyType");
                        eVar = new C26158e(d1Var, type4, p2);
                    } else if (ordinal2 == 2) {
                        C25176s0 o3 = C24442a.m30538e(d1Var).mo53323o();
                        C87412m.m108593f(o3, "typeParameter.builtIns.nothingType");
                        C25143j0 type5 = m1Var.getType();
                        C87412m.m108593f(type5, "type");
                        eVar = new C26158e(d1Var, o3, type5);
                    } else {
                        throw new C13603j();
                    }
                    if (m1Var.mo52296b()) {
                        arrayList.add(eVar);
                        arrayList2.add(eVar);
                    } else {
                        C36615a<C25143j0> a3 = m33577a(eVar.f73092b);
                        C36615a<C25143j0> a4 = m33577a(eVar.f73093c);
                        C26158e eVar2 = new C26158e(eVar.f73091a, (C25143j0) a3.f97347b, (C25143j0) a4.f97346a);
                        C26158e eVar3 = new C26158e(eVar.f73091a, (C25143j0) a3.f97346a, (C25143j0) a4.f97347b);
                        arrayList.add(eVar2);
                        arrayList2.add(eVar3);
                    }
                } else {
                    C25180t1.m32040a(36);
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C26158e eVar4 = (C26158e) it4.next();
                    eVar4.getClass();
                    if (!((C25332l) C25318c.f71821a).mo52423d(eVar4.f73092b, eVar4.f73093c)) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                obj = C26094c.m33425e(j0Var).mo53323o();
                C87412m.m108593f(obj, "type.builtIns.nothingType");
            } else {
                obj = m33578b(j0Var, arrayList);
            }
            return new C36615a<>(obj, m33578b(j0Var, arrayList2));
        }
    }

    /* renamed from: b */
    public static final C25143j0 m33578b(C25143j0 j0Var, List<C26158e> list) {
        C25164o1 o1Var;
        C25202z1 z1Var;
        C25202z1 z1Var2 = C25202z1.INVARIANT;
        j0Var.mo37079I0().size();
        list.size();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C26158e eVar : list) {
            C25202z1 z1Var3 = C25202z1.OUT_VARIANCE;
            eVar.getClass();
            ((C25332l) C25318c.f71821a).mo52423d(eVar.f73092b, eVar.f73093c);
            if (C87412m.m108589b(eVar.f73092b, eVar.f73093c) || eVar.f73091a.mo53423o() == (z1Var = C25202z1.IN_VARIANCE)) {
                o1Var = new C25164o1(eVar.f73092b);
            } else if (!C26336h.m33829F(eVar.f73092b) || eVar.f73091a.mo53423o() == z1Var) {
                C25143j0 j0Var2 = eVar.f73093c;
                if (j0Var2 != null) {
                    if (C26336h.m33841y(j0Var2) && j0Var2.mo37082L0()) {
                        if (z1Var == eVar.f73091a.mo53423o()) {
                            z1Var = z1Var2;
                        }
                        o1Var = new C25164o1(z1Var, eVar.f73092b);
                    } else {
                        if (z1Var3 == eVar.f73091a.mo53423o()) {
                            z1Var3 = z1Var2;
                        }
                        o1Var = new C25164o1(z1Var3, eVar.f73093c);
                    }
                } else {
                    C26336h.m33836a(140);
                    throw null;
                }
            } else {
                if (z1Var3 == eVar.f73091a.mo53423o()) {
                    z1Var3 = z1Var2;
                }
                o1Var = new C25164o1(z1Var3, eVar.f73093c);
            }
            arrayList.add(o1Var);
        }
        return C25174r1.m32016c(j0Var, arrayList, (C26571h) null, (List) null, 6, (Object) null);
    }
}
