package tx3;

import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import sx3.C26233h;
import tx3.C26317d;

/* renamed from: tx3.f */
public final class C26325f<E> extends C26233h<E> {

    /* renamed from: d */
    public final C26317d<E, ?> f73346d;

    public C26325f(C26317d<E, ?> dVar) {
        C87412m.m108594g(dVar, "backing");
        this.f73346d = dVar;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f73346d.clear();
    }

    public boolean contains(Object obj) {
        return this.f73346d.containsKey(obj);
    }

    /* renamed from: f */
    public int mo52174f() {
        return this.f73346d.f73335n;
    }

    public boolean isEmpty() {
        return this.f73346d.isEmpty();
    }

    public Iterator<E> iterator() {
        C26317d<E, ?> dVar = this.f73346d;
        dVar.getClass();
        return new C26317d.C26321e(dVar);
    }

    public boolean remove(Object obj) {
        C26317d<E, ?> dVar = this.f73346d;
        dVar.mo53242c();
        int i = dVar.mo53253i(obj);
        if (i < 0) {
            i = -1;
        } else {
            dVar.mo53258l(i);
        }
        return i >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        this.f73346d.mo53242c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        this.f73346d.mo53242c();
        return super.retainAll(collection);
    }
}
