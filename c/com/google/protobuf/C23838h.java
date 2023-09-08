package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.h */
public final class C23838h extends C23817d<Boolean> implements C23908o0.C23909a, RandomAccess, C24064x1 {

    /* renamed from: g */
    public static final C23838h f68266g;

    /* renamed from: e */
    public boolean[] f68267e;

    /* renamed from: f */
    public int f68268f;

    static {
        C23838h hVar = new C23838h(new boolean[0], 0);
        f68266g = hVar;
        hVar.f68221d = false;
    }

    public C23838h() {
        this(new boolean[10], 0);
    }

    public void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo37528f();
        if (i < 0 || i > (i2 = this.f68268f)) {
            throw new IndexOutOfBoundsException(mo37684k(i));
        }
        boolean[] zArr = this.f68267e;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f68267e, i, zArr2, i + 1, this.f68268f - i);
            this.f68267e = zArr2;
        }
        this.f68267e[i] = booleanValue;
        this.f68268f++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo37528f();
        Charset charset = C23908o0.f68505a;
        collection.getClass();
        if (!(collection instanceof C23838h)) {
            return super.addAll(collection);
        }
        C23838h hVar = (C23838h) collection;
        int i = hVar.f68268f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f68268f;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f68267e;
            if (i3 > zArr.length) {
                this.f68267e = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(hVar.f68267e, 0, this.f68267e, this.f68268f, hVar.f68268f);
            this.f68268f = i3;
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
        if (!(obj instanceof C23838h)) {
            return super.equals(obj);
        }
        C23838h hVar = (C23838h) obj;
        if (this.f68268f != hVar.f68268f) {
            return false;
        }
        boolean[] zArr = hVar.f68267e;
        for (int i = 0; i < this.f68268f; i++) {
            if (this.f68267e[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo37682i(i);
        return Boolean.valueOf(this.f68267e[i]);
    }

    /* renamed from: h */
    public void mo37681h(boolean z) {
        mo37528f();
        int i = this.f68268f;
        boolean[] zArr = this.f68267e;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f68267e = zArr2;
        }
        boolean[] zArr3 = this.f68267e;
        int i2 = this.f68268f;
        this.f68268f = i2 + 1;
        zArr3[i2] = z;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f68268f; i2++) {
            i = (i * 31) + C23908o0.m29423a(this.f68267e[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo37682i(int i) {
        if (i < 0 || i >= this.f68268f) {
            throw new IndexOutOfBoundsException(mo37684k(i));
        }
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f68268f;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f68267e[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo37684k(int i) {
        int i2 = this.f68268f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: l */
    public C23908o0.C23909a mo37467E0(int i) {
        if (i >= this.f68268f) {
            return new C23838h(Arrays.copyOf(this.f68267e, i), this.f68268f);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo37528f();
        for (int i = 0; i < this.f68268f; i++) {
            if (obj.equals(Boolean.valueOf(this.f68267e[i]))) {
                boolean[] zArr = this.f68267e;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f68268f - i) - 1);
                this.f68268f--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo37528f();
        if (i2 >= i) {
            boolean[] zArr = this.f68267e;
            System.arraycopy(zArr, i2, zArr, i, this.f68268f - i2);
            this.f68268f -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo37528f();
        mo37682i(i);
        boolean[] zArr = this.f68267e;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public int size() {
        return this.f68268f;
    }

    public C23838h(boolean[] zArr, int i) {
        this.f68267e = zArr;
        this.f68268f = i;
    }

    public Object remove(int i) {
        mo37528f();
        mo37682i(i);
        boolean[] zArr = this.f68267e;
        boolean z = zArr[i];
        int i2 = this.f68268f;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f68268f--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public boolean add(Object obj) {
        mo37681h(((Boolean) obj).booleanValue());
        return true;
    }
}
