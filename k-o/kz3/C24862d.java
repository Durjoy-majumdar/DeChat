package kz3;

import gy3.C87412m;
import gz3.C24597k;
import iz3.C24646e;
import iz3.C24651h;
import iz3.C24656l;
import java.util.List;
import mz3.C25049a0;
import mz3.C25054f;
import mz3.C25058j;
import mz3.C25069u;
import mz3.C25071w;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25176s0;
import n04.C25202z1;
import p04.C25414g;
import p04.C25416i;
import p04.C25417j;
import r04.C26094c;
import sx3.C110818d0;
import sx3.C26236u;
import ty3.C22558j;
import vz3.C22826c;
import vz3.C26408b;
import wy3.C26446d1;
import xy3.C26571h;
import xy3.C26575i;

/* renamed from: kz3.d */
public final class C24862d {

    /* renamed from: a */
    public final C24651h f70858a;

    /* renamed from: b */
    public final C24656l f70859b;

    /* renamed from: c */
    public final C24867h f70860c;

    /* renamed from: d */
    public final C24864f f70861d;

    public C24862d(C24651h hVar, C24656l lVar) {
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(lVar, "typeParameterResolver");
        this.f70858a = hVar;
        this.f70859b = lVar;
        C24867h hVar2 = new C24867h((C24864f) null);
        this.f70860c = hVar2;
        this.f70861d = new C24864f(hVar2);
    }

