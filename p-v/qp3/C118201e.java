package qp3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import qp3.C118196a;

/* renamed from: qp3.e */
public class C118201e<T> implements Iterable<T> {

    /* renamed from: e */
    public static final C118203b<?> f353343e = new C118203b<>((C118202a) null);

    /* renamed from: d */
    public final List<Iterable<? extends T>> f353344d;

    /* renamed from: qp3.e$b */
    public static final class C118203b<T> implements C118196a.C89789a<Iterable<? extends T>, T> {
        public C118203b(C118202a aVar) {
        }

        /* renamed from: a */
        public Iterable mo119949a(Object obj) {
            return (Iterable) obj;
        }
    }

    @SafeVarargs
    public C118201e(Iterable<? extends T>... iterableArr) {
        this.f353344d = Arrays.asList(iterableArr);
    }

    public Iterator<T> iterator() {
        return new C118197b(this.f353344d.iterator(), f353343e);
    }
}
