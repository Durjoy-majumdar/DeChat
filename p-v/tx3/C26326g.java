package tx3;

import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import sx3.C22413e;
import tx3.C26317d;

/* renamed from: tx3.g */
public final class C26326g<V> extends C22413e<V> {

    /* renamed from: d */
    public final C26317d<?, V> f73347d;

    public C26326g(C26317d<?, V> dVar) {
        C87412m.m108594g(dVar, "backing");
        this.f73347d = dVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        C87412m.m108594g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f73347d.clear();
    }

    public boolean contains(Object obj) {
        return this.f73347d.containsValue(obj);
    }

    /* renamed from: f */
    public int mo35566f() {
        return this.f73347d.f73335n;
    }

    public boolean isEmpty() {
        return this.f73347d.isEmpty();
    }

    public Iterator<V> iterator() {
        C26317d<?, V> dVar = this.f73347d;
        dVar.getClass();
        return new C26317d.C26322f(dVar);
    }

    public boolean remove(Object obj) {
        int i;
        C26317d<?, V> dVar = this.f73347d;
        dVar.mo53242c();
        int i2 = dVar.f73333i;
        while (true) {
            i = -1;
            i2--;
            if (i2 < 0) {
                break;
            } else if (dVar.f73330f[i2] >= 0) {
                V[] vArr = dVar.f73329e;
                C87412m.m108591d(vArr);
                if (C87412m.m108589b(vArr[i2], obj)) {
                    i = i2;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        dVar.mo53258l(i);
        return true;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        this.f73347d.mo53242c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        this.f73347d.mo53242c();
        return super.retainAll(collection);
    }
}
