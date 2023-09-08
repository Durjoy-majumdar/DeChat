package y04;

import fy3.C32226l;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;

/* renamed from: y04.v */
public final class C66488v<T, R> implements C15925h<R> {

    /* renamed from: a */
    public final C15925h<T> f191269a;

    /* renamed from: b */
    public final C32226l<T, R> f191270b;

    /* renamed from: y04.v$a */
    public static final class C66489a implements Iterator<R>, C33145a {

        /* renamed from: d */
        public final Iterator<T> f191271d;

        /* renamed from: e */
        public final /* synthetic */ C66488v<T, R> f191272e;

        public C66489a(C66488v<T, R> vVar) {
            this.f191272e = vVar;
            this.f191271d = vVar.f191269a.iterator();
        }

        public boolean hasNext() {
            return this.f191271d.hasNext();
        }

        public R next() {
            return this.f191272e.f191270b.invoke(this.f191271d.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C66488v(C15925h<? extends T> hVar, C32226l<? super T, ? extends R> lVar) {
        C87412m.m108594g(hVar, "sequence");
        C87412m.m108594g(lVar, "transformer");
        this.f191269a = hVar;
        this.f191270b = lVar;
    }

    public Iterator<R> iterator() {
        return new C66489a(this);
    }
}
