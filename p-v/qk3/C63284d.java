package qk3;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import d14.C58085t0;

/* renamed from: qk3.d */
public final class C63284d {

    /* renamed from: a */
    public C58085t0<C63281a> f179617a;

    /* renamed from: b */
    public final C0000n0 f179618b = C53930o0.m60555b();

    /* renamed from: c */
    public C53973z1 f179619c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ef A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0332  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m74575a(qk3.C63284d r29, java.lang.String r30, int r31, java.util.HashSet r32, java.lang.String r33, long r34, p157gk.C59479c r36, wx3.C15601d r37) {
        /*
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r34
            r6 = r36
            r7 = r37
            r29.getClass()
            boolean r8 = r7 instanceof qk3.C63282b
            if (r8 == 0) goto L_0x0024
            r8 = r7
            qk3.b r8 = (qk3.C63282b) r8
            int r9 = r8.f179608h
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r9 & r10
            if (r11 == 0) goto L_0x0024
            int r9 = r9 - r10
            r8.f179608h = r9
            goto L_0x0029
        L_0x0024:
            qk3.b r8 = new qk3.b
            r8.<init>(r0, r7)
        L_0x0029:
            r9 = r8
            java.lang.Object r7 = r9.f179606f
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r8 = r9.f179608h
            r12 = 1
            if (r8 == 0) goto L_0x0048
            if (r8 != r12) goto L_0x0040
            long r0 = r9.f179605e
            int r2 = r9.f179604d
            kotlin.ResultKt.throwOnFailure(r7)
            r11 = r0
            r0 = 1
            goto L_0x035b
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r7)
            gk.c r7 = p157gk.C59479c.STOP
            r13 = 0
            r8 = 20
            if (r6 == r7) goto L_0x0195
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0195
            java.lang.String r7 = "roomId"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.Class<com.tencent.mm.storage.w3> r7 = com.tencent.p014mm.storage.C57604w3.class
            byte[] r15 = i40.C60247c.f171776h
            monitor-enter(r15)
            f40.e r16 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0192 }
            r16.mo121108c()     // Catch:{ all -> 0x0192 }
            java.lang.Class<i40.c> r13 = i40.C60247c.class
            boolean r13 = r13.isAssignableFrom(r7)     // Catch:{ all -> 0x0192 }
            if (r13 == 0) goto L_0x018a
            androidx.lifecycle.k0 r13 = new androidx.lifecycle.k0     // Catch:{ all -> 0x0192 }
            f40.e r14 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0192 }
            f40.a r14 = r14.f251755f     // Catch:{ all -> 0x0192 }
            i40.c$a$a r11 = new i40.c$a$a     // Catch:{ all -> 0x0192 }
            r11.<init>()     // Catch:{ all -> 0x0192 }
            r13.<init>((androidx.lifecycle.C0123n0) r14, (androidx.lifecycle.C54209k0.C54210b) r11)     // Catch:{ all -> 0x0192 }
            androidx.lifecycle.i0 r7 = r13.mo75002a(r7)     // Catch:{ all -> 0x0192 }
            monitor-exit(r15)
            com.tencent.mm.storage.w3 r7 = (com.tencent.p014mm.storage.C57604w3) r7
            java.lang.Class<com.tencent.mm.storage.t1> r11 = com.tencent.p014mm.storage.C57603t1.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r7 = r7.mo85233d3(r11)
            com.tencent.mm.storage.t1 r7 = (com.tencent.p014mm.storage.C57603t1) r7
            java.lang.String r11 = "1"
            com.tencent.mm.sdk.storage.sql.Sql$Equal r13 = new com.tencent.mm.sdk.storage.sql.Sql$Equal
            java.lang.String r14 = "chat_room_id"
            r13.<init>(r14, r1)
            com.tencent.mm.sdk.storage.sql.Sql$Equal r14 = new com.tencent.mm.sdk.storage.sql.Sql$Equal
            java.lang.String r15 = "is_recognize"
            r14.<init>(r15, r11)
            com.tencent.mm.sdk.storage.sql.Sql$SmallerThan r11 = new com.tencent.mm.sdk.storage.sql.Sql$SmallerThan
            java.lang.String r15 = java.lang.String.valueOf(r34)
            java.lang.String r12 = "timestamp"
            r11.<init>(r12, r15)
            com.tencent.mm.sdk.storage.sql.ISqlCondition r11 = r14.and(r11)
            com.tencent.mm.sdk.storage.sql.ISqlCondition r11 = r13.and(r11)
            com.tencent.mm.sdk.storage.sql.SingleTable r12 = p749xh.C66267j1.f190595p
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r12 = r12.selectAll()
            java.lang.String r13 = "MicroMsg.ClsLabelInfoStorage"
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r12 = r12.log(r13)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r11 = r12.where(r11)
            com.tencent.mm.sdk.storage.sql.Column r12 = p749xh.C66267j1.f190596q
            com.tencent.mm.sdk.storage.sql.ISqlOrder r12 = r12.orderDesc()
            java.util.List r12 = sx3.C26236u.m33719b(r12)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r11 = r11.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r12)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r11 = r11.limit(r8, r2)
            com.tencent.mm.sdk.storage.sql.SelectSql r11 = r11.build()
            com.tencent.mm.sdk.storage.mvvm.IMvvmDBProvider r7 = r7.getDbProvider()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r7.getDB()
            java.lang.Class<com.tencent.mm.storage.s1> r12 = com.tencent.p014mm.storage.C57602s1.class
            java.util.List r7 = r11.multiQuery(r7, r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "getClsImageListByIsAndSmallThanTimestamp select result: "
            r11.append(r12)
            int r12 = r7.size()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
            java.lang.String r11 = "MicroMsg.ImageQueryStorage"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "selectClsImageListIsRecSmallThanTimeStamp >> "
            r12.append(r13)
            r12.append(r1)
            java.lang.String r1 = ", "
            r12.append(r1)
            r12.append(r8)
            java.lang.String r1 = ", "
            r12.append(r1)
            r12.append(r2)
            java.lang.String r1 = ". "
            r12.append(r1)
            r12.append(r4)
            java.lang.String r1 = ", "
            r12.append(r1)
            int r1 = r7.size()
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0142:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0185
            java.lang.Object r11 = r7.next()
            com.tencent.mm.storage.s1 r11 = (com.tencent.p014mm.storage.C57602s1) r11
            com.tencent.mm.api.QueryImageData r12 = new com.tencent.mm.api.QueryImageData
            long r13 = r11.field_timestamp
            r27 = r9
            long r8 = r11.field_msg_id
            java.lang.String r15 = r11.field_hd_image_path
            r30 = r7
            java.lang.String r7 = r11.field_origin_image_path
            r28 = r10
            java.lang.String r10 = r11.field_label_id
            java.lang.String r0 = r11.field_crop_label_id
            java.lang.String r11 = r11.field_ocr_result
            r17 = r12
            r18 = r13
            r20 = r8
            r22 = r15
            r23 = r7
            r24 = r10
            r25 = r0
            r26 = r11
            r17.<init>(r18, r20, r22, r23, r24, r25, r26)
            r1.add(r12)
            r0 = r29
            r7 = r30
            r9 = r27
            r10 = r28
            r8 = 20
            goto L_0x0142
        L_0x0185:
            r27 = r9
            r28 = r10
            goto L_0x01a1
        L_0x018a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0192 }
            java.lang.String r1 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r1)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0195:
            r27 = r9
            r28 = r10
            com.tencent.mm.storage.a4 r0 = com.tencent.p014mm.storage.C57593a4.f164912a
            r7 = 20
            java.util.ArrayList r1 = r0.mo81941f(r1, r7, r2)
        L_0x01a1:
            java.lang.String r0 = "MicroMsg.LoadMoreImageDataModel"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "dealDataFromStorage >> "
            r7.append(r8)
            int r8 = r1.size()
            r7.append(r8)
            java.lang.String r8 = ", "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            int r0 = r1.size()
            r6 = 20
            if (r0 == r6) goto L_0x01cd
            r9 = 1
            goto L_0x01ce
        L_0x01cd:
            r9 = 0
        L_0x01ce:
            boolean r0 = r1.isEmpty()
            r6 = 1
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = sx3.C110818d0.m150923U(r1)
            com.tencent.mm.api.QueryImageData r0 = (com.tencent.p014mm.api.QueryImageData) r0
            long r6 = r0.f154724e
            goto L_0x01e1
        L_0x01df:
            r6 = 0
        L_0x01e1:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x01ef:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x02ba
            java.lang.Object r11 = r0.next()
            com.tencent.mm.api.QueryImageData r11 = (com.tencent.p014mm.api.QueryImageData) r11
            java.lang.String r12 = r11.f154727h
            java.lang.String r13 = "it.labelId"
            gy3.C87412m.m108593f(r12, r13)
            boolean r13 = r32.isEmpty()
            if (r13 == 0) goto L_0x020b
        L_0x0208:
            r14 = r32
            goto L_0x0247
        L_0x020b:
            java.lang.String r13 = "#"
            java.lang.String[] r18 = new java.lang.String[]{r13}
            r19 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            r17 = r12
            java.util.List r12 = z04.C112550d0.m153785U(r17, r18, r19, r20, r21, r22)
            java.util.Iterator r12 = r12.iterator()
        L_0x0223:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0208
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            int r14 = r13.length()
            if (r14 <= 0) goto L_0x0237
            r14 = 1
            goto L_0x0238
        L_0x0237:
            r14 = 0
        L_0x0238:
            if (r14 == 0) goto L_0x0244
            r14 = r32
            boolean r13 = r14.contains(r13)
            if (r13 == 0) goto L_0x0223
            r12 = 1
            goto L_0x0248
        L_0x0244:
            r14 = r32
            goto L_0x0223
        L_0x0247:
            r12 = 0
        L_0x0248:
            if (r12 == 0) goto L_0x0266
            java.lang.String r12 = "MicroMsg.LoadMoreImageDataModel"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            long r14 = r11.f154723d
            r13.append(r14)
            java.lang.String r14 = " is match"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            r8.add(r11)
            goto L_0x01ef
        L_0x0266:
            java.lang.String r12 = r11.f154729j
            java.lang.String r13 = "it.ocrResult"
            gy3.C87412m.m108593f(r12, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "isOcrResultSame >> queryText: "
            r13.append(r14)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "MicroMsg.LoadMoreImageDataModel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            int r13 = r12.length()
            if (r13 <= 0) goto L_0x028b
            r13 = 1
            goto L_0x028c
        L_0x028b:
            r13 = 0
        L_0x028c:
            if (r13 == 0) goto L_0x0299
            r13 = 2
            r14 = 0
            r15 = 0
            boolean r12 = z04.C112550d0.m153803w(r12, r3, r15, r13, r14)
            if (r12 == 0) goto L_0x029a
            r12 = 1
            goto L_0x029b
        L_0x0299:
            r15 = 0
        L_0x029a:
            r12 = 0
        L_0x029b:
            if (r12 == 0) goto L_0x01ef
            java.lang.String r12 = "MicroMsg.LoadMoreImageDataModel"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            long r14 = r11.f154723d
            r13.append(r14)
            java.lang.String r14 = " is match"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
            r10.add(r11)
            goto L_0x01ef
        L_0x02ba:
            java.lang.String r0 = "MicroMsg.LoadMoreImageDataModel"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "dealDataFromStorage >> "
            r11.append(r12)
            r11.append(r2)
            java.lang.String r12 = ", "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r12 = ", "
            r11.append(r12)
            r11.append(r6)
            java.lang.String r12 = ", "
            r11.append(r12)
            int r12 = r8.size()
            r11.append(r12)
            java.lang.String r12 = ", "
            r11.append(r12)
            int r12 = r10.size()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x030f
            boolean r0 = r1.isEmpty()
            r4 = 1
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x0311
            java.lang.Object r0 = sx3.C110818d0.m150914L(r1)
            com.tencent.mm.api.QueryImageData r0 = (com.tencent.p014mm.api.QueryImageData) r0
            long r0 = r0.f154724e
            goto L_0x0310
        L_0x030f:
            r0 = r4
        L_0x0310:
            r11 = r0
        L_0x0311:
            if (r9 != 0) goto L_0x0332
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0332
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0332
            int r0 = r2 % 40
            if (r0 == 0) goto L_0x0332
            rx3.l r10 = new rx3.l
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r10.<init>(r0, r1)
            goto L_0x0370
        L_0x0332:
            r0 = r29
            d14.t0<qk3.a> r13 = r0.f179617a
            if (r13 == 0) goto L_0x035d
            qk3.a r14 = new qk3.a
            r0 = r14
            r1 = r33
            r2 = r9
            r3 = r11
            r5 = r6
            r7 = r8
            r8 = r10
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r8 = r27
            r8.f179604d = r9
            r8.f179605e = r11
            r0 = 1
            r8.f179608h = r0
            d14.z0 r13 = (d14.C58100z0) r13
            java.lang.Object r1 = r13.emit(r14, r8)
            r2 = r28
            if (r1 != r2) goto L_0x035a
            r10 = r2
            goto L_0x0370
        L_0x035a:
            r2 = r9
        L_0x035b:
            r9 = r2
            goto L_0x035e
        L_0x035d:
            r0 = 1
        L_0x035e:
            rx3.l r10 = new rx3.l
            if (r9 == 0) goto L_0x0363
            goto L_0x0364
        L_0x0363:
            r0 = 0
        L_0x0364:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r11)
            r10.<init>(r0, r1)
        L_0x0370:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qk3.C63284d.m74575a(qk3.d, java.lang.String, int, java.util.HashSet, java.lang.String, long, gk.c, wx3.d):java.lang.Object");
    }
}
