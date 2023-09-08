package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.k3 */
public class C18409k3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f51056d;

    /* renamed from: e */
    public final /* synthetic */ CopyOnWriteArrayList f51057e;

    /* renamed from: f */
    public final /* synthetic */ int f51058f;

    /* renamed from: g */
    public final /* synthetic */ int f51059g;

    /* renamed from: h */
    public final /* synthetic */ C18412m3 f51060h;

    public C18409k3(C18412m3 m3Var, long j, CopyOnWriteArrayList copyOnWriteArrayList, int i, int i2) {
        this.f51060h = m3Var;
        this.f51056d = j;
        this.f51057e = copyOnWriteArrayList;
        this.f51058f = i;
        this.f51059g = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r39 = this;
            r1 = r39
            java.lang.String r2 = "MicroMsg.BizTimeLineReport"
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            long r3 = r1.f51056d
            r0.getClass()
            r5 = -4294967296(0xffffffff00000000, double:NaN)
            long r3 = r3 & r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "SELECT count(*) FROM BizTimeLineInfo where orderFlag >= "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            zh3.f r0 = r0.f55550d
            r4 = 0
            android.database.Cursor r0 = r0.rawQuery(r3, r4)
            boolean r3 = r0.moveToFirst()
            r7 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            if (r3 == 0) goto L_0x003b
            int r3 = r0.getInt(r7)
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            r0.close()
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            long r10 = r1.f51056d
            long r10 = r10 & r5
            int r10 = r0.mo25792TY(r10)
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            long r11 = r1.f51056d
            r0.getClass()
            long r5 = r5 & r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r5)
            java.lang.String r5 = " and "
            r11.append(r5)
            java.lang.String r5 = "placeTop"
            r11.append(r5)
            java.lang.String r5 = " = 1 "
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            zh3.f r0 = r0.f55550d
            android.database.Cursor r0 = r0.rawQuery(r5, r4)
            boolean r4 = r0.moveToFirst()
            if (r4 == 0) goto L_0x0084
            int r4 = r0.getInt(r7)
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            r0.close()
            com.tencent.mm.storage.d1 r0 = rb0.C48009v0.Kx0()
            int r5 = r0.mo25734SE()
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = r1.f51060h
            long r11 = r0.f51073g
            java.lang.String r6 = r0.f51077k
            int r8 = r0.f51076j
            int r13 = r0.f51075i
            java.lang.String r14 = ""
            r15 = 2
            r7 = 1
            if (r13 <= 0) goto L_0x00db
            com.tencent.mm.pluginsdk.model.d r0 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r0 = r0.mo25172f(r6)
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r13 = r1.f51060h
            int r13 = r13.f51075i
            if (r13 != r7) goto L_0x00ae
            r13 = 3
            goto L_0x00b3
        L_0x00ae:
            if (r13 != r15) goto L_0x00b2
            r13 = 4
            goto L_0x00b3
        L_0x00b2:
            r13 = 0
        L_0x00b3:
            boolean r19 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r19 == 0) goto L_0x00d4
            if (r6 != 0) goto L_0x00bd
            r0 = r14
            goto L_0x00d4
        L_0x00bd:
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r0 = com.tencent.p014mm.pluginsdk.model.C19428d.f54858c
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "click-exportId-"
            r15.append(r7)
            r15.append(r6)
            java.lang.String r7 = r15.toString()
            java.lang.String r0 = r0.decodeString(r7, r14)
        L_0x00d4:
            r7 = r0
            r38 = r13
            r13 = r8
            r8 = r38
            goto L_0x00f4
        L_0x00db:
            int r7 = r0.f51074h
            if (r7 <= 0) goto L_0x00f1
            r13 = r8
            long r7 = r0.f51072f
            com.tencent.mm.storage.d1 r0 = rb0.C48009v0.Kx0()
            com.tencent.mm.storage.o0 r0 = r0.mo25733Ow(r7)
            r7 = r14
            if (r0 == 0) goto L_0x00ef
            r8 = 2
            goto L_0x00f4
        L_0x00ef:
            r8 = 1
            goto L_0x00f4
        L_0x00f1:
            r13 = r8
            r7 = r14
            r8 = 0
        L_0x00f4:
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.f51057e     // Catch:{ Exception -> 0x013f }
            if (r0 == 0) goto L_0x0139
            int r15 = r0.size()     // Catch:{ Exception -> 0x013f }
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = r1.f51060h     // Catch:{ Exception -> 0x0132 }
            r21 = r15
            java.util.concurrent.CopyOnWriteArrayList r15 = r1.f51057e     // Catch:{ Exception -> 0x0130 }
            r0.getClass()     // Catch:{ Exception -> 0x0130 }
            if (r15 == 0) goto L_0x012e
            boolean r0 = r15.isEmpty()     // Catch:{ Exception -> 0x0130 }
            if (r0 == 0) goto L_0x010e
            goto L_0x012e
        L_0x010e:
            java.util.Iterator r0 = r15.iterator()     // Catch:{ Exception -> 0x0130 }
            r15 = 0
        L_0x0113:
            boolean r22 = r0.hasNext()     // Catch:{ Exception -> 0x0130 }
            if (r22 == 0) goto L_0x013c
            java.lang.Object r22 = r0.next()     // Catch:{ Exception -> 0x0130 }
            r23 = r0
            r0 = r22
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r) r0     // Catch:{ Exception -> 0x0130 }
            if (r0 == 0) goto L_0x012b
            boolean r0 = r0.f51256t     // Catch:{ Exception -> 0x0130 }
            if (r0 == 0) goto L_0x012b
            int r15 = r15 + 1
        L_0x012b:
            r0 = r23
            goto L_0x0113
        L_0x012e:
            r15 = 0
            goto L_0x013c
        L_0x0130:
            r0 = move-exception
            goto L_0x0135
        L_0x0132:
            r0 = move-exception
            r21 = r15
        L_0x0135:
            r22 = r7
            r15 = 0
            goto L_0x0145
        L_0x0139:
            r15 = 0
            r21 = 0
        L_0x013c:
            r22 = r7
            goto L_0x014b
        L_0x013f:
            r0 = move-exception
            r22 = r7
            r15 = 0
            r21 = 0
        L_0x0145:
            java.lang.Object[] r7 = new java.lang.Object[r15]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r14, r7)
            r15 = 0
        L_0x014b:
            jw0.a r0 = jw0.C21287a.f60143a
            te3.z40 r0 = jw0.C21287a.f60145c
            if (r0 != 0) goto L_0x0157
            rx3.l r0 = new rx3.l
            r0.<init>(r14, r14)
            goto L_0x015c
        L_0x0157:
            rx3.l r0 = new rx3.l
            r0.<init>(r14, r14)
        L_0x015c:
            com.tencent.mm.pluginsdk.model.a r7 = com.tencent.p014mm.pluginsdk.model.C44545a.f120794a
            java.lang.String r14 = r7.mo69323a()
            boolean r7 = r7.mo69325c()
            r23 = r2
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r24 = r2
            r2 = 22
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r20 = 1
            java.lang.Integer r25 = java.lang.Integer.valueOf(r20)
            r18 = 0
            r2[r18] = r25
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r2[r20] = r25
            java.lang.Integer r25 = java.lang.Integer.valueOf(r10)
            r19 = 2
            r2[r19] = r25
            java.lang.Integer r25 = java.lang.Integer.valueOf(r4)
            r17 = 3
            r2[r17] = r25
            java.lang.Integer r25 = java.lang.Integer.valueOf(r5)
            r16 = 4
            r2[r16] = r25
            r25 = r5
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r5 = r1.f51060h
            int r5 = r5.f51069c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r26 = 5
            r2[r26] = r5
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r5 = r1.f51060h
            int r5 = r5.f51069c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r27 = 6
            r2[r27] = r5
            int r5 = r1.f51058f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r28 = 7
            r2[r28] = r5
            r5 = 8
            r2[r5] = r6
            java.lang.Long r29 = java.lang.Long.valueOf(r11)
            r30 = 9
            r2[r30] = r29
            int r5 = r1.f51059g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r31 = 10
            r2[r31] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r32 = 11
            r2[r32] = r5
            r5 = 12
            r2[r5] = r9
            java.lang.Integer r33 = java.lang.Integer.valueOf(r13)
            r34 = 13
            r2[r34] = r33
            A r5 = r0.f38555d
            r35 = 14
            r2[r35] = r5
            B r0 = r0.f38556e
            r5 = 15
            r2[r5] = r0
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r0 = r1.f51060h
            r36 = r6
            long r5 = r0.f51071e
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r5 = 16
            r2[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r6 = 17
            r2[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r6 = 18
            r2[r6] = r0
            r0 = 19
            r2[r0] = r22
            r0 = 20
            r2[r0] = r14
            r0 = 21
            java.lang.Integer r37 = java.lang.Integer.valueOf(r7)
            r2[r0] = r37
            r0 = 11404(0x2c8c, float:1.598E-41)
            r5 = r24
            r5.mo160131h(r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 0
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r3 = 1
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 2
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r3 = 3
            r0[r3] = r2
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r2 = r1.f51060h
            int r2 = r2.f51069c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 4
            r0[r3] = r2
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r2 = r1.f51060h
            int r2 = r2.f51069c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r26] = r2
            int r2 = r1.f51058f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r27] = r2
            r0[r28] = r36
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3 = 8
            r0[r3] = r2
            int r2 = r1.f51059g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r30] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r0[r31] = r2
            r0[r32] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            r3 = 12
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r0[r34] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0[r35] = r2
            r2 = 15
            r0[r2] = r22
            r2 = 16
            r0[r2] = r14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r3 = 17
            r0[r3] = r2
            java.lang.String r2 = "reportEnterBiz %d,%d,%d,%d,%d,%d,%d,%s,%d,%d,%d,%d,%d,%d,%d,%s, netType=%s, isHeadsetOn=%d"
            r3 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18409k3.run():void");
    }
}
