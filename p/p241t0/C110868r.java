package p241t0;

import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p241t0.C110876x;
import p854l0.C109074d;
import p854l0.C61177b;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: t0.r */
public final class C110868r<K, V> extends C110869s<K, V, K> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110868r(C110876x<K, V> xVar) {
        super(xVar);
        C87412m.m108594g(xVar, "map");
    }

    public boolean add(Object obj) {
        C110878y.m151177a();
        throw null;
    }

    public boolean addAll(Collection collection) {
        C87412m.m108594g(collection, "elements");
        C110878y.m151177a();
        throw null;
    }

    public boolean contains(Object obj) {
        return this.f331659d.containsKey(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f331659d.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator iterator() {
        C110876x<K, V> xVar = this.f331659d;
        return new C110847f0(xVar, ((C61177b) xVar.mo162570a().f331669c.entrySet()).iterator());
    }

    public boolean remove(Object obj) {
        return this.f331659d.remove(obj) != null;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (this.f331659d.remove(it.next()) != null || z) {
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
        Set<T> D0 = C110818d0.m150904D0(collection);
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
            Iterator it = ((C110867q) xVar.f331666e).iterator();
            z = true;
            while (((C110845e0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C110844d0) it).next();
                if (!D0.contains(entry.getKey())) {
                    d.remove(entry.getKey());
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
