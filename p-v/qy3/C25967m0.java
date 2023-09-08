package qy3;

import bz3.C16831i;
import bz3.C23677a;
import bz3.C23680d;
import bz3.C23683g;
import bz3.C23684j;
import bz3.C23685k;
import cz3.C24410d;
import e04.C24468c;
import e04.C24470f;
import ez3.C24474c;
import f04.C24478b;
import fz3.C24494a0;
import fz3.C24502e;
import fz3.C24514t;
import gy3.C8480h;
import gy3.C87412m;
import gz3.C24586f;
import gz3.C24588g;
import gz3.C24594j;
import iz3.C24643c;
import iz3.C24644d;
import iz3.C24649g;
import iz3.C24655k;
import j04.C24760j;
import j04.C24763k;
import j04.C24764l;
import j04.C24777v;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import m04.C24959e;
import n04.C25175s;
import nz3.C25264f;
import nz3.C25304s;
import o04.C25330k;
import o04.C25332l;
import oz3.C117906w;
import oz3.C25370d;
import oz3.C25377f;
import oz3.C25378g;
import oz3.C25380h;
import oz3.C25381i;
import rx3.C13598b0;
import sx3.C110823p;
import sx3.C26236u;
import sx3.C64186f0;
import sx3.C64187h0;
import sx3.C64197v;
import ty3.C22557i;
import ty3.C26336h;
import ty3.C26339k;
import uz3.C26380h;
import vy3.C26391g;
import vy3.C26396i;
import vy3.C26397j;
import vy3.C26406r;
import vz3.C22830f;
import wy3.C26439b1;
import wy3.C26458h0;
import wz3.C26526a;
import xz3.C26589f;
import yy3.C26640a;
import yy3.C26643c;
import yy3.C26647e;
import zy3.C23593l;
import zy3.C23598y;
import zy3.C26729b0;

/* renamed from: qy3.m0 */
public final class C25967m0 {

