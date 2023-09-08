package sx3;

import gy3.C32617c;
import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: sx3.j */
public final class C64189j<T> implements Collection<T>, C33145a {

    /* renamed from: d */
    public final T[] f181911d;

    /* renamed from: e */
    public final boolean f181912e;

    public C64189j(T[] tArr, boolean z) {
        C87412m.m108594g(tArr, "values");
        this.f181911d = tArr;
        this.f181912e = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C110823p.m151009y(this.f181911d, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f181911d.length == 0;
    }

    public Iterator<T> iterator() {
        return C32617c.m39769a(this.f181911d);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f181911d.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f181911d;
        boolean z = this.f181912e;
        Class<Object[]> cls = Object[].class;
        C87412m.m108594g(tArr, "<this>");
        if (z && C87412m.m108589b(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C87412m.m108593f(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }
}
