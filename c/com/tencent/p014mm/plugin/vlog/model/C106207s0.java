package com.tencent.p014mm.plugin.vlog.model;

import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.vlog.model.s0 */
public final class C106207s0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C96554r0 f316504d;

    /* renamed from: e */
    public final /* synthetic */ List<C106205q0> f316505e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106207s0(C96554r0 r0Var, List<C106205q0> list) {
        super(0);
        this.f316504d = r0Var;
        this.f316505e = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d0, code lost:
        r15 = r11.f138802d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0298 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r41 = this;
            r0 = r41
            long r2 = java.lang.System.currentTimeMillis()
            f40.e r1 = f40.C86709a0.m107523b()
            java.lang.String r1 = r1.mo121111i()
            java.lang.String r4 = "account().uinString"
            gy3.C87412m.m108593f(r1, r4)
            long r4 = java.lang.Long.parseLong(r1)
            com.tencent.mm.plugin.vlog.model.r0 r1 = r0.f316504d
            int r1 = r1.f282596n
            r6 = 1
            if (r1 != 0) goto L_0x004b
            long r7 = (long) r6
            com.tencent.p014mm.plugin.vlog.model.C106192a1.f316411b = r2
            com.tencent.p014mm.plugin.vlog.model.C106192a1.f316412c = r4
            com.tencent.p014mm.plugin.vlog.model.C106192a1.f316413d = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = "configure vlogreporter: requestId = "
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = ", uin = "
            r1.append(r9)
            r1.append(r4)
            java.lang.String r9 = ", businessId = "
            r1.append(r9)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "MicroMsg.VlogReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x004b:
            com.tencent.mm.plugin.vlog.model.r0 r1 = r0.f316504d
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            r1.f282590e = r7
            com.tencent.mm.plugin.vlog.model.u0 r1 = new com.tencent.mm.plugin.vlog.model.u0
            r1.<init>()
            com.tencent.mm.plugin.vlog.model.r0 r7 = r0.f316504d
            te3.nw r8 = r7.f282591f
            r1.f316506a = r8
            java.util.List<com.tencent.mm.plugin.vlog.model.q0> r8 = r0.f316505e
            java.util.Iterator r8 = r8.iterator()
        L_0x0065:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0080
            java.lang.Object r9 = r8.next()
            com.tencent.mm.plugin.vlog.model.q0 r9 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r9
            java.util.Map<java.lang.Long, java.lang.String> r10 = r7.f282592g
            int r11 = r9.f316493d
            long r11 = (long) r11
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r9 = r9.f316490a
            r10.put(r11, r9)
            goto L_0x0065
        L_0x0080:
            com.tencent.mm.plugin.vlog.model.r0 r7 = r0.f316504d
            java.util.List<com.tencent.mm.plugin.vlog.model.q0> r8 = r0.f316505e
            java.lang.String r9 = "trackList"
            gy3.C87412m.m108594g(r8, r9)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0092:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x02a6
            java.lang.Object r10 = r8.next()
            com.tencent.mm.plugin.vlog.model.q0 r10 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r10
            java.lang.String r11 = "track"
            gy3.C87412m.m108594g(r10, r11)
            int r11 = r10.f316491b
            r14 = 20
            r17 = 120(0x78, float:1.68E-43)
            if (r11 != r6) goto L_0x0132
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            int r6 = r10.f316495f
            float r6 = (float) r6
            float r15 = r10.f316497h
            float r6 = r6 * r15
            com.tencent.mm.plugin.vlog.model.p r15 = r10.f316498i
            android.graphics.Rect r15 = r15.f316486d
            int r15 = r15.width()
            float r15 = (float) r15
            float r6 = r6 / r15
            int r6 = (int) r6
            r11.inSampleSize = r6
            java.lang.String r6 = r10.f316490a
            android.graphics.Bitmap r6 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r6, r11)
            if (r6 == 0) goto L_0x0288
            te3.nw r11 = r1.f316506a
            if (r11 == 0) goto L_0x00d8
            te3.vh2 r15 = r11.f138802d
            if (r15 == 0) goto L_0x00d8
            long r12 = r15.f143488d
            int r13 = (int) r12
            goto L_0x00da
        L_0x00d8:
            r13 = 120(0x78, float:1.68E-43)
        L_0x00da:
            if (r11 == 0) goto L_0x00e4
            te3.vh2 r11 = r11.f138802d
            if (r11 == 0) goto L_0x00e4
            long r11 = r11.f143489e
            int r12 = (int) r11
            goto L_0x00e6
        L_0x00e4:
            r12 = 120(0x78, float:1.68E-43)
        L_0x00e6:
            com.tencent.mm.plugin.vlog.model.p r11 = r10.f316498i
            android.graphics.Bitmap r6 = r1.mo152163a(r6, r11, r13, r12)
            byte[] r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.Bitmap2Bytes(r6, r14)
            te3.bv2 r12 = new te3.bv2
            r12.<init>()
            int r10 = r10.f316493d
            long r13 = (long) r10
            r12.f131329d = r13
            java.util.LinkedList r10 = new java.util.LinkedList
            pe3.b r13 = new pe3.b
            r13.<init>(r11)
            java.util.List r11 = sx3.C26236u.m33719b(r13)
            r10.<init>(r11)
            r12.f131330e = r10
            te3.vh2 r10 = new te3.vh2
            r10.<init>()
            int r11 = r6.getWidth()
            long r13 = (long) r11
            r10.f143488d = r13
            int r6 = r6.getHeight()
            long r13 = (long) r6
            r10.f143489e = r13
            r12.f131331f = r10
            r10 = 1
            r12.f131332g = r10
            r10 = 0
            r12.f131333h = r10
            r19 = r1
            r27 = r2
            r24 = r4
            r15 = r7
            r26 = r8
            goto L_0x0292
        L_0x0132:
            r6 = 2
            if (r11 != r6) goto L_0x0288
            sp3.c r6 = r10.f316501l
            long r11 = r6.f331470h
            te3.nw r6 = r1.f316506a
            if (r6 == 0) goto L_0x0145
            te3.or4 r13 = r6.f138803e
            if (r13 == 0) goto L_0x0145
            double r14 = r13.f139340e
            long r13 = (long) r14
            goto L_0x0147
        L_0x0145:
            r13 = 100
        L_0x0147:
            if (r6 == 0) goto L_0x0152
            te3.or4 r6 = r6.f138803e
            if (r6 == 0) goto L_0x0152
            r24 = r4
            long r4 = r6.f139339d
            goto L_0x0156
        L_0x0152:
            r24 = r4
            r4 = 1
        L_0x0156:
            int r6 = r10.f316495f
            com.tencent.mm.plugin.vlog.model.p r15 = r10.f316498i
            android.graphics.Rect r15 = r15.f316486d
            int r15 = r15.width()
            int r6 = java.lang.Math.min(r6, r15)
            int r15 = r10.f316496g
            r26 = r8
            com.tencent.mm.plugin.vlog.model.p r8 = r10.f316498i
            android.graphics.Rect r8 = r8.f316486d
            int r8 = r8.height()
            int r8 = java.lang.Math.min(r15, r8)
            java.lang.String r15 = r10.f316490a
            r27 = r2
            r2 = 100
            com.tencent.mm.plugin.mmsight.segment.c r2 = com.tencent.p014mm.plugin.mmsight.segment.C105486j.m141676a(r15, r2, r6, r8)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            te3.nw r6 = r1.f316506a
            if (r6 == 0) goto L_0x0190
            te3.vh2 r8 = r6.f138802d
            if (r8 == 0) goto L_0x0190
            r15 = r7
            long r7 = r8.f143488d
            int r8 = (int) r7
            goto L_0x0193
        L_0x0190:
            r15 = r7
            r8 = 120(0x78, float:1.68E-43)
        L_0x0193:
            if (r6 == 0) goto L_0x01a1
            te3.vh2 r6 = r6.f138802d
            if (r6 == 0) goto L_0x01a1
            long r6 = r6.f143489e
            int r7 = (int) r6
            r22 = r4
            r4 = 100
            goto L_0x01a7
        L_0x01a1:
            r22 = r4
            r4 = 100
            r7 = 120(0x78, float:1.68E-43)
        L_0x01a7:
            long r29 = r11 - r4
            r31 = -9223372036854775808
            int r6 = (r29 > r31 ? 1 : (r29 == r31 ? 0 : -1))
            if (r6 > 0) goto L_0x01b4
            my3.m r4 = my3.C109649m.f328251g
            r33 = r11
            goto L_0x01c0
        L_0x01b4:
            my3.m r6 = new my3.m
            r33 = r11
            r20 = 1
            long r11 = r29 - r20
            r6.<init>(r4, r11)
            r4 = r6
        L_0x01c0:
            java.lang.String r5 = "<this>"
            gy3.C87412m.m108594g(r4, r5)
            r5 = 0
            int r11 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x01cd
            r11 = 1
            goto L_0x01ce
        L_0x01cd:
            r11 = 0
        L_0x01ce:
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            my3.C34692n.m40449a(r11, r12)
            long r11 = r4.f328248d
            r17 = r1
            long r0 = r4.f328249e
            r18 = r3
            long r3 = r4.f328250f
            int r19 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r19 <= 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            long r13 = -r13
        L_0x01e5:
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0280
            int r4 = (r13 > r31 ? 1 : (r13 == r31 ? 0 : -1))
            if (r4 == 0) goto L_0x0278
            r35 = r11
            r37 = r0
            r39 = r13
            long r0 = zx3.C66986c.m79138b(r35, r37, r39)
            if (r3 <= 0) goto L_0x01fd
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0203
        L_0x01fd:
            if (r3 >= 0) goto L_0x024d
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x024d
        L_0x0203:
            r3 = r2
            com.tencent.mm.plugin.mmsight.segment.e r3 = (com.tencent.p014mm.plugin.mmsight.segment.C105481e) r3
            android.graphics.Bitmap r3 = r3.getFrameAtTime(r11)
            java.lang.String r4 = "bitmap"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.mm.plugin.vlog.model.p r4 = r10.f316498i
            r5 = r17
            android.graphics.Bitmap r3 = r5.mo152163a(r3, r4, r8, r7)
            int r4 = r3.getWidth()
            int r6 = r3.getHeight()
            r17 = r4
            pe3.b r4 = new pe3.b
            r19 = r5
            r5 = 20
            byte[] r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.Bitmap2Bytes(r3, r5)
            r4.<init>(r3)
            r3 = r18
            r3.add(r4)
            int r4 = r3.size()
            r16 = r6
            long r5 = (long) r4
            int r4 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r4 >= 0) goto L_0x0248
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0248
            long r11 = r11 + r13
            r18 = r3
            r17 = r19
            goto L_0x0203
        L_0x0248:
            r7 = r16
            r8 = r17
            goto L_0x0251
        L_0x024d:
            r19 = r17
            r3 = r18
        L_0x0251:
            com.tencent.mm.plugin.mmsight.segment.e r2 = (com.tencent.p014mm.plugin.mmsight.segment.C105481e) r2
            r2.release()
            te3.bv2 r0 = new te3.bv2
            r0.<init>()
            int r1 = r10.f316493d
            long r1 = (long) r1
            r0.f131329d = r1
            r0.f131330e = r3
            te3.vh2 r1 = new te3.vh2
            r1.<init>()
            long r2 = (long) r8
            r1.f143488d = r2
            long r2 = (long) r7
            r1.f143489e = r2
            r0.f131331f = r1
            r1 = 2
            r0.f131332g = r1
            r1 = r33
            r0.f131333h = r1
            goto L_0x0293
        L_0x0278:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."
            r0.<init>(r1)
            throw r0
        L_0x0280:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step must be non-zero."
            r0.<init>(r1)
            throw r0
        L_0x0288:
            r19 = r1
            r27 = r2
            r24 = r4
            r15 = r7
            r26 = r8
            r12 = 0
        L_0x0292:
            r0 = r12
        L_0x0293:
            if (r0 == 0) goto L_0x0298
            r9.add(r0)
        L_0x0298:
            r0 = r41
            r7 = r15
            r1 = r19
            r4 = r24
            r8 = r26
            r2 = r27
            r6 = 1
            goto L_0x0092
        L_0x02a6:
            r27 = r2
            r24 = r4
            r0 = r7
            r0.f282590e = r9
            te3.d14 r8 = new te3.d14
            r8.<init>()
            r0 = r41
            com.tencent.mm.plugin.vlog.model.r0 r1 = r0.f316504d
            te3.vh2 r2 = new te3.vh2
            r2.<init>()
            int r3 = r1.f282597o
            long r3 = (long) r3
            r2.f143488d = r3
            int r1 = r1.f282598p
            long r3 = (long) r1
            r2.f143489e = r3
            r8.f132068d = r2
            r1 = 30
            r8.f132069e = r1
            r9 = 10
            r10 = 0
            r11 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "generate vlog, materials = "
            r1.append(r2)
            com.tencent.mm.plugin.vlog.model.r0 r2 = r0.f316504d
            java.util.LinkedList<te3.bv2> r2 = r2.f282590e
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.VLogDataManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            a23.a r14 = new a23.a
            com.tencent.mm.plugin.vlog.model.r0 r1 = r0.f316504d
            java.util.LinkedList<te3.bv2> r7 = r1.f282590e
            int r12 = r1.f282596n
            r13 = 0
            r6 = 1
            r1 = r14
            r2 = r27
            r4 = r24
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11, r12, r13)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r14)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C106207s0.invoke():java.lang.Object");
    }
}
