package w04;

import gy3.C24564k0;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C8480h;
import gy3.C87412m;
import hy3.C33145a;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import sx3.C110823p;

/* renamed from: w04.f */
public final class C22850f<T> extends AbstractSet<T> {

    /* renamed from: f */
    public static final C22851b f65674f = new C22851b((C8480h) null);

    /* renamed from: d */
    public Object f65675d;

    /* renamed from: e */
    public int f65676e;

    /* renamed from: w04.f$b */
    public static final class C22851b {
        public C22851b(C8480h hVar) {
        }

        /* renamed from: a */
        public final <T> C22850f<T> mo36008a() {
            return new C22850f<>((C8480h) null);
        }
    }

    /* renamed from: w04.f$a */
    public static final class C22852a<T> implements Iterator<T>, C33145a {

        /* renamed from: d */
        public final Iterator<T> f65677d;

        public C22852a(T[] tArr) {
            C87412m.m108594g(tArr, "array");
            this.f65677d = C32617c.m39769a(tArr);
        }

        public boolean hasNext() {
            return ((C32616b) this.f65677d).hasNext();
        }

        public T next() {
            return ((C32616b) this.f65677d).next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: w04.f$c */
    public static final class C22853c<T> implements Iterator<T>, C33145a {

        /* renamed from: d */
        public final T f65678d;

        /* renamed from: e */
        public boolean f65679e = true;

        public C22853c(T t) {
            this.f65678d = t;
        }

        public boolean hasNext() {
            return this.f65679e;
        }

        public T next() {
            if (this.f65679e) {
                this.f65679e = false;
                return this.f65678d;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C22850f(C8480h hVar) {
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(T r5) {
        /*
            r4 = this;
            int r0 = r4.f65676e
            r1 = 1
            if (r0 != 0) goto L_0x0008
            r4.f65675d = r5
            goto L_0x0076
        L_0x0008:
            r2 = 0
            if (r0 != r1) goto L_0x0020
            java.lang.Object r0 = r4.f65675d
            boolean r0 = gy3.C87412m.m108589b(r0, r5)
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r4.f65675d
            r0[r2] = r3
            r0[r1] = r5
            r4.f65675d = r0
            goto L_0x0076
        L_0x0020:
            r3 = 5
            if (r0 >= r3) goto L_0x0064
            java.lang.Object r0 = r4.f65675d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            gy3.C87412m.m108592e(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = sx3.C110823p.m151009y(r0, r5)
            if (r3 == 0) goto L_0x0033
            return r2
        L_0x0033:
            int r2 = r4.f65676e
            r3 = 4
            if (r2 != r3) goto L_0x0053
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "elements"
            gy3.C87412m.m108594g(r0, r2)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r3 = r0.length
            int r3 = sx3.C90363p0.m113142a(r3)
            r2.<init>(r3)
            sx3.C110823p.m150997W(r0, r2)
            r2.add(r5)
            goto L_0x0061
        L_0x0053:
            int r2 = r2 + r1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "copyOf(this, newSize)"
            gy3.C87412m.m108593f(r2, r0)
            int r0 = r2.length
            int r0 = r0 - r1
            r2[r0] = r5
        L_0x0061:
            r4.f65675d = r2
            goto L_0x0076
        L_0x0064:
            java.lang.Object r0 = r4.f65675d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            gy3.C87412m.m108592e(r0, r3)
            java.util.Set r0 = gy3.C24564k0.m30740d(r0)
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L_0x0076
            return r2
        L_0x0076:
            int r5 = r4.f65676e
            int r5 = r5 + r1
            r4.f65676e = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w04.C22850f.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.f65675d = null;
        this.f65676e = 0;
    }

    public boolean contains(Object obj) {
        int i = this.f65676e;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return C87412m.m108589b(this.f65675d, obj);
        }
        if (i < 5) {
            Object obj2 = this.f65675d;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C110823p.m151009y((Object[]) obj2, obj);
        }
        Object obj3 = this.f65675d;
        C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public Iterator<T> iterator() {
        int i = this.f65676e;
        if (i == 0) {
            return Collections.emptySet().iterator();
        }
        if (i == 1) {
            return new C22853c(this.f65675d);
        }
        if (i < 5) {
            Object obj = this.f65675d;
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C22852a((Object[]) obj);
        }
        Object obj2 = this.f65675d;
        C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return C24564k0.m30740d(obj2).iterator();
    }

    public final int size() {
        return this.f65676e;
    }
}
