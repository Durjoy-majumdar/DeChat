package y04;

import fy3.C32226l;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: y04.u */
public final class C26622u<T> implements C15925h<T> {

    /* renamed from: a */
    public final C15925h<T> f74058a;

    /* renamed from: b */
    public final C32226l<T, Boolean> f74059b;

    /* renamed from: y04.u$a */
    public static final class C26623a implements Iterator<T>, C33145a {

        /* renamed from: d */
        public final Iterator<T> f74060d;

        /* renamed from: e */
        public int f74061e = -1;

        /* renamed from: f */
        public T f74062f;

        /* renamed from: g */
        public final /* synthetic */ C26622u<T> f74063g;

        public C26623a(C26622u<T> uVar) {
            this.f74063g = uVar;
            this.f74060d = uVar.f74058a.iterator();
        }

        /* renamed from: a */
        public final void mo53601a() {
            if (this.f74060d.hasNext()) {
                T next = this.f74060d.next();
                if (this.f74063g.f74059b.invoke(next).booleanValue()) {
                    this.f74061e = 1;
                    this.f74062f = next;
                    return;
                }
            }
            this.f74061e = 0;
        }

        public boolean hasNext() {
            if (this.f74061e == -1) {
                mo53601a();
            }
            return this.f74061e == 1;
        }

        public T next() {
            if (this.f74061e == -1) {
                mo53601a();
            }
            if (this.f74061e != 0) {
                T t = this.f74062f;
                this.f74062f = null;
                this.f74061e = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C26622u(C15925h<? extends T> hVar, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(hVar, "sequence");
        C87412m.m108594g(lVar, "predicate");
        this.f74058a = hVar;
        this.f74059b = lVar;
    }

    public Iterator<T> iterator() {
        return new C26623a(this);
    }
}
