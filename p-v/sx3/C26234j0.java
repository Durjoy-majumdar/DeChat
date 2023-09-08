package sx3;

import fy3.C32224a;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;

/* renamed from: sx3.j0 */
public final class C26234j0<T> implements Iterable<C64188i0<? extends T>>, C33145a {

    /* renamed from: d */
    public final C32224a<Iterator<T>> f73133d;

    public C26234j0(C32224a<? extends Iterator<? extends T>> aVar) {
        C87412m.m108594g(aVar, "iteratorFactory");
        this.f73133d = aVar;
    }

    public Iterator<C64188i0<T>> iterator() {
        return new C26235k0(this.f73133d.invoke());
    }
}
