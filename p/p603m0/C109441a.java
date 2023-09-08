package p603m0;

import hy3.C33145a;
import java.util.ListIterator;

/* renamed from: m0.a */
public abstract class C109441a<E> implements ListIterator<E>, C33145a {

    /* renamed from: d */
    public int f327585d;

    /* renamed from: e */
    public int f327586e;

    public C109441a(int i, int i2) {
        this.f327585d = i;
        this.f327586e = i2;
    }

    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return this.f327585d < this.f327586e;
    }

    public boolean hasPrevious() {
        return this.f327585d > 0;
    }

    public int nextIndex() {
        return this.f327585d;
    }

    public int previousIndex() {
        return this.f327585d - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
