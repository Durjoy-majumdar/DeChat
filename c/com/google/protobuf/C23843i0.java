package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.i0 */
public final class C23843i0 extends C23817d<Float> implements C23908o0.C23914f, RandomAccess, C24064x1 {

    /* renamed from: g */
    public static final C23843i0 f68335g;

    /* renamed from: e */
    public float[] f68336e;

    /* renamed from: f */
    public int f68337f;

    static {
        C23843i0 i0Var = new C23843i0(new float[0], 0);
        f68335g = i0Var;
        i0Var.f68221d = false;
    }

    public C23843i0() {
        this(new float[10], 0);
    }

    public void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo37528f();
        if (i < 0 || i > (i2 = this.f68337f)) {
            throw new IndexOutOfBoundsException(mo37697k(i));
        }
        float[] fArr = this.f68336e;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f68336e, i, fArr2, i + 1, this.f68337f - i);
            this.f68336e = fArr2;
        }
        this.f68336e[i] = floatValue;
        this.f68337f++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo37528f();
        Charset charset = C23908o0.f68505a;
        collection.getClass();
        if (!(collection instanceof C23843i0)) {
            return super.addAll(collection);
        }
        C23843i0 i0Var = (C23843i0) collection;
        int i = i0Var.f68337f;
        if (i == 0) {
            return false;
        }
        int i2 = this.f68337f;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f68336e;
            if (i3 > fArr.length) {
                this.f68336e = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(i0Var.f68336e, 0, this.f68336e, this.f68337f, i0Var.f68337f);
            this.f68337f = i3;
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
        if (!(obj instanceof C23843i0)) {
            return super.equals(obj);
        }
        C23843i0 i0Var = (C23843i0) obj;
        if (this.f68337f != i0Var.f68337f) {
            return false;
        }
        float[] fArr = i0Var.f68336e;
        for (int i = 0; i < this.f68337f; i++) {
            if (Float.floatToIntBits(this.f68336e[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo37695i(i);
        return Float.valueOf(this.f68336e[i]);
    }

    /* renamed from: h */
    public void mo37694h(float f) {
        mo37528f();
        int i = this.f68337f;
        float[] fArr = this.f68336e;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f68336e = fArr2;
        }
        float[] fArr3 = this.f68336e;
        int i2 = this.f68337f;
        this.f68337f = i2 + 1;
        fArr3[i2] = f;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f68337f; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f68336e[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo37695i(int i) {
        if (i < 0 || i >= this.f68337f) {
            throw new IndexOutOfBoundsException(mo37697k(i));
        }
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f68337f;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f68336e[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final String mo37697k(int i) {
        int i2 = this.f68337f;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: l */
    public C23908o0.C23914f mo37467E0(int i) {
        if (i >= this.f68337f) {
            return new C23843i0(Arrays.copyOf(this.f68336e, i), this.f68337f);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        mo37528f();
        for (int i = 0; i < this.f68337f; i++) {
            if (obj.equals(Float.valueOf(this.f68336e[i]))) {
                float[] fArr = this.f68336e;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f68337f - i) - 1);
                this.f68337f--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public void removeRange(int i, int i2) {
        mo37528f();
        if (i2 >= i) {
            float[] fArr = this.f68336e;
            System.arraycopy(fArr, i2, fArr, i, this.f68337f - i2);
            this.f68337f -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo37528f();
        mo37695i(i);
        float[] fArr = this.f68336e;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public int size() {
        return this.f68337f;
    }

    public C23843i0(float[] fArr, int i) {
        this.f68336e = fArr;
        this.f68337f = i;
    }

    public Object remove(int i) {
        mo37528f();
        mo37695i(i);
        float[] fArr = this.f68336e;
        float f = fArr[i];
        int i2 = this.f68337f;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f68337f--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public boolean add(Object obj) {
        mo37694h(((Float) obj).floatValue());
        return true;
    }
}
