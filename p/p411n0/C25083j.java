package p411n0;

import gy3.C87412m;
import java.util.Iterator;
import sx3.C26233h;

/* renamed from: n0.j */
public final class C25083j<K, V> extends C26233h<K> {

    /* renamed from: d */
    public final C25079f<K, V> f71517d;

    public C25083j(C25079f<K, V> fVar) {
        C87412m.m108594g(fVar, "builder");
        this.f71517d = fVar;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f71517d.clear();
    }

    public boolean contains(Object obj) {
        return this.f71517d.containsKey(obj);
    }

    /* renamed from: f */
    public int mo52174f() {
        C25079f<K, V> fVar = this.f71517d;
        fVar.getClass();
        return fVar.f71510i;
    }

    public Iterator<K> iterator() {
        return new C25084k(this.f71517d);
    }

    public boolean remove(Object obj) {
        if (!this.f71517d.containsKey(obj)) {
            return false;
        }
        this.f71517d.remove(obj);
        return true;
    }
}
