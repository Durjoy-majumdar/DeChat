package y04;

import fy3.C32226l;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: y04.f */
public final class C91365f<T, R, E> implements C15925h<E> {

    /* renamed from: a */
    public final C15925h<T> f262044a;

    /* renamed from: b */
    public final C32226l<T, R> f262045b;

    /* renamed from: c */
    public final C32226l<R, Iterator<E>> f262046c;

    /* renamed from: y04.f$a */
    public static final class C91366a implements Iterator<E>, C33145a {

        /* renamed from: d */
        public final Iterator<T> f262047d;

        /* renamed from: e */
        public Iterator<? extends E> f262048e;

        /* renamed from: f */
        public final /* synthetic */ C91365f<T, R, E> f262049f;

        public C91366a(C91365f<T, R, E> fVar) {
            this.f262049f = fVar;
            this.f262047d = fVar.f262044a.iterator();
        }

        /* renamed from: a */
        public final boolean mo125334a() {
            Iterator<? extends E> it = this.f262048e;
            if (it != null && !it.hasNext()) {
                this.f262048e = null;
            }
            while (true) {
                if (this.f262048e == null) {
                    if (this.f262047d.hasNext()) {
                        T next = this.f262047d.next();
                        C91365f<T, R, E> fVar = this.f262049f;
                        Iterator<? extends E> invoke = fVar.f262046c.invoke(fVar.f262045b.invoke(next));
                        if (invoke.hasNext()) {
                            this.f262048e = invoke;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return mo125334a();
        }

        public E next() {
            if (mo125334a()) {
                Iterator<? extends E> it = this.f262048e;
                C87412m.m108591d(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C91365f(C15925h<? extends T> hVar, C32226l<? super T, ? extends R> lVar, C32226l<? super R, ? extends Iterator<? extends E>> lVar2) {
        C87412m.m108594g(hVar, "sequence");
        C87412m.m108594g(lVar, "transformer");
        C87412m.m108594g(lVar2, "iterator");
        this.f262044a = hVar;
        this.f262045b = lVar;
        this.f262046c = lVar2;
    }

    public Iterator<E> iterator() {
        return new C91366a(this);
    }
}