    /* renamed from: a */
    public static final ConcurrentMap<C63351v0, WeakReference<C23684j>> f72347a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C23684j m33134a(Class<?> cls) {
        C26640a aVar;
        C26643c cVar;
        C87412m.m108594g(cls, "<this>");
        ClassLoader d = C24410d.m30458d(cls);
        C63351v0 v0Var = new C63351v0(d);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f72347a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(v0Var);
        if (weakReference != null) {
            C23684j jVar = (C23684j) weakReference.get();
            if (jVar != null) {
                return jVar;
            }
            concurrentHashMap.remove(v0Var, weakReference);
        }
        C23683g gVar = r2;
        C23683g gVar2 = new C23683g(d);
        ClassLoader classLoader = C13598b0.class.getClassLoader();
        C87412m.m108593f(classLoader, "Unit::class.java.classLoader");
        C23683g gVar3 = new C23683g(classLoader);
        C23680d dVar = r3;
        C23680d dVar2 = new C23680d(d);
        String str = "runtime module for " + d;
        C16831i iVar = C16831i.f45472b;
        C16831i iVar2 = iVar;
        C23685k kVar = C23685k.f67877a;
        C87412m.m108594g(str, "moduleName");
        C24959e eVar = r14;
        C24959e eVar2 = new C24959e("DeserializationComponentsForJava.ModuleData");
        C26391g gVar4 = new C26391g(eVar2, C26391g.C26394a.FROM_DEPENDENCIES);
        C26729b0 b0Var = r30;
        C26729b0 b0Var2 = new C26729b0(C22830f.m26796h('<' + str + '>'), eVar2, gVar4, (C26526a) null, (Map) null, (C22830f) null, 56, (C8480h) null);
        eVar2.mo52008j(new C22557i(gVar4, b0Var2));
        gVar4.f73616f = new C26396i(b0Var2, true);
        C25378g gVar5 = r0;
        C25378g gVar6 = new C25378g();
        C24655k kVar2 = r5;
        C24655k kVar3 = new C24655k();
        C63351v0 v0Var2 = v0Var;
        C26458h0 h0Var = new C26458h0(eVar2, b0Var2);
        C117906w.C117907a aVar2 = C117906w.C117907a.f352432a;
        C23683g gVar7 = gVar3;
        C24655k kVar4 = kVar3;
        C24594j jVar2 = C24594j.f70191a;
        C16831i iVar3 = iVar;
        C24588g gVar8 = C24588g.f70184a;
        C25378g gVar9 = gVar6;
        C26729b0 b0Var3 = b0Var2;
        C24588g gVar10 = gVar8;
        C26391g gVar11 = gVar4;
        C24586f.C24587a aVar3 = C24586f.C24587a.f70183a;
        C24588g gVar12 = gVar8;
        C23683g gVar13 = gVar2;
        C24959e eVar3 = eVar2;
        C24478b bVar = r3;
        C24643c cVar2 = r5;
        C64186f0 f0Var = C64186f0.f181907d;
        C24478b bVar2 = new C24478b(eVar3, f0Var);
        C26439b1.C26440a aVar4 = C26439b1.C26440a.f73729a;
        C24474c.C24475a aVar5 = C24474c.C24475a.f69990a;
        C24474c.C24475a aVar6 = aVar5;
        C24474c.C24475a aVar7 = aVar5;
        C26339k kVar5 = r3;
        C26339k kVar6 = new C26339k(b0Var3, h0Var);
        C64186f0 f0Var2 = f0Var;
        C24494a0 a0Var = C24494a0.f70001d;
        C24502e eVar4 = new C24502e(a0Var);
        C25304s sVar = r3;
        C26729b0 b0Var4 = b0Var3;
        C24644d.C24645a aVar8 = C24644d.C24645a.f70280a;
        C24644d.C24645a aVar9 = aVar8;
        C25304s sVar2 = new C25304s(new C25264f(aVar8));
        C24514t.C24515a aVar10 = C24514t.C24515a.f70072a;
        C25330k.f71840b.getClass();
        C25332l lVar = C25330k.C25331a.f71842b;
        C25377f fVar = r3;
        C25377f fVar2 = new C25377f();
        C24643c cVar3 = new C24643c(eVar, dVar, gVar, gVar5, jVar2, iVar2, gVar10, aVar3, bVar, kVar, kVar2, aVar2, aVar4, aVar6, b0Var, kVar5, eVar4, sVar, aVar10, aVar9, lVar, a0Var, fVar, (C24470f) null, 8388608, (C8480h) null);
        C24649g gVar14 = new C24649g(cVar2);
        C25378g gVar15 = gVar9;
        C23683g gVar16 = gVar13;
        C25380h hVar = new C25380h(gVar16, gVar15);
        C26729b0 b0Var5 = b0Var4;
        C25370d dVar3 = new C25370d(b0Var5, h0Var, eVar3, gVar16);
        C24764l.C24765a aVar11 = C24764l.C24765a.f70642a;
        C24760j jVar3 = C24760j.C24761a.f70621a;
        List b = C26236u.m33719b(C25175s.f71622a);
        C26336h hVar2 = b0Var5.f74312g;
        C26391g gVar17 = hVar2 instanceof C26391g ? (C26391g) hVar2 : null;
        C24777v.C24778a aVar12 = C24777v.C24778a.f70664a;
        C25381i iVar4 = C25381i.f71923a;
        if (gVar17 == null || (aVar = gVar17.mo53379M()) == null) {
            aVar = C26640a.C26641a.f74149a;
        }
        C26640a aVar13 = aVar;
        if (gVar17 == null || (cVar = gVar17.mo53379M()) == null) {
            cVar = C26643c.C26645b.f74151a;
        }
        C26643c cVar4 = cVar;
        C26589f fVar3 = C26380h.f73582b;
        C24478b bVar3 = r4;
        C64186f0 f0Var3 = f0Var2;
        C24478b bVar4 = new C24478b(eVar3, f0Var3);
        C64186f0 f0Var4 = f0Var3;
        C24763k kVar7 = new C24763k(eVar3, b0Var5, aVar11, hVar, dVar3, gVar14, aVar12, iVar3, aVar7, iVar4, f0Var4, h0Var, jVar3, aVar13, cVar4, fVar3, lVar, bVar3, (C26647e) null, b, 262144, (C8480h) null);
        gVar15.f71919a = kVar7;
        C24468c cVar5 = new C24468c(gVar14, gVar12);
        kVar4.f70301a = cVar5;
        C26397j M = gVar11.mo53379M();
        C26397j M2 = gVar11.mo53379M();
        C24478b bVar5 = new C24478b(eVar3, f0Var4);
        C25378g gVar18 = gVar15;
        C26458h0 h0Var2 = h0Var;
        C26729b0 b0Var6 = b0Var5;
        C26406r rVar = new C26406r(eVar3, gVar7, b0Var5, h0Var2, M, M2, aVar11, lVar, bVar5);
        List a0 = C110823p.m151001a0(new C26729b0[]{b0Var6});
        C64187h0 h0Var3 = C64187h0.f181908d;
        b0Var6.f74315j = new C23598y(a0, h0Var3, f0Var4, h0Var3);
        b0Var6.f74316n = new C23593l(C64197v.m75537f(cVar5.f69984a, rVar), "CompositeProvider@RuntimeModuleData for " + b0Var6);
        C23684j jVar4 = new C23684j(kVar7, new C23677a(gVar18, gVar16), (C8480h) null);
        while (true) {
            ConcurrentMap<C63351v0, WeakReference<C23684j>> concurrentMap = f72347a;
            C63351v0 v0Var3 = v0Var2;
            WeakReference weakReference2 = (WeakReference) ((ConcurrentHashMap) concurrentMap).putIfAbsent(v0Var3, new WeakReference(jVar4));
            if (weakReference2 == null) {
                return jVar4;
            }
            C23684j jVar5 = (C23684j) weakReference2.get();
            if (jVar5 != null) {
                return jVar5;
            }
            ((ConcurrentHashMap) concurrentMap).remove(v0Var3, weakReference2);
            v0Var2 = v0Var3;
        }
    }
}
