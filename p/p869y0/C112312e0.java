package p869y0;

import fy3.C32226l;
import gy3.C87412m;
import my3.C61594j;
import p410k0.C108793e;
import rx3.C13603j;

/* renamed from: y0.e0 */
public final class C112312e0 {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m153201a(p869y0.C112321l r9, fy3.C32226l<? super p869y0.C112321l, java.lang.Boolean> r10) {
        /*
            y0.b0 r0 = r9.f336333g
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x009f
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            if (r0 == r2) goto L_0x0047
            if (r0 == r6) goto L_0x009f
            if (r0 == r5) goto L_0x009f
            if (r0 == r4) goto L_0x0047
            if (r0 != r3) goto L_0x0041
            k0.e<y0.l> r0 = r9.f336332f
            int r3 = r0.f325786f
            if (r3 <= 0) goto L_0x0031
            int r3 = r3 - r2
            T[] r0 = r0.f325784d
        L_0x0021:
            r4 = r0[r3]
            y0.l r4 = (p869y0.C112321l) r4
            boolean r4 = m153201a(r4, r10)
            if (r4 == 0) goto L_0x002d
            r0 = 1
            goto L_0x0032
        L_0x002d:
            int r3 = r3 + -1
            if (r3 >= 0) goto L_0x0021
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x008e
            java.lang.Object r9 = r10.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00b7
            goto L_0x008e
        L_0x0041:
            rx3.j r9 = new rx3.j
            r9.<init>()
            throw r9
        L_0x0047:
            y0.l r0 = r9.f336334h
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L_0x0095
            y0.b0 r8 = r0.f336333g
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x0090
            if (r8 == r2) goto L_0x007c
            if (r8 == r6) goto L_0x0090
            if (r8 == r5) goto L_0x0072
            if (r8 == r4) goto L_0x0065
            if (r8 == r3) goto L_0x0072
            rx3.j r9 = new rx3.j
            r9.<init>()
            throw r9
        L_0x0065:
            boolean r3 = m153201a(r0, r10)
            if (r3 != 0) goto L_0x008e
            boolean r9 = m153203c(r9, r0, r6, r10)
            if (r9 == 0) goto L_0x00b7
            goto L_0x008e
        L_0x0072:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r7.toString()
            r9.<init>(r10)
            throw r9
        L_0x007c:
            boolean r9 = m153201a(r0, r10)
            if (r9 != 0) goto L_0x008e
            java.lang.Object r9 = r10.invoke(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00b7
        L_0x008e:
            r1 = 1
            goto L_0x00b7
        L_0x0090:
            boolean r1 = m153203c(r9, r0, r6, r10)
            goto L_0x00b7
        L_0x0095:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r7.toString()
            r9.<init>(r10)
            throw r9
        L_0x009f:
            k0.e<y0.l> r9 = r9.f336332f
            int r0 = r9.f325786f
            if (r0 <= 0) goto L_0x00b7
            int r0 = r0 - r2
            T[] r9 = r9.f325784d
        L_0x00a8:
            r3 = r9[r0]
            y0.l r3 = (p869y0.C112321l) r3
            boolean r3 = m153201a(r3, r10)
            if (r3 == 0) goto L_0x00b3
            goto L_0x008e
        L_0x00b3:
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x00a8
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p869y0.C112312e0.m153201a(y0.l, fy3.l):boolean");
    }

    /* renamed from: b */
    public static final boolean m153202b(C112321l lVar, C32226l<? super C112321l, Boolean> lVar2) {
        int ordinal = lVar.f336333g.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (!(ordinal == 2 || ordinal == 3)) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return lVar2.invoke(lVar).booleanValue();
                        }
                        throw new C13603j();
                    }
                }
            }
            C112321l lVar3 = lVar.f336334h;
            if (lVar3 != null) {
                return m153202b(lVar3, lVar2) || m153203c(lVar, lVar3, 1, lVar2);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        C108793e<C112321l> eVar = lVar.f336332f;
        int i = eVar.f325786f;
        if (i <= 0) {
            return false;
        }
        T[] tArr = eVar.f325784d;
        int i2 = 0;
        while (!m153202b((C112321l) tArr[i2], lVar2)) {
            i2++;
            if (i2 >= i) {
                return false;
            }
        }
    }

    /* renamed from: c */
    public static final boolean m153203c(C112321l lVar, C112321l lVar2, int i, C32226l<? super C112321l, Boolean> lVar3) {
        C112306b0 b0Var = C112306b0.DeactivatedParent;
        C112306b0 b0Var2 = lVar.f336333g;
        boolean z = true;
        if (b0Var2 == C112306b0.ActiveParent || b0Var2 == b0Var) {
            if (i == 1) {
                C108793e<C112321l> eVar = lVar.f336332f;
                int i2 = new C61594j(0, eVar.f325786f - 1).f175175e;
                if (i2 >= 0) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (true) {
                        if (z2) {
                            C112321l lVar4 = (C112321l) eVar.f325784d[i3];
                            if (C112310d0.m153200e(lVar4) && m153202b(lVar4, lVar3)) {
                                return true;
                            }
                        }
                        if (C87412m.m108589b(eVar.f325784d[i3], lVar2)) {
                            z2 = true;
                        }
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                if (i == 2) {
                    C108793e<C112321l> eVar2 = lVar.f336332f;
                    int i4 = new C61594j(0, eVar2.f325786f - 1).f175175e;
                    if (i4 >= 0) {
                        boolean z3 = false;
                        while (true) {
                            if (z3) {
                                C112321l lVar5 = (C112321l) eVar2.f325784d[i4];
                                if (C112310d0.m153200e(lVar5) && m153201a(lVar5, lVar3)) {
                                    return true;
                                }
                            }
                            if (C87412m.m108589b(eVar2.f325784d[i4], lVar2)) {
                                z3 = true;
                            }
                            if (i4 == 0) {
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
            }
            if (!(i == 1) && lVar.f336333g != b0Var) {
                if (lVar.f336331e != null) {
                    z = false;
                }
                if (!z) {
                    return lVar3.invoke(lVar).booleanValue();
                }
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
