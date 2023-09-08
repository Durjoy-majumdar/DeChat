package p332e7;

import com.google.android.exoplayer2.metadata.Metadata;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16745i;
import p294b7.C16746j;
import p294b7.C16748l;
import p294b7.C16750m;
import p333e8.C20541m;
import p333e8.C20551y;

/* renamed from: e7.b */
public final class C20522b implements C16741e {

    /* renamed from: m */
    public static final int f57741m = C20551y.m22316f("Xing");

    /* renamed from: n */
    public static final int f57742n = C20551y.m22316f("Info");

    /* renamed from: o */
    public static final int f57743o = C20551y.m22316f("VBRI");

    /* renamed from: a */
    public final long f57744a;

    /* renamed from: b */
    public final C20541m f57745b;

    /* renamed from: c */
    public final C16746j f57746c;

    /* renamed from: d */
    public final C16745i f57747d;

    /* renamed from: e */
    public C16743g f57748e;

    /* renamed from: f */
    public C16750m f57749f;

    /* renamed from: g */
    public int f57750g;

    /* renamed from: h */
    public Metadata f57751h;

    /* renamed from: i */
    public C20523a f57752i;

    /* renamed from: j */
    public long f57753j;

    /* renamed from: k */
    public long f57754k;

    /* renamed from: l */
    public int f57755l;

    /* renamed from: e7.b$a */
    public interface C20523a extends C16748l {
        /* renamed from: d */
        long mo32076d(long j);
    }

    public C20522b(int i) {
        this(i, -9223372036854775807L);
    }

