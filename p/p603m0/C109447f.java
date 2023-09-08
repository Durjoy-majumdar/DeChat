package p603m0;

import fy3.C32226l;
import gy3.C32616b;
import gy3.C32617c;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p414p0.C110092c;
import p414p0.C110093d;
import p854l0.C109072c;
import sx3.C110821n;
import sx3.C64185f;

/* renamed from: m0.f */
public final class C109447f<E> extends C64185f<E> implements C109072c.C109073a<E> {

    /* renamed from: d */
    public C109072c<? extends E> f327594d;

    /* renamed from: e */
    public Object[] f327595e;

    /* renamed from: f */
    public Object[] f327596f;

    /* renamed from: g */
    public int f327597g;

    /* renamed from: h */
    public C110093d f327598h = new C110093d();

    /* renamed from: i */
    public Object[] f327599i;

    /* renamed from: j */
    public Object[] f327600j;

    /* renamed from: n */
    public int f327601n;

    /* renamed from: m0.f$a */
    public static final class C34453a extends C87413o implements C32226l<E, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Collection<E> f92749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34453a(Collection<? extends E> collection) {
            super(1);
            this.f92749d = collection;
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(this.f92749d.contains(obj));
        }
    }

    public C109447f(C109072c<? extends E> cVar, Object[] objArr, Object[] objArr2, int i) {
        C87412m.m108594g(cVar, "vector");
        C87412m.m108594g(objArr2, "vectorTail");
        this.f327594d = cVar;
        this.f327595e = objArr;
        this.f327596f = objArr2;
        this.f327597g = i;
        this.f327599i = objArr;
        this.f327600j = objArr2;
        this.f327601n = cVar.size();
    }

    /* renamed from: A */
    public final Object[] mo160640A(Object[] objArr, int i, Object[][] objArr2) {
        Iterator a = C32617c.m39769a(objArr2);
        int i2 = i >> 5;
        int i3 = this.f327597g;
        Object[] z = i2 < (1 << i3) ? mo160677z(objArr, i, i3, a) : mo160669s(objArr);
        while (((C32616b) a).hasNext()) {
            this.f327597g += 5;
            z = mo160673v(z);
            int i4 = this.f327597g;
            mo160677z(z, 1 << i4, i4, a);
        }
        return z;
    }

    /* renamed from: C */
    public final void mo160641C(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int f = mo53207f() >> 5;
        int i = this.f327597g;
        if (f > (1 << i)) {
            this.f327599i = mo160642D(mo160673v(objArr), objArr2, this.f327597g + 5);
            this.f327600j = objArr3;
            this.f327597g += 5;
            this.f327601n = mo53207f() + 1;
        } else if (objArr == null) {
            this.f327599i = objArr2;
            this.f327600j = objArr3;
            this.f327601n = mo53207f() + 1;
        } else {
            this.f327599i = mo160642D(objArr, objArr2, i);
            this.f327600j = objArr3;
            this.f327601n = mo53207f() + 1;
        }
    }

    /* renamed from: D */
    public final Object[] mo160642D(Object[] objArr, Object[] objArr2, int i) {
        int f = ((mo53207f() - 1) >> i) & 31;
        Object[] s = mo160669s(objArr);
        if (i == 5) {
            s[f] = objArr2;
        } else {
            s[f] = mo160642D((Object[]) s[f], objArr2, i - 5);
        }
        return s;
    }

    /* renamed from: E */
    public final int mo160643E(C32226l<? super E, Boolean> lVar, Object[] objArr, int i, int i2, C109445d dVar, List<Object[]> list, List<Object[]> list2) {
        if (mo160666p(objArr)) {
            list.add(objArr);
        }
        Object obj = dVar.f327589a;
        if (obj != null) {
            Object[] objArr2 = (Object[]) obj;
            Object[] objArr3 = objArr2;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                if (!lVar.invoke(obj2).booleanValue()) {
                    if (i2 == 32) {
                        objArr3 = list.isEmpty() ^ true ? list.remove(list.size() - 1) : mo160672u();
                        i2 = 0;
                    }
                    objArr3[i2] = obj2;
                    i2++;
                }
            }
            dVar.f327589a = objArr3;
            if (objArr2 != objArr3) {
                list2.add(objArr2);
            }
            return i2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: F */
    public final int mo160644F(C32226l<? super E, Boolean> lVar, Object[] objArr, int i, C109445d dVar) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = mo160669s(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        dVar.f327589a = objArr2;
        return i2;
    }

    /* renamed from: G */
    public final int mo160645G(C32226l<? super E, Boolean> lVar, int i, C109445d dVar) {
        int F = mo160644F(lVar, this.f327600j, i, dVar);
        if (F == i) {
            return i;
        }
        Object obj = dVar.f327589a;
        if (obj != null) {
            Object[] objArr = (Object[]) obj;
            Arrays.fill(objArr, F, i, (Object) null);
            this.f327600j = objArr;
            this.f327601n = mo53207f() - (i - F);
            return F;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r0 != r10) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (mo160645G(r9, r10, r11) != r10) goto L_0x001e;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo160646H(fy3.C32226l<? super E, java.lang.Boolean> r20) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            java.lang.String r0 = "predicate"
            gy3.C87412m.m108594g(r9, r0)
            int r10 = r19.mo160652N()
            m0.d r11 = new m0.d
            r12 = 0
            r11.<init>(r12)
            java.lang.Object[] r0 = r8.f327599i
            r14 = 0
            if (r0 != 0) goto L_0x0021
            int r0 = r8.mo160645G(r9, r10, r11)
            if (r0 == r10) goto L_0x0105
        L_0x001e:
            r14 = 1
            goto L_0x0105
        L_0x0021:
            java.util.ListIterator r15 = r8.mo160667r(r14)
            r7 = 32
            r0 = 32
        L_0x0029:
            if (r0 != r7) goto L_0x003f
            r1 = r15
            m0.a r1 = (p603m0.C109441a) r1
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L_0x003f
            java.lang.Object r0 = r15.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r8.mo160644F(r9, r0, r7, r11)
            goto L_0x0029
        L_0x003f:
            if (r0 != r7) goto L_0x0055
            int r0 = r8.mo160645G(r9, r10, r11)
            if (r0 != 0) goto L_0x0052
            java.lang.Object[] r1 = r8.f327599i
            int r2 = r19.mo53207f()
            int r3 = r8.f327597g
            r8.mo160676y(r1, r2, r3)
        L_0x0052:
            if (r0 == r10) goto L_0x0105
            goto L_0x001e
        L_0x0055:
            r6 = r15
            m0.a r6 = (p603m0.C109441a) r6
            int r1 = r6.f327585d
            int r1 = r1 + -1
            int r5 = r1 << 5
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            r4 = r0
        L_0x0069:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r15.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r19
            r1 = r20
            r13 = r5
            r5 = r11
            r18 = r6
            r6 = r17
            r14 = 32
            r7 = r16
            int r4 = r0.mo160643E(r1, r2, r3, r4, r5, r6, r7)
            r5 = r13
            r6 = r18
            r7 = 32
            r14 = 0
            goto L_0x0069
        L_0x0091:
            r13 = r5
            r14 = 32
            java.lang.Object[] r2 = r8.f327600j
            r0 = r19
            r1 = r20
            r3 = r10
            r5 = r11
            r6 = r17
            r7 = r16
            int r0 = r0.mo160643E(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r11.f327589a
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            if (r1 == 0) goto L_0x011a
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.Arrays.fill(r1, r0, r14, r12)
            boolean r3 = r16.isEmpty()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object[] r3 = r8.f327599i
            gy3.C87412m.m108591d(r3)
            goto L_0x00c7
        L_0x00bb:
            java.lang.Object[] r3 = r8.f327599i
            int r4 = r8.f327597g
            java.util.Iterator r5 = r16.iterator()
            java.lang.Object[] r3 = r8.mo160677z(r3, r13, r4, r5)
        L_0x00c7:
            int r4 = r16.size()
            int r4 = r4 << 5
            int r5 = r13 + r4
            r4 = r5 & 31
            if (r4 != 0) goto L_0x00d5
            r4 = 1
            goto L_0x00d6
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            if (r4 == 0) goto L_0x010e
            if (r5 != 0) goto L_0x00de
            r4 = 0
            r8.f327597g = r4
            goto L_0x00fc
        L_0x00de:
            r4 = 0
            int r6 = r5 + -1
        L_0x00e1:
            int r7 = r8.f327597g
            int r9 = r6 >> r7
            if (r9 != 0) goto L_0x00f8
            int r7 = r7 + -5
            r8.f327597g = r7
            r3 = r3[r4]
            if (r3 == 0) goto L_0x00f2
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L_0x00e1
        L_0x00f2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x00f8:
            java.lang.Object[] r12 = r8.mo160674w(r3, r6, r7)
        L_0x00fc:
            r8.f327599i = r12
            r8.f327600j = r1
            int r5 = r5 + r0
            r8.f327601n = r5
            goto L_0x001e
        L_0x0105:
            if (r14 == 0) goto L_0x010d
            int r0 = r8.modCount
            r1 = 1
            int r0 = r0 + r1
            r8.modCount = r0
        L_0x010d:
            return r14
        L_0x010e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x011a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p603m0.C109447f.mo160646H(fy3.l):boolean");
    }

    /* renamed from: I */
    public final Object[] mo160647I(Object[] objArr, int i, int i2, C109445d dVar) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i4];
            Object[] s = mo160669s(objArr);
            C110821n.m150963j(objArr, s, i4, i4 + 1, 32);
            s[31] = dVar.f327589a;
            dVar.f327589a = obj;
            return s;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((mo160649K() - 1) >> i);
        }
        Object[] s2 = mo160669s(objArr);
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj2 = s2[i3];
                if (obj2 != null) {
                    s2[i3] = mo160647I((Object[]) obj2, i5, 0, dVar);
                    if (i3 == i6) {
                        break;
                    }
                    i3--;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj3 = s2[i4];
        if (obj3 != null) {
            s2[i4] = mo160647I((Object[]) obj3, i5, i2, dVar);
            return s2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: J */
    public final Object mo160648J(Object[] objArr, int i, int i2, int i3) {
        int f = mo53207f() - i;
        if (f == 1) {
            Object obj = this.f327600j[0];
            mo160676y(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.f327600j;
        Object obj2 = objArr2[i3];
        Object[] s = mo160669s(objArr2);
        C110821n.m150963j(objArr2, s, i3, i3 + 1, f);
        s[f - 1] = null;
        this.f327599i = objArr;
        this.f327600j = s;
        this.f327601n = (i + f) - 1;
        this.f327597g = i2;
        return obj2;
    }

    /* renamed from: K */
    public final int mo160649K() {
        if (mo53207f() <= 32) {
            return 0;
        }
        return (mo53207f() - 1) & -32;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] mo160650L(java.lang.Object[] r9, int r10, int r11, E r12, p603m0.C109445d r13) {
        /*
            r8 = this;
            int r0 = r11 >> r10
            r0 = r0 & 31
            java.lang.Object[] r1 = r8.mo160669s(r9)
            if (r10 != 0) goto L_0x0019
            if (r1 == r9) goto L_0x0012
            int r9 = r8.modCount
            int r9 = r9 + 1
            r8.modCount = r9
        L_0x0012:
            r9 = r1[r0]
            r13.f327589a = r9
            r1[r0] = r12
            return r1
        L_0x0019:
            r9 = r1[r0]
            if (r9 == 0) goto L_0x002d
            r3 = r9
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r4 = r10 + -5
            r2 = r8
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object[] r9 = r2.mo160650L(r3, r4, r5, r6, r7)
            r1[r0] = r9
            return r1
        L_0x002d:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p603m0.C109447f.mo160650L(java.lang.Object[], int, int, java.lang.Object, m0.d):java.lang.Object[]");
    }

    /* renamed from: M */
    public final void mo160651M(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArr4;
        if (i3 >= 1) {
            Object[] s = mo160669s(objArr);
            objArr2[0] = s;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                C110821n.m150963j(s, objArr3, size + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    objArr4 = s;
                } else {
                    objArr4 = mo160672u();
                    i3--;
                    objArr2[i3] = objArr4;
                }
                int i7 = i2 - i6;
                C110821n.m150963j(s, objArr3, 0, i7, i2);
                C110821n.m150963j(s, objArr4, size + 1, i4, i7);
                objArr3 = objArr4;
            }
            Iterator<? extends E> it = collection.iterator();
            mo160659k(s, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                Object[] u = mo160672u();
                mo160659k(u, 0, it);
                objArr2[i8] = u;
            }
            mo160659k(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: N */
    public final int mo160652N() {
        int i = this.f327601n;
        return i <= 32 ? i : i - ((i - 1) & -32);
    }

    public void add(int i, E e) {
        C110092c.m149676b(i, mo53207f());
        if (i == mo53207f()) {
            add(e);
            return;
        }
        this.modCount++;
        int K = mo160649K();
        if (i >= K) {
            mo160665o(this.f327599i, i - K, e);
            return;
        }
        C109445d dVar = new C109445d((Object) null);
        Object[] objArr = this.f327599i;
        C87412m.m108591d(objArr);
        mo160665o(mo160664n(objArr, this.f327597g, i, e, dVar), 0, dVar.f327589a);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArr;
        int i2 = i;
        Collection<? extends E> collection2 = collection;
        C87412m.m108594g(collection2, "elements");
        C110092c.m149676b(i, this.f327601n);
        if (i2 == this.f327601n) {
            return addAll(collection2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i3 = (i2 >> 5) << 5;
        int size = (((this.f327601n - i3) + collection.size()) - 1) / 32;
        if (size == 0) {
            int i4 = i2 & 31;
            Object[] objArr2 = this.f327600j;
            Object[] s = mo160669s(objArr2);
            C110821n.m150963j(objArr2, s, (((collection.size() + i2) - 1) & 31) + 1, i4, mo160652N());
            mo160659k(s, i4, collection.iterator());
            this.f327600j = s;
            this.f327601n += collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int N = mo160652N();
        int size2 = this.f327601n + collection.size();
        if (size2 > 32) {
            size2 -= (size2 - 1) & -32;
        }
        if (i2 >= mo160649K()) {
            objArr = mo160672u();
            mo160651M(collection, i, this.f327600j, N, objArr3, size, objArr);
        } else if (size2 > N) {
            int i5 = size2 - N;
            objArr = mo160671t(this.f327600j, i5);
            mo160663m(collection, i, i5, objArr3, size, objArr);
        } else {
            Object[] objArr4 = this.f327600j;
            objArr = mo160672u();
            int i6 = N - size2;
            C110821n.m150963j(objArr4, objArr, 0, i6, N);
            int i7 = 32 - i6;
            Object[] t = mo160671t(this.f327600j, i7);
            int i8 = size - 1;
            objArr3[i8] = t;
            mo160663m(collection, i, i7, objArr3, i8, t);
        }
        this.f327599i = mo160640A(this.f327599i, i3, objArr3);
        this.f327600j = objArr;
        this.f327601n += collection.size();
        return true;
    }

    public C109072c<E> build() {
        C109072c<? extends E> cVar;
        Object[] objArr = this.f327599i;
        if (objArr == this.f327595e && this.f327600j == this.f327596f) {
            cVar = this.f327594d;
        } else {
            this.f327598h = new C110093d();
            this.f327595e = objArr;
            Object[] objArr2 = this.f327600j;
            this.f327596f = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    cVar = C109451j.f327609f;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f327600j, mo53207f());
                    C87412m.m108593f(copyOf, "copyOf(this, newSize)");
                    cVar = new C109451j<>(copyOf);
                }
            } else {
                C87412m.m108591d(objArr);
                cVar = new C109446e<>(objArr, this.f327600j, mo53207f(), this.f327597g);
            }
        }
        this.f327594d = cVar;
        return cVar;
    }

    /* renamed from: f */
    public int mo53207f() {
        return this.f327601n;
    }

    public E get(int i) {
        E[] eArr;
        C110092c.m149675a(i, mo53207f());
        if (mo160649K() <= i) {
            eArr = this.f327600j;
        } else {
            eArr = this.f327599i;
            C87412m.m108591d(eArr);
            int i2 = this.f327597g;
            while (i2 > 0) {
                E e = eArr[(i >> i2) & 31];
                if (e != null) {
                    eArr = (Object[]) e;
                    i2 -= 5;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return eArr[i & 31];
    }

    /* renamed from: i */
    public E mo53210i(int i) {
        C110092c.m149675a(i, mo53207f());
        this.modCount++;
        int K = mo160649K();
        if (i >= K) {
            return mo160648J(this.f327599i, K, this.f327597g, i - K);
        }
        C109445d dVar = new C109445d(this.f327600j[0]);
        Object[] objArr = this.f327599i;
        C87412m.m108591d(objArr);
        mo160648J(mo160647I(objArr, this.f327597g, i, dVar), K, this.f327597g, 0);
        return dVar.f327589a;
    }

    public Iterator<E> iterator() {
        return listIterator(0);
    }

    /* renamed from: k */
    public final Object[] mo160659k(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    /* renamed from: l */
    public final int mo160660l() {
        return this.modCount;
    }

    public ListIterator<E> listIterator(int i) {
        C110092c.m149676b(i, mo53207f());
        return new C109449h(this, i);
    }

    /* renamed from: m */
    public final void mo160663m(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3;
        int i4 = i2;
        int i5 = i3;
        Object[] objArr4 = this.f327599i;
        if (objArr4 != null) {
            int i6 = i >> 5;
            if (objArr4 != null) {
                ListIterator<Object[]> r = mo160667r(mo160649K() >> 5);
                Object[] objArr5 = objArr2;
                int i7 = i5;
                while (((C109441a) r).f327585d - 1 != i6) {
                    Object[] previous = r.previous();
                    C110821n.m150963j(previous, objArr5, 0, 32 - i4, 32);
                    objArr5 = mo160671t(previous, i2);
                    i7--;
                    objArr[i7] = objArr5;
                }
                Object[] previous2 = r.previous();
                int K = i5 - (((mo160649K() >> 5) - 1) - i6);
                if (K < i5) {
                    Object[] objArr6 = objArr[K];
                    C87412m.m108591d(objArr6);
                    objArr3 = objArr6;
                } else {
                    objArr3 = objArr2;
                }
                mo160651M(collection, i, previous2, 32, objArr, K, objArr3);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: n */
    public final Object[] mo160664n(Object[] objArr, int i, int i2, Object obj, C109445d dVar) {
        Object obj2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            dVar.f327589a = objArr[31];
            Object[] s = mo160669s(objArr);
            C110821n.m150963j(objArr, s, i3 + 1, i3, 31);
            s[i3] = obj;
            return s;
        }
        Object[] s2 = mo160669s(objArr);
        int i4 = i - 5;
        Object obj3 = s2[i3];
        if (obj3 != null) {
            s2[i3] = mo160664n((Object[]) obj3, i4, i2, obj, dVar);
            while (true) {
                i3++;
                if (i3 >= 32 || (obj2 = s2[i3]) == null) {
                    return s2;
                }
                if (obj2 != null) {
                    s2[i3] = mo160664n((Object[]) obj2, i4, 0, dVar.f327589a, dVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
            return s2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: o */
    public final void mo160665o(Object[] objArr, int i, E e) {
        int N = mo160652N();
        Object[] s = mo160669s(this.f327600j);
        if (N < 32) {
            C110821n.m150963j(this.f327600j, s, i + 1, i, N);
            s[i] = e;
            this.f327599i = objArr;
            this.f327600j = s;
            this.f327601n = mo53207f() + 1;
            return;
        }
        Object[] objArr2 = this.f327600j;
        Object obj = objArr2[31];
        C110821n.m150963j(objArr2, s, i + 1, i, 31);
        s[i] = e;
        mo160641C(objArr, s, mo160673v(obj));
    }

    /* renamed from: p */
    public final boolean mo160666p(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f327598h;
    }

    /* renamed from: r */
    public final ListIterator<Object[]> mo160667r(int i) {
        if (this.f327599i != null) {
            int K = mo160649K() >> 5;
            C110092c.m149676b(i, K);
            int i2 = this.f327597g;
            if (i2 == 0) {
                Object[] objArr = this.f327599i;
                C87412m.m108591d(objArr);
                return new C109450i(objArr, i);
            }
            Object[] objArr2 = this.f327599i;
            C87412m.m108591d(objArr2);
            return new C109452k(objArr2, i, K, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return mo160646H(new C34453a(collection));
    }

    /* renamed from: s */
    public final Object[] mo160669s(Object[] objArr) {
        if (objArr == null) {
            return mo160672u();
        }
        if (mo160666p(objArr)) {
            return objArr;
        }
        Object[] u = mo160672u();
        int length = objArr.length;
        C110821n.m150966m(objArr, u, 0, 0, length > 32 ? 32 : length, 6, (Object) null);
        return u;
    }

    public E set(int i, E e) {
        C110092c.m149675a(i, mo53207f());
        if (mo160649K() <= i) {
            E[] s = mo160669s(this.f327600j);
            if (s != this.f327600j) {
                this.modCount++;
            }
            int i2 = i & 31;
            E e2 = s[i2];
            s[i2] = e;
            this.f327600j = s;
            return e2;
        }
        C109445d dVar = new C109445d((Object) null);
        Object[] objArr = this.f327599i;
        C87412m.m108591d(objArr);
        this.f327599i = mo160650L(objArr, this.f327597g, i, e, dVar);
        return dVar.f327589a;
    }

    /* renamed from: t */
    public final Object[] mo160671t(Object[] objArr, int i) {
        if (mo160666p(objArr)) {
            C110821n.m150963j(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] u = mo160672u();
        C110821n.m150963j(objArr, u, i, 0, 32 - i);
        return u;
    }

    /* renamed from: u */
    public final Object[] mo160672u() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f327598h;
        return objArr;
    }

    /* renamed from: v */
    public final Object[] mo160673v(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f327598h;
        return objArr;
    }

    /* renamed from: w */
    public final Object[] mo160674w(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object[] objArr2 = objArr[i3];
            if (objArr2 != null) {
                Object w = mo160674w(objArr2, i, i2 - 5);
                if (i3 < 31) {
                    int i4 = i3 + 1;
                    if (objArr[i4] != null) {
                        if (mo160666p(objArr)) {
                            Arrays.fill(objArr, i4, 32, (Object) null);
                        }
                        Object[] u = mo160672u();
                        C110821n.m150963j(objArr, u, 0, 0, i4);
                        objArr = u;
                    }
                }
                if (w == objArr[i3]) {
                    return objArr;
                }
                Object[] s = mo160669s(objArr);
                s[i3] = w;
                return s;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
    }

    /* renamed from: x */
    public final Object[] mo160675x(Object[] objArr, int i, int i2, C109445d dVar) {
        Object[] objArr2;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            dVar.f327589a = objArr[i3];
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[i3];
            if (objArr3 != null) {
                objArr2 = mo160675x(objArr3, i - 5, i2, dVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        if (objArr2 == null && i3 == 0) {
            return null;
        }
        Object[] s = mo160669s(objArr);
        s[i3] = objArr2;
        return s;
    }

    /* renamed from: y */
    public final void mo160676y(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f327599i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f327600j = objArr;
            this.f327601n = i;
            this.f327597g = i2;
            return;
        }
        C109445d dVar = new C109445d((Object) null);
        C87412m.m108591d(objArr);
        Object[] x = mo160675x(objArr, i2, i, dVar);
        C87412m.m108591d(x);
        Object obj = dVar.f327589a;
        if (obj != null) {
            this.f327600j = (Object[]) obj;
            this.f327601n = i;
            if (x[1] == null) {
                this.f327599i = (Object[]) x[0];
                this.f327597g = i2 - 5;
                return;
            }
            this.f327599i = x;
            this.f327597g = i2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: z */
    public final Object[] mo160677z(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (!(i2 >= 0)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (i2 == 0) {
                return it.next();
            } else {
                Object[] s = mo160669s(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                s[i3] = mo160677z((Object[]) s[i3], i, i4, it);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it.hasNext()) {
                        return s;
                    }
                    s[i3] = mo160677z((Object[]) s[i3], 0, i4, it);
                }
                return s;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public boolean add(E e) {
        this.modCount++;
        int N = mo160652N();
        if (N < 32) {
            Object[] s = mo160669s(this.f327600j);
            s[N] = e;
            this.f327600j = s;
            this.f327601n = mo53207f() + 1;
        } else {
            mo160641C(this.f327599i, this.f327600j, mo160673v(e));
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int N = mo160652N();
        Iterator<? extends E> it = collection.iterator();
        if (32 - N >= collection.size()) {
            Object[] s = mo160669s(this.f327600j);
            mo160659k(s, N, it);
            this.f327600j = s;
            this.f327601n = mo53207f() + collection.size();
        } else {
            int size = ((collection.size() + N) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] s2 = mo160669s(this.f327600j);
            mo160659k(s2, N, it);
            objArr[0] = s2;
            for (int i = 1; i < size; i++) {
                Object[] u = mo160672u();
                mo160659k(u, 0, it);
                objArr[i] = u;
            }
            this.f327599i = mo160640A(this.f327599i, mo160649K(), objArr);
            Object[] u2 = mo160672u();
            mo160659k(u2, 0, it);
            this.f327600j = u2;
            this.f327601n = mo53207f() + collection.size();
        }
        return true;
    }
}
