package p398x9;

import java.util.Iterator;

/* renamed from: x9.o */
public abstract class C23065o<F, T> implements Iterator<T> {

    /* renamed from: d */
    public Iterator<? extends F> f66277d;

    public C23065o(Iterator<? extends F> it) {
        it.getClass();
        this.f66277d = it;
    }

    public final boolean hasNext() {
        return this.f66277d.hasNext();
    }

    public final T next() {
        return ((C23055j) this).f66270e.apply(this.f66277d.next());
    }

    public final void remove() {
        this.f66277d.remove();
    }
}
