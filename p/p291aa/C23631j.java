package p291aa;

/* renamed from: aa.j */
public class C23631j<V> extends C23618b implements C23630i {

    /* renamed from: i */
    public transient V[] f67816i;

    /* renamed from: j */
    public transient long[] f67817j;

    /* renamed from: n */
    public final C23630i f67818n = this;

    /* renamed from: v */
    public static boolean m28256v(Object[] objArr, int i) {
        Object obj = objArr[i];
        return (obj == null || obj == C23632k.f67819n) ? false : true;
    }

    public void clear() {
        super.clear();
        long[] jArr = this.f67817j;
        V[] vArr = this.f67816i;
        int length = jArr.length;
        while (true) {
            int i = length - 1;
            if (length > 0) {
                jArr[i] = 0;
                vArr[i] = null;
                length = i;
            } else {
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        C23631j jVar = (C23631j) super.clone();
        jVar.f67816i = (Object[]) this.f67816i.clone();
        return jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if ((r3 == r6 || (r3 != null && r3.equals(r6))) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p291aa.C23631j
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            aa.j r10 = (p291aa.C23631j) r10
            int r0 = r10.f67798d
            int r2 = r9.f67798d
            if (r0 == r2) goto L_0x000f
            return r1
        L_0x000f:
            long[] r0 = r9.f67817j
            V[] r2 = r9.f67816i
            int r3 = r0.length
        L_0x0014:
            int r4 = r3 + -1
            r5 = 1
            if (r3 <= 0) goto L_0x0049
            boolean r3 = m28256v(r2, r4)
            if (r3 == 0) goto L_0x0047
            r6 = r0[r4]
            r3 = r2[r4]
            aa.k$a r8 = p291aa.C23632k.f67820o
            if (r3 != r8) goto L_0x0028
            r3 = 0
        L_0x0028:
            int r8 = r10.mo37172t(r6)
            if (r8 < 0) goto L_0x0043
            java.lang.Object r6 = r10.mo37171s(r6)
            if (r3 == r6) goto L_0x003f
            if (r3 == 0) goto L_0x003d
            boolean r3 = r3.equals(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: p291aa.C23631j.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo37125f() {
        return this.f67816i.length;
    }

    public int hashCode() {
        long[] jArr = this.f67817j;
        V[] vArr = this.f67816i;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return i;
            }
            if (m28256v(vArr, i2)) {
                long j = jArr[i2];
                V v = vArr[i2];
                if (v == C23632k.f67820o) {
                    v = null;
                }
                ((C23631j) this.f67818n).getClass();
                i += (v == null ? 0 : v.hashCode()) ^ ((int) (j ^ (j >> 32)));
            }
            length = i2;
        }
    }

    /* renamed from: o */
    public void mo37131o(int i) {
        long[] jArr = this.f67817j;
        int length = jArr.length;
        V[] vArr = this.f67816i;
        this.f67817j = new long[i];
        this.f67816i = new Object[i];
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                if (m28256v(vArr, i2)) {
                    long j = jArr[i2];
                    int u = mo37173u(j);
                    this.f67817j[u] = j;
                    this.f67816i[u] = vArr[i2];
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public void mo37132p(int i) {
        this.f67816i[i] = C23632k.f67819n;
        this.f67798d--;
        this.f67800f++;
        mo37127k();
    }

    /* renamed from: r */
    public int mo37133r(int i) {
        int a = C112762a.m154255a(i);
        mo37128l(a);
        this.f67816i = new Object[a];
        this.f67817j = new long[a];
        return a;
    }

    /* renamed from: s */
    public final V mo37171s(long j) {
        V v;
        int t = mo37172t(j);
        if (t >= 0 && (v = this.f67816i[t]) != C23632k.f67820o) {
            return v;
        }
        return null;
    }

    /* renamed from: t */
    public final int mo37172t(long j) {
        long[] jArr = this.f67817j;
        V[] vArr = this.f67816i;
        int length = jArr.length;
        ((C23631j) this.f67818n).getClass();
        int i = Integer.MAX_VALUE & ((int) ((j >> 32) ^ j));
        int i2 = i % length;
        V v = vArr[i2];
        boolean z = false;
        if (!(v == null)) {
            if ((v == C23632k.f67819n) || jArr[i2] != j) {
                int i3 = (i % (length - 2)) + 1;
                while (true) {
                    i2 -= i3;
                    if (i2 < 0) {
                        i2 += length;
                    }
                    V v2 = vArr[i2];
                    if (!(v2 == null)) {
                        if (!(v2 == C23632k.f67819n) && jArr[i2] == j) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (vArr[i2] == null) {
            z = true;
        }
        if (z) {
            return -1;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo37173u(long r13) {
        /*
            r12 = this;
            V[] r0 = r12.f67816i
            long[] r1 = r12.f67817j
            int r2 = r1.length
            aa.i r3 = r12.f67818n
            aa.j r3 = (p291aa.C23631j) r3
            r3.getClass()
            r3 = 32
            long r3 = r13 >> r3
            long r3 = r3 ^ r13
            int r4 = (int) r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r4
            int r4 = r3 % r2
            r5 = r0[r4]
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r5 == 0) goto L_0x0024
            return r4
        L_0x0024:
            boolean r5 = m28256v(r0, r4)
            if (r5 == 0) goto L_0x0032
            r8 = r1[r4]
            int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x0032
            goto L_0x0091
        L_0x0032:
            int r5 = r2 + -2
            int r3 = r3 % r5
            int r3 = r3 + r7
            r5 = r0[r4]
            java.lang.Object r8 = p291aa.C23632k.f67819n
            if (r5 != r8) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            r8 = -1
            if (r5 == 0) goto L_0x0044
            r5 = r4
            goto L_0x0045
        L_0x0044:
            r5 = -1
        L_0x0045:
            int r4 = r4 - r3
            if (r4 >= 0) goto L_0x0049
            int r4 = r4 + r2
        L_0x0049:
            if (r5 != r8) goto L_0x0057
            r9 = r0[r4]
            java.lang.Object r10 = p291aa.C23632k.f67819n
            if (r9 != r10) goto L_0x0053
            r9 = 1
            goto L_0x0054
        L_0x0053:
            r9 = 0
        L_0x0054:
            if (r9 == 0) goto L_0x0057
            r5 = r4
        L_0x0057:
            boolean r9 = m28256v(r0, r4)
            if (r9 == 0) goto L_0x0063
            r9 = r1[r4]
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0045
        L_0x0063:
            r9 = r0[r4]
            java.lang.Object r10 = p291aa.C23632k.f67819n
            if (r9 != r10) goto L_0x006b
            r9 = 1
            goto L_0x006c
        L_0x006b:
            r9 = 0
        L_0x006c:
            if (r9 == 0) goto L_0x008b
        L_0x006e:
            r9 = r0[r4]
            if (r9 != 0) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            if (r10 != 0) goto L_0x008b
            java.lang.Object r10 = p291aa.C23632k.f67819n
            if (r9 != r10) goto L_0x007d
            r9 = 1
            goto L_0x007e
        L_0x007d:
            r9 = 0
        L_0x007e:
            if (r9 != 0) goto L_0x0086
            r9 = r1[r4]
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
        L_0x0086:
            int r4 = r4 - r3
            if (r4 >= 0) goto L_0x006e
            int r4 = r4 + r2
            goto L_0x006e
        L_0x008b:
            boolean r13 = m28256v(r0, r4)
            if (r13 == 0) goto L_0x0094
        L_0x0091:
            int r13 = -r4
            int r13 = r13 - r7
            return r13
        L_0x0094:
            if (r5 != r8) goto L_0x0097
            return r4
        L_0x0097:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p291aa.C23631j.mo37173u(long):int");
    }

    /* renamed from: w */
    public final V mo37174w(long j, V v) {
        int u = mo37173u(j);
        boolean z = true;
        boolean z2 = false;
        V v2 = null;
        if (u < 0) {
            u = (-u) - 1;
            V v3 = this.f67816i[u];
            if (v3 != C23632k.f67820o) {
                v2 = v3;
            }
            z = false;
        } else if (this.f67816i[u] == null) {
            z2 = true;
        }
        this.f67817j[u] = j;
        V[] vArr = this.f67816i;
        if (v == null) {
            v = C23632k.f67820o;
        }
        vArr[u] = v;
        if (z) {
            mo37130n(z2);
        }
        return v2;
    }
}
