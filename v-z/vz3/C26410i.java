package vz3;

import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import sx3.C110826x0;
import sx3.C36907w;
import sx3.C48501y0;
import sx3.C90363p0;

/* renamed from: vz3.i */
public final class C26410i {

    /* renamed from: a */
    public static final C26410i f73654a = new C26410i();

    /* renamed from: b */
    public static final C22826c f73655b;

    /* renamed from: c */
    public static final C22826c f73656c;

    /* renamed from: d */
    public static final C22826c f73657d;

    /* renamed from: e */
    public static final C22826c f73658e;

    /* renamed from: f */
    public static final C22826c f73659f;

    /* renamed from: g */
    public static final C22826c f73660g;

    /* renamed from: h */
    public static final Set<C22826c> f73661h;

    /* renamed from: i */
    public static final C26408b f73662i = C26411j.m34001a("Array");

    /* renamed from: j */
    public static final C26408b f73663j;

    /* renamed from: k */
    public static final C26408b f73664k;

    /* renamed from: l */
    public static final C26408b f73665l;

    /* renamed from: m */
    public static final C26408b f73666m;

    /* renamed from: n */
    public static final C26408b f73667n = C26411j.m34001a("String");

    /* renamed from: o */
    public static final C26408b f73668o = C26411j.m34006f("KFunction");

    /* renamed from: p */
    public static final Set<C26408b> f73669p;

    /* renamed from: q */
    public static final Map<C26408b, C26408b> f73670q;

    /* renamed from: r */
    public static final Map<C26408b, C26408b> f73671r;

    /* renamed from: s */
    public static final Set<C26408b> f73672s;

    /* renamed from: t */
    public static final Map<C26408b, C26408b> f73673t;

    /* renamed from: u */
    public static final Map<C26408b, C26408b> f73674u;

    /* renamed from: v */
    public static final Set<C26408b> f73675v = C48501y0.m53873h(C48501y0.m53872g(f73669p, f73672s), f73667n);

    /* renamed from: w */
    public static final C26408b f73676w = C26411j.m34002b("MutableList");

    /* renamed from: x */
    public static final C26408b f73677x = C26411j.m34002b("MutableSet");

    /* renamed from: y */
    public static final C26408b f73678y;

    static {
        C22826c cVar = new C22826c("kotlin");
        f73655b = cVar;
        C22826c c = cVar.mo35974c(C22830f.m26794f("reflect"));
        f73656c = c;
        C22826c c2 = cVar.mo35974c(C22830f.m26794f("collections"));
        f73657d = c2;
        C22826c c3 = cVar.mo35974c(C22830f.m26794f("ranges"));
        f73658e = c3;
        cVar.mo35974c(C22830f.m26794f("jvm")).mo35974c(C22830f.m26794f("internal"));
        C22826c c4 = cVar.mo35974c(C22830f.m26794f("annotation"));
        f73659f = c4;
        C22826c c5 = cVar.mo35974c(C22830f.m26794f("internal"));
        c5.mo35974c(C22830f.m26794f("ir"));
        C22826c c6 = cVar.mo35974c(C22830f.m26794f("coroutines"));
        f73660g = c6;
        f73661h = C110826x0.m151017e(cVar, c2, c3, c4, c, c5, c6);
        C26411j.m34001a("Nothing");
        C26411j.m34001a("Unit");
        C26411j.m34001a("Any");
        C26411j.m34001a("Enum");
        C26411j.m34001a("Annotation");
        C26408b a = C26411j.m34001a("Boolean");
        C26408b a2 = C26411j.m34001a("Char");
        C26408b a3 = C26411j.m34001a("Byte");
        C26408b a4 = C26411j.m34001a("Short");
        C26408b a5 = C26411j.m34001a("Int");
        C26408b a6 = C26411j.m34001a("Long");
        C26408b a7 = C26411j.m34001a("Float");
        C26408b a8 = C26411j.m34001a("Double");
        f73663j = C26411j.m34007g(a3);
        f73664k = C26411j.m34007g(a4);
        f73665l = C26411j.m34007g(a5);
        f73666m = C26411j.m34007g(a6);
        C26411j.m34001a("Throwable");
        C26411j.m34001a("Cloneable");
        C26411j.m34006f("KProperty");
        C26411j.m34006f("KMutableProperty");
        C26411j.m34006f("KProperty0");
        C26411j.m34006f("KMutableProperty0");
        C26411j.m34006f("KProperty1");
        C26411j.m34006f("KMutableProperty1");
        C26411j.m34006f("KProperty2");
        C26411j.m34006f("KMutableProperty2");
        C26411j.m34006f("KClass");
        C26411j.m34006f("KCallable");
        C26411j.m34001a("Comparable");
        C26411j.m34001a("Number");
        C26411j.m34001a("Function");
        Set<C26408b> e = C110826x0.m151017e(a, a2, a3, a4, a5, a6, a7, a8);
        f73669p = e;
        int a9 = C90363p0.m113142a(C36907w.m41090l(e, 10));
        int i = 16;
        if (a9 < 16) {
            a9 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a9);
        for (T next : e) {
            C22830f j = ((C26408b) next).mo53395j();
            C87412m.m108593f(j, "id.shortClassName");
            linkedHashMap.put(next, C26411j.m34004d(j));
        }
        f73670q = linkedHashMap;
        f73671r = C26411j.m34003c(linkedHashMap);
        Set<C26408b> e2 = C110826x0.m151017e(f73663j, f73664k, f73665l, f73666m);
        f73672s = e2;
        int a15 = C90363p0.m113142a(C36907w.m41090l(e2, 10));
        if (a15 >= 16) {
            i = a15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (T next2 : e2) {
            C22830f j2 = ((C26408b) next2).mo53395j();
            C87412m.m108593f(j2, "id.shortClassName");
            linkedHashMap2.put(next2, C26411j.m34004d(j2));
        }
        f73673t = linkedHashMap2;
        f73674u = C26411j.m34003c(linkedHashMap2);
        C22826c cVar2 = f73660g;
        C22830f f = C22830f.m26794f("Continuation");
        if (cVar2 != null) {
            C22826c.m26773j(f);
            C26411j.m34002b("Iterator");
            C26411j.m34002b("Iterable");
            C26411j.m34002b("Collection");
            C26411j.m34002b("List");
            C26411j.m34002b("ListIterator");
            C26411j.m34002b("Set");
            C26408b b = C26411j.m34002b("Map");
            C26411j.m34002b("MutableIterator");
            C26411j.m34002b("MutableIterable");
            C26411j.m34002b("MutableCollection");
            C26411j.m34002b("MutableListIterator");
            C26408b b2 = C26411j.m34002b("MutableMap");
            f73678y = b2;
            b.mo53389d(C22830f.m26794f("Entry"));
            b2.mo53389d(C22830f.m26794f("MutableEntry"));
            C26411j.m34001a("Result");
            C26411j.m34005e("IntRange");
            C26411j.m34005e("LongRange");
            C26411j.m34005e("CharRange");
            C22826c cVar3 = f73659f;
            C22830f f2 = C22830f.m26794f("AnnotationRetention");
            if (cVar3 != null) {
                C22826c.m26773j(f2);
                C22826c.m26773j(C22830f.m26794f("AnnotationTarget"));
                return;
            }
            C26408b.m33989a(3);
            throw null;
        }
        C26408b.m33989a(3);
        throw null;
    }
}
