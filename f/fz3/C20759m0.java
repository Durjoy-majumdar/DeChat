package fz3;

import e04.C20506e;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oz3.C21911y;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C110826x0;
import sx3.C36907w;
import sx3.C48501y0;
import sx3.C90363p0;
import sx3.C90364q0;
import vz3.C22830f;

/* renamed from: fz3.m0 */
public class C20759m0 {

    /* renamed from: a */
    public static final C20760a f58649a = new C20760a((C8480h) null);

    /* renamed from: b */
    public static final List<C20760a.C20761a> f58650b;

    /* renamed from: c */
    public static final List<String> f58651c;

    /* renamed from: d */
    public static final Map<C20760a.C20761a, C20763c> f58652d;

    /* renamed from: e */
    public static final Map<String, C20763c> f58653e;

    /* renamed from: f */
    public static final Set<C22830f> f58654f;

    /* renamed from: g */
    public static final Set<String> f58655g;

    /* renamed from: h */
    public static final C20760a.C20761a f58656h;

    /* renamed from: i */
    public static final Map<C20760a.C20761a, C22830f> f58657i;

    /* renamed from: j */
    public static final Map<String, C22830f> f58658j;

    /* renamed from: k */
    public static final List<C22830f> f58659k;

    /* renamed from: l */
    public static final Map<C22830f, C22830f> f58660l;

    /* renamed from: fz3.m0$a */
    public static final class C20760a {

        /* renamed from: fz3.m0$a$a */
        public static final class C20761a {

            /* renamed from: a */
            public final C22830f f58661a;

            /* renamed from: b */
            public final String f58662b;

            public C20761a(C22830f fVar, String str) {
                C87412m.m108594g(fVar, "name");
                C87412m.m108594g(str, "signature");
                this.f58661a = fVar;
                this.f58662b = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20761a)) {
                    return false;
                }
                C20761a aVar = (C20761a) obj;
                return C87412m.m108589b(this.f58661a, aVar.f58661a) && C87412m.m108589b(this.f58662b, aVar.f58662b);
            }

