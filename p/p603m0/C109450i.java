package p603m0;

import java.util.NoSuchElementException;

/* renamed from: m0.i */
public final class C109450i<E> extends C109441a<E> {

    /* renamed from: f */
    public final E f327608f;

    public C109450i(E e, int i) {
        super(i, 1);
        this.f327608f = e;
    }

    public E next() {
        if (hasNext()) {
            this.f327585d++;
            return this.f327608f;
        }
        throw new NoSuchElementException();
    }

    public E previous() {
        if (hasPrevious()) {
            this.f327585d--;
            return this.f327608f;
        }
        throw new NoSuchElementException();
    }
}
