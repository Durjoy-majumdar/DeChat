package qp3;

import java.util.Iterator;

/* renamed from: qp3.h */
public class C118207h<T> implements Iterable<T> {

    /* renamed from: d */
    public final Iterable<? extends T> f353353d;

    /* renamed from: e */
    public final C118208a f353354e;

    /* renamed from: qp3.h$a */
    public interface C118208a {
        /* renamed from: h */
        void mo177698h();
    }

    public C118207h(Iterable<? extends T> iterable, C118208a aVar) {
        this.f353353d = iterable;
        this.f353354e = aVar;
    }

    public Iterator<T> iterator() {
        return new C118209i(this.f353353d.iterator(), this.f353354e);
    }
}
