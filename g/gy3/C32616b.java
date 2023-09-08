package gy3;

import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: gy3.b */
public final class C32616b<T> implements Iterator<T>, C33145a {

    /* renamed from: d */
    public final T[] f86581d;

    /* renamed from: e */
    public int f86582e;

    public C32616b(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        this.f86581d = tArr;
    }

    public boolean hasNext() {
        return this.f86582e < this.f86581d.length;
    }

    public T next() {
        try {
            T[] tArr = this.f86581d;
            int i = this.f86582e;
            this.f86582e = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f86582e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
