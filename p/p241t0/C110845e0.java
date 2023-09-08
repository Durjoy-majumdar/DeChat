package p241t0;

import gy3.C87412m;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: t0.e0 */
public abstract class C110845e0<K, V> {

    /* renamed from: d */
    public final C110876x<K, V> f331605d;

    /* renamed from: e */
    public final Iterator<Map.Entry<K, V>> f331606e;

    /* renamed from: f */
    public int f331607f;

    /* renamed from: g */
    public Map.Entry<? extends K, ? extends V> f331608g;

    /* renamed from: h */
    public Map.Entry<? extends K, ? extends V> f331609h;

    public C110845e0(C110876x<K, V> xVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        C87412m.m108594g(xVar, "map");
        C87412m.m108594g(it, "iterator");
        this.f331605d = xVar;
        this.f331606e = it;
        this.f331607f = xVar.mo162570a().f331670d;
        mo162457a();
    }

    /* renamed from: a */
    public final void mo162457a() {
        this.f331608g = this.f331609h;
        this.f331609h = this.f331606e.hasNext() ? this.f331606e.next() : null;
    }

    public final boolean hasNext() {
        return this.f331609h != null;
    }

    public final void remove() {
        if (this.f331605d.mo162570a().f331670d == this.f331607f) {
            Map.Entry<? extends K, ? extends V> entry = this.f331608g;
            if (entry != null) {
                this.f331605d.remove(entry.getKey());
                this.f331608g = null;
                C13598b0 b0Var = C13598b0.f38549a;
                this.f331607f = this.f331605d.mo162570a().f331670d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
