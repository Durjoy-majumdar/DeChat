package p291aa;

/* renamed from: aa.g */
public class C23628g<V> extends C23618b implements C23627f {

    /* renamed from: i */
    public transient V[] f67810i;

    /* renamed from: j */
    public transient int[] f67811j;

    /* renamed from: n */
    public final C23627f f67812n = this;

    /* renamed from: u */
    public static boolean m28248u(Object[] objArr, int i) {
        Object obj = objArr[i];
        return (obj == null || obj == C23632k.f67819n) ? false : true;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        C23628g gVar = (C23628g) super.clone();
        gVar.f67810i = (Object[]) this.f67810i.clone();
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if ((r6 == r3 || (r6 != null && r6.equals(r3))) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p291aa.C23628g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            aa.g r9 = (p291aa.C23628g) r9
            int r0 = r9.f67798d
            int r2 = r8.f67798d
            if (r0 == r2) goto L_0x000f
            return r1
        L_0x000f:
            int[] r0 = r8.f67811j
            V[] r2 = r8.f67810i
            int r3 = r0.length
        L_0x0014:
            int r4 = r3 + -1
            r5 = 1
            if (r3 <= 0) goto L_0x0049
            boolean r3 = m28248u(r2, r4)
            if (r3 == 0) goto L_0x0047
            r3 = r0[r4]
            r6 = r2[r4]
            aa.k$a r7 = p291aa.C23632k.f67820o
            if (r6 != r7) goto L_0x0028
            r6 = 0
        L_0x0028:
            int r7 = r9.mo37164s(r3)
            if (r7 < 0) goto L_0x0043
            java.lang.Object r3 = r9.get(r3)
            if (r6 == r3) goto L_0x003f
            if (r6 == 0) goto L_0x003d
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = 0
            goto L_0x0040
        L_0x003f:
            r3 = 1
        L_0x0040:
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 != 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            r3 = r4
            goto L_0x0014
        L_0x0049:
            r1 = 1
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p291aa.C23628g.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo37125f() {
        return this.f67810i.length;
    }

    public final V get(int i) {
        V v;
        int s = mo37164s(i);
        if (s >= 0 && (v = this.f67810i[s]) != C23632k.f67820o) {
            return v;
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f67811j;
        V[] vArr = this.f67810i;
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return i;
            }
            if (m28248u(vArr, i2)) {
                int i3 = iArr[i2];
                V v = vArr[i2];
                if (v == C23632k.f67820o) {
                    v = null;
                }
                ((C23628g) this.f67812n).getClass();
                i += i3 ^ (v == null ? 0 : v.hashCode());
            }
            length = i2;
        }
    }

    /* renamed from: o */
    public void mo37131o(int i) {
        int[] iArr = this.f67811j;
        int length = iArr.length;
        V[] vArr = this.f67810i;
        this.f67811j = new int[i];
        this.f67810i = new Object[i];
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                if (m28248u(vArr, i2)) {
                    int i3 = iArr[i2];
                    int t = mo37165t(i3);
                    this.f67811j[t] = i3;
                    this.f67810i[t] = vArr[i2];
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public void mo37132p(int i) {
        this.f67810i[i] = C23632k.f67819n;
        this.f67798d--;
        this.f67800f++;
        mo37127k();
    }

    /* renamed from: r */
    public int mo37133r(int i) {
        int a = C112762a.m154255a(i);
        mo37128l(a);
        this.f67810i = new Object[a];
        this.f67811j = new int[a];
        return a;
    }

    /* renamed from: s */
    public final int mo37164s(int i) {
        int[] iArr = this.f67811j;
        V[] vArr = this.f67810i;
        int length = iArr.length;
        ((C23628g) this.f67812n).getClass();
        int i2 = Integer.MAX_VALUE & i;
        int i3 = i2 % length;
        V v = vArr[i3];
        boolean z = false;
        if (!(v == null)) {
            if ((v == C23632k.f67819n) || iArr[i3] != i) {
                int i4 = (i2 % (length - 2)) + 1;
                while (true) {
                    i3 -= i4;
                    if (i3 < 0) {
                        i3 += length;
                    }
                    V v2 = vArr[i3];
                    if (!(v2 == null)) {
                        if (!(v2 == C23632k.f67819n) && iArr[i3] == i) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (vArr[i3] == null) {
            z = true;
        }
        if (z) {
            return -1;
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo37165t(int r12) {
        /*
            r11 = this;
            V[] r0 = r11.f67810i
            int[] r1 = r11.f67811j
            int r2 = r1.length
            aa.f r3 = r11.f67812n
            aa.g r3 = (p291aa.C23628g) r3
            r3.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r12
            int r4 = r3 % r2
            r5 = r0[r4]
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x001a
            r5 = 1
            goto L_0x001b
        L_0x001a:
            r5 = 0
        L_0x001b:
            if (r5 == 0) goto L_0x001e
            return r4
        L_0x001e:
            boolean r5 = m28248u(r0, r4)
            if (r5 == 0) goto L_0x002a
            r5 = r1[r4]
            if (r5 != r12) goto L_0x002a
            goto L_0x0085
        L_0x002a:
            int r5 = r2 + -2
            int r3 = r3 % r5
            int r3 = r3 + r7
            r5 = r0[r4]
            java.lang.Object r8 = p291aa.C23632k.f67819n
            if (r5 != r8) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            r8 = -1
            if (r5 == 0) goto L_0x003c
            r5 = r4
            goto L_0x003d
        L_0x003c:
            r5 = -1
        L_0x003d:
            int r4 = r4 - r3
            if (r4 >= 0) goto L_0x0041
            int r4 = r4 + r2
        L_0x0041:
            if (r5 != r8) goto L_0x004f
            r9 = r0[r4]
            java.lang.Object r10 = p291aa.C23632k.f67819n
            if (r9 != r10) goto L_0x004b
            r9 = 1
            goto L_0x004c
        L_0x004b:
            r9 = 0
        L_0x004c:
            if (r9 == 0) goto L_0x004f
            r5 = r4
        L_0x004f:
            boolean r9 = m28248u(r0, r4)
            if (r9 == 0) goto L_0x0059
            r9 = r1[r4]
            if (r9 != r12) goto L_0x003d
        L_0x0059:
            r9 = r0[r4]
            java.lang.Object r10 = p291aa.C23632k.f67819n
            if (r9 != r10) goto L_0x0061
            r9 = 1
            goto L_0x0062
        L_0x0061:
            r9 = 0
        L_0x0062:
            if (r9 == 0) goto L_0x007f
        L_0x0064:
            r9 = r0[r4]
            if (r9 != 0) goto L_0x006a
            r10 = 1
            goto L_0x006b
        L_0x006a:
            r10 = 0
        L_0x006b:
            if (r10 != 0) goto L_0x007f
            java.lang.Object r10 = p291aa.C23632k.f67819n
            if (r9 != r10) goto L_0x0073
            r9 = 1
            goto L_0x0074
        L_0x0073:
            r9 = 0
        L_0x0074:
            if (r9 != 0) goto L_0x007a
            r9 = r1[r4]
            if (r9 == r12) goto L_0x007f
        L_0x007a:
            int r4 = r4 - r3
            if (r4 >= 0) goto L_0x0064
            int r4 = r4 + r2
            goto L_0x0064
        L_0x007f:
            boolean r12 = m28248u(r0, r4)
            if (r12 == 0) goto L_0x0088
        L_0x0085:
            int r12 = -r4
            int r12 = r12 - r7
            return r12
        L_0x0088:
            if (r5 != r8) goto L_0x008b
            return r4
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p291aa.C23628g.mo37165t(int):int");
    }

    /* renamed from: v */
    public final V mo37166v(int i, V v) {
        int t = mo37165t(i);
        boolean z = true;
        boolean z2 = false;
        V v2 = null;
        if (t < 0) {
            t = (-t) - 1;
            V v3 = this.f67810i[t];
            if (v3 != C23632k.f67820o) {
                v2 = v3;
            }
            z = false;
        } else if (this.f67810i[t] == null) {
            z2 = true;
        }
        this.f67811j[t] = i;
        V[] vArr = this.f67810i;
        if (v == null) {
            v = C23632k.f67820o;
        }
        vArr[t] = v;
        if (z) {
            mo37130n(z2);
        }
        return v2;
    }
}
