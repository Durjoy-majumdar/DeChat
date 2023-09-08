package t04;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: t04.p */
public final class C26274p<T> extends C26253c<T> {

    /* renamed from: d */
    public final T f73206d;

    /* renamed from: e */
    public final int f73207e;

    /* renamed from: t04.p$a */
    public static final class C26275a implements Iterator<T>, C33145a {

        /* renamed from: d */
        public boolean f73208d = true;

        /* renamed from: e */
        public final /* synthetic */ C26274p<T> f73209e;

        public C26275a(C26274p<T> pVar) {
            this.f73209e = pVar;
        }

        public boolean hasNext() {
            return this.f73208d;
        }

        public T next() {
            if (this.f73208d) {
                this.f73208d = false;
                return this.f73209e.f73206d;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C26274p(T t, int i) {
        C87412m.m108594g(t, "value");
        this.f73206d = t;
        this.f73207e = i;
    }

    /* renamed from: f */
    public int mo53152f() {
        return 1;
    }

    public T get(int i) {
        if (i == this.f73207e) {
            return this.f73206d;
        }
        return null;
    }

    /* renamed from: i */
    public void mo53154i(int i, T t) {
        C87412m.m108594g(t, "value");
        throw new IllegalStateException();
    }

    public Iterator<T> iterator() {
        return new C26275a(this);
    }
}
