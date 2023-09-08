package sx3;

import fy3.C32226l;
import gy3.C59742g;
import gy3.C87412m;
import gy3.C87413o;
import hy3.C33145a;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: sx3.a */
public abstract class C64173a<E> implements Collection<E>, C33145a {

    /* renamed from: sx3.a$a */
    public static final class C64174a extends C87413o implements C32226l<E, CharSequence> {

        /* renamed from: d */
        public final /* synthetic */ C64173a<E> f181896d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64174a(C64173a<? extends E> aVar) {
            super(1);
            this.f181896d = aVar;
        }

        public Object invoke(Object obj) {
            return obj == this.f181896d ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (Object b : this) {
            if (C87412m.m108589b(b, e)) {
                return true;
            }
        }
        return false;
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

    /* renamed from: f */
    public abstract int mo52189f();

    public boolean isEmpty() {
        return mo52189f() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo52189f();
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public String toString() {
        return C110818d0.m150921S(this, ", ", "[", "]", 0, (CharSequence) null, new C64174a(this), 24, (Object) null);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }
}
