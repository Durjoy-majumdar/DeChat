package y04;

import gy3.C87412m;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: y04.a */
public final class C91364a<T> implements C15925h<T> {

    /* renamed from: a */
    public final AtomicReference<C15925h<T>> f262043a;

    public C91364a(C15925h<? extends T> hVar) {
        C87412m.m108594g(hVar, "sequence");
        this.f262043a = new AtomicReference<>(hVar);
    }

    public Iterator<T> iterator() {
        C15925h andSet = this.f262043a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
