package tx3;

import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import tx3.C26317d;

/* renamed from: tx3.e */
public final class C26324e<K, V> extends C26313a<Map.Entry<K, V>, K, V> {

    /* renamed from: d */
    public final C26317d<K, V> f73345d;

    public C26324e(C26317d<K, V> dVar) {
        C87412m.m108594g(dVar, "backing");
        this.f73345d = dVar;
    }

    public boolean add(Object obj) {
        C87412m.m108594g((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C87412m.m108594g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f73345d.clear();
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return this.f73345d.mo53246e(collection);
    }

    /* renamed from: f */
    public int mo52174f() {
        return this.f73345d.f73335n;
    }

    public boolean isEmpty() {
        return this.f73345d.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C26317d<K, V> dVar = this.f73345d;
        dVar.getClass();
        return new C26317d.C26318b(dVar);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        this.f73345d.mo53242c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        this.f73345d.mo53242c();
        return super.retainAll(collection);
    }
}
