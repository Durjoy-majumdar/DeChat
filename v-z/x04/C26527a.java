package x04;

import java.util.Iterator;

/* renamed from: x04.a */
public final class C26527a<E> implements Iterable<E> {

    /* renamed from: g */
    public static final C26527a<Object> f73811g = new C26527a<>();

    /* renamed from: d */
    public final E f73812d;

    /* renamed from: e */
    public final C26527a<E> f73813e;

    /* renamed from: f */
    public final int f73814f;

    /* renamed from: x04.a$a */
    public static class C26528a<E> implements Iterator<E> {

        /* renamed from: d */
        public C26527a<E> f73815d;

        public C26528a(C26527a<E> aVar) {
            this.f73815d = aVar;
        }

        public boolean hasNext() {
            return this.f73815d.f73814f > 0;
        }

        public E next() {
            C26527a<E> aVar = this.f73815d;
            E e = aVar.f73812d;
            this.f73815d = aVar.f73813e;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C26527a() {
        this.f73814f = 0;
        this.f73812d = null;
        this.f73813e = null;
    }

    /* renamed from: f */
    public final C26527a<E> mo53478f(Object obj) {
        if (this.f73814f == 0) {
            return this;
        }
        if (this.f73812d.equals(obj)) {
            return this.f73813e;
        }
        C26527a<E> f = this.f73813e.mo53478f(obj);
        return f == this.f73813e ? this : new C26527a<>(this.f73812d, f);
    }

    /* renamed from: h */
    public final C26527a<E> mo53479h(int i) {
        if (i >= 0 && i <= this.f73814f) {
            return i == 0 ? this : this.f73813e.mo53479h(i - 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator<E> iterator() {
        return new C26528a(mo53479h(0));
    }

    public C26527a(E e, C26527a<E> aVar) {
        this.f73812d = e;
        this.f73813e = aVar;
        this.f73814f = aVar.f73814f + 1;
    }
}
