package p345h7;

import android.util.SparseArray;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20537k;
import p333e8.C20541m;
import p333e8.C20542n;
import p345h7.C20923v;

/* renamed from: h7.j */
public final class C20904j implements C20901h {

    /* renamed from: a */
    public final C20918s f59116a;

    /* renamed from: b */
    public final boolean f59117b;

    /* renamed from: c */
    public final boolean f59118c;

    /* renamed from: d */
    public final C20912n f59119d = new C20912n(7, 128);

    /* renamed from: e */
    public final C20912n f59120e = new C20912n(8, 128);

    /* renamed from: f */
    public final C20912n f59121f = new C20912n(6, 128);

    /* renamed from: g */
    public long f59122g;

    /* renamed from: h */
    public final boolean[] f59123h = new boolean[3];

    /* renamed from: i */
    public String f59124i;

    /* renamed from: j */
    public C16750m f59125j;

    /* renamed from: k */
    public C20906b f59126k;

    /* renamed from: l */
    public boolean f59127l;

    /* renamed from: m */
    public long f59128m;

    /* renamed from: n */
    public final C20541m f59129n = new C20541m();

    /* renamed from: h7.j$b */
    public static final class C20906b {

        /* renamed from: a */
        public final C16750m f59130a;

        /* renamed from: b */
        public final boolean f59131b;

        /* renamed from: c */
        public final boolean f59132c;

        /* renamed from: d */
        public final SparseArray<C20537k.C20539b> f59133d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C20537k.C20538a> f59134e = new SparseArray<>();

        /* renamed from: f */
        public final C20542n f59135f;

        /* renamed from: g */
        public byte[] f59136g;

        /* renamed from: h */
        public int f59137h;

        /* renamed from: i */
        public int f59138i;

        /* renamed from: j */
        public long f59139j;

        /* renamed from: k */
        public boolean f59140k;

        /* renamed from: l */
        public long f59141l;

        /* renamed from: m */
        public C20907a f59142m = new C20907a((C20905a) null);

        /* renamed from: n */
        public C20907a f59143n = new C20907a((C20905a) null);

        /* renamed from: o */
        public boolean f59144o;

        /* renamed from: p */
        public long f59145p;

        /* renamed from: q */
        public long f59146q;

        /* renamed from: r */
        public boolean f59147r;

        /* renamed from: h7.j$b$a */
        public static final class C20907a {

            /* renamed from: a */
            public boolean f59148a;

            /* renamed from: b */
            public boolean f59149b;

            /* renamed from: c */
            public C20537k.C20539b f59150c;

            /* renamed from: d */
            public int f59151d;

            /* renamed from: e */
            public int f59152e;

            /* renamed from: f */
            public int f59153f;

            /* renamed from: g */
            public int f59154g;

            /* renamed from: h */
            public boolean f59155h;

            /* renamed from: i */
            public boolean f59156i;

            /* renamed from: j */
            public boolean f59157j;

            /* renamed from: k */
            public boolean f59158k;

            /* renamed from: l */
            public int f59159l;

            /* renamed from: m */
            public int f59160m;

            /* renamed from: n */
            public int f59161n;

            /* renamed from: o */
            public int f59162o;

            /* renamed from: p */
            public int f59163p;

            public C20907a(C20905a aVar) {
            }
        }

        public C20906b(C16750m mVar, boolean z, boolean z2) {
            this.f59130a = mVar;
            this.f59131b = z;
            this.f59132c = z2;
            byte[] bArr = new byte[128];
            this.f59136g = bArr;
            this.f59135f = new C20542n(bArr, 0, 0);
            this.f59140k = false;
            this.f59144o = false;
            C20907a aVar = this.f59143n;
            aVar.f59149b = false;
            aVar.f59148a = false;
        }
    }

