package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.a2 */
public final class C23808a2<E> extends C23817d<E> implements RandomAccess {

    /* renamed from: g */
    public static final C23808a2<Object> f68212g;

    /* renamed from: e */
    public E[] f68213e;

    /* renamed from: f */
    public int f68214f;

    static {
        C23808a2<Object> a2Var = new C23808a2<>(new Object[0], 0);
        f68212g = a2Var;
        a2Var.f68221d = false;
    }

    public C23808a2(E[] eArr, int i) {
        this.f68213e = eArr;
        this.f68214f = i;
    }

    /* renamed from: E0 */
    public C23908o0.C23919j mo37467E0(int i) {
        if (i >= this.f68214f) {
            return new C23808a2(Arrays.copyOf(this.f68213e, i), this.f68214f);
        }
        throw new IllegalArgumentException();
    }

    public boolean add(E e) {
        mo37528f();
        int i = this.f68214f;
        E[] eArr = this.f68213e;
        if (i == eArr.length) {
            this.f68213e = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f68213e;
        int i2 = this.f68214f;
        this.f68214f = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        mo37471h(i);
        return this.f68213e[i];
    }

    /* renamed from: h */
    public final void mo37471h(int i) {
        if (i < 0 || i >= this.f68214f) {
            throw new IndexOutOfBoundsException(mo37472i(i));
        }
    }

    /* renamed from: i */
    public final String mo37472i(int i) {
        int i2 = this.f68214f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public E remove(int i) {
        mo37528f();
        mo37471h(i);
        E[] eArr = this.f68213e;
        E e = eArr[i];
        int i2 = this.f68214f;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f68214f--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo37528f();
        mo37471h(i);
        E[] eArr = this.f68213e;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f68214f;
    }

    public void add(int i, E e) {
        int i2;
        mo37528f();
        if (i < 0 || i > (i2 = this.f68214f)) {
            throw new IndexOutOfBoundsException(mo37472i(i));
        }
        E[] eArr = this.f68213e;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f68213e, i, eArr2, i + 1, this.f68214f - i);
            this.f68213e = eArr2;
        }
        this.f68213e[i] = e;
        this.f68214f++;
        this.modCount++;
    }
}
