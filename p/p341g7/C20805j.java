package p341g7;

import p333e8.C20541m;
import p341g7.C20807k;

/* renamed from: g7.j */
public final class C20805j extends C20800h {

    /* renamed from: n */
    public C20806a f58795n;

    /* renamed from: o */
    public int f58796o;

    /* renamed from: p */
    public boolean f58797p;

    /* renamed from: q */
    public C20807k.C20810c f58798q;

    /* renamed from: r */
    public C20807k.C20808a f58799r;

    /* renamed from: g7.j$a */
    public static final class C20806a {

        /* renamed from: a */
        public final C20807k.C20810c f58800a;

        /* renamed from: b */
        public final byte[] f58801b;

        /* renamed from: c */
        public final C20807k.C20809b[] f58802c;

        /* renamed from: d */
        public final int f58803d;

        public C20806a(C20807k.C20810c cVar, C20807k.C20808a aVar, byte[] bArr, C20807k.C20809b[] bVarArr, int i) {
            this.f58800a = cVar;
            this.f58801b = bArr;
            this.f58802c = bVarArr;
            this.f58803d = i;
        }
    }

    /* renamed from: a */
    public void mo32501a(long j) {
        this.f58782g = j;
        int i = 0;
        this.f58797p = j != 0;
        C20807k.C20810c cVar = this.f58798q;
        if (cVar != null) {
            i = cVar.f58808d;
        }
        this.f58796o = i;
    }

