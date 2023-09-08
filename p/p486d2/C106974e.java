package p486d2;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* renamed from: d2.e */
public final class C106974e implements Collection<C31047d>, C33145a {

    /* renamed from: d */
    public final List<C31047d> f320205d;

    /* renamed from: e */
    public final int f320206e;

    public C106974e(List<C31047d> list) {
        C87412m.m108594g(list, "localeList");
        this.f320205d = list;
        this.f320206e = list.size();
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C31047d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C31047d)) {
            return false;
        }
        C31047d dVar = (C31047d) obj;
        C87412m.m108594g(dVar, "element");
        return this.f320205d.contains(dVar);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return this.f320205d.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C106974e) && C87412m.m108589b(this.f320205d, ((C106974e) obj).f320205d);
    }

    public int hashCode() {
        return this.f320205d.hashCode();
    }

    public boolean isEmpty() {
        return this.f320205d.isEmpty();
    }

    public Iterator<C31047d> iterator() {
        return this.f320205d.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super C31047d> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f320206e;
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f320205d + ')';
    }
}
