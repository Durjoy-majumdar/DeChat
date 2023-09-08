package tx3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import hy3.C33145a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import sx3.C110821n;
import sx3.C64177c;
import sx3.C64185f;

/* renamed from: tx3.b */
public final class C26314b<E> extends C64185f<E> implements RandomAccess, Serializable {

    /* renamed from: d */
    public E[] f73319d;

    /* renamed from: e */
    public int f73320e;

    /* renamed from: f */
    public int f73321f;

    /* renamed from: g */
    public boolean f73322g;

    /* renamed from: h */
    public final C26314b<E> f73323h;

    /* renamed from: i */
    public final C26314b<E> f73324i;

    /* renamed from: tx3.b$a */
    public static final class C26315a<E> implements ListIterator<E>, C33145a {

        /* renamed from: d */
        public final C26314b<E> f73325d;

        /* renamed from: e */
        public int f73326e;

        /* renamed from: f */
        public int f73327f = -1;

        public C26315a(C26314b<E> bVar, int i) {
            C87412m.m108594g(bVar, "list");
            this.f73325d = bVar;
            this.f73326e = i;
        }

        public void add(E e) {
            C26314b<E> bVar = this.f73325d;
            int i = this.f73326e;
            this.f73326e = i + 1;
            bVar.add(i, e);
            this.f73327f = -1;
        }

        public boolean hasNext() {
            return this.f73326e < this.f73325d.f73321f;
        }

        public boolean hasPrevious() {
            return this.f73326e > 0;
        }

