package nz3;

import gy3.C87412m;
import iz3.C24644d;
import n04.C25143j0;
import n04.C25176s0;

/* renamed from: nz3.f */
public final class C25264f {

    /* renamed from: a */
    public final C24644d f71736a;

    /* renamed from: nz3.f$a */
    public static final class C25265a {

        /* renamed from: a */
        public final C25143j0 f71737a;

        /* renamed from: b */
        public final int f71738b;

        public C25265a(C25143j0 j0Var, int i) {
            this.f71737a = j0Var;
            this.f71738b = i;
        }
    }

    /* renamed from: nz3.f$b */
    public static final class C25266b {

        /* renamed from: a */
        public final C25176s0 f71739a;

        /* renamed from: b */
        public final int f71740b;

        /* renamed from: c */
        public final boolean f71741c;

        public C25266b(C25176s0 s0Var, int i, boolean z) {
            this.f71739a = s0Var;
            this.f71740b = i;
            this.f71741c = z;
        }
    }

    public C25264f(C24644d dVar) {
        C87412m.m108594g(dVar, "javaResolverSettings");
        this.f71736a = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: nz3.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: xy3.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nz3.C25264f.C25266b mo52380a(n04.C25176s0 r20, fy3.C32226l<? super java.lang.Integer, nz3.C25267g> r21, int r22, nz3.C35068v r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r23
            r3 = r25
            java.lang.String r4 = "<this>"
            gy3.C87412m.m108594g(r2, r4)
            nz3.v r4 = nz3.C35068v.INFLEXIBLE
            r5 = 0
            r6 = 1
            if (r2 == r4) goto L_0x0015
            r7 = 1
            goto L_0x0016
        L_0x0015:
            r7 = 0
        L_0x0016:
            if (r3 == 0) goto L_0x001d
            if (r24 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r8 = 0
            goto L_0x001e
        L_0x001d:
            r8 = 1
        L_0x001e:
            r9 = 0
            if (r7 != 0) goto L_0x0031
            java.util.List r7 = r20.mo37079I0()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0031
            nz3.f$b r1 = new nz3.f$b
            r1.<init>(r9, r6, r5)
            return r1
        L_0x0031:
            n04.j1 r7 = r20.mo37081K0()
            wy3.h r7 = r7.mo37094o()
            if (r7 != 0) goto L_0x0041
            nz3.f$b r1 = new nz3.f$b
            r1.<init>(r9, r6, r5)
            return r1
        L_0x0041:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r22)
            java.lang.Object r10 = r1.invoke(r10)
            nz3.g r10 = (nz3.C25267g) r10
            nz3.e r11 = nz3.C25310x.f71810a
            vy3.d r11 = vy3.C26386d.f73603a
            if (r2 == r4) goto L_0x0053
            r12 = 1
            goto L_0x0054
        L_0x0053:
            r12 = 0
        L_0x0054:
            if (r12 != 0) goto L_0x0058
            goto L_0x00d8
        L_0x0058:
            boolean r12 = r7 instanceof wy3.C26447e
            if (r12 != 0) goto L_0x005e
            goto L_0x00d8
        L_0x005e:
            nz3.h r12 = r10.f71744b
            nz3.h r13 = nz3.C117642h.READ_ONLY
            if (r12 != r13) goto L_0x00b9
            nz3.v r12 = nz3.C35068v.FLEXIBLE_LOWER
            if (r2 != r12) goto L_0x00b9
            r12 = r7
            wy3.e r12 = (wy3.C26447e) r12
            vy3.c r13 = vy3.C26384c.f73585a
            vz3.d r13 = zz3.C26794h.m35219g(r12)
            java.util.HashMap<vz3.d, vz3.c> r14 = vy3.C26384c.f73595k
            boolean r13 = r14.containsKey(r13)
            if (r13 == 0) goto L_0x00b9
            vz3.d r7 = zz3.C26794h.m35219g(r12)
            java.lang.Object r7 = r14.get(r7)
            vz3.c r7 = (vz3.C22826c) r7
            if (r7 == 0) goto L_0x0093
            ty3.h r11 = d04.C24442a.m30538e(r12)
            wy3.e r7 = r11.mo53318j(r7)
            java.lang.String r11 = "descriptor.builtIns.getB…Name(oppositeClassFqName)"
            gy3.C87412m.m108593f(r7, r11)
            goto L_0x00d9
        L_0x0093:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Given class "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = " is not a "
            r2.append(r3)
            java.lang.String r3 = "mutable"
            r2.append(r3)
            java.lang.String r3 = " collection"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00b9:
            nz3.h r12 = r10.f71744b
            nz3.h r13 = nz3.C117642h.MUTABLE
            if (r12 != r13) goto L_0x00d8
            nz3.v r12 = nz3.C35068v.FLEXIBLE_UPPER
            if (r2 != r12) goto L_0x00d8
            wy3.e r7 = (wy3.C26447e) r7
            vy3.c r12 = vy3.C26384c.f73585a
            vz3.d r12 = zz3.C26794h.m35219g(r7)
            java.util.HashMap<vz3.d, vz3.c> r13 = vy3.C26384c.f73596l
            boolean r12 = r13.containsKey(r12)
            if (r12 == 0) goto L_0x00d8
            wy3.e r7 = r11.mo53378a(r7)
            goto L_0x00d9
        L_0x00d8:
            r7 = r9
        L_0x00d9:
            if (r2 == r4) goto L_0x00dd
            r2 = 1
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            r4 = 2
            if (r2 != 0) goto L_0x00e2
            goto L_0x00f4
        L_0x00e2:
            nz3.j r2 = r10.f71743a
            if (r2 != 0) goto L_0x00e8
            r2 = -1
            goto L_0x00f0
        L_0x00e8:
            int[] r11 = nz3.C25310x.C25311a.f71812a
            int r2 = r2.ordinal()
            r2 = r11[r2]
        L_0x00f0:
            if (r2 == r6) goto L_0x00f9
            if (r2 == r4) goto L_0x00f6
        L_0x00f4:
            r2 = r9
            goto L_0x00fb
        L_0x00f6:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x00fb
        L_0x00f9:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L_0x00fb:
            if (r7 == 0) goto L_0x0103
            n04.j1 r11 = r7.mo36110l()
            if (r11 != 0) goto L_0x0107
        L_0x0103:
            n04.j1 r11 = r20.mo37081K0()
        L_0x0107:
            r13 = r11
            java.lang.String r11 = "enhancedClassifier?.typeConstructor ?: constructor"
            gy3.C87412m.m108593f(r13, r11)
            int r11 = r22 + 1
            java.util.List r12 = r20.mo37079I0()
            java.util.List r14 = r13.getParameters()
            java.lang.String r15 = "typeConstructor.parameters"
            gy3.C87412m.m108593f(r14, r15)
            java.util.Iterator r15 = r12.iterator()
            java.util.Iterator r16 = r14.iterator()
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r12 = sx3.C36907w.m41090l(r12, r6)
            int r14 = sx3.C36907w.m41090l(r14, r6)
            int r12 = java.lang.Math.min(r12, r14)
            r4.<init>(r12)
        L_0x0137:
            boolean r12 = r15.hasNext()
            if (r12 == 0) goto L_0x01ea
            boolean r12 = r16.hasNext()
            if (r12 == 0) goto L_0x01ea
            java.lang.Object r12 = r15.next()
            java.lang.Object r14 = r16.next()
            wy3.d1 r14 = (wy3.C26446d1) r14
            n04.m1 r12 = (n04.C25158m1) r12
            if (r8 != 0) goto L_0x0157
            nz3.f$a r6 = new nz3.f$a
            r6.<init>(r9, r5)
            goto L_0x01a5
        L_0x0157:
            boolean r6 = r12.mo52296b()
            if (r6 != 0) goto L_0x016a
            n04.j0 r6 = r12.getType()
            n04.y1 r6 = r6.mo52229N0()
            nz3.f$a r6 = r0.mo52381b(r6, r1, r11, r3)
            goto L_0x01a5
        L_0x016a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Object r6 = r1.invoke(r6)
            nz3.g r6 = (nz3.C25267g) r6
            nz3.j r6 = r6.f71743a
            nz3.j r9 = nz3.C25269j.FORCE_FLEXIBILITY
            if (r6 != r9) goto L_0x019e
            n04.j0 r6 = r12.getType()
            n04.y1 r6 = r6.mo52229N0()
            nz3.f$a r9 = new nz3.f$a
            n04.s0 r1 = n04.C25119f0.m31893c(r6)
            n04.s0 r1 = r1.mo37084O0(r5)
            n04.s0 r6 = n04.C25119f0.m31894d(r6)
            r5 = 1
            n04.s0 r6 = r6.mo37084O0(r5)
            n04.y1 r1 = n04.C25146k0.m31957c(r1, r6)
            r9.<init>(r1, r5)
            r6 = r9
            goto L_0x01a5
        L_0x019e:
            r5 = 1
            nz3.f$a r6 = new nz3.f$a
            r1 = 0
            r6.<init>(r1, r5)
        L_0x01a5:
            int r1 = r6.f71738b
            int r11 = r11 + r1
            n04.j0 r1 = r6.f71737a
            java.lang.String r5 = "arg.projectionKind"
            if (r1 == 0) goto L_0x01ba
            n04.z1 r6 = r12.mo52295a()
            gy3.C87412m.m108593f(r6, r5)
            n04.m1 r1 = r04.C26094c.m33423c(r1, r6, r14)
            goto L_0x01df
        L_0x01ba:
            if (r7 == 0) goto L_0x01d7
            boolean r1 = r12.mo52296b()
            if (r1 != 0) goto L_0x01d7
            n04.j0 r1 = r12.getType()
            java.lang.String r6 = "arg.type"
            gy3.C87412m.m108593f(r1, r6)
            n04.z1 r6 = r12.mo52295a()
            gy3.C87412m.m108593f(r6, r5)
            n04.m1 r1 = r04.C26094c.m33423c(r1, r6, r14)
            goto L_0x01df
        L_0x01d7:
            if (r7 == 0) goto L_0x01de
            n04.m1 r1 = n04.C25187v1.m32093m(r14)
            goto L_0x01df
        L_0x01de:
            r1 = 0
        L_0x01df:
            r4.add(r1)
            r1 = r21
            r5 = 0
            r6 = 10
            r9 = 0
            goto L_0x0137
        L_0x01ea:
            int r11 = r11 - r22
            if (r7 != 0) goto L_0x021b
            if (r2 != 0) goto L_0x021b
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x01f7
            goto L_0x0210
        L_0x01f7:
            java.util.Iterator r1 = r4.iterator()
        L_0x01fb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0210
            java.lang.Object r3 = r1.next()
            n04.m1 r3 = (n04.C25158m1) r3
            if (r3 != 0) goto L_0x020b
            r3 = 1
            goto L_0x020c
        L_0x020b:
            r3 = 0
        L_0x020c:
            if (r3 != 0) goto L_0x01fb
            r1 = 0
            goto L_0x0211
        L_0x0210:
            r1 = 1
        L_0x0211:
            if (r1 == 0) goto L_0x021b
            nz3.f$b r1 = new nz3.f$b
            r3 = 0
            r5 = 0
            r1.<init>(r3, r11, r5)
            return r1
        L_0x021b:
            r3 = 0
            r5 = 0
            r1 = 3
            xy3.h[] r1 = new xy3.C26571h[r1]
            xy3.h r6 = r20.getAnnotations()
            r1[r5] = r6
            nz3.e r5 = nz3.C25310x.f71811b
            if (r7 == 0) goto L_0x022c
            r6 = 1
            goto L_0x022d
        L_0x022c:
            r6 = 0
        L_0x022d:
            if (r6 == 0) goto L_0x0230
            goto L_0x0231
        L_0x0230:
            r5 = r3
        L_0x0231:
            r6 = 1
            r1[r6] = r5
            nz3.e r5 = nz3.C25310x.f71810a
            if (r2 == 0) goto L_0x023a
            r6 = 1
            goto L_0x023b
        L_0x023a:
            r6 = 0
        L_0x023b:
            if (r6 == 0) goto L_0x023f
            r9 = r5
            goto L_0x0240
        L_0x023f:
            r9 = r3
        L_0x0240:
            r3 = 2
            r1[r3] = r9
            java.util.List r1 = sx3.C110823p.m151010z(r1)
            r3 = r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r3 == 0) goto L_0x02f8
            r5 = 1
            if (r3 == r5) goto L_0x025d
            xy3.l r3 = new xy3.l
            java.util.List r1 = sx3.C110818d0.m150953y0(r1)
            r3.<init>((java.util.List<? extends xy3.C26571h>) r1)
            goto L_0x0264
        L_0x025d:
            java.lang.Object r1 = sx3.C110818d0.m150938j0(r1)
            r3 = r1
            xy3.h r3 = (xy3.C26571h) r3
        L_0x0264:
            n04.g1 r12 = n04.C25126h1.m31918b(r3)
            java.util.List r1 = r20.mo37079I0()
            java.util.Iterator r3 = r4.iterator()
            java.util.Iterator r5 = r1.iterator()
            java.util.ArrayList r14 = new java.util.ArrayList
            r6 = 10
            int r4 = sx3.C36907w.m41090l(r4, r6)
            int r1 = sx3.C36907w.m41090l(r1, r6)
            int r1 = java.lang.Math.min(r4, r1)
            r14.<init>(r1)
        L_0x0287:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x02a7
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x02a7
            java.lang.Object r1 = r3.next()
            java.lang.Object r4 = r5.next()
            n04.m1 r4 = (n04.C25158m1) r4
            n04.m1 r1 = (n04.C25158m1) r1
            if (r1 != 0) goto L_0x02a2
            goto L_0x02a3
        L_0x02a2:
            r4 = r1
        L_0x02a3:
            r14.add(r4)
            goto L_0x0287
        L_0x02a7:
            if (r2 == 0) goto L_0x02ae
            boolean r1 = r2.booleanValue()
            goto L_0x02b2
        L_0x02ae:
            boolean r1 = r20.mo37082L0()
        L_0x02b2:
            r15 = r1
            r16 = 0
            r17 = 16
            r18 = 0
            n04.s0 r1 = n04.C25146k0.m31961g(r12, r13, r14, r15, r16, r17, r18)
            boolean r3 = r10.f71745c
            if (r3 == 0) goto L_0x02e9
            iz3.d r3 = r0.f71736a
            boolean r3 = r3.mo51473a()
            if (r3 == 0) goto L_0x02e0
            n04.t$a r3 = n04.C25177t.f71623g
            r4 = 1
            n04.t r3 = r3.mo52310a(r1, r4)
            if (r3 == 0) goto L_0x02d4
            r1 = r3
            goto L_0x02ea
        L_0x02d4:
            n04.s0 r3 = n04.C25190w0.m32111b(r1)
            r5 = 0
            if (r3 != 0) goto L_0x02e7
            n04.s0 r1 = r1.mo37084O0(r5)
            goto L_0x02eb
        L_0x02e0:
            r4 = 1
            r5 = 0
            nz3.i r3 = new nz3.i
            r3.<init>(r1)
        L_0x02e7:
            r1 = r3
            goto L_0x02eb
        L_0x02e9:
            r4 = 1
        L_0x02ea:
            r5 = 0
        L_0x02eb:
            if (r2 == 0) goto L_0x02f2
            boolean r2 = r10.f71746d
            if (r2 == 0) goto L_0x02f2
            r5 = 1
        L_0x02f2:
            nz3.f$b r2 = new nz3.f$b
            r2.<init>(r1, r11, r5)
            return r2
        L_0x02f8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "At least one Annotations object expected"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nz3.C25264f.mo52380a(n04.s0, fy3.l, int, nz3.v, boolean, boolean):nz3.f$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r14 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r14 = r9.f71540e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r12 = r13.f71739a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r12 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        r12 = r9.f71541f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        r1 = n04.C25146k0.m31957c(r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        gy3.C87412m.m108591d(r14);
        r14 = r14;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nz3.C25264f.C25265a mo52381b(n04.C25198y1 r12, fy3.C32226l<? super java.lang.Integer, nz3.C25267g> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = n04.C25153l0.m31968a(r12)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            nz3.f$a r12 = new nz3.f$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        L_0x000e:
            boolean r0 = r12 instanceof n04.C25109c0
            if (r0 == 0) goto L_0x007f
            boolean r0 = r12 instanceof n04.C25173r0
            r9 = r12
            n04.c0 r9 = (n04.C25109c0) r9
            n04.s0 r3 = r9.f71540e
            nz3.v r6 = nz3.C35068v.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            nz3.f$b r10 = r2.mo52380a(r3, r4, r5, r6, r7, r8)
            n04.s0 r3 = r9.f71541f
            nz3.v r6 = nz3.C35068v.FLEXIBLE_UPPER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            nz3.f$b r13 = r2.mo52380a(r3, r4, r5, r6, r7, r8)
            n04.s0 r14 = r10.f71739a
            if (r14 != 0) goto L_0x003a
            n04.s0 r15 = r13.f71739a
            if (r15 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            boolean r15 = r10.f71741c
            if (r15 != 0) goto L_0x0064
            boolean r15 = r13.f71741c
            if (r15 == 0) goto L_0x0043
            goto L_0x0064
        L_0x0043:
            if (r0 == 0) goto L_0x0055
            kz3.g r1 = new kz3.g
            if (r14 != 0) goto L_0x004b
            n04.s0 r14 = r9.f71540e
        L_0x004b:
            n04.s0 r12 = r13.f71739a
            if (r12 != 0) goto L_0x0051
            n04.s0 r12 = r9.f71541f
        L_0x0051:
            r1.<init>(r14, r12)
            goto L_0x0077
        L_0x0055:
            if (r14 != 0) goto L_0x0059
            n04.s0 r14 = r9.f71540e
        L_0x0059:
            n04.s0 r12 = r13.f71739a
            if (r12 != 0) goto L_0x005f
            n04.s0 r12 = r9.f71541f
        L_0x005f:
            n04.y1 r1 = n04.C25146k0.m31957c(r14, r12)
            goto L_0x0077
        L_0x0064:
            n04.s0 r13 = r13.f71739a
            if (r13 == 0) goto L_0x0070
            if (r14 != 0) goto L_0x006b
            r14 = r13
        L_0x006b:
            n04.y1 r14 = n04.C25146k0.m31957c(r14, r13)
            goto L_0x0073
        L_0x0070:
            gy3.C87412m.m108591d(r14)
        L_0x0073:
            n04.y1 r1 = n04.C25194x1.m32122c(r12, r14)
        L_0x0077:
            nz3.f$a r12 = new nz3.f$a
            int r13 = r10.f71740b
            r12.<init>(r1, r13)
            goto L_0x00a6
        L_0x007f:
            boolean r0 = r12 instanceof n04.C25176s0
            if (r0 == 0) goto L_0x00a7
            r2 = r12
            n04.s0 r2 = (n04.C25176s0) r2
            nz3.v r5 = nz3.C35068v.INFLEXIBLE
            r6 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            nz3.f$b r13 = r1.mo52380a(r2, r3, r4, r5, r6, r7)
            nz3.f$a r14 = new nz3.f$a
            boolean r15 = r13.f71741c
            if (r15 == 0) goto L_0x009e
            n04.s0 r15 = r13.f71739a
            n04.y1 r12 = n04.C25194x1.m32122c(r12, r15)
            goto L_0x00a0
        L_0x009e:
            n04.s0 r12 = r13.f71739a
        L_0x00a0:
            int r13 = r13.f71740b
            r14.<init>(r12, r13)
            r12 = r14
        L_0x00a6:
            return r12
        L_0x00a7:
            rx3.j r12 = new rx3.j
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nz3.C25264f.mo52381b(n04.y1, fy3.l, int, boolean):nz3.f$a");
    }
}
