package p241t0;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C108276f;
import java.util.Set;

/* renamed from: t0.s */
public abstract class C110869s<K, V, E> implements Set<E>, C108276f {

    /* renamed from: d */
    public final C110876x<K, V> f331659d;

    public C110869s(C110876x<K, V> xVar) {
        C87412m.m108594g(xVar, "map");
        this.f331659d = xVar;
    }

    public void clear() {
        this.f331659d.clear();
    }

    public boolean isEmpty() {
        return this.f331659d.isEmpty();
    }

    public final int size() {
        return this.f331659d.size();
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }
}
