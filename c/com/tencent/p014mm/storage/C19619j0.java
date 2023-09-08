package com.tencent.p014mm.storage;

/* renamed from: com.tencent.mm.storage.j0 */
public final class C19619j0 {

    /* renamed from: a */
    public static final C19619j0 f55506a = new C19619j0();

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x028a A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25749a(java.util.Map<java.lang.String, java.lang.String> r26, te3.re4 r27, com.tencent.p014mm.pluginsdk.model.C19467w0 r28, com.tencent.p014mm.storage.C19623o0 r29, boolean r30, int r31, int r32) {
        /*
            r25 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r31
            java.lang.String r4 = "values"
            r5 = r26
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "wrapper"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "insertRecCardExtData"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "info"
            gy3.C87412m.m108594g(r2, r4)
            com.tencent.mm.storage.p0 r4 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r4 = r4.mo25809mL()
            int r6 = r0.f64524p
            r7 = 1000(0x3e8, float:1.401E-42)
            r8 = 0
            r9 = 1
            r10 = 2
            r11 = 0
            if (r6 != r9) goto L_0x0054
            if (r30 == 0) goto L_0x0054
            long r12 = r0.f64519h
            long r14 = (long) r7
            long r12 = r12 * r14
            long r16 = eb0.C75604z3.m90844p()
            long r12 = r12 - r16
            long r12 = java.lang.Math.abs(r12)
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r6 > 0) goto L_0x004f
            long r12 = r0.f64519h
            long r12 = r12 * r14
            goto L_0x0073
        L_0x004f:
            long r12 = eb0.C75604z3.m90844p()
            goto L_0x0073
        L_0x0054:
            com.tencent.mm.storage.p0 r6 = rb0.C48009v0.Jx0()
            zh3.f r6 = r6.f55550d
            java.lang.String r12 = "SELECT createTime FROM BizTimeLineInfo where type !=637534257 order by createTime DESC limit 1"
            android.database.Cursor r6 = r6.rawQuery(r12, r11, r10)
            long r12 = eb0.C75604z3.m90844p()
            boolean r14 = r6.moveToFirst()
            if (r14 == 0) goto L_0x006e
            long r12 = r6.getLong(r8)
        L_0x006e:
            r6.close()
            long r14 = (long) r7
            long r12 = r12 + r14
        L_0x0073:
            r2.field_createTime = r12
            r2.mo25762J2(r0)
            java.lang.String r6 = r1.f55003c
            r2.field_rankSessionId = r6
            if (r30 == 0) goto L_0x008c
            boolean r6 = r1.f55002b
            if (r6 == 0) goto L_0x0083
            goto L_0x008c
        L_0x0083:
            com.tencent.mm.storage.p0 r6 = rb0.C48009v0.Jx0()
            long r12 = r6.mo25790TE()
            goto L_0x0094
        L_0x008c:
            com.tencent.mm.storage.p0 r6 = rb0.C48009v0.Jx0()
            long r12 = r6.mo25791TO()
        L_0x0094:
            r6 = 32
            java.lang.String r9 = "MicroMsg.BizRecCardUtil"
            r17 = 24
            r18 = 4278190080(0xff000000, double:2.113706745E-314)
            if (r4 == 0) goto L_0x014b
            if (r3 < 0) goto L_0x00ad
            long r3 = (long) r3
            r10 = 255(0xff, double:1.26E-321)
            int r20 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r20 <= 0) goto L_0x014d
            r3 = r10
            goto L_0x014d
        L_0x00ad:
            if (r32 != 0) goto L_0x00b7
            long r3 = r4.field_orderFlag
            long r3 = r3 & r18
            long r3 = r3 >> r17
            goto L_0x014d
        L_0x00b7:
            com.tencent.mm.storage.p0 r3 = rb0.C48009v0.Jx0()
            int r4 = r32 + -1
            r3.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "SELECT * FROM BizTimeLineInfo order by orderFlag DESC limit 1 offset "
            r7.append(r14)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            zh3.f r7 = r3.f55550d
            android.database.Cursor r4 = r7.rawQuery(r4, r11, r10)
            boolean r7 = r4.moveToFirst()
            if (r7 == 0) goto L_0x00e6
            com.tencent.mm.storage.o0 r7 = new com.tencent.mm.storage.o0
            r7.<init>()
            r7.convertFrom(r4)
            goto L_0x00e7
        L_0x00e6:
            r7 = r11
        L_0x00e7:
            r4.close()
            if (r7 == 0) goto L_0x00f8
            long r14 = r7.mo25767q2()
            long r21 = r3.mo25791TO()
            int r4 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r4 >= 0) goto L_0x0135
        L_0x00f8:
            long r14 = r3.mo25791TO()
            long r14 = r14 << r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "SELECT * FROM BizTimeLineInfo where orderFlag > "
            r4.append(r7)
            r4.append(r14)
            java.lang.String r7 = " order by "
            r4.append(r7)
            java.lang.String r7 = "orderFlag"
            r4.append(r7)
            java.lang.String r7 = " asc limit 1"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            zh3.f r3 = r3.f55550d
            android.database.Cursor r3 = r3.rawQuery(r4, r11, r10)
            boolean r4 = r3.moveToFirst()
            if (r4 == 0) goto L_0x0131
            com.tencent.mm.storage.o0 r11 = new com.tencent.mm.storage.o0
            r11.<init>()
            r11.convertFrom(r3)
        L_0x0131:
            r3.close()
            r7 = r11
        L_0x0135:
            if (r7 != 0) goto L_0x013d
            java.lang.String r3 = "[TRACE_BIZRECCARD] setCommRecCardInfo lastTimeLineInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r3)
            goto L_0x014b
        L_0x013d:
            long r3 = r7.field_orderFlag
            long r10 = r3 & r18
            long r10 = r10 >> r17
            r14 = 16777215(0xffffff, double:8.2890456E-317)
            long r3 = r3 & r14
            r14 = 1
            long r3 = r3 - r14
            goto L_0x0154
        L_0x014b:
            r3 = 0
        L_0x014d:
            r10 = -1
            r23 = r3
            r3 = r10
            r10 = r23
        L_0x0154:
            int r7 = r1.f55001a
            if (r30 == 0) goto L_0x01bc
            boolean r1 = r1.f55002b
            if (r1 == 0) goto L_0x01bc
            if (r7 < 0) goto L_0x0164
            r1 = 256(0x100, float:3.59E-43)
            if (r7 >= r1) goto L_0x0164
            r1 = 1
            goto L_0x0165
        L_0x0164:
            r1 = 0
        L_0x0165:
            if (r1 == 0) goto L_0x01bc
            long r14 = (long) r7
            int r1 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x01bc
            int r6 = r0.f64530v
            if (r6 != 0) goto L_0x019e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[TRACE_BIZRECCARD] setCommRecCardInfo failed msgPredict("
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ") > maxWeight("
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = ") failureBehavior "
            r1.append(r2)
            int r0 = r0.f64530v
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            com.tencent.mm.storage.z0 r0 = com.tencent.p014mm.storage.C19641z0.f55645a
            r1 = 125(0x7d, float:1.75E-43)
            r0.mo25867j(r1)
            return r8
        L_0x019e:
            com.tencent.mm.storage.z0 r6 = com.tencent.p014mm.storage.C19641z0.f55645a
            r8 = 126(0x7e, float:1.77E-43)
            r6.mo25867j(r8)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "[TRACE_BIZRECCARD] setCommRecCardInfo use maxWeight = "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r6)
            if (r1 <= 0) goto L_0x01bc
            r10 = r14
        L_0x01bc:
            long r6 = r10 << r17
            long r6 = r6 & r18
            r10 = 0
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x01d0
            long r3 = r2.field_createTime
            r1 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r1
            long r3 = r3 / r10
            long r3 = com.tencent.p014mm.storage.C19636w0.m21166h(r12, r3)
        L_0x01d0:
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 < 0) goto L_0x0202
            r1 = 1
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r3 = 0
            r8[r3] = r1
            java.lang.String r1 = "[TRACE_BIZRECCARD] setCommRecCardInfo serialNumber is too big %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r1, r8)
            com.tencent.mm.storage.p0 r1 = rb0.C48009v0.Jx0()
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLong r3 = r1.f55554h     // Catch:{ all -> 0x01ff }
            long r12 = r3.incrementAndGet()     // Catch:{ all -> 0x01ff }
            monitor-exit(r1)
            long r3 = r2.field_createTime
            r1 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r1
            long r3 = r3 / r8
            long r3 = com.tencent.p014mm.storage.C19636w0.m21166h(r12, r3)
            goto L_0x0202
        L_0x01ff:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0202:
            r1 = 32
            long r8 = r12 << r1
            long r6 = r6 | r8
            long r3 = r3 | r6
            r2.field_orderFlag = r3
            com.tencent.p014mm.storage.C19636w0.m21173o(r29)
            te3.hh r1 = com.tencent.p014mm.storage.C19613h1.m21046s(r26)
            r0.f64531w = r1
            int r0 = r1.f183484d
            r2.field_recycleCardType = r0
            te3.re4 r0 = r2.f55530o1
            java.lang.String r1 = "MicroMsg.BizTimeLineInfoStorageLogic"
            if (r0 == 0) goto L_0x0280
            te3.hh r0 = r0.f64531w
            if (r0 == 0) goto L_0x0280
            int r3 = r0.f183485e
            r4 = 1
            if (r3 != r4) goto L_0x0280
            int r0 = r0.f183484d
            if (r0 != r4) goto L_0x0237
            java.lang.Class<ex0.d> r0 = ex0.C45696d.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ex0.d r0 = (ex0.C45696d) r0
            boolean r0 = r0.mo70980Wc()
            goto L_0x0238
        L_0x0237:
            r0 = 0
        L_0x0238:
            if (r0 != 0) goto L_0x0261
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1130(0x46a, double:5.583E-321)
            r6 = 140(0x8c, double:6.9E-322)
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            int r3 = r2.field_recycleCardType
            r0.mo25811qq(r3)
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            int r0 = r2.field_recycleCardType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r3[r2] = r0
            java.lang.String r0 = "delete unique, recycleCardType = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
            goto L_0x0280
        L_0x0261:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1130(0x46a, double:5.583E-321)
            r7 = 141(0x8d, double:6.97E-322)
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            int r0 = r2.field_recycleCardType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r3[r2] = r0
            java.lang.String r0 = "delete unique fail, visible, recycleCardType = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
            r0 = 0
            goto L_0x0282
        L_0x0280:
            r2 = 0
            r0 = 1
        L_0x0282:
            if (r0 != 0) goto L_0x028a
            java.lang.String r0 = "[TRACE_BIZRECCARD] postInsert unique check fail! %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r2
        L_0x028a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19619j0.mo25749a(java.util.Map, te3.re4, com.tencent.mm.pluginsdk.model.w0, com.tencent.mm.storage.o0, boolean, int, int):boolean");
    }
}
