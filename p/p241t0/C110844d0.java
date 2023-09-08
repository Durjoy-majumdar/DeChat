package p241t0;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t0.d0 */
public final class C110844d0<K, V> extends C110845e0<K, V> implements Iterator<Map.Entry<K, V>>, C33145a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110844d0(C110876x<K, V> xVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(xVar, it);
        C87412m.m108594g(xVar, "map");
        C87412m.m108594g(it, "iterator");
    }

    public Object next() {
        mo162457a();
        if (this.f331608g != null) {
            return new C110841c0(this);
        }
        throw new IllegalStateException();
    }
}
