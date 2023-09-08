package jz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32224a;
import fy3.C32226l;
import g04.C24531d;
import gy3.C87412m;
import gy3.C87413o;
import iz3.C24651h;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import jz3.C24794b;
import m04.C21479h;
import m04.C24976j;
import mz3.C21579b0;
import mz3.C25055g;
import mz3.C25068t;
import sx3.C64186f0;
import sx3.C64187h0;
import vz3.C22830f;
import vz3.C26409h;
import w04.C37951d;
import wy3.C22935h;
import wy3.C26447e;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: jz3.k */
public final class C24825k extends C24850u {

    /* renamed from: n */
    public final C25068t f70782n;

    /* renamed from: o */
    public final C24821j f70783o;

    /* renamed from: p */
    public final C24976j<Set<String>> f70784p;

    /* renamed from: q */
    public final C21479h<C21294a, C26447e> f70785q;

    /* renamed from: jz3.k$a */
    public static final class C21294a {

        /* renamed from: a */
        public final C22830f f60149a;

        /* renamed from: b */
        public final C25055g f60150b;

        public C21294a(C22830f fVar, C25055g gVar) {
            C87412m.m108594g(fVar, "name");
            this.f60149a = fVar;
            this.f60150b = gVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C21294a) && C87412m.m108589b(this.f60149a, ((C21294a) obj).f60149a);
        }

