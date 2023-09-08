package ty3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import n04.C25143j0;
import n04.C25187v1;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import vz3.C22830f;
import vz3.C26408b;
import wy3.C22935h;
import wy3.C26465i0;
import wy3.C26469k;

/* renamed from: ty3.p */
public final class C26348p {

    /* renamed from: a */
    public static final Set<C22830f> f73448a;

    /* renamed from: b */
    public static final Set<C22830f> f73449b;

    /* renamed from: c */
    public static final HashMap<C26408b, C26408b> f73450c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<C26408b, C26408b> f73451d = new HashMap<>();

    /* renamed from: e */
    public static final Set<C22830f> f73452e;

    static {
        C26347o[] values = C26347o.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C26347o oVar : values) {
            arrayList.add(oVar.f73446e);
        }
        f73448a = C110818d0.m150904D0(arrayList);
        C26346n[] values2 = C26346n.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (C26346n nVar : values2) {
            arrayList2.add(nVar.f73443d);
        }
        f73449b = C110818d0.m150904D0(arrayList2);
        C90364q0.m113146e(new C13604l(C26346n.UBYTEARRAY, C22830f.m26794f("ubyteArrayOf")), new C13604l(C26346n.USHORTARRAY, C22830f.m26794f("ushortArrayOf")), new C13604l(C26346n.UINTARRAY, C22830f.m26794f("uintArrayOf")), new C13604l(C26346n.ULONGARRAY, C22830f.m26794f("ulongArrayOf")));
        C26347o[] values3 = C26347o.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C26347o oVar2 : values3) {
            linkedHashSet.add(oVar2.f73447f.mo53395j());
        }
        f73452e = linkedHashSet;
        for (C26347o oVar3 : C26347o.values()) {
            f73450c.put(oVar3.f73447f, oVar3.f73445d);
            f73451d.put(oVar3.f73445d, oVar3.f73447f);
        }
    }

    /* renamed from: a */
    public static final boolean m33867a(C25143j0 j0Var) {
        C22935h o;
        C87412m.m108594g(j0Var, "type");
        if (C25187v1.m32096p(j0Var) || (o = j0Var.mo37081K0().mo37094o()) == null) {
            return false;
        }
        C26469k b = o.mo51892b();
        return (b instanceof C26465i0) && C87412m.m108589b(((C26465i0) b).mo53444d(), C26343l.f73376j) && f73448a.contains(o.getName());
    }
}