    /* JADX WARNING: type inference failed for: r1v35, types: [e7.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r11 != f57742n) goto L_0x0059;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x020e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17745a(p294b7.C16742f r40, p294b7.C16747k r41) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            int r2 = r0.f57750g
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.mo32078f(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            e7.b$a r2 = r0.f57752i
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = 1
            if (r2 != 0) goto L_0x0252
            e8.m r2 = new e8.m
            b7.j r11 = r0.f57746c
            int r11 = r11.f45259c
            r2.<init>((int) r11)
            byte[] r11 = r2.f57809a
            b7.j r12 = r0.f57746c
            int r12 = r12.f45259c
            r13 = r1
            b7.b r13 = (p294b7.C16738b) r13
            r13.mo17734b(r11, r4, r12, r4)
            b7.j r11 = r0.f57746c
            int r12 = r11.f45257a
            r12 = r12 & r10
            r14 = 21
            int r11 = r11.f45261e
            r15 = 36
            if (r12 == 0) goto L_0x003e
            if (r11 == r10) goto L_0x0043
            r14 = 36
            goto L_0x0043
        L_0x003e:
            if (r11 == r10) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r14 = 13
        L_0x0043:
            int r11 = r2.f57811c
            int r12 = r14 + 4
            if (r11 < r12) goto L_0x0059
            r2.mo32113x(r14)
            int r11 = r2.mo32092c()
            int r12 = f57741m
            if (r11 == r12) goto L_0x006d
            int r12 = f57742n
            if (r11 != r12) goto L_0x0059
            goto L_0x006d
        L_0x0059:
            int r11 = r2.f57811c
            r12 = 40
            if (r11 < r12) goto L_0x006c
            r2.mo32113x(r15)
            int r11 = r2.mo32092c()
            int r12 = f57743o
            if (r11 != r12) goto L_0x006c
            r11 = r12
            goto L_0x006d
        L_0x006c:
            r11 = 0
        L_0x006d:
            int r12 = f57741m
            if (r11 == r12) goto L_0x0137
            int r12 = f57742n
            if (r11 != r12) goto L_0x0077
            goto L_0x0137
        L_0x0077:
            int r12 = f57743o
            if (r11 != r12) goto L_0x0130
            b7.j r11 = r0.f57746c
            long r3 = r13.f45242c
            long r5 = r13.f45241b
            r14 = 10
            r2.mo32114y(r14)
            int r14 = r2.mo32092c()
            if (r14 > 0) goto L_0x008f
            r25 = r13
            goto L_0x00e0
        L_0x008f:
            int r12 = r11.f45260d
            r24 = r11
            long r10 = (long) r14
            r14 = 32000(0x7d00, float:4.4842E-41)
            if (r12 < r14) goto L_0x009b
            r14 = 1152(0x480, float:1.614E-42)
            goto L_0x009d
        L_0x009b:
            r14 = 576(0x240, float:8.07E-43)
        L_0x009d:
            r25 = r13
            long r13 = (long) r14
            long r20 = r13 * r8
            long r12 = (long) r12
            r18 = r10
            r22 = r12
            long r10 = p333e8.C20551y.m22320j(r18, r20, r22)
            int r12 = r2.mo32108s()
            int r13 = r2.mo32108s()
            int r14 = r2.mo32108s()
            r8 = 2
            r2.mo32114y(r8)
            r9 = r24
            int r9 = r9.f45259c
            long r7 = (long) r9
            long r3 = r3 + r7
            int r7 = r12 + 1
            long[] r8 = new long[r7]
            long[] r9 = new long[r7]
            r16 = 0
            r22 = 0
            r8[r22] = r16
            r9[r22] = r3
            r15 = 1
        L_0x00d0:
            if (r15 >= r7) goto L_0x011f
            r23 = r7
            r7 = 1
            if (r14 == r7) goto L_0x00f1
            r7 = 2
            if (r14 == r7) goto L_0x00ec
            r7 = 3
            if (r14 == r7) goto L_0x00e7
            r7 = 4
            if (r14 == r7) goto L_0x00e2
        L_0x00e0:
            r15 = 0
            goto L_0x0125
        L_0x00e2:
            int r7 = r2.mo32106q()
            goto L_0x00f5
        L_0x00e7:
            int r7 = r2.mo32105p()
            goto L_0x00f5
        L_0x00ec:
            int r7 = r2.mo32108s()
            goto L_0x00f5
        L_0x00f1:
            int r7 = r2.mo32103n()
        L_0x00f5:
            int r7 = r7 * r13
            r24 = r13
            r26 = r14
            long r13 = (long) r7
            long r3 = r3 + r13
            long r13 = (long) r15
            long r13 = r13 * r10
            r7 = r2
            long r1 = (long) r12
            long r13 = r13 / r1
            r8[r15] = r13
            r1 = -1
            int r13 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x010d
            r1 = r3
            goto L_0x0111
        L_0x010d:
            long r1 = java.lang.Math.min(r5, r3)
        L_0x0111:
            r9[r15] = r1
            int r15 = r15 + 1
            r1 = r40
            r2 = r7
            r7 = r23
            r13 = r24
            r14 = r26
            goto L_0x00d0
        L_0x011f:
            e7.c r1 = new e7.c
            r1.<init>(r8, r9, r10)
            r15 = r1
        L_0x0125:
            b7.j r1 = r0.f57746c
            int r1 = r1.f45259c
            r2 = r25
            r2.mo17738f(r1)
            goto L_0x0205
        L_0x0130:
            r2 = r13
            r1 = 0
            r2.f45244e = r1
            r15 = 0
            goto L_0x0205
        L_0x0137:
            r7 = r2
            r2 = r13
            b7.j r1 = r0.f57746c
            long r3 = r2.f45242c
            long r5 = r2.f45241b
            int r8 = r1.f45263g
            int r9 = r1.f45260d
            int r10 = r1.f45259c
            long r12 = (long) r10
            long r25 = r3 + r12
            int r3 = r7.mo32092c()
            r4 = r3 & 1
            r10 = 1
            if (r4 != r10) goto L_0x01ab
            int r4 = r7.mo32106q()
            if (r4 != 0) goto L_0x0158
            goto L_0x01ab
        L_0x0158:
            long r12 = (long) r4
            r4 = r11
            long r10 = (long) r8
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r29 = r10 * r18
            long r8 = (long) r9
            r27 = r12
            r31 = r8
            long r27 = p333e8.C20551y.m22320j(r27, r29, r31)
            r8 = 6
            r3 = r3 & r8
            if (r3 == r8) goto L_0x017e
            e7.d r1 = new e7.d
            r31 = 0
            r32 = 0
            r34 = 0
            r24 = r1
            r29 = r5
            r24.<init>(r25, r27, r29, r31, r32, r34)
            r15 = r1
            goto L_0x01ad
        L_0x017e:
            int r3 = r7.mo32106q()
            long r8 = (long) r3
            r3 = 1
            r7.mo32114y(r3)
            r3 = 99
            long[] r10 = new long[r3]
            r11 = 0
        L_0x018c:
            if (r11 >= r3) goto L_0x0198
            int r12 = r7.mo32103n()
            long r12 = (long) r12
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x018c
        L_0x0198:
            e7.d r3 = new e7.d
            int r1 = r1.f45259c
            r24 = r3
            r29 = r5
            r31 = r10
            r32 = r8
            r34 = r1
            r24.<init>(r25, r27, r29, r31, r32, r34)
            r15 = r3
            goto L_0x01ad
        L_0x01ab:
            r4 = r11
            r15 = 0
        L_0x01ad:
            if (r15 == 0) goto L_0x01ed
            b7.i r1 = r0.f57747d
            int r3 = r1.f45248a
            r5 = -1
            if (r3 == r5) goto L_0x01bc
            int r1 = r1.f45249b
            if (r1 == r5) goto L_0x01bc
            r1 = 1
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            if (r1 != 0) goto L_0x01ed
            r1 = 0
            r2.f45244e = r1
            int r14 = r14 + 141
            r2.mo17733a(r14, r1)
            e8.m r3 = r0.f57745b
            byte[] r3 = r3.f57809a
            r5 = 3
            r2.mo17734b(r3, r1, r5, r1)
            e8.m r3 = r0.f57745b
            r3.mo32113x(r1)
            b7.i r1 = r0.f57747d
            e8.m r3 = r0.f57745b
            int r3 = r3.mo32105p()
            int r5 = r3 >> 12
            r3 = r3 & 4095(0xfff, float:5.738E-42)
            if (r5 > 0) goto L_0x01e9
            if (r3 <= 0) goto L_0x01e5
            goto L_0x01e9
        L_0x01e5:
            r1.getClass()
            goto L_0x01ed
        L_0x01e9:
            r1.f45248a = r5
            r1.f45249b = r3
        L_0x01ed:
            b7.j r1 = r0.f57746c
            int r1 = r1.f45259c
            r2.mo17738f(r1)
            if (r15 == 0) goto L_0x0205
            boolean r1 = r15.mo17730f()
            if (r1 != 0) goto L_0x0205
            int r1 = f57742n
            if (r4 != r1) goto L_0x0205
            e7.b$a r1 = r39.mo32077d(r40)
            goto L_0x0206
        L_0x0205:
            r1 = r15
        L_0x0206:
            r0.f57752i = r1
            if (r1 == 0) goto L_0x020e
            r1.mo17730f()
            goto L_0x0214
        L_0x020e:
            e7.b$a r1 = r39.mo32077d(r40)
            r0.f57752i = r1
        L_0x0214:
            b7.g r1 = r0.f57748e
            e7.b$a r2 = r0.f57752i
            r1.mo17750g(r2)
            b7.m r1 = r0.f57749f
            r24 = 0
            b7.j r2 = r0.f57746c
            java.lang.String r3 = r2.f45258b
            r26 = 0
            r27 = -1
            r28 = 4096(0x1000, float:5.74E-42)
            int r4 = r2.f45261e
            int r2 = r2.f45260d
            r31 = -1
            b7.i r5 = r0.f57747d
            int r6 = r5.f45248a
            int r5 = r5.f45249b
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            com.google.android.exoplayer2.metadata.Metadata r7 = r0.f57751h
            r25 = r3
            r29 = r4
            r30 = r2
            r32 = r6
            r33 = r5
            r38 = r7
            com.google.android.exoplayer2.Format r2 = com.google.android.exoplayer2.Format.m16640a(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1.mo17741a(r2)
        L_0x0252:
            int r1 = r0.f57755l
            if (r1 != 0) goto L_0x02d4
            r1 = r40
            r2 = r1
            b7.b r2 = (p294b7.C16738b) r2
            r3 = 0
            r2.f45244e = r3
            e8.m r4 = r0.f57745b
            byte[] r4 = r4.f57809a
            r5 = 4
            r6 = 1
            boolean r4 = r2.mo17734b(r4, r3, r5, r6)
            if (r4 != 0) goto L_0x026d
            r2 = -1
            goto L_0x02e2
        L_0x026d:
            e8.m r4 = r0.f57745b
            r4.mo32113x(r3)
            e8.m r3 = r0.f57745b
            int r3 = r3.mo32092c()
            int r4 = r0.f57750g
            long r4 = (long) r4
            r6 = -128000(0xfffffffffffe0c00, float:NaN)
            r6 = r6 & r3
            long r6 = (long) r6
            r8 = -128000(0xfffffffffffe0c00, double:NaN)
            long r4 = r4 & r8
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x028a
            r4 = 1
            goto L_0x028b
        L_0x028a:
            r4 = 0
        L_0x028b:
            if (r4 == 0) goto L_0x02cc
            int r4 = p294b7.C16746j.m16334a(r3)
            r5 = -1
            if (r4 != r5) goto L_0x0295
            goto L_0x02cc
        L_0x0295:
            b7.j r4 = r0.f57746c
            p294b7.C16746j.m16335b(r3, r4)
            long r3 = r0.f57753j
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x02c5
            e7.b$a r3 = r0.f57752i
            long r7 = r2.f45242c
            long r2 = r3.mo32076d(r7)
            r0.f57753j = r2
            long r2 = r0.f57744a
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x02c5
            e7.b$a r2 = r0.f57752i
            r3 = 0
            long r2 = r2.mo32076d(r3)
            long r4 = r0.f57753j
            long r6 = r0.f57744a
            long r6 = r6 - r2
            long r4 = r4 + r6
            r0.f57753j = r4
        L_0x02c5:
            b7.j r2 = r0.f57746c
            int r2 = r2.f45259c
            r0.f57755l = r2
            goto L_0x02d6
        L_0x02cc:
            r3 = 1
            r2.mo17738f(r3)
            r1 = 0
            r0.f57750g = r1
            goto L_0x0315
        L_0x02d4:
            r1 = r40
        L_0x02d6:
            r3 = 1
            b7.m r2 = r0.f57749f
            int r4 = r0.f57755l
            int r1 = r2.mo17743c(r1, r4, r3)
            r2 = -1
            if (r1 != r2) goto L_0x02e4
        L_0x02e2:
            r3 = -1
            goto L_0x0316
        L_0x02e4:
            int r2 = r0.f57755l
            int r2 = r2 - r1
            r0.f57755l = r2
            if (r2 <= 0) goto L_0x02ed
            r1 = 0
            goto L_0x0315
        L_0x02ed:
            long r1 = r0.f57753j
            long r3 = r0.f57754k
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            b7.j r5 = r0.f57746c
            int r6 = r5.f45260d
            long r6 = (long) r6
            long r3 = r3 / r6
            long r7 = r1 + r3
            b7.m r6 = r0.f57749f
            r9 = 1
            int r10 = r5.f45259c
            r11 = 0
            r12 = 0
            r6.mo17744d(r7, r9, r10, r11, r12)
            long r1 = r0.f57754k
            b7.j r3 = r0.f57746c
            int r3 = r3.f45263g
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f57754k = r1
            r1 = 0
            r0.f57755l = r1
        L_0x0315:
            r3 = 0
        L_0x0316:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p332e7.C20522b.mo17745a(b7.f, b7.k):int");
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        this.f57750g = 0;
        this.f57753j = -9223372036854775807L;
        this.f57754k = 0;
        this.f57755l = 0;
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        return mo32078f(fVar, true);
    }

    /* renamed from: d */
    public final C20523a mo32077d(C16742f fVar) {
        ((C16738b) fVar).mo17734b(this.f57745b.f57809a, 0, 4, false);
        this.f57745b.mo32113x(0);
        C16746j.m16335b(this.f57745b.mo32092c(), this.f57746c);
        C16738b bVar = (C16738b) fVar;
        return new C20521a(bVar.f45242c, this.f57746c.f45262f, bVar.f45241b);
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f57748e = gVar;
        this.f57749f = gVar.mo17752o(0, 1);
        this.f57748e.mo17751i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        if ((((long) (-128000 & r8)) == (((long) r6) & -128000)) != false) goto L_0x00b1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32078f(p294b7.C16742f r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            if (r20 == 0) goto L_0x0007
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0009
        L_0x0007:
            r1 = 131072(0x20000, float:1.83671E-40)
        L_0x0009:
            r2 = r19
            b7.b r2 = (p294b7.C16738b) r2
            r3 = 0
            r2.f45244e = r3
            long r4 = r2.f45242c
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x007a
            r4 = 0
        L_0x0019:
            e8.m r5 = r0.f57745b
            byte[] r5 = r5.f57809a
            r6 = 10
            r2.mo17734b(r5, r3, r6, r3)
            e8.m r5 = r0.f57745b
            r5.mo32113x(r3)
            e8.m r5 = r0.f57745b
            int r5 = r5.mo32105p()
            int r7 = p365n7.C21605a.f61178a
            if (r5 == r7) goto L_0x0043
            r2.f45244e = r3
            r2.mo17733a(r4, r3)
            long r4 = r2.f45242c
            int r6 = r2.f45244e
            long r6 = (long) r6
            long r4 = r4 + r6
            int r5 = (int) r4
            if (r20 != 0) goto L_0x007b
            r2.mo17738f(r5)
            goto L_0x007b
        L_0x0043:
            e8.m r5 = r0.f57745b
            r7 = 3
            r5.mo32114y(r7)
            e8.m r5 = r0.f57745b
            int r5 = r5.mo32102m()
            int r7 = r5 + 10
            com.google.android.exoplayer2.metadata.Metadata r8 = r0.f57751h
            if (r8 != 0) goto L_0x0075
            byte[] r8 = new byte[r7]
            e8.m r9 = r0.f57745b
            byte[] r9 = r9.f57809a
            java.lang.System.arraycopy(r9, r3, r8, r3, r6)
            r2.mo17734b(r8, r6, r5, r3)
            r5 = 0
            n7.a r6 = new n7.a
            r6.<init>(r5)
            com.google.android.exoplayer2.metadata.Metadata r5 = r6.mo33860b(r8, r7)
            r0.f57751h = r5
            if (r5 == 0) goto L_0x0078
            b7.i r6 = r0.f57747d
            r6.mo17753a(r5)
            goto L_0x0078
        L_0x0075:
            r2.mo17733a(r5, r3)
        L_0x0078:
            int r4 = r4 + r7
            goto L_0x0019
        L_0x007a:
            r5 = 0
        L_0x007b:
            r4 = 0
            r6 = 0
            r7 = 0
        L_0x007e:
            e8.m r8 = r0.f57745b
            byte[] r8 = r8.f57809a
            r9 = 1
            if (r4 <= 0) goto L_0x0087
            r10 = 1
            goto L_0x0088
        L_0x0087:
            r10 = 0
        L_0x0088:
            r11 = 4
            boolean r8 = r2.mo17734b(r8, r3, r11, r10)
            if (r8 != 0) goto L_0x0090
            goto L_0x00e5
        L_0x0090:
            e8.m r8 = r0.f57745b
            r8.mo32113x(r3)
            e8.m r8 = r0.f57745b
            int r8 = r8.mo32092c()
            if (r6 == 0) goto L_0x00b1
            long r12 = (long) r6
            r10 = -128000(0xfffffffffffe0c00, float:NaN)
            r10 = r10 & r8
            long r14 = (long) r10
            r16 = -128000(0xfffffffffffe0c00, double:NaN)
            long r12 = r12 & r16
            int r10 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x00ae
            r10 = 1
            goto L_0x00af
        L_0x00ae:
            r10 = 0
        L_0x00af:
            if (r10 == 0) goto L_0x00b8
        L_0x00b1:
            int r10 = p294b7.C16746j.m16334a(r8)
            r12 = -1
            if (r10 != r12) goto L_0x00d8
        L_0x00b8:
            int r4 = r7 + 1
            if (r7 != r1) goto L_0x00c7
            if (r20 == 0) goto L_0x00bf
            return r3
        L_0x00bf:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Searched too many bytes."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x00c7:
            if (r20 == 0) goto L_0x00d1
            r2.f45244e = r3
            int r6 = r5 + r4
            r2.mo17733a(r6, r3)
            goto L_0x00d4
        L_0x00d1:
            r2.mo17738f(r9)
        L_0x00d4:
            r7 = r4
            r4 = 0
            r6 = 0
            goto L_0x007e
        L_0x00d8:
            int r4 = r4 + 1
            if (r4 != r9) goto L_0x00e3
            b7.j r6 = r0.f57746c
            p294b7.C16746j.m16335b(r8, r6)
            r6 = r8
            goto L_0x00f1
        L_0x00e3:
            if (r4 != r11) goto L_0x00f1
        L_0x00e5:
            if (r20 == 0) goto L_0x00ec
            int r5 = r5 + r7
            r2.mo17738f(r5)
            goto L_0x00ee
        L_0x00ec:
            r2.f45244e = r3
        L_0x00ee:
            r0.f57750g = r6
            return r9
        L_0x00f1:
            int r10 = r10 + -4
            r2.mo17733a(r10, r3)
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: p332e7.C20522b.mo32078f(b7.f, boolean):boolean");
    }

    public void release() {
    }

    public C20522b(int i, long j) {
        this.f57744a = j;
        this.f57745b = new C20541m(10);
        this.f57746c = new C16746j();
        this.f57747d = new C16745i();
        this.f57753j = -9223372036854775807L;
    }
}
