package qp3;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qp3.C118196a;

/* renamed from: qp3.b */
public class C118197b<S, T> implements Iterator<T> {

    /* renamed from: d */
    public final Iterator<? extends S> f353332d;

    /* renamed from: e */
    public final C118196a.C89789a<S, ? extends T> f353333e;

    /* renamed from: f */
    public Iterator<? extends T> f353334f = Collections.emptyList().iterator();

    /* renamed from: g */
    public T f353335g;

    /* renamed from: h */
    public boolean f353336h;

    public C118197b(Iterator<? extends S> it, C118196a.C89789a<S, ? extends T> aVar) {
        this.f353332d = it;
        this.f353333e = aVar;
    }

    public boolean hasNext() {
        if (this.f353336h) {
            return true;
        }
        if (this.f353334f == null) {
            return false;
        }
        while (!this.f353334f.hasNext()) {
            this.f353335g = null;
            this.f353334f = null;
            if (!this.f353332d.hasNext()) {
                return false;
            }
            Iterable<? extends Object> a = this.f353333e.mo119949a(this.f353332d.next());
            this.f353334f = a != null ? a.iterator() : Collections.emptyList().iterator();
        }
        this.f353335g = this.f353334f.next();
        this.f353336h = true;
        return true;
    }

    public T next() {
        if (this.f353336h || hasNext()) {
            T t = this.f353335g;
            this.f353335g = null;
            this.f353336h = false;
            return t;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
