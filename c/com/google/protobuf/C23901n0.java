package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.n0 */
public final class C23901n0 extends C23817d<Integer> implements C23908o0.C23915g, RandomAccess, C24064x1 {

    /* renamed from: g */
    public static final C23901n0 f68496g;

    /* renamed from: e */
    public int[] f68497e;

    /* renamed from: f */
    public int f68498f;

    static {
        C23901n0 n0Var = new C23901n0(new int[0], 0);
        f68496g = n0Var;
        n0Var.f68221d = false;
    }

    public C23901n0() {
        this(new int[10], 0);
    }

    public void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo37528f();
        if (i < 0 || i > (i2 = this.f68498f)) {
            throw new IndexOutOfBoundsException(mo37937l(i));
        }
        int[] iArr = this.f68497e;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f68497e, i, iArr2, i + 1, this.f68498f - i);
            this.f68497e = iArr2;
        }
        this.f68497e[i] = intValue;
        this.f68498f++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo37528f();
        Charset charset = C23908o0.f68505a;
        collection.getClass();
        if (!(collection instanceof C23901n0)) {
            return super.addAll(collection);
        }
        C23901n0 n0Var = (C23901n0) collection;
        int i = n0Var.f68498f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f68498f;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f68497e;
            if (i3 > iArr.length) {
                this.f68497e = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(n0Var.f68497e, 0, this.f68497e, this.f68498f, n0Var.f68498f);
            this.f68498f = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23901n0)) {
            return super.equals(obj);
        }
        C23901n0 n0Var = (C23901n0) obj;
        if (this.f68498f != n0Var.f68498f) {
            return false;
        }
        int[] iArr = n0Var.f68497e;
        for (int i = 0; i < this.f68498f; i++) {
            if (this.f68497e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        return Integer.valueOf(mo37936k(i));
    }

    /* renamed from: h */
    public void mo37933h(int i) {
        mo37528f();
        int i2 = this.f68498f;
        int[] iArr = this.f68497e;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f68497e = iArr2;
        }
        int[] iArr3 = this.f68497e;
        int i3 = this.f68498f;
        this.f68498f = i3 + 1;
        iArr3[i3] = i;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f68498f; i2++) {
            i = (i * 31) + this.f68497e[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void mo37934i(int i) {
        if (i < 0 || i >= this.f68498f) {
            throw new IndexOutOfBoundsException(mo37937l(i));
        }
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f68498f;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f68497e[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public int mo37936k(int i) {
        mo37934i(i);
        return this.f68497e[i];
    }

    /* renamed from: l */
    public final String mo37937l(int i) {
        int i2 = this.f68498f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: m */
    public C23908o0.C23915g mo37467E0(int i) {
        if (i >= this.f68498f) {
            return new C23901n0(Arrays.copyOf(this.f68497e, i), this.f68498f);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public int mo37939n(int i, int i2) {
        mo37528f();
        mo37934i(i);
        int[] iArr = this.f68497e;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public boolean remove(Object obj) {
        mo37528f();
        for (int i = 0; i < this.f68498f; i++) {
            if (obj.equals(Integer.valueOf(this.f68497e[i]))) {
                int[] iArr = this.f68497e;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f68498f - i) - 1);
                this.f68498f--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo37528f();
        if (i2 >= i) {
            int[] iArr = this.f68497e;
            System.arraycopy(iArr, i2, iArr, i, this.f68498f - i2);
            this.f68498f -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        return Integer.valueOf(mo37939n(i, ((Integer) obj).intValue()));
    }

    public int size() {
        return this.f68498f;
    }

    public C23901n0(int[] iArr, int i) {
        this.f68497e = iArr;
        this.f68498f = i;
    }

    public Object remove(int i) {
        mo37528f();
        mo37934i(i);
        int[] iArr = this.f68497e;
        int i2 = iArr[i];
        int i3 = this.f68498f;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f68498f--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public boolean add(Object obj) {
        mo37933h(((Integer) obj).intValue());
        return true;
    }
}
