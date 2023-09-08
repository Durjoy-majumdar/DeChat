package p451b2;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: b2.m */
public final class C54399m extends C54396g implements List<C54397h>, C33145a {
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C54397h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C54397h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C54397h)) {
            return false;
        }
        C87412m.m108594g((C54397h) obj, "element");
        throw null;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54399m)) {
            return false;
        }
        ((C54399m) obj).getClass();
        return C87412m.m108589b((Object) null, (Object) null);
    }

    public Object get(int i) {
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof C54397h)) {
            return -1;
        }
        C87412m.m108594g((C54397h) obj, "element");
        throw null;
    }

    public boolean isEmpty() {
        throw null;
    }

    public Iterator<C54397h> iterator() {
        throw null;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C54397h)) {
            return -1;
        }
        C87412m.m108594g((C54397h) obj, "element");
        throw null;
    }

    public ListIterator<C54397h> listIterator() {
        throw null;
    }

    public ListIterator<C54397h> listIterator(int i) {
        throw null;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C54397h> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        throw null;
    }

    public void sort(Comparator<? super C54397h> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C54397h> subList(int i, int i2) {
        throw null;
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public String toString() {
        return "FontListFontFamily(fonts=null)";
    }
}
