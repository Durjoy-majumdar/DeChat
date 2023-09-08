package oz3;

import gy3.C87412m;
import n04.C25143j0;
import w04.C37951d;
import wy3.C26434a;
import wy3.C26447e;
import wy3.C26469k;
import wy3.C26520x0;
import zz3.C26794h;

/* renamed from: oz3.v */
public final class C25404v {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        if ((r2 instanceof wy3.C26506s0) == false) goto L_0x009e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m32595a(wy3.C26516w r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            r0 = 1
            if (r6 == 0) goto L_0x0006
            r3 = 1
        L_0x0006:
            r5 = r5 & 2
            if (r5 == 0) goto L_0x000b
            r4 = 1
        L_0x000b:
            java.lang.String r5 = "<this>"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r4 == 0) goto L_0x002e
            boolean r4 = r2 instanceof wy3.C26467j
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "<init>"
            goto L_0x002b
        L_0x001e:
            vz3.f r4 = r2.getName()
            java.lang.String r4 = r4.mo35995b()
            java.lang.String r6 = "name.asString()"
            gy3.C87412m.m108593f(r4, r6)
        L_0x002b:
            r5.append(r4)
        L_0x002e:
            java.lang.String r4 = "("
            r5.append(r4)
            wy3.u0 r4 = r2.mo52627I()
            if (r4 == 0) goto L_0x0049
            n04.j0 r4 = r4.getType()
            java.lang.String r6 = "it.type"
            gy3.C87412m.m108593f(r4, r6)
            oz3.l r4 = m32597c(r4)
            r5.append(r4)
        L_0x0049:
            java.util.List r4 = r2.mo52639h()
            java.util.Iterator r4 = r4.iterator()
        L_0x0051:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r4.next()
            wy3.h1 r6 = (wy3.C26463h1) r6
            n04.j0 r6 = r6.getType()
            java.lang.String r1 = "parameter.type"
            gy3.C87412m.m108593f(r6, r1)
            oz3.l r6 = m32597c(r6)
            r5.append(r6)
            goto L_0x0051
        L_0x006e:
            java.lang.String r4 = ")"
            r5.append(r4)
            if (r3 == 0) goto L_0x00b4
            boolean r3 = r2 instanceof wy3.C26467j
            if (r3 == 0) goto L_0x007a
            goto L_0x009e
        L_0x007a:
            n04.j0 r3 = r2.getReturnType()
            gy3.C87412m.m108591d(r3)
            vz3.f r4 = ty3.C26336h.f73354e
            vz3.d r4 = ty3.C26343l.C26344a.f73415e
            boolean r3 = ty3.C26336h.m33828E(r3, r4)
            if (r3 == 0) goto L_0x009d
            n04.j0 r3 = r2.getReturnType()
            gy3.C87412m.m108591d(r3)
            boolean r3 = n04.C25187v1.m32087g(r3)
            if (r3 != 0) goto L_0x009d
            boolean r3 = r2 instanceof wy3.C26506s0
            if (r3 != 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            if (r0 == 0) goto L_0x00a6
            java.lang.String r2 = "V"
            r5.append(r2)
            goto L_0x00b4
        L_0x00a6:
            n04.j0 r2 = r2.getReturnType()
            gy3.C87412m.m108591d(r2)
            oz3.l r2 = m32597c(r2)
            r5.append(r2)
        L_0x00b4:
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "StringBuilder().apply(builderAction).toString()"
            gy3.C87412m.m108593f(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.C25404v.m32595a(wy3.w, boolean, boolean, int, java.lang.Object):java.lang.String");
    }

    /* renamed from: b */
    public static final String m32596b(C26434a aVar) {
        C87412m.m108594g(aVar, "<this>");
        C21911y yVar = C21911y.f61967a;
        if (C26794h.m35228p(aVar)) {
            return null;
        }
        C26469k b = aVar.mo51892b();
        C26447e eVar = b instanceof C26447e ? (C26447e) b : null;
        if (eVar == null || eVar.getName().f65638e) {
            return null;
        }
        C26434a a = aVar.mo36109a();
        C26520x0 x0Var = a instanceof C26520x0 ? (C26520x0) a : null;
        if (x0Var == null) {
            return null;
        }
        return C25403u.m32594a(yVar, eVar, m32595a(x0Var, false, false, 3, (Object) null));
    }

    /* renamed from: c */
    public static final C25384l m32597c(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        return (C25384l) C25376e.m32540b(j0Var, C25389n.f71938a, C25365b0.f71873k, C25361a0.f71864a, (C25382j) null, C37951d.f100406b);
    }
}
