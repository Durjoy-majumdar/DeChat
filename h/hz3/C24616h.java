package hz3;

import d04.C24442a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import n04.C25143j0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36907w;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26463h1;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26765p0;

/* renamed from: hz3.h */
public final class C24616h {
    /* renamed from: a */
    public static final List<C26463h1> m30810a(Collection<? extends C25143j0> collection, Collection<? extends C26463h1> collection2, C26434a aVar) {
        C87412m.m108594g(collection, "newValueParameterTypes");
        C87412m.m108594g(collection2, "oldValueParameters");
        C87412m.m108594g(aVar, "newOwner");
        collection.size();
        collection2.size();
        List<C13604l<T, R>> F0 = C110818d0.m150908F0(collection, collection2);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(F0, 10));
        for (C13604l lVar : F0) {
            C25143j0 j0Var = (C25143j0) lVar.f38555d;
            C26463h1 h1Var = (C26463h1) lVar.f38556e;
            int index = h1Var.getIndex();
            C26571h annotations = h1Var.getAnnotations();
            C22830f name = h1Var.getName();
            C87412m.m108593f(name, "oldParameter.name");
            boolean m0 = h1Var.mo53442m0();
            boolean C0 = h1Var.mo53439C0();
            boolean B0 = h1Var.mo53438B0();
            C25143j0 g = h1Var.mo53440S() != null ? C24442a.m30543j(aVar).mo52623m().mo53315g(j0Var) : null;
            C26521y0 source = h1Var.getSource();
            C87412m.m108593f(source, "oldParameter.source");
            arrayList.add(new C26765p0(aVar, (C26463h1) null, index, annotations, name, j0Var, m0, C0, B0, g, source));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [g04.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final jz3.C24847q m30811b(wy3.C26447e r3) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r3, r0)
            int r0 = d04.C24442a.f69893a
            n04.s0 r3 = r3.mo36111s()
            n04.j1 r3 = r3.mo37081K0()
            java.util.Collection r3 = r3.mo37096r()
            java.util.Iterator r3 = r3.iterator()
        L_0x0017:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r3.next()
            n04.j0 r0 = (n04.C25143j0) r0
            boolean r2 = ty3.C26336h.m33841y(r0)
            if (r2 != 0) goto L_0x0017
            n04.j1 r0 = r0.mo37081K0()
            wy3.h r0 = r0.mo37094o()
            wy3.f r2 = wy3.C26453f.CLASS
            boolean r2 = zz3.C26794h.m35227o(r0, r2)
            if (r2 != 0) goto L_0x0045
            wy3.f r2 = wy3.C26453f.ENUM_CLASS
            boolean r2 = zz3.C26794h.m35227o(r0, r2)
            if (r2 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = 0
            goto L_0x0046
        L_0x0045:
            r2 = 1
        L_0x0046:
            if (r2 == 0) goto L_0x0017
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            gy3.C87412m.m108592e(r0, r3)
            wy3.e r0 = (wy3.C26447e) r0
            goto L_0x0051
        L_0x0050:
            r0 = r1
        L_0x0051:
            if (r0 != 0) goto L_0x0054
            return r1
        L_0x0054:
            g04.i r3 = r0.mo51793Q()
            boolean r2 = r3 instanceof jz3.C24847q
            if (r2 == 0) goto L_0x005f
            r1 = r3
            jz3.q r1 = (jz3.C24847q) r1
        L_0x005f:
            if (r1 != 0) goto L_0x0065
            jz3.q r1 = m30811b(r0)
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hz3.C24616h.m30811b(wy3.e):jz3.q");
    }
}
