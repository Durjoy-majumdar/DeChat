package u60;

import gy3.C87412m;
import java.util.Queue;

/* renamed from: u60.k */
public final class C65232k<A, B> {

    /* renamed from: a */
    public final A f187766a;

    /* renamed from: b */
    public Queue<B> f187767b;

    public C65232k(A a, Queue<B> queue) {
        C87412m.m108594g(queue, "second");
        this.f187766a = a;
        this.f187767b = queue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65232k)) {
            return false;
        }
        C65232k kVar = (C65232k) obj;
        return C87412m.m108589b(this.f187766a, kVar.f187766a) && C87412m.m108589b(this.f187767b, kVar.f187767b);
    }

    public int hashCode() {
        A a = this.f187766a;
        return ((a == null ? 0 : a.hashCode()) * 31) + this.f187767b.hashCode();
    }

    public String toString() {
        return "LoaderPair(first=" + this.f187766a + ", second=" + this.f187767b + ')';
    }
}
