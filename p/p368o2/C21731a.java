package p368o2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p368o2.C21735e;
import p368o2.C21738f;

/* renamed from: o2.a */
public class C21731a {
    /* renamed from: a */
    public static int m24715a(C21741h hVar, int i) {
        List<C21738f> list;
        int i2 = i * 2;
        if (i == 0) {
            list = hVar.f61636d;
        } else if (i == 1) {
            list = hVar.f61637e;
        } else {
            hVar.getClass();
            list = null;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C21738f fVar = list.get(i4);
            C21735e[] eVarArr = fVar.f61551A;
            C21735e eVar = eVarArr[i2 + 1].f61533d;
            i3 = Math.max(i3, m24716b(fVar, i, eVar == null || !(eVarArr[i2].f61533d == null || eVar == null), 0));
        }
        hVar.f61635c[i] = i3;
        return i3;
    }

    /* renamed from: b */
    public static int m24716b(C21738f fVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i15;
        int i16;
        C21735e eVar;
        C21738f fVar2;
        boolean z2;
        int i17;
        int i18;
        C21738f fVar3 = fVar;
        int i19 = i;
        boolean z3 = z;
        int i25 = 0;
        if (!fVar3.f61578a0) {
            return 0;
        }
        boolean z4 = fVar3.f61607w.f61533d != null && i19 == 1;
        if (z3) {
            i6 = fVar3.f61567Q;
            i5 = fVar.mo34043k() - fVar3.f61567Q;
            i4 = i19 * 2;
            i3 = i4 + 1;
        } else {
            int k = fVar.mo34043k();
            i5 = fVar3.f61567Q;
            i6 = k - i5;
            i3 = i19 * 2;
            i4 = i3 + 1;
        }
        C21735e[] eVarArr = fVar3.f61551A;
        if (eVarArr[i3].f61533d == null || eVarArr[i4].f61533d != null) {
            i7 = 1;
        } else {
            i7 = -1;
            int i26 = i3;
            i3 = i4;
            i4 = i26;
        }
        int i27 = z4 ? i2 - i6 : i2;
        int b = (eVarArr[i4].mo34025b() * i7) + m24717c(fVar, i);
        int i28 = i27 + b;
        int q = (i19 == 0 ? fVar.mo34049q() : fVar.mo34043k()) * i7;
        Iterator<C21747n> it = fVar3.f61551A[i4].f61530a.f61661a.iterator();
        while (it.hasNext()) {
            i25 = Math.max(i25, m24716b(((C21745l) it.next()).f61650c.f61531b, i19, z3, i28));
        }
        int i29 = 0;
        for (Iterator<C21747n> it4 = fVar3.f61551A[i3].f61530a.f61661a.iterator(); it4.hasNext(); it4 = it4) {
            i29 = Math.max(i29, m24716b(((C21745l) it4.next()).f61650c.f61531b, i19, z3, q + i28));
        }
        if (z4) {
            i25 -= i6;
            i8 = i29 + i5;
        } else {
            i8 = i29 + ((i19 == 0 ? fVar.mo34049q() : fVar.mo34043k()) * i7);
        }
        int i35 = 1;
        if (i19 == 1) {
            Iterator<C21747n> it5 = fVar3.f61607w.f61530a.f61661a.iterator();
            int i36 = 0;
            while (it5.hasNext()) {
                Iterator<C21747n> it6 = it5;
                C21745l lVar = (C21745l) it5.next();
                if (i7 == i35) {
                    i18 = Math.max(i36, m24716b(lVar.f61650c.f61531b, i19, z3, i6 + i28));
                    i17 = i3;
                } else {
                    int i37 = i36;
                    i17 = i3;
                    i18 = Math.max(i37, m24716b(lVar.f61650c.f61531b, i19, z3, (i5 * i7) + i28));
                }
                it5 = it6;
                i3 = i17;
                i36 = i18;
                i35 = 1;
            }
            int i38 = i36;
            i9 = i3;
            i15 = (fVar3.f61607w.f61530a.f61661a.size() <= 0 || z4) ? i38 : i7 == 1 ? i38 + i6 : i38 - i5;
        } else {
            i9 = i3;
            i15 = 0;
        }
        int max = b + Math.max(i25, Math.max(i8, i15));
        int i39 = q + i28;
        if (i7 == -1) {
            int i44 = i39;
            i39 = i28;
            i28 = i44;
        }
        if (z3) {
            C21744k.m24783b(fVar3, i19, i28);
            if (i19 == 0) {
                fVar3.f61559I = i28;
                int i45 = i39 - i28;
                fVar3.f61555E = i45;
                int i46 = fVar3.f61568R;
                if (i45 < i46) {
                    fVar3.f61555E = i46;
                }
                z2 = true;
            } else {
                z2 = true;
                if (i19 == 1) {
                    fVar3.f61560J = i28;
                    int i47 = i39 - i28;
                    fVar3.f61556F = i47;
                    int i48 = fVar3.f61569S;
                    if (i47 < i48) {
                        fVar3.f61556F = i48;
                    }
                }
            }
            fVar3.f61580b0 = z2;
            i16 = z2;
        } else {
            i16 = 1;
            fVar3.f61600p.mo34063a(fVar3, i19);
            if (i19 == 0) {
                fVar3.f61561K = i28;
            } else if (i19 == 1) {
                fVar3.f61562L = i28;
            }
        }
        if ((i19 == 0 ? fVar3.f61553C[0] : i19 == i16 ? fVar3.f61553C[i16] : null) == C21738f.C21739a.MATCH_CONSTRAINT && fVar3.f61557G != 0.0f) {
            fVar3.f61600p.mo34063a(fVar3, i19);
        }
        C21735e[] eVarArr2 = fVar3.f61551A;
        C21735e eVar2 = eVarArr2[i4].f61533d;
        if (eVar2 != null && (eVar = eVarArr2[i9].f61533d) != null && eVar2.f61531b == (fVar2 = fVar3.f61554D) && eVar.f61531b == fVar2) {
            fVar3.f61600p.mo34063a(fVar3, i19);
        }
        return max;
    }

