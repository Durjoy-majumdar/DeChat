package py3;

import gy3.C87412m;
import ny3.C25235d;
import ny3.C25236e;
import ny3.C25245n;
import qy3.C118215l0;

/* renamed from: py3.a */
public final class C25503a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ny3.n} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        r5 = m32927b(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ny3.C25235d<?> m32926a(ny3.C25236e r5) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r5, r0)
            boolean r0 = r5 instanceof ny3.C25235d
            if (r0 == 0) goto L_0x000c
            ny3.d r5 = (ny3.C25235d) r5
            goto L_0x0071
        L_0x000c:
            boolean r0 = r5 instanceof ny3.C25246o
            if (r0 == 0) goto L_0x0072
            ny3.o r5 = (ny3.C25246o) r5
            java.util.List r5 = r5.getUpperBounds()
            java.util.Iterator r0 = r5.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r0.next()
            r3 = r1
            ny3.n r3 = (ny3.C25245n) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            gy3.C87412m.m108592e(r3, r4)
            qy3.i0 r3 = (qy3.C25935i0) r3
            n04.j0 r3 = r3.f72292d
            n04.j1 r3 = r3.mo37081K0()
            wy3.h r3 = r3.mo37094o()
            boolean r4 = r3 instanceof wy3.C26447e
            if (r4 == 0) goto L_0x0040
            r2 = r3
            wy3.e r2 = (wy3.C26447e) r2
        L_0x0040:
            if (r2 == 0) goto L_0x0054
            wy3.f r3 = r2.mo51796f()
            wy3.f r4 = wy3.C26453f.INTERFACE
            if (r3 == r4) goto L_0x0054
            wy3.f r2 = r2.mo51796f()
            wy3.f r3 = wy3.C26453f.ANNOTATION_CLASS
            if (r2 == r3) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r2 == 0) goto L_0x001a
            r2 = r1
        L_0x0058:
            ny3.n r2 = (ny3.C25245n) r2
            if (r2 != 0) goto L_0x0063
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
            r2 = r5
            ny3.n r2 = (ny3.C25245n) r2
        L_0x0063:
            if (r2 == 0) goto L_0x006b
            ny3.d r5 = m32927b(r2)
            if (r5 != 0) goto L_0x0071
        L_0x006b:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            ny3.d r5 = gy3.C24560g0.m30725a(r5)
        L_0x0071:
            return r5
        L_0x0072:
            qy3.l0 r0 = new qy3.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: py3.C25503a.m32926a(ny3.e):ny3.d");
    }

    /* renamed from: b */
    public static final C25235d<?> m32927b(C25245n nVar) {
        C25235d<?> a;
        C87412m.m108594g(nVar, "<this>");
        C25236e j = nVar.mo52347j();
        if (j != null && (a = m32926a(j)) != null) {
            return a;
        }
        throw new C118215l0("Cannot calculate JVM erasure for type: " + nVar);
    }
}
