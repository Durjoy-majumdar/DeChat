package sx3;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: sx3.h0 */
public final class C64187h0 implements Set, Serializable, C33145a {

    /* renamed from: d */
    public static final C64187h0 f181908d = new C64187h0();

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C87412m.m108594g((Void) obj, "element");
        return false;
    }

    public boolean containsAll(Collection collection) {
        C87412m.m108594g(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C64184e0.f181906d;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
