package fz3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90363p0;
import sx3.C90364q0;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C22827d;
import vz3.C22830f;

/* renamed from: fz3.j */
public final class C20750j {

    /* renamed from: a */
    public static final Map<C22826c, C22830f> f58640a;

    /* renamed from: b */
    public static final Map<C22830f, List<C22830f>> f58641b;

    /* renamed from: c */
    public static final Set<C22826c> f58642c;

    /* renamed from: d */
    public static final Set<C22830f> f58643d;

    static {
        C22827d dVar = C26343l.C26344a.f73421k;
        C22826c cVar = C26343l.C26344a.f73387G;
        Map<C22826c, C22830f> f = C90364q0.m113147f(new C13604l(C20752k.m22703a(dVar, "name"), C22830f.m26794f("name")), new C13604l(C20752k.m22703a(dVar, "ordinal"), C22830f.m26794f("ordinal")), new C13604l(C26343l.C26344a.f73383C.mo35974c(C22830f.m26794f("size")), C22830f.m26794f("size")), new C13604l(cVar.mo35974c(C22830f.m26794f("size")), C22830f.m26794f("size")), new C13604l(C20752k.m22703a(C26343l.C26344a.f73416f, "length"), C22830f.m26794f("length")), new C13604l(cVar.mo35974c(C22830f.m26794f("keys")), C22830f.m26794f("keySet")), new C13604l(cVar.mo35974c(C22830f.m26794f("values")), C22830f.m26794f("values")), new C13604l(cVar.mo35974c(C22830f.m26794f("entries")), C22830f.m26794f("entrySet")));
        f58640a = f;
        Set<Map.Entry<C22826c, C22830f>> entrySet = f.entrySet();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new C13604l(((C22826c) entry.getKey()).mo35978f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13604l lVar = (C13604l) it.next();
            C22830f fVar = (C22830f) lVar.f38556e;
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((C22830f) lVar.f38555d);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C90363p0.m113142a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C110818d0.m150905E((Iterable) entry2.getValue()));
        }
        f58641b = linkedHashMap2;
        Set<C22826c> keySet = f58640a.keySet();
        f58642c = keySet;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(keySet, 10));
        for (C22826c f2 : keySet) {
            arrayList2.add(f2.mo35978f());
        }
        f58643d = C110818d0.m150904D0(arrayList2);
    }
}
