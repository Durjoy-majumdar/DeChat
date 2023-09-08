package n04;

import b04.C23659o;
import fy3.C32226l;
import g04.C20770i;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import n04.C25114d1;
import o04.C25323e;
import p04.C25413f;
import p04.C25417j;
import sx3.C64186f0;
import wy3.C22935h;
import wy3.C26443c1;
import wy3.C26447e;

/* renamed from: n04.k0 */
public final class C25146k0 {

    /* renamed from: a */
    public static final C25146k0 f71590a = new C25146k0();

    /* renamed from: n04.k0$a */
    public static final class C25147a extends C87413o implements C32226l {

        /* renamed from: d */
        public static final /* synthetic */ int f71591d = 0;

        static {
            new C25147a();
        }

        public C25147a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C25323e) obj, "<anonymous parameter 0>");
            return null;
        }
    }

    /* renamed from: n04.k0$b */
    public static final class C25148b {

        /* renamed from: a */
        public final C25176s0 f71592a;

        /* renamed from: b */
        public final C25144j1 f71593b;

        public C25148b(C25176s0 s0Var, C25144j1 j1Var) {
            this.f71592a = s0Var;
            this.f71593b = j1Var;
        }
    }

    /* renamed from: n04.k0$c */
    public static final class C25149c extends C87413o implements C32226l<C25323e, C25176s0> {

        /* renamed from: d */
        public final /* synthetic */ C25144j1 f71594d;

        /* renamed from: e */
        public final /* synthetic */ List<C25158m1> f71595e;

        /* renamed from: f */
        public final /* synthetic */ C25122g1 f71596f;

        /* renamed from: g */
        public final /* synthetic */ boolean f71597g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25149c(C25144j1 j1Var, List<? extends C25158m1> list, C25122g1 g1Var, boolean z) {
            super(1);
            this.f71594d = j1Var;
            this.f71595e = list;
            this.f71596f = g1Var;
            this.f71597g = z;
        }

        public Object invoke(Object obj) {
            C25323e eVar = (C25323e) obj;
            C87412m.m108594g(eVar, "refiner");
            C25148b a = C25146k0.m31955a(C25146k0.f71590a, this.f71594d, eVar, this.f71595e);
            if (a == null) {
                return null;
            }
            C25176s0 s0Var = a.f71592a;
            if (s0Var != null) {
                return s0Var;
            }
            C25122g1 g1Var = this.f71596f;
            C25144j1 j1Var = a.f71593b;
            C87412m.m108591d(j1Var);
            return C25146k0.m31960f(g1Var, j1Var, this.f71595e, this.f71597g, eVar);
        }
    }

    /* renamed from: n04.k0$d */
    public static final class C25150d extends C87413o implements C32226l<C25323e, C25176s0> {

        /* renamed from: d */
        public final /* synthetic */ C25144j1 f71598d;

        /* renamed from: e */
        public final /* synthetic */ List<C25158m1> f71599e;

        /* renamed from: f */
        public final /* synthetic */ C25122g1 f71600f;

        /* renamed from: g */
        public final /* synthetic */ boolean f71601g;

        /* renamed from: h */
        public final /* synthetic */ C20770i f71602h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25150d(C25144j1 j1Var, List<? extends C25158m1> list, C25122g1 g1Var, boolean z, C20770i iVar) {
            super(1);
            this.f71598d = j1Var;
            this.f71599e = list;
            this.f71600f = g1Var;
            this.f71601g = z;
            this.f71602h = iVar;
        }

        public Object invoke(Object obj) {
            C25323e eVar = (C25323e) obj;
            C87412m.m108594g(eVar, "kotlinTypeRefiner");
            C25148b a = C25146k0.m31955a(C25146k0.f71590a, this.f71598d, eVar, this.f71599e);
            if (a == null) {
                return null;
            }
            C25176s0 s0Var = a.f71592a;
            if (s0Var != null) {
                return s0Var;
            }
            C25122g1 g1Var = this.f71600f;
            C25144j1 j1Var = a.f71593b;
            C87412m.m108591d(j1Var);
            return C25146k0.m31962h(g1Var, j1Var, this.f71599e, this.f71601g, this.f71602h);
        }
    }

    static {
        int i = C25147a.f71591d;
    }

    /* renamed from: a */
    public static final C25148b m31955a(C25146k0 k0Var, C25144j1 j1Var, C25323e eVar, List list) {
        C22935h f;
        C25148b bVar;
        k0Var.getClass();
        C22935h o = j1Var.mo37094o();
        if (o == null || (f = eVar.mo52412f(o)) == null) {
            return null;
        }
        if (f instanceof C26443c1) {
            bVar = new C25148b(m31956b((C26443c1) f, list), (C25144j1) null);
        } else {
            C25144j1 n = f.mo36110l().mo37093n(eVar);
            C87412m.m108593f(n, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
            bVar = new C25148b((C25176s0) null, n);
        }
        return bVar;
    }

    /* renamed from: b */
    public static final C25176s0 m31956b(C26443c1 c1Var, List<? extends C25158m1> list) {
        C87412m.m108594g(c1Var, "<this>");
        C87412m.m108594g(list, "arguments");
        C25107b1 b1Var = new C25107b1(C25114d1.C25115a.f71548a, false);
        C25110c1 a = C25110c1.f71542e.mo52244a((C25110c1) null, c1Var, list);
        C25122g1.f71557e.getClass();
        C25122g1 g1Var = C25122g1.f71558f;
        C87412m.m108594g(g1Var, "attributes");
        return b1Var.mo52238c(a, g1Var, false, 0, true);
    }

    /* renamed from: c */
    public static final C25198y1 m31957c(C25176s0 s0Var, C25176s0 s0Var2) {
        C87412m.m108594g(s0Var, "lowerBound");
        C87412m.m108594g(s0Var2, "upperBound");
        return C87412m.m108589b(s0Var, s0Var2) ? s0Var : new C25113d0(s0Var, s0Var2);
    }

    /* renamed from: d */
    public static final C25176s0 m31958d(C25122g1 g1Var, C23659o oVar, boolean z) {
        C87412m.m108594g(g1Var, "attributes");
        C87412m.m108594g(oVar, "constructor");
        return m31962h(g1Var, oVar, C64186f0.f181907d, z, C25417j.m32696a(C25413f.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* renamed from: e */
    public static final C25176s0 m31959e(C25122g1 g1Var, C26447e eVar, List<? extends C25158m1> list) {
        C87412m.m108594g(g1Var, "attributes");
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(list, "arguments");
        C25144j1 l = eVar.mo36110l();
        C87412m.m108593f(l, "descriptor.typeConstructor");
        return m31960f(g1Var, l, list, false, (C25323e) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: wy3.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: zy3.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: wy3.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: zy3.w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final n04.C25176s0 m31960f(n04.C25122g1 r6, n04.C25144j1 r7, java.util.List<? extends n04.C25158m1> r8, boolean r9, o04.C25323e r10) {
        /*
            java.lang.String r0 = "attributes"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "constructor"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "arguments"
            gy3.C87412m.m108594g(r8, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0034
            if (r9 != 0) goto L_0x0034
            wy3.h r0 = r7.mo37094o()
            if (r0 == 0) goto L_0x0034
            wy3.h r6 = r7.mo37094o()
            gy3.C87412m.m108591d(r6)
            n04.s0 r6 = r6.mo36111s()
            java.lang.String r7 = "constructor.declarationDescriptor!!.defaultType"
            gy3.C87412m.m108593f(r6, r7)
            return r6
        L_0x0034:
            wy3.h r0 = r7.mo37094o()
            boolean r1 = r0 instanceof wy3.C26446d1
            if (r1 == 0) goto L_0x0049
            wy3.d1 r0 = (wy3.C26446d1) r0
            n04.s0 r10 = r0.mo36111s()
            g04.i r10 = r10.mo37088n()
        L_0x0046:
            r4 = r10
            goto L_0x00dc
        L_0x0049:
            boolean r1 = r0 instanceof wy3.C26447e
            if (r1 == 0) goto L_0x00aa
            if (r10 != 0) goto L_0x0057
            wy3.e0 r10 = d04.C24442a.m30543j(r0)
            o04.e r10 = d04.C24442a.m30542i(r10)
        L_0x0057:
            boolean r1 = r8.isEmpty()
            r2 = 0
            java.lang.String r3 = "kotlinTypeRefiner"
            java.lang.String r4 = "<this>"
            if (r1 == 0) goto L_0x0083
            wy3.e r0 = (wy3.C26447e) r0
            gy3.C87412m.m108594g(r0, r4)
            gy3.C87412m.m108594g(r10, r3)
            boolean r1 = r0 instanceof zy3.C26787w
            if (r1 == 0) goto L_0x0071
            r2 = r0
            zy3.w r2 = (zy3.C26787w) r2
        L_0x0071:
            if (r2 == 0) goto L_0x0079
            g04.i r10 = r2.mo51790N(r10)
            if (r10 != 0) goto L_0x0046
        L_0x0079:
            g04.i r10 = r0.mo51798g0()
            java.lang.String r0 = "this.unsubstitutedMemberScope"
            gy3.C87412m.m108593f(r10, r0)
            goto L_0x0046
        L_0x0083:
            wy3.e r0 = (wy3.C26447e) r0
            n04.l1$a r1 = n04.C25154l1.f71605b
            n04.p1 r1 = r1.mo52293b(r7, r8)
            gy3.C87412m.m108594g(r0, r4)
            gy3.C87412m.m108594g(r10, r3)
            boolean r3 = r0 instanceof zy3.C26787w
            if (r3 == 0) goto L_0x0098
            r2 = r0
            zy3.w r2 = (zy3.C26787w) r2
        L_0x0098:
            if (r2 == 0) goto L_0x00a0
            g04.i r10 = r2.mo52591D(r1, r10)
            if (r10 != 0) goto L_0x0046
        L_0x00a0:
            g04.i r10 = r0.mo53430t0(r1)
            java.lang.String r0 = "this.getMemberScope(\n   …ubstitution\n            )"
            gy3.C87412m.m108593f(r10, r0)
            goto L_0x0046
        L_0x00aa:
            boolean r10 = r0 instanceof wy3.C26443c1
            if (r10 == 0) goto L_0x00c9
            p04.f r10 = p04.C25413f.SCOPE_FOR_ABBREVIATION_TYPE
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            r3 = 0
            wy3.c1 r0 = (wy3.C26443c1) r0
            vz3.f r0 = r0.getName()
            java.lang.String r0 = r0.f65637d
            java.lang.String r4 = "descriptor.name.toString()"
            gy3.C87412m.m108593f(r0, r4)
            r2[r3] = r0
            p04.e r10 = p04.C25417j.m32696a(r10, r1, r2)
            goto L_0x0046
        L_0x00c9:
            boolean r10 = r7 instanceof n04.C25124h0
            if (r10 == 0) goto L_0x00ea
            r10 = r7
            n04.h0 r10 = (n04.C25124h0) r10
            g04.o$a r0 = g04.C20776o.f58685c
            java.util.LinkedHashSet<n04.j0> r10 = r10.f71561b
            java.lang.String r1 = "member scope for intersection type"
            g04.i r10 = r0.mo32465a(r1, r10)
            goto L_0x0046
        L_0x00dc:
            n04.k0$c r5 = new n04.k0$c
            r5.<init>(r7, r8, r6, r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            n04.s0 r6 = m31963i(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x00ea:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unsupported classifier: "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = " for constructor: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25146k0.m31960f(n04.g1, n04.j1, java.util.List, boolean, o04.e):n04.s0");
    }

    /* renamed from: g */
    public static /* synthetic */ C25176s0 m31961g(C25122g1 g1Var, C25144j1 j1Var, List list, boolean z, C25323e eVar, int i, Object obj) {
        if ((i & 16) != 0) {
            eVar = null;
        }
        return m31960f(g1Var, j1Var, list, z, eVar);
    }

    /* renamed from: h */
    public static final C25176s0 m31962h(C25122g1 g1Var, C25144j1 j1Var, List<? extends C25158m1> list, boolean z, C20770i iVar) {
        C87412m.m108594g(g1Var, "attributes");
        C87412m.m108594g(j1Var, "constructor");
        C87412m.m108594g(list, "arguments");
        C87412m.m108594g(iVar, "memberScope");
        C25144j1 j1Var2 = j1Var;
        List<? extends C25158m1> list2 = list;
        C25179t0 t0Var = new C25179t0(j1Var2, list2, z, iVar, new C25150d(j1Var2, list2, g1Var, z, iVar));
        return g1Var.isEmpty() ? t0Var : new C25183u0(t0Var, g1Var);
    }

    /* renamed from: i */
    public static final C25176s0 m31963i(C25122g1 g1Var, C25144j1 j1Var, List<? extends C25158m1> list, boolean z, C20770i iVar, C32226l<? super C25323e, ? extends C25176s0> lVar) {
        C87412m.m108594g(g1Var, "attributes");
        C87412m.m108594g(j1Var, "constructor");
        C87412m.m108594g(list, "arguments");
        C87412m.m108594g(iVar, "memberScope");
        C87412m.m108594g(lVar, "refinedTypeFactory");
        C25179t0 t0Var = new C25179t0(j1Var, list, z, iVar, lVar);
        return g1Var.isEmpty() ? t0Var : new C25183u0(t0Var, g1Var);
    }
}
