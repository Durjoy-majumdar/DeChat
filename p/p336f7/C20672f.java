package p336f7;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.Stack;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16748l;
import p294b7.C16750m;
import p333e8.C20537k;
import p333e8.C20541m;
import p333e8.C20551y;
import p336f7.C20659a;

/* renamed from: f7.f */
public final class C20672f implements C16741e, C16748l {

    /* renamed from: p */
    public static final int f58367p = C20551y.m22316f("qt  ");

    /* renamed from: a */
    public final C20541m f58368a = new C20541m(C20537k.f57788a);

    /* renamed from: b */
    public final C20541m f58369b = new C20541m(4);

    /* renamed from: c */
    public final C20541m f58370c = new C20541m(16);

    /* renamed from: d */
    public final Stack<C20659a.C20660a> f58371d = new Stack<>();

    /* renamed from: e */
    public int f58372e;

    /* renamed from: f */
    public int f58373f;

    /* renamed from: g */
    public long f58374g;

    /* renamed from: h */
    public int f58375h;

    /* renamed from: i */
    public C20541m f58376i;

    /* renamed from: j */
    public int f58377j;

    /* renamed from: k */
    public int f58378k;

    /* renamed from: l */
    public C16743g f58379l;

    /* renamed from: m */
    public C20673a[] f58380m;

    /* renamed from: n */
    public long f58381n;

    /* renamed from: o */
    public boolean f58382o;

    /* renamed from: f7.f$a */
    public static final class C20673a {

        /* renamed from: a */
        public final C20675h f58383a;

        /* renamed from: b */
        public final C20678k f58384b;

        /* renamed from: c */
        public final C16750m f58385c;

        /* renamed from: d */
        public int f58386d;

        public C20673a(C20675h hVar, C20678k kVar, C16750m mVar) {
            this.f58383a = hVar;
            this.f58384b = kVar;
            this.f58385c = mVar;
        }
    }

