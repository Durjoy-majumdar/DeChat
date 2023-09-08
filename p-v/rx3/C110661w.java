package rx3;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rx3.w */
public final class C110661w implements Collection<C90109v>, C33145a {

    /* renamed from: d */
    public final long[] f331065d;

    /* renamed from: rx3.w$a */
    public static final class C36571a implements Iterator<C90109v>, C33145a {

        /* renamed from: d */
        public final long[] f97262d;

        /* renamed from: e */
        public int f97263e;

        public C36571a(long[] jArr) {
            C87412m.m108594g(jArr, "array");
            this.f97262d = jArr;
        }

        public boolean hasNext() {
            return this.f97263e < this.f97262d.length;
        }

        public Object next() {
            int i = this.f97263e;
            long[] jArr = this.f97262d;
            if (i < jArr.length) {
                this.f97263e = i + 1;
                return new C90109v(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f97263e));
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C110661w(long[] jArr) {
        this.f331065d = jArr;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C90109v> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C90109v)) {
            return false;
        }
        long j = ((C90109v) obj).f258765d;
        long[] jArr = this.f331065d;
        C87412m.m108594g(jArr, "<this>");
        int length = jArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (j == jArr[i]) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "elements"
            gy3.C87412m.m108594g(r11, r0)
            long[] r0 = r10.f331065d
            boolean r1 = r11.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0010
            goto L_0x0047
        L_0x0010:
            java.util.Iterator r11 = r11.iterator()
        L_0x0014:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r11.next()
            boolean r4 = r1 instanceof rx3.C90109v
            if (r4 == 0) goto L_0x0043
            rx3.v r1 = (rx3.C90109v) r1
            long r4 = r1.f258765d
            java.lang.String r1 = "<this>"
            gy3.C87412m.m108594g(r0, r1)
            int r1 = r0.length
            r6 = 0
        L_0x002d:
            if (r6 >= r1) goto L_0x0039
            r7 = r0[r6]
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r6 = r6 + 1
            goto L_0x002d
        L_0x0039:
            r6 = -1
        L_0x003a:
            if (r6 < 0) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r1 == 0) goto L_0x0043
            r1 = 1
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 != 0) goto L_0x0014
            goto L_0x0048
        L_0x0047:
            r2 = 1
        L_0x0048:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rx3.C110661w.containsAll(java.util.Collection):boolean");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C110661w) && C87412m.m108589b(this.f331065d, ((C110661w) obj).f331065d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f331065d);
    }

    public boolean isEmpty() {
        return this.f331065d.length == 0;
    }

    public Iterator<C90109v> iterator() {
        return new C36571a(this.f331065d);
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

    public int size() {
        return this.f331065d.length;
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public String toString() {
        long[] jArr = this.f331065d;
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }
}
