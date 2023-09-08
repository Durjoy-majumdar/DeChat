package p869y0;

import gy3.C87412m;
import p410k0.C108793e;
import rx3.C13603j;

/* renamed from: y0.d0 */
public final class C112310d0 {
    /* renamed from: a */
    public static final C108793e<C112321l> m153196a(C112321l lVar) {
        boolean z;
        C87412m.m108594g(lVar, "<this>");
        C108793e<C112321l> eVar = lVar.f336332f;
        int i = eVar.f325786f;
        int i2 = 0;
        if (i > 0) {
            T[] tArr = eVar.f325784d;
            int i3 = 0;
            while (true) {
                if (!((C112321l) tArr[i3]).f336333g.mo164040b()) {
                    i3++;
                    if (i3 >= i) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            return lVar.f336332f;
        }
        C108793e<C112321l> eVar2 = new C108793e<>(new C112321l[16], 0);
        C108793e<C112321l> eVar3 = lVar.f336332f;
        int i4 = eVar3.f325786f;
        if (i4 > 0) {
            T[] tArr2 = eVar3.f325784d;
            do {
                C112321l lVar2 = (C112321l) tArr2[i2];
                if (!lVar2.f336333g.mo164040b()) {
                    eVar2.mo159860b(lVar2);
                } else {
                    eVar2.mo159862d(eVar2.f325786f, m153196a(lVar2));
                }
                i2++;
            } while (i2 < i4);
        }
        return eVar2;
    }

    /* renamed from: b */
    public static final C112321l m153197b(C112321l lVar) {
        C87412m.m108594g(lVar, "<this>");
        int ordinal = lVar.f336333g.ordinal();
        if (ordinal == 0) {
            return lVar;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return lVar;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new C13603j();
                    }
                }
            }
            return null;
        }
        C112321l lVar2 = lVar.f336334h;
        if (lVar2 != null) {
            return m153197b(lVar2);
        }
        return null;
    }

    /* renamed from: c */
    public static final C112321l m153198c(C112321l lVar) {
        C87412m.m108594g(lVar, "<this>");
        C112321l lVar2 = lVar.f336331e;
        if (lVar2 == null) {
            return null;
        }
        int ordinal = lVar.f336333g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return lVar;
            }
            if (!(ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                throw new C13603j();
            }
        }
        return m153198c(lVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = p631o1.C109861p.m149327c(r2).mo161179X(r2, false);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p1166z0.C112541g m153199d(p869y0.C112321l r2) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r2, r0)
            q1.s r2 = r2.f336341r
            if (r2 == 0) goto L_0x0014
            o1.o r0 = p631o1.C109861p.m149327c(r2)
            r1 = 0
            z0.g r2 = r0.mo161179X(r2, r1)
            if (r2 != 0) goto L_0x0016
        L_0x0014:
            z0.g r2 = p1166z0.C112541g.f336960e
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p869y0.C112310d0.m153199d(y0.l):z0.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r3.f329972h;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m153200e(p869y0.C112321l r3) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r3, r0)
            q1.s r3 = r3.f336341r
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x0015
            q1.j r2 = r3.f329972h
            if (r2 == 0) goto L_0x0015
            boolean r2 = r2.f329887A
            if (r2 != r0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x002a
            if (r3 == 0) goto L_0x0026
            q1.j r3 = r3.f329972h
            if (r3 == 0) goto L_0x0026
            boolean r3 = r3.mo161701A()
            if (r3 != r0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p869y0.C112310d0.m153200e(y0.l):boolean");
    }
}
