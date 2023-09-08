package n04;

import gy3.C87412m;
import sx3.C26236u;
import xy3.C26571h;

/* renamed from: n04.h1 */
public final class C25126h1 {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final n04.C25122g1 m31917a(n04.C25122g1 r6, xy3.C26571h r7) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "newAnnotations"
            gy3.C87412m.m108594g(r7, r0)
            xy3.h r0 = n04.C25162o.m31984a(r6)
            if (r0 != r7) goto L_0x0011
            return r6
        L_0x0011:
            n04.n r0 = n04.C25162o.m31985b(r6)
            r1 = 1
            if (r0 == 0) goto L_0x005a
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0020
        L_0x001e:
            r0 = r6
            goto L_0x0056
        L_0x0020:
            t04.c<T> r2 = r6.f73188d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r2.next()
            r5 = r4
            n04.e1 r5 = (n04.C25118e1) r5
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x002b
            r3.add(r4)
            goto L_0x002b
        L_0x0043:
            int r0 = r3.size()
            t04.c<T> r2 = r6.f73188d
            int r2 = r2.mo53152f()
            if (r0 != r2) goto L_0x0050
            goto L_0x001e
        L_0x0050:
            n04.g1$a r0 = n04.C25122g1.f71557e
            n04.g1 r0 = r0.mo33818c(r3)
        L_0x0056:
            if (r0 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r6 = r0
        L_0x005a:
            java.util.Iterator r0 = r7.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x006b
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x006b
            return r6
        L_0x006b:
            n04.n r0 = new n04.n
            r0.<init>(r7)
            n04.g1$a r7 = n04.C25122g1.f71557e
            ny3.d r2 = r0.mo52258b()
            int r2 = r7.mo35583b(r2)
            t04.c<T> r3 = r6.f73188d
            java.lang.Object r2 = r3.get(r2)
            if (r2 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            if (r1 == 0) goto L_0x0087
            goto L_0x00a3
        L_0x0087:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0097
            n04.g1 r6 = new n04.g1
            java.util.List r7 = sx3.C26236u.m33719b(r0)
            r6.<init>(r7)
            goto L_0x00a3
        L_0x0097:
            java.util.List r6 = sx3.C110818d0.m150953y0(r6)
            java.util.List r6 = sx3.C110818d0.m150934f0(r6, r0)
            n04.g1 r6 = r7.mo33818c(r6)
        L_0x00a3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25126h1.m31917a(n04.g1, xy3.h):n04.g1");
    }

    /* renamed from: b */
    public static final C25122g1 m31918b(C26571h hVar) {
        C87412m.m108594g(hVar, "<this>");
        if (!hVar.isEmpty()) {
            return C25122g1.f71557e.mo33818c(C26236u.m33719b(new C25159n(hVar)));
        }
        C25122g1.f71557e.getClass();
        return C25122g1.f71558f;
    }
}
