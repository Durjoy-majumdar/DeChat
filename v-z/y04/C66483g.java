package y04;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: y04.g */
public final class C66483g<T> implements C15925h<T> {

    /* renamed from: a */
    public final C32224a<T> f191260a;

    /* renamed from: b */
    public final C32226l<T, T> f191261b;

    /* renamed from: y04.g$a */
    public static final class C66484a implements Iterator<T>, C33145a {

        /* renamed from: d */
        public T f191262d;

        /* renamed from: e */
        public int f191263e = -2;

        /* renamed from: f */
        public final /* synthetic */ C66483g<T> f191264f;

        public C66484a(C66483g<T> gVar) {
            this.f191264f = gVar;
        }

        /* renamed from: a */
        public final void mo90567a() {
            T t;
            if (this.f191263e == -2) {
                t = this.f191264f.f191260a.invoke();
            } else {
                C32226l<T, T> lVar = this.f191264f.f191261b;
                T t2 = this.f191262d;
                C87412m.m108591d(t2);
                t = lVar.invoke(t2);
            }
            this.f191262d = t;
            this.f191263e = t == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f191263e < 0) {
                mo90567a();
            }
            return this.f191263e == 1;
        }

        public T next() {
            if (this.f191263e < 0) {
                mo90567a();
            }
            if (this.f191263e != 0) {
                T t = this.f191262d;
                C87412m.m108592e(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f191263e = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C66483g(C32224a<? extends T> aVar, C32226l<? super T, ? extends T> lVar) {
        C87412m.m108594g(aVar, "getInitialValue");
        C87412m.m108594g(lVar, "getNextValue");
        this.f191260a = aVar;
        this.f191261b = lVar;
    }

    public Iterator<T> iterator() {
        return new C66484a(this);
    }
}