    /* renamed from: d */
    public static final C25414g m31340d(C25058j jVar) {
        return C25417j.m32698c(C25416i.UNRESOLVED_JAVA_CLASS, jVar.mo51098C());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if (r12 == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x01b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0168 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n04.C25176s0 mo51866a(mz3.C25058j r19, kz3.C24859a r20, n04.C25176s0 r21) {
        /*
            r18 = this;
            r6 = r18
            r7 = r20
            r0 = r21
            n04.z1 r1 = n04.C25202z1.OUT_VARIANCE
            gz3.k r2 = gz3.C24597k.SUPERTYPE
            kz3.b r3 = kz3.C24860b.FLEXIBLE_LOWER_BOUND
            if (r0 == 0) goto L_0x0014
            n04.g1 r4 = r21.mo37080J0()
            if (r4 != 0) goto L_0x0025
        L_0x0014:
            iz3.e r4 = new iz3.e
            iz3.h r9 = r6.f70858a
            r11 = 0
            r12 = 4
            r13 = 0
            r8 = r4
            r10 = r19
            r8.<init>(r9, r10, r11, r12, r13)
            n04.g1 r4 = n04.C25126h1.m31918b(r4)
        L_0x0025:
            r8 = r4
            mz3.i r4 = r19.mo51101j()
            r9 = 0
            r5 = 1
            r10 = 0
            if (r4 != 0) goto L_0x0036
            n04.j1 r4 = r18.mo51867b(r19)
        L_0x0033:
            r11 = r4
            goto L_0x0166
        L_0x0036:
            boolean r11 = r4 instanceof mz3.C25055g
            if (r11 == 0) goto L_0x0151
            r11 = r4
            mz3.g r11 = (mz3.C25055g) r11
            vz3.c r13 = r11.mo51084d()
            if (r13 == 0) goto L_0x013a
            boolean r4 = r7.f70846c
            if (r4 == 0) goto L_0x009e
            vz3.c r4 = kz3.C24863e.f70862a
            boolean r4 = gy3.C87412m.m108589b(r13, r4)
            if (r4 == 0) goto L_0x009e
            iz3.h r4 = r6.f70858a
            iz3.c r4 = r4.f70290a
            ty3.k r4 = r4.f70271p
            ty3.k$a r12 = r4.f73365c
            ny3.m<java.lang.Object>[] r13 = ty3.C26339k.f73362e
            r13 = r13[r10]
            r12.getClass()
            java.lang.String r12 = "property"
            gy3.C87412m.m108594g(r13, r12)
            java.lang.String r12 = r13.getName()
            java.lang.String r12 = u04.C90591a.m113487a(r12)
            vz3.f r12 = vz3.C22830f.m26794f(r12)
            rx3.g r13 = r4.f73364b
            java.lang.Object r13 = r13.getValue()
            g04.i r13 = (g04.C20770i) r13
            ez3.d r14 = ez3.C24476d.FROM_REFLECTION
            wy3.h r13 = r13.mo32462g(r12, r14)
            boolean r14 = r13 instanceof wy3.C26447e
            if (r14 == 0) goto L_0x0084
            wy3.e r13 = (wy3.C26447e) r13
            goto L_0x0085
        L_0x0084:
            r13 = r9
        L_0x0085:
            if (r13 != 0) goto L_0x0120
            wy3.h0 r4 = r4.f73363a
            vz3.b r13 = new vz3.b
            vz3.c r14 = ty3.C26343l.f73373g
            r13.<init>(r14, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.util.List r12 = sx3.C26236u.m33719b(r12)
            wy3.e r13 = r4.mo53433a(r13, r12)
            goto L_0x0120
        L_0x009e:
            vy3.d r4 = vy3.C26386d.f73603a
            iz3.h r12 = r6.f70858a
            iz3.c r12 = r12.f70290a
            wy3.e0 r12 = r12.f70270o
            ty3.h r14 = r12.mo52623m()
            r15 = 0
            r16 = 4
            r17 = 0
            r12 = r4
            wy3.e r13 = vy3.C26386d.m33970b(r12, r13, r14, r15, r16, r17)
            if (r13 != 0) goto L_0x00b9
            r13 = r9
            goto L_0x0120
        L_0x00b9:
            vy3.c r12 = vy3.C26384c.f73585a
            vz3.d r12 = zz3.C26794h.m35219g(r13)
            java.util.HashMap<vz3.d, vz3.c> r14 = vy3.C26384c.f73596l
            boolean r12 = r14.containsKey(r12)
            if (r12 == 0) goto L_0x0120
            kz3.b r12 = r7.f70845b
            if (r12 == r3) goto L_0x011c
            gz3.k r12 = r7.f70844a
            if (r12 == r2) goto L_0x011c
            java.util.List r12 = r19.mo51102y()
            java.lang.Object r12 = sx3.C110818d0.m150925W(r12)
            mz3.w r12 = (mz3.C25071w) r12
            boolean r14 = r12 instanceof mz3.C25049a0
            if (r14 == 0) goto L_0x00e0
            mz3.a0 r12 = (mz3.C25049a0) r12
            goto L_0x00e1
        L_0x00e0:
            r12 = r9
        L_0x00e1:
            if (r12 == 0) goto L_0x00f1
            mz3.w r14 = r12.mo51073l()
            if (r14 == 0) goto L_0x00f1
            boolean r12 = r12.mo51074p()
            if (r12 != 0) goto L_0x00f1
            r12 = 1
            goto L_0x00f2
        L_0x00f1:
            r12 = 0
        L_0x00f2:
            if (r12 != 0) goto L_0x00f5
            goto L_0x0119
        L_0x00f5:
            wy3.e r12 = r4.mo53378a(r13)
            n04.j1 r12 = r12.mo36110l()
            java.util.List r12 = r12.getParameters()
            java.lang.String r14 = "JavaToKotlinClassMapper.…ypeConstructor.parameters"
            gy3.C87412m.m108593f(r12, r14)
            java.lang.Object r12 = sx3.C110818d0.m150925W(r12)
            wy3.d1 r12 = (wy3.C26446d1) r12
            if (r12 == 0) goto L_0x0119
            n04.z1 r12 = r12.mo53423o()
            if (r12 != 0) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            if (r12 == r1) goto L_0x0119
            r12 = 1
            goto L_0x011a
        L_0x0119:
            r12 = 0
        L_0x011a:
            if (r12 == 0) goto L_0x0120
        L_0x011c:
            wy3.e r13 = r4.mo53378a(r13)
        L_0x0120:
            if (r13 != 0) goto L_0x012c
            iz3.h r4 = r6.f70858a
            iz3.c r4 = r4.f70290a
            iz3.j r4 = r4.f70266k
            wy3.e r13 = r4.mo51483a(r11)
        L_0x012c:
            if (r13 == 0) goto L_0x0134
            n04.j1 r4 = r13.mo36110l()
            if (r4 != 0) goto L_0x0033
        L_0x0134:
            n04.j1 r4 = r18.mo51867b(r19)
            goto L_0x0033
        L_0x013a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class type should have a FQ name: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0151:
            boolean r11 = r4 instanceof mz3.C25072x
            if (r11 == 0) goto L_0x031f
            iz3.l r11 = r6.f70859b
            mz3.x r4 = (mz3.C25072x) r4
            wy3.d1 r4 = r11.mo51482a(r4)
            if (r4 == 0) goto L_0x0165
            n04.j1 r4 = r4.mo36110l()
            goto L_0x0033
        L_0x0165:
            r11 = r9
        L_0x0166:
            if (r11 != 0) goto L_0x0169
            return r9
        L_0x0169:
            kz3.b r4 = r7.f70845b
            if (r4 != r3) goto L_0x016f
            r12 = 0
            goto L_0x017b
        L_0x016f:
            boolean r3 = r7.f70846c
            if (r3 != 0) goto L_0x0179
            gz3.k r3 = r7.f70844a
            if (r3 == r2) goto L_0x0179
            r2 = 1
            goto L_0x017a
        L_0x0179:
            r2 = 0
        L_0x017a:
            r12 = r2
        L_0x017b:
            if (r0 == 0) goto L_0x0182
            n04.j1 r2 = r21.mo37081K0()
            goto L_0x0183
        L_0x0182:
            r2 = r9
        L_0x0183:
            boolean r2 = gy3.C87412m.m108589b(r2, r11)
            if (r2 == 0) goto L_0x0196
            boolean r2 = r19.mo51100I()
            if (r2 != 0) goto L_0x0196
            if (r12 == 0) goto L_0x0196
            n04.s0 r0 = r0.mo37084O0(r5)
            return r0
        L_0x0196:
            boolean r0 = r19.mo51100I()
            java.lang.String r2 = "constructor.parameters"
            if (r0 != 0) goto L_0x01b9
            java.util.List r0 = r19.mo51102y()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b7
            java.util.List r0 = r11.getParameters()
            gy3.C87412m.m108593f(r0, r2)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x01b7
            goto L_0x01b9
        L_0x01b7:
            r0 = 0
            goto L_0x01ba
        L_0x01b9:
            r0 = 1
        L_0x01ba:
            java.util.List r3 = r11.getParameters()
            gy3.C87412m.m108593f(r3, r2)
            r2 = 10
            if (r0 == 0) goto L_0x0229
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = sx3.C36907w.m41090l(r3, r2)
            r10.<init>(r0)
            java.util.Iterator r13 = r3.iterator()
        L_0x01d2:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0226
            java.lang.Object r0 = r13.next()
            r14 = r0
            wy3.d1 r14 = (wy3.C26446d1) r14
            java.util.Set<wy3.d1> r0 = r7.f70847d
            boolean r0 = r04.C26094c.m33427g(r14, r9, r0)
            if (r0 == 0) goto L_0x01ee
            n04.m1 r0 = kz3.C24863e.m31345a(r14, r7)
            r21 = r13
            goto L_0x021f
        L_0x01ee:
            n04.n0 r15 = new n04.n0
            iz3.h r0 = r6.f70858a
            iz3.c r0 = r0.f70290a
            m04.n r5 = r0.f70256a
            kz3.c r4 = new kz3.c
            r0 = r4
            r1 = r18
            r2 = r14
            r3 = r19
            r9 = r4
            r4 = r20
            r21 = r13
            r13 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r15.<init>(r13, r9)
            kz3.f r0 = r6.f70861d
            boolean r1 = r19.mo51100I()
            if (r1 == 0) goto L_0x0215
            r1 = r7
            goto L_0x021b
        L_0x0215:
            kz3.b r1 = kz3.C24860b.INFLEXIBLE
            kz3.a r1 = r7.mo51862b(r1)
        L_0x021b:
            n04.m1 r0 = r0.mo51870g(r14, r1, r15)
        L_0x021f:
            r10.add(r0)
            r13 = r21
            r9 = 0
            goto L_0x01d2
        L_0x0226:
            r9 = r10
            goto L_0x0311
        L_0x0229:
            int r0 = r3.size()
            java.util.List r4 = r19.mo51102y()
            int r4 = r4.size()
            if (r0 == r4) goto L_0x0276
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = sx3.C36907w.m41090l(r3, r2)
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x0244:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0270
            java.lang.Object r2 = r1.next()
            wy3.d1 r2 = (wy3.C26446d1) r2
            n04.o1 r3 = new n04.o1
            p04.i r4 = p04.C25416i.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            java.lang.String[] r7 = new java.lang.String[r5]
            vz3.f r2 = r2.getName()
            java.lang.String r2 = r2.mo35995b()
            java.lang.String r9 = "p.name.asString()"
            gy3.C87412m.m108593f(r2, r9)
            r7[r10] = r2
            p04.g r2 = p04.C25417j.m32698c(r4, r7)
            r3.<init>(r2)
            r0.add(r3)
            goto L_0x0244
        L_0x0270:
            java.util.List r0 = sx3.C110818d0.m150953y0(r0)
            goto L_0x0310
        L_0x0276:
            java.util.List r0 = r19.mo51102y()
            java.lang.Iterable r0 = sx3.C110818d0.m150906E0(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r2 = sx3.C36907w.m41090l(r0, r2)
            r4.<init>(r2)
            sx3.j0 r0 = (sx3.C26234j0) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x028d:
            r2 = r0
            sx3.k0 r2 = (sx3.C26235k0) r2
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x030c
            java.lang.Object r2 = r2.next()
            sx3.i0 r2 = (sx3.C64188i0) r2
            int r7 = r2.f181909a
            T r2 = r2.f181910b
            mz3.w r2 = (mz3.C25071w) r2
            r3.size()
            java.lang.Object r7 = r3.get(r7)
            wy3.d1 r7 = (wy3.C26446d1) r7
            gz3.k r9 = gz3.C24597k.COMMON
            r13 = 3
            r14 = 0
            kz3.a r15 = kz3.C24863e.m31346b(r9, r10, r14, r13, r14)
            java.lang.String r14 = "parameter"
            gy3.C87412m.m108593f(r7, r14)
            n04.z1 r14 = n04.C25202z1.INVARIANT
            boolean r5 = r2 instanceof mz3.C25049a0
            if (r5 == 0) goto L_0x02fa
            mz3.a0 r2 = (mz3.C25049a0) r2
            mz3.w r5 = r2.mo51073l()
            boolean r2 = r2.mo51074p()
            if (r2 == 0) goto L_0x02cc
            r2 = r1
            goto L_0x02ce
        L_0x02cc:
            n04.z1 r2 = n04.C25202z1.IN_VARIANCE
        L_0x02ce:
            if (r5 == 0) goto L_0x02f2
            n04.z1 r10 = r7.mo53423o()
            if (r10 != r14) goto L_0x02d7
            goto L_0x02df
        L_0x02d7:
            n04.z1 r10 = r7.mo53423o()
            if (r2 == r10) goto L_0x02df
            r10 = 1
            goto L_0x02e0
        L_0x02df:
            r10 = 0
        L_0x02e0:
            if (r10 == 0) goto L_0x02e3
            goto L_0x02f2
        L_0x02e3:
            r10 = 0
            r14 = 0
            kz3.a r9 = kz3.C24863e.m31346b(r9, r14, r10, r13, r10)
            n04.j0 r5 = r6.mo51869e(r5, r9)
            n04.m1 r2 = r04.C26094c.m33423c(r5, r2, r7)
            goto L_0x02f8
        L_0x02f2:
            r10 = 0
            r14 = 0
            n04.m1 r2 = kz3.C24863e.m31345a(r7, r15)
        L_0x02f8:
            r5 = 0
            goto L_0x0306
        L_0x02fa:
            r5 = 0
            r10 = 0
            n04.o1 r7 = new n04.o1
            n04.j0 r2 = r6.mo51869e(r2, r15)
            r7.<init>(r14, r2)
            r2 = r7
        L_0x0306:
            r4.add(r2)
            r5 = 1
            r10 = 0
            goto L_0x028d
        L_0x030c:
            java.util.List r0 = sx3.C110818d0.m150953y0(r4)
        L_0x0310:
            r9 = r0
        L_0x0311:
            r0 = 0
            r1 = 16
            r13 = 0
            r7 = r8
            r8 = r11
            r10 = r12
            r11 = r0
            r12 = r1
            n04.s0 r0 = n04.C25146k0.m31961g(r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x031f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown classifier kind: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kz3.C24862d.mo51866a(mz3.j, kz3.a, n04.s0):n04.s0");
    }

    /* renamed from: b */
    public final C25144j1 mo51867b(C25058j jVar) {
        C25144j1 l = this.f70858a.f70290a.f70259d.mo52574c().f70633l.mo53433a(C26408b.m33992l(new C22826c(jVar.mo51099D())), C26236u.m33719b(0)).mo36110l();
        C87412m.m108593f(l, "c.components.deserialize…istOf(0)).typeConstructor");
        return l;
    }

    /* renamed from: c */
    public final C25143j0 mo51868c(C25054f fVar, C24859a aVar, boolean z) {
        C25202z1 z1Var = C25202z1.OUT_VARIANCE;
        C25202z1 z1Var2 = C25202z1.INVARIANT;
        C87412m.m108594g(fVar, "arrayType");
        C87412m.m108594g(aVar, "attr");
        C25071w g = fVar.mo51072g();
        C25069u uVar = g instanceof C25069u ? (C25069u) g : null;
        C22558j type = uVar != null ? uVar.getType() : null;
        C24646e eVar = new C24646e(this.f70858a, fVar, true);
        if (type != null) {
            C25176s0 r = this.f70858a.f70290a.f70270o.mo52623m().mo53326r(type);
            C87412m.m108593f(r, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            int i = C26571h.f73936P0;
            List c0 = C110818d0.m150931c0(eVar, r.getAnnotations());
            C26094c.m33431k(r, c0.isEmpty() ? C26571h.C26572a.f73937a : new C26575i(c0));
            return aVar.f70846c ? r : C25146k0.m31957c(r, r.mo37084O0(true));
        }
        C25143j0 e = mo51869e(g, C24863e.m31346b(C24597k.COMMON, aVar.f70846c, (C26446d1) null, 2, (Object) null));
        if (!aVar.f70846c) {
            return C25146k0.m31957c(this.f70858a.f70290a.f70270o.mo52623m().mo53317i(z1Var2, e, eVar), this.f70858a.f70290a.f70270o.mo52623m().mo53317i(z1Var, e, eVar).mo37084O0(true));
        }
        if (!z) {
            z1Var = z1Var2;
        }
        return this.f70858a.f70290a.f70270o.mo52623m().mo53317i(z1Var, e, eVar);
    }

    /* renamed from: e */
    public final C25143j0 mo51869e(C25071w wVar, C24859a aVar) {
        C25143j0 e;
        C87412m.m108594g(aVar, "attr");
        if (wVar instanceof C25069u) {
            C22558j type = ((C25069u) wVar).getType();
            C25176s0 t = type != null ? this.f70858a.f70290a.f70270o.mo52623m().mo53327t(type) : this.f70858a.f70290a.f70270o.mo52623m().mo53330x();
            C87412m.m108593f(t, "{\n                val pr…ns.unitType\n            }");
            return t;
        }
        boolean z = false;
        if (wVar instanceof C25058j) {
            C25058j jVar = (C25058j) wVar;
            if (!aVar.f70846c && aVar.f70844a != C24597k.SUPERTYPE) {
                z = true;
            }
            boolean I = jVar.mo51100I();
            if (I || z) {
                C25176s0 a = mo51866a(jVar, aVar.mo51862b(C24860b.FLEXIBLE_LOWER_BOUND), (C25176s0) null);
                if (a == null) {
                    return m31340d(jVar);
                }
                C25176s0 a2 = mo51866a(jVar, aVar.mo51862b(C24860b.FLEXIBLE_UPPER_BOUND), a);
                return a2 == null ? m31340d(jVar) : I ? new C24866g(a, a2) : C25146k0.m31957c(a, a2);
            }
            C25143j0 a3 = mo51866a(jVar, aVar, (C25176s0) null);
            if (a3 == null) {
                a3 = m31340d(jVar);
            }
            return a3;
        } else if (wVar instanceof C25054f) {
            return mo51868c((C25054f) wVar, aVar, false);
        } else {
            if (wVar instanceof C25049a0) {
                C25071w l = ((C25049a0) wVar).mo51073l();
                if (l != null && (e = mo51869e(l, aVar)) != null) {
                    return e;
                }
                C25176s0 n = this.f70858a.f70290a.f70270o.mo52623m().mo53322n();
                C87412m.m108593f(n, "c.module.builtIns.defaultBound");
                return n;
            } else if (wVar == null) {
                C25176s0 n2 = this.f70858a.f70290a.f70270o.mo52623m().mo53322n();
                C87412m.m108593f(n2, "c.module.builtIns.defaultBound");
                return n2;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + wVar);
            }
        }
    }
}
