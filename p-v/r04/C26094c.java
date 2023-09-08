package r04;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n04.C25109c0;
import n04.C25122g1;
import n04.C25126h1;
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
import n04.C25196y0;
import n04.C25198y1;
import n04.C25202z1;
import o04.C25318c;
import o04.C25332l;
import rx3.C13603j;
import sx3.C110818d0;
import sx3.C26234j0;
import sx3.C36907w;
import sx3.C64188i0;
import ty3.C26336h;
import wy3.C22935h;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26453f;
import wy3.C26464i;
import xy3.C26571h;

/* renamed from: r04.c */
public final class C26094c {
    /* renamed from: a */
    public static final C25158m1 m33421a(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        return new C25164o1(j0Var);
    }

    /* renamed from: b */
    public static final boolean m33422b(C25143j0 j0Var, C25144j1 j1Var, Set<? extends C26446d1> set) {
        boolean z;
        if (C87412m.m108589b(j0Var.mo37081K0(), j1Var)) {
            return true;
        }
        C22935h o = j0Var.mo37081K0().mo37094o();
        C26464i iVar = o instanceof C26464i ? (C26464i) o : null;
        List<C26446d1> t = iVar != null ? iVar.mo51805t() : null;
        Iterable<C64188i0<T>> E0 = C110818d0.m150906E0(j0Var.mo37079I0());
        if (!(E0 instanceof Collection) || !((Collection) E0).isEmpty()) {
            Iterator it = ((C26234j0) E0).iterator();
            while (it.hasNext()) {
                C64188i0 i0Var = (C64188i0) it.next();
                int i = i0Var.f181909a;
                C25158m1 m1Var = (C25158m1) i0Var.f181910b;
                C26446d1 d1Var = t != null ? (C26446d1) C110818d0.m150917O(t, i) : null;
                if (((d1Var == null || set == null || !set.contains(d1Var)) ? false : true) || m1Var.mo52296b()) {
                    z = false;
                    continue;
                } else {
                    C25143j0 type = m1Var.getType();
                    C87412m.m108593f(type, "argument.type");
                    z = m33422b(type, j1Var, set);
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final C25158m1 m33423c(C25143j0 j0Var, C25202z1 z1Var, C26446d1 d1Var) {
        C87412m.m108594g(j0Var, "type");
        C87412m.m108594g(z1Var, "projectionKind");
        if ((d1Var != null ? d1Var.mo53423o() : null) == z1Var) {
            z1Var = C25202z1.INVARIANT;
        }
        return new C25164o1(z1Var, j0Var);
    }

    /* renamed from: d */
    public static final void m33424d(C25143j0 j0Var, C25143j0 j0Var2, Set<C26446d1> set, Set<? extends C26446d1> set2) {
        C22935h o = j0Var.mo37081K0().mo37094o();
        if (!(o instanceof C26446d1)) {
            C22935h o2 = j0Var.mo37081K0().mo37094o();
            C26464i iVar = o2 instanceof C26464i ? (C26464i) o2 : null;
            List<C26446d1> t = iVar != null ? iVar.mo51805t() : null;
            int i = 0;
            for (C25158m1 next : j0Var.mo37079I0()) {
                int i2 = i + 1;
                C26446d1 d1Var = t != null ? (C26446d1) C110818d0.m150917O(t, i) : null;
                if (!((d1Var == null || set2 == null || !set2.contains(d1Var)) ? false : true) && !next.mo52296b() && !C110818d0.m150903D(set, next.getType().mo37081K0().mo37094o()) && !C87412m.m108589b(next.getType().mo37081K0(), j0Var2.mo37081K0())) {
                    C25143j0 type = next.getType();
                    C87412m.m108593f(type, "argument.type");
                    m33424d(type, j0Var2, set, set2);
                }
                i = i2;
            }
        } else if (!C87412m.m108589b(j0Var.mo37081K0(), j0Var2.mo37081K0())) {
            set.add(o);
        } else {
            for (C25143j0 next2 : ((C26446d1) o).getUpperBounds()) {
                C87412m.m108593f(next2, "upperBound");
                m33424d(next2, j0Var2, set, set2);
            }
        }
    }

    /* renamed from: e */
    public static final C26336h m33425e(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C26336h m = j0Var.mo37081K0().mo37092m();
        C87412m.m108593f(m, "constructor.builtIns");
        return m;
    }

    /* renamed from: f */
    public static final C25143j0 m33426f(C26446d1 d1Var) {
        T t;
        C87412m.m108594g(d1Var, "<this>");
        List<C25143j0> upperBounds = d1Var.getUpperBounds();
        C87412m.m108593f(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<C25143j0> upperBounds2 = d1Var.getUpperBounds();
        C87412m.m108593f(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T o = ((C25143j0) next).mo37081K0().mo37094o();
            if (o instanceof C26447e) {
                t = (C26447e) o;
            }
            boolean z = false;
            if (!(t == null || t.mo51796f() == C26453f.INTERFACE || t.mo51796f() == C26453f.ANNOTATION_CLASS)) {
                z = true;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        C25143j0 j0Var = (C25143j0) t;
        if (j0Var != null) {
            return j0Var;
        }
        List<C25143j0> upperBounds3 = d1Var.getUpperBounds();
        C87412m.m108593f(upperBounds3, "upperBounds");
        Object L = C110818d0.m150914L(upperBounds3);
        C87412m.m108593f(L, "upperBounds.first()");
        return (C25143j0) L;
    }

    /* renamed from: g */
    public static final boolean m33427g(C26446d1 d1Var, C25144j1 j1Var, Set<? extends C26446d1> set) {
        boolean z;
        C87412m.m108594g(d1Var, "typeParameter");
        List<C25143j0> upperBounds = d1Var.getUpperBounds();
        C87412m.m108593f(upperBounds, "typeParameter.upperBounds");
        if (!upperBounds.isEmpty()) {
            for (C25143j0 j0Var : upperBounds) {
                C87412m.m108593f(j0Var, "upperBound");
                if (!m33422b(j0Var, d1Var.mo36111s().mo37081K0(), set) || (j1Var != null && !C87412m.m108589b(j0Var.mo37081K0(), j1Var))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m33428h(C26446d1 d1Var, C25144j1 j1Var, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            j1Var = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return m33427g(d1Var, j1Var, set);
    }

    /* renamed from: i */
    public static final boolean m33429i(C25143j0 j0Var, C25143j0 j0Var2) {
        C87412m.m108594g(j0Var, "<this>");
        C87412m.m108594g(j0Var2, "superType");
        return ((C25332l) C25318c.f71821a).mo52423d(j0Var, j0Var2);
    }

    /* renamed from: j */
    public static final C25143j0 m33430j(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C25143j0 j = C25187v1.m32090j(j0Var, true);
        C87412m.m108593f(j, "makeNullable(this)");
        return j;
    }

    /* renamed from: k */
    public static final C25143j0 m33431k(C25143j0 j0Var, C26571h hVar) {
        C87412m.m108594g(j0Var, "<this>");
        C87412m.m108594g(hVar, "newAnnotations");
        return (!j0Var.getAnnotations().isEmpty() || !hVar.isEmpty()) ? j0Var.mo52229N0().mo51873Q0(C25126h1.m31917a(j0Var.mo37080J0(), hVar)) : j0Var;
    }

    /* renamed from: l */
    public static final C25143j0 m33432l(C25143j0 j0Var, C25180t1 t1Var, Map<C25144j1, ? extends C25158m1> map, C25202z1 z1Var, Set<? extends C26446d1> set) {
        C25198y1 y1Var;
        C25180t1 t1Var2 = t1Var;
        Map<C25144j1, ? extends C25158m1> map2 = map;
        C25202z1 z1Var2 = z1Var;
        Set<? extends C26446d1> set2 = set;
        C87412m.m108594g(j0Var, "<this>");
        C87412m.m108594g(t1Var2, "substitutor");
        C87412m.m108594g(map2, "substitutionMap");
        C87412m.m108594g(z1Var2, "variance");
        C25198y1 N0 = j0Var.mo52229N0();
        if (N0 instanceof C25109c0) {
            C25109c0 c0Var = (C25109c0) N0;
            C25176s0 s0Var = c0Var.f71540e;
            if (!s0Var.mo37081K0().getParameters().isEmpty() && s0Var.mo37081K0().mo37094o() != null) {
                List<C26446d1> parameters = s0Var.mo37081K0().getParameters();
                C87412m.m108593f(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(parameters, 10));
                for (C26446d1 d1Var : parameters) {
                    C25158m1 m1Var = (C25158m1) C110818d0.m150917O(j0Var.mo37079I0(), d1Var.getIndex());
                    if ((set2 != null && set2.contains(d1Var)) || m1Var == null || !map2.containsKey(m1Var.getType().mo37081K0())) {
                        m1Var = new C25196y0(d1Var);
                    }
                    arrayList.add(m1Var);
                }
                s0Var = C25174r1.m32017d(s0Var, arrayList, (C25122g1) null, 2, (Object) null);
            }
            C25176s0 s0Var2 = c0Var.f71541f;
            if (!s0Var2.mo37081K0().getParameters().isEmpty() && s0Var2.mo37081K0().mo37094o() != null) {
                List<C26446d1> parameters2 = s0Var2.mo37081K0().getParameters();
                C87412m.m108593f(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(parameters2, 10));
                for (C26446d1 d1Var2 : parameters2) {
                    C25158m1 m1Var2 = (C25158m1) C110818d0.m150917O(j0Var.mo37079I0(), d1Var2.getIndex());
                    if ((set2 != null && set2.contains(d1Var2)) || m1Var2 == null || !map2.containsKey(m1Var2.getType().mo37081K0())) {
                        m1Var2 = new C25196y0(d1Var2);
                    }
                    arrayList2.add(m1Var2);
                }
                s0Var2 = C25174r1.m32017d(s0Var2, arrayList2, (C25122g1) null, 2, (Object) null);
            }
            y1Var = C25146k0.m31957c(s0Var, s0Var2);
        } else if (N0 instanceof C25176s0) {
            C25176s0 s0Var3 = (C25176s0) N0;
            if (s0Var3.mo37081K0().getParameters().isEmpty() || s0Var3.mo37081K0().mo37094o() == null) {
                y1Var = s0Var3;
            } else {
                List<C26446d1> parameters3 = s0Var3.mo37081K0().getParameters();
                C87412m.m108593f(parameters3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(parameters3, 10));
                for (C26446d1 d1Var3 : parameters3) {
                    C25158m1 m1Var3 = (C25158m1) C110818d0.m150917O(j0Var.mo37079I0(), d1Var3.getIndex());
                    if ((set2 != null && set2.contains(d1Var3)) || m1Var3 == null || !map2.containsKey(m1Var3.getType().mo37081K0())) {
                        m1Var3 = new C25196y0(d1Var3);
                    }
                    arrayList3.add(m1Var3);
                }
                y1Var = C25174r1.m32017d(s0Var3, arrayList3, (C25122g1) null, 2, (Object) null);
            }
        } else {
            throw new C13603j();
        }
        C25143j0 i = t1Var2.mo52313i(C25194x1.m32121b(y1Var, N0), z1Var2);
        C87412m.m108593f(i, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return i;
    }

    /* renamed from: m */
    public static final C25143j0 m33433m(C25143j0 j0Var) {
        C25176s0 s0Var;
        C87412m.m108594g(j0Var, "<this>");
        C25198y1 N0 = j0Var.mo52229N0();
        if (N0 instanceof C25109c0) {
            C25109c0 c0Var = (C25109c0) N0;
            C25176s0 s0Var2 = c0Var.f71540e;
            if (!s0Var2.mo37081K0().getParameters().isEmpty() && s0Var2.mo37081K0().mo37094o() != null) {
                List<C26446d1> parameters = s0Var2.mo37081K0().getParameters();
                C87412m.m108593f(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(parameters, 10));
                for (C26446d1 y0Var : parameters) {
                    arrayList.add(new C25196y0(y0Var));
                }
                s0Var2 = C25174r1.m32017d(s0Var2, arrayList, (C25122g1) null, 2, (Object) null);
            }
            C25176s0 s0Var3 = c0Var.f71541f;
            if (!s0Var3.mo37081K0().getParameters().isEmpty() && s0Var3.mo37081K0().mo37094o() != null) {
                List<C26446d1> parameters2 = s0Var3.mo37081K0().getParameters();
                C87412m.m108593f(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(parameters2, 10));
                for (C26446d1 y0Var2 : parameters2) {
                    arrayList2.add(new C25196y0(y0Var2));
                }
                s0Var3 = C25174r1.m32017d(s0Var3, arrayList2, (C25122g1) null, 2, (Object) null);
            }
            s0Var = C25146k0.m31957c(s0Var2, s0Var3);
        } else if (N0 instanceof C25176s0) {
            C25176s0 s0Var4 = (C25176s0) N0;
            boolean isEmpty = s0Var4.mo37081K0().getParameters().isEmpty();
            s0Var = s0Var4;
            if (!isEmpty) {
                C22935h o = s0Var4.mo37081K0().mo37094o();
                s0Var = s0Var4;
                if (o != null) {
                    List<C26446d1> parameters3 = s0Var4.mo37081K0().getParameters();
                    C87412m.m108593f(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(C36907w.m41090l(parameters3, 10));
                    for (C26446d1 y0Var3 : parameters3) {
                        arrayList3.add(new C25196y0(y0Var3));
                    }
                    s0Var = C25174r1.m32017d(s0Var4, arrayList3, (C25122g1) null, 2, (Object) null);
                }
            }
        } else {
            throw new C13603j();
        }
        return C25194x1.m32121b(s0Var, N0);
    }
}
