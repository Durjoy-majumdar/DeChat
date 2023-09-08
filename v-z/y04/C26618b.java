package y04;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;

/* renamed from: y04.b */
public final class C26618b<T> implements C15925h<T>, C112345c<T> {

    /* renamed from: a */
    public final C15925h<T> f74047a;

    /* renamed from: b */
    public final int f74048b;

    /* renamed from: y04.b$a */
    public static final class C26619a implements Iterator<T>, C33145a {

        /* renamed from: d */
        public final Iterator<T> f74049d;

        /* renamed from: e */
        public int f74050e;

        public C26619a(C26618b<T> bVar) {
            this.f74049d = bVar.f74047a.iterator();
            this.f74050e = bVar.f74048b;
        }

        public boolean hasNext() {
            while (this.f74050e > 0 && this.f74049d.hasNext()) {
                this.f74049d.next();
                this.f74050e--;
            }
            return this.f74049d.hasNext();
        }

        public T next() {
            while (this.f74050e > 0 && this.f74049d.hasNext()) {
                this.f74049d.next();
                this.f74050e--;
            }
            return this.f74049d.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C26618b(C15925h<? extends T> hVar, int i) {
        C87412m.m108594g(hVar, "sequence");
        this.f74047a = hVar;
        this.f74048b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public C15925h<T> mo53593a(int i) {
        int i2 = this.f74048b + i;
        return i2 < 0 ? new C26618b(this, i) : new C26618b(this.f74047a, i2);
    }

    public Iterator<T> iterator() {
        return new C26619a(this);
    }
}
