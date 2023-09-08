package n04;

import java.util.List;
import wy3.C26446d1;
import wy3.C26469k;

/* renamed from: n04.x */
public class C25192x {
    /* renamed from: a */
    public static /* synthetic */ void m32114a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static C25180t1 m32115b(List<C26446d1> list, C25167p1 p1Var, C26469k kVar, List<C26446d1> list2) {
        if (list == null) {
            m32114a(0);
            throw null;
        } else if (p1Var == null) {
            m32114a(1);
            throw null;
        } else if (kVar == null) {
            m32114a(2);
            throw null;
        } else if (list2 != null) {
            C25180t1 c = m32116c(list, p1Var, kVar, list2, (boolean[]) null);
            if (c != null) {
                return c;
            }
            throw new AssertionError("Substitution failed");
        } else {
            m32114a(3);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static n04.C25180t1 m32116c(java.util.List<wy3.C26446d1> r19, n04.C25167p1 r20, wy3.C26469k r21, java.util.List<wy3.C26446d1> r22, boolean[] r23) {
        /*
            r0 = r20
            r1 = r22
            r2 = 0
            if (r19 == 0) goto L_0x00fa
            r3 = 6
            if (r0 == 0) goto L_0x00f6
            if (r21 == 0) goto L_0x00f1
            if (r1 == 0) goto L_0x00eb
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.Iterator r14 = r19.iterator()
            r15 = 0
            r9 = 0
        L_0x001e:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r14.next()
            r11 = r4
            wy3.d1 r11 = (wy3.C26446d1) r11
            xy3.h r5 = r11.getAnnotations()
            boolean r6 = r11.mo53426u()
            n04.z1 r7 = r11.mo53423o()
            vz3.f r8 = r11.getName()
            int r16 = r9 + 1
            wy3.y0 r10 = wy3.C26521y0.f73808a
            m04.n r17 = r11.mo53424s0()
            r4 = r21
            r18 = r11
            r11 = r17
            zy3.o0 r4 = zy3.C26763o0.m35032M0(r4, r5, r6, r7, r8, r9, r10, r11)
            n04.j1 r5 = r18.mo36110l()
            n04.o1 r6 = new n04.o1
            n04.s0 r7 = r4.mo36111s()
            r6.<init>(r7)
            r12.put(r5, r6)
            r5 = r18
            r13.put(r5, r4)
            r1.add(r4)
            r9 = r16
            goto L_0x001e
        L_0x0068:
            n04.l1$a r1 = n04.C25154l1.f71605b
            r4 = 2
            n04.l1 r1 = n04.C25154l1.C25155a.m31971c(r1, r12, r15, r4, r2)
            n04.t1 r4 = n04.C25180t1.m32045f(r0, r1)
            n04.q1 r5 = new n04.q1
            r5.<init>(r0)
            n04.t1 r0 = n04.C25180t1.m32045f(r5, r1)
            java.util.Iterator r1 = r19.iterator()
        L_0x0080:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00ea
            java.lang.Object r5 = r1.next()
            wy3.d1 r5 = (wy3.C26446d1) r5
            java.lang.Object r6 = r13.get(r5)
            zy3.o0 r6 = (zy3.C26763o0) r6
            java.util.List r5 = r5.getUpperBounds()
            java.util.Iterator r5 = r5.iterator()
        L_0x009a:
            boolean r7 = r5.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x00e4
            java.lang.Object r7 = r5.next()
            n04.j0 r7 = (n04.C25143j0) r7
            n04.j1 r9 = r7.mo37081K0()
            wy3.h r9 = r9.mo37094o()
            boolean r10 = r9 instanceof wy3.C26446d1
            if (r10 == 0) goto L_0x00c2
            wy3.d1 r9 = (wy3.C26446d1) r9
            java.lang.String r10 = "typeParameter"
            gy3.C87412m.m108594g(r9, r10)
            boolean r9 = r04.C26094c.m33428h(r9, r2, r2, r3, r2)
            if (r9 == 0) goto L_0x00c2
            r9 = r4
            goto L_0x00c3
        L_0x00c2:
            r9 = r0
        L_0x00c3:
            n04.z1 r10 = n04.C25202z1.OUT_VARIANCE
            n04.j0 r9 = r9.mo52314k(r7, r10)
            if (r9 != 0) goto L_0x00cc
            return r2
        L_0x00cc:
            if (r9 == r7) goto L_0x00d2
            if (r23 == 0) goto L_0x00d2
            r23[r15] = r8
        L_0x00d2:
            r6.mo53743L0()
            boolean r7 = n04.C25153l0.m31968a(r9)
            if (r7 == 0) goto L_0x00dc
            goto L_0x009a
        L_0x00dc:
            java.util.List<n04.j0> r7 = r6.f74421r
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.add(r9)
            goto L_0x009a
        L_0x00e4:
            r6.mo53743L0()
            r6.f74422s = r8
            goto L_0x0080
        L_0x00ea:
            return r4
        L_0x00eb:
            r0 = 8
            m32114a(r0)
            throw r2
        L_0x00f1:
            r0 = 7
            m32114a(r0)
            throw r2
        L_0x00f6:
            m32114a(r3)
            throw r2
        L_0x00fa:
            r0 = 5
            m32114a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25192x.m32116c(java.util.List, n04.p1, wy3.k, java.util.List, boolean[]):n04.t1");
    }
}
