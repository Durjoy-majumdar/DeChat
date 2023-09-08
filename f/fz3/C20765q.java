package fz3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;
import vz3.C22826c;
import vz3.C26408b;
import vz3.C26410i;

/* renamed from: fz3.q */
public final class C20765q {

    /* renamed from: a */
    public static final Map<C26408b, C26408b> f58673a;

    /* renamed from: b */
    public static final Map<C22826c, C22826c> f58674b;

    static {
        C20765q qVar = new C20765q();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f58673a = linkedHashMap;
        qVar.mo32452b(C26410i.f73676w, qVar.mo32451a("java.util.ArrayList", "java.util.LinkedList"));
        qVar.mo32452b(C26410i.f73677x, qVar.mo32451a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        qVar.mo32452b(C26410i.f73678y, qVar.mo32451a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        qVar.mo32452b(C26408b.m33992l(new C22826c("java.util.function.Function")), qVar.mo32451a("java.util.function.UnaryOperator"));
        qVar.mo32452b(C26408b.m33992l(new C22826c("java.util.function.BiFunction")), qVar.mo32451a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C13604l(((C26408b) entry.getKey()).mo53387b(), ((C26408b) entry.getValue()).mo53387b()));
        }
        f58674b = C90364q0.m113152k(arrayList);
    }

    /* renamed from: a */
    public final List<C26408b> mo32451a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String cVar : strArr) {
            arrayList.add(C26408b.m33992l(new C22826c(cVar)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo32452b(C26408b bVar, List<C26408b> list) {
        Map<C26408b, C26408b> map = f58673a;
        for (T next : list) {
            C26408b bVar2 = (C26408b) next;
            map.put(next, bVar);
        }
    }
}