    /* renamed from: c */
    public static int m24717c(C21738f fVar, int i) {
        C21738f fVar2;
        C21735e eVar;
        int i2 = i * 2;
        C21735e[] eVarArr = fVar.f61551A;
        C21735e eVar2 = eVarArr[i2];
        C21735e eVar3 = eVarArr[i2 + 1];
        C21735e eVar4 = eVar2.f61533d;
        if (eVar4 == null || eVar4.f61531b != (fVar2 = fVar.f61554D) || (eVar = eVar3.f61533d) == null || eVar.f61531b != fVar2) {
            return 0;
        }
        return (int) (((float) (((fVar2.mo34044l(i) - eVar2.mo34025b()) - eVar3.mo34025b()) - fVar.mo34044l(i))) * (i == 0 ? fVar.f61572V : fVar.f61573W));
    }

    /* renamed from: d */
    public static int m24718d(C21738f fVar) {
        C21738f.C21739a[] aVarArr = fVar.f61553C;
        C21738f.C21739a aVar = aVarArr[0];
        C21738f.C21739a aVar2 = C21738f.C21739a.MATCH_CONSTRAINT;
        if (aVar == aVar2) {
            int k = (int) (fVar.f61558H == 0 ? ((float) fVar.mo34043k()) * fVar.f61557G : ((float) fVar.mo34043k()) / fVar.f61557G);
            fVar.mo34033D(k);
            return k;
        } else if (aVarArr[1] != aVar2) {
            return -1;
        } else {
            int q = (int) (fVar.f61558H == 1 ? ((float) fVar.mo34049q()) * fVar.f61557G : ((float) fVar.mo34049q()) / fVar.f61557G);
            fVar.mo34057z(q);
            return q;
        }
    }