    public C20904j(C20918s sVar, boolean z, boolean z2) {
        this.f59116a = sVar;
        this.f59117b = z;
        this.f59118c = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0253, code lost:
        if (r6 != 1) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d7, code lost:
        if ((r3.f59148a && !(r4.f59148a && r3.f59153f == r4.f59153f && r3.f59154g == r4.f59154g && r3.f59155h == r4.f59155h && ((!r3.f59156i || !r4.f59156i || r3.f59157j == r4.f59157j) && (((r5 = r3.f59151d) == (r7 = r4.f59151d) || (r5 != 0 && r7 != 0)) && (((r5 = r3.f59150c.f57802h) != 0 || r4.f59150c.f57802h != 0 || (r3.f59160m == r4.f59160m && r3.f59161n == r4.f59161n)) && ((r5 != 1 || r4.f59150c.f57802h != 1 || (r3.f59162o == r4.f59162o && r3.f59163p == r4.f59163p)) && (r5 = r3.f59158k) == (r7 = r4.f59158k) && (!r5 || !r7 || r3.f59159l == r4.f59159l))))))) != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0222, code lost:
        if ((r1.f59149b && ((r1 = r1.f59152e) == 7 || r1 == 2)) != false) goto L_0x0227;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x025b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0273 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x020c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32609a(p333e8.C20541m r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            int r2 = r1.f57810b
            int r3 = r1.f57811c
            byte[] r4 = r1.f57809a
            long r5 = r0.f59122g
            int r7 = r3 - r2
            long r8 = (long) r7
            long r5 = r5 + r8
            r0.f59122g = r5
            b7.m r5 = r0.f59125j
            r5.mo17742b(r1, r7)
        L_0x0017:
            boolean[] r1 = r0.f59123h
            int r1 = p333e8.C20537k.m22255b(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x0023
            r0.mo32620f(r4, r2, r3)
            return
        L_0x0023:
            int r5 = r1 + 3
            byte r6 = r4[r5]
            r6 = r6 & 31
            int r7 = r1 - r2
            if (r7 <= 0) goto L_0x0030
            r0.mo32620f(r4, r2, r1)
        L_0x0030:
            int r1 = r3 - r1
            long r8 = r0.f59122g
            long r10 = (long) r1
            long r8 = r8 - r10
            if (r7 >= 0) goto L_0x003a
            int r7 = -r7
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            long r10 = r0.f59128m
            boolean r12 = r0.f59127l
            if (r12 == 0) goto L_0x0050
            h7.j$b r12 = r0.f59126k
            boolean r12 = r12.f59132c
            if (r12 == 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            r27 = r3
            r28 = r4
            r29 = r5
            goto L_0x012b
        L_0x0050:
            h7.n r12 = r0.f59119d
            r12.mo32623b(r7)
            h7.n r12 = r0.f59120e
            r12.mo32623b(r7)
            boolean r12 = r0.f59127l
            r14 = 3
            if (r12 != 0) goto L_0x00ec
            h7.n r12 = r0.f59119d
            boolean r12 = r12.f59211c
            if (r12 == 0) goto L_0x0048
            h7.n r12 = r0.f59120e
            boolean r12 = r12.f59211c
            if (r12 == 0) goto L_0x0048
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            h7.n r15 = r0.f59119d
            byte[] r2 = r15.f59212d
            int r15 = r15.f59213e
            byte[] r2 = java.util.Arrays.copyOf(r2, r15)
            r12.add(r2)
            h7.n r2 = r0.f59120e
            byte[] r15 = r2.f59212d
            int r2 = r2.f59213e
            byte[] r2 = java.util.Arrays.copyOf(r15, r2)
            r12.add(r2)
            h7.n r2 = r0.f59119d
            byte[] r15 = r2.f59212d
            int r2 = r2.f59213e
            e8.k$b r2 = p333e8.C20537k.m22257d(r15, r14, r2)
            h7.n r15 = r0.f59120e
            byte[] r13 = r15.f59212d
            int r15 = r15.f59213e
            e8.k$a r13 = p333e8.C20537k.m22256c(r13, r14, r15)
            b7.m r14 = r0.f59125j
            java.lang.String r15 = r0.f59124i
            r17 = 0
            r18 = -1
            r19 = -1
            r27 = r3
            int r3 = r2.f57796b
            r28 = r4
            int r4 = r2.f57797c
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r29 = r5
            float r5 = r2.f57798d
            r26 = 0
            java.lang.String r16 = "video/avc"
            r20 = r3
            r21 = r4
            r23 = r12
            r25 = r5
            com.google.android.exoplayer2.Format r3 = com.google.android.exoplayer2.Format.m16649j(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r14.mo17741a(r3)
            r3 = 1
            r0.f59127l = r3
            h7.j$b r3 = r0.f59126k
            android.util.SparseArray<e8.k$b> r3 = r3.f59133d
            int r4 = r2.f57795a
            r3.append(r4, r2)
            h7.j$b r2 = r0.f59126k
            android.util.SparseArray<e8.k$a> r2 = r2.f59134e
            int r3 = r13.f57792a
            r2.append(r3, r13)
            h7.n r2 = r0.f59119d
            r2.mo32624c()
            h7.n r2 = r0.f59120e
            r2.mo32624c()
            goto L_0x012b
        L_0x00ec:
            r27 = r3
            r28 = r4
            r29 = r5
            h7.n r2 = r0.f59119d
            boolean r3 = r2.f59211c
            if (r3 == 0) goto L_0x010f
            byte[] r3 = r2.f59212d
            int r2 = r2.f59213e
            e8.k$b r2 = p333e8.C20537k.m22257d(r3, r14, r2)
            h7.j$b r3 = r0.f59126k
            android.util.SparseArray<e8.k$b> r3 = r3.f59133d
            int r4 = r2.f57795a
            r3.append(r4, r2)
            h7.n r2 = r0.f59119d
            r2.mo32624c()
            goto L_0x012b
        L_0x010f:
            h7.n r2 = r0.f59120e
            boolean r3 = r2.f59211c
            if (r3 == 0) goto L_0x012b
            byte[] r3 = r2.f59212d
            int r2 = r2.f59213e
            e8.k$a r2 = p333e8.C20537k.m22256c(r3, r14, r2)
            h7.j$b r3 = r0.f59126k
            android.util.SparseArray<e8.k$a> r3 = r3.f59134e
            int r4 = r2.f57792a
            r3.append(r4, r2)
            h7.n r2 = r0.f59120e
            r2.mo32624c()
        L_0x012b:
            h7.n r2 = r0.f59121f
            boolean r2 = r2.mo32623b(r7)
            if (r2 == 0) goto L_0x0155
            h7.n r2 = r0.f59121f
            byte[] r3 = r2.f59212d
            int r2 = r2.f59213e
            int r2 = p333e8.C20537k.m22258e(r3, r2)
            e8.m r3 = r0.f59129n
            h7.n r4 = r0.f59121f
            byte[] r4 = r4.f59212d
            r3.mo32111v(r4, r2)
            e8.m r2 = r0.f59129n
            r3 = 4
            r2.mo32113x(r3)
            h7.s r2 = r0.f59116a
            e8.m r3 = r0.f59129n
            b7.m[] r2 = r2.f59247b
            p386u7.C22610g.m26471a(r10, r3, r2)
        L_0x0155:
            h7.j$b r2 = r0.f59126k
            int r3 = r2.f59138i
            r4 = 9
            if (r3 == r4) goto L_0x01dc
            boolean r3 = r2.f59132c
            if (r3 == 0) goto L_0x01da
            h7.j$b$a r3 = r2.f59143n
            h7.j$b$a r4 = r2.f59142m
            boolean r5 = r3.f59148a
            if (r5 == 0) goto L_0x01d6
            boolean r5 = r4.f59148a
            if (r5 == 0) goto L_0x01d4
            int r5 = r3.f59153f
            int r7 = r4.f59153f
            if (r5 != r7) goto L_0x01d4
            int r5 = r3.f59154g
            int r7 = r4.f59154g
            if (r5 != r7) goto L_0x01d4
            boolean r5 = r3.f59155h
            boolean r7 = r4.f59155h
            if (r5 != r7) goto L_0x01d4
            boolean r5 = r3.f59156i
            if (r5 == 0) goto L_0x018d
            boolean r5 = r4.f59156i
            if (r5 == 0) goto L_0x018d
            boolean r5 = r3.f59157j
            boolean r7 = r4.f59157j
            if (r5 != r7) goto L_0x01d4
        L_0x018d:
            int r5 = r3.f59151d
            int r7 = r4.f59151d
            if (r5 == r7) goto L_0x0197
            if (r5 == 0) goto L_0x01d4
            if (r7 == 0) goto L_0x01d4
        L_0x0197:
            e8.k$b r5 = r3.f59150c
            int r5 = r5.f57802h
            if (r5 != 0) goto L_0x01af
            e8.k$b r7 = r4.f59150c
            int r7 = r7.f57802h
            if (r7 != 0) goto L_0x01af
            int r7 = r3.f59160m
            int r10 = r4.f59160m
            if (r7 != r10) goto L_0x01d4
            int r7 = r3.f59161n
            int r10 = r4.f59161n
            if (r7 != r10) goto L_0x01d4
        L_0x01af:
            r7 = 1
            if (r5 != r7) goto L_0x01c4
            e8.k$b r5 = r4.f59150c
            int r5 = r5.f57802h
            if (r5 != r7) goto L_0x01c4
            int r5 = r3.f59162o
            int r7 = r4.f59162o
            if (r5 != r7) goto L_0x01d4
            int r5 = r3.f59163p
            int r7 = r4.f59163p
            if (r5 != r7) goto L_0x01d4
        L_0x01c4:
            boolean r5 = r3.f59158k
            boolean r7 = r4.f59158k
            if (r5 != r7) goto L_0x01d4
            if (r5 == 0) goto L_0x01d6
            if (r7 == 0) goto L_0x01d6
            int r3 = r3.f59159l
            int r4 = r4.f59159l
            if (r3 == r4) goto L_0x01d6
        L_0x01d4:
            r3 = 1
            goto L_0x01d7
        L_0x01d6:
            r3 = 0
        L_0x01d7:
            if (r3 == 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r1 = 1
            goto L_0x0204
        L_0x01dc:
            boolean r3 = r2.f59144o
            if (r3 == 0) goto L_0x01f6
            long r3 = r2.f59139j
            long r10 = r8 - r3
            int r5 = (int) r10
            int r15 = r1 + r5
            boolean r13 = r2.f59147r
            long r10 = r2.f59145p
            long r3 = r3 - r10
            int r14 = (int) r3
            b7.m r10 = r2.f59130a
            long r11 = r2.f59146q
            r16 = 0
            r10.mo17744d(r11, r13, r14, r15, r16)
        L_0x01f6:
            long r3 = r2.f59139j
            r2.f59145p = r3
            long r3 = r2.f59141l
            r2.f59146q = r3
            r1 = 0
            r2.f59147r = r1
            r1 = 1
            r2.f59144o = r1
        L_0x0204:
            boolean r3 = r2.f59147r
            int r4 = r2.f59138i
            r5 = 2
            r7 = 5
            if (r4 == r7) goto L_0x0227
            boolean r10 = r2.f59131b
            if (r10 == 0) goto L_0x0225
            if (r4 != r1) goto L_0x0225
            h7.j$b$a r1 = r2.f59143n
            boolean r4 = r1.f59149b
            if (r4 == 0) goto L_0x0221
            int r1 = r1.f59152e
            r4 = 7
            if (r1 == r4) goto L_0x021f
            if (r1 != r5) goto L_0x0221
        L_0x021f:
            r1 = 1
            goto L_0x0222
        L_0x0221:
            r1 = 0
        L_0x0222:
            if (r1 == 0) goto L_0x0225
            goto L_0x0227
        L_0x0225:
            r1 = 0
            goto L_0x0228
        L_0x0227:
            r1 = 1
        L_0x0228:
            r1 = r1 | r3
            r2.f59147r = r1
            long r1 = r0.f59128m
            boolean r3 = r0.f59127l
            if (r3 == 0) goto L_0x0237
            h7.j$b r3 = r0.f59126k
            boolean r3 = r3.f59132c
            if (r3 == 0) goto L_0x0241
        L_0x0237:
            h7.n r3 = r0.f59119d
            r3.mo32625d(r6)
            h7.n r3 = r0.f59120e
            r3.mo32625d(r6)
        L_0x0241:
            h7.n r3 = r0.f59121f
            r3.mo32625d(r6)
            h7.j$b r3 = r0.f59126k
            r3.f59138i = r6
            r3.f59141l = r1
            r3.f59139j = r8
            boolean r1 = r3.f59131b
            if (r1 == 0) goto L_0x0256
            r1 = 1
            if (r6 == r1) goto L_0x0261
            goto L_0x0257
        L_0x0256:
            r1 = 1
        L_0x0257:
            boolean r2 = r3.f59132c
            if (r2 == 0) goto L_0x0273
            if (r6 == r7) goto L_0x0261
            if (r6 == r1) goto L_0x0261
            if (r6 != r5) goto L_0x0273
        L_0x0261:
            h7.j$b$a r1 = r3.f59142m
            h7.j$b$a r2 = r3.f59143n
            r3.f59142m = r2
            r3.f59143n = r1
            r2 = 0
            r1.f59149b = r2
            r1.f59148a = r2
            r3.f59137h = r2
            r1 = 1
            r3.f59140k = r1
        L_0x0273:
            r3 = r27
            r4 = r28
            r2 = r29
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20904j.mo32609a(e8.m):void");
    }

    /* renamed from: b */
    public void mo32610b() {
        C20537k.m22254a(this.f59123h);
        this.f59119d.mo32624c();
        this.f59120e.mo32624c();
        this.f59121f.mo32624c();
        C20906b bVar = this.f59126k;
        bVar.f59140k = false;
        bVar.f59144o = false;
        C20906b.C20907a aVar = bVar.f59143n;
        aVar.f59149b = false;
        aVar.f59148a = false;
        this.f59122g = 0;
    }

    /* renamed from: c */
    public void mo32611c() {
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        dVar.mo32634a();
        dVar.mo32635b();
        this.f59124i = dVar.f59281e;
        dVar.mo32635b();
        C16750m o = gVar.mo17752o(dVar.f59280d, 2);
        this.f59125j = o;
        this.f59126k = new C20906b(o, this.f59117b, this.f59118c);
        this.f59116a.mo32632a(gVar, dVar);
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        this.f59128m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32620f(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f59127l
            if (r4 == 0) goto L_0x0012
            h7.j$b r4 = r0.f59126k
            boolean r4 = r4.f59132c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            h7.n r4 = r0.f59119d
            r4.mo32622a(r1, r2, r3)
            h7.n r4 = r0.f59120e
            r4.mo32622a(r1, r2, r3)
        L_0x001c:
            h7.n r4 = r0.f59121f
            r4.mo32622a(r1, r2, r3)
            h7.j$b r4 = r0.f59126k
            boolean r5 = r4.f59140k
            if (r5 != 0) goto L_0x0029
            goto L_0x01cb
        L_0x0029:
            int r3 = r3 - r2
            byte[] r5 = r4.f59136g
            int r6 = r5.length
            int r7 = r4.f59137h
            int r7 = r7 + r3
            r8 = 2
            if (r6 >= r7) goto L_0x003b
            int r7 = r7 * 2
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f59136g = r5
        L_0x003b:
            byte[] r5 = r4.f59136g
            int r6 = r4.f59137h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f59137h
            int r1 = r1 + r3
            r4.f59137h = r1
            e8.n r2 = r4.f59135f
            byte[] r3 = r4.f59136g
            r2.f57812a = r3
            r3 = 0
            r2.f57814c = r3
            r2.f57813b = r1
            r2.f57815d = r3
            r2.mo32115a()
            e8.n r1 = r4.f59135f
            r2 = 8
            boolean r1 = r1.mo32116b(r2)
            if (r1 != 0) goto L_0x0063
            goto L_0x01cb
        L_0x0063:
            e8.n r1 = r4.f59135f
            r1.mo32123i()
            e8.n r1 = r4.f59135f
            int r1 = r1.mo32119e(r8)
            e8.n r2 = r4.f59135f
            r5 = 5
            r2.mo32124j(r5)
            e8.n r2 = r4.f59135f
            boolean r2 = r2.mo32117c()
            if (r2 != 0) goto L_0x007e
            goto L_0x01cb
        L_0x007e:
            e8.n r2 = r4.f59135f
            r2.mo32120f()
            e8.n r2 = r4.f59135f
            boolean r2 = r2.mo32117c()
            if (r2 != 0) goto L_0x008d
            goto L_0x01cb
        L_0x008d:
            e8.n r2 = r4.f59135f
            int r2 = r2.mo32120f()
            boolean r6 = r4.f59132c
            r7 = 1
            if (r6 != 0) goto L_0x00a2
            r4.f59140k = r3
            h7.j$b$a r1 = r4.f59143n
            r1.f59152e = r2
            r1.f59149b = r7
            goto L_0x01cb
        L_0x00a2:
            e8.n r6 = r4.f59135f
            boolean r6 = r6.mo32117c()
            if (r6 != 0) goto L_0x00ac
            goto L_0x01cb
        L_0x00ac:
            e8.n r6 = r4.f59135f
            int r6 = r6.mo32120f()
            android.util.SparseArray<e8.k$a> r9 = r4.f59134e
            int r9 = r9.indexOfKey(r6)
            if (r9 >= 0) goto L_0x00be
            r4.f59140k = r3
            goto L_0x01cb
        L_0x00be:
            android.util.SparseArray<e8.k$a> r9 = r4.f59134e
            java.lang.Object r9 = r9.get(r6)
            e8.k$a r9 = (p333e8.C20537k.C20538a) r9
            android.util.SparseArray<e8.k$b> r10 = r4.f59133d
            int r11 = r9.f57793b
            java.lang.Object r10 = r10.get(r11)
            e8.k$b r10 = (p333e8.C20537k.C20539b) r10
            boolean r11 = r10.f57799e
            if (r11 == 0) goto L_0x00e3
            e8.n r11 = r4.f59135f
            boolean r11 = r11.mo32116b(r8)
            if (r11 != 0) goto L_0x00de
            goto L_0x01cb
        L_0x00de:
            e8.n r11 = r4.f59135f
            r11.mo32124j(r8)
        L_0x00e3:
            e8.n r8 = r4.f59135f
            int r11 = r10.f57801g
            boolean r8 = r8.mo32116b(r11)
            if (r8 != 0) goto L_0x00ef
            goto L_0x01cb
        L_0x00ef:
            e8.n r8 = r4.f59135f
            int r11 = r10.f57801g
            int r8 = r8.mo32119e(r11)
            boolean r11 = r10.f57800f
            if (r11 != 0) goto L_0x011f
            e8.n r11 = r4.f59135f
            boolean r11 = r11.mo32116b(r7)
            if (r11 != 0) goto L_0x0105
            goto L_0x01cb
        L_0x0105:
            e8.n r11 = r4.f59135f
            boolean r11 = r11.mo32118d()
            if (r11 == 0) goto L_0x0120
            e8.n r12 = r4.f59135f
            boolean r12 = r12.mo32116b(r7)
            if (r12 != 0) goto L_0x0117
            goto L_0x01cb
        L_0x0117:
            e8.n r12 = r4.f59135f
            boolean r12 = r12.mo32118d()
            r13 = 1
            goto L_0x0122
        L_0x011f:
            r11 = 0
        L_0x0120:
            r12 = 0
            r13 = 0
        L_0x0122:
            int r14 = r4.f59138i
            if (r14 != r5) goto L_0x0128
            r5 = 1
            goto L_0x0129
        L_0x0128:
            r5 = 0
        L_0x0129:
            if (r5 == 0) goto L_0x013c
            e8.n r14 = r4.f59135f
            boolean r14 = r14.mo32117c()
            if (r14 != 0) goto L_0x0135
            goto L_0x01cb
        L_0x0135:
            e8.n r14 = r4.f59135f
            int r14 = r14.mo32120f()
            goto L_0x013d
        L_0x013c:
            r14 = 0
        L_0x013d:
            int r15 = r10.f57802h
            if (r15 != 0) goto L_0x0171
            e8.n r15 = r4.f59135f
            int r3 = r10.f57803i
            boolean r3 = r15.mo32116b(r3)
            if (r3 != 0) goto L_0x014d
            goto L_0x01cb
        L_0x014d:
            e8.n r3 = r4.f59135f
            int r15 = r10.f57803i
            int r3 = r3.mo32119e(r15)
            boolean r9 = r9.f57794c
            if (r9 == 0) goto L_0x016c
            if (r11 != 0) goto L_0x016c
            e8.n r9 = r4.f59135f
            boolean r9 = r9.mo32117c()
            if (r9 != 0) goto L_0x0165
            goto L_0x01cb
        L_0x0165:
            e8.n r9 = r4.f59135f
            int r9 = r9.mo32121g()
            goto L_0x016d
        L_0x016c:
            r9 = 0
        L_0x016d:
            r15 = r9
            r7 = 0
            r9 = 0
            goto L_0x01a5
        L_0x0171:
            if (r15 != r7) goto L_0x01a0
            boolean r3 = r10.f57804j
            if (r3 != 0) goto L_0x01a0
            e8.n r3 = r4.f59135f
            boolean r3 = r3.mo32117c()
            if (r3 != 0) goto L_0x0180
            goto L_0x01cb
        L_0x0180:
            e8.n r3 = r4.f59135f
            int r3 = r3.mo32121g()
            boolean r9 = r9.f57794c
            if (r9 == 0) goto L_0x01a1
            if (r11 != 0) goto L_0x01a1
            e8.n r9 = r4.f59135f
            boolean r9 = r9.mo32117c()
            if (r9 != 0) goto L_0x0195
            goto L_0x01cb
        L_0x0195:
            e8.n r9 = r4.f59135f
            int r9 = r9.mo32121g()
            r7 = r9
            r15 = 0
            r9 = r3
            r3 = 0
            goto L_0x01a5
        L_0x01a0:
            r3 = 0
        L_0x01a1:
            r9 = r3
            r3 = 0
            r7 = 0
            r15 = 0
        L_0x01a5:
            h7.j$b$a r0 = r4.f59143n
            r0.f59150c = r10
            r0.f59151d = r1
            r0.f59152e = r2
            r0.f59153f = r8
            r0.f59154g = r6
            r0.f59155h = r11
            r0.f59156i = r13
            r0.f59157j = r12
            r0.f59158k = r5
            r0.f59159l = r14
            r0.f59160m = r3
            r0.f59161n = r15
            r0.f59162o = r9
            r0.f59163p = r7
            r1 = 1
            r0.f59148a = r1
            r0.f59149b = r1
            r0 = 0
            r4.f59140k = r0
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20904j.mo32620f(byte[], int, int):void");
    }
}
