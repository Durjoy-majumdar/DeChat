package y04;

import fy3.C32226l;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: y04.e */
public final class C26620e<T> implements C15925h<T> {

    /* renamed from: a */
    public final C15925h<T> f74051a;

    /* renamed from: b */
    public final boolean f74052b;

    /* renamed from: c */
    public final C32226l<T, Boolean> f74053c;

    /* renamed from: y04.e$a */
    public static final class C26621a implements Iterator<T>, C33145a {

        /* renamed from: d */
        public final Iterator<T> f74054d;

        /* renamed from: e */
        public int f74055e = -1;

        /* renamed from: f */
        public T f74056f;

        /* renamed from: g */
        public final /* synthetic */ C26620e<T> f74057g;

        public C26621a(C26620e<T> eVar) {
            this.f74057g = eVar;
            this.f74054d = eVar.f74051a.iterator();
        }

        /* renamed from: a */
        public final void mo53597a() {
            while (this.f74054d.hasNext()) {
                T next = this.f74054d.next();
                if (this.f74057g.f74053c.invoke(next).booleanValue() == this.f74057g.f74052b) {
                    this.f74056f = next;
                    this.f74055e = 1;
                    return;
                }
            }
            this.f74055e = 0;
        }

        public boolean hasNext() {
            if (this.f74055e == -1) {
                mo53597a();
            }
            return this.f74055e == 1;
        }

        public T next() {
            if (this.f74055e == -1) {
                mo53597a();
            }
            if (this.f74055e != 0) {
                T t = this.f74056f;
                this.f74056f = null;
                this.f74055e = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C26620e(C15925h<? extends T> hVar, boolean z, C32226l<? super T, Boolean> lVar) {
        C87412m.m108594g(hVar, "sequence");
        C87412m.m108594g(lVar, "predicate");
        this.f74051a = hVar;
        this.f74052b = z;
        this.f74053c = lVar;
    }

    public Iterator<T> iterator() {
        return new C26621a(this);
    }
}
