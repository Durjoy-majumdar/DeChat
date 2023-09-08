package tx3;

import gy3.C87412m;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import sx3.C26233h;
import tx3.C26317d;

/* renamed from: tx3.h */
public final class C26327h<E> extends C26233h<E> implements Serializable {

    /* renamed from: d */
    public final C26317d<E, ?> f73348d = new C26317d<>();

    public boolean add(E e) {
        return this.f73348d.mo53241a(e) >= 0;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        this.f73348d.mo53242c();
        return super.addAll(collection);
    }

    public void clear() {
        this.f73348d.clear();
    }

    public boolean contains(Object obj) {
        return this.f73348d.containsKey(obj);
    }

    /* renamed from: f */
    public int mo52174f() {
        return this.f73348d.f73335n;
    }

    public boolean isEmpty() {
        return this.f73348d.isEmpty();
    }

    public Iterator<E> iterator() {
        C26317d<E, ?> dVar = this.f73348d;
        dVar.getClass();
        return new C26317d.C26321e(dVar);
    }

    public boolean remove(Object obj) {
        C26317d<E, ?> dVar = this.f73348d;
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
        this.f73348d.mo53242c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        this.f73348d.mo53242c();
        return super.retainAll(collection);
    }
}