    public C20672f(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x0197 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0194  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17745a(p294b7.C16742f r24, p294b7.C16747k r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f58372e
            r4 = 0
            r6 = 8
            r7 = -1
            r8 = 1
            if (r3 == 0) goto L_0x0199
            r13 = 2
            if (r3 == r8) goto L_0x0113
            if (r3 != r13) goto L_0x010d
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r6 = -1
        L_0x001c:
            f7.f$a[] r12 = r0.f58380m
            int r13 = r12.length
            if (r3 >= r13) goto L_0x003a
            r12 = r12[r3]
            int r13 = r12.f58386d
            f7.k r12 = r12.f58384b
            int r9 = r12.f58421a
            if (r13 != r9) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            long[] r9 = r12.f58422b
            r12 = r9[r13]
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x0036
            r6 = r3
            r14 = r12
        L_0x0036:
            int r3 = r3 + 1
            r13 = 2
            goto L_0x001c
        L_0x003a:
            if (r6 != r7) goto L_0x003e
            goto L_0x010c
        L_0x003e:
            r3 = r12[r6]
            b7.m r6 = r3.f58385c
            int r7 = r3.f58386d
            f7.k r9 = r3.f58384b
            long[] r12 = r9.f58422b
            r13 = r12[r7]
            int[] r9 = r9.f58423c
            r9 = r9[r7]
            f7.h r12 = r3.f58383a
            int r12 = r12.f58394g
            if (r12 != r8) goto L_0x005a
            r16 = 8
            long r13 = r13 + r16
            int r9 = r9 + -8
        L_0x005a:
            r12 = r1
            b7.b r12 = (p294b7.C16738b) r12
            r16 = r9
            long r8 = r12.f45242c
            long r8 = r13 - r8
            int r15 = r0.f58377j
            long r10 = (long) r15
            long r8 = r8 + r10
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x0109
            r4 = 262144(0x40000, double:1.295163E-318)
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x0074
            goto L_0x0109
        L_0x0074:
            int r2 = (int) r8
            r12.mo17738f(r2)
            f7.h r2 = r3.f58383a
            int r2 = r2.f58397j
            if (r2 == 0) goto L_0x00cd
            e8.m r4 = r0.f58369b
            byte[] r4 = r4.f57809a
            r5 = 0
            r4[r5] = r5
            r8 = 1
            r4[r8] = r5
            r8 = 2
            r4[r8] = r5
            int r4 = 4 - r2
            r9 = r16
        L_0x008f:
            int r8 = r0.f58377j
            if (r8 >= r9) goto L_0x00e7
            int r8 = r0.f58378k
            if (r8 != 0) goto L_0x00bd
            e8.m r8 = r0.f58369b
            byte[] r8 = r8.f57809a
            r12.mo17737e(r8, r4, r2, r5)
            e8.m r8 = r0.f58369b
            r8.mo32113x(r5)
            e8.m r8 = r0.f58369b
            int r8 = r8.mo32106q()
            r0.f58378k = r8
            e8.m r8 = r0.f58368a
            r8.mo32113x(r5)
            e8.m r8 = r0.f58368a
            r10 = 4
            r6.mo17742b(r8, r10)
            int r8 = r0.f58377j
            int r8 = r8 + r10
            r0.f58377j = r8
            int r9 = r9 + r4
            goto L_0x008f
        L_0x00bd:
            int r8 = r6.mo17743c(r1, r8, r5)
            int r5 = r0.f58377j
            int r5 = r5 + r8
            r0.f58377j = r5
            int r5 = r0.f58378k
            int r5 = r5 - r8
            r0.f58378k = r5
            r5 = 0
            goto L_0x008f
        L_0x00cd:
            int r2 = r0.f58377j
            r9 = r16
            if (r2 >= r9) goto L_0x00e7
            int r2 = r9 - r2
            r4 = 0
            int r2 = r6.mo17743c(r1, r2, r4)
            int r4 = r0.f58377j
            int r4 = r4 + r2
            r0.f58377j = r4
            int r4 = r0.f58378k
            int r4 = r4 - r2
            r0.f58378k = r4
            r16 = r9
            goto L_0x00cd
        L_0x00e7:
            r20 = r9
            f7.k r1 = r3.f58384b
            long[] r2 = r1.f58425e
            r17 = r2[r7]
            int[] r1 = r1.f58426f
            r19 = r1[r7]
            r21 = 0
            r22 = 0
            r16 = r6
            r16.mo17744d(r17, r19, r20, r21, r22)
            int r1 = r3.f58386d
            r2 = 1
            int r1 = r1 + r2
            r3.f58386d = r1
            r1 = 0
            r0.f58377j = r1
            r0.f58378k = r1
            r7 = 0
            goto L_0x010c
        L_0x0109:
            r2.f45264a = r13
            r7 = 1
        L_0x010c:
            return r7
        L_0x010d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0113:
            long r3 = r0.f58374g
            int r5 = r0.f58375h
            long r7 = (long) r5
            long r3 = r3 - r7
            r7 = r1
            b7.b r7 = (p294b7.C16738b) r7
            long r8 = r7.f45242c
            long r8 = r8 + r3
            e8.m r10 = r0.f58376i
            if (r10 == 0) goto L_0x0178
            byte[] r10 = r10.f57809a
            int r4 = (int) r3
            r3 = 0
            r7.mo17737e(r10, r5, r4, r3)
            int r3 = r0.f58373f
            int r4 = p336f7.C20659a.f58213b
            if (r3 != r4) goto L_0x0157
            e8.m r3 = r0.f58376i
            r3.mo32113x(r6)
            int r4 = r3.mo32092c()
            int r5 = f58367p
            if (r4 != r5) goto L_0x013e
            goto L_0x0151
        L_0x013e:
            r4 = 4
            r3.mo32114y(r4)
        L_0x0142:
            int r4 = r3.f57811c
            int r5 = r3.f57810b
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0153
            int r4 = r3.mo32092c()
            int r5 = f58367p
            if (r4 != r5) goto L_0x0142
        L_0x0151:
            r3 = 1
            goto L_0x0154
        L_0x0153:
            r3 = 0
        L_0x0154:
            r0.f58382o = r3
            goto L_0x0183
        L_0x0157:
            java.util.Stack<f7.a$a> r3 = r0.f58371d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0183
            java.util.Stack<f7.a$a> r3 = r0.f58371d
            java.lang.Object r3 = r3.peek()
            f7.a$a r3 = (p336f7.C20659a.C20660a) r3
            f7.a$b r4 = new f7.a$b
            int r5 = r0.f58373f
            e8.m r6 = r0.f58376i
            r4.<init>(r5, r6)
            java.util.List<f7.a$b> r3 = r3.f58265Q0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            goto L_0x0183
        L_0x0178:
            r5 = 262144(0x40000, double:1.295163E-318)
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0185
            int r4 = (int) r3
            r7.mo17738f(r4)
        L_0x0183:
            r3 = 0
            goto L_0x0188
        L_0x0185:
            r2.f45264a = r8
            r3 = 1
        L_0x0188:
            r0.mo32366i(r8)
            if (r3 == 0) goto L_0x0194
            int r3 = r0.f58372e
            r4 = 2
            if (r3 == r4) goto L_0x0194
            r9 = 1
            goto L_0x0195
        L_0x0194:
            r9 = 0
        L_0x0195:
            if (r9 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0199:
            r3 = 1
            int r8 = r0.f58375h
            if (r8 != 0) goto L_0x01c6
            e8.m r8 = r0.f58370c
            byte[] r8 = r8.f57809a
            r9 = r1
            b7.b r9 = (p294b7.C16738b) r9
            r10 = 0
            boolean r8 = r9.mo17737e(r8, r10, r6, r3)
            if (r8 != 0) goto L_0x01af
            r8 = 0
            goto L_0x02e8
        L_0x01af:
            r0.f58375h = r6
            e8.m r3 = r0.f58370c
            r3.mo32113x(r10)
            e8.m r3 = r0.f58370c
            long r8 = r3.mo32104o()
            r0.f58374g = r8
            e8.m r3 = r0.f58370c
            int r3 = r3.mo32092c()
            r0.f58373f = r3
        L_0x01c6:
            long r8 = r0.f58374g
            r10 = 1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x01e7
            e8.m r3 = r0.f58370c
            byte[] r3 = r3.f57809a
            r4 = r1
            b7.b r4 = (p294b7.C16738b) r4
            r5 = 0
            r4.mo17737e(r3, r6, r6, r5)
            int r3 = r0.f58375h
            int r3 = r3 + r6
            r0.f58375h = r3
            e8.m r3 = r0.f58370c
            long r3 = r3.mo32107r()
            r0.f58374g = r3
            goto L_0x0215
        L_0x01e7:
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0215
            r3 = r1
            b7.b r3 = (p294b7.C16738b) r3
            long r4 = r3.f45241b
            r8 = -1
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0208
            java.util.Stack<f7.a$a> r10 = r0.f58371d
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0208
            java.util.Stack<f7.a$a> r4 = r0.f58371d
            java.lang.Object r4 = r4.peek()
            f7.a$a r4 = (p336f7.C20659a.C20660a) r4
            long r4 = r4.f58264P0
        L_0x0208:
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0215
            long r8 = r3.f45242c
            long r4 = r4 - r8
            int r3 = r0.f58375h
            long r8 = (long) r3
            long r4 = r4 + r8
            r0.f58374g = r4
        L_0x0215:
            long r3 = r0.f58374g
            int r5 = r0.f58375h
            long r8 = (long) r5
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x02eb
            int r10 = r0.f58373f
            int r11 = p336f7.C20659a.f58175C
            if (r10 == r11) goto L_0x023b
            int r11 = p336f7.C20659a.f58179E
            if (r10 == r11) goto L_0x023b
            int r11 = p336f7.C20659a.f58181F
            if (r10 == r11) goto L_0x023b
            int r11 = p336f7.C20659a.f58183G
            if (r10 == r11) goto L_0x023b
            int r11 = p336f7.C20659a.f58185H
            if (r10 == r11) goto L_0x023b
            int r11 = p336f7.C20659a.f58202Q
            if (r10 != r11) goto L_0x0239
            goto L_0x023b
        L_0x0239:
            r11 = 0
            goto L_0x023c
        L_0x023b:
            r11 = 1
        L_0x023c:
            if (r11 == 0) goto L_0x0266
            r5 = r1
            b7.b r5 = (p294b7.C16738b) r5
            long r5 = r5.f45242c
            long r5 = r5 + r3
            long r5 = r5 - r8
            java.util.Stack<f7.a$a> r3 = r0.f58371d
            f7.a$a r4 = new f7.a$a
            int r8 = r0.f58373f
            r4.<init>(r8, r5)
            r3.add(r4)
            long r3 = r0.f58374g
            int r8 = r0.f58375h
            long r8 = (long) r8
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x025e
            r0.mo32366i(r5)
            goto L_0x0263
        L_0x025e:
            r3 = 0
            r0.f58372e = r3
            r0.f58375h = r3
        L_0x0263:
            r3 = 1
            goto L_0x02e7
        L_0x0266:
            int r3 = p336f7.C20659a.f58204S
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58177D
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58205T
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58206U
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58236m0
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58238n0
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58240o0
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58203R
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58242p0
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58244q0
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58246r0
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58248s0
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58250t0
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58201P
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58213b
            if (r10 == r3) goto L_0x02aa
            int r3 = p336f7.C20659a.f58172A0
            if (r10 != r3) goto L_0x02a7
            goto L_0x02aa
        L_0x02a7:
            r17 = 0
            goto L_0x02ac
        L_0x02aa:
            r17 = 1
        L_0x02ac:
            if (r17 == 0) goto L_0x02e1
            if (r5 != r6) goto L_0x02b3
            r17 = 1
            goto L_0x02b5
        L_0x02b3:
            r17 = 0
        L_0x02b5:
            p333e8.C20528a.m22240d(r17)
            long r3 = r0.f58374g
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x02c4
            r17 = 1
            goto L_0x02c6
        L_0x02c4:
            r17 = 0
        L_0x02c6:
            p333e8.C20528a.m22240d(r17)
            e8.m r3 = new e8.m
            long r4 = r0.f58374g
            int r5 = (int) r4
            r3.<init>((int) r5)
            r0.f58376i = r3
            e8.m r4 = r0.f58370c
            byte[] r4 = r4.f57809a
            byte[] r3 = r3.f57809a
            r5 = 0
            java.lang.System.arraycopy(r4, r5, r3, r5, r6)
            r3 = 1
            r0.f58372e = r3
            goto L_0x02e7
        L_0x02e1:
            r3 = 1
            r4 = 0
            r0.f58376i = r4
            r0.f58372e = r3
        L_0x02e7:
            r8 = 1
        L_0x02e8:
            if (r8 != 0) goto L_0x0006
            return r7
        L_0x02eb:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p336f7.C20672f.mo17745a(b7.f, b7.k):int");
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        int i;
        this.f58371d.clear();
        this.f58375h = 0;
        this.f58377j = 0;
        this.f58378k = 0;
        if (j == 0) {
            this.f58372e = 0;
            this.f58375h = 0;
            return;
        }
        C20673a[] aVarArr = this.f58380m;
        if (aVarArr != null) {
            for (C20673a aVar : aVarArr) {
                C20678k kVar = aVar.f58384b;
                int c = C20551y.m22313c(kVar.f58425e, j2, true, false);
                while (true) {
                    i = -1;
                    if (c < 0) {
                        c = -1;
                        break;
                    } else if ((kVar.f58426f[c] & 1) != 0) {
                        break;
                    } else {
                        c--;
                    }
                }
                if (c == -1) {
                    int b = C20551y.m22312b(kVar.f58425e, j2, true, false);
                    while (true) {
                        if (b >= kVar.f58425e.length) {
                            break;
                        } else if ((kVar.f58426f[b] & 1) != 0) {
                            i = b;
                            break;
                        } else {
                            b++;
                        }
                    }
                    c = i;
                }
                aVar.f58386d = c;
            }
        }
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        return C20674g.m22612a(fVar, false);
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f58379l = gVar;
    }

    /* renamed from: f */
    public boolean mo17730f() {
        return true;
    }

    /* renamed from: g */
    public long mo17731g(long j) {
        int i;
        long j2 = MAlarmHandler.NEXT_FIRE_INTERVAL;
        for (C20673a aVar : this.f58380m) {
            C20678k kVar = aVar.f58384b;
            int c = C20551y.m22313c(kVar.f58425e, j, true, false);
            while (true) {
                i = -1;
                if (c < 0) {
                    c = -1;
                    break;
                } else if ((kVar.f58426f[c] & 1) != 0) {
                    break;
                } else {
                    c--;
                }
            }
            if (c == -1) {
                int b = C20551y.m22312b(kVar.f58425e, j, true, false);
                while (true) {
                    if (b >= kVar.f58425e.length) {
                        break;
                    } else if ((kVar.f58426f[b] & 1) != 0) {
                        i = b;
                        break;
                    } else {
                        b++;
                    }
                }
                c = i;
            }
            long j3 = kVar.f58422b[c];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: h */
    public long mo17732h() {
        return this.f58381n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0268 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd A[Catch:{ all -> 0x026c }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32366i(long r71) {
        /*
            r70 = this;
            r1 = r70
            r0 = r1
        L_0x0003:
            java.util.Stack<f7.a$a> r2 = r0.f58371d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x09bf
            java.util.Stack<f7.a$a> r2 = r0.f58371d
            java.lang.Object r2 = r2.peek()
            f7.a$a r2 = (p336f7.C20659a.C20660a) r2
            long r5 = r2.f58264P0
            int r2 = (r5 > r71 ? 1 : (r5 == r71 ? 0 : -1))
            if (r2 != 0) goto L_0x09bf
            java.util.Stack<f7.a$a> r2 = r0.f58371d
            java.lang.Object r2 = r2.pop()
            f7.a$a r2 = (p336f7.C20659a.C20660a) r2
            int r5 = r2.f58263a
            int r6 = p336f7.C20659a.f58175C
            if (r5 != r6) goto L_0x09a0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            b7.i r6 = new b7.i
            r6.<init>()
            int r7 = p336f7.C20659a.f58172A0
            f7.a$b r7 = r2.mo32357c(r7)
            r8 = 12
            r9 = 0
            r11 = 1
            if (r7 == 0) goto L_0x0297
            boolean r12 = r0.f58382o
            int r13 = p336f7.C20662b.f58268a
            if (r12 == 0) goto L_0x0045
            goto L_0x0290
        L_0x0045:
            e8.m r7 = r7.f58267P0
            r12 = 8
            r7.mo32113x(r12)
        L_0x004c:
            int r13 = r7.f57811c
            int r14 = r7.f57810b
            int r13 = r13 - r14
            if (r13 < r12) goto L_0x0290
            int r13 = r7.mo32092c()
            int r15 = r7.mo32092c()
            int r3 = p336f7.C20659a.f58174B0
            if (r15 != r3) goto L_0x0287
            r7.mo32113x(r14)
            int r14 = r14 + r13
            r7.mo32114y(r8)
        L_0x0066:
            int r3 = r7.f57810b
            if (r3 >= r14) goto L_0x0290
            int r13 = r7.mo32092c()
            int r15 = r7.mo32092c()
            int r10 = p336f7.C20659a.f58176C0
            if (r15 != r10) goto L_0x027e
            r7.mo32113x(r3)
            int r3 = r3 + r13
            r7.mo32114y(r12)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0082:
            int r13 = r7.f57810b
            if (r13 >= r3) goto L_0x0271
            int r14 = p336f7.C20671e.f58341a
            int r14 = r7.mo32092c()
            int r13 = r13 + r14
            int r14 = r7.mo32092c()
            int r15 = r14 >> 24
            r15 = r15 & 255(0xff, float:3.57E-43)
            r8 = 169(0xa9, float:2.37E-43)
            java.lang.String r4 = "TCON"
            r19 = 16777215(0xffffff, float:2.3509886E-38)
            if (r15 == r8) goto L_0x01c6
            r8 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r8) goto L_0x00a5
            goto L_0x01c6
        L_0x00a5:
            int r8 = p336f7.C20671e.f58353m     // Catch:{ all -> 0x026c }
            r15 = 4
            if (r14 != r8) goto L_0x00d4
            r7.mo32114y(r15)     // Catch:{ all -> 0x026c }
            int r8 = r7.mo32092c()     // Catch:{ all -> 0x026c }
            int r14 = p336f7.C20659a.f58182F0     // Catch:{ all -> 0x026c }
            if (r8 != r14) goto L_0x00bd
            r7.mo32114y(r12)     // Catch:{ all -> 0x026c }
            int r8 = r7.mo32103n()     // Catch:{ all -> 0x026c }
            goto L_0x00be
        L_0x00bd:
            r8 = -1
        L_0x00be:
            if (r8 <= 0) goto L_0x00ca
            java.lang.String[] r14 = p336f7.C20671e.f58340D     // Catch:{ all -> 0x026c }
            int r15 = r14.length     // Catch:{ all -> 0x026c }
            if (r8 > r15) goto L_0x00ca
            int r8 = r8 + -1
            r8 = r14[r8]     // Catch:{ all -> 0x026c }
            goto L_0x00cb
        L_0x00ca:
            r8 = r9
        L_0x00cb:
            if (r8 == 0) goto L_0x0251
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x026c }
            r14.<init>(r4, r9, r8)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x00d4:
            int r4 = p336f7.C20671e.f58355o     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x00e0
            java.lang.String r4 = "TPOS"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22600a(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x00e0:
            int r4 = p336f7.C20671e.f58356p     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x00ec
            java.lang.String r4 = "TRCK"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22600a(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x00ec:
            int r4 = p336f7.C20671e.f58357q     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x00f9
            java.lang.String r4 = "TBPM"
            r8 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame r14 = p336f7.C20671e.m22603d(r14, r4, r7, r11, r8)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x00f9:
            int r4 = p336f7.C20671e.f58358r     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x0105
            java.lang.String r4 = "TCMP"
            com.google.android.exoplayer2.metadata.id3.Id3Frame r14 = p336f7.C20671e.m22603d(r14, r4, r7, r11, r11)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x0105:
            int r4 = p336f7.C20671e.f58352l     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x0142
            int r4 = r7.mo32092c()     // Catch:{ all -> 0x026c }
            int r8 = r7.mo32092c()     // Catch:{ all -> 0x026c }
            int r14 = p336f7.C20659a.f58182F0     // Catch:{ all -> 0x026c }
            if (r8 != r14) goto L_0x0251
            int r8 = r7.mo32092c()     // Catch:{ all -> 0x026c }
            r8 = r8 & r19
            r14 = 13
            if (r8 != r14) goto L_0x0122
            java.lang.String r8 = "image/jpeg"
            goto L_0x012a
        L_0x0122:
            r14 = 14
            if (r8 != r14) goto L_0x0129
            java.lang.String r8 = "image/png"
            goto L_0x012a
        L_0x0129:
            r8 = r9
        L_0x012a:
            if (r8 != 0) goto L_0x012e
            goto L_0x0251
        L_0x012e:
            r7.mo32114y(r15)     // Catch:{ all -> 0x026c }
            int r4 = r4 + -16
            byte[] r14 = new byte[r4]     // Catch:{ all -> 0x026c }
            r15 = 0
            r7.mo32091b(r14, r15, r4)     // Catch:{ all -> 0x026c }
            com.google.android.exoplayer2.metadata.id3.ApicFrame r4 = new com.google.android.exoplayer2.metadata.id3.ApicFrame     // Catch:{ all -> 0x026c }
            r15 = 3
            r4.<init>(r8, r9, r15, r14)     // Catch:{ all -> 0x026c }
            r14 = r4
            goto L_0x0260
        L_0x0142:
            int r4 = p336f7.C20671e.f58359s     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x014e
            java.lang.String r4 = "TPE2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x014e:
            int r4 = p336f7.C20671e.f58360t     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x015a
            java.lang.String r4 = "TSOT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x015a:
            int r4 = p336f7.C20671e.f58361u     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x0166
            java.lang.String r4 = "TSO2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x0166:
            int r4 = p336f7.C20671e.f58362v     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x0172
            java.lang.String r4 = "TSOA"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x0172:
            int r4 = p336f7.C20671e.f58363w     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x017e
            java.lang.String r4 = "TSOP"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x017e:
            int r4 = p336f7.C20671e.f58364x     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x018a
            java.lang.String r4 = "TSOC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x018a:
            int r4 = p336f7.C20671e.f58365y     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x0197
            java.lang.String r4 = "ITUNESADVISORY"
            r8 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame r14 = p336f7.C20671e.m22603d(r14, r4, r7, r8, r8)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x0197:
            int r4 = p336f7.C20671e.f58366z     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x01a4
            java.lang.String r4 = "ITUNESGAPLESS"
            r8 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame r14 = p336f7.C20671e.m22603d(r14, r4, r7, r8, r11)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x01a4:
            int r4 = p336f7.C20671e.f58337A     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x01b0
            java.lang.String r4 = "TVSHOWSORT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x01b0:
            int r4 = p336f7.C20671e.f58338B     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x01bc
            java.lang.String r4 = "TVSHOW"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x01bc:
            int r4 = p336f7.C20671e.f58339C     // Catch:{ all -> 0x026c }
            if (r14 != r4) goto L_0x024e
            com.google.android.exoplayer2.metadata.id3.Id3Frame r14 = p336f7.C20671e.m22601b(r7, r13)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x01c6:
            r8 = r14 & r19
            int r15 = p336f7.C20671e.f58343c     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x01f0
            int r4 = r7.mo32092c()     // Catch:{ all -> 0x026c }
            int r8 = r7.mo32092c()     // Catch:{ all -> 0x026c }
            int r15 = p336f7.C20659a.f58182F0     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x01eb
            r7.mo32114y(r12)     // Catch:{ all -> 0x026c }
            int r4 = r4 + -16
            java.lang.String r4 = r7.mo32100k(r4)     // Catch:{ all -> 0x026c }
            com.google.android.exoplayer2.metadata.id3.CommentFrame r14 = new com.google.android.exoplayer2.metadata.id3.CommentFrame     // Catch:{ all -> 0x026c }
            java.lang.String r8 = "und"
            r14.<init>(r8, r4, r4)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x01eb:
            p336f7.C20659a.m22573a(r14)     // Catch:{ all -> 0x026c }
            goto L_0x0251
        L_0x01f0:
            int r15 = p336f7.C20671e.f58341a     // Catch:{ all -> 0x026c }
            if (r8 == r15) goto L_0x025a
            int r15 = p336f7.C20671e.f58342b     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x01fa
            goto L_0x025a
        L_0x01fa:
            int r15 = p336f7.C20671e.f58348h     // Catch:{ all -> 0x026c }
            if (r8 == r15) goto L_0x0253
            int r15 = p336f7.C20671e.f58349i     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x0203
            goto L_0x0253
        L_0x0203:
            int r15 = p336f7.C20671e.f58344d     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x020e
            java.lang.String r4 = "TDRC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x020e:
            int r15 = p336f7.C20671e.f58345e     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x0219
            java.lang.String r4 = "TPE1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x0219:
            int r15 = p336f7.C20671e.f58346f     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x0224
            java.lang.String r4 = "TSSE"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x0224:
            int r15 = p336f7.C20671e.f58347g     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x022f
            java.lang.String r4 = "TALB"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x022f:
            int r15 = p336f7.C20671e.f58350j     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x023a
            java.lang.String r4 = "USLT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x023a:
            int r15 = p336f7.C20671e.f58351k     // Catch:{ all -> 0x026c }
            if (r8 != r15) goto L_0x0243
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x0243:
            int r4 = p336f7.C20671e.f58354n     // Catch:{ all -> 0x026c }
            if (r8 != r4) goto L_0x024e
            java.lang.String r4 = "TIT1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x024e:
            p336f7.C20659a.m22573a(r14)     // Catch:{ all -> 0x026c }
        L_0x0251:
            r14 = r9
            goto L_0x0260
        L_0x0253:
            java.lang.String r4 = "TCOM"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
            goto L_0x0260
        L_0x025a:
            java.lang.String r4 = "TIT2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r14 = p336f7.C20671e.m22602c(r14, r4, r7)     // Catch:{ all -> 0x026c }
        L_0x0260:
            r7.mo32113x(r13)
            if (r14 == 0) goto L_0x0268
            r10.add(r14)
        L_0x0268:
            r8 = 12
            goto L_0x0082
        L_0x026c:
            r0 = move-exception
            r7.mo32113x(r13)
            throw r0
        L_0x0271:
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x0278
            goto L_0x0290
        L_0x0278:
            com.google.android.exoplayer2.metadata.Metadata r3 = new com.google.android.exoplayer2.metadata.Metadata
            r3.<init>((java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry>) r10)
            goto L_0x0291
        L_0x027e:
            int r13 = r13 + -8
            r7.mo32114y(r13)
            r8 = 12
            goto L_0x0066
        L_0x0287:
            int r13 = r13 + -8
            r7.mo32114y(r13)
            r8 = 12
            goto L_0x004c
        L_0x0290:
            r3 = r9
        L_0x0291:
            if (r3 == 0) goto L_0x0298
            r6.mo17753a(r3)
            goto L_0x0298
        L_0x0297:
            r3 = r9
        L_0x0298:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
        L_0x02a3:
            java.util.List<f7.a$a> r10 = r2.f58266R0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            if (r4 >= r10) goto L_0x097c
            java.util.List<f7.a$a> r10 = r2.f58266R0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r4)
            f7.a$a r10 = (p336f7.C20659a.C20660a) r10
            int r14 = r10.f58263a
            int r15 = p336f7.C20659a.f58179E
            if (r14 == r15) goto L_0x02be
            goto L_0x02d9
        L_0x02be:
            int r14 = p336f7.C20659a.f58177D
            f7.a$b r20 = r2.mo32357c(r14)
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r23 = 0
            r24 = 0
            boolean r0 = r0.f58382o
            r19 = r10
            r25 = r0
            f7.h r0 = p336f7.C20662b.m22579d(r19, r20, r21, r23, r24, r25)
            if (r0 != 0) goto L_0x02e9
        L_0x02d9:
            r47 = r2
            r17 = r3
            r53 = r4
            r50 = r5
            r54 = r6
            r51 = r7
            r48 = r12
            goto L_0x07c5
        L_0x02e9:
            int r14 = p336f7.C20659a.f58181F
            f7.a$a r10 = r10.mo32356b(r14)
            int r14 = p336f7.C20659a.f58183G
            f7.a$a r10 = r10.mo32356b(r14)
            int r14 = p336f7.C20659a.f58185H
            f7.a$a r10 = r10.mo32356b(r14)
            int r14 = p336f7.C20659a.f58244q0
            f7.a$b r14 = r10.mo32357c(r14)
            if (r14 == 0) goto L_0x0309
            f7.b$c r15 = new f7.b$c
            r15.<init>(r14)
            goto L_0x0316
        L_0x0309:
            int r14 = p336f7.C20659a.f58246r0
            f7.a$b r14 = r10.mo32357c(r14)
            if (r14 == 0) goto L_0x0974
            f7.b$d r15 = new f7.b$d
            r15.<init>(r14)
        L_0x0316:
            int r14 = r15.mo32360b()
            if (r14 != 0) goto L_0x0346
            f7.k r10 = new f7.k
            r14 = 0
            long[] r15 = new long[r14]
            int[] r9 = new int[r14]
            r22 = 0
            long[] r11 = new long[r14]
            r47 = r2
            int[] r2 = new int[r14]
            r19 = r10
            r20 = r15
            r21 = r9
            r23 = r11
            r24 = r2
            r19.<init>(r20, r21, r22, r23, r24)
            r17 = r3
            r53 = r4
            r50 = r5
            r54 = r6
            r51 = r7
            r48 = r12
            goto L_0x07c1
        L_0x0346:
            r47 = r2
            int r2 = p336f7.C20659a.f58248s0
            f7.a$b r2 = r10.mo32357c(r2)
            if (r2 != 0) goto L_0x0358
            int r2 = p336f7.C20659a.f58250t0
            f7.a$b r2 = r10.mo32357c(r2)
            r9 = 1
            goto L_0x0359
        L_0x0358:
            r9 = 0
        L_0x0359:
            e8.m r2 = r2.f58267P0
            int r11 = p336f7.C20659a.f58242p0
            f7.a$b r11 = r10.mo32357c(r11)
            e8.m r11 = r11.f58267P0
            r48 = r12
            int r12 = p336f7.C20659a.f58236m0
            f7.a$b r12 = r10.mo32357c(r12)
            e8.m r12 = r12.f58267P0
            int r13 = p336f7.C20659a.f58238n0
            f7.a$b r13 = r10.mo32357c(r13)
            if (r13 == 0) goto L_0x037a
            e8.m r13 = r13.f58267P0
            r50 = r5
            goto L_0x037d
        L_0x037a:
            r50 = r5
            r13 = 0
        L_0x037d:
            int r5 = p336f7.C20659a.f58240o0
            f7.a$b r5 = r10.mo32357c(r5)
            if (r5 == 0) goto L_0x0388
            e8.m r5 = r5.f58267P0
            goto L_0x0389
        L_0x0388:
            r5 = 0
        L_0x0389:
            f7.b$a r10 = new f7.b$a
            r10.<init>(r11, r2, r9)
            r2 = 12
            r12.mo32113x(r2)
            int r9 = r12.mo32106q()
            r11 = 1
            int r9 = r9 - r11
            int r11 = r12.mo32106q()
            r17 = r11
            int r11 = r12.mo32106q()
            if (r5 == 0) goto L_0x03ad
            r5.mo32113x(r2)
            int r19 = r5.mo32106q()
            goto L_0x03af
        L_0x03ad:
            r19 = 0
        L_0x03af:
            if (r13 == 0) goto L_0x03c5
            r13.mo32113x(r2)
            int r20 = r13.mo32106q()
            if (r20 <= 0) goto L_0x03c3
            int r21 = r13.mo32106q()
            r16 = -1
            int r21 = r21 + -1
            goto L_0x03c9
        L_0x03c3:
            r13 = 0
            goto L_0x03c7
        L_0x03c5:
            r20 = 0
        L_0x03c7:
            r21 = -1
        L_0x03c9:
            boolean r22 = r15.mo32361c()
            if (r22 == 0) goto L_0x03e5
            com.google.android.exoplayer2.Format r2 = r0.f58393f
            java.lang.String r2 = r2.f45777i
            r51 = r7
            java.lang.String r7 = "audio/raw"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x03e7
            if (r9 != 0) goto L_0x03e7
            if (r19 != 0) goto L_0x03e7
            if (r20 != 0) goto L_0x03e7
            r2 = 1
            goto L_0x03e8
        L_0x03e5:
            r51 = r7
        L_0x03e7:
            r2 = 0
        L_0x03e8:
            if (r2 != 0) goto L_0x04c1
            long[] r2 = new long[r14]
            int[] r7 = new int[r14]
            long[] r8 = new long[r14]
            r24 = r9
            int[] r9 = new int[r14]
            r53 = r4
            r54 = r6
            r25 = r19
            r26 = r20
            r6 = r21
            r1 = 0
            r4 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r27 = 0
            r29 = 0
            r69 = r17
            r17 = r3
            r3 = r11
            r11 = r69
        L_0x0411:
            if (r4 >= r14) goto L_0x049e
        L_0x0413:
            if (r20 != 0) goto L_0x042d
            boolean r20 = r10.mo32358a()
            p333e8.C20528a.m22240d(r20)
            r32 = r11
            r31 = r12
            long r11 = r10.f58278d
            r27 = r11
            int r11 = r10.f58277c
            r20 = r11
            r12 = r31
            r11 = r32
            goto L_0x0413
        L_0x042d:
            r32 = r11
            r31 = r12
            if (r5 == 0) goto L_0x0444
        L_0x0433:
            if (r19 != 0) goto L_0x0442
            if (r25 <= 0) goto L_0x0442
            int r19 = r5.mo32106q()
            int r21 = r5.mo32092c()
            int r25 = r25 + -1
            goto L_0x0433
        L_0x0442:
            int r19 = r19 + -1
        L_0x0444:
            r11 = r21
            r2[r4] = r27
            int r12 = r15.mo32359a()
            r7[r4] = r12
            if (r12 <= r1) goto L_0x0453
            r21 = r12
            goto L_0x0455
        L_0x0453:
            r21 = r1
        L_0x0455:
            r12 = r2
            long r1 = (long) r11
            long r1 = r29 + r1
            r8[r4] = r1
            if (r13 != 0) goto L_0x045f
            r1 = 1
            goto L_0x0460
        L_0x045f:
            r1 = 0
        L_0x0460:
            r9[r4] = r1
            if (r4 != r6) goto L_0x0471
            r1 = 1
            r9[r4] = r1
            int r26 = r26 + -1
            if (r26 <= 0) goto L_0x0471
            int r2 = r13.mo32106q()
            int r2 = r2 - r1
            r6 = r2
        L_0x0471:
            long r1 = (long) r3
            long r29 = r29 + r1
            r1 = -1
            int r2 = r32 + -1
            if (r2 != 0) goto L_0x0487
            if (r24 <= 0) goto L_0x0487
            int r1 = r31.mo32106q()
            int r2 = r31.mo32106q()
            int r24 = r24 + -1
            r3 = r2
            goto L_0x0488
        L_0x0487:
            r1 = r2
        L_0x0488:
            r2 = r7[r4]
            r32 = r1
            long r1 = (long) r2
            long r27 = r27 + r1
            int r20 = r20 + -1
            int r4 = r4 + 1
            r2 = r12
            r1 = r21
            r12 = r31
            r21 = r11
            r11 = r32
            goto L_0x0411
        L_0x049e:
            r12 = r2
            if (r19 != 0) goto L_0x04a3
            r2 = 1
            goto L_0x04a4
        L_0x04a3:
            r2 = 0
        L_0x04a4:
            p333e8.C20528a.m22237a(r2)
        L_0x04a7:
            if (r25 <= 0) goto L_0x04bb
            int r2 = r5.mo32106q()
            if (r2 != 0) goto L_0x04b1
            r2 = 1
            goto L_0x04b2
        L_0x04b1:
            r2 = 0
        L_0x04b2:
            p333e8.C20528a.m22237a(r2)
            r5.mo32092c()
            int r25 = r25 + -1
            goto L_0x04a7
        L_0x04bb:
            r31 = r1
            r11 = r8
            r8 = r12
            goto L_0x0549
        L_0x04c1:
            r17 = r3
            r53 = r4
            r54 = r6
            int r1 = r10.f58275a
            long[] r2 = new long[r1]
            int[] r3 = new int[r1]
        L_0x04cd:
            boolean r4 = r10.mo32358a()
            if (r4 == 0) goto L_0x04de
            int r4 = r10.f58276b
            long r5 = r10.f58278d
            r2[r4] = r5
            int r5 = r10.f58277c
            r3[r4] = r5
            goto L_0x04cd
        L_0x04de:
            int r4 = r15.mo32359a()
            long r5 = (long) r11
            r7 = 8192(0x2000, float:1.14794E-41)
            int r7 = r7 / r4
            r8 = 0
            r9 = 0
        L_0x04e8:
            if (r8 >= r1) goto L_0x04f6
            r10 = r3[r8]
            int r11 = p333e8.C20551y.f57835a
            int r10 = r10 + r7
            r11 = -1
            int r10 = r10 + r11
            int r10 = r10 / r7
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x04e8
        L_0x04f6:
            long[] r8 = new long[r9]
            int[] r10 = new int[r9]
            long[] r11 = new long[r9]
            int[] r9 = new int[r9]
            r12 = 0
            r13 = 0
            r15 = 0
            r19 = 0
        L_0x0503:
            if (r12 >= r1) goto L_0x0544
            r20 = r3[r12]
            r24 = r2[r12]
            r69 = r20
            r20 = r1
            r1 = r69
        L_0x050f:
            if (r1 <= 0) goto L_0x053b
            int r21 = java.lang.Math.min(r7, r1)
            r8[r19] = r24
            r26 = r2
            int r2 = r4 * r21
            r10[r19] = r2
            int r13 = java.lang.Math.max(r13, r2)
            r27 = r3
            long r2 = (long) r15
            long r2 = r2 * r5
            r11[r19] = r2
            r2 = 1
            r9[r19] = r2
            r2 = r10[r19]
            long r2 = (long) r2
            long r24 = r24 + r2
            int r15 = r15 + r21
            int r1 = r1 - r21
            int r19 = r19 + 1
            r2 = r26
            r3 = r27
            goto L_0x050f
        L_0x053b:
            r26 = r2
            r27 = r3
            int r12 = r12 + 1
            r1 = r20
            goto L_0x0503
        L_0x0544:
            r7 = r10
            r31 = r13
            r29 = 0
        L_0x0549:
            long[] r1 = r0.f58395h
            if (r1 == 0) goto L_0x07a7
            r4 = r54
            int r5 = r4.f45248a
            r6 = -1
            if (r5 == r6) goto L_0x055a
            int r5 = r4.f45249b
            if (r5 == r6) goto L_0x055a
            r5 = 1
            goto L_0x055b
        L_0x055a:
            r5 = 0
        L_0x055b:
            if (r5 == 0) goto L_0x0561
            r54 = r4
            goto L_0x07a7
        L_0x0561:
            int r5 = r1.length
            r6 = 1
            if (r5 != r6) goto L_0x05f1
            int r5 = r0.f58389b
            if (r5 != r6) goto L_0x05f1
            int r5 = r11.length
            r6 = 2
            if (r5 < r6) goto L_0x05f1
            long[] r5 = r0.f58396i
            r6 = 0
            r12 = r5[r6]
            r32 = r1[r6]
            long r2 = r0.f58390c
            r1 = r7
            long r6 = r0.f58391d
            r34 = r2
            r36 = r6
            long r2 = p333e8.C20551y.m22320j(r32, r34, r36)
            long r2 = r2 + r12
            r5 = 0
            r6 = r11[r5]
            int r5 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x05f2
            r5 = 1
            r24 = r11[r5]
            int r10 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r10 >= 0) goto L_0x05f2
            int r10 = r11.length
            int r10 = r10 - r5
            r24 = r11[r10]
            int r5 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x05f2
            int r5 = (r2 > r29 ? 1 : (r2 == r29 ? 0 : -1))
            if (r5 > 0) goto L_0x05f2
            long r32 = r29 - r2
            long r24 = r12 - r6
            com.google.android.exoplayer2.Format r2 = r0.f58393f
            int r2 = r2.f45790y
            long r2 = (long) r2
            long r5 = r0.f58390c
            r26 = r2
            r28 = r5
            long r2 = p333e8.C20551y.m22320j(r24, r26, r28)
            com.google.android.exoplayer2.Format r5 = r0.f58393f
            int r5 = r5.f45790y
            long r5 = (long) r5
            long r12 = r0.f58390c
            r34 = r5
            r36 = r12
            long r5 = p333e8.C20551y.m22320j(r32, r34, r36)
            r12 = 0
            int r7 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x05c8
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x05f2
        L_0x05c8:
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x05f2
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x05f2
            int r3 = (int) r2
            r4.f45248a = r3
            int r2 = (int) r5
            r4.f45249b = r2
            long r2 = r0.f58390c
            r5 = 1000000(0xf4240, double:4.940656E-318)
            p333e8.C20551y.m22321k(r11, r5, r2)
            f7.k r2 = new f7.k
            r28 = r2
            r29 = r8
            r30 = r1
            r32 = r11
            r33 = r9
            r28.<init>(r29, r30, r31, r32, r33)
            goto L_0x062f
        L_0x05f1:
            r1 = r7
        L_0x05f2:
            long[] r2 = r0.f58395h
            int r3 = r2.length
            r5 = 1
            if (r3 != r5) goto L_0x0634
            r18 = 0
            r5 = r2[r18]
            r2 = 0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0636
            r2 = 0
        L_0x0603:
            int r3 = r11.length
            if (r2 >= r3) goto L_0x0620
            r5 = r11[r2]
            long[] r3 = r0.f58396i
            r12 = r3[r18]
            long r19 = r5 - r12
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r0.f58390c
            r23 = r5
            long r5 = p333e8.C20551y.m22320j(r19, r21, r23)
            r11[r2] = r5
            int r2 = r2 + 1
            r18 = 0
            goto L_0x0603
        L_0x0620:
            f7.k r2 = new f7.k
            r28 = r2
            r29 = r8
            r30 = r1
            r32 = r11
            r33 = r9
            r28.<init>(r29, r30, r31, r32, r33)
        L_0x062f:
            r10 = r2
            r54 = r4
            goto L_0x07c1
        L_0x0634:
            r2 = 0
        L_0x0636:
            int r5 = r0.f58389b
            r6 = 1
            if (r5 != r6) goto L_0x063d
            r5 = 1
            goto L_0x063e
        L_0x063d:
            r5 = 0
        L_0x063e:
            r6 = 0
            r7 = 0
            r10 = 0
            r12 = 0
        L_0x0642:
            long[] r13 = r0.f58395h
            int r15 = r13.length
            r21 = -1
            if (r6 >= r15) goto L_0x068b
            long[] r15 = r0.f58396i
            r2 = r15[r6]
            int r15 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r15 == 0) goto L_0x067c
            r25 = r13[r6]
            r13 = r8
            r15 = r9
            long r8 = r0.f58390c
            r33 = r13
            r32 = r14
            long r13 = r0.f58391d
            r27 = r8
            r29 = r13
            long r8 = p333e8.C20551y.m22320j(r25, r27, r29)
            r13 = 1
            int r14 = p333e8.C20551y.m22312b(r11, r2, r13, r13)
            long r2 = r2 + r8
            r8 = 0
            int r2 = p333e8.C20551y.m22312b(r11, r2, r5, r8)
            int r3 = r2 - r14
            int r7 = r7 + r3
            if (r10 == r14) goto L_0x0677
            r3 = 1
            goto L_0x0678
        L_0x0677:
            r3 = 0
        L_0x0678:
            r3 = r3 | r12
            r10 = r2
            r12 = r3
            goto L_0x0681
        L_0x067c:
            r33 = r8
            r15 = r9
            r32 = r14
        L_0x0681:
            int r6 = r6 + 1
            r9 = r15
            r14 = r32
            r8 = r33
            r2 = 0
            goto L_0x0642
        L_0x068b:
            r33 = r8
            r15 = r9
            r2 = r14
            if (r7 == r2) goto L_0x0693
            r2 = 1
            goto L_0x0694
        L_0x0693:
            r2 = 0
        L_0x0694:
            r2 = r2 | r12
            if (r2 == 0) goto L_0x069a
            long[] r3 = new long[r7]
            goto L_0x069c
        L_0x069a:
            r3 = r33
        L_0x069c:
            if (r2 == 0) goto L_0x06a1
            int[] r6 = new int[r7]
            goto L_0x06a2
        L_0x06a1:
            r6 = r1
        L_0x06a2:
            if (r2 == 0) goto L_0x06a6
            r8 = 0
            goto L_0x06a8
        L_0x06a6:
            r8 = r31
        L_0x06a8:
            if (r2 == 0) goto L_0x06ad
            int[] r9 = new int[r7]
            goto L_0x06ae
        L_0x06ad:
            r9 = r15
        L_0x06ae:
            long[] r7 = new long[r7]
            r28 = r8
            r8 = 0
            r10 = 0
            r23 = 0
        L_0x06b6:
            long[] r12 = r0.f58395h
            int r13 = r12.length
            if (r8 >= r13) goto L_0x0760
            long[] r13 = r0.f58396i
            r25 = r15
            r14 = r13[r8]
            r40 = r12[r8]
            int r12 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r12 == 0) goto L_0x0741
            long r12 = r0.f58390c
            r32 = r7
            r42 = r8
            long r7 = r0.f58391d
            r34 = r40
            r36 = r12
            r38 = r7
            long r7 = p333e8.C20551y.m22320j(r34, r36, r38)
            long r7 = r7 + r14
            r12 = 1
            int r13 = p333e8.C20551y.m22312b(r11, r14, r12, r12)
            r12 = 0
            int r7 = p333e8.C20551y.m22312b(r11, r7, r5, r12)
            if (r2 == 0) goto L_0x06f8
            int r8 = r7 - r13
            r12 = r33
            java.lang.System.arraycopy(r12, r13, r3, r10, r8)
            java.lang.System.arraycopy(r1, r13, r6, r10, r8)
            r33 = r5
            r5 = r25
            java.lang.System.arraycopy(r5, r13, r9, r10, r8)
            goto L_0x06fe
        L_0x06f8:
            r12 = r33
            r33 = r5
            r5 = r25
        L_0x06fe:
            r8 = r28
        L_0x0700:
            if (r13 >= r7) goto L_0x073a
            r27 = 1000000(0xf4240, double:4.940656E-318)
            r34 = r3
            r54 = r4
            long r3 = r0.f58391d
            r25 = r23
            r29 = r3
            long r3 = p333e8.C20551y.m22320j(r25, r27, r29)
            r25 = r11[r13]
            long r55 = r25 - r14
            r57 = 1000000(0xf4240, double:4.940656E-318)
            r25 = r14
            long r14 = r0.f58390c
            r59 = r14
            long r14 = p333e8.C20551y.m22320j(r55, r57, r59)
            long r3 = r3 + r14
            r32[r10] = r3
            if (r2 == 0) goto L_0x072f
            r3 = r6[r10]
            if (r3 <= r8) goto L_0x072f
            r8 = r1[r13]
        L_0x072f:
            int r10 = r10 + 1
            int r13 = r13 + 1
            r14 = r25
            r3 = r34
            r4 = r54
            goto L_0x0700
        L_0x073a:
            r34 = r3
            r54 = r4
            r28 = r8
            goto L_0x074f
        L_0x0741:
            r34 = r3
            r54 = r4
            r32 = r7
            r42 = r8
            r12 = r33
            r33 = r5
            r5 = r25
        L_0x074f:
            long r23 = r23 + r40
            int r8 = r42 + 1
            r15 = r5
            r7 = r32
            r5 = r33
            r3 = r34
            r4 = r54
            r33 = r12
            goto L_0x06b6
        L_0x0760:
            r34 = r3
            r54 = r4
            r32 = r7
            r5 = r15
            r12 = r33
            r2 = 0
            r3 = 0
        L_0x076b:
            int r4 = r9.length
            if (r2 >= r4) goto L_0x077d
            if (r3 != 0) goto L_0x077d
            r4 = r9[r2]
            r7 = 1
            r4 = r4 & r7
            if (r4 == 0) goto L_0x0778
            r4 = 1
            goto L_0x0779
        L_0x0778:
            r4 = 0
        L_0x0779:
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L_0x076b
        L_0x077d:
            if (r3 != 0) goto L_0x0797
            long r2 = r0.f58390c
            r6 = 1000000(0xf4240, double:4.940656E-318)
            p333e8.C20551y.m22321k(r11, r6, r2)
            f7.k r10 = new f7.k
            r28 = r10
            r29 = r12
            r30 = r1
            r32 = r11
            r33 = r5
            r28.<init>(r29, r30, r31, r32, r33)
            goto L_0x07c1
        L_0x0797:
            f7.k r10 = new f7.k
            r25 = r10
            r26 = r34
            r27 = r6
            r29 = r32
            r30 = r9
            r25.<init>(r26, r27, r28, r29, r30)
            goto L_0x07c1
        L_0x07a7:
            r1 = r7
            r12 = r8
            r5 = r9
            long r2 = r0.f58390c
            r6 = 1000000(0xf4240, double:4.940656E-318)
            p333e8.C20551y.m22321k(r11, r6, r2)
            f7.k r10 = new f7.k
            r28 = r10
            r29 = r12
            r30 = r1
            r32 = r11
            r33 = r5
            r28.<init>(r29, r30, r31, r32, r33)
        L_0x07c1:
            int r1 = r10.f58421a
            if (r1 != 0) goto L_0x07cf
        L_0x07c5:
            r12 = r48
            r4 = r50
            r7 = r51
            r1 = r54
            goto L_0x0964
        L_0x07cf:
            f7.f$a r1 = new f7.f$a
            r2 = r70
            b7.g r3 = r2.f58379l
            int r4 = r0.f58389b
            r5 = r53
            b7.m r3 = r3.mo17752o(r5, r4)
            r1.<init>(r0, r10, r3)
            int r4 = r10.f58424d
            int r4 = r4 + 30
            r25 = r4
            com.google.android.exoplayer2.Format r6 = r0.f58393f
            com.google.android.exoplayer2.Format r7 = new com.google.android.exoplayer2.Format
            r19 = r7
            java.lang.String r8 = r6.f45772d
            r20 = r8
            java.lang.String r9 = r6.f45776h
            r21 = r9
            java.lang.String r11 = r6.f45777i
            r22 = r11
            java.lang.String r12 = r6.f45774f
            r23 = r12
            int r13 = r6.f45773e
            r24 = r13
            int r14 = r6.f45781p
            r26 = r14
            int r15 = r6.f45782q
            r27 = r15
            float r2 = r6.f45783r
            r28 = r2
            int r5 = r6.f45784s
            r29 = r5
            r55 = r10
            float r10 = r6.f45785t
            r30 = r10
            r56 = r1
            byte[] r1 = r6.f45787v
            r31 = r1
            r57 = r3
            int r3 = r6.f45786u
            r32 = r3
            r58 = r3
            com.google.android.exoplayer2.video.ColorInfo r3 = r6.f45788w
            r33 = r3
            r59 = r3
            int r3 = r6.f45789x
            r34 = r3
            r60 = r3
            int r3 = r6.f45790y
            r35 = r3
            r61 = r3
            int r3 = r6.f45791z
            r36 = r3
            r62 = r3
            int r3 = r6.f45765A
            r37 = r3
            int r3 = r6.f45766B
            r38 = r3
            int r3 = r6.f45768D
            r39 = r3
            r63 = r3
            java.lang.String r3 = r6.f45769E
            r40 = r3
            r64 = r3
            int r3 = r6.f45770F
            r41 = r3
            r66 = r1
            r65 = r2
            long r1 = r6.f45767C
            r42 = r1
            r67 = r1
            java.util.List<byte[]> r1 = r6.f45779n
            r44 = r1
            com.google.android.exoplayer2.drm.DrmInitData r1 = r6.f45780o
            r45 = r1
            com.google.android.exoplayer2.metadata.Metadata r1 = r6.f45775g
            r46 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45, r46)
            int r1 = r0.f58389b
            r2 = 1
            if (r1 != r2) goto L_0x0939
            r1 = r54
            int r6 = r1.f45248a
            r2 = -1
            r16 = r0
            if (r6 == r2) goto L_0x0881
            int r0 = r1.f45249b
            if (r0 == r2) goto L_0x0881
            r0 = 1
            goto L_0x0882
        L_0x0881:
            r0 = 0
        L_0x0882:
            if (r0 == 0) goto L_0x08c8
            int r0 = r1.f45249b
            r38 = r0
            com.google.android.exoplayer2.Format r0 = new com.google.android.exoplayer2.Format
            r19 = r0
            java.util.List<byte[]> r2 = r7.f45779n
            r44 = r2
            com.google.android.exoplayer2.drm.DrmInitData r2 = r7.f45780o
            r45 = r2
            com.google.android.exoplayer2.metadata.Metadata r2 = r7.f45775g
            r46 = r2
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r13
            r25 = r4
            r26 = r14
            r27 = r15
            r28 = r65
            r29 = r5
            r30 = r10
            r31 = r66
            r32 = r58
            r33 = r59
            r34 = r60
            r35 = r61
            r36 = r62
            r37 = r6
            r39 = r63
            r40 = r64
            r41 = r3
            r42 = r67
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45, r46)
            r7 = r0
        L_0x08c8:
            if (r17 == 0) goto L_0x093d
            com.google.android.exoplayer2.Format r0 = new com.google.android.exoplayer2.Format
            r19 = r0
            java.lang.String r2 = r7.f45772d
            r20 = r2
            java.lang.String r2 = r7.f45776h
            r21 = r2
            java.lang.String r2 = r7.f45777i
            r22 = r2
            java.lang.String r2 = r7.f45774f
            r23 = r2
            int r2 = r7.f45773e
            r24 = r2
            int r2 = r7.f45778j
            r25 = r2
            int r2 = r7.f45781p
            r26 = r2
            int r2 = r7.f45782q
            r27 = r2
            float r2 = r7.f45783r
            r28 = r2
            int r2 = r7.f45784s
            r29 = r2
            float r2 = r7.f45785t
            r30 = r2
            byte[] r2 = r7.f45787v
            r31 = r2
            int r2 = r7.f45786u
            r32 = r2
            com.google.android.exoplayer2.video.ColorInfo r2 = r7.f45788w
            r33 = r2
            int r2 = r7.f45789x
            r34 = r2
            int r2 = r7.f45790y
            r35 = r2
            int r2 = r7.f45791z
            r36 = r2
            int r2 = r7.f45765A
            r37 = r2
            int r2 = r7.f45766B
            r38 = r2
            int r2 = r7.f45768D
            r39 = r2
            java.lang.String r2 = r7.f45769E
            r40 = r2
            int r2 = r7.f45770F
            r41 = r2
            long r2 = r7.f45767C
            r42 = r2
            java.util.List<byte[]> r2 = r7.f45779n
            r44 = r2
            com.google.android.exoplayer2.drm.DrmInitData r2 = r7.f45780o
            r45 = r2
            r46 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45, r46)
            r7 = r0
            goto L_0x093d
        L_0x0939:
            r16 = r0
            r1 = r54
        L_0x093d:
            r0 = r57
            r0.mo17741a(r7)
            r0 = r16
            long r2 = r0.f58392e
            r7 = r51
            long r2 = java.lang.Math.max(r7, r2)
            r4 = r50
            r0 = r56
            r4.add(r0)
            r10 = r55
            long[] r0 = r10.f58422b
            r5 = 0
            r6 = r0[r5]
            int r0 = (r6 > r48 ? 1 : (r6 == r48 ? 0 : -1))
            if (r0 >= 0) goto L_0x0961
            r12 = r6
            r7 = r2
            goto L_0x0964
        L_0x0961:
            r7 = r2
            r12 = r48
        L_0x0964:
            int r0 = r53 + 1
            r6 = r1
            r5 = r4
            r3 = r17
            r2 = r47
            r9 = 0
            r11 = 1
            r1 = r70
            r4 = r0
            r0 = r1
            goto L_0x02a3
        L_0x0974:
            x6.n r0 = new x6.n
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x097c:
            r4 = r5
            r0.f58381n = r7
            int r1 = r4.size()
            f7.f$a[] r1 = new p336f7.C20672f.C20673a[r1]
            java.lang.Object[] r1 = r4.toArray(r1)
            f7.f$a[] r1 = (p336f7.C20672f.C20673a[]) r1
            r0.f58380m = r1
            b7.g r1 = r0.f58379l
            r1.mo17751i()
            b7.g r1 = r0.f58379l
            r1.mo17750g(r0)
            java.util.Stack<f7.a$a> r1 = r0.f58371d
            r1.clear()
            r1 = 2
            r0.f58372e = r1
            goto L_0x09bb
        L_0x09a0:
            r47 = r2
            java.util.Stack<f7.a$a> r1 = r0.f58371d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x09bb
            java.util.Stack<f7.a$a> r1 = r0.f58371d
            java.lang.Object r1 = r1.peek()
            f7.a$a r1 = (p336f7.C20659a.C20660a) r1
            java.util.List<f7.a$a> r1 = r1.f58266R0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2 = r47
            r1.add(r2)
        L_0x09bb:
            r1 = r70
            goto L_0x0003
        L_0x09bf:
            int r0 = r0.f58372e
            r1 = 2
            if (r0 == r1) goto L_0x09cc
            r0 = 0
            r1 = r70
            r1.f58372e = r0
            r1.f58375h = r0
            goto L_0x09ce
        L_0x09cc:
            r1 = r70
        L_0x09ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p336f7.C20672f.mo32366i(long):void");
    }

    public void release() {
    }
}
