package p295b8;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import p370p7.C21962v;

/* renamed from: b8.e */
public abstract class C16769e extends C16775h {

    /* renamed from: a */
    public final SparseArray<Map<C21962v, C16771b>> f45326a = new SparseArray<>();

    /* renamed from: b */
    public final SparseBooleanArray f45327b = new SparseBooleanArray();

    /* renamed from: c */
    public C16770a f45328c;

    /* renamed from: b8.e$a */
    public static final class C16770a {

        /* renamed from: a */
        public final int f45329a;

        /* renamed from: b */
        public final C21962v[] f45330b;

        /* renamed from: c */
        public final int[] f45331c;

        /* renamed from: d */
        public final int[][][] f45332d;

        /* renamed from: e */
        public final C21962v f45333e;

        public C16770a(int[] iArr, C21962v[] vVarArr, int[] iArr2, int[][][] iArr3, C21962v vVar) {
            this.f45330b = vVarArr;
            this.f45332d = iArr3;
            this.f45331c = iArr2;
            this.f45333e = vVar;
            this.f45329a = vVarArr.length;
        }
    }

    /* renamed from: b8.e$b */
    public static final class C16771b {
    }

    /* renamed from: a */
    public final void mo17804a(Object obj) {
        this.f45328c = (C16770a) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0310, code lost:
        if (r4 == -1) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0314, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0323, code lost:
        if (r5 == -1) goto L_0x0312;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0242 A[LOOP:8: B:54:0x0120->B:100:0x0242, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x023d A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p295b8.C16776i mo17805b(p396x6.C23020r[] r42, p370p7.C21962v r43) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            r2 = r43
            int r3 = r1.length
            r4 = 1
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r5 = r1.length
            int r5 = r5 + r4
            p7.u[][] r6 = new p370p7.C21961u[r5][]
            int r7 = r1.length
            int r7 = r7 + r4
            int[][][] r12 = new int[r7][][]
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x0023
            int r9 = r2.f62177a
            p7.u[] r10 = new p370p7.C21961u[r9]
            r6[r8] = r10
            int[][] r9 = new int[r9][]
            r12[r8] = r9
            int r8 = r8 + 1
            goto L_0x0014
        L_0x0023:
            int r5 = r1.length
            int[] r11 = new int[r5]
            r8 = 0
        L_0x0027:
            if (r8 >= r5) goto L_0x0034
            r9 = r1[r8]
            int r9 = r9.mo33312l()
            r11[r8] = r9
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0034:
            r5 = 0
        L_0x0035:
            int r8 = r2.f62177a
            r9 = 4
            if (r5 >= r8) goto L_0x0097
            p7.u[] r8 = r2.f62178b
            r8 = r8[r5]
            int r10 = r1.length
            r13 = 0
            r14 = 0
        L_0x0041:
            int r15 = r1.length
            if (r13 >= r15) goto L_0x0064
            r15 = r1[r13]
            r7 = 0
        L_0x0047:
            int r4 = r8.f62173a
            if (r7 >= r4) goto L_0x0060
            com.google.android.exoplayer2.Format[] r4 = r8.f62174b
            r4 = r4[r7]
            int r4 = r15.mo33309a(r4)
            r4 = r4 & 7
            if (r4 <= r14) goto L_0x005d
            if (r4 != r9) goto L_0x005b
            r10 = r13
            goto L_0x0064
        L_0x005b:
            r14 = r4
            r10 = r13
        L_0x005d:
            int r7 = r7 + 1
            goto L_0x0047
        L_0x0060:
            int r13 = r13 + 1
            r4 = 1
            goto L_0x0041
        L_0x0064:
            int r4 = r1.length
            if (r10 != r4) goto L_0x006c
            int r4 = r8.f62173a
            int[] r4 = new int[r4]
            goto L_0x0085
        L_0x006c:
            r4 = r1[r10]
            int r7 = r8.f62173a
            int[] r7 = new int[r7]
            r9 = 0
        L_0x0073:
            int r13 = r8.f62173a
            if (r9 >= r13) goto L_0x0084
            com.google.android.exoplayer2.Format[] r13 = r8.f62174b
            r13 = r13[r9]
            int r13 = r4.mo33309a(r13)
            r7[r9] = r13
            int r9 = r9 + 1
            goto L_0x0073
        L_0x0084:
            r4 = r7
        L_0x0085:
            r7 = r3[r10]
            r9 = r6[r10]
            r9[r7] = r8
            r8 = r12[r10]
            r8[r7] = r4
            r4 = 1
            int r7 = r7 + r4
            r3[r10] = r7
            int r5 = r5 + 1
            r4 = 1
            goto L_0x0035
        L_0x0097:
            int r4 = r1.length
            p7.v[] r10 = new p370p7.C21962v[r4]
            int r4 = r1.length
            int[] r4 = new int[r4]
            r5 = 0
        L_0x009e:
            int r7 = r1.length
            if (r5 >= r7) goto L_0x00c7
            r7 = r3[r5]
            p7.v r8 = new p7.v
            r13 = r6[r5]
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r7)
            p7.u[] r13 = (p370p7.C21961u[]) r13
            r8.<init>(r13)
            r10[r5] = r8
            r8 = r12[r5]
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r8, r7)
            int[][] r7 = (int[][]) r7
            r12[r5] = r7
            r7 = r1[r5]
            x6.a r7 = (p396x6.C22993a) r7
            int r7 = r7.f66062d
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x009e
        L_0x00c7:
            int r5 = r1.length
            r3 = r3[r5]
            p7.v r13 = new p7.v
            int r5 = r1.length
            r5 = r6[r5]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r5, r3)
            p7.u[] r3 = (p370p7.C21961u[]) r3
            r13.<init>(r3)
            r3 = r0
            b8.c r3 = (p295b8.C16765c) r3
            int r5 = r1.length
            b8.f[] r6 = new p295b8.C16772f[r5]
            java.util.concurrent.atomic.AtomicReference<b8.c$b> r7 = r3.f45310e
            java.lang.Object r7 = r7.get()
            b8.c$b r7 = (p295b8.C16765c.C16767b) r7
            r8 = 0
            r14 = 0
            r15 = 0
        L_0x00e9:
            r17 = 0
            r9 = 2
            if (r8 >= r5) goto L_0x03cb
            r18 = r1[r8]
            r2 = r18
            x6.a r2 = (p396x6.C22993a) r2
            int r2 = r2.f66062d
            if (r9 != r2) goto L_0x0399
            if (r14 != 0) goto L_0x0377
            r2 = r10[r8]
            r14 = r12[r8]
            b8.f$a r9 = r3.f45309d
            if (r9 == 0) goto L_0x026b
            r19 = r13
            boolean r13 = r7.f45324k
            if (r13 == 0) goto L_0x010b
            r13 = 24
            goto L_0x010d
        L_0x010b:
            r13 = 16
        L_0x010d:
            r27 = r11
            boolean r11 = r7.f45323j
            if (r11 == 0) goto L_0x011c
            int r11 = r18.mo33312l()
            r11 = r11 & r13
            if (r11 == 0) goto L_0x011c
            r11 = 1
            goto L_0x011d
        L_0x011c:
            r11 = 0
        L_0x011d:
            r18 = r4
            r4 = 0
        L_0x0120:
            int r0 = r2.f62177a
            if (r4 >= r0) goto L_0x025c
            p7.u[] r0 = r2.f62178b
            r0 = r0[r4]
            r28 = r14[r4]
            r29 = r3
            int r3 = r7.f45316c
            r30 = r12
            int r12 = r7.f45317d
            int r1 = r7.f45318e
            r31 = r5
            int r5 = r7.f45320g
            r32 = r15
            int r15 = r7.f45321h
            r33 = r10
            boolean r10 = r7.f45322i
            r34 = r6
            int r6 = r0.f62173a
            r35 = r8
            r8 = 2
            if (r6 >= r8) goto L_0x014c
            int[] r1 = p295b8.C16765c.f45308f
            goto L_0x015a
        L_0x014c:
            java.util.List r5 = p295b8.C16765c.m16386d(r0, r5, r15, r10)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 >= r8) goto L_0x0162
            int[] r1 = p295b8.C16765c.f45308f
        L_0x015a:
            r40 = r7
            r36 = r11
            r39 = r14
            goto L_0x023a
        L_0x0162:
            if (r11 != 0) goto L_0x01e1
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r36 = r11
            r15 = r17
            r8 = 0
            r10 = 0
        L_0x016f:
            int r11 = r5.size()
            if (r8 >= r11) goto L_0x01da
            java.lang.Object r11 = r5.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r37 = r15
            com.google.android.exoplayer2.Format[] r15 = r0.f62174b
            r11 = r15[r11]
            java.lang.String r11 = r11.f45777i
            boolean r15 = r6.add(r11)
            if (r15 == 0) goto L_0x01c9
            r38 = r6
            r39 = r14
            r6 = 0
            r15 = 0
        L_0x0193:
            int r14 = r5.size()
            if (r15 >= r14) goto L_0x01c2
            java.lang.Object r14 = r5.get(r15)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r40 = r7
            com.google.android.exoplayer2.Format[] r7 = r0.f62174b
            r20 = r7[r14]
            r22 = r28[r14]
            r21 = r11
            r23 = r13
            r24 = r3
            r25 = r12
            r26 = r1
            boolean r7 = p295b8.C16765c.m16389g(r20, r21, r22, r23, r24, r25, r26)
            if (r7 == 0) goto L_0x01bd
            int r6 = r6 + 1
        L_0x01bd:
            int r15 = r15 + 1
            r7 = r40
            goto L_0x0193
        L_0x01c2:
            r40 = r7
            if (r6 <= r10) goto L_0x01cf
            r10 = r6
            r15 = r11
            goto L_0x01d1
        L_0x01c9:
            r38 = r6
            r40 = r7
            r39 = r14
        L_0x01cf:
            r15 = r37
        L_0x01d1:
            int r8 = r8 + 1
            r6 = r38
            r14 = r39
            r7 = r40
            goto L_0x016f
        L_0x01da:
            r40 = r7
            r39 = r14
            r37 = r15
            goto L_0x01e9
        L_0x01e1:
            r40 = r7
            r36 = r11
            r39 = r14
            r15 = r17
        L_0x01e9:
            int r6 = r5.size()
        L_0x01ed:
            r7 = -1
            int r6 = r6 + r7
            if (r6 < 0) goto L_0x0215
            java.lang.Object r7 = r5.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.google.android.exoplayer2.Format[] r8 = r0.f62174b
            r20 = r8[r7]
            r22 = r28[r7]
            r21 = r15
            r23 = r13
            r24 = r3
            r25 = r12
            r26 = r1
            boolean r7 = p295b8.C16765c.m16389g(r20, r21, r22, r23, r24, r25, r26)
            if (r7 != 0) goto L_0x01ed
            r5.remove(r6)
            goto L_0x01ed
        L_0x0215:
            int r1 = r5.size()
            r3 = 2
            if (r1 >= r3) goto L_0x021f
            int[] r1 = p295b8.C16765c.f45308f
            goto L_0x023a
        L_0x021f:
            int r1 = p333e8.C20551y.f57835a
            int r1 = r5.size()
            int[] r3 = new int[r1]
            r6 = 0
        L_0x0228:
            if (r6 >= r1) goto L_0x0239
            java.lang.Object r7 = r5.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3[r6] = r7
            int r6 = r6 + 1
            goto L_0x0228
        L_0x0239:
            r1 = r3
        L_0x023a:
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0242
            b8.f r0 = r9.mo17787a(r0, r1)
            goto L_0x0285
        L_0x0242:
            int r4 = r4 + 1
            r1 = r42
            r3 = r29
            r12 = r30
            r5 = r31
            r15 = r32
            r10 = r33
            r6 = r34
            r8 = r35
            r11 = r36
            r14 = r39
            r7 = r40
            goto L_0x0120
        L_0x025c:
            r29 = r3
            r31 = r5
            r34 = r6
            r40 = r7
            r35 = r8
            r33 = r10
            r30 = r12
            goto L_0x027f
        L_0x026b:
            r29 = r3
            r18 = r4
            r31 = r5
            r34 = r6
            r40 = r7
            r35 = r8
            r33 = r10
            r27 = r11
            r30 = r12
            r19 = r13
        L_0x027f:
            r39 = r14
            r32 = r15
            r0 = r17
        L_0x0285:
            if (r0 != 0) goto L_0x036c
            r6 = r17
            r0 = 0
            r1 = 0
            r3 = 0
            r4 = -1
            r5 = -1
        L_0x028e:
            int r7 = r2.f62177a
            if (r0 >= r7) goto L_0x035d
            p7.u[] r7 = r2.f62178b
            r7 = r7[r0]
            r8 = r40
            int r9 = r8.f45320g
            int r10 = r8.f45321h
            boolean r11 = r8.f45322i
            java.util.List r9 = p295b8.C16765c.m16386d(r7, r9, r10, r11)
            r10 = r39[r0]
            r11 = 0
        L_0x02a5:
            int r12 = r7.f62173a
            if (r11 >= r12) goto L_0x0353
            r12 = r10[r11]
            boolean r13 = r8.f45325l
            boolean r12 = p295b8.C16765c.m16387e(r12, r13)
            if (r12 == 0) goto L_0x0347
            com.google.android.exoplayer2.Format[] r12 = r7.f62174b
            r12 = r12[r11]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r14 = r9
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r13 = r14.contains(r13)
            if (r13 == 0) goto L_0x02df
            int r13 = r12.f45781p
            r14 = -1
            if (r13 == r14) goto L_0x02cd
            int r15 = r8.f45316c
            if (r13 > r15) goto L_0x02df
        L_0x02cd:
            int r13 = r12.f45782q
            if (r13 == r14) goto L_0x02d5
            int r15 = r8.f45317d
            if (r13 > r15) goto L_0x02df
        L_0x02d5:
            int r13 = r12.f45773e
            if (r13 == r14) goto L_0x02dd
            int r14 = r8.f45318e
            if (r13 > r14) goto L_0x02df
        L_0x02dd:
            r13 = 1
            goto L_0x02e0
        L_0x02df:
            r13 = 0
        L_0x02e0:
            if (r13 != 0) goto L_0x02e8
            boolean r14 = r8.f45319f
            if (r14 != 0) goto L_0x02e8
            goto L_0x0347
        L_0x02e8:
            if (r13 == 0) goto L_0x02ec
            r14 = 2
            goto L_0x02ed
        L_0x02ec:
            r14 = 1
        L_0x02ed:
            r15 = r10[r11]
            r20 = r1
            r1 = 0
            boolean r15 = p295b8.C16765c.m16387e(r15, r1)
            if (r15 == 0) goto L_0x02fa
            int r14 = r14 + 1000
        L_0x02fa:
            if (r14 <= r3) goto L_0x02fe
            r1 = 1
            goto L_0x02ff
        L_0x02fe:
            r1 = 0
        L_0x02ff:
            if (r14 != r3) goto L_0x0337
            int r1 = r12.mo18399p()
            if (r1 == r4) goto L_0x031c
            int r1 = r12.mo18399p()
            r21 = r2
            r2 = -1
            if (r1 != r2) goto L_0x0316
            if (r4 != r2) goto L_0x0314
        L_0x0312:
            r1 = 0
            goto L_0x032a
        L_0x0314:
            r1 = -1
            goto L_0x032a
        L_0x0316:
            if (r4 != r2) goto L_0x031a
        L_0x0318:
            r1 = 1
            goto L_0x032a
        L_0x031a:
            int r1 = r1 - r4
            goto L_0x032a
        L_0x031c:
            r21 = r2
            r2 = -1
            int r1 = r12.f45773e
            if (r1 != r2) goto L_0x0326
            if (r5 != r2) goto L_0x0314
            goto L_0x0312
        L_0x0326:
            if (r5 != r2) goto L_0x0329
            goto L_0x0318
        L_0x0329:
            int r1 = r1 - r5
        L_0x032a:
            if (r15 == 0) goto L_0x0331
            if (r13 == 0) goto L_0x0331
            if (r1 <= 0) goto L_0x0335
            goto L_0x0333
        L_0x0331:
            if (r1 >= 0) goto L_0x0335
        L_0x0333:
            r1 = 1
            goto L_0x0339
        L_0x0335:
            r1 = 0
            goto L_0x0339
        L_0x0337:
            r21 = r2
        L_0x0339:
            if (r1 == 0) goto L_0x034b
            int r1 = r12.f45773e
            int r2 = r12.mo18399p()
            r5 = r1
            r4 = r2
            r6 = r7
            r1 = r11
            r3 = r14
            goto L_0x034d
        L_0x0347:
            r20 = r1
            r21 = r2
        L_0x034b:
            r1 = r20
        L_0x034d:
            int r11 = r11 + 1
            r2 = r21
            goto L_0x02a5
        L_0x0353:
            r20 = r1
            r21 = r2
            int r0 = r0 + 1
            r40 = r8
            goto L_0x028e
        L_0x035d:
            r8 = r40
            if (r6 != 0) goto L_0x0362
            goto L_0x0369
        L_0x0362:
            b8.d r0 = new b8.d
            r0.<init>(r6, r1)
            r17 = r0
        L_0x0369:
            r0 = r17
            goto L_0x036e
        L_0x036c:
            r8 = r40
        L_0x036e:
            r34[r35] = r0
            if (r0 == 0) goto L_0x0374
            r0 = 1
            goto L_0x0375
        L_0x0374:
            r0 = 0
        L_0x0375:
            r14 = r0
            goto L_0x038c
        L_0x0377:
            r29 = r3
            r18 = r4
            r31 = r5
            r34 = r6
            r35 = r8
            r33 = r10
            r27 = r11
            r30 = r12
            r19 = r13
            r32 = r15
            r8 = r7
        L_0x038c:
            r0 = r33[r35]
            int r0 = r0.f62177a
            if (r0 <= 0) goto L_0x0394
            r0 = 1
            goto L_0x0395
        L_0x0394:
            r0 = 0
        L_0x0395:
            r0 = r32 | r0
            r15 = r0
            goto L_0x03ae
        L_0x0399:
            r29 = r3
            r18 = r4
            r31 = r5
            r34 = r6
            r35 = r8
            r33 = r10
            r27 = r11
            r30 = r12
            r19 = r13
            r32 = r15
            r8 = r7
        L_0x03ae:
            int r0 = r35 + 1
            r1 = r42
            r2 = r43
            r7 = r8
            r4 = r18
            r13 = r19
            r11 = r27
            r3 = r29
            r12 = r30
            r5 = r31
            r10 = r33
            r6 = r34
            r9 = 4
            r8 = r0
            r0 = r41
            goto L_0x00e9
        L_0x03cb:
            r29 = r3
            r18 = r4
            r34 = r6
            r8 = r7
            r33 = r10
            r27 = r11
            r30 = r12
            r19 = r13
            r32 = r15
            r2 = r5
            r0 = 0
            r1 = 0
            r4 = 0
        L_0x03e0:
            if (r1 >= r2) goto L_0x0624
            r3 = r42
            r5 = r3[r1]
            x6.a r5 = (p396x6.C22993a) r5
            int r5 = r5.f66062d
            r6 = 3
            r7 = 1
            if (r5 == r7) goto L_0x04f0
            r7 = 2
            if (r5 == r7) goto L_0x04ec
            if (r5 == r6) goto L_0x045d
            r5 = r33[r1]
            r6 = r30[r1]
            r12 = r17
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x03fc:
            int r13 = r5.f62177a
            if (r9 >= r13) goto L_0x044d
            p7.u[] r13 = r5.f62178b
            r13 = r13[r9]
            r14 = r6[r9]
            r15 = 0
        L_0x0407:
            int r7 = r13.f62173a
            if (r15 >= r7) goto L_0x0445
            r7 = r14[r15]
            r31 = r2
            boolean r2 = r8.f45325l
            boolean r2 = p295b8.C16765c.m16387e(r7, r2)
            if (r2 == 0) goto L_0x043c
            com.google.android.exoplayer2.Format[] r2 = r13.f62174b
            r2 = r2[r15]
            int r2 = r2.f45768D
            r7 = 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0423
            r2 = 1
            goto L_0x0424
        L_0x0423:
            r2 = 0
        L_0x0424:
            if (r2 == 0) goto L_0x0428
            r2 = 2
            goto L_0x0429
        L_0x0428:
            r2 = 1
        L_0x0429:
            r7 = r14[r15]
            r20 = r5
            r5 = 0
            boolean r7 = p295b8.C16765c.m16387e(r7, r5)
            if (r7 == 0) goto L_0x0436
            int r2 = r2 + 1000
        L_0x0436:
            if (r2 <= r11) goto L_0x043e
            r11 = r2
            r12 = r13
            r10 = r15
            goto L_0x043e
        L_0x043c:
            r20 = r5
        L_0x043e:
            int r15 = r15 + 1
            r5 = r20
            r2 = r31
            goto L_0x0407
        L_0x0445:
            r31 = r2
            r20 = r5
            int r9 = r9 + 1
            r7 = 2
            goto L_0x03fc
        L_0x044d:
            r31 = r2
            if (r12 != 0) goto L_0x0454
            r2 = r17
            goto L_0x0459
        L_0x0454:
            b8.d r2 = new b8.d
            r2.<init>(r12, r10)
        L_0x0459:
            r34[r1] = r2
            goto L_0x0615
        L_0x045d:
            r31 = r2
            if (r0 != 0) goto L_0x0615
            r0 = r33[r1]
            r2 = r30[r1]
            r10 = r17
            r5 = 0
            r7 = 0
            r9 = 0
        L_0x046a:
            int r11 = r0.f62177a
            if (r5 >= r11) goto L_0x04d4
            p7.u[] r11 = r0.f62178b
            r11 = r11[r5]
            r12 = r2[r5]
            r13 = 0
        L_0x0475:
            int r14 = r11.f62173a
            if (r13 >= r14) goto L_0x04d0
            r14 = r12[r13]
            boolean r15 = r8.f45325l
            boolean r14 = p295b8.C16765c.m16387e(r14, r15)
            if (r14 == 0) goto L_0x04cc
            com.google.android.exoplayer2.Format[] r14 = r11.f62174b
            r14 = r14[r13]
            int r15 = r14.f45768D
            r20 = r15 & 1
            if (r20 == 0) goto L_0x0490
            r20 = 1
            goto L_0x0492
        L_0x0490:
            r20 = 0
        L_0x0492:
            r15 = r15 & 2
            if (r15 == 0) goto L_0x0498
            r15 = 1
            goto L_0x0499
        L_0x0498:
            r15 = 0
        L_0x0499:
            java.lang.String r6 = r8.f45315b
            boolean r6 = p295b8.C16765c.m16385c(r14, r6)
            if (r6 == 0) goto L_0x04ab
            if (r20 == 0) goto L_0x04a5
            r6 = 6
            goto L_0x04bc
        L_0x04a5:
            if (r15 != 0) goto L_0x04a9
            r6 = 5
            goto L_0x04bc
        L_0x04a9:
            r6 = 4
            goto L_0x04bc
        L_0x04ab:
            if (r20 == 0) goto L_0x04af
            r6 = 3
            goto L_0x04bc
        L_0x04af:
            if (r15 == 0) goto L_0x04cc
            java.lang.String r6 = r8.f45314a
            boolean r6 = p295b8.C16765c.m16385c(r14, r6)
            if (r6 == 0) goto L_0x04bb
            r6 = 2
            goto L_0x04bc
        L_0x04bb:
            r6 = 1
        L_0x04bc:
            r14 = r12[r13]
            r15 = 0
            boolean r14 = p295b8.C16765c.m16387e(r14, r15)
            if (r14 == 0) goto L_0x04c7
            int r6 = r6 + 1000
        L_0x04c7:
            if (r6 <= r9) goto L_0x04cc
            r9 = r6
            r10 = r11
            r7 = r13
        L_0x04cc:
            int r13 = r13 + 1
            r6 = 3
            goto L_0x0475
        L_0x04d0:
            int r5 = r5 + 1
            r6 = 3
            goto L_0x046a
        L_0x04d4:
            if (r10 != 0) goto L_0x04d9
            r0 = r17
            goto L_0x04de
        L_0x04d9:
            b8.d r0 = new b8.d
            r0.<init>(r10, r7)
        L_0x04de:
            r34[r1] = r0
            if (r0 == 0) goto L_0x04e7
            r0 = 1
            r16 = 1
            goto L_0x061a
        L_0x04e7:
            r0 = 1
            r16 = 0
            goto L_0x061a
        L_0x04ec:
            r31 = r2
            goto L_0x0615
        L_0x04f0:
            r31 = r2
            if (r4 != 0) goto L_0x0615
            r2 = r33[r1]
            r4 = r30[r1]
            if (r32 == 0) goto L_0x04ff
            r6 = r17
            r5 = r29
            goto L_0x0503
        L_0x04ff:
            r5 = r29
            b8.f$a r6 = r5.f45309d
        L_0x0503:
            r7 = 0
            r9 = -1
            r10 = -1
            r11 = 0
        L_0x0507:
            int r12 = r2.f62177a
            if (r7 >= r12) goto L_0x0576
            p7.u[] r12 = r2.f62178b
            r12 = r12[r7]
            r13 = r4[r7]
            r14 = r11
            r11 = r10
            r10 = r9
            r9 = 0
        L_0x0515:
            int r15 = r12.f62173a
            if (r9 >= r15) goto L_0x0569
            r15 = r13[r9]
            r20 = r0
            boolean r0 = r8.f45325l
            boolean r0 = p295b8.C16765c.m16387e(r15, r0)
            if (r0 == 0) goto L_0x055c
            com.google.android.exoplayer2.Format[] r0 = r12.f62174b
            r0 = r0[r9]
            r15 = r13[r9]
            r29 = r5
            java.lang.String r5 = r8.f45314a
            r22 = r10
            int r10 = r0.f45768D
            r16 = 1
            r10 = r10 & 1
            if (r10 == 0) goto L_0x053b
            r10 = 1
            goto L_0x053c
        L_0x053b:
            r10 = 0
        L_0x053c:
            boolean r0 = p295b8.C16765c.m16385c(r0, r5)
            if (r0 == 0) goto L_0x0548
            if (r10 == 0) goto L_0x0546
            r0 = 4
            goto L_0x054d
        L_0x0546:
            r0 = 3
            goto L_0x054d
        L_0x0548:
            if (r10 == 0) goto L_0x054c
            r0 = 2
            goto L_0x054d
        L_0x054c:
            r0 = 1
        L_0x054d:
            r5 = 0
            boolean r10 = p295b8.C16765c.m16387e(r15, r5)
            if (r10 == 0) goto L_0x0556
            int r0 = r0 + 1000
        L_0x0556:
            if (r0 <= r14) goto L_0x0560
            r14 = r0
            r10 = r7
            r11 = r9
            goto L_0x0562
        L_0x055c:
            r29 = r5
            r22 = r10
        L_0x0560:
            r10 = r22
        L_0x0562:
            int r9 = r9 + 1
            r0 = r20
            r5 = r29
            goto L_0x0515
        L_0x0569:
            r20 = r0
            r29 = r5
            r22 = r10
            int r7 = r7 + 1
            r10 = r11
            r11 = r14
            r9 = r22
            goto L_0x0507
        L_0x0576:
            r20 = r0
            r29 = r5
            r0 = -1
            if (r9 != r0) goto L_0x0582
            r2 = r17
            r0 = 1
            goto L_0x060d
        L_0x0582:
            p7.u[] r2 = r2.f62178b
            r2 = r2[r9]
            if (r6 == 0) goto L_0x0606
            r4 = r4[r9]
            boolean r5 = r8.f45323j
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r12 = r17
            r9 = 0
            r11 = 0
        L_0x0595:
            int r13 = r2.f62173a
            if (r9 >= r13) goto L_0x05dd
            com.google.android.exoplayer2.Format[] r13 = r2.f62174b
            r13 = r13[r9]
            b8.c$a r14 = new b8.c$a
            int r15 = r13.f45789x
            int r0 = r13.f45790y
            if (r5 == 0) goto L_0x05a8
            r13 = r17
            goto L_0x05aa
        L_0x05a8:
            java.lang.String r13 = r13.f45777i
        L_0x05aa:
            r14.<init>(r15, r0, r13)
            boolean r0 = r7.add(r14)
            if (r0 == 0) goto L_0x05d5
            r0 = 0
            r13 = 0
        L_0x05b5:
            int r15 = r2.f62173a
            if (r0 >= r15) goto L_0x05ce
            com.google.android.exoplayer2.Format[] r15 = r2.f62174b
            r15 = r15[r0]
            r21 = r5
            r5 = r4[r0]
            boolean r5 = p295b8.C16765c.m16388f(r15, r5, r14)
            if (r5 == 0) goto L_0x05c9
            int r13 = r13 + 1
        L_0x05c9:
            int r0 = r0 + 1
            r5 = r21
            goto L_0x05b5
        L_0x05ce:
            r21 = r5
            if (r13 <= r11) goto L_0x05d7
            r11 = r13
            r12 = r14
            goto L_0x05d7
        L_0x05d5:
            r21 = r5
        L_0x05d7:
            int r9 = r9 + 1
            r5 = r21
            r0 = -1
            goto L_0x0595
        L_0x05dd:
            r0 = 1
            if (r11 <= r0) goto L_0x05fc
            int[] r5 = new int[r11]
            r7 = 0
            r9 = 0
        L_0x05e4:
            int r11 = r2.f62173a
            if (r7 >= r11) goto L_0x05fe
            com.google.android.exoplayer2.Format[] r11 = r2.f62174b
            r11 = r11[r7]
            r13 = r4[r7]
            boolean r11 = p295b8.C16765c.m16388f(r11, r13, r12)
            if (r11 == 0) goto L_0x05f9
            int r11 = r9 + 1
            r5[r9] = r7
            r9 = r11
        L_0x05f9:
            int r7 = r7 + 1
            goto L_0x05e4
        L_0x05fc:
            int[] r5 = p295b8.C16765c.f45308f
        L_0x05fe:
            int r4 = r5.length
            if (r4 <= 0) goto L_0x0607
            b8.f r2 = r6.mo17787a(r2, r5)
            goto L_0x060d
        L_0x0606:
            r0 = 1
        L_0x0607:
            b8.d r4 = new b8.d
            r4.<init>(r2, r10)
            r2 = r4
        L_0x060d:
            r34[r1] = r2
            if (r2 == 0) goto L_0x0613
            r4 = 1
            goto L_0x061c
        L_0x0613:
            r4 = 0
            goto L_0x061c
        L_0x0615:
            r20 = r0
            r0 = 1
            r16 = r20
        L_0x061a:
            r20 = r16
        L_0x061c:
            int r1 = r1 + 1
            r0 = r20
            r2 = r31
            goto L_0x03e0
        L_0x0624:
            r3 = r42
            r0 = 1
            r1 = 0
        L_0x0628:
            int r2 = r3.length
            if (r1 >= r2) goto L_0x066c
            r2 = r41
            android.util.SparseBooleanArray r4 = r2.f45327b
            boolean r4 = r4.get(r1)
            if (r4 == 0) goto L_0x0639
            r34[r1] = r17
        L_0x0637:
            r4 = 0
            goto L_0x0669
        L_0x0639:
            r4 = r33[r1]
            android.util.SparseArray<java.util.Map<p7.v, b8.e$b>> r5 = r2.f45326a
            java.lang.Object r5 = r5.get(r1)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x064d
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x064d
            r5 = 1
            goto L_0x064e
        L_0x064d:
            r5 = 0
        L_0x064e:
            if (r5 == 0) goto L_0x0637
            android.util.SparseArray<java.util.Map<p7.v, b8.e$b>> r5 = r2.f45326a
            java.lang.Object r5 = r5.get(r1)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r5.get(r4)
            b8.e$b r5 = (p295b8.C16769e.C16771b) r5
            if (r5 != 0) goto L_0x0663
            r34[r1] = r17
            goto L_0x0637
        L_0x0663:
            p7.u[] r0 = r4.f62178b
            r4 = 0
            r0 = r0[r4]
            throw r17
        L_0x0669:
            int r1 = r1 + 1
            goto L_0x0628
        L_0x066c:
            r2 = r41
            r4 = 0
            b8.e$a r0 = new b8.e$a
            r8 = r0
            r9 = r18
            r10 = r33
            r11 = r27
            r12 = r30
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13)
            int r1 = r3.length
            x6.s[] r1 = new p396x6.C23021s[r1]
            r7 = 0
        L_0x0683:
            int r4 = r3.length
            if (r7 >= r4) goto L_0x0694
            r4 = r34[r7]
            if (r4 == 0) goto L_0x068d
            x6.s r4 = p396x6.C23021s.f66189b
            goto L_0x068f
        L_0x068d:
            r4 = r17
        L_0x068f:
            r1[r7] = r4
            int r7 = r7 + 1
            goto L_0x0683
        L_0x0694:
            b8.i r3 = new b8.i
            b8.g r4 = new b8.g
            r5 = r34
            r4.<init>(r5)
            r5 = r43
            r3.<init>(r5, r4, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p295b8.C16769e.mo17805b(x6.r[], p7.v):b8.i");
    }
}
