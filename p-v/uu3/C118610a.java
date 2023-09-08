package uu3;

/* renamed from: uu3.a */
public class C118610a implements Cloneable {

    /* renamed from: d */
    public int[] f354943d = new int[10];

    /* renamed from: e */
    public boolean[] f354944e = new boolean[10];

    /* renamed from: f */
    public int f354945f = 0;

    /* renamed from: a */
    public boolean mo183354a(int i) {
        int i2;
        int[] iArr = this.f354943d;
        int i3 = this.f354945f - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = ~i4;
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int i5 = iArr[i2];
            if (i5 >= i) {
                if (i5 <= i) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        return i2 >= 0;
    }

    /* renamed from: b */
    public void mo183355b(int i, boolean z) {
        int i2;
        int[] iArr = this.f354943d;
        int i3 = this.f354945f - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= i3) {
                i2 = (i4 + i3) >>> 1;
                int i5 = iArr[i2];
                if (i5 >= i) {
                    if (i5 <= i) {
                        break;
                    }
                    i3 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = ~i4;
                break;
            }
        }
        if (i2 >= 0) {
            this.f354944e[i2] = z;
            return;
        }
        int i6 = ~i2;
        int[] iArr2 = this.f354943d;
        int i7 = this.f354945f;
        if (i7 <= iArr2.length) {
            int i8 = 8;
            if (i7 + 1 <= iArr2.length) {
                System.arraycopy(iArr2, i6, iArr2, i6 + 1, i7 - i6);
                iArr2[i6] = i;
            } else {
                int[] iArr3 = new int[(i7 <= 4 ? 8 : i7 + (i7 >> 1))];
                System.arraycopy(iArr2, 0, iArr3, 0, i6);
                iArr3[i6] = i;
                System.arraycopy(iArr2, i6, iArr3, i6 + 1, iArr2.length - i6);
                iArr2 = iArr3;
            }
            this.f354943d = iArr2;
            boolean[] zArr = this.f354944e;
            int i9 = this.f354945f;
            if (i9 <= zArr.length) {
                if (i9 + 1 <= zArr.length) {
                    System.arraycopy(zArr, i6, zArr, i6 + 1, i9 - i6);
                    zArr[i6] = z;
                } else {
                    if (i9 > 4) {
                        i8 = i9 + (i9 >> 1);
                    }
                    boolean[] zArr2 = new boolean[i8];
                    System.arraycopy(zArr, 0, zArr2, 0, i6);
                    zArr2[i6] = z;
                    System.arraycopy(zArr, i6, zArr2, i6 + 1, zArr.length - i6);
                    zArr = zArr2;
                }
                this.f354944e = zArr;
                this.f354945f++;
                return;
            }
            throw new IllegalArgumentException("Bad currentSize, originalSize: " + zArr.length + " currentSize: " + i9);
        }
        throw new IllegalArgumentException("Bad currentSize, originalSize: " + iArr2.length + " currentSize: " + i7);
    }

    public Object clone() {
        C118610a aVar = null;
        try {
            C118610a aVar2 = (C118610a) super.clone();
            try {
                aVar2.f354943d = (int[]) this.f354943d.clone();
                aVar2.f354944e = (boolean[]) this.f354944e.clone();
                return aVar2;
            } catch (CloneNotSupportedException unused) {
                aVar = aVar2;
            }
        } catch (CloneNotSupportedException unused2) {
            return aVar;
        }
    }

    public String toString() {
        int i = this.f354945f;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f354945f; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f354943d[i2]);
            sb.append('=');
            sb.append(this.f354944e[i2]);
        }
        sb.append('}');
        return sb.toString();
    }
}
