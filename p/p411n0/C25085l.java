package p411n0;

import gy3.C87412m;
import java.util.Iterator;
import sx3.C22413e;

/* renamed from: n0.l */
public final class C25085l<K, V> extends C22413e<V> {

    /* renamed from: d */
    public final C25079f<K, V> f71518d;

    public C25085l(C25079f<K, V> fVar) {
        C87412m.m108594g(fVar, "builder");
        this.f71518d = fVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f71518d.clear();
    }

    public boolean contains(Object obj) {
        return this.f71518d.containsValue(obj);
    }

    /* renamed from: f */
    public int mo35566f() {
        C25079f<K, V> fVar = this.f71518d;
        fVar.getClass();
        return fVar.f71510i;
    }

    public Iterator<V> iterator() {
        return new C25086m(this.f71518d);
    }
}
