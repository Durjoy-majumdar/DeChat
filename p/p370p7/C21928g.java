package p370p7;

import p333e8.C20528a;
import p370p7.C21947n;
import p396x6.C23010j;
import p404z6.C23455e;

/* renamed from: p7.g */
public final class C21928g implements C21947n, C21947n.C21948a {

    /* renamed from: d */
    public final C21947n f62027d;

    /* renamed from: e */
    public C21947n.C21948a f62028e;

    /* renamed from: f */
    public long f62029f = -9223372036854775807L;

    /* renamed from: g */
    public long f62030g = -9223372036854775807L;

    /* renamed from: h */
    public C21929a[] f62031h = new C21929a[0];

    /* renamed from: i */
    public boolean f62032i;

    /* renamed from: p7.g$a */
    public static final class C21929a implements C21957r {

        /* renamed from: a */
        public final C21947n f62033a;

        /* renamed from: b */
        public final C21957r f62034b;

        /* renamed from: c */
        public final long f62035c;

        /* renamed from: d */
        public final long f62036d;

        /* renamed from: e */
        public boolean f62037e;

        /* renamed from: f */
        public boolean f62038f;

        public C21929a(C21947n nVar, C21957r rVar, long j, long j2, boolean z) {
            this.f62033a = nVar;
            this.f62034b = rVar;
            this.f62035c = j;
            this.f62036d = j2;
            this.f62037e = z;
        }

        /* renamed from: a */
        public int mo34995a(C23010j jVar, C23455e eVar, boolean z) {
            if (this.f62037e) {
                return -3;
            }
            if (this.f62038f) {
                eVar.f67251d = 4;
                return -4;
            }
            int a = this.f62034b.mo34995a(jVar, eVar, z);
            long j = this.f62036d;
            if (j == Long.MIN_VALUE || ((a != -4 || eVar.f67261g < j) && !(a == -3 && this.f62033a.mo34983a() == Long.MIN_VALUE))) {
                if (a == -4 && !eVar.mo36910g(4)) {
                    eVar.f67261g -= this.f62035c;
                }
                return a;
            }
            eVar.mo35592f();
            eVar.f67251d = 4;
            this.f62038f = true;
            return -4;
        }

        /* renamed from: b */
        public void mo34996b(long j) {
            this.f62034b.mo34996b(this.f62035c + j);
        }

        /* renamed from: c */
        public void mo34997c() {
            this.f62034b.mo34997c();
        }

        public boolean isReady() {
            return this.f62034b.isReady();
        }
    }

    public C21928g(C21947n nVar, boolean z) {
        this.f62027d = nVar;
        this.f62032i = z;
    }

