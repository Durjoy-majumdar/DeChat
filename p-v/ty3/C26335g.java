package ty3;

import b04.C23649g;
import b04.C23658n;
import b04.C23670w;
import d04.C24442a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import n04.C25126h1;
import n04.C25143j0;
import n04.C25146k0;
import n04.C25158m1;
import n04.C25176s0;
import r04.C26094c;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36903g0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import sx3.C90363p0;
import sx3.C90364q0;
import ty3.C26343l;
import uy3.C26371c;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22830f;
import w04.C26412a;
import wy3.C22935h;
import wy3.C26447e;
import wy3.C26469k;
import xy3.C26566c;
import xy3.C26571h;
import xy3.C26575i;
import xy3.C26577k;

/* renamed from: ty3.g */
public final class C26335g {
    /* renamed from: a */
    public static final int m33815a(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C26566c b = j0Var.getAnnotations().mo51476b(C26343l.C26344a.f73428r);
        if (b == null) {
            return 0;
        }
        C23649g gVar = (C23649g) C90364q0.m113145d(b.mo51296a(), C26343l.f73369c);
        C87412m.m108592e(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C23658n) gVar).f67839a).intValue();
    }

    /* renamed from: b */
    public static final C25176s0 m33816b(C26336h hVar, C26571h hVar2, C25143j0 j0Var, List<? extends C25143j0> list, List<? extends C25143j0> list2, List<C22830f> list3, C25143j0 j0Var2, boolean z) {
        C26447e eVar;
        C22830f fVar;
        C26336h hVar3 = hVar;
        C26571h hVar4 = hVar2;
        List<? extends C25143j0> list4 = list;
        List<C22830f> list5 = list3;
        C87412m.m108594g(hVar3, "builtIns");
        C87412m.m108594g(hVar4, "annotations");
        C87412m.m108594g(list4, "contextReceiverTypes");
        C87412m.m108594g(list2, "parameterTypes");
        C87412m.m108594g(j0Var2, "returnType");
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (j0Var != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list4, 10));
        for (C25143j0 a : list) {
            arrayList2.add(C26094c.m33421a(a));
        }
        arrayList.addAll(arrayList2);
        C26412a.m34008a(arrayList, j0Var != null ? C26094c.m33421a(j0Var) : null);
        int i = 0;
        for (T next : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                C25143j0 j0Var3 = (C25143j0) next;
                if (list5 == null || (fVar = list5.get(i)) == null || fVar.f65638e) {
                    fVar = null;
                }
                if (fVar != null) {
                    C22826c cVar = C26343l.C26344a.f73429s;
                    C22830f f = C22830f.m26794f("name");
                    String b = fVar.mo35995b();
                    C87412m.m108593f(b, "name.asString()");
                    List d0 = C110818d0.m150932d0(j0Var3.getAnnotations(), new C26577k(hVar3, cVar, C90363p0.m113143b(new C13604l(f, new C23670w(b)))));
                    j0Var3 = C26094c.m33431k(j0Var3, ((ArrayList) d0).isEmpty() ? C26571h.C26572a.f73937a : new C26575i(d0));
                }
                arrayList.add(C26094c.m33421a(j0Var3));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        arrayList.add(C26094c.m33421a(j0Var2));
        int size = list2.size() + list.size() + (j0Var == null ? 0 : 1);
        if (z) {
            eVar = hVar3.mo53329w(size);
        } else {
            C22830f fVar2 = C26343l.f73367a;
            eVar = hVar3.mo53319k("Function" + size);
        }
        C87412m.m108593f(eVar, "if (isSuspendFunction) b…tFunction(parameterCount)");
        if (j0Var != null) {
            C22826c cVar2 = C26343l.C26344a.f73427q;
            if (!hVar4.mo51479q(cVar2)) {
                List d05 = C110818d0.m150932d0(hVar4, new C26577k(hVar3, cVar2, C36903g0.f97931d));
                hVar4 = ((ArrayList) d05).isEmpty() ? C26571h.C26572a.f73937a : new C26575i(d05);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            C22826c cVar3 = C26343l.C26344a.f73428r;
            if (!hVar4.mo51479q(cVar3)) {
                List d06 = C110818d0.m150932d0(hVar4, new C26577k(hVar3, cVar3, C90363p0.m113143b(new C13604l(C26343l.f73369c, new C23658n(size2)))));
                hVar4 = ((ArrayList) d06).isEmpty() ? C26571h.C26572a.f73937a : new C26575i(d06);
            }
        }
        return C25146k0.m31959e(C25126h1.m31918b(hVar4), eVar, arrayList);
    }

    /* renamed from: c */
    public static final C22830f m33817c(C25143j0 j0Var) {
        String str;
        C87412m.m108594g(j0Var, "<this>");
        C26566c b = j0Var.getAnnotations().mo51476b(C26343l.C26344a.f73429s);
        if (b == null) {
            return null;
        }
        Object k0 = C110818d0.m150939k0(b.mo51296a().values());
        C23670w wVar = k0 instanceof C23670w ? (C23670w) k0 : null;
        if (!(wVar == null || (str = (String) wVar.f67839a) == null)) {
            if (!C22830f.m26795g(str)) {
                str = null;
            }
            if (str != null) {
                return C22830f.m26794f(str);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final List<C25143j0> m33818d(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        m33822h(j0Var);
        int a = m33815a(j0Var);
        if (a == 0) {
            return C64186f0.f181907d;
        }
        List<C25158m1> subList = j0Var.mo37079I0().subList(0, a);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(subList, 10));
        for (C25158m1 type : subList) {
            C25143j0 type2 = type.getType();
            C87412m.m108593f(type2, "it.type");
            arrayList.add(type2);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final C26371c m33819e(C26469k kVar) {
        C87412m.m108594g(kVar, "<this>");
        if (!(kVar instanceof C26447e) || !C26336h.m33835L(kVar)) {
            return null;
        }
        C22827d h = C24442a.m30541h(kVar);
        if (!h.mo35989f() || h.mo35987e()) {
            return null;
        }
        C26371c.C26372a aVar = C26371c.f73565f;
        String b = h.mo35991h().mo35995b();
        C87412m.m108593f(b, "shortName().asString()");
        C22826c e = h.mo35993i().mo35976e();
        C87412m.m108593f(e, "toSafe().parent()");
        aVar.getClass();
        C26371c.C26372a.C26373a a = aVar.mo53357a(b, e);
        if (a != null) {
            return a.f73573a;
        }
        return null;
    }

    /* renamed from: f */
    public static final C25143j0 m33820f(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        m33822h(j0Var);
        if (!(j0Var.getAnnotations().mo51476b(C26343l.C26344a.f73427q) != null)) {
            return null;
        }
        return j0Var.mo37079I0().get(m33815a(j0Var)).getType();
    }

    /* renamed from: g */
    public static final List<C25158m1> m33821g(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        m33822h(j0Var);
        List<C25158m1> I0 = j0Var.mo37079I0();
        int a = m33815a(j0Var);
        int i = 0;
        if (m33822h(j0Var)) {
            if (j0Var.getAnnotations().mo51476b(C26343l.C26344a.f73427q) != null) {
                i = 1;
            }
        }
        return I0.subList(a + i, I0.size() - 1);
    }

    /* renamed from: h */
    public static final boolean m33822h(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C22935h o = j0Var.mo37081K0().mo37094o();
        if (o != null) {
            C26371c e = m33819e(o);
            if (e == C26371c.Function || e == C26371c.SuspendFunction) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m33823i(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C22935h o = j0Var.mo37081K0().mo37094o();
        return (o != null ? m33819e(o) : null) == C26371c.SuspendFunction;
    }
}
