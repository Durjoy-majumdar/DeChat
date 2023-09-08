package p1042u;

/* renamed from: u.j */
public class C111060j<E> implements Cloneable {

    /* renamed from: h */
    public static final Object f332584h = new Object();

    /* renamed from: d */
    public boolean f332585d;

    /* renamed from: e */
    public int[] f332586e;

    /* renamed from: f */
    public Object[] f332587f;

    /* renamed from: g */
    public int f332588g;

    public C111060j() {
        this(10);
    }

    /* renamed from: a */
    public void mo162800a(int i, E e) {
        int i2 = this.f332588g;
        if (i2 == 0 || i > this.f332586e[i2 - 1]) {
            if (this.f332585d && i2 >= this.f332586e.length) {
                mo162804d();
            }
            int i3 = this.f332588g;
            if (i3 >= this.f332586e.length) {
                int i4 = (i3 + 1) * 4;
                int i5 = 4;
                while (true) {
                    if (i5 >= 32) {
                        break;
                    }
                    int i6 = (1 << i5) - 12;
                    if (i4 <= i6) {
                        i4 = i6;
                        break;
                    }
                    i5++;
                }
                int i7 = i4 / 4;
                int[] iArr = new int[i7];
                Object[] objArr = new Object[i7];
                int[] iArr2 = this.f332586e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f332587f;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f332586e = iArr;
                this.f332587f = objArr;
            }
            this.f332586e[i3] = i;
            this.f332587f[i3] = e;
            this.f332588g = i3 + 1;
            return;
        }
        mo162807g(i, e);
    }

    /* renamed from: b */
    public C111060j<E> clone() {
        try {
            C111060j<E> jVar = (C111060j) super.clone();
            jVar.f332586e = (int[]) this.f332586e.clone();
            jVar.f332587f = (Object[]) this.f332587f.clone();
            return jVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean mo162802c(int i) {
        if (this.f332585d) {
            mo162804d();
        }
        return C111056e.m151429a(this.f332586e, this.f332588g, i) >= 0;
    }

    /* renamed from: d */
    public final void mo162804d() {
        int i = this.f332588g;
        int[] iArr = this.f332586e;
        Object[] objArr = this.f332587f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f332584h) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f332585d = false;
        this.f332588g = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f332587f[r3];
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E mo162805e(int r3, E r4) {
        /*
            r2 = this;
            int[] r0 = r2.f332586e
            int r1 = r2.f332588g
            int r3 = p1042u.C111056e.m151429a(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f332587f
            r3 = r0[r3]
            java.lang.Object r0 = f332584h
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1042u.C111060j.mo162805e(int, java.lang.Object):java.lang.Object");
    }

    /* renamed from: f */
    public int mo162806f(int i) {
        if (this.f332585d) {
            mo162804d();
        }
        return this.f332586e[i];
    }

    /* renamed from: g */
    public void mo162807g(int i, E e) {
        int a = C111056e.m151429a(this.f332586e, this.f332588g, i);
        if (a >= 0) {
            this.f332587f[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f332588g;
        if (i2 < i3) {
            Object[] objArr = this.f332587f;
            if (objArr[i2] == f332584h) {
                this.f332586e[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f332585d && i3 >= this.f332586e.length) {
            mo162804d();
            i2 = ~C111056e.m151429a(this.f332586e, this.f332588g, i);
        }
        int i4 = this.f332588g;
        if (i4 >= this.f332586e.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f332586e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f332587f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f332586e = iArr;
            this.f332587f = objArr2;
        }
        int i9 = this.f332588g - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f332586e;
            int i15 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i15, i9);
            Object[] objArr4 = this.f332587f;
            System.arraycopy(objArr4, i2, objArr4, i15, this.f332588g - i2);
        }
        this.f332586e[i2] = i;
        this.f332587f[i2] = e;
        this.f332588g++;
    }

    /* renamed from: h */
    public int mo162808h() {
        if (this.f332585d) {
            mo162804d();
        }
        return this.f332588g;
    }

    /* renamed from: j */
    public E mo162809j(int i) {
        if (this.f332585d) {
            mo162804d();
        }
        return this.f332587f[i];
    }

    public String toString() {
        if (mo162808h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f332588g * 28);
        sb.append('{');
        for (int i = 0; i < this.f332588g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo162806f(i));
            sb.append('=');
            Object j = mo162809j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C111060j(int i) {
        this.f332585d = false;
        if (i == 0) {
            this.f332586e = C111056e.f332570a;
            this.f332587f = C111056e.f332571b;
            return;
        }
        int i2 = i * 4;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f332586e = new int[i5];
        this.f332587f = new Object[i5];
    }
}
