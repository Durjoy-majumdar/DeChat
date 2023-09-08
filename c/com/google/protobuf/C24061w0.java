package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.w0 */
public final class C24061w0 extends C23817d<Long> implements C23908o0.C23918i, RandomAccess, C24064x1 {

    /* renamed from: g */
    public static final C24061w0 f69185g;

    /* renamed from: e */
    public long[] f69186e;

    /* renamed from: f */
    public int f69187f;

    static {
        C24061w0 w0Var = new C24061w0(new long[0], 0);
        f69185g = w0Var;
        w0Var.f68221d = false;
    }

    public C24061w0() {
        this(new long[10], 0);
    }

    public void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo37528f();
        if (i < 0 || i > (i2 = this.f69187f)) {
            throw new IndexOutOfBoundsException(mo38396l(i));
        }
        long[] jArr = this.f69186e;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f69186e, i, jArr2, i + 1, this.f69187f - i);
            this.f69186e = jArr2;
        }
        this.f69186e[i] = longValue;
        this.f69187f++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo37528f();
        Charset charset = C23908o0.f68505a;
        collection.getClass();
        if (!(collection instanceof C24061w0)) {
            return super.addAll(collection);
        }
        C24061w0 w0Var = (C24061w0) collection;
        int i = w0Var.f69187f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f69187f;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f69186e;
            if (i3 > jArr.length) {
                this.f69186e = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(w0Var.f69186e, 0, this.f69186e, this.f69187f, w0Var.f69187f);
            this.f69187f = i3;
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
        if (!(obj instanceof C24061w0)) {
            return super.equals(obj);
        }
        C24061w0 w0Var = (C24061w0) obj;
        if (this.f69187f != w0Var.f69187f) {
            return false;
        }
        long[] jArr = w0Var.f69186e;
        for (int i = 0; i < this.f69187f; i++) {
            if (this.f69186e[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        return Long.valueOf(mo38395k(i));
    }

    /* renamed from: h */
    public void mo38392h(long j) {
        mo37528f();
        int i = this.f69187f;
        long[] jArr = this.f69186e;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f69186e = jArr2;
        }
        long[] jArr3 = this.f69186e;
        int i2 = this.f69187f;
        this.f69187f = i2 + 1;
        jArr3[i2] = j;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f69187f; i2++) {
            i = (i * 31) + C23908o0.m29424b(this.f69186e[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo38393i(int i) {
        if (i < 0 || i >= this.f69187f) {
            throw new IndexOutOfBoundsException(mo38396l(i));
        }
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f69187f;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f69186e[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public long mo38395k(int i) {
        mo38393i(i);
        return this.f69186e[i];
    }

    /* renamed from: l */
    public final String mo38396l(int i) {
        int i2 = this.f69187f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: m */
    public C23908o0.C23918i mo37467E0(int i) {
        if (i >= this.f69187f) {
            return new C24061w0(Arrays.copyOf(this.f69186e, i), this.f69187f);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo37528f();
        for (int i = 0; i < this.f69187f; i++) {
            if (obj.equals(Long.valueOf(this.f69186e[i]))) {
                long[] jArr = this.f69186e;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f69187f - i) - 1);
                this.f69187f--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo37528f();
        if (i2 >= i) {
            long[] jArr = this.f69186e;
            System.arraycopy(jArr, i2, jArr, i, this.f69187f - i2);
            this.f69187f -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo37528f();
        mo38393i(i);
        long[] jArr = this.f69186e;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public int size() {
        return this.f69187f;
    }

    public C24061w0(long[] jArr, int i) {
        this.f69186e = jArr;
        this.f69187f = i;
    }

    public Object remove(int i) {
        mo37528f();
        mo38393i(i);
        long[] jArr = this.f69186e;
        long j = jArr[i];
        int i2 = this.f69187f;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f69187f--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public boolean add(Object obj) {
        mo38392h(((Long) obj).longValue());
        return true;
    }
}