        public int hashCode() {
            return this.f60149a.hashCode();
        }
    }

    /* renamed from: jz3.k$b */
    public static abstract class C24826b {

        /* renamed from: jz3.k$b$a */
        public static final class C24827a extends C24826b {

            /* renamed from: a */
            public final C26447e f70786a;

            public C24827a(C26447e eVar) {
                C87412m.m108594g(eVar, "descriptor");
                this.f70786a = eVar;
            }
        }

        /* renamed from: jz3.k$b$b */
        public static final class C24828b extends C24826b {

            /* renamed from: a */
            public static final C24828b f70787a = new C24828b();
        }

        /* renamed from: jz3.k$b$c */
        public static final class C24829c extends C24826b {

            /* renamed from: a */
            public static final C24829c f70788a = new C24829c();
        }
    }

    /* renamed from: jz3.k$c */
    public static final class C24830c extends C87413o implements C32226l<C21294a, C26447e> {

        /* renamed from: d */
        public final /* synthetic */ C24825k f70789d;

        /* renamed from: e */
        public final /* synthetic */ C24651h f70790e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24830c(C24825k kVar, C24651h hVar) {
            super(1);
            this.f70789d = kVar;
            this.f70790e = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                jz3.k$a r1 = (jz3.C24825k.C21294a) r1
                java.lang.String r2 = "request"
                gy3.C87412m.m108594g(r1, r2)
                vz3.b r2 = new vz3.b
                jz3.k r3 = r0.f70789d
                jz3.j r3 = r3.f70783o
                vz3.c r3 = r3.f74328h
                vz3.f r4 = r1.f60149a
                r2.<init>(r3, r4)
                mz3.g r3 = r1.f60150b
                if (r3 == 0) goto L_0x0027
                iz3.h r4 = r0.f70790e
                iz3.c r4 = r4.f70290a
                oz3.o r4 = r4.f70258c
                oz3.o$a r3 = r4.mo37232a(r3)
                goto L_0x0031
            L_0x0027:
                iz3.h r3 = r0.f70790e
                iz3.c r3 = r3.f70290a
                oz3.o r3 = r3.f70258c
                oz3.o$a r3 = r3.mo37233b(r2)
            L_0x0031:
                r9 = 0
                if (r3 == 0) goto L_0x0042
                boolean r4 = r3 instanceof oz3.C25390o.C25391a.C25393b
                if (r4 == 0) goto L_0x003c
                r4 = r3
                oz3.o$a$b r4 = (oz3.C25390o.C25391a.C25393b) r4
                goto L_0x003d
            L_0x003c:
                r4 = r9
            L_0x003d:
                if (r4 == 0) goto L_0x0042
                oz3.q r4 = r4.f71939a
                goto L_0x0043
            L_0x0042:
                r4 = r9
            L_0x0043:
                if (r4 == 0) goto L_0x004a
                vz3.b r5 = r4.mo37228f()
                goto L_0x004b
            L_0x004a:
                r5 = r9
            L_0x004b:
                if (r5 == 0) goto L_0x0059
                boolean r6 = r5.mo53396k()
                if (r6 != 0) goto L_0x0179
                boolean r5 = r5.f73646c
                if (r5 == 0) goto L_0x0059
                goto L_0x0179
            L_0x0059:
                jz3.k r5 = r0.f70789d
                r5.getClass()
                if (r4 != 0) goto L_0x0063
                jz3.k$b$b r4 = jz3.C24825k.C24826b.C24828b.f70787a
                goto L_0x009a
            L_0x0063:
                pz3.a r6 = r4.mo37224b()
                pz3.a$a r6 = r6.f72189a
                pz3.a$a r7 = pz3.C25505a.C25506a.CLASS
                if (r6 != r7) goto L_0x0098
                iz3.h r5 = r5.f70794b
                iz3.c r5 = r5.f70290a
                oz3.g r5 = r5.f70259d
                r5.getClass()
                j04.g r6 = r5.mo52577f(r4)
                if (r6 != 0) goto L_0x007e
                r4 = r9
                goto L_0x008c
            L_0x007e:
                j04.k r5 = r5.mo52574c()
                j04.i r5 = r5.f70641t
                vz3.b r4 = r4.mo37228f()
                wy3.e r4 = r5.mo51738a(r4, r6)
            L_0x008c:
                if (r4 == 0) goto L_0x0095
                jz3.k$b$a r5 = new jz3.k$b$a
                r5.<init>(r4)
                r4 = r5
                goto L_0x009a
            L_0x0095:
                jz3.k$b$b r4 = jz3.C24825k.C24826b.C24828b.f70787a
                goto L_0x009a
            L_0x0098:
                jz3.k$b$c r4 = jz3.C24825k.C24826b.C24829c.f70788a
            L_0x009a:
                boolean r5 = r4 instanceof jz3.C24825k.C24826b.C24827a
                if (r5 == 0) goto L_0x00a4
                jz3.k$b$a r4 = (jz3.C24825k.C24826b.C24827a) r4
                wy3.e r9 = r4.f70786a
                goto L_0x0179
            L_0x00a4:
                boolean r5 = r4 instanceof jz3.C24825k.C24826b.C24829c
                if (r5 == 0) goto L_0x00aa
                goto L_0x0179
            L_0x00aa:
                boolean r4 = r4 instanceof jz3.C24825k.C24826b.C24828b
                if (r4 == 0) goto L_0x017a
                mz3.g r1 = r1.f60150b
                if (r1 != 0) goto L_0x00d0
                iz3.h r1 = r0.f70790e
                iz3.c r1 = r1.f70290a
                fz3.s r1 = r1.f70257b
                fz3.s$a r10 = new fz3.s$a
                if (r3 == 0) goto L_0x00c3
                boolean r4 = r3 instanceof oz3.C25390o.C25391a.C25392a
                if (r4 != 0) goto L_0x00c1
                r3 = r9
            L_0x00c1:
                oz3.o$a$a r3 = (oz3.C25390o.C25391a.C25392a) r3
            L_0x00c3:
                r5 = 0
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r10
                r4 = r2
                r3.<init>(r4, r5, r6, r7, r8)
                mz3.g r1 = r1.mo37222c(r10)
            L_0x00d0:
                r13 = r1
                if (r13 == 0) goto L_0x00d8
                mz3.b0 r1 = r13.mo51092u()
                goto L_0x00d9
            L_0x00d8:
                r1 = r9
            L_0x00d9:
                mz3.b0 r3 = mz3.C21579b0.BINARY
                if (r1 != r3) goto L_0x013e
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: "
                r3.append(r4)
                r3.append(r13)
                java.lang.String r4 = "\nClassId: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r4 = "\nfindKotlinClass(JavaClass) = "
                r3.append(r4)
                iz3.h r4 = r0.f70790e
                iz3.c r4 = r4.f70290a
                oz3.o r4 = r4.f70258c
                java.lang.String r5 = "<this>"
                gy3.C87412m.m108594g(r4, r5)
                java.lang.String r5 = "javaClass"
                gy3.C87412m.m108594g(r13, r5)
                oz3.o$a r4 = r4.mo37232a(r13)
                if (r4 == 0) goto L_0x011c
                boolean r5 = r4 instanceof oz3.C25390o.C25391a.C25393b
                if (r5 == 0) goto L_0x0116
                oz3.o$a$b r4 = (oz3.C25390o.C25391a.C25393b) r4
                goto L_0x0117
            L_0x0116:
                r4 = r9
            L_0x0117:
                if (r4 == 0) goto L_0x011c
                oz3.q r4 = r4.f71939a
                r9 = r4
            L_0x011c:
                r3.append(r9)
                java.lang.String r4 = "\nfindKotlinClass(ClassId) = "
                r3.append(r4)
                iz3.h r4 = r0.f70790e
                iz3.c r4 = r4.f70290a
                oz3.o r4 = r4.f70258c
                oz3.q r2 = oz3.C25394p.m32569a(r4, r2)
                r3.append(r2)
                r2 = 10
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x013e:
                if (r13 == 0) goto L_0x0145
                vz3.c r1 = r13.mo51084d()
                goto L_0x0146
            L_0x0145:
                r1 = r9
            L_0x0146:
                if (r1 == 0) goto L_0x0179
                boolean r2 = r1.mo35975d()
                if (r2 != 0) goto L_0x0179
                vz3.c r1 = r1.mo35976e()
                jz3.k r2 = r0.f70789d
                jz3.j r2 = r2.f70783o
                vz3.c r2 = r2.f74328h
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
                if (r1 != 0) goto L_0x015f
                goto L_0x0179
            L_0x015f:
                jz3.f r9 = new jz3.f
                iz3.h r11 = r0.f70790e
                jz3.k r1 = r0.f70789d
                jz3.j r12 = r1.f70783o
                r14 = 0
                r15 = 8
                r16 = 0
                r10 = r9
                r10.<init>(r11, r12, r13, r14, r15, r16)
                iz3.h r1 = r0.f70790e
                iz3.c r1 = r1.f70290a
                fz3.t r1 = r1.f70274s
                r1.mo51198a(r9)
            L_0x0179:
                return r9
            L_0x017a:
                rx3.j r1 = new rx3.j
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: jz3.C24825k.C24830c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: jz3.k$d */
    public static final class C24831d extends C87413o implements C32224a<Set<? extends String>> {

        /* renamed from: d */
        public final /* synthetic */ C24651h f70791d;

        /* renamed from: e */
        public final /* synthetic */ C24825k f70792e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24831d(C24651h hVar, C24825k kVar) {
            super(0);
            this.f70791d = hVar;
            this.f70792e = kVar;
        }

        public Object invoke() {
            return this.f70791d.f70290a.f70257b.mo37221b(this.f70792e.f70783o.f74328h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24825k(C24651h hVar, C25068t tVar, C24821j jVar) {
        super(hVar);
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(tVar, "jPackage");
        C87412m.m108594g(jVar, "ownerDescriptor");
        this.f70782n = tVar;
        this.f70783o = jVar;
        this.f70784p = hVar.f70290a.f70256a.mo52005f(new C24831d(hVar, this));
        this.f70785q = hVar.f70290a.f70256a.mo52004e(new C24830c(this, hVar));
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return C64186f0.f181907d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<wy3.C26469k> mo32460e(g04.C24531d r5, fy3.C32226l<? super vz3.C22830f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "nameFilter"
            gy3.C87412m.m108594g(r6, r0)
            g04.d$a r0 = g04.C24531d.f70094c
            int r0 = g04.C24531d.f70103l
            int r1 = g04.C24531d.f70096e
            r0 = r0 | r1
            boolean r5 = r5.mo51213a(r0)
            if (r5 != 0) goto L_0x001a
            sx3.f0 r5 = sx3.C64186f0.f181907d
            goto L_0x005d
        L_0x001a:
            m04.i<java.util.Collection<wy3.k>> r5 = r4.f70796d
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r5.next()
            r2 = r1
            wy3.k r2 = (wy3.C26469k) r2
            boolean r3 = r2 instanceof wy3.C26447e
            if (r3 == 0) goto L_0x0055
            wy3.e r2 = (wy3.C26447e) r2
            vz3.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x002b
            r0.add(r1)
            goto L_0x002b
        L_0x005c:
            r5 = r0
        L_0x005d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24825k.mo32460e(g04.d, fy3.l):java.util.Collection");
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return mo51846v(fVar, (C25055g) null);
    }

    /* renamed from: h */
    public Set<C22830f> mo51830h(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C24531d.C24532a aVar = C24531d.f70094c;
        if (!dVar.mo51213a(C24531d.f70096e)) {
            return C64187h0.f181908d;
        }
        Set<String> set = (Set) this.f70784p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String f : set) {
                hashSet.add(C22830f.m26794f(f));
            }
            return hashSet;
        }
        C25068t tVar = this.f70782n;
        C32226l<Object, Boolean> lVar2 = lVar;
        if (lVar == null) {
            lVar2 = C37951d.f100405a;
        }
        Collection<C25055g> n = tVar.mo51052n(lVar2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C25055g gVar : n) {
            C22830f name = gVar.mo51092u() == C21579b0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: i */
    public Set<C22830f> mo51831i(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        return C64187h0.f181908d;
    }

    /* renamed from: k */
    public C24794b mo51833k() {
        return C24794b.C24795a.f70711a;
    }

    /* renamed from: m */
    public void mo51834m(Collection<C26520x0> collection, C22830f fVar) {
        C87412m.m108594g(collection, "result");
        C87412m.m108594g(fVar, "name");
    }

    /* renamed from: o */
    public Set<C22830f> mo51836o(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        return C64187h0.f181908d;
    }

    /* renamed from: q */
    public C26469k mo51838q() {
        return this.f70783o;
    }

    /* renamed from: v */
    public final C26447e mo51846v(C22830f fVar, C25055g gVar) {
        C22830f fVar2 = C26409h.f73647a;
        C87412m.m108594g(fVar, "name");
        String b = fVar.mo35995b();
        C87412m.m108593f(b, "name.asString()");
        boolean z = false;
        if ((b.length() > 0) && !fVar.f65638e) {
            z = true;
        }
        if (!z) {
            return null;
        }
        Set set = (Set) this.f70784p.invoke();
        if (gVar != null || set == null || set.contains(fVar.mo35995b())) {
            return this.f70785q.invoke(new C21294a(fVar, gVar));
        }
        return null;
    }
}
