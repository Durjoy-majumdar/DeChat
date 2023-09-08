package p412o0;

import gy3.C87412m;
import hy3.C33145a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o0.c */
public class C109826c<E> implements Iterator<E>, C33145a {

    /* renamed from: d */
    public Object f328747d;

    /* renamed from: e */
    public final Map<E, C25312a> f328748e;

    /* renamed from: f */
    public int f328749f;

    public C109826c(Object obj, Map<E, C25312a> map) {
        C87412m.m108594g(map, "map");
        this.f328747d = obj;
        this.f328748e = map;
    }

    public boolean hasNext() {
        return this.f328749f < this.f328748e.size();
    }

    public E next() {
        if (hasNext()) {
            E e = this.f328747d;
            this.f328749f++;
            C25312a aVar = this.f328748e.get(e);
            if (aVar != null) {
                this.f328747d = aVar.f71814b;
                return e;
            }
            throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
