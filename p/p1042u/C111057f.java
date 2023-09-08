package p1042u;

/* renamed from: u.f */
public class C111057f<E> implements Cloneable {

    /* renamed from: h */
    public static final Object f332572h = new Object();

    /* renamed from: d */
    public boolean f332573d = false;

    /* renamed from: e */
    public long[] f332574e;

    /* renamed from: f */
    public Object[] f332575f;

    /* renamed from: g */
    public int f332576g;

    public C111057f() {
        int i = 80;
        int i2 = 4;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f332574e = new long[i4];
        this.f332575f = new Object[i4];
    }

    /* renamed from: a */
    public void mo162750a(long j, E e) {
        int i = this.f332576g;
        if (i == 0 || j > this.f332574e[i - 1]) {
            if (this.f332573d && i >= this.f332574e.length) {
                mo162752c();
            }
            int i2 = this.f332576g;
            if (i2 >= this.f332574e.length) {
                int i3 = (i2 + 1) * 8;
                int i4 = 4;
                while (true) {
                    if (i4 >= 32) {
                        break;
                    }
                    int i5 = (1 << i4) - 12;
                    if (i3 <= i5) {
                        i3 = i5;
                        break;
                    }
                    i4++;
                }
                int i6 = i3 / 8;
                long[] jArr = new long[i6];
                Object[] objArr = new Object[i6];
                long[] jArr2 = this.f332574e;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f332575f;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f332574e = jArr;
                this.f332575f = objArr;
            }
            this.f332574e[i2] = j;
            this.f332575f[i2] = e;
            this.f332576g = i2 + 1;
            return;
        }
        mo162756e(j, e);
    }

    /* renamed from: b */
    public C111057f<E> clone() {
        try {
            C111057f<E> fVar = (C111057f) super.clone();
            fVar.f332574e = (long[]) this.f332574e.clone();
            fVar.f332575f = (Object[]) this.f332575f.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final void mo162752c() {
        int i = this.f332576g;
        long[] jArr = this.f332574e;
        Object[] objArr = this.f332575f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f332572h) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f332573d = false;
        this.f332576g = i2;
    }

    public void clear() {
        int i = this.f332576g;
        Object[] objArr = this.f332575f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f332576g = 0;
        this.f332573d = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f332575f[r3];
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E mo162755d(long r3, E r5) {
        /*
            r2 = this;
            long[] r0 = r2.f332574e
            int r1 = r2.f332576g
            int r3 = p1042u.C111056e.m151430b(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f332575f
            r3 = r4[r3]
            java.lang.Object r4 = f332572h
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p1042u.C111057f.mo162755d(long, java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public void mo162756e(long j, E e) {
        int b = C111056e.m151430b(this.f332574e, this.f332576g, j);
        if (b >= 0) {
            this.f332575f[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f332576g;
        if (i < i2) {
            Object[] objArr = this.f332575f;
            if (objArr[i] == f332572h) {
                this.f332574e[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f332573d && i2 >= this.f332574e.length) {
            mo162752c();
            i = ~C111056e.m151430b(this.f332574e, this.f332576g, j);
        }
        int i3 = this.f332576g;
        if (i3 >= this.f332574e.length) {
            int i4 = (i3 + 1) * 8;
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
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f332574e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f332575f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f332574e = jArr;
            this.f332575f = objArr2;
        }
        int i8 = this.f332576g - i;
        if (i8 != 0) {
            long[] jArr3 = this.f332574e;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f332575f;
            System.arraycopy(objArr4, i, objArr4, i9, this.f332576g - i);
        }
        this.f332574e[i] = j;
        this.f332575f[i] = e;
        this.f332576g++;
    }

    /* renamed from: f */
    public int mo162757f() {
        if (this.f332573d) {
            mo162752c();
        }
        return this.f332576g;
    }

    /* renamed from: g */
    public E mo162758g(int i) {
        if (this.f332573d) {
            mo162752c();
        }
        return this.f332575f[i];
    }

    public String toString() {
        if (mo162757f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f332576g * 28);
        sb.append('{');
        for (int i = 0; i < this.f332576g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f332573d) {
                mo162752c();
            }
            sb.append(this.f332574e[i]);
            sb.append('=');
            Object g = mo162758g(i);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