    /* renamed from: b */
    public long mo32494b(C20541m mVar) {
        int i = 0;
        byte b = mVar.f57809a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        C20806a aVar = this.f58795n;
        int i2 = !aVar.f58802c[(b >> 1) & (255 >>> (8 - aVar.f58803d))].f58804a ? aVar.f58800a.f58808d : aVar.f58800a.f58809e;
        if (this.f58797p) {
            i = (this.f58796o + i2) / 4;
        }
        long j = (long) i;
        mVar.mo32112w(mVar.f57811c + 4);
        byte[] bArr = mVar.f57809a;
        int i3 = mVar.f57811c;
        bArr[i3 - 4] = (byte) ((int) (j & 255));
        bArr[i3 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i3 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr[i3 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f58797p = true;
        this.f58796o = i2;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:173:0x03ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03f0  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32495c(p333e8.C20541m r21, long r22, p341g7.C20800h.C20802b r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            g7.j$a r2 = r0.f58795n
            r3 = 0
            if (r2 == 0) goto L_0x000a
            return r3
        L_0x000a:
            g7.k$c r2 = r0.f58798q
            r5 = 1
            if (r2 != 0) goto L_0x0063
            p341g7.C20807k.m22805a(r5, r1, r3)
            long r7 = r21.mo32095f()
            int r9 = r21.mo32103n()
            long r10 = r21.mo32095f()
            int r12 = r21.mo32094e()
            int r13 = r21.mo32094e()
            int r14 = r21.mo32094e()
            int r2 = r21.mo32103n()
            r6 = r2 & 15
            double r5 = (double) r6
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.pow(r3, r5)
            int r5 = (int) r5
            r2 = r2 & 240(0xf0, float:3.36E-43)
            r6 = 4
            int r2 = r2 >> r6
            r15 = r5
            double r5 = (double) r2
            double r2 = java.lang.Math.pow(r3, r5)
            int r2 = (int) r2
            int r3 = r21.mo32103n()
            r4 = 1
            r3 = r3 & r4
            if (r3 <= 0) goto L_0x004e
            r17 = 1
            goto L_0x0050
        L_0x004e:
            r17 = 0
        L_0x0050:
            byte[] r3 = r1.f57809a
            int r1 = r1.f57811c
            byte[] r18 = java.util.Arrays.copyOf(r3, r1)
            g7.k$c r1 = new g7.k$c
            r6 = r1
            r16 = r2
            r6.<init>(r7, r9, r10, r12, r13, r14, r15, r16, r17, r18)
            r0.f58798q = r1
            goto L_0x00b0
        L_0x0063:
            g7.k$a r2 = r0.f58799r
            r3 = 3
            if (r2 != 0) goto L_0x00bb
            r2 = 0
            p341g7.C20807k.m22805a(r3, r1, r2)
            long r2 = r21.mo32095f()
            int r3 = (int) r2
            java.lang.String r2 = r1.mo32101l(r3)
            int r3 = r2.length()
            int r3 = r3 + 11
            long r4 = r21.mo32095f()
            int r6 = (int) r4
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 4
            int r3 = r3 + r7
            r7 = r3
            r3 = 0
        L_0x0086:
            long r8 = (long) r3
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a0
            long r8 = r21.mo32095f()
            int r9 = (int) r8
            int r7 = r7 + 4
            java.lang.String r8 = r1.mo32101l(r9)
            r6[r3] = r8
            int r8 = r8.length()
            int r7 = r7 + r8
            int r3 = r3 + 1
            goto L_0x0086
        L_0x00a0:
            int r1 = r21.mo32103n()
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00b3
            int r7 = r7 + r3
            g7.k$a r1 = new g7.k$a
            r1.<init>(r2, r6, r7)
            r0.f58799r = r1
        L_0x00b0:
            r1 = 0
            goto L_0x03ea
        L_0x00b3:
            x6.n r1 = new x6.n
            java.lang.String r2 = "framing bit expected to be set"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x00bb:
            int r2 = r1.f57811c
            byte[] r7 = new byte[r2]
            byte[] r4 = r1.f57809a
            r5 = 0
            java.lang.System.arraycopy(r4, r5, r7, r5, r2)
            g7.k$c r2 = r0.f58798q
            int r2 = r2.f58805a
            r4 = 5
            p341g7.C20807k.m22805a(r4, r1, r5)
            int r6 = r21.mo32103n()
            r8 = 1
            int r6 = r6 + r8
            g7.i r8 = new g7.i
            byte[] r9 = r1.f57809a
            r8.<init>(r9)
            int r1 = r1.f57810b
            r9 = 8
            int r1 = r1 * 8
            r8.mo32504c(r1)
            r1 = 0
        L_0x00e4:
            r10 = 24
            r12 = 16
            if (r1 >= r6) goto L_0x01ee
            int r13 = r8.mo32503b(r10)
            r14 = 5653314(0x564342, float:7.92198E-39)
            if (r13 != r14) goto L_0x01d0
            int r12 = r8.mo32503b(r12)
            int r10 = r8.mo32503b(r10)
            long[] r13 = new long[r10]
            boolean r14 = r8.mo32502a()
            r16 = 0
            if (r14 != 0) goto L_0x013d
            boolean r14 = r8.mo32502a()
        L_0x0109:
            if (r5 >= r10) goto L_0x013a
            if (r14 == 0) goto L_0x0128
            boolean r18 = r8.mo32502a()
            if (r18 == 0) goto L_0x0121
            int r18 = r8.mo32503b(r4)
            r19 = 1
            int r15 = r18 + 1
            r18 = r12
            long r11 = (long) r15
            r13[r5] = r11
            goto L_0x0135
        L_0x0121:
            r18 = r12
            r19 = 1
            r13[r5] = r16
            goto L_0x0135
        L_0x0128:
            r18 = r12
            r19 = 1
            int r11 = r8.mo32503b(r4)
            int r11 = r11 + 1
            long r11 = (long) r11
            r13[r5] = r11
        L_0x0135:
            int r5 = r5 + 1
            r12 = r18
            goto L_0x0109
        L_0x013a:
            r18 = r12
            goto L_0x0170
        L_0x013d:
            r18 = r12
            r19 = 1
            int r5 = r8.mo32503b(r4)
            int r5 = r5 + 1
            r11 = r5
            r5 = 0
        L_0x0149:
            if (r5 >= r10) goto L_0x0170
            int r12 = r10 - r5
            r14 = r12
            r12 = 0
        L_0x014f:
            if (r14 <= 0) goto L_0x0156
            int r12 = r12 + 1
            int r14 = r14 >>> 1
            goto L_0x014f
        L_0x0156:
            int r12 = r8.mo32503b(r12)
            r14 = r5
            r5 = 0
        L_0x015c:
            if (r5 >= r12) goto L_0x016a
            if (r14 >= r10) goto L_0x016a
            long r3 = (long) r11
            r13[r14] = r3
            int r14 = r14 + 1
            int r5 = r5 + 1
            r3 = 3
            r4 = 5
            goto L_0x015c
        L_0x016a:
            int r11 = r11 + 1
            r5 = r14
            r3 = 3
            r4 = 5
            goto L_0x0149
        L_0x0170:
            r3 = 4
            int r4 = r8.mo32503b(r3)
            r5 = 2
            if (r4 > r5) goto L_0x01b9
            r11 = 1
            if (r4 == r11) goto L_0x017d
            if (r4 != r5) goto L_0x01b2
        L_0x017d:
            r5 = 32
            r8.mo32504c(r5)
            r8.mo32504c(r5)
            int r5 = r8.mo32503b(r3)
            int r5 = r5 + r11
            r8.mo32504c(r11)
            if (r4 != r11) goto L_0x01a4
            if (r18 == 0) goto L_0x01ab
            long r3 = (long) r10
            r11 = r18
            long r10 = (long) r11
            double r3 = (double) r3
            double r10 = (double) r10
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 / r10
            double r3 = java.lang.Math.pow(r3, r12)
            double r3 = java.lang.Math.floor(r3)
            long r3 = (long) r3
            goto L_0x01a9
        L_0x01a4:
            r11 = r18
            int r10 = r10 * r11
            long r3 = (long) r10
        L_0x01a9:
            r16 = r3
        L_0x01ab:
            long r3 = (long) r5
            long r3 = r3 * r16
            int r4 = (int) r3
            r8.mo32504c(r4)
        L_0x01b2:
            int r1 = r1 + 1
            r3 = 3
            r4 = 5
            r5 = 0
            goto L_0x00e4
        L_0x01b9:
            x6.n r1 = new x6.n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "lookup type greater than 2 not decodable: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01d0:
            x6.n r1 = new x6.n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r2.append(r3)
            int r3 = r8.f58793c
            int r3 = r3 * 8
            int r4 = r8.f58794d
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01ee:
            r1 = 6
            int r3 = r8.mo32503b(r1)
            r4 = 1
            int r3 = r3 + r4
            r4 = 0
        L_0x01f6:
            if (r4 >= r3) goto L_0x0209
            int r5 = r8.mo32503b(r12)
            if (r5 != 0) goto L_0x0201
            int r4 = r4 + 1
            goto L_0x01f6
        L_0x0201:
            x6.n r1 = new x6.n
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0209:
            int r3 = r8.mo32503b(r1)
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
        L_0x0210:
            if (r5 >= r3) goto L_0x02bf
            int r6 = r8.mo32503b(r12)
            if (r6 == 0) goto L_0x0297
            if (r6 != r4) goto L_0x0280
            r4 = 5
            int r6 = r8.mo32503b(r4)
            int[] r4 = new int[r6]
            r11 = -1
            r11 = 0
            r13 = -1
        L_0x0224:
            if (r11 >= r6) goto L_0x0234
            r14 = 4
            int r15 = r8.mo32503b(r14)
            r14 = r15
            r4[r11] = r14
            if (r14 <= r13) goto L_0x0231
            r13 = r14
        L_0x0231:
            int r11 = r11 + 1
            goto L_0x0224
        L_0x0234:
            int r13 = r13 + 1
            int[] r11 = new int[r13]
            r14 = 0
        L_0x0239:
            if (r14 >= r13) goto L_0x0261
            r15 = 3
            int r16 = r8.mo32503b(r15)
            r15 = 1
            int r16 = r16 + 1
            r11[r14] = r16
            r10 = 2
            int r17 = r8.mo32503b(r10)
            if (r17 <= 0) goto L_0x024f
            r8.mo32504c(r9)
        L_0x024f:
            r10 = 0
        L_0x0250:
            int r1 = r15 << r17
            if (r10 >= r1) goto L_0x025b
            r8.mo32504c(r9)
            int r10 = r10 + 1
            r15 = 1
            goto L_0x0250
        L_0x025b:
            int r14 = r14 + 1
            r1 = 6
            r10 = 24
            goto L_0x0239
        L_0x0261:
            r1 = 2
            r8.mo32504c(r1)
            r1 = 4
            int r10 = r8.mo32503b(r1)
            r1 = 0
            r13 = 0
            r14 = 0
        L_0x026d:
            if (r1 >= r6) goto L_0x02b7
            r17 = r4[r1]
            r17 = r11[r17]
            int r13 = r13 + r17
        L_0x0275:
            if (r14 >= r13) goto L_0x027d
            r8.mo32504c(r10)
            int r14 = r14 + 1
            goto L_0x0275
        L_0x027d:
            int r1 = r1 + 1
            goto L_0x026d
        L_0x0280:
            x6.n r1 = new x6.n
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "floor type greater than 1 not decodable: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0297:
            r8.mo32504c(r9)
            r8.mo32504c(r12)
            r8.mo32504c(r12)
            r1 = 6
            r8.mo32504c(r1)
            r8.mo32504c(r9)
            r1 = 4
            int r4 = r8.mo32503b(r1)
            r1 = 1
            int r4 = r4 + r1
            r1 = 0
        L_0x02af:
            if (r1 >= r4) goto L_0x02b7
            r8.mo32504c(r9)
            int r1 = r1 + 1
            goto L_0x02af
        L_0x02b7:
            int r5 = r5 + 1
            r1 = 6
            r4 = 1
            r10 = 24
            goto L_0x0210
        L_0x02bf:
            int r3 = r8.mo32503b(r1)
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
        L_0x02c6:
            if (r5 >= r3) goto L_0x032c
            int r6 = r8.mo32503b(r12)
            r10 = 2
            if (r6 > r10) goto L_0x0324
            r6 = 24
            r8.mo32504c(r6)
            r8.mo32504c(r6)
            r8.mo32504c(r6)
            int r10 = r8.mo32503b(r1)
            int r10 = r10 + r4
            r8.mo32504c(r9)
            int[] r1 = new int[r10]
            r4 = 0
        L_0x02e5:
            if (r4 >= r10) goto L_0x0304
            r11 = 3
            int r13 = r8.mo32503b(r11)
            boolean r14 = r8.mo32502a()
            if (r14 == 0) goto L_0x02f8
            r14 = 5
            int r16 = r8.mo32503b(r14)
            goto L_0x02fb
        L_0x02f8:
            r14 = 5
            r16 = 0
        L_0x02fb:
            int r16 = r16 * 8
            int r16 = r16 + r13
            r1[r4] = r16
            int r4 = r4 + 1
            goto L_0x02e5
        L_0x0304:
            r11 = 3
            r14 = 5
            r4 = 0
        L_0x0307:
            if (r4 >= r10) goto L_0x031f
            r13 = 0
        L_0x030a:
            if (r13 >= r9) goto L_0x031c
            r16 = r1[r4]
            r17 = 1
            int r19 = r17 << r13
            r16 = r16 & r19
            if (r16 == 0) goto L_0x0319
            r8.mo32504c(r9)
        L_0x0319:
            int r13 = r13 + 1
            goto L_0x030a
        L_0x031c:
            int r4 = r4 + 1
            goto L_0x0307
        L_0x031f:
            int r5 = r5 + 1
            r1 = 6
            r4 = 1
            goto L_0x02c6
        L_0x0324:
            x6.n r1 = new x6.n
            java.lang.String r2 = "residueType greater than 2 is not decodable"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x032c:
            int r3 = r8.mo32503b(r1)
            r1 = 1
            int r3 = r3 + r1
            r4 = 0
        L_0x0333:
            if (r4 >= r3) goto L_0x03a9
            int r5 = r8.mo32503b(r12)
            if (r5 == 0) goto L_0x033e
            r1 = 2
            r10 = 4
            goto L_0x039c
        L_0x033e:
            boolean r5 = r8.mo32502a()
            if (r5 == 0) goto L_0x034c
            r5 = 4
            int r6 = r8.mo32503b(r5)
            int r5 = r6 + 1
            goto L_0x034d
        L_0x034c:
            r5 = 1
        L_0x034d:
            boolean r6 = r8.mo32502a()
            if (r6 == 0) goto L_0x0378
            int r6 = r8.mo32503b(r9)
            int r6 = r6 + r1
            r1 = 0
        L_0x0359:
            if (r1 >= r6) goto L_0x0378
            int r10 = r2 + -1
            r13 = r10
            r11 = 0
        L_0x035f:
            if (r13 <= 0) goto L_0x0366
            int r11 = r11 + 1
            int r13 = r13 >>> 1
            goto L_0x035f
        L_0x0366:
            r8.mo32504c(r11)
            r11 = r10
            r10 = 0
        L_0x036b:
            if (r11 <= 0) goto L_0x0372
            int r10 = r10 + 1
            int r11 = r11 >>> 1
            goto L_0x036b
        L_0x0372:
            r8.mo32504c(r10)
            int r1 = r1 + 1
            goto L_0x0359
        L_0x0378:
            r1 = 2
            int r6 = r8.mo32503b(r1)
            if (r6 != 0) goto L_0x03a0
            r6 = 1
            if (r5 <= r6) goto L_0x038c
            r6 = 0
        L_0x0383:
            if (r6 >= r2) goto L_0x038c
            r10 = 4
            r8.mo32504c(r10)
            int r6 = r6 + 1
            goto L_0x0383
        L_0x038c:
            r10 = 4
            r6 = 0
        L_0x038e:
            if (r6 >= r5) goto L_0x039c
            r8.mo32504c(r9)
            r8.mo32504c(r9)
            r8.mo32504c(r9)
            int r6 = r6 + 1
            goto L_0x038e
        L_0x039c:
            int r4 = r4 + 1
            r1 = 1
            goto L_0x0333
        L_0x03a0:
            x6.n r1 = new x6.n
            java.lang.String r2 = "to reserved bits must be zero after mapping coupling steps"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03a9:
            r1 = 6
            int r1 = r8.mo32503b(r1)
            r2 = 1
            int r1 = r1 + r2
            g7.k$b[] r2 = new p341g7.C20807k.C20809b[r1]
            r3 = 0
        L_0x03b3:
            if (r3 >= r1) goto L_0x03cf
            boolean r4 = r8.mo32502a()
            int r5 = r8.mo32503b(r12)
            int r6 = r8.mo32503b(r12)
            int r10 = r8.mo32503b(r9)
            g7.k$b r11 = new g7.k$b
            r11.<init>(r4, r5, r6, r10)
            r2[r3] = r11
            int r3 = r3 + 1
            goto L_0x03b3
        L_0x03cf:
            boolean r3 = r8.mo32502a()
            if (r3 == 0) goto L_0x0422
            r3 = 1
            int r1 = r1 - r3
            r9 = 0
        L_0x03d8:
            if (r1 <= 0) goto L_0x03df
            int r9 = r9 + 1
            int r1 = r1 >>> 1
            goto L_0x03d8
        L_0x03df:
            g7.j$a r1 = new g7.j$a
            g7.k$c r5 = r0.f58798q
            g7.k$a r6 = r0.f58799r
            r4 = r1
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x03ea:
            r0.f58795n = r1
            if (r1 != 0) goto L_0x03f0
            r1 = 1
            return r1
        L_0x03f0:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            g7.j$a r1 = r0.f58795n
            g7.k$c r1 = r1.f58800a
            byte[] r1 = r1.f58810f
            r9.add(r1)
            g7.j$a r1 = r0.f58795n
            byte[] r1 = r1.f58801b
            r9.add(r1)
            r2 = 0
            r4 = 0
            g7.j$a r1 = r0.f58795n
            g7.k$c r1 = r1.f58800a
            int r5 = r1.f58807c
            r6 = -1
            int r7 = r1.f58805a
            long r10 = r1.f58806b
            int r8 = (int) r10
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r3 = "audio/vorbis"
            com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m16642c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r24
            r2.f58789a = r1
            r1 = 1
            return r1
        L_0x0422:
            x6.n r1 = new x6.n
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341g7.C20805j.mo32495c(e8.m, long, g7.h$b):boolean");
    }

    /* renamed from: d */
    public void mo32496d(boolean z) {
        super.mo32496d(z);
        if (z) {
            this.f58795n = null;
            this.f58798q = null;
            this.f58799r = null;
        }
        this.f58796o = 0;
        this.f58797p = false;
    }
}
