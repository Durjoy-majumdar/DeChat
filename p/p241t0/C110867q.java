package p241t0;

import gy3.C87412m;
import hy3.C108274e;
import hy3.C33145a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p241t0.C110876x;
import p854l0.C109074d;
import p854l0.C61177b;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C90363p0;

/* renamed from: t0.q */
public final class C110867q<K, V> extends C110869s<K, V, Map.Entry<K, V>> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110867q(C110876x<K, V> xVar) {
        super(xVar);
        C87412m.m108594g(xVar, "map");
    }

    public boolean add(Object obj) {
        C87412m.m108594g((Map.Entry) obj, "element");
        C110878y.m151177a();
        throw null;
    }

    public boolean addAll(Collection collection) {
        C87412m.m108594g(collection, "elements");
        C110878y.m151177a();
        throw null;
    }

    public final boolean contains(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof C33145a) || (obj instanceof C108274e.C108275a)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, "element");
        return C87412m.m108589b(this.f331659d.get(entry.getKey()), entry.getValue());
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C110876x<K, V> xVar = this.f331659d;
        return new C110844d0(xVar, ((C61177b) xVar.mo162570a().f331669c.entrySet()).iterator());
    }

    public final boolean remove(Object obj) {
        if (!((obj instanceof Map.Entry) && (!(obj instanceof C33145a) || (obj instanceof C108274e.C108275a)))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, "element");
        return this.f331659d.remove(entry.getKey()) != null;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (this.f331659d.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C109074d<K, ? extends V> dVar;
        int i;
        boolean z;
        C110849h i2;
        C87412m.m108594g(collection, "elements");
        int a = C90363p0.m113142a(C36907w.m41090l(collection, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C110876x<K, V> xVar = this.f331659d;
        boolean z2 = false;
        do {
            synchronized (C110878y.f331671a) {
                C110876x.C110877a aVar = (C110876x.C110877a) C110865n.m151145h((C110876x.C110877a) xVar.f331665d, C110865n.m151146i());
                dVar = aVar.f331669c;
                i = aVar.f331670d;
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C87412m.m108591d(dVar);
            C109074d.C109075a<K, ? extends V> d = dVar.mo52154d();
            Iterator it4 = ((C110867q) xVar.f331666e).iterator();
            z = true;
            while (((C110845e0) it4).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((C110844d0) it4).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !C87412m.m108589b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    d.remove(entry2.getKey());
                    z2 = true;
                }
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
            C109074d<K, ? extends V> build = d.build();
            if (C87412m.m108589b(build, dVar)) {
                break;
            }
            synchronized (C110878y.f331671a) {
                C110876x.C110877a aVar2 = (C110876x.C110877a) xVar.f331665d;
                synchronized (C110865n.f331651c) {
                    i2 = C110865n.m151146i();
                    C110876x.C110877a aVar3 = (C110876x.C110877a) C110865n.m151158u(aVar2, xVar, i2);
                    if (aVar3.f331670d == i) {
                        aVar3.mo162583c(build);
                        aVar3.f331670d++;
                    } else {
                        z = false;
                    }
                }
                C110865n.m151150m(i2, xVar);
            }
        } while (!z);
        return z2;
    }
}
