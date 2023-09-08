package t04;

import d04.C24442a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import sx3.C110818d0;
import sx3.C64197v;
import t04.C26267l;
import t04.C26281s;
import t04.C26288u;
import vz3.C22830f;
import wy3.C26463h1;
import wy3.C26516w;
import z04.C66723k;

/* renamed from: t04.q */
public final class C26276q extends C26252b {

    /* renamed from: a */
    public static final C26276q f73210a = new C26276q();

    /* renamed from: b */
    public static final List<C26261h> f73211b;

    /* renamed from: t04.q$a */
    public static final class C26277a extends C87413o implements C32226l<C26516w, String> {

        /* renamed from: d */
        public static final C26277a f73212d = new C26277a();

        public C26277a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C26516w wVar = (C26516w) obj;
            C87412m.m108594g(wVar, "$this$$receiver");
            List<C26463h1> h = wVar.mo52639h();
            C87412m.m108593f(h, "valueParameters");
            C26463h1 h1Var = (C26463h1) C110818d0.m150925W(h);
            boolean z = false;
            if (h1Var != null) {
                if (!C24442a.m30534a(h1Var) && h1Var.mo53440S() == null) {
                    z = true;
                }
            }
            C26276q qVar = C26276q.f73210a;
            if (!z) {
                return "last parameter should not have a default value or be a vararg";
            }
            return null;
        }
    }

    /* renamed from: t04.q$b */
    public static final class C26278b extends C87413o implements C32226l<C26516w, String> {

        /* renamed from: d */
        public static final C26278b f73213d = new C26278b();

        public C26278b() {
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0073 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                wy3.w r5 = (wy3.C26516w) r5
                java.lang.String r0 = "$this$$receiver"
                gy3.C87412m.m108594g(r5, r0)
                t04.q r0 = t04.C26276q.f73210a
                wy3.k r0 = r5.mo51892b()
                java.lang.String r1 = "containingDeclaration"
                gy3.C87412m.m108593f(r0, r1)
                boolean r1 = r0 instanceof wy3.C26447e
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0026
                wy3.e r0 = (wy3.C26447e) r0
                vz3.f r1 = ty3.C26336h.f73354e
                vz3.d r1 = ty3.C26343l.C26344a.f73409b
                boolean r0 = ty3.C26336h.m33838c(r0, r1)
                if (r0 == 0) goto L_0x0026
                r0 = 1
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                if (r0 != 0) goto L_0x006e
                java.util.Collection r5 = r5.mo52633e()
                java.lang.String r0 = "overriddenDescriptors"
                gy3.C87412m.m108593f(r5, r0)
                boolean r0 = r5.isEmpty()
                if (r0 == 0) goto L_0x0039
                goto L_0x0069
            L_0x0039:
                java.util.Iterator r5 = r5.iterator()
            L_0x003d:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0069
                java.lang.Object r0 = r5.next()
                wy3.w r0 = (wy3.C26516w) r0
                wy3.k r0 = r0.mo51892b()
                java.lang.String r1 = "it.containingDeclaration"
                gy3.C87412m.m108593f(r0, r1)
                boolean r1 = r0 instanceof wy3.C26447e
                if (r1 == 0) goto L_0x0064
                wy3.e r0 = (wy3.C26447e) r0
                vz3.f r1 = ty3.C26336h.f73354e
                vz3.d r1 = ty3.C26343l.C26344a.f73409b
                boolean r0 = ty3.C26336h.m33838c(r0, r1)
                if (r0 == 0) goto L_0x0064
                r0 = 1
                goto L_0x0065
            L_0x0064:
                r0 = 0
            L_0x0065:
                if (r0 == 0) goto L_0x003d
                r5 = 1
                goto L_0x006a
            L_0x0069:
                r5 = 0
            L_0x006a:
                if (r5 == 0) goto L_0x006d
                goto L_0x006e
            L_0x006d:
                r2 = 0
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                java.lang.String r5 = "must override ''equals()'' in Any"
                goto L_0x0074
            L_0x0073:
                r5 = 0
            L_0x0074:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: t04.C26276q.C26278b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: t04.q$c */
    public static final class C26279c extends C87413o implements C32226l<C26516w, String> {

        /* renamed from: d */
        public static final C26279c f73214d = new C26279c();

        public C26279c() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
            if (r8 == false) goto L_0x0076;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r8) {
            /*
                r7 = this;
                wy3.w r8 = (wy3.C26516w) r8
                java.lang.String r0 = "$this$$receiver"
                gy3.C87412m.m108594g(r8, r0)
                wy3.u0 r0 = r8.mo52626H()
                if (r0 != 0) goto L_0x0011
                wy3.u0 r0 = r8.mo52627I()
            L_0x0011:
                t04.q r1 = t04.C26276q.f73210a
                r2 = 0
                r3 = 0
                if (r0 == 0) goto L_0x0076
                n04.j0 r4 = r8.getReturnType()
                if (r4 == 0) goto L_0x002b
                n04.j0 r5 = r0.getType()
                java.lang.String r6 = "receiver.type"
                gy3.C87412m.m108593f(r5, r6)
                boolean r4 = r04.C26094c.m33429i(r4, r5)
                goto L_0x002c
            L_0x002b:
                r4 = 0
            L_0x002c:
                if (r4 != 0) goto L_0x0075
                r1.getClass()
                h04.f r0 = r0.getValue()
                java.lang.String r1 = "receiver.value"
                gy3.C87412m.m108593f(r0, r1)
                boolean r1 = r0 instanceof h04.C24602e
                if (r1 != 0) goto L_0x003f
                goto L_0x0072
            L_0x003f:
                h04.e r0 = (h04.C24602e) r0
                wy3.e r0 = r0.f70200a
                boolean r1 = r0.mo51792P()
                if (r1 != 0) goto L_0x004a
                goto L_0x0072
            L_0x004a:
                vz3.b r1 = d04.C24442a.m30539f(r0)
                if (r1 != 0) goto L_0x0051
                goto L_0x0072
            L_0x0051:
                wy3.e0 r0 = d04.C24442a.m30543j(r0)
                wy3.h r0 = wy3.C26510v.m34217b(r0, r1)
                boolean r1 = r0 instanceof wy3.C26443c1
                if (r1 != 0) goto L_0x005e
                r0 = r2
            L_0x005e:
                wy3.c1 r0 = (wy3.C26443c1) r0
                if (r0 != 0) goto L_0x0063
                goto L_0x0072
            L_0x0063:
                n04.j0 r8 = r8.getReturnType()
                if (r8 == 0) goto L_0x0072
                n04.s0 r0 = r0.mo51918E()
                boolean r8 = r04.C26094c.m33429i(r8, r0)
                goto L_0x0073
            L_0x0072:
                r8 = 0
            L_0x0073:
                if (r8 == 0) goto L_0x0076
            L_0x0075:
                r3 = 1
            L_0x0076:
                if (r3 != 0) goto L_0x007a
                java.lang.String r2 = "receiver must be a supertype of the return type"
            L_0x007a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: t04.C26276q.C26279c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        C22830f fVar = C26280r.f73223i;
        C26267l.C26269b bVar = C26267l.C26269b.f73203b;
        C26255f[] fVarArr = {bVar, new C26288u.C26289a(1)};
        C22830f fVar2 = C26280r.f73224j;
        C26255f[] fVarArr2 = {bVar, new C26288u.C26289a(2)};
        C22830f fVar3 = C26280r.f73215a;
        C26272n nVar = C26272n.f73205a;
        C26266k kVar = C26266k.f73200a;
        C22830f fVar4 = C26280r.f73220f;
        C26288u.C26292d dVar = C26288u.C26292d.f73248b;
        C26281s.C26282a aVar = C26281s.C26282a.f73238c;
        C22830f fVar5 = C26280r.f73222h;
        C26288u.C26291c cVar = C26288u.C26291c.f73247b;
        Set<C22830f> set = C26280r.f73234t;
        C26255f[] fVarArr3 = {bVar, C26281s.C26286c.f73242c, dVar, nVar};
        C66723k kVar2 = C26280r.f73227m;
        C22430i iVar = C22430i.f63558d;
        C87412m.m108594g(kVar2, "regex");
        C87412m.m108594g(iVar, "additionalChecks");
        C22430i iVar2 = iVar;
        f73211b = C64197v.m75537f(new C26261h(fVar, fVarArr, (C32226l) null, 4, (C8480h) null), new C26261h(fVar2, fVarArr2, (C32226l<? super C26516w, String>) C26277a.f73212d), new C26261h(fVar3, new C26255f[]{bVar, nVar, new C26288u.C26289a(2), kVar}, (C32226l) null, 4, (C8480h) null), new C26261h(C26280r.f73216b, new C26255f[]{bVar, nVar, new C26288u.C26289a(3), kVar}, (C32226l) null, 4, (C8480h) null), new C26261h(C26280r.f73217c, new C26255f[]{bVar, nVar, new C26288u.C26290b(2), kVar}, (C32226l) null, 4, (C8480h) null), new C26261h(C26280r.f73221g, new C26255f[]{bVar}, (C32226l) null, 4, (C8480h) null), new C26261h(fVar4, new C26255f[]{bVar, dVar, nVar, aVar}, (C32226l) null, 4, (C8480h) null), new C26261h(fVar5, new C26255f[]{bVar, cVar}, (C32226l) null, 4, (C8480h) null), new C26261h(C26280r.f73225k, new C26255f[]{bVar, cVar}, (C32226l) null, 4, (C8480h) null), new C26261h(C26280r.f73226l, new C26255f[]{bVar, cVar, aVar}, (C32226l) null, 4, (C8480h) null), new C26261h(C26280r.f73230p, new C26255f[]{bVar, dVar, nVar}, (C32226l) null, 4, (C8480h) null), new C26261h(C26280r.f73218d, new C26255f[]{C26267l.C26268a.f73202b}, (C32226l<? super C26516w, String>) C26278b.f73213d), new C26261h(C26280r.f73219e, new C26255f[]{bVar, C26281s.C26284b.f73240c, dVar, nVar}, (C32226l) null, 4, (C8480h) null), new C26261h((Collection) C26280r.f73233s, new C26255f[]{bVar, dVar, nVar}, (C32226l) null, 4, (C8480h) null), new C26261h((Collection) C26280r.f73232r, new C26255f[]{bVar, cVar}, (C32226l) null, 4, (C8480h) null), new C26261h((Collection<C22830f>) C64197v.m75537f(C26280r.f73228n, C26280r.f73229o), new C26255f[]{bVar}, (C32226l<? super C26516w, String>) C26279c.f73214d), new C26261h((Collection) set, fVarArr3, (C32226l) null, 4, (C8480h) null), new C26261h((C22830f) null, kVar2, (Collection<C22830f>) null, (C32226l<? super C26516w, String>) iVar2, (C26255f[]) Arrays.copyOf(new C26255f[]{bVar, cVar}, 2)));
    }

    /* renamed from: a */
    public List<C26261h> mo53166a() {
        return f73211b;
    }
}
