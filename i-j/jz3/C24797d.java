package jz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import dz3.C24465a;
import ez3.C24473b;
import fy3.C32224a;
import g04.C107692k;
import g04.C20770i;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import iz3.C24651h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import m04.C21480i;
import m04.C24979m;
import mz3.C25055g;
import mz3.C25068t;
import ny3.C89104m;
import oz3.C25395q;
import sx3.C110823p;
import sx3.C64175a0;
import sx3.C64187h0;
import v04.C26381a;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26447e;
import wy3.C26464i;
import wy3.C26504r0;
import wy3.C26520x0;

/* renamed from: jz3.d */
public final class C24797d implements C20770i {

    /* renamed from: f */
    public static final /* synthetic */ C89104m<Object>[] f70712f = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C24797d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b */
    public final C24651h f70713b;

    /* renamed from: c */
    public final C24821j f70714c;

    /* renamed from: d */
    public final C24825k f70715d;

    /* renamed from: e */
    public final C21480i f70716e;

    /* renamed from: jz3.d$a */
    public static final class C24798a extends C87413o implements C32224a<C20770i[]> {

        /* renamed from: d */
        public final /* synthetic */ C24797d f70717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24798a(C24797d dVar) {
            super(0);
            this.f70717d = dVar;
        }

        public Object invoke() {
            C24821j jVar = this.f70717d.f70714c;
            Collection<C25395q> values = ((Map) C24979m.m31587a(jVar.f70775o, jVar, C24821j.f70772s[0])).values();
            C24797d dVar = this.f70717d;
            ArrayList arrayList = new ArrayList();
            for (C25395q a : values) {
                C20770i a2 = dVar.f70713b.f70290a.f70259d.mo52572a(dVar.f70714c, a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            Object[] array = C26381a.m33960b(arrayList).toArray(new C20770i[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (C20770i[]) array;
        }
    }

    public C24797d(C24651h hVar, C25068t tVar, C24821j jVar) {
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(tVar, "jPackage");
        C87412m.m108594g(jVar, "packageFragment");
        this.f70713b = hVar;
        this.f70714c = jVar;
        this.f70715d = new C24825k(hVar, tVar, jVar);
        this.f70716e = hVar.f70290a.f70256a.mo52006g(new C24798a(this));
    }

    /* renamed from: a */
    public Collection<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        mo51783i(fVar, bVar);
        C24825k kVar = this.f70715d;
        C20770i[] h = mo51782h();
        Collection a = kVar.mo32456a(fVar, bVar);
        for (C20770i a2 : h) {
            a = C26381a.m33959a(a, a2.mo32456a(fVar, bVar));
        }
        return a == null ? C64187h0.f181908d : a;
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        mo51783i(fVar, bVar);
        C24825k kVar = this.f70715d;
        C20770i[] h = mo51782h();
        Collection b = kVar.mo32457b(fVar, bVar);
        for (C20770i b2 : h) {
            b = C26381a.m33959a(b, b2.mo32457b(fVar, bVar));
        }
        return b == null ? C64187h0.f181908d : b;
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        C20770i[] h = mo51782h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C20770i c : h) {
            C64175a0.m75508p(linkedHashSet, c.mo32458c());
        }
        linkedHashSet.addAll(this.f70715d.mo32458c());
        return linkedHashSet;
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        C20770i[] h = mo51782h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C20770i d : h) {
            C64175a0.m75508p(linkedHashSet, d.mo32459d());
        }
        linkedHashSet.addAll(this.f70715d.mo32459d());
        return linkedHashSet;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [fy3.l<? super vz3.f, java.lang.Boolean>, java.lang.Object, fy3.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<wy3.C26469k> mo32460e(g04.C24531d r6, fy3.C32226l<? super vz3.C22830f, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "nameFilter"
            gy3.C87412m.m108594g(r7, r0)
            jz3.k r0 = r5.f70715d
            g04.i[] r1 = r5.mo51782h()
            java.util.Collection r0 = r0.mo32460e(r6, r7)
            int r2 = r1.length
            r3 = 0
        L_0x0016:
            if (r3 >= r2) goto L_0x0025
            r4 = r1[r3]
            java.util.Collection r4 = r4.mo32460e(r6, r7)
            java.util.Collection r0 = v04.C26381a.m33959a(r0, r4)
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0025:
            if (r0 != 0) goto L_0x0029
            sx3.h0 r0 = sx3.C64187h0.f181908d
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24797d.mo32460e(g04.d, fy3.l):java.util.Collection");
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        Set<C22830f> a = C107692k.m145868a(C110823p.m151005u(mo51782h()));
        if (a == null) {
            return null;
        }
        a.addAll(this.f70715d.mo32461f());
        return a;
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        mo51783i(fVar, bVar);
        C24825k kVar = this.f70715d;
        kVar.getClass();
        C22935h hVar = null;
        C26447e v = kVar.mo51846v(fVar, (C25055g) null);
        if (v != null) {
            return v;
        }
        for (C20770i g : mo51782h()) {
            C22935h g2 = g.mo32462g(fVar, bVar);
            if (g2 != null) {
                if (!(g2 instanceof C26464i) || !((C26464i) g2).mo51792P()) {
                    return g2;
                }
                if (hVar == null) {
                    hVar = g2;
                }
            }
        }
        return hVar;
    }

    /* renamed from: h */
    public final C20770i[] mo51782h() {
        return (C20770i[]) C24979m.m31587a(this.f70716e, this, f70712f[0]);
    }

    /* renamed from: i */
    public void mo51783i(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C24465a.m30603b(this.f70713b.f70290a.f70269n, bVar, this.f70714c, fVar);
    }

    public String toString() {
        return "scope for " + this.f70714c;
    }
}
