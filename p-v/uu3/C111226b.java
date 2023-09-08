package uu3;

/* renamed from: uu3.b */
public class C111226b implements Cloneable {

    /* renamed from: g */
    public static final int[] f333060g = new int[0];

    /* renamed from: d */
    public int[] f333061d;

    /* renamed from: e */
    public int[] f333062e;

    /* renamed from: f */
    public int f333063f;

    public C111226b() {
        this(10);
    }

    /* renamed from: a */
    public void mo162974a(int i, int i2) {
        int i3 = this.f333063f;
        if (i3 == 0 || i > this.f333061d[i3 - 1]) {
            this.f333061d = mo162975b(this.f333061d, i3, i);
            this.f333062e = mo162975b(this.f333062e, this.f333063f, i2);
            this.f333063f++;
            return;
        }
        mo162980f(i, i2);
    }

    /* renamed from: b */
    public final int[] mo162975b(int[] iArr, int i, int i2) {
        if (i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[(i <= 4 ? 8 : (i >> 1) + i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new IllegalArgumentException("Bad currentSize, originalSize: " + iArr.length + " currentSize: " + i);
    }

    /* renamed from: c */
    public final int mo162976c(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public Object clone() {
        C111226b bVar = null;
        try {
            C111226b bVar2 = (C111226b) super.clone();
            try {
                bVar2.f333061d = (int[]) this.f333061d.clone();
                bVar2.f333062e = (int[]) this.f333062e.clone();
                return bVar2;
            } catch (CloneNotSupportedException unused) {
                bVar = bVar2;
            }
        } catch (CloneNotSupportedException unused2) {
            return bVar;
        }
    }

    /* renamed from: d */
    public int mo162978d(int i) {
        return mo162976c(this.f333061d, this.f333063f, i);
    }

    /* renamed from: e */
    public final int[] mo162979e(int[] iArr, int i, int i2, int i3) {
        if (i > iArr.length) {
            throw new IllegalArgumentException("Bad currentSize, originalSize: " + iArr.length + " currentSize: " + i);
        } else if (i + 1 <= iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i - i2);
            iArr[i2] = i3;
            return iArr;
        } else {
            int[] iArr2 = new int[(i <= 4 ? 8 : i + (i >> 1))];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            iArr2[i2] = i3;
            System.arraycopy(iArr, i2, iArr2, i2 + 1, iArr.length - i2);
            return iArr2;
        }
    }

    /* renamed from: f */
    public void mo162980f(int i, int i2) {
        int c = mo162976c(this.f333061d, this.f333063f, i);
        if (c >= 0) {
            this.f333062e[c] = i2;
            return;
        }
        int i3 = ~c;
        this.f333061d = mo162979e(this.f333061d, this.f333063f, i3, i);
        this.f333062e = mo162979e(this.f333062e, this.f333063f, i3, i2);
        this.f333063f++;
    }

    public String toString() {
        int i = this.f333063f;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f333063f; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f333061d[i2]);
            sb.append('=');
            sb.append(this.f333062e[i2]);
        }
        sb.append('}');
        return sb.toString();
    }

    public C111226b(int i) {
        if (i == 0) {
            int[] iArr = f333060g;
            this.f333061d = iArr;
            this.f333062e = iArr;
        } else {
            int[] iArr2 = new int[i];
            this.f333061d = iArr2;
            this.f333062e = new int[iArr2.length];
        }
        this.f333063f = 0;
    }
}
