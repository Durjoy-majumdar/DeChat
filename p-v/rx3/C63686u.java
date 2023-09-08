package rx3;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import sx3.C110823p;

/* renamed from: rx3.u */
public final class C63686u implements Collection<C63685t>, C33145a {

    /* renamed from: d */
    public final int[] f180542d;

    /* renamed from: rx3.u$a */
    public static final class C63687a implements Iterator<C63685t>, C33145a {

        /* renamed from: d */
        public final int[] f180543d;

        /* renamed from: e */
        public int f180544e;

        public C63687a(int[] iArr) {
            C87412m.m108594g(iArr, "array");
            this.f180543d = iArr;
        }

        public boolean hasNext() {
            return this.f180544e < this.f180543d.length;
        }

        public Object next() {
            int i = this.f180544e;
            int[] iArr = this.f180543d;
            if (i < iArr.length) {
                this.f180544e = i + 1;
                return new C63685t(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f180544e));
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C63686u(int[] iArr) {
        this.f180542d = iArr;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C63685t> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C63685t)) {
            return false;
        }
        return C110823p.m151008x(this.f180542d, ((C63685t) obj).f180541d);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        boolean z;
        C87412m.m108594g(collection, "elements");
        int[] iArr = this.f180542d;
        if (collection.isEmpty()) {
            return true;
        }
        for (T next : collection) {
            if (!(next instanceof C63685t) || !C110823p.m151008x(iArr, ((C63685t) next).f180541d)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C63686u) && C87412m.m108589b(this.f180542d, ((C63686u) obj).f180542d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f180542d);
    }

    public boolean isEmpty() {
        return this.f180542d.length == 0;
    }

    public Iterator<C63685t> iterator() {
        return new C63687a(this.f180542d);
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

    public int size() {
        return this.f180542d.length;
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public String toString() {
        int[] iArr = this.f180542d;
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }
}
