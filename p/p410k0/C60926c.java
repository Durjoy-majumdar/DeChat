package p410k0;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import sx3.C110821n;

/* renamed from: k0.c */
public final class C60926c<T> implements Set<T>, C33145a {

    /* renamed from: d */
    public int f173545d;

    /* renamed from: e */
    public Object[] f173546e = new Object[16];

    /* renamed from: k0.c$a */
    public static final class C60927a implements Iterator<T>, C33145a {

        /* renamed from: d */
        public int f173547d;

        /* renamed from: e */
        public final /* synthetic */ C60926c<T> f173548e;

        public C60927a(C60926c<T> cVar) {
            this.f173548e = cVar;
        }

        public boolean hasNext() {
            return this.f173547d < this.f173548e.f173545d;
        }

        public T next() {
            T[] tArr = this.f173548e.f173546e;
            int i = this.f173547d;
            this.f173547d = i + 1;
            T t = tArr[i];
            if (t != null) {
                return t;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean add(T t) {
        int i;
        C87412m.m108594g(t, "value");
        if (this.f173545d > 0) {
            i = mo85840f(t);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.f173545d;
        Object[] objArr = this.f173546e;
        if (i3 == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            C110821n.m150963j(objArr, objArr2, i2 + 1, i2, i3);
            C110821n.m150966m(this.f173546e, objArr2, 0, 0, i2, 6, (Object) null);
            this.f173546e = objArr2;
        } else {
            C110821n.m150963j(objArr, objArr, i2 + 1, i2, i3);
        }
        this.f173546e[i2] = t;
        this.f173545d++;
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        int i = this.f173545d;
        for (int i2 = 0; i2 < i; i2++) {
            this.f173546e[i2] = null;
        }
        this.f173545d = 0;
    }

    public boolean contains(Object obj) {
        return obj != null && mo85840f(obj) >= 0;
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
    public final int mo85840f(Object obj) {
        int i = this.f173545d - 1;
        int identityHashCode = System.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.f173546e[i3];
            if (obj2 != null) {
                int identityHashCode2 = System.identityHashCode(obj2);
                if (identityHashCode2 < identityHashCode) {
                    i2 = i3 + 1;
                } else if (identityHashCode2 > identityHashCode) {
                    i = i3 - 1;
                } else if (obj2 == obj) {
                    return i3;
                } else {
                    for (int i4 = i3 - 1; -1 < i4; i4--) {
                        Object obj3 = this.f173546e[i4];
                        if (obj3 == obj) {
                            return i4;
                        }
                        if (System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    }
                    int i5 = i3 + 1;
                    int i6 = this.f173545d;
                    while (true) {
                        if (i5 >= i6) {
                            i5 = this.f173545d;
                            break;
                        }
                        Object obj4 = this.f173546e[i5];
                        if (obj4 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj4) != identityHashCode) {
                            break;
                        }
                        i5++;
                    }
                    return -(i5 + 1);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
        }
        return -(i2 + 1);
    }

    public boolean isEmpty() {
        return this.f173545d == 0;
    }

    public Iterator<T> iterator() {
        return new C60927a(this);
    }

    public final boolean remove(T t) {
        int f;
        if (t == null || (f = mo85840f(t)) < 0) {
            return false;
        }
        int i = this.f173545d;
        if (f < i - 1) {
            Object[] objArr = this.f173546e;
            C110821n.m150963j(objArr, objArr, f, f + 1, i);
        }
        int i2 = this.f173545d - 1;
        this.f173545d = i2;
        this.f173546e[i2] = null;
        return true;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f173545d;
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }
}
