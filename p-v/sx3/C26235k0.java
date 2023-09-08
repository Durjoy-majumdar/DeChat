package sx3;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;

/* renamed from: sx3.k0 */
public final class C26235k0<T> implements Iterator<C64188i0<? extends T>>, C33145a {

    /* renamed from: d */
    public final Iterator<T> f73134d;

    /* renamed from: e */
    public int f73135e;

    public C26235k0(Iterator<? extends T> it) {
        C87412m.m108594g(it, "iterator");
        this.f73134d = it;
    }

    public final boolean hasNext() {
        return this.f73134d.hasNext();
    }

    public Object next() {
        int i = this.f73135e;
        this.f73135e = i + 1;
        if (i >= 0) {
            return new C64188i0(i, this.f73134d.next());
        }
        C64197v.m75542k();
        throw null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