            public int hashCode() {
                return (this.f58661a.hashCode() * 31) + this.f58662b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f58661a + ", signature=" + this.f58662b + ')';
            }
        }

        public C20760a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final C20761a m22709a(C20760a aVar, String str, String str2, String str3, String str4) {
            aVar.getClass();
            C22830f f = C22830f.m26794f(str2);
            String str5 = str2 + '(' + str3 + ')' + str4;
            C87412m.m108594g(str, "internalName");
            C87412m.m108594g(str5, "jvmDescriptor");
            return new C20761a(f, str + '.' + str5);
        }
    }

    /* renamed from: fz3.m0$b */
    public enum C20762b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        /* access modifiers changed from: public */
        C20762b(String str, boolean z) {
        }
    }

    /* renamed from: fz3.m0$c */
    public enum C20763c {
        NULL((String) null),
        INDEX(-1),
        FALSE(Boolean.FALSE);
        

        /* renamed from: d */
        public final Object f58672d;

        /* renamed from: fz3.m0$c$a */
        public static final class C20764a extends C20763c {
            public C20764a(String str, int i) {
                super(str, i, (Object) null);
            }
        }

        /* access modifiers changed from: public */
        C20763c(Object obj) {
            this.f58672d = obj;
        }
    }

    static {
        Set<String> e = C110826x0.m151017e("containsAll", "removeAll", "retainAll");
        ArrayList<C20760a.C20761a> arrayList = new ArrayList<>(C36907w.m41090l(e, 10));
        for (String a : e) {
            C20760a aVar = f58649a;
            String c = C20506e.BOOLEAN.mo32069c();
            C87412m.m108593f(c, "BOOLEAN.desc");
            arrayList.add(C20760a.m22709a(aVar, "java/util/Collection", a, "Ljava/util/Collection;", c));
        }
        f58650b = arrayList;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C20760a.C20761a aVar2 : arrayList) {
            arrayList2.add(aVar2.f58662b);
        }
        f58651c = arrayList2;
        List<C20760a.C20761a> list = f58650b;
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list, 10));
        for (C20760a.C20761a aVar3 : list) {
            arrayList3.add(aVar3.f58661a.mo35995b());
        }
        C21911y yVar = C21911y.f61967a;
        C20760a aVar4 = f58649a;
        String g = yVar.mo34960g("Collection");
        C20506e eVar = C20506e.BOOLEAN;
        String c2 = eVar.mo32069c();
        C87412m.m108593f(c2, "BOOLEAN.desc");
        C20760a.C20761a a2 = C20760a.m22709a(aVar4, g, "contains", "Ljava/lang/Object;", c2);
        C20763c cVar = C20763c.FALSE;
        String g2 = yVar.mo34960g("Collection");
        String c3 = eVar.mo32069c();
        C87412m.m108593f(c3, "BOOLEAN.desc");
        String g3 = yVar.mo34960g("Map");
        String c4 = eVar.mo32069c();
        C87412m.m108593f(c4, "BOOLEAN.desc");
        String g4 = yVar.mo34960g("Map");
        String c5 = eVar.mo32069c();
        C87412m.m108593f(c5, "BOOLEAN.desc");
        String g5 = yVar.mo34960g("Map");
        String c6 = eVar.mo32069c();
        C87412m.m108593f(c6, "BOOLEAN.desc");
        C20760a.C20761a a3 = C20760a.m22709a(aVar4, yVar.mo34960g("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        C20763c cVar2 = C20763c.NULL;
        String g6 = yVar.mo34960g("List");
        C20506e eVar2 = C20506e.INT;
        String c7 = eVar2.mo32069c();
        C87412m.m108593f(c7, "INT.desc");
        C20760a.C20761a a4 = C20760a.m22709a(aVar4, g6, "indexOf", "Ljava/lang/Object;", c7);
        C20763c cVar3 = C20763c.INDEX;
        String g7 = yVar.mo34960g("List");
        String c8 = eVar2.mo32069c();
        C87412m.m108593f(c8, "INT.desc");
        Map<C20760a.C20761a, C20763c> f = C90364q0.m113147f(new C13604l(a2, cVar), new C13604l(C20760a.m22709a(aVar4, g2, "remove", "Ljava/lang/Object;", c3), cVar), new C13604l(C20760a.m22709a(aVar4, g3, "containsKey", "Ljava/lang/Object;", c4), cVar), new C13604l(C20760a.m22709a(aVar4, g4, "containsValue", "Ljava/lang/Object;", c5), cVar), new C13604l(C20760a.m22709a(aVar4, g5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", c6), cVar), new C13604l(C20760a.m22709a(aVar4, yVar.mo34960g("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), C20763c.f58670h), new C13604l(a3, cVar2), new C13604l(C20760a.m22709a(aVar4, yVar.mo34960g("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2), new C13604l(a4, cVar3), new C13604l(C20760a.m22709a(aVar4, g7, "lastIndexOf", "Ljava/lang/Object;", c8), cVar3));
        f58652d = f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C90363p0.m113142a(f.size()));
        for (Map.Entry entry : f.entrySet()) {
            linkedHashMap.put(((C20760a.C20761a) entry.getKey()).f58662b, entry.getValue());
        }
        f58653e = linkedHashMap;
        Set<T> g8 = C48501y0.m53872g(f58652d.keySet(), f58650b);
        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(g8, 10));
        for (T t : g8) {
            arrayList4.add(t.f58661a);
        }
        f58654f = C110818d0.m150904D0(arrayList4);
        ArrayList arrayList5 = new ArrayList(C36907w.m41090l(g8, 10));
        for (T t2 : g8) {
            arrayList5.add(t2.f58662b);
        }
        f58655g = C110818d0.m150904D0(arrayList5);
        C20760a aVar5 = f58649a;
        C20506e eVar3 = C20506e.INT;
        String c9 = eVar3.mo32069c();
        C87412m.m108593f(c9, "INT.desc");
        C20760a.C20761a a5 = C20760a.m22709a(aVar5, "java/util/List", "removeAt", c9, "Ljava/lang/Object;");
        f58656h = a5;
        C21911y yVar2 = C21911y.f61967a;
        String f2 = yVar2.mo34959f("Number");
        String c15 = C20506e.BYTE.mo32069c();
        C87412m.m108593f(c15, "BYTE.desc");
        String f3 = yVar2.mo34959f("Number");
        String c16 = C20506e.SHORT.mo32069c();
        C87412m.m108593f(c16, "SHORT.desc");
        String f4 = yVar2.mo34959f("Number");
        String c17 = eVar3.mo32069c();
        C87412m.m108593f(c17, "INT.desc");
        String f5 = yVar2.mo34959f("Number");
        String c18 = C20506e.LONG.mo32069c();
        C87412m.m108593f(c18, "LONG.desc");
        String f6 = yVar2.mo34959f("Number");
        String c19 = C20506e.FLOAT.mo32069c();
        C87412m.m108593f(c19, "FLOAT.desc");
        String f7 = yVar2.mo34959f("Number");
        String c25 = C20506e.DOUBLE.mo32069c();
        C87412m.m108593f(c25, "DOUBLE.desc");
        String f8 = yVar2.mo34959f("CharSequence");
        String c26 = eVar3.mo32069c();
        C87412m.m108593f(c26, "INT.desc");
        String c27 = C20506e.CHAR.mo32069c();
        C87412m.m108593f(c27, "CHAR.desc");
        Map<C20760a.C20761a, C22830f> f9 = C90364q0.m113147f(new C13604l(C20760a.m22709a(aVar5, f2, "toByte", "", c15), C22830f.m26794f("byteValue")), new C13604l(C20760a.m22709a(aVar5, f3, "toShort", "", c16), C22830f.m26794f("shortValue")), new C13604l(C20760a.m22709a(aVar5, f4, "toInt", "", c17), C22830f.m26794f("intValue")), new C13604l(C20760a.m22709a(aVar5, f5, "toLong", "", c18), C22830f.m26794f("longValue")), new C13604l(C20760a.m22709a(aVar5, f6, "toFloat", "", c19), C22830f.m26794f("floatValue")), new C13604l(C20760a.m22709a(aVar5, f7, "toDouble", "", c25), C22830f.m26794f("doubleValue")), new C13604l(a5, C22830f.m26794f("remove")), new C13604l(C20760a.m22709a(aVar5, f8, "get", c26, c27), C22830f.m26794f("charAt")));
        f58657i = f9;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C90363p0.m113142a(f9.size()));
        for (Map.Entry entry2 : f9.entrySet()) {
            linkedHashMap2.put(((C20760a.C20761a) entry2.getKey()).f58662b, entry2.getValue());
        }
        f58658j = linkedHashMap2;
        Set<C20760a.C20761a> keySet = f58657i.keySet();
        ArrayList arrayList6 = new ArrayList(C36907w.m41090l(keySet, 10));
        for (C20760a.C20761a aVar6 : keySet) {
            arrayList6.add(aVar6.f58661a);
        }
        f58659k = arrayList6;
        Set<Map.Entry<C20760a.C20761a, C22830f>> entrySet = f58657i.entrySet();
        ArrayList<C13604l> arrayList7 = new ArrayList<>(C36907w.m41090l(entrySet, 10));
        for (Map.Entry entry3 : entrySet) {
            arrayList7.add(new C13604l(((C20760a.C20761a) entry3.getKey()).f58661a, entry3.getValue()));
        }
        int a6 = C90363p0.m113142a(C36907w.m41090l(arrayList7, 10));
        if (a6 < 16) {
            a6 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a6);
        for (C13604l lVar : arrayList7) {
            linkedHashMap3.put((C22830f) lVar.f38556e, (C22830f) lVar.f38555d);
        }
        f58660l = linkedHashMap3;
    }
}
