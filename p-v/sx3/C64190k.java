package sx3;

import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: sx3.k */
public final class C64190k<E> extends C64185f<E> {

    /* renamed from: g */
    public static final Object[] f181913g = new Object[0];

    /* renamed from: d */
    public int f181914d;

    /* renamed from: e */
    public Object[] f181915e;

    /* renamed from: f */
    public int f181916f;

    /* renamed from: sx3.k$a */
    public static final class C64191a {
        public C64191a(C8480h hVar) {
        }
    }

    static {
        new C64191a((C8480h) null);
    }

    public C64190k(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f181913g;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f181915e = objArr;
    }

    public void add(int i, E e) {
        int i2 = this.f181916f;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        } else if (i == i2) {
            addLast(e);
        } else if (i == 0) {
            mo89005l(i2 + 1);
            int i3 = this.f181914d;
            int E = i3 == 0 ? C110823p.m150979E(this.f181915e) : i3 - 1;
            this.f181914d = E;
            this.f181915e[E] = e;
            this.f181916f++;
        } else {
            mo89005l(i2 + 1);
            int n = mo89008n(this.f181914d + i);
            int i4 = this.f181916f;
            if (i < ((i4 + 1) >> 1)) {
                int E2 = n == 0 ? C110823p.m150979E(this.f181915e) : n - 1;
                int i5 = this.f181914d;
                int E3 = i5 == 0 ? C110823p.m150979E(this.f181915e) : i5 - 1;
                int i6 = this.f181914d;
                if (E2 >= i6) {
                    Object[] objArr = this.f181915e;
                    objArr[E3] = objArr[i6];
                    C110821n.m150963j(objArr, objArr, i6, i6 + 1, E2 + 1);
                } else {
                    Object[] objArr2 = this.f181915e;
                    C110821n.m150963j(objArr2, objArr2, i6 - 1, i6, objArr2.length);
                    Object[] objArr3 = this.f181915e;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C110821n.m150963j(objArr3, objArr3, 0, 1, E2 + 1);
                }
                this.f181915e[E2] = e;
                this.f181914d = E3;
            } else {
                int n2 = mo89008n(this.f181914d + i4);
                if (n < n2) {
                    Object[] objArr4 = this.f181915e;
                    C110821n.m150963j(objArr4, objArr4, n + 1, n, n2);
                } else {
                    Object[] objArr5 = this.f181915e;
                    C110821n.m150963j(objArr5, objArr5, 1, 0, n2);
                    Object[] objArr6 = this.f181915e;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C110821n.m150963j(objArr6, objArr6, n + 1, n, objArr6.length - 1);
                }
                this.f181915e[n] = e;
            }
            this.f181916f++;
        }
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        int i2 = this.f181916f;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        } else if (collection.isEmpty()) {
            return false;
        } else {
            int i3 = this.f181916f;
            if (i == i3) {
                return addAll(collection);
            }
            mo89005l(i3 + collection.size());
            int n = mo89008n(this.f181914d + this.f181916f);
            int n2 = mo89008n(this.f181914d + i);
            int size = collection.size();
            if (i < ((this.f181916f + 1) >> 1)) {
                int i4 = this.f181914d;
                int i5 = i4 - size;
                if (n2 < i4) {
                    Object[] objArr = this.f181915e;
                    C110821n.m150963j(objArr, objArr, i5, i4, objArr.length);
                    if (size >= n2) {
                        Object[] objArr2 = this.f181915e;
                        C110821n.m150963j(objArr2, objArr2, objArr2.length - size, 0, n2);
                    } else {
                        Object[] objArr3 = this.f181915e;
                        C110821n.m150963j(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f181915e;
                        C110821n.m150963j(objArr4, objArr4, 0, size, n2);
                    }
                } else if (i5 >= 0) {
                    Object[] objArr5 = this.f181915e;
                    C110821n.m150963j(objArr5, objArr5, i5, i4, n2);
                } else {
                    Object[] objArr6 = this.f181915e;
                    i5 += objArr6.length;
                    int i6 = n2 - i4;
                    int length = objArr6.length - i5;
                    if (length >= i6) {
                        C110821n.m150963j(objArr6, objArr6, i5, i4, n2);
                    } else {
                        C110821n.m150963j(objArr6, objArr6, i5, i4, i4 + length);
                        Object[] objArr7 = this.f181915e;
                        C110821n.m150963j(objArr7, objArr7, 0, this.f181914d + length, n2);
                    }
                }
                this.f181914d = i5;
                int i7 = n2 - size;
                if (i7 < 0) {
                    i7 += this.f181915e.length;
                }
                mo89004k(i7, collection);
            } else {
                int i8 = n2 + size;
                if (n2 < n) {
                    int i9 = size + n;
                    Object[] objArr8 = this.f181915e;
                    if (i9 <= objArr8.length) {
                        C110821n.m150963j(objArr8, objArr8, i8, n2, n);
                    } else if (i8 >= objArr8.length) {
                        C110821n.m150963j(objArr8, objArr8, i8 - objArr8.length, n2, n);
                    } else {
                        int length2 = n - (i9 - objArr8.length);
                        C110821n.m150963j(objArr8, objArr8, 0, length2, n);
                        Object[] objArr9 = this.f181915e;
                        C110821n.m150963j(objArr9, objArr9, i8, n2, length2);
                    }
                } else {
                    Object[] objArr10 = this.f181915e;
                    C110821n.m150963j(objArr10, objArr10, size, 0, n);
                    Object[] objArr11 = this.f181915e;
                    if (i8 >= objArr11.length) {
                        C110821n.m150963j(objArr11, objArr11, i8 - objArr11.length, n2, objArr11.length);
                    } else {
                        C110821n.m150963j(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.f181915e;
                        C110821n.m150963j(objArr12, objArr12, i8, n2, objArr12.length - size);
                    }
                }
                mo89004k(n2, collection);
            }
            return true;
        }
    }

    public final void addLast(E e) {
        mo89005l(mo53207f() + 1);
        this.f181915e[mo89008n(this.f181914d + mo53207f())] = e;
        this.f181916f = mo53207f() + 1;
    }

    public void clear() {
        int n = mo89008n(this.f181914d + mo53207f());
        int i = this.f181914d;
        if (i < n) {
            C110821n.m150968o(this.f181915e, null, i, n);
        } else if (!isEmpty()) {
            Object[] objArr = this.f181915e;
            C110821n.m150968o(objArr, null, this.f181914d, objArr.length);
            C110821n.m150968o(this.f181915e, null, 0, n);
        }
        this.f181914d = 0;
        this.f181916f = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: f */
    public int mo53207f() {
        return this.f181916f;
    }

    public E get(int i) {
        int f = mo53207f();
        if (i >= 0 && i < f) {
            return this.f181915e[mo89008n(this.f181914d + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + f);
    }

    /* renamed from: i */
    public E mo53210i(int i) {
        int f = mo53207f();
        if (i < 0 || i >= f) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + f);
        } else if (i == C64197v.m75536e(this)) {
            if (!isEmpty()) {
                int n = mo89008n(this.f181914d + C64197v.m75536e(this));
                E[] eArr = this.f181915e;
                E e = eArr[n];
                eArr[n] = null;
                this.f181916f = mo53207f() - 1;
                return e;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i == 0) {
            return removeFirst();
        } else {
            int n2 = mo89008n(this.f181914d + i);
            E e2 = this.f181915e[n2];
            if (i < (mo53207f() >> 1)) {
                int i2 = this.f181914d;
                if (n2 >= i2) {
                    Object[] objArr = this.f181915e;
                    C110821n.m150963j(objArr, objArr, i2 + 1, i2, n2);
                } else {
                    Object[] objArr2 = this.f181915e;
                    C110821n.m150963j(objArr2, objArr2, 1, 0, n2);
                    Object[] objArr3 = this.f181915e;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i3 = this.f181914d;
                    C110821n.m150963j(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
                }
                Object[] objArr4 = this.f181915e;
                int i4 = this.f181914d;
                objArr4[i4] = null;
                this.f181914d = mo89007m(i4);
            } else {
                int n3 = mo89008n(this.f181914d + C64197v.m75536e(this));
                if (n2 <= n3) {
                    Object[] objArr5 = this.f181915e;
                    C110821n.m150963j(objArr5, objArr5, n2, n2 + 1, n3 + 1);
                } else {
                    Object[] objArr6 = this.f181915e;
                    C110821n.m150963j(objArr6, objArr6, n2, n2 + 1, objArr6.length);
                    Object[] objArr7 = this.f181915e;
                    objArr7[objArr7.length - 1] = objArr7[0];
                    C110821n.m150963j(objArr7, objArr7, 0, 1, n3 + 1);
                }
                this.f181915e[n3] = null;
            }
            this.f181916f = mo53207f() - 1;
            return e2;
        }
    }

    public int indexOf(Object obj) {
        int i;
        int n = mo89008n(this.f181914d + mo53207f());
        int i2 = this.f181914d;
        if (i2 < n) {
            while (i2 < n) {
                if (C87412m.m108589b(obj, this.f181915e[i2])) {
                    i = this.f181914d;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < n) {
            return -1;
        } else {
            int length = this.f181915e.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < n) {
                        if (C87412m.m108589b(obj, this.f181915e[i3])) {
                            i2 = i3 + this.f181915e.length;
                            i = this.f181914d;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (C87412m.m108589b(obj, this.f181915e[i2])) {
                    i = this.f181914d;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public boolean isEmpty() {
        return mo53207f() == 0;
    }

    /* renamed from: k */
    public final void mo89004k(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f181915e.length;
        while (i < length && it.hasNext()) {
            this.f181915e[i] = it.next();
            i++;
        }
        int i2 = this.f181914d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f181915e[i3] = it.next();
        }
        this.f181916f = mo53207f() + collection.size();
    }

    /* renamed from: l */
    public final void mo89005l(int i) {
        if (i >= 0) {
            Object[] objArr = this.f181915e;
            if (i > objArr.length) {
                if (objArr == f181913g) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.f181915e = new Object[i];
                    return;
                }
                int length = objArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - 2147483639 > 0) {
                    i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                Object[] objArr2 = new Object[i2];
                C110821n.m150963j(objArr, objArr2, 0, this.f181914d, objArr.length);
                Object[] objArr3 = this.f181915e;
                int length2 = objArr3.length;
                int i3 = this.f181914d;
                C110821n.m150963j(objArr3, objArr2, length2 - i3, 0, i3);
                this.f181914d = 0;
                this.f181915e = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        int n = mo89008n(this.f181914d + mo53207f());
        int i3 = this.f181914d;
        if (i3 < n) {
            i = n - 1;
            if (i3 <= i) {
                while (!C87412m.m108589b(obj, this.f181915e[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f181914d;
            }
            return -1;
        }
        if (i3 > n) {
            int i4 = n - 1;
            while (true) {
                if (-1 >= i4) {
                    int E = C110823p.m150979E(this.f181915e);
                    int i5 = this.f181914d;
                    if (i5 <= E) {
                        while (!C87412m.m108589b(obj, this.f181915e[i])) {
                            if (i != i5) {
                                E = i - 1;
                            }
                        }
                        i2 = this.f181914d;
                    }
                } else if (C87412m.m108589b(obj, this.f181915e[i4])) {
                    i = i4 + this.f181915e.length;
                    i2 = this.f181914d;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    /* renamed from: m */
    public final int mo89007m(int i) {
        if (i == C110823p.m150979E(this.f181915e)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: n */
    public final int mo89008n(int i) {
        Object[] objArr = this.f181915e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        mo53210i(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            gy3.C87412m.m108594g(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f181915e
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f181914d
            int r3 = r11.f181916f
            int r0 = r0 + r3
            int r0 = r11.mo89008n(r0)
            int r3 = r11.f181914d
            r4 = 0
            if (r3 >= r0) goto L_0x0047
            r5 = r3
        L_0x0028:
            if (r3 >= r0) goto L_0x0041
            java.lang.Object[] r6 = r11.f181915e
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003d
            java.lang.Object[] r7 = r11.f181915e
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0041:
            java.lang.Object[] r12 = r11.f181915e
            sx3.C110821n.m150968o(r12, r4, r5, r0)
            goto L_0x0089
        L_0x0047:
            java.lang.Object[] r5 = r11.f181915e
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004c:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f181915e
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f181915e
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = 1
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x0067:
            int r3 = r11.mo89008n(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0088
            java.lang.Object[] r3 = r11.f181915e
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0084
            java.lang.Object[] r3 = r11.f181915e
            r3[r5] = r6
            int r5 = r11.mo89007m(r5)
            goto L_0x0085
        L_0x0084:
            r7 = 1
        L_0x0085:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0088:
            r1 = r7
        L_0x0089:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f181914d
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0094
            java.lang.Object[] r12 = r11.f181915e
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0094:
            r11.f181916f = r5
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sx3.C64190k.removeAll(java.util.Collection):boolean");
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f181915e;
            int i = this.f181914d;
            E e = eArr[i];
            eArr[i] = null;
            this.f181914d = mo89007m(i);
            this.f181916f = mo53207f() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            gy3.C87412m.m108594g(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f181915e
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f181914d
            int r3 = r11.f181916f
            int r0 = r0 + r3
            int r0 = r11.mo89008n(r0)
            int r3 = r11.f181914d
            r4 = 0
            if (r3 >= r0) goto L_0x0046
            r5 = r3
        L_0x0028:
            if (r3 >= r0) goto L_0x0040
            java.lang.Object[] r6 = r11.f181915e
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003c
            java.lang.Object[] r7 = r11.f181915e
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003d
        L_0x003c:
            r1 = 1
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0040:
            java.lang.Object[] r12 = r11.f181915e
            sx3.C110821n.m150968o(r12, r4, r5, r0)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f181915e
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004b:
            if (r3 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f181915e
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f181915e
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0065:
            int r3 = r11.mo89008n(r6)
            r5 = r3
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r3 = r11.f181915e
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0081
            java.lang.Object[] r3 = r11.f181915e
            r3[r5] = r6
            int r5 = r11.mo89007m(r5)
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f181914d
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0091
            java.lang.Object[] r12 = r11.f181915e
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0091:
            r11.f181916f = r5
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sx3.C64190k.retainAll(java.util.Collection):boolean");
    }

    public E set(int i, E e) {
        int f = mo53207f();
        if (i < 0 || i >= f) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + f);
        }
        int n = mo89008n(this.f181914d + i);
        E[] eArr = this.f181915e;
        E e2 = eArr[n];
        eArr[n] = e;
        return e2;
    }

    public Object[] toArray() {
        return toArray(new Object[mo53207f()]);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        if (tArr.length < mo53207f()) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), mo53207f());
            C87412m.m108592e(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (Object[]) newInstance;
        }
        int n = mo89008n(this.f181914d + mo53207f());
        int i = this.f181914d;
        if (i < n) {
            C110821n.m150966m(this.f181915e, tArr, 0, i, n, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f181915e;
            C110821n.m150963j(objArr, tArr, 0, this.f181914d, objArr.length);
            Object[] objArr2 = this.f181915e;
            C110821n.m150963j(objArr2, tArr, objArr2.length - this.f181914d, 0, n);
        }
        if (tArr.length > mo53207f()) {
            tArr[mo53207f()] = null;
        }
        return tArr;
    }

    public C64190k() {
        this.f181915e = f181913g;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        mo89005l(mo53207f() + collection.size());
        mo89004k(mo89008n(this.f181914d + mo53207f()), collection);
        return true;
    }
}
