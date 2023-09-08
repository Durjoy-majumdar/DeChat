package vz3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import sx3.C36907w;
import sx3.C90363p0;

/* renamed from: vz3.j */
public final class C26411j {
    static {
        new C22826c("java.lang").mo35974c(C22830f.m26794f("annotation"));
    }

    /* renamed from: a */
    public static final C26408b m34001a(String str) {
        C26410i.f73654a.getClass();
        return new C26408b(C26410i.f73655b, C22830f.m26794f(str));
    }

    /* renamed from: b */
    public static final C26408b m34002b(String str) {
        C26410i.f73654a.getClass();
        return new C26408b(C26410i.f73657d, C22830f.m26794f(str));
    }

    /* renamed from: c */
    public static final Map m34003c(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        int a = C90363p0.m113142a(C36907w.m41090l(entrySet, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public static final C26408b m34004d(C22830f fVar) {
        C26410i.f73654a.getClass();
        C26408b bVar = C26410i.f73662i;
        C22826c h = bVar.mo53392h();
        return new C26408b(h, C22830f.m26794f(fVar.mo35996c() + bVar.mo53395j().mo35996c()));
    }

    /* renamed from: e */
    public static final C26408b m34005e(String str) {
        C26410i.f73654a.getClass();
        return new C26408b(C26410i.f73658e, C22830f.m26794f(str));
    }

    /* renamed from: f */
    public static final C26408b m34006f(String str) {
        C26410i.f73654a.getClass();
        return new C26408b(C26410i.f73656c, C22830f.m26794f(str));
    }

    /* renamed from: g */
    public static final C26408b m34007g(C26408b bVar) {
        C26410i.f73654a.getClass();
        C22826c cVar = C26410i.f73655b;
        return new C26408b(cVar, C22830f.m26794f('U' + bVar.mo53395j().mo35996c()));
    }
}
