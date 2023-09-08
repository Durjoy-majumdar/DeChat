package jz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import ez3.C24473b;
import ez3.C24476d;
import fy3.C32226l;
import g04.C20770i;
import g04.C24531d;
import gy3.C87412m;
import gy3.C87413o;
import gz3.C24577a;
import hz3.C24616h;
import iz3.C24643c;
import iz3.C24651h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mz3.C25055g;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C64187h0;
import sx3.C64197v;
import ty3.C26343l;
import vz3.C22830f;
import w04.C22843b;
import wy3.C22935h;
import wy3.C26436b;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26520x0;
import zz3.C26792g;

/* renamed from: jz3.q */
public final class C24847q extends C24850u {

    /* renamed from: n */
    public final C25055g f70829n;

    /* renamed from: o */
    public final C24803f f70830o;

    /* renamed from: jz3.q$a */
    public static final class C24848a extends C87413o implements C32226l<C20770i, Collection<? extends C26504r0>> {

        /* renamed from: d */
        public final /* synthetic */ C22830f f70831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24848a(C22830f fVar) {
            super(1);
            this.f70831d = fVar;
        }

        public Object invoke(Object obj) {
            C20770i iVar = (C20770i) obj;
            C87412m.m108594g(iVar, LocaleUtil.ITALIAN);
            return iVar.mo32457b(this.f70831d, C24476d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* renamed from: jz3.q$b */
    public static final class C24849b extends C87413o implements C32226l<C20770i, Collection<? extends C22830f>> {

        /* renamed from: d */
        public static final C24849b f70832d = new C24849b();

        public C24849b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C20770i iVar = (C20770i) obj;
            C87412m.m108594g(iVar, LocaleUtil.ITALIAN);
            return iVar.mo32459d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24847q(C24651h hVar, C25055g gVar, C24803f fVar) {
        super(hVar);
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(gVar, "jClass");
        C87412m.m108594g(fVar, "ownerDescriptor");
        this.f70829n = gVar;
        this.f70830o = fVar;
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return null;
    }

    /* renamed from: h */
    public Set<C22830f> mo51830h(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        return C64187h0.f181908d;
    }

    /* renamed from: i */
    public Set<C22830f> mo51831i(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        Set<C22830f> C0 = C110818d0.m150902C0(((C24794b) this.f70797e.invoke()).mo51776a());
        C24847q b = C24616h.m30811b(this.f70830o);
        Collection c = b != null ? b.mo32458c() : null;
        if (c == null) {
            c = C64187h0.f181908d;
        }
        C0.addAll(c);
        if (this.f70829n.mo51081J()) {
            C0.addAll(C64197v.m75537f(C26343l.f73368b, C26343l.f73367a));
        }
        C0.addAll(this.f70794b.f70290a.f70279x.mo51166b(this.f70830o));
        return C0;
    }

    /* renamed from: j */
    public void mo51832j(Collection<C26520x0> collection, C22830f fVar) {
        C87412m.m108594g(collection, "result");
        C87412m.m108594g(fVar, "name");
        this.f70794b.f70290a.f70279x.mo51169e(this.f70830o, fVar, collection);
    }

    /* renamed from: k */
    public C24794b mo51833k() {
        return new C24792a(this.f70829n, C24846p.f70828d);
    }

    /* renamed from: m */
    public void mo51834m(Collection<C26520x0> collection, C22830f fVar) {
        C87412m.m108594g(collection, "result");
        C87412m.m108594g(fVar, "name");
        C24847q b = C24616h.m30811b(this.f70830o);
        Set<T> D0 = b == null ? C64187h0.f181908d : C110818d0.m150904D0(b.mo32456a(fVar, C24476d.WHEN_GET_SUPER_MEMBERS));
        C24803f fVar2 = this.f70830o;
        C24643c cVar = this.f70794b.f70290a;
        collection.addAll(C24577a.m30759e(fVar, D0, collection, fVar2, cVar.f70261f, cVar.f70276u.mo52422c()));
        if (!this.f70829n.mo51081J()) {
            return;
        }
        if (C87412m.m108589b(fVar, C26343l.f73368b)) {
            C26520x0 e = C26792g.m35206e(this.f70830o);
            C87412m.m108593f(e, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(e);
        } else if (C87412m.m108589b(fVar, C26343l.f73367a)) {
            C26520x0 f = C26792g.m35207f(this.f70830o);
            C87412m.m108593f(f, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(f);
        }
    }

    /* renamed from: n */
    public void mo51835n(C22830f fVar, Collection<C26504r0> collection) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(collection, "result");
        C24803f fVar2 = this.f70830o;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C22843b.m26802b(C26236u.m33719b(fVar2), C21297s.f60153a, new C21298t(fVar2, linkedHashSet, new C24848a(fVar)));
        if (!collection.isEmpty()) {
            C24803f fVar3 = this.f70830o;
            C24643c cVar = this.f70794b.f70290a;
            collection.addAll(C24577a.m30759e(fVar, linkedHashSet, collection, fVar3, cVar.f70261f, cVar.f70276u.mo52422c()));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : linkedHashSet) {
            C26504r0 v = mo51853v((C26504r0) next);
            Object obj = linkedHashMap.get(v);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(v, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            C24803f fVar4 = this.f70830o;
            C24643c cVar2 = this.f70794b.f70290a;
            C64175a0.m75508p(arrayList, C24577a.m30759e(fVar, (Collection) value.getValue(), collection, fVar4, cVar2.f70261f, cVar2.f70276u.mo52422c()));
        }
        collection.addAll(arrayList);
    }

    /* renamed from: o */
    public Set<C22830f> mo51836o(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        Set<C22830f> C0 = C110818d0.m150902C0(((C24794b) this.f70797e.invoke()).mo51780e());
        C24803f fVar = this.f70830o;
        C22843b.m26802b(C26236u.m33719b(fVar), C21297s.f60153a, new C21298t(fVar, C0, C24849b.f70832d));
        return C0;
    }

    /* renamed from: q */
    public C26469k mo51838q() {
        return this.f70830o;
    }

    /* renamed from: v */
    public final C26504r0 mo51853v(C26504r0 r0Var) {
        C26436b.C26437a f = r0Var.mo52634f();
        f.getClass();
        if (f != C26436b.C26437a.FAKE_OVERRIDE) {
            return r0Var;
        }
        Collection<? extends C26504r0> e = r0Var.mo52633e();
        C87412m.m108593f(e, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(e, 10));
        for (C26504r0 r0Var2 : e) {
            C87412m.m108593f(r0Var2, LocaleUtil.ITALIAN);
            arrayList.add(mo51853v(r0Var2));
        }
        return (C26504r0) C110818d0.m150938j0(C110818d0.m150905E(arrayList));
    }
}