    /* renamed from: e */
    public static void m24719e(List<C21741h> list, int i, int i2) {
        HashSet<C21738f> hashSet;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C21741h hVar = list.get(i3);
            if (i == 0) {
                hashSet = hVar.f61638f;
            } else if (i == 1) {
                hashSet = hVar.f61639g;
            } else {
                hVar.getClass();
                hashSet = null;
            }
            for (C21738f next : hashSet) {
                if (next.f61578a0) {
                    int i4 = i * 2;
                    C21735e[] eVarArr = next.f61551A;
                    C21735e eVar = eVarArr[i4];
                    C21735e eVar2 = eVarArr[i4 + 1];
                    if ((eVar.f61533d == null || eVar2.f61533d == null) ? false : true) {
                        C21744k.m24783b(next, i, m24717c(next, i) + eVar.mo34025b());
                    } else {
                        if (next.f61557G != 0.0f) {
                            if ((i == 0 ? next.f61553C[0] : i == 1 ? next.f61553C[1] : null) == C21738f.C21739a.MATCH_CONSTRAINT) {
                                int d = m24718d(next);
                                int i5 = (int) next.f61551A[i4].f61530a.f61654g;
                                int i6 = i5 + d;
                                C21745l lVar = eVar2.f61530a;
                                lVar.f61653f = eVar.f61530a;
                                lVar.f61654g = (float) d;
                                lVar.f61662b = 1;
                                if (i == 0) {
                                    next.f61559I = i5;
                                    int i7 = i6 - i5;
                                    next.f61555E = i7;
                                    int i8 = next.f61568R;
                                    if (i7 < i8) {
                                        next.f61555E = i8;
                                    }
                                } else if (i == 1) {
                                    next.f61560J = i5;
                                    int i9 = i6 - i5;
                                    next.f61556F = i9;
                                    int i15 = next.f61569S;
                                    if (i9 < i15) {
                                        next.f61556F = i15;
                                    }
                                }
                                next.f61580b0 = true;
                            }
                        }
                        int i16 = i2 - (i == 0 ? next.f61561K : i == 1 ? next.f61562L : 0);
                        int l = i16 - next.mo34044l(i);
                        if (i == 0) {
                            next.f61559I = l;
                            int i17 = i16 - l;
                            next.f61555E = i17;
                            int i18 = next.f61568R;
                            if (i17 < i18) {
                                next.f61555E = i18;
                            }
                        } else if (i == 1) {
                            next.f61560J = l;
                            int i19 = i16 - l;
                            next.f61556F = i19;
                            int i25 = next.f61569S;
                            if (i19 < i25) {
                                next.f61556F = i25;
                            }
                        }
                        next.f61580b0 = true;
                        C21744k.m24783b(next, i, l);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static boolean m24720f(C21738f fVar, C21741h hVar, List<C21741h> list, boolean z) {
        C21735e eVar;
        C21738f fVar2;
        C21735e eVar2;
        C21738f fVar3;
        C21735e eVar3;
        C21735e eVar4;
        if (fVar == null) {
            return true;
        }
        fVar.f61580b0 = false;
        C21740g gVar = (C21740g) fVar.f61554D;
        C21741h hVar2 = fVar.f61600p;
        if (hVar2 == null) {
            fVar.f61578a0 = true;
            hVar.f61633a.add(fVar);
            fVar.f61600p = hVar;
            C21735e eVar5 = fVar.f61603s.f61533d;
            if (eVar5 == null && fVar.f61605u.f61533d == null && fVar.f61604t.f61533d == null && fVar.f61606v.f61533d == null && fVar.f61607w.f61533d == null && fVar.f61610z.f61533d == null) {
                hVar.f61634b = false;
                gVar.f61630x0 = false;
                fVar.f61578a0 = false;
                if (z) {
                    return false;
                }
            }
            C21735e eVar6 = fVar.f61604t.f61533d;
            if (!(eVar6 == null || (eVar4 = fVar.f61606v.f61533d) == null)) {
                C21738f.C21739a aVar = gVar.f61553C[1];
                if (z) {
                    hVar.f61634b = false;
                    gVar.f61630x0 = false;
                    fVar.f61578a0 = false;
                    return false;
                }
                C21738f fVar4 = eVar6.f61531b;
                C21738f fVar5 = fVar.f61554D;
                if (!(fVar4 == fVar5 && eVar4.f61531b == fVar5)) {
                    hVar.f61634b = false;
                    gVar.f61630x0 = false;
                    fVar.f61578a0 = false;
                }
            }
            if (!(eVar5 == null || (eVar3 = fVar.f61605u.f61533d) == null)) {
                C21738f.C21739a aVar2 = gVar.f61553C[0];
                if (z) {
                    hVar.f61634b = false;
                    gVar.f61630x0 = false;
                    fVar.f61578a0 = false;
                    return false;
                }
                C21738f fVar6 = eVar5.f61531b;
                C21738f fVar7 = fVar.f61554D;
                if (!(fVar6 == fVar7 && eVar3.f61531b == fVar7)) {
                    hVar.f61634b = false;
                    gVar.f61630x0 = false;
                    fVar.f61578a0 = false;
                }
            }
            C21738f.C21739a[] aVarArr = fVar.f61553C;
            C21738f.C21739a aVar3 = aVarArr[0];
            C21738f.C21739a aVar4 = C21738f.C21739a.MATCH_CONSTRAINT;
            boolean z2 = aVar3 == aVar4;
            C21738f.C21739a aVar5 = aVarArr[1];
            if ((z2 ^ (aVar5 == aVar4)) && fVar.f61557G != 0.0f) {
                m24718d(fVar);
            } else if (aVar3 == aVar4 || aVar5 == aVar4) {
                hVar.f61634b = false;
                gVar.f61630x0 = false;
                fVar.f61578a0 = false;
                if (z) {
                    return false;
                }
            }
            C21735e eVar7 = fVar.f61603s.f61533d;
            if (((eVar7 == null && fVar.f61605u.f61533d == null) || ((eVar7 != null && eVar7.f61531b == fVar.f61554D && fVar.f61605u.f61533d == null) || (((eVar2 = fVar.f61605u.f61533d) != null && eVar2.f61531b == fVar.f61554D && eVar7 == null) || (eVar7 != null && eVar7.f61531b == (fVar3 = fVar.f61554D) && eVar2 != null && eVar2.f61531b == fVar3)))) && fVar.f61610z.f61533d == null && !(fVar instanceof C21742i) && !(fVar instanceof C21743j)) {
                ((ArrayList) hVar.f61636d).add(fVar);
            }
            C21735e eVar8 = fVar.f61604t.f61533d;
            if (((eVar8 == null && fVar.f61606v.f61533d == null) || ((eVar8 != null && eVar8.f61531b == fVar.f61554D && fVar.f61606v.f61533d == null) || (((eVar = fVar.f61606v.f61533d) != null && eVar.f61531b == fVar.f61554D && eVar8 == null) || (eVar8 != null && eVar8.f61531b == (fVar2 = fVar.f61554D) && eVar != null && eVar.f61531b == fVar2)))) && fVar.f61610z.f61533d == null && fVar.f61607w.f61533d == null && !(fVar instanceof C21742i) && !(fVar instanceof C21743j)) {
                ((ArrayList) hVar.f61637e).add(fVar);
            }
            if (fVar instanceof C21743j) {
                hVar.f61634b = false;
                gVar.f61630x0 = false;
                fVar.f61578a0 = false;
                if (z) {
                    return false;
                }
                C21743j jVar = (C21743j) fVar;
                for (int i = 0; i < jVar.f61648j0; i++) {
                    if (!m24720f(jVar.f61647i0[i], hVar, list, z)) {
                        return false;
                    }
                }
            }
            for (C21735e eVar9 : fVar.f61551A) {
                C21735e eVar10 = eVar9.f61533d;
                if (!(eVar10 == null || eVar10.f61531b == fVar.f61554D)) {
                    if (eVar9.f61532c == C21735e.C21737b.CENTER) {
                        hVar.f61634b = false;
                        gVar.f61630x0 = false;
                        fVar.f61578a0 = false;
                        if (z) {
                            return false;
                        }
                    } else {
                        C21745l lVar = eVar9.f61530a;
                        if (!(eVar10 == null || eVar10.f61533d == eVar9)) {
                            eVar10.f61530a.mo34078a(lVar);
                        }
                    }
                    if (!m24720f(eVar9.f61533d.f61531b, hVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (hVar2 != hVar) {
            hVar.f61633a.addAll(hVar2.f61633a);
            ((ArrayList) hVar.f61636d).addAll(fVar.f61600p.f61636d);
            ((ArrayList) hVar.f61637e).addAll(fVar.f61600p.f61637e);
            C21741h hVar3 = fVar.f61600p;
            if (!hVar3.f61634b) {
                hVar.f61634b = false;
            }
            list.remove(hVar3);
            for (C21738f fVar8 : fVar.f61600p.f61633a) {
                fVar8.f61600p = hVar;
            }
        }
        return true;
    }
}
