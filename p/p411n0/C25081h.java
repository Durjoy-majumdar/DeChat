package p411n0;

import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;

/* renamed from: n0.h */
public final class C25081h<K, V> extends C25075a<Map.Entry<K, V>, K, V> {

    /* renamed from: d */
    public final C25079f<K, V> f71515d;

    public C25081h(C25079f<K, V> fVar) {
        C87412m.m108594g(fVar, "builder");
        this.f71515d = fVar;
    }

    public boolean add(Object obj) {
        C87412m.m108594g((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f71515d.clear();
    }

    /* renamed from: f */
    public int mo52174f() {
        C25079f<K, V> fVar = this.f71515d;
        fVar.getClass();
        return fVar.f71510i;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C25082i(this.f71515d);
    }
}
