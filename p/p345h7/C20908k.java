package p345h7;

import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20537k;
import p333e8.C20541m;
import p345h7.C20923v;

/* renamed from: h7.k */
public final class C20908k implements C20901h {

    /* renamed from: a */
    public final C20918s f59164a;

    /* renamed from: b */
    public String f59165b;

    /* renamed from: c */
    public C16750m f59166c;

    /* renamed from: d */
    public C20909a f59167d;

    /* renamed from: e */
    public boolean f59168e;

    /* renamed from: f */
    public final boolean[] f59169f = new boolean[3];

    /* renamed from: g */
    public final C20912n f59170g = new C20912n(32, 128);

    /* renamed from: h */
    public final C20912n f59171h = new C20912n(33, 128);

    /* renamed from: i */
    public final C20912n f59172i = new C20912n(34, 128);

    /* renamed from: j */
    public final C20912n f59173j = new C20912n(39, 128);

    /* renamed from: k */
    public final C20912n f59174k = new C20912n(40, 128);

    /* renamed from: l */
    public long f59175l;

    /* renamed from: m */
    public long f59176m;

    /* renamed from: n */
    public final C20541m f59177n = new C20541m();

    /* renamed from: h7.k$a */
    public static final class C20909a {

        /* renamed from: a */
        public final C16750m f59178a;

        /* renamed from: b */
        public long f59179b;

        /* renamed from: c */
        public boolean f59180c;

        /* renamed from: d */
        public int f59181d;

        /* renamed from: e */
        public long f59182e;

        /* renamed from: f */
        public boolean f59183f;

        /* renamed from: g */
        public boolean f59184g;

        /* renamed from: h */
        public boolean f59185h;

        /* renamed from: i */
        public boolean f59186i;

        /* renamed from: j */
        public boolean f59187j;

        /* renamed from: k */
        public long f59188k;

        /* renamed from: l */
        public long f59189l;

        /* renamed from: m */
        public boolean f59190m;

        public C20909a(C16750m mVar) {
            this.f59178a = mVar;
        }
    }

