package qp3;

import java.util.Iterator;

/* renamed from: qp3.f */
public class C118204f<S, T> implements Iterable<T> {

    /* renamed from: d */
    public final Iterable<? extends S> f353345d;

    /* renamed from: e */
    public final C118205a<S, T> f353346e;

    /* renamed from: f */
    public final boolean f353347f;

    /* renamed from: qp3.f$a */
    public interface C118205a<S, T> {
        /* renamed from: f */
        T mo105957f(S s);
    }

    public C118204f(Iterable<? extends S> iterable, C118205a<S, T> aVar) {
        this.f353345d = iterable;
        this.f353346e = aVar;
        this.f353347f = true;
    }

    public Iterator<T> iterator() {
        return new C118206g(this.f353345d.iterator(), this.f353346e, this.f353347f);
    }

    public C118204f(Iterable<? extends S> iterable, C118205a<S, T> aVar, boolean z) {
        this.f353345d = iterable;
        this.f353346e = aVar;
        this.f353347f = z;
    }
}
