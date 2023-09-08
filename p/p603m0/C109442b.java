package p603m0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p854l0.C109070a;
import p854l0.C109072c;
import sx3.C64177c;

/* renamed from: m0.b */
public abstract class C109442b<E> extends C64177c<E> implements C109072c<E> {

    /* renamed from: m0.b$a */
    public static final class C109443a extends C87413o implements C32226l<E, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Collection<E> f327587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109443a(Collection<? extends E> collection) {
            super(1);
            this.f327587d = collection;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(this.f327587d.contains(obj));
        }
    }

    public C109072c<E> addAll(Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        C109072c.C109073a d = mo160319d();
        d.addAll(collection);
        return d.build();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<E> iterator() {
        return listIterator(0);
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public C109072c<E> remove(E e) {
        int indexOf = indexOf(e);
        return indexOf != -1 ? mo160320n0(indexOf) : this;
    }

    public C109072c<E> removeAll(Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        return mo160315H0(new C109443a(collection));
    }

    public List subList(int i, int i2) {
        return new C109070a.C109071a(this, i, i2);
    }
}