    /* renamed from: a */
    public long mo34983a() {
        long a = this.f62027d.mo34983a();
        if (a != Long.MIN_VALUE) {
            long j = this.f62030g;
            if (j == Long.MIN_VALUE || a < j) {
                return Math.max(0, a - this.f62029f);
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: b */
    public boolean mo34984b(long j) {
        return this.f62027d.mo34984b(j + this.f62029f);
    }

    /* renamed from: c */
    public long mo34985c() {
        long c = this.f62027d.mo34985c();
        if (c != Long.MIN_VALUE) {
            long j = this.f62030g;
            if (j == Long.MIN_VALUE || c < j) {
                return c - this.f62029f;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 > r7) goto L_0x0031;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo34986e(long r7) {
        /*
            r6 = this;
            p7.g$a[] r0 = r6.f62031h
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0005:
            if (r3 >= r1) goto L_0x0010
            r4 = r0[r3]
            if (r4 == 0) goto L_0x000d
            r4.f62038f = r2
        L_0x000d:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x0010:
            p7.n r0 = r6.f62027d
            long r3 = r6.f62029f
            long r3 = r3 + r7
            long r0 = r0.mo34986e(r3)
            long r3 = r6.f62029f
            long r7 = r7 + r3
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0030
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0031
            long r7 = r6.f62030g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0030
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0031
        L_0x0030:
            r2 = 1
        L_0x0031:
            p333e8.C20528a.m22240d(r2)
            long r7 = r6.f62029f
            long r0 = r0 - r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p370p7.C21928g.mo34986e(long):long");
    }

    /* renamed from: f */
    public void mo34987f(C21947n nVar) {
        C20528a.m22240d((this.f62029f == -9223372036854775807L || this.f62030g == -9223372036854775807L) ? false : true);
        this.f62028e.mo34987f(this);
    }

    /* renamed from: g */
    public void mo34988g(C21958s sVar) {
        C21947n nVar = (C21947n) sVar;
        this.f62028e.mo34988g(this);
    }

    /* renamed from: h */
    public void mo34989h(C21947n.C21948a aVar, long j) {
        this.f62028e = aVar;
        this.f62027d.mo34989h(this, this.f62029f + j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r13 > r2) goto L_0x007d;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo34990k(p295b8.C16772f[] r18, boolean[] r19, p370p7.C21957r[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r8 = r17
            r7 = r18
            r9 = r20
            int r0 = r9.length
            p7.g$a[] r0 = new p370p7.C21928g.C21929a[r0]
            r8.f62031h = r0
            int r0 = r9.length
            p7.r[] r10 = new p370p7.C21957r[r0]
            r11 = 0
            r0 = 0
        L_0x0010:
            int r1 = r9.length
            r12 = 0
            if (r0 >= r1) goto L_0x0025
            p7.g$a[] r1 = r8.f62031h
            r2 = r9[r0]
            p7.g$a r2 = (p370p7.C21928g.C21929a) r2
            r1[r0] = r2
            if (r2 == 0) goto L_0x0020
            p7.r r12 = r2.f62034b
        L_0x0020:
            r10[r0] = r12
            int r0 = r0 + 1
            goto L_0x0010
        L_0x0025:
            p7.n r0 = r8.f62027d
            long r1 = r8.f62029f
            long r5 = r22 + r1
            r1 = r18
            r2 = r19
            r3 = r10
            r4 = r21
            long r13 = r0.mo34990k(r1, r2, r3, r4, r5)
            boolean r0 = r8.f62032i
            r1 = 1
            if (r0 == 0) goto L_0x0064
            long r2 = r8.f62029f
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            int r0 = r7.length
            r2 = 0
        L_0x0045:
            if (r2 >= r0) goto L_0x005c
            r3 = r7[r2]
            if (r3 == 0) goto L_0x0059
            com.google.android.exoplayer2.Format r3 = r3.mo17790c()
            java.lang.String r3 = r3.f45777i
            boolean r3 = p333e8.C20536j.m22252d(r3)
            if (r3 != 0) goto L_0x0059
            r0 = 1
            goto L_0x005d
        L_0x0059:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x0061
            r0 = 1
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            r8.f62032i = r0
        L_0x0064:
            long r2 = r8.f62029f
            long r4 = r22 + r2
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x007d
            long r2 = r8.f62030g
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            p333e8.C20528a.m22240d(r1)
        L_0x0081:
            int r0 = r9.length
            if (r11 >= r0) goto L_0x00b5
            r2 = r10[r11]
            if (r2 != 0) goto L_0x008d
            p7.g$a[] r0 = r8.f62031h
            r0[r11] = r12
            goto L_0x00ac
        L_0x008d:
            r0 = r9[r11]
            if (r0 == 0) goto L_0x0099
            p7.g$a[] r0 = r8.f62031h
            r0 = r0[r11]
            p7.r r0 = r0.f62034b
            if (r0 == r2) goto L_0x00ac
        L_0x0099:
            p7.g$a[] r15 = r8.f62031h
            p7.g$a r16 = new p7.g$a
            long r3 = r8.f62029f
            long r5 = r8.f62030g
            boolean r7 = r8.f62032i
            r0 = r16
            r1 = r17
            r0.<init>(r1, r2, r3, r5, r7)
            r15[r11] = r16
        L_0x00ac:
            p7.g$a[] r0 = r8.f62031h
            r0 = r0[r11]
            r9[r11] = r0
            int r11 = r11 + 1
            goto L_0x0081
        L_0x00b5:
            long r0 = r8.f62029f
            long r13 = r13 - r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p370p7.C21928g.mo34990k(b8.f[], boolean[], p7.r[], boolean[], long):long");
    }

    /* renamed from: m */
    public long mo34991m() {
        boolean z = false;
        if (this.f62032i) {
            for (C21929a aVar : this.f62031h) {
                if (aVar != null) {
                    aVar.f62037e = false;
                }
            }
            this.f62032i = false;
            long m = mo34991m();
            if (m != -9223372036854775807L) {
                return m;
            }
            return 0;
        }
        long m2 = this.f62027d.mo34991m();
        if (m2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        C20528a.m22240d(m2 >= this.f62029f);
        long j = this.f62030g;
        if (j == Long.MIN_VALUE || m2 <= j) {
            z = true;
        }
        C20528a.m22240d(z);
        return m2 - this.f62029f;
    }

    /* renamed from: n */
    public C21962v mo34992n() {
        return this.f62027d.mo34992n();
    }

    /* renamed from: q */
    public void mo34993q() {
        this.f62027d.mo34993q();
    }

    /* renamed from: r */
    public void mo34994r(long j) {
        this.f62027d.mo34994r(j + this.f62029f);
    }
}
