package p658q1;

import fy3.C32224a;
import gy3.C59742g;
import gy3.C8480h;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: q1.f */
public final class C62573f<T> implements List<T>, C33145a {

    /* renamed from: d */
    public Object[] f177720d = new Object[16];

    /* renamed from: e */
    public long[] f177721e = new long[16];

    /* renamed from: f */
    public int f177722f = -1;

    /* renamed from: g */
    public int f177723g;

    /* renamed from: q1.f$b */
    public final class C62575b implements List<T>, C33145a {

        /* renamed from: d */
        public final int f177728d;

        /* renamed from: e */
        public final int f177729e;

        public C62575b(int i, int i2) {
            this.f177728d = i;
            this.f177729e = i2;
        }

        public void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public T get(int i) {
            return C62573f.this.f177720d[i + this.f177728d];
        }

        public int indexOf(Object obj) {
            int i = this.f177728d;
            int i2 = this.f177729e;
            if (i > i2) {
                return -1;
            }
            while (!C87412m.m108589b(C62573f.this.f177720d[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.f177728d;
        }

        public boolean isEmpty() {
            return this.f177729e - this.f177728d == 0;
        }

        public Iterator<T> iterator() {
            C62573f<T> fVar = C62573f.this;
            int i = this.f177728d;
            return new C62574a(i, i, this.f177729e);
        }

        public int lastIndexOf(Object obj) {
            int i = this.f177729e;
            int i2 = this.f177728d;
            if (i2 > i) {
                return -1;
            }
            while (!C87412m.m108589b(C62573f.this.f177720d[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f177728d;
        }

        public ListIterator<T> listIterator() {
            C62573f<T> fVar = C62573f.this;
            int i = this.f177728d;
            return new C62574a(i, i, this.f177729e);
        }

        public T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int size() {
            return this.f177729e - this.f177728d;
        }

        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List<T> subList(int i, int i2) {
            C62573f<T> fVar = C62573f.this;
            int i3 = this.f177728d;
            return new C62575b(i + i3, i3 + i2);
        }

        public Object[] toArray() {
            return C59742g.m69648a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            C87412m.m108594g(tArr, "array");
            return C59742g.m69649b(this, tArr);
        }

        public ListIterator<T> listIterator(int i) {
            C62573f<T> fVar = C62573f.this;
            int i2 = this.f177728d;
            return new C62574a(i + i2, i2, this.f177729e);
        }
    }

    public void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.f177722f = -1;
        mo87588k();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long mo87582f() {
        long a = C62576g.m73547a(Float.POSITIVE_INFINITY, false);
        int i = this.f177722f + 1;
        int e = C64197v.m75536e(this);
        if (i <= e) {
            while (true) {
                long j = this.f177721e[i];
                if (C62572c.m73542a(j, a) < 0) {
                    a = j;
                }
                if (Float.intBitsToFloat((int) (a >> 32)) >= 0.0f || !C62572c.m73543b(a)) {
                    if (i == e) {
                        break;
                    }
                    i++;
                } else {
                    return a;
                }
            }
        }
        return a;
    }

    public T get(int i) {
        return this.f177720d[i];
    }

    /* renamed from: i */
    public final void mo87584i(T t, float f, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "childHitTest");
        int i = this.f177722f;
        int i2 = i + 1;
        this.f177722f = i2;
        Object[] objArr = this.f177720d;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            this.f177720d = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f177721e, length);
            C87412m.m108593f(copyOf2, "copyOf(this, newSize)");
            this.f177721e = copyOf2;
        }
        Object[] objArr2 = this.f177720d;
        int i3 = this.f177722f;
        objArr2[i3] = t;
        this.f177721e[i3] = C62576g.m73547a(f, z);
        mo87588k();
        aVar.invoke();
        this.f177722f = i;
    }

    public int indexOf(Object obj) {
        int e = C64197v.m75536e(this);
        if (e < 0) {
            return -1;
        }
        int i = 0;
        while (!C87412m.m108589b(this.f177720d[i], obj)) {
            if (i == e) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f177723g == 0;
    }

    public Iterator<T> iterator() {
        return new C62574a(this, 0, 0, 0, 7, (C8480h) null);
    }

    /* renamed from: k */
    public final void mo87588k() {
        int i = this.f177722f + 1;
        int e = C64197v.m75536e(this);
        if (i <= e) {
            while (true) {
                this.f177720d[i] = null;
                if (i == e) {
                    break;
                }
                i++;
            }
        }
        this.f177723g = this.f177722f + 1;
    }

    public int lastIndexOf(Object obj) {
        for (int e = C64197v.m75536e(this); -1 < e; e--) {
            if (C87412m.m108589b(this.f177720d[e], obj)) {
                return e;
            }
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        return new C62574a(this, 0, 0, 0, 7, (C8480h) null);
    }

    public T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f177723g;
    }

    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<T> subList(int i, int i2) {
        return new C62575b(i, i2);
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    /* renamed from: q1.f$a */
    public final class C62574a implements ListIterator<T>, C33145a {

        /* renamed from: d */
        public int f177724d;

        /* renamed from: e */
        public final int f177725e;

        /* renamed from: f */
        public final int f177726f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C62574a(C62573f fVar, int i, int i2, int i3, int i4, C8480h hVar) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? fVar.f177723g : i3);
        }

        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return this.f177724d < this.f177726f;
        }

        public boolean hasPrevious() {
            return this.f177724d > this.f177725e;
        }

        public T next() {
            T[] tArr = C62573f.this.f177720d;
            int i = this.f177724d;
            this.f177724d = i + 1;
            return tArr[i];
        }

        public int nextIndex() {
            return this.f177724d - this.f177725e;
        }

        public T previous() {
            T[] tArr = C62573f.this.f177720d;
            int i = this.f177724d - 1;
            this.f177724d = i;
            return tArr[i];
        }

        public int previousIndex() {
            return (this.f177724d - this.f177725e) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C62574a(int i, int i2, int i3) {
            this.f177724d = i;
            this.f177725e = i2;
            this.f177726f = i3;
        }
    }

    public ListIterator<T> listIterator(int i) {
        return new C62574a(this, i, 0, 0, 6, (C8480h) null);
    }
}
