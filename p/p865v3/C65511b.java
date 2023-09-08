package p865v3;

import gy3.C87412m;
import java.util.ArrayDeque;
import java.util.Collection;
import p865v3.C65512c;

/* renamed from: v3.b */
public final class C65511b<T> implements C65510a<T> {

    /* renamed from: a */
    public final ArrayDeque<C65512c.C65520c.C65522b.C65525c<T>> f188493a;

    /* renamed from: b */
    public final int f188494b;

    public C65511b(int i) {
        this.f188494b = i;
        this.f188493a = new ArrayDeque<>(i > 10 ? 10 : i);
    }

    /* renamed from: a */
    public void mo89621a(C65512c.C65520c.C65522b.C65525c<T> cVar) {
        C87412m.m108594g(cVar, "item");
        while (this.f188493a.size() >= this.f188494b) {
            this.f188493a.pollFirst();
        }
        this.f188493a.offerLast(cVar);
    }

    public Collection getItems() {
        return this.f188493a;
    }

    public boolean isEmpty() {
        return ((ArrayDeque) getItems()).isEmpty();
    }
}
