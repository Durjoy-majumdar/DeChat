package fz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d04.C24442a;
import fy3.C32226l;
import fz3.C20759m0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import oz3.C25404v;
import ty3.C26336h;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26436b;
import wy3.C26490q0;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: fz3.l0 */
public final class C20754l0 {

    /* renamed from: fz3.l0$a */
    public static final class C20755a extends C87413o implements C32226l<C26436b, Boolean> {

        /* renamed from: d */
        public static final C20755a f58645d = new C20755a();

        public C20755a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26436b bVar = (C26436b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C20758m.f58648a.mo32447a(C24442a.m30545l(bVar)));
        }
    }

    /* renamed from: fz3.l0$b */
    public static final class C20756b extends C87413o implements C32226l<C26436b, Boolean> {

        /* renamed from: d */
        public static final C20756b f58646d = new C20756b();

        public C20756b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26436b bVar = (C26436b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            int i = C20744g.f58633m;
            C26520x0 x0Var = (C26520x0) bVar;
            boolean z = true;
            if (!C26336h.m33824A(x0Var) || C24442a.m30535b(x0Var, false, new C20743f(x0Var), 1, (Object) null) == null) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: fz3.l0$c */
    public static final class C20757c extends C87413o implements C32226l<C26436b, Boolean> {

        /* renamed from: d */
        public static final C20757c f58647d = new C20757c();

        public C20757c() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
            if (r3 != null) goto L_0x0052;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                wy3.b r5 = (wy3.C26436b) r5
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r5, r0)
                boolean r0 = ty3.C26336h.m33824A(r5)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0051
                fz3.h r0 = fz3.C20745h.f58634m
                java.util.Set<vz3.f> r0 = fz3.C20759m0.f58654f
                vz3.f r3 = r5.getName()
                boolean r0 = r0.contains(r3)
                r3 = 0
                if (r0 != 0) goto L_0x001f
                goto L_0x004e
            L_0x001f:
                fz3.i r0 = fz3.C20747i.f58636d
                wy3.b r5 = d04.C24442a.m30535b(r5, r2, r0, r1, r3)
                if (r5 == 0) goto L_0x004e
                java.lang.String r5 = oz3.C25404v.m32596b(r5)
                if (r5 != 0) goto L_0x002e
                goto L_0x004e
            L_0x002e:
                java.util.List<java.lang.String> r0 = fz3.C20759m0.f58651c
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                boolean r0 = r0.contains(r5)
                if (r0 == 0) goto L_0x003c
                fz3.m0$b r5 = fz3.C20759m0.C20762b.ONE_COLLECTION_PARAMETER
            L_0x003a:
                r3 = r5
                goto L_0x004e
            L_0x003c:
                java.util.Map<java.lang.String, fz3.m0$c> r0 = fz3.C20759m0.f58653e
                java.lang.Object r5 = sx3.C90364q0.m113145d(r0, r5)
                fz3.m0$c r5 = (fz3.C20759m0.C20763c) r5
                fz3.m0$c r0 = fz3.C20759m0.C20763c.NULL
                if (r5 != r0) goto L_0x004b
                fz3.m0$b r5 = fz3.C20759m0.C20762b.OBJECT_PARAMETER_GENERIC
                goto L_0x003a
            L_0x004b:
                fz3.m0$b r5 = fz3.C20759m0.C20762b.OBJECT_PARAMETER_NON_GENERIC
                goto L_0x003a
            L_0x004e:
                if (r3 == 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r1 = 0
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: fz3.C20754l0.C20757c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final String m22704a(C26436b bVar) {
        C87412m.m108594g(bVar, "callableMemberDescriptor");
        C26436b b = C26336h.m33824A(bVar) ? m22705b(bVar) : null;
        if (b == null) {
            return null;
        }
        C26436b l = C24442a.m30545l(b);
        if (l instanceof C26504r0) {
            C26336h.m33824A(l);
            C26436b b2 = C24442a.m30535b(C24442a.m30545l(l), false, C20753l.f58644d, 1, (Object) null);
            if (b2 == null) {
                return null;
            }
            Map<C22826c, C22830f> map = C20750j.f58640a;
            C22830f fVar = C20750j.f58640a.get(C24442a.m30540g(b2));
            if (fVar != null) {
                return fVar.mo35995b();
            }
            return null;
        } else if (!(l instanceof C26520x0)) {
            return null;
        } else {
            int i = C20744g.f58633m;
            Map<String, C22830f> map2 = C20759m0.f58658j;
            String b3 = C25404v.m32596b((C26520x0) l);
            C22830f fVar2 = b3 == null ? null : (C22830f) ((LinkedHashMap) map2).get(b3);
            if (fVar2 != null) {
                return fVar2.mo35995b();
            }
            return null;
        }
    }

    /* renamed from: b */
    public static final <T extends C26436b> T m22705b(T t) {
        C87412m.m108594g(t, "<this>");
        C20759m0.C20760a aVar = C20759m0.f58649a;
        if (!((ArrayList) C20759m0.f58659k).contains(t.getName())) {
            Map<C22826c, C22830f> map = C20750j.f58640a;
            if (!C20750j.f58643d.contains(C24442a.m30545l(t).getName())) {
                return null;
            }
        }
        if (t instanceof C26504r0 ? true : t instanceof C26490q0) {
            return C24442a.m30535b(t, false, C20755a.f58645d, 1, (Object) null);
        }
        if (t instanceof C26520x0) {
            return C24442a.m30535b(t, false, C20756b.f58646d, 1, (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    public static final <T extends C26436b> T m22706c(T t) {
        C87412m.m108594g(t, "<this>");
        T b = m22705b(t);
        if (b != null) {
            return b;
        }
        C20745h hVar = C20745h.f58634m;
        C22830f name = t.getName();
        C87412m.m108593f(name, "name");
        if (!hVar.mo32446b(name)) {
            return null;
        }
        return C24442a.m30535b(t, false, C20757c.f58647d, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m22707d(wy3.C26447e r12, wy3.C26434a r13) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "specialCallableDescriptor"
            gy3.C87412m.m108594g(r13, r0)
            wy3.k r13 = r13.mo51892b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            gy3.C87412m.m108592e(r13, r0)
            wy3.e r13 = (wy3.C26447e) r13
            n04.s0 r13 = r13.mo36111s()
            java.lang.String r0 = "specialCallableDescripto…ssDescriptor).defaultType"
            gy3.C87412m.m108593f(r13, r0)
            wy3.e r12 = zz3.C26794h.m35223k(r12)
        L_0x0024:
            r0 = 0
            if (r12 == 0) goto L_0x017f
            boolean r1 = r12 instanceof hz3.C21040c
            if (r1 != 0) goto L_0x0179
            n04.s0 r1 = r12.mo36111s()
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L_0x015d
            n04.z1 r4 = n04.C25202z1.INVARIANT
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            o04.p r6 = new o04.p
            r7 = 0
            r6.<init>(r1, r7)
            r5.add(r6)
            n04.j1 r1 = r13.mo37081K0()
        L_0x0047:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0152
            java.lang.Object r6 = r5.poll()
            o04.p r6 = (o04.C21728p) r6
            n04.j0 r8 = r6.f61508a
            n04.j1 r9 = r8.mo37081K0()
            if (r9 == 0) goto L_0x014e
            if (r1 == 0) goto L_0x0149
            boolean r10 = r9.equals(r1)
            if (r10 == 0) goto L_0x0127
            boolean r5 = r8.mo37082L0()
            o04.p r6 = r6.f61509b
        L_0x0069:
            if (r6 == 0) goto L_0x00df
            n04.j0 r9 = r6.f61508a
            java.util.List r10 = r9.mo37079I0()
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L_0x007c
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            java.util.Iterator r10 = r10.iterator()
        L_0x0080:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r10.next()
            n04.m1 r11 = (n04.C25158m1) r11
            n04.z1 r11 = r11.mo52295a()
            if (r11 == r4) goto L_0x0094
            r11 = 1
            goto L_0x0095
        L_0x0094:
            r11 = 0
        L_0x0095:
            if (r11 == 0) goto L_0x0080
            r10 = 1
            goto L_0x009a
        L_0x0099:
            r10 = 0
        L_0x009a:
            if (r10 == 0) goto L_0x00bc
            n04.l1$a r10 = n04.C25154l1.f71605b
            n04.p1 r10 = r10.mo52292a(r9)
            n04.p1 r10 = a04.C23607d.m28201b(r10, r0, r3, r7)
            n04.t1 r10 = n04.C25180t1.m32044e(r10)
            n04.j0 r8 = r10.mo52313i(r8, r4)
            java.lang.String r10 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)"
            gy3.C87412m.m108593f(r8, r10)
            s04.a r8 = s04.C26157d.m33577a(r8)
            T r8 = r8.f97347b
            n04.j0 r8 = (n04.C25143j0) r8
            goto L_0x00d0
        L_0x00bc:
            n04.l1$a r10 = n04.C25154l1.f71605b
            n04.p1 r10 = r10.mo52292a(r9)
            n04.t1 r10 = n04.C25180t1.m32044e(r10)
            n04.j0 r8 = r10.mo52313i(r8, r4)
            java.lang.String r10 = "{\n                    Ty…ARIANT)\n                }"
            gy3.C87412m.m108593f(r8, r10)
        L_0x00d0:
            if (r5 != 0) goto L_0x00db
            boolean r5 = r9.mo37082L0()
            if (r5 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r5 = 0
            goto L_0x00dc
        L_0x00db:
            r5 = 1
        L_0x00dc:
            o04.p r6 = r6.f61509b
            goto L_0x0069
        L_0x00df:
            n04.j1 r4 = r8.mo37081K0()
            if (r4 == 0) goto L_0x0123
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L_0x00f0
            n04.j0 r7 = n04.C25187v1.m32090j(r8, r5)
            goto L_0x0152
        L_0x00f0:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Type constructors should be equals!\nsubstitutedSuperType: "
            r13.append(r0)
            java.lang.String r0 = o04.C21730v.m24713a(r4)
            r13.append(r0)
            java.lang.String r0 = ", \n\nsupertype: "
            r13.append(r0)
            java.lang.String r0 = o04.C21730v.m24713a(r1)
            r13.append(r0)
            java.lang.String r0 = " \n"
            r13.append(r0)
            boolean r0 = r4.equals(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0123:
            o04.C21729q.m24712a(r2)
            throw r7
        L_0x0127:
            java.util.Collection r8 = r9.mo37096r()
            java.util.Iterator r8 = r8.iterator()
        L_0x012f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0047
            java.lang.Object r9 = r8.next()
            n04.j0 r9 = (n04.C25143j0) r9
            o04.p r10 = new o04.p
            java.lang.String r11 = "immediateSupertype"
            gy3.C87412m.m108593f(r9, r11)
            r10.<init>(r9, r6)
            r5.add(r10)
            goto L_0x012f
        L_0x0149:
            r12 = 4
            o04.C21729q.m24712a(r12)
            throw r7
        L_0x014e:
            o04.C21729q.m24712a(r2)
            throw r7
        L_0x0152:
            if (r7 == 0) goto L_0x0155
            r0 = 1
        L_0x0155:
            if (r0 == 0) goto L_0x0179
            boolean r12 = ty3.C26336h.m33824A(r12)
            r12 = r12 ^ r3
            return r12
        L_0x015d:
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.String r1 = "subtype"
            r13[r0] = r1
            java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure"
            r13[r3] = r0
            java.lang.String r0 = "findCorrespondingSupertype"
            r13[r12] = r0
            java.lang.String r12 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r12 = java.lang.String.format(r12, r13)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r12)
            throw r13
        L_0x0179:
            wy3.e r12 = zz3.C26794h.m35223k(r12)
            goto L_0x0024
        L_0x017f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fz3.C20754l0.m22707d(wy3.e, wy3.a):boolean");
    }
}
