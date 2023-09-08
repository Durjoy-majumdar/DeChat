package qp3;

import java.util.Iterator;

/* renamed from: qp3.a */
public class C118196a<S, T> implements Iterable<T> {

    /* renamed from: d */
    public final Iterable<? extends S> f353330d;

    /* renamed from: e */
    public final C89789a<S, ? extends T> f353331e;

    /* renamed from: qp3.a$a */
    public interface C89789a<S, T> {
        /* renamed from: a */
        Iterable<? extends T> mo119949a(S s);
    }

    public C118196a(Iterable<? extends S> iterable, C89789a<S, ? extends T> aVar) {
        this.f353330d = iterable;
        this.f353331e = aVar;
    }

    public Iterator<T> iterator() {
        return new C118197b(this.f353330d.iterator(), this.f353331e);
    }
}
