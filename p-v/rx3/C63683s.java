package rx3;

import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rx3.s */
public final class C63683s implements Collection<C63682r>, C33145a {

    /* renamed from: d */
    public final byte[] f180538d;

    /* renamed from: rx3.s$a */
    public static final class C63684a implements Iterator<C63682r>, C33145a {

        /* renamed from: d */
        public final byte[] f180539d;

        /* renamed from: e */
        public int f180540e;

        public C63684a(byte[] bArr) {
            C87412m.m108594g(bArr, "array");
            this.f180539d = bArr;
        }

        public boolean hasNext() {
            return this.f180540e < this.f180539d.length;
        }

        public Object next() {
            int i = this.f180540e;
            byte[] bArr = this.f180539d;
            if (i < bArr.length) {
                this.f180540e = i + 1;
                return new C63682r(bArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f180540e));
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C63683s(byte[] bArr) {
        this.f180538d = bArr;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C63682r> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C63682r)) {
            return false;
        }
        byte b = ((C63682r) obj).f180537d;
        byte[] bArr = this.f180538d;
        C87412m.m108594g(bArr, "<this>");
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (b == bArr[i]) {
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
            byte[] r0 = r7.f180538d
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
            boolean r4 = r1 instanceof rx3.C63682r
            if (r4 == 0) goto L_0x0041
            rx3.r r1 = (rx3.C63682r) r1
            byte r1 = r1.f180537d
            java.lang.String r4 = "<this>"
            gy3.C87412m.m108594g(r0, r4)
            int r4 = r0.length
            r5 = 0
        L_0x002d:
            if (r5 >= r4) goto L_0x0037
            byte r6 = r0[r5]
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
        throw new UnsupportedOperationException("Method not decompiled: rx3.C63683s.containsAll(java.util.Collection):boolean");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C63683s) && C87412m.m108589b(this.f180538d, ((C63683s) obj).f180538d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f180538d);
    }

    public boolean isEmpty() {
        return this.f180538d.length == 0;
    }

    public Iterator<C63682r> iterator() {
        return new C63684a(this.f180538d);
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
        return this.f180538d.length;
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }

    public String toString() {
        byte[] bArr = this.f180538d;
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }
}
