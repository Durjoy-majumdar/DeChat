package n04;

import g04.C20770i;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n04.C25114d1;
import sx3.C36907w;
import sx3.C64197v;
import w04.C26412a;
import wy3.C26446d1;
import xy3.C26566c;
import xy3.C26571h;

/* renamed from: n04.b1 */
public final class C25107b1 {

    /* renamed from: a */
    public final C25114d1 f71537a;

    /* renamed from: b */
    public final boolean f71538b;

    static {
        new C25107b1(C25114d1.C25115a.f71548a, false);
    }

    public C25107b1(C25114d1 d1Var, boolean z) {
        C87412m.m108594g(d1Var, "reportStrategy");
        this.f71537a = d1Var;
        this.f71538b = z;
    }

    /* renamed from: a */
    public final void mo52236a(C26571h hVar, C26571h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((C26566c) it.next()).mo51298d());
        }
        Iterator it4 = hVar2.iterator();
        while (it4.hasNext()) {
            C26566c cVar = (C26566c) it4.next();
            if (hashSet.contains(cVar.mo51298d())) {
                this.f71537a.mo52252c(cVar);
            }
        }
    }

    /* renamed from: b */
    public final C25122g1 mo52237b(C25143j0 j0Var, C25122g1 g1Var) {
        if (C25153l0.m31968a(j0Var)) {
            return j0Var.mo37080J0();
        }
        C25122g1 J0 = j0Var.mo37080J0();
        g1Var.getClass();
        C87412m.m108594g(J0, "other");
        if (g1Var.isEmpty() && J0.isEmpty()) {
            return g1Var;
        }
        ArrayList arrayList = new ArrayList();
        Collection<Integer> values = C25122g1.f71557e.f63559a.values();
        C87412m.m108593f(values, "idPerType.values");
        for (Integer intValue : values) {
            int intValue2 = intValue.intValue();
            C25118e1 e1Var = (C25118e1) g1Var.f73188d.get(intValue2);
            C25118e1 e1Var2 = (C25118e1) J0.f73188d.get(intValue2);
            C26412a.m34008a(arrayList, e1Var == null ? e1Var2 != null ? e1Var2.mo52257a(e1Var) : null : e1Var.mo52257a(e1Var2));
        }
        return C25122g1.f71557e.mo33818c(arrayList);
    }

    /* renamed from: c */
    public final C25176s0 mo52238c(C25110c1 c1Var, C25122g1 g1Var, boolean z, int i, boolean z2) {
        C25158m1 d = mo52239d(new C25164o1(C25202z1.INVARIANT, c1Var.f71544b.mo51919E0()), c1Var, (C26446d1) null, i);
        C25143j0 type = d.getType();
        C87412m.m108593f(type, "expandedProjection.type");
        C25176s0 a = C25174r1.m32014a(type);
        if (C25153l0.m31968a(a)) {
            return a;
        }
        d.mo52295a();
        mo52236a(a.getAnnotations(), C25162o.m31984a(g1Var));
        if (!C25153l0.m31968a(a)) {
            a = C25174r1.m32017d(a, (List) null, mo52237b(a, g1Var), 1, (Object) null);
        }
        C25176s0 l = C25187v1.m32092l(a, z);
        C87412m.m108593f(l, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (!z2) {
            return l;
        }
        C25144j1 l2 = c1Var.f71544b.mo36110l();
        C87412m.m108593f(l2, "descriptor.typeConstructor");
        return C25190w0.m32112c(l, C25146k0.m31962h(g1Var, l2, c1Var.f71545c, z, C20770i.C20773b.f58684b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0224  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n04.C25158m1 mo52239d(n04.C25158m1 r15, n04.C25110c1 r16, wy3.C26446d1 r17, int r18) {
        /*
            r14 = this;
            r6 = r14
            r7 = r16
            r0 = r17
            r8 = r18
            n04.z1 r1 = n04.C25202z1.INVARIANT
            wy3.c1 r2 = r7.f71544b
            r3 = 100
            if (r8 > r3) goto L_0x024f
            boolean r2 = r15.mo52296b()
            if (r2 == 0) goto L_0x001d
            gy3.C87412m.m108591d(r17)
            n04.m1 r0 = n04.C25187v1.m32093m(r17)
            return r0
        L_0x001d:
            n04.j0 r2 = r15.getType()
            java.lang.String r3 = "underlyingProjection.type"
            gy3.C87412m.m108593f(r2, r3)
            n04.j1 r3 = r2.mo37081K0()
            java.lang.String r4 = "constructor"
            gy3.C87412m.m108594g(r3, r4)
            wy3.h r3 = r3.mo37094o()
            boolean r4 = r3 instanceof wy3.C26446d1
            r5 = 0
            if (r4 == 0) goto L_0x0041
            java.util.Map<wy3.d1, n04.m1> r4 = r7.f71546d
            java.lang.Object r3 = r4.get(r3)
            n04.m1 r3 = (n04.C25158m1) r3
            goto L_0x0042
        L_0x0041:
            r3 = r5
        L_0x0042:
            r4 = 1
            if (r3 != 0) goto L_0x01a7
            n04.j0 r0 = r15.getType()
            n04.y1 r0 = r0.mo52229N0()
            boolean r2 = n04.C25102a0.m31816a(r0)
            if (r2 == 0) goto L_0x0055
            goto L_0x01a5
        L_0x0055:
            n04.s0 r9 = n04.C25174r1.m32014a(r0)
            boolean r0 = n04.C25153l0.m31968a(r9)
            if (r0 != 0) goto L_0x01a5
            r04.b r0 = r04.C22196b.f62832d
            java.lang.String r2 = "predicate"
            gy3.C87412m.m108594g(r0, r2)
            boolean r0 = n04.C25187v1.m32083c(r9, r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x01a5
        L_0x006e:
            n04.j1 r0 = r9.mo37081K0()
            wy3.h r3 = r0.mo37094o()
            java.util.List r10 = r0.getParameters()
            r10.size()
            java.util.List r10 = r9.mo37079I0()
            r10.size()
            boolean r10 = r3 instanceof wy3.C26446d1
            if (r10 == 0) goto L_0x008a
            goto L_0x01a5
        L_0x008a:
            boolean r10 = r3 instanceof wy3.C26443c1
            r11 = 0
            if (r10 == 0) goto L_0x0125
            wy3.c1 r3 = (wy3.C26443c1) r3
            boolean r2 = r7.mo52243a(r3)
            if (r2 == 0) goto L_0x00b9
            n04.d1 r0 = r6.f71537a
            r0.mo52253d(r3)
            n04.o1 r0 = new n04.o1
            p04.i r2 = p04.C25416i.RECURSIVE_TYPE_ALIAS
            java.lang.String[] r4 = new java.lang.String[r4]
            vz3.f r3 = r3.getName()
            java.lang.String r3 = r3.f65637d
            java.lang.String r5 = "typeDescriptor.name.toString()"
            gy3.C87412m.m108593f(r3, r5)
            r4[r11] = r3
            p04.g r2 = p04.C25417j.m32698c(r2, r4)
            r0.<init>(r1, r2)
            r1 = r0
            goto L_0x01a6
        L_0x00b9:
            java.util.List r1 = r9.mo37079I0()
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = sx3.C36907w.m41090l(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x00cc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00f5
            java.lang.Object r4 = r1.next()
            int r10 = r11 + 1
            if (r11 < 0) goto L_0x00f1
            n04.m1 r4 = (n04.C25158m1) r4
            java.util.List r12 = r0.getParameters()
            java.lang.Object r11 = r12.get(r11)
            wy3.d1 r11 = (wy3.C26446d1) r11
            int r12 = r8 + 1
            n04.m1 r4 = r14.mo52239d(r4, r7, r11, r12)
            r2.add(r4)
            r11 = r10
            goto L_0x00cc
        L_0x00f1:
            sx3.C64197v.m75542k()
            throw r5
        L_0x00f5:
            n04.c1$a r0 = n04.C25110c1.f71542e
            n04.c1 r1 = r0.mo52244a(r7, r3, r2)
            n04.g1 r2 = r9.mo37080J0()
            boolean r3 = r9.mo37082L0()
            int r4 = r8 + 1
            r5 = 0
            r0 = r14
            n04.s0 r0 = r0.mo52238c(r1, r2, r3, r4, r5)
            n04.s0 r1 = r14.mo52240e(r9, r7, r8)
            boolean r2 = n04.C25102a0.m31816a(r0)
            if (r2 == 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            n04.s0 r0 = n04.C25190w0.m32112c(r0, r1)
        L_0x011a:
            n04.o1 r1 = new n04.o1
            n04.z1 r2 = r15.mo52295a()
            r1.<init>(r2, r0)
            goto L_0x01a6
        L_0x0125:
            n04.s0 r0 = r14.mo52240e(r9, r7, r8)
            n04.t1 r1 = n04.C25180t1.m32043d(r0)
            java.util.List r3 = r0.mo37079I0()
            java.util.Iterator r3 = r3.iterator()
        L_0x0135:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x019b
            java.lang.Object r4 = r3.next()
            int r7 = r11 + 1
            if (r11 < 0) goto L_0x0197
            n04.m1 r4 = (n04.C25158m1) r4
            boolean r8 = r4.mo52296b()
            if (r8 != 0) goto L_0x0195
            n04.j0 r8 = r4.getType()
            java.lang.String r10 = "substitutedArgument.type"
            gy3.C87412m.m108593f(r8, r10)
            r04.a r12 = r04.C22195a.f62831d
            gy3.C87412m.m108594g(r12, r2)
            boolean r8 = n04.C25187v1.m32083c(r8, r12)
            if (r8 != 0) goto L_0x0195
            java.util.List r8 = r9.mo37079I0()
            java.lang.Object r8 = r8.get(r11)
            n04.m1 r8 = (n04.C25158m1) r8
            n04.j1 r12 = r9.mo37081K0()
            java.util.List r12 = r12.getParameters()
            java.lang.Object r11 = r12.get(r11)
            wy3.d1 r11 = (wy3.C26446d1) r11
            boolean r12 = r6.f71538b
            if (r12 == 0) goto L_0x0195
            n04.d1 r12 = r6.f71537a
            n04.j0 r8 = r8.getType()
            java.lang.String r13 = "unsubstitutedArgument.type"
            gy3.C87412m.m108593f(r8, r13)
            n04.j0 r4 = r4.getType()
            gy3.C87412m.m108593f(r4, r10)
            java.lang.String r10 = "typeParameter"
            gy3.C87412m.m108593f(r11, r10)
            r12.mo52251b(r1, r8, r4, r11)
        L_0x0195:
            r11 = r7
            goto L_0x0135
        L_0x0197:
            sx3.C64197v.m75542k()
            throw r5
        L_0x019b:
            n04.o1 r1 = new n04.o1
            n04.z1 r2 = r15.mo52295a()
            r1.<init>(r2, r0)
            goto L_0x01a6
        L_0x01a5:
            r1 = r15
        L_0x01a6:
            return r1
        L_0x01a7:
            boolean r8 = r3.mo52296b()
            if (r8 == 0) goto L_0x01b5
            gy3.C87412m.m108591d(r17)
            n04.m1 r0 = n04.C25187v1.m32093m(r17)
            return r0
        L_0x01b5:
            n04.j0 r8 = r3.getType()
            n04.y1 r8 = r8.mo52229N0()
            n04.z1 r3 = r3.mo52295a()
            java.lang.String r9 = "argument.projectionKind"
            gy3.C87412m.m108593f(r3, r9)
            n04.z1 r9 = r15.mo52295a()
            java.lang.String r10 = "underlyingProjection.projectionKind"
            gy3.C87412m.m108593f(r9, r10)
            if (r9 != r3) goto L_0x01d2
            goto L_0x01e0
        L_0x01d2:
            if (r9 != r1) goto L_0x01d5
            goto L_0x01e0
        L_0x01d5:
            if (r3 != r1) goto L_0x01d9
            r3 = r9
            goto L_0x01e0
        L_0x01d9:
            n04.d1 r9 = r6.f71537a
            wy3.c1 r10 = r7.f71544b
            r9.mo52250a(r10, r0, r8)
        L_0x01e0:
            if (r0 == 0) goto L_0x01e8
            n04.z1 r9 = r17.mo53423o()
            if (r9 != 0) goto L_0x01e9
        L_0x01e8:
            r9 = r1
        L_0x01e9:
            if (r9 != r3) goto L_0x01ec
            goto L_0x01f9
        L_0x01ec:
            if (r9 != r1) goto L_0x01ef
            goto L_0x01f9
        L_0x01ef:
            if (r3 != r1) goto L_0x01f2
            goto L_0x01fa
        L_0x01f2:
            n04.d1 r1 = r6.f71537a
            wy3.c1 r7 = r7.f71544b
            r1.mo52250a(r7, r0, r8)
        L_0x01f9:
            r1 = r3
        L_0x01fa:
            xy3.h r0 = r2.getAnnotations()
            xy3.h r3 = r8.getAnnotations()
            r14.mo52236a(r0, r3)
            boolean r0 = r8 instanceof n04.C25199z
            if (r0 == 0) goto L_0x0224
            n04.z r8 = (n04.C25199z) r8
            n04.g1 r0 = r2.mo37080J0()
            n04.g1 r0 = r14.mo52237b(r8, r0)
            java.lang.String r2 = "newAttributes"
            gy3.C87412m.m108594g(r0, r2)
            n04.z r2 = new n04.z
            n04.s0 r3 = r8.f71541f
            ty3.h r3 = r04.C26094c.m33425e(r3)
            r2.<init>(r3, r0)
            goto L_0x0249
        L_0x0224:
            n04.s0 r0 = n04.C25174r1.m32014a(r8)
            boolean r3 = r2.mo37082L0()
            n04.s0 r0 = n04.C25187v1.m32092l(r0, r3)
            java.lang.String r3 = "makeNullableIfNeeded(thi…romType.isMarkedNullable)"
            gy3.C87412m.m108593f(r0, r3)
            n04.g1 r2 = r2.mo37080J0()
            boolean r3 = n04.C25153l0.m31968a(r0)
            if (r3 == 0) goto L_0x0240
            goto L_0x0248
        L_0x0240:
            n04.g1 r2 = r14.mo52237b(r0, r2)
            n04.s0 r0 = n04.C25174r1.m32017d(r0, r5, r2, r4, r5)
        L_0x0248:
            r2 = r0
        L_0x0249:
            n04.o1 r0 = new n04.o1
            r0.<init>(r1, r2)
            return r0
        L_0x024f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Too deep recursion while expanding type alias "
            r1.append(r3)
            vz3.f r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25107b1.mo52239d(n04.m1, n04.c1, wy3.d1, int):n04.m1");
    }

    /* renamed from: e */
    public final C25176s0 mo52240e(C25176s0 s0Var, C25110c1 c1Var, int i) {
        C25144j1 K0 = s0Var.mo37081K0();
        List<C25158m1> I0 = s0Var.mo37079I0();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(I0, 10));
        int i2 = 0;
        for (T next : I0) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C25158m1 m1Var = (C25158m1) next;
                C25158m1 d = mo52239d(m1Var, c1Var, K0.getParameters().get(i2), i + 1);
                if (!d.mo52296b()) {
                    d = new C25164o1(d.mo52295a(), C25187v1.m32091k(d.getType(), m1Var.getType().mo37082L0()));
                }
                arrayList.add(d);
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return C25174r1.m32017d(s0Var, arrayList, (C25122g1) null, 2, (Object) null);
    }
}
