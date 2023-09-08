package qp3;

import java.util.Iterator;

/* renamed from: qp3.c */
public class C118198c<T> implements Iterable<T> {

    /* renamed from: d */
    public final Iterable<? extends T> f353337d;

    /* renamed from: e */
    public final C118199a<T> f353338e;

    /* renamed from: qp3.c$a */
    public interface C118199a<T> {
    }

    public C118198c(Iterable<? extends T> iterable, C118199a<T> aVar) {
        this.f353337d = iterable;
        this.f353338e = aVar;
    }

    public Iterator<T> iterator() {
        return new C118200d(this.f353337d.iterator(), this.f353338e);
    }
}
