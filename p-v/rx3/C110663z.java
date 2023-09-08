package rx3;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rx3.z */
public final class C110663z implements Collection<C110662y>, C33145a {

    /* renamed from: d */
    public final short[] f331067d;

    /* renamed from: rx3.z$a */
    public static final class C110664a implements Iterator<C110662y>, C33145a {

        /* renamed from: d */
        public final short[] f331068d;

        /* renamed from: e */
        public int f331069e;

        public C110664a(short[] sArr) {
            C87412m.m108594g(sArr, "array");
            this.f331068d = sArr;
        }

        public boolean hasNext() {
            return this.f331069e < this.f331068d.length;
        }

        public Object next() {
            int i = this.f331069e;
            short[] sArr = this.f331068d;
            if (i < sArr.length) {
                this.f331069e = i + 1;
                return new C110662y(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f331069e));
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C110663z(short[] sArr) {
        this.f331067d = sArr;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C110662y> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C110662y)) {
            return false;
        }
        short s = ((C110662y) obj).f331066d;
        short[] sArr = this.f331067d;
        C87412m.m108594g(sArr, "<this>");
        int length = sArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (s == sArr[i]) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "elements"
            gy3.C87412m.m108594g(r8, r0)
            short[] r0 = r7.f331067d
            boolean r1 = r8.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0010
            goto L_0x0045
        L_0x0010:
            java.util.Iterator r8 = r8.iterator()
        L_0x0014:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r8.next()
            boolean r4 = r1 instanceof rx3.C110662y
            if (r4 == 0) goto L_0x0041
            rx3.y r1 = (rx3.C110662y) r1
            short r1 = r1.f331066d
            java.lang.String r4 = "<this>"
            gy3.C87412m.m108594g(r0, r4)
            int r4 = r0.length
            r5 = 0
        L_0x002d:
            if (r5 >= r4) goto L_0x0037
            short r6 = r0[r5]
            if (r1 != r6) goto L_0x0034
            goto L_0x0038
        L_0x0034:
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0037:
            r5 = -1
        L_0x0038:
            if (r5 < 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            if (r1 == 0) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 != 0) goto L_0x0014
            goto L_0x0046
        L_0x0045:
            r2 = 1
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rx3.C110663z.containsAll(java.util.Collection):boolean");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C110663z) && C87412m.m108589b(this.f331067d, ((C110663z) obj).f331067d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f331067d);
    }

    public boolean isEmpty() {
        return this.f331067d.length == 0;
    }

    public Iterator<C110662y> iterator() {
        return new C110664a(this.f331067d);
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
        return this.f331067d.length;
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public String toString() {
        short[] sArr = this.f331067d;
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }
}