        public E next() {
            int i = this.f73326e;
            C26314b<E> bVar = this.f73325d;
            if (i < bVar.f73321f) {
                this.f73326e = i + 1;
                this.f73327f = i;
                return bVar.f73319d[bVar.f73320e + i];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f73326e;
        }

        public E previous() {
            int i = this.f73326e;
            if (i > 0) {
                int i2 = i - 1;
                this.f73326e = i2;
                this.f73327f = i2;
                C26314b<E> bVar = this.f73325d;
                return bVar.f73319d[bVar.f73320e + i2];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f73326e - 1;
        }

        public void remove() {
            int i = this.f73327f;
            if (i != -1) {
                this.f73325d.mo53210i(i);
                this.f73326e = this.f73327f;
                this.f73327f = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(E e) {
            int i = this.f73327f;
            if (i != -1) {
                this.f73325d.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public C26314b(E[] eArr, int i, int i2, boolean z, C26314b<E> bVar, C26314b<E> bVar2) {
        this.f73319d = eArr;
        this.f73320e = i;
        this.f73321f = i2;
        this.f73322g = z;
        this.f73323h = bVar;
        this.f73324i = bVar2;
    }

    public boolean add(E e) {
        mo53219m();
        mo53215l(this.f73320e + this.f73321f, e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        mo53219m();
        int size = collection.size();
        mo53214k(this.f73320e + this.f73321f, collection, size);
        return size > 0;
    }

    public void clear() {
        mo53219m();
        mo53222p(this.f73320e, this.f73321f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == r8) goto L_0x0030
            boolean r2 = r9 instanceof java.util.List
            if (r2 == 0) goto L_0x0031
            java.util.List r9 = (java.util.List) r9
            E[] r2 = r8.f73319d
            int r3 = r8.f73320e
            int r4 = r8.f73321f
            int r5 = r9.size()
            if (r4 == r5) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 >= r4) goto L_0x002d
            int r6 = r3 + r5
            r6 = r2[r6]
            java.lang.Object r7 = r9.get(r5)
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 != 0) goto L_0x002a
        L_0x0028:
            r9 = 0
            goto L_0x002e
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            r9 = 1
        L_0x002e:
            if (r9 == 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tx3.C26314b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo53207f() {
        return this.f73321f;
    }

    public E get(int i) {
        int i2 = this.f73321f;
        if (i >= 0 && i < i2) {
            return this.f73319d[this.f73320e + i];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public int hashCode() {
        E[] eArr = this.f73319d;
        int i = this.f73320e;
        int i2 = this.f73321f;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            E e = eArr[i + i4];
            i3 = (i3 * 31) + (e != null ? e.hashCode() : 0);
        }
        return i3;
    }

    /* renamed from: i */
    public E mo53210i(int i) {
        mo53219m();
        int i2 = this.f73321f;
        if (i >= 0 && i < i2) {
            return mo53221o(this.f73320e + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.f73321f; i++) {
            if (C87412m.m108589b(this.f73319d[this.f73320e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f73321f == 0;
    }

    public Iterator<E> iterator() {
        return new C26315a(this, 0);
    }

    /* renamed from: k */
    public final void mo53214k(int i, Collection<? extends E> collection, int i2) {
        C26314b<E> bVar = this.f73323h;
        if (bVar != null) {
            bVar.mo53214k(i, collection, i2);
            this.f73319d = this.f73323h.f73319d;
            this.f73321f += i2;
            return;
        }
        mo53220n(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f73319d[i + i3] = it.next();
        }
    }

    /* renamed from: l */
    public final void mo53215l(int i, E e) {
        C26314b<E> bVar = this.f73323h;
        if (bVar != null) {
            bVar.mo53215l(i, e);
            this.f73319d = this.f73323h.f73319d;
            this.f73321f++;
            return;
        }
        mo53220n(i, 1);
        this.f73319d[i] = e;
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.f73321f - 1; i >= 0; i--) {
            if (C87412m.m108589b(this.f73319d[this.f73320e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C26315a(this, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f73324i;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53219m() {
        /*
            r1 = this;
            boolean r0 = r1.f73322g
            if (r0 != 0) goto L_0x000f
            tx3.b<E> r0 = r1.f73324i
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.f73322g
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tx3.C26314b.mo53219m():void");
    }

    /* renamed from: n */
    public final void mo53220n(int i, int i2) {
        int i3 = this.f73321f + i2;
        if (this.f73323h != null) {
            throw new IllegalStateException();
        } else if (i3 >= 0) {
            E[] eArr = this.f73319d;
            if (i3 > eArr.length) {
                int length = eArr.length;
                int i4 = length + (length >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                E[] copyOf = Arrays.copyOf(eArr, i4);
                C87412m.m108593f(copyOf, "copyOf(this, newSize)");
                this.f73319d = copyOf;
            }
            E[] eArr2 = this.f73319d;
            C110821n.m150963j(eArr2, eArr2, i + i2, i, this.f73320e + this.f73321f);
            this.f73321f += i2;
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: o */
    public final E mo53221o(int i) {
        C26314b<E> bVar = this.f73323h;
        if (bVar != null) {
            this.f73321f--;
            return bVar.mo53221o(i);
        }
        E[] eArr = this.f73319d;
        E e = eArr[i];
        C110821n.m150963j(eArr, eArr, i, i + 1, this.f73320e + this.f73321f);
        E[] eArr2 = this.f73319d;
        C87412m.m108594g(eArr2, "<this>");
        eArr2[(this.f73320e + this.f73321f) - 1] = null;
        this.f73321f--;
        return e;
    }

    /* renamed from: p */
    public final void mo53222p(int i, int i2) {
        C26314b<E> bVar = this.f73323h;
        if (bVar != null) {
            bVar.mo53222p(i, i2);
        } else {
            E[] eArr = this.f73319d;
            C110821n.m150963j(eArr, eArr, i, i + i2, this.f73321f);
            E[] eArr2 = this.f73319d;
            int i3 = this.f73321f;
            C26316c.m33798b(eArr2, i3 - i2, i3);
        }
        this.f73321f -= i2;
    }

    /* renamed from: r */
    public final int mo53223r(int i, int i2, Collection<? extends E> collection, boolean z) {
        C26314b<E> bVar = this.f73323h;
        if (bVar != null) {
            int r = bVar.mo53223r(i, i2, collection, z);
            this.f73321f -= r;
            return r;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f73319d[i5]) == z) {
                E[] eArr = this.f73319d;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.f73319d;
        C110821n.m150963j(eArr2, eArr2, i + i4, i2 + i, this.f73321f);
        E[] eArr3 = this.f73319d;
        int i7 = this.f73321f;
        C26316c.m33798b(eArr3, i7 - i6, i7);
        this.f73321f -= i6;
        return i6;
    }

    public boolean remove(Object obj) {
        mo53219m();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            mo53210i(indexOf);
        }
        return indexOf >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        mo53219m();
        return mo53223r(this.f73320e, this.f73321f, collection, false) > 0;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        mo53219m();
        return mo53223r(this.f73320e, this.f73321f, collection, true) > 0;
    }

    public E set(int i, E e) {
        mo53219m();
        int i2 = this.f73321f;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        E[] eArr = this.f73319d;
        int i3 = this.f73320e;
        E e2 = eArr[i3 + i];
        eArr[i3 + i] = e;
        return e2;
    }

    public List<E> subList(int i, int i2) {
        C64177c.f181897d.mo88915a(i, i2, this.f73321f);
        E[] eArr = this.f73319d;
        int i3 = this.f73320e + i;
        int i4 = i2 - i;
        boolean z = this.f73322g;
        C26314b<E> bVar = this.f73324i;
        return new C26314b(eArr, i3, i4, z, this, bVar == null ? this : bVar);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, FirebaseAnalytics.C113379b.DESTINATION);
        int length = tArr.length;
        int i = this.f73321f;
        if (length < i) {
            E[] eArr = this.f73319d;
            int i2 = this.f73320e;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            C87412m.m108593f(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.f73319d;
        C87412m.m108592e(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.f73320e;
        C110821n.m150963j(eArr2, tArr, 0, i3, this.f73321f + i3);
        int length2 = tArr.length;
        int i4 = this.f73321f;
        if (length2 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    public String toString() {
        E[] eArr = this.f73319d;
        int i = this.f73320e;
        int i2 = this.f73321f;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(eArr[i + i3]);
        }
        sb.append("]");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    public ListIterator<E> listIterator(int i) {
        int i2 = this.f73321f;
        if (i >= 0 && i <= i2) {
            return new C26315a(this, i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public void add(int i, E e) {
        mo53219m();
        int i2 = this.f73321f;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        mo53215l(this.f73320e + i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        mo53219m();
        int i2 = this.f73321f;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int size = collection.size();
        mo53214k(this.f73320e + i, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        E[] eArr = this.f73319d;
        int i = this.f73320e;
        return C110821n.m150967n(eArr, i, this.f73321f + i);
    }

    public C26314b() {
        this(10);
    }

    public C26314b(int i) {
        this(C26316c.m33797a(i), 0, 0, false, (C26314b) null, (C26314b) null);
    }
}