    public C20908k(C20918s sVar) {
        this.f59164a = sVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32609a(p333e8.C20541m r38) {
        /*
            r37 = this;
            r0 = r37
        L_0x0002:
            r1 = r38
            int r2 = r1.f57811c
            int r3 = r1.f57810b
            int r4 = r2 - r3
            if (r4 <= 0) goto L_0x03d7
            byte[] r5 = r1.f57809a
            long r6 = r0.f59175l
            long r8 = (long) r4
            long r6 = r6 + r8
            r0.f59175l = r6
            b7.m r6 = r0.f59166c
            r6.mo17742b(r1, r4)
        L_0x0019:
            if (r3 >= r2) goto L_0x0002
            boolean[] r4 = r0.f59169f
            int r4 = p333e8.C20537k.m22255b(r5, r3, r2, r4)
            if (r4 != r2) goto L_0x0027
            r0.mo32621f(r5, r3, r2)
            return
        L_0x0027:
            int r6 = r4 + 3
            byte r7 = r5[r6]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r4 - r3
            if (r9 <= 0) goto L_0x0036
            r0.mo32621f(r5, r3, r4)
        L_0x0036:
            int r15 = r2 - r4
            long r3 = r0.f59175l
            long r10 = (long) r15
            long r3 = r3 - r10
            r14 = 0
            if (r9 >= 0) goto L_0x0041
            int r9 = -r9
            goto L_0x0042
        L_0x0041:
            r9 = 0
        L_0x0042:
            long r10 = r0.f59176m
            boolean r12 = r0.f59168e
            if (r12 == 0) goto L_0x00ad
            h7.k$a r12 = r0.f59167d
            boolean r13 = r12.f59187j
            if (r13 == 0) goto L_0x0059
            boolean r13 = r12.f59184g
            if (r13 == 0) goto L_0x0059
            boolean r13 = r12.f59180c
            r12.f59190m = r13
            r12.f59187j = r14
            goto L_0x0062
        L_0x0059:
            boolean r13 = r12.f59185h
            if (r13 != 0) goto L_0x0071
            boolean r13 = r12.f59184g
            if (r13 == 0) goto L_0x0062
            goto L_0x0071
        L_0x0062:
            r17 = r2
            r18 = r5
            r19 = r6
            r21 = r7
            r13 = r9
            r20 = r15
        L_0x006d:
            r7 = 16
            goto L_0x02fb
        L_0x0071:
            boolean r13 = r12.f59186i
            if (r13 == 0) goto L_0x0098
            r13 = r9
            long r8 = r12.f59179b
            r17 = r2
            long r1 = r3 - r8
            int r2 = (int) r1
            int r23 = r2 + r15
            boolean r1 = r12.f59190m
            r2 = r15
            long r14 = r12.f59188k
            long r8 = r8 - r14
            int r9 = (int) r8
            b7.m r8 = r12.f59178a
            long r14 = r12.f59189l
            r24 = 0
            r18 = r8
            r19 = r14
            r21 = r1
            r22 = r9
            r18.mo17744d(r19, r21, r22, r23, r24)
            goto L_0x009c
        L_0x0098:
            r17 = r2
            r13 = r9
            r2 = r15
        L_0x009c:
            long r8 = r12.f59179b
            r12.f59188k = r8
            long r8 = r12.f59182e
            r12.f59189l = r8
            r1 = 1
            r12.f59186i = r1
            boolean r1 = r12.f59180c
            r12.f59190m = r1
            goto L_0x02f1
        L_0x00ad:
            r17 = r2
            r13 = r9
            r2 = r15
            h7.n r1 = r0.f59170g
            r1.mo32623b(r13)
            h7.n r1 = r0.f59171h
            r1.mo32623b(r13)
            h7.n r1 = r0.f59172i
            r1.mo32623b(r13)
            h7.n r1 = r0.f59170g
            boolean r8 = r1.f59211c
            if (r8 == 0) goto L_0x02f1
            h7.n r8 = r0.f59171h
            boolean r9 = r8.f59211c
            if (r9 == 0) goto L_0x02f1
            h7.n r9 = r0.f59172i
            boolean r12 = r9.f59211c
            if (r12 == 0) goto L_0x02f1
            b7.m r12 = r0.f59166c
            java.lang.String r14 = r0.f59165b
            int r15 = r1.f59213e
            r18 = r5
            int r5 = r8.f59213e
            int r5 = r5 + r15
            r19 = r6
            int r6 = r9.f59213e
            int r5 = r5 + r6
            byte[] r5 = new byte[r5]
            byte[] r6 = r1.f59212d
            r20 = r2
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r5, r2, r15)
            byte[] r6 = r8.f59212d
            int r15 = r1.f59213e
            r21 = r7
            int r7 = r8.f59213e
            java.lang.System.arraycopy(r6, r2, r5, r15, r7)
            byte[] r6 = r9.f59212d
            int r1 = r1.f59213e
            int r7 = r8.f59213e
            int r1 = r1 + r7
            int r7 = r9.f59213e
            java.lang.System.arraycopy(r6, r2, r5, r1, r7)
            e8.n r1 = new e8.n
            byte[] r6 = r8.f59212d
            int r7 = r8.f59213e
            r1.<init>(r6, r2, r7)
            r2 = 44
            r1.mo32124j(r2)
            r2 = 3
            int r6 = r1.mo32119e(r2)
            r1.mo32123i()
            r7 = 88
            r1.mo32124j(r7)
            r7 = 8
            r1.mo32124j(r7)
            r8 = 0
            r9 = 0
        L_0x0125:
            if (r8 >= r6) goto L_0x013a
            boolean r15 = r1.mo32118d()
            if (r15 == 0) goto L_0x012f
            int r9 = r9 + 89
        L_0x012f:
            boolean r15 = r1.mo32118d()
            if (r15 == 0) goto L_0x0137
            int r9 = r9 + 8
        L_0x0137:
            int r8 = r8 + 1
            goto L_0x0125
        L_0x013a:
            r1.mo32124j(r9)
            r8 = 2
            if (r6 <= 0) goto L_0x0147
            int r9 = 8 - r6
            int r9 = r9 * 2
            r1.mo32124j(r9)
        L_0x0147:
            r1.mo32120f()
            int r9 = r1.mo32120f()
            if (r9 != r2) goto L_0x0153
            r1.mo32123i()
        L_0x0153:
            int r15 = r1.mo32120f()
            int r22 = r1.mo32120f()
            boolean r23 = r1.mo32118d()
            if (r23 == 0) goto L_0x018d
            int r23 = r1.mo32120f()
            int r24 = r1.mo32120f()
            int r25 = r1.mo32120f()
            int r26 = r1.mo32120f()
            r7 = 1
            if (r9 == r7) goto L_0x017a
            if (r9 != r8) goto L_0x0177
            goto L_0x017a
        L_0x0177:
            r28 = 1
            goto L_0x017c
        L_0x017a:
            r28 = 2
        L_0x017c:
            if (r9 != r7) goto L_0x0180
            r7 = 2
            goto L_0x0181
        L_0x0180:
            r7 = 1
        L_0x0181:
            int r23 = r23 + r24
            int r28 = r28 * r23
            int r15 = r15 - r28
            int r25 = r25 + r26
            int r7 = r7 * r25
            int r22 = r22 - r7
        L_0x018d:
            r30 = r15
            r31 = r22
            r1.mo32120f()
            r1.mo32120f()
            int r7 = r1.mo32120f()
            boolean r9 = r1.mo32118d()
            if (r9 == 0) goto L_0x01a3
            r9 = 0
            goto L_0x01a4
        L_0x01a3:
            r9 = r6
        L_0x01a4:
            if (r9 > r6) goto L_0x01b2
            r1.mo32120f()
            r1.mo32120f()
            r1.mo32120f()
            int r9 = r9 + 1
            goto L_0x01a4
        L_0x01b2:
            r1.mo32120f()
            r1.mo32120f()
            r1.mo32120f()
            r1.mo32120f()
            r1.mo32120f()
            r1.mo32120f()
            boolean r6 = r1.mo32118d()
            r9 = 4
            if (r6 == 0) goto L_0x020b
            boolean r6 = r1.mo32118d()
            if (r6 == 0) goto L_0x020b
            r6 = 0
        L_0x01d2:
            if (r6 >= r9) goto L_0x020b
            r15 = 0
        L_0x01d5:
            r8 = 6
            if (r15 >= r8) goto L_0x0206
            boolean r8 = r1.mo32118d()
            if (r8 != 0) goto L_0x01e2
            r1.mo32120f()
            goto L_0x01fd
        L_0x01e2:
            r8 = 64
            int r23 = r6 << 1
            int r23 = r23 + 4
            r9 = 1
            int r2 = r9 << r23
            int r2 = java.lang.Math.min(r8, r2)
            if (r6 <= r9) goto L_0x01f4
            r1.mo32121g()
        L_0x01f4:
            r8 = 0
        L_0x01f5:
            if (r8 >= r2) goto L_0x01fd
            r1.mo32121g()
            int r8 = r8 + 1
            goto L_0x01f5
        L_0x01fd:
            r2 = 3
            if (r6 != r2) goto L_0x0202
            r8 = 3
            goto L_0x0203
        L_0x0202:
            r8 = 1
        L_0x0203:
            int r15 = r15 + r8
            r9 = 4
            goto L_0x01d5
        L_0x0206:
            int r6 = r6 + 1
            r8 = 2
            r9 = 4
            goto L_0x01d2
        L_0x020b:
            r2 = 2
            r1.mo32124j(r2)
            boolean r2 = r1.mo32118d()
            if (r2 == 0) goto L_0x0223
            r2 = 8
            r1.mo32124j(r2)
            r1.mo32120f()
            r1.mo32120f()
            r1.mo32123i()
        L_0x0223:
            int r2 = r1.mo32120f()
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x022a:
            if (r6 >= r2) goto L_0x0277
            if (r6 == 0) goto L_0x0232
            boolean r8 = r1.mo32118d()
        L_0x0232:
            if (r8 == 0) goto L_0x024c
            r1.mo32123i()
            r1.mo32120f()
            r15 = 0
        L_0x023b:
            if (r15 > r9) goto L_0x0249
            boolean r23 = r1.mo32118d()
            if (r23 == 0) goto L_0x0246
            r1.mo32123i()
        L_0x0246:
            int r15 = r15 + 1
            goto L_0x023b
        L_0x0249:
            r25 = r2
            goto L_0x0272
        L_0x024c:
            int r9 = r1.mo32120f()
            int r15 = r1.mo32120f()
            int r23 = r9 + r15
            r25 = r2
            r2 = 0
        L_0x0259:
            if (r2 >= r9) goto L_0x0264
            r1.mo32120f()
            r1.mo32123i()
            int r2 = r2 + 1
            goto L_0x0259
        L_0x0264:
            r2 = 0
        L_0x0265:
            if (r2 >= r15) goto L_0x0270
            r1.mo32120f()
            r1.mo32123i()
            int r2 = r2 + 1
            goto L_0x0265
        L_0x0270:
            r9 = r23
        L_0x0272:
            int r6 = r6 + 1
            r2 = r25
            goto L_0x022a
        L_0x0277:
            boolean r2 = r1.mo32118d()
            if (r2 == 0) goto L_0x028f
            r2 = 0
        L_0x027e:
            int r6 = r1.mo32120f()
            if (r2 >= r6) goto L_0x028f
            r6 = 4
            int r9 = r7 + 4
            r8 = 1
            int r9 = r9 + r8
            r1.mo32124j(r9)
            int r2 = r2 + 1
            goto L_0x027e
        L_0x028f:
            r2 = 2
            r1.mo32124j(r2)
            boolean r2 = r1.mo32118d()
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x02cd
            boolean r2 = r1.mo32118d()
            if (r2 == 0) goto L_0x02cd
            r2 = 8
            int r2 = r1.mo32119e(r2)
            r7 = 255(0xff, float:3.57E-43)
            if (r2 != r7) goto L_0x02c0
            r7 = 16
            int r2 = r1.mo32119e(r7)
            int r1 = r1.mo32119e(r7)
            if (r2 == 0) goto L_0x02bd
            if (r1 == 0) goto L_0x02bd
            float r2 = (float) r2
            float r1 = (float) r1
            float r6 = r2 / r1
        L_0x02bd:
            r35 = r6
            goto L_0x02d1
        L_0x02c0:
            r7 = 16
            float[] r1 = p333e8.C20537k.f57789b
            r8 = 17
            if (r2 >= r8) goto L_0x02cf
            r1 = r1[r2]
            r35 = r1
            goto L_0x02d1
        L_0x02cd:
            r7 = 16
        L_0x02cf:
            r35 = 1065353216(0x3f800000, float:1.0)
        L_0x02d1:
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r33 = java.util.Collections.singletonList(r5)
            r34 = -1
            r36 = 0
            java.lang.String r26 = "video/hevc"
            r25 = r14
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m16649j(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r12.mo17741a(r1)
            r1 = 1
            r0.f59168e = r1
            goto L_0x02fb
        L_0x02f1:
            r20 = r2
            r18 = r5
            r19 = r6
            r21 = r7
            goto L_0x006d
        L_0x02fb:
            h7.n r1 = r0.f59173j
            boolean r1 = r1.mo32623b(r13)
            r2 = 5
            if (r1 == 0) goto L_0x0325
            h7.n r1 = r0.f59173j
            byte[] r5 = r1.f59212d
            int r1 = r1.f59213e
            int r1 = p333e8.C20537k.m22258e(r5, r1)
            e8.m r5 = r0.f59177n
            h7.n r6 = r0.f59173j
            byte[] r6 = r6.f59212d
            r5.mo32111v(r6, r1)
            e8.m r1 = r0.f59177n
            r1.mo32114y(r2)
            h7.s r1 = r0.f59164a
            e8.m r5 = r0.f59177n
            b7.m[] r1 = r1.f59247b
            p386u7.C22610g.m26471a(r10, r5, r1)
        L_0x0325:
            h7.n r1 = r0.f59174k
            boolean r1 = r1.mo32623b(r13)
            if (r1 == 0) goto L_0x034e
            h7.n r1 = r0.f59174k
            byte[] r5 = r1.f59212d
            int r1 = r1.f59213e
            int r1 = p333e8.C20537k.m22258e(r5, r1)
            e8.m r5 = r0.f59177n
            h7.n r6 = r0.f59174k
            byte[] r6 = r6.f59212d
            r5.mo32111v(r6, r1)
            e8.m r1 = r0.f59177n
            r1.mo32114y(r2)
            h7.s r1 = r0.f59164a
            e8.m r2 = r0.f59177n
            b7.m[] r1 = r1.f59247b
            p386u7.C22610g.m26471a(r10, r2, r1)
        L_0x034e:
            long r1 = r0.f59176m
            boolean r5 = r0.f59168e
            if (r5 == 0) goto L_0x03b2
            h7.k$a r5 = r0.f59167d
            r6 = 0
            r5.f59184g = r6
            r5.f59185h = r6
            r5.f59182e = r1
            r5.f59181d = r6
            r5.f59179b = r3
            r1 = 32
            r2 = r21
            if (r2 < r1) goto L_0x0396
            boolean r1 = r5.f59187j
            if (r1 != 0) goto L_0x0386
            boolean r1 = r5.f59186i
            if (r1 == 0) goto L_0x0386
            boolean r13 = r5.f59190m
            long r8 = r5.f59188k
            long r3 = r3 - r8
            int r14 = (int) r3
            b7.m r10 = r5.f59178a
            long r11 = r5.f59189l
            r16 = 0
            r1 = 16
            r3 = 0
            r15 = r20
            r10.mo17744d(r11, r13, r14, r15, r16)
            r5.f59186i = r3
            goto L_0x0389
        L_0x0386:
            r1 = 16
            r3 = 0
        L_0x0389:
            r4 = 34
            if (r2 > r4) goto L_0x0399
            boolean r4 = r5.f59187j
            r6 = 1
            r4 = r4 ^ r6
            r5.f59185h = r4
            r5.f59187j = r6
            goto L_0x039a
        L_0x0396:
            r1 = 16
            r3 = 0
        L_0x0399:
            r6 = 1
        L_0x039a:
            if (r2 < r1) goto L_0x03a2
            r1 = 21
            if (r2 > r1) goto L_0x03a2
            r14 = 1
            goto L_0x03a3
        L_0x03a2:
            r14 = 0
        L_0x03a3:
            r5.f59180c = r14
            if (r14 != 0) goto L_0x03ae
            r1 = 9
            if (r2 > r1) goto L_0x03ac
            goto L_0x03ae
        L_0x03ac:
            r8 = 0
            goto L_0x03af
        L_0x03ae:
            r8 = 1
        L_0x03af:
            r5.f59183f = r8
            goto L_0x03c3
        L_0x03b2:
            r2 = r21
            h7.n r1 = r0.f59170g
            r1.mo32625d(r2)
            h7.n r1 = r0.f59171h
            r1.mo32625d(r2)
            h7.n r1 = r0.f59172i
            r1.mo32625d(r2)
        L_0x03c3:
            h7.n r1 = r0.f59173j
            r1.mo32625d(r2)
            h7.n r1 = r0.f59174k
            r1.mo32625d(r2)
            r1 = r38
            r2 = r17
            r5 = r18
            r3 = r19
            goto L_0x0019
        L_0x03d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20908k.mo32609a(e8.m):void");
    }

    /* renamed from: b */
    public void mo32610b() {
        C20537k.m22254a(this.f59169f);
        this.f59170g.mo32624c();
        this.f59171h.mo32624c();
        this.f59172i.mo32624c();
        this.f59173j.mo32624c();
        this.f59174k.mo32624c();
        C20909a aVar = this.f59167d;
        aVar.f59183f = false;
        aVar.f59184g = false;
        aVar.f59185h = false;
        aVar.f59186i = false;
        aVar.f59187j = false;
        this.f59175l = 0;
    }

    /* renamed from: c */
    public void mo32611c() {
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        dVar.mo32634a();
        dVar.mo32635b();
        this.f59165b = dVar.f59281e;
        dVar.mo32635b();
        C16750m o = gVar.mo17752o(dVar.f59280d, 2);
        this.f59166c = o;
        this.f59167d = new C20909a(o);
        this.f59164a.mo32632a(gVar, dVar);
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        this.f59176m = j;
    }

    /* renamed from: f */
    public final void mo32621f(byte[] bArr, int i, int i2) {
        if (this.f59168e) {
            C20909a aVar = this.f59167d;
            if (aVar.f59183f) {
                int i3 = aVar.f59181d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    aVar.f59184g = (bArr[i4] & 128) != 0;
                    aVar.f59183f = false;
                } else {
                    aVar.f59181d = i3 + (i2 - i);
                }
            }
        } else {
            this.f59170g.mo32622a(bArr, i, i2);
            this.f59171h.mo32622a(bArr, i, i2);
            this.f59172i.mo32622a(bArr, i, i2);
        }
        this.f59173j.mo32622a(bArr, i, i2);
        this.f59174k.mo32622a(bArr, i, i2);
    }
}
