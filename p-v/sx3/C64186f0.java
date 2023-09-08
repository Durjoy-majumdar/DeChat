package sx3;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: sx3.f0 */
public final class C64186f0 implements List, Serializable, RandomAccess, C33145a {

    /* renamed from: d */
    public static final C64186f0 f181907d = new C64186f0();

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
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
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        C87412m.m108594g((Void) obj, "element");
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C64184e0.f181906d;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        C87412m.m108594g((Void) obj, "element");
        return -1;
    }

    public ListIterator listIterator() {
        return C64184e0.f181906d;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
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

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C64184e0.f181906d;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }
}
