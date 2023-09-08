package p225rc;

import gy3.C87412m;
import hy3.C33145a;
import java.util.ListIterator;

/* renamed from: rc.f */
public class C89915f<T> implements ListIterator<T>, C33145a {

    /* renamed from: d */
    public final ListIterator<T> f258375d;

    public C89915f(ListIterator<? extends T> listIterator) {
        C87412m.m108594g(listIterator, "target");
        this.f258375d = listIterator;
    }

    public void add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return this.f258375d.hasNext();
    }

    public boolean hasPrevious() {
        return this.f258375d.hasPrevious();
    }

    public int nextIndex() {
        return this.f258375d.nextIndex();
    }

    public T previous() {
        return this.f258375d.previous();
    }

    public int previousIndex() {
        return this.f258375d.previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
