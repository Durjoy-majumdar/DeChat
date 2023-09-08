package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.u */
public final class C24047u extends C23817d<Double> implements C23908o0.C23910b, RandomAccess, C24064x1 {

    /* renamed from: g */
    public static final C24047u f69165g;

    /* renamed from: e */
    public double[] f69166e;

    /* renamed from: f */
    public int f69167f;

    static {
        C24047u uVar = new C24047u(new double[0], 0);
        f69165g = uVar;
        uVar.f68221d = false;
    }

    public C24047u() {
        this(new double[10], 0);
    }

    public void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo37528f();
        if (i < 0 || i > (i2 = this.f69167f)) {
            throw new IndexOutOfBoundsException(mo38371k(i));
        }
        double[] dArr = this.f69166e;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f69166e, i, dArr2, i + 1, this.f69167f - i);
            this.f69166e = dArr2;
        }
        this.f69166e[i] = doubleValue;
        this.f69167f++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo37528f();
        Charset charset = C23908o0.f68505a;
        collection.getClass();
        if (!(collection instanceof C24047u)) {
            return super.addAll(collection);
        }
        C24047u uVar = (C24047u) collection;
        int i = uVar.f69167f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f69167f;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f69166e;
            if (i3 > dArr.length) {
                this.f69166e = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(uVar.f69166e, 0, this.f69166e, this.f69167f, uVar.f69167f);
            this.f69167f = i3;
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
        if (!(obj instanceof C24047u)) {
            return super.equals(obj);
        }
        C24047u uVar = (C24047u) obj;
        if (this.f69167f != uVar.f69167f) {
            return false;
        }
        double[] dArr = uVar.f69166e;
        for (int i = 0; i < this.f69167f; i++) {
            if (Double.doubleToLongBits(this.f69166e[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo38369i(i);
        return Double.valueOf(this.f69166e[i]);
    }

    /* renamed from: h */
    public void mo38368h(double d) {
        mo37528f();
        int i = this.f69167f;
        double[] dArr = this.f69166e;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f69166e = dArr2;
        }
        double[] dArr3 = this.f69166e;
        int i2 = this.f69167f;
        this.f69167f = i2 + 1;
        dArr3[i2] = d;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f69167f; i2++) {
            i = (i * 31) + C23908o0.m29424b(Double.doubleToLongBits(this.f69166e[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public final void mo38369i(int i) {
        if (i < 0 || i >= this.f69167f) {
            throw new IndexOutOfBoundsException(mo38371k(i));
        }
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f69167f;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f69166e[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo38371k(int i) {
        int i2 = this.f69167f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: l */
    public C23908o0.C23910b mo37467E0(int i) {
        if (i >= this.f69167f) {
            return new C24047u(Arrays.copyOf(this.f69166e, i), this.f69167f);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo37528f();
        for (int i = 0; i < this.f69167f; i++) {
            if (obj.equals(Double.valueOf(this.f69166e[i]))) {
                double[] dArr = this.f69166e;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f69167f - i) - 1);
                this.f69167f--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo37528f();
        if (i2 >= i) {
            double[] dArr = this.f69166e;
            System.arraycopy(dArr, i2, dArr, i, this.f69167f - i2);
            this.f69167f -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo37528f();
        mo38369i(i);
        double[] dArr = this.f69166e;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public int size() {
        return this.f69167f;
    }

    public C24047u(double[] dArr, int i) {
        this.f69166e = dArr;
        this.f69167f = i;
    }

    public Object remove(int i) {
        mo37528f();
        mo38369i(i);
        double[] dArr = this.f69166e;
        double d = dArr[i];
        int i2 = this.f69167f;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f69167f--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public boolean add(Object obj) {
        mo38368h(((Double) obj).doubleValue());
        return true;
    }
}
