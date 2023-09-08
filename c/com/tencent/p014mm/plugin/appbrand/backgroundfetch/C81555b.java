package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.b */
public class C81555b implements Runnable {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        if ((r18 - r9) >= (((long) r7) * 3600000)) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e2, code lost:
        r7 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0().mo114000LL(r6, "appInfo");
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r29 = this;
            java.lang.String r1 = "MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler"
            r2 = 0
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()     // Catch:{ Exception -> 0x0218 }
            com.tencent.mm.plugin.appbrand.appusage.l0 r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238473i     // Catch:{ Exception -> 0x0218 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            android.database.Cursor r0 = r0.mo56647mI(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0218 }
            java.util.ArrayList r0 = com.tencent.p014mm.plugin.appbrand.appusage.C29378l0.m38692SE(r0)     // Catch:{ Exception -> 0x0218 }
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0023
            java.lang.String r0 = "worker:periodFetchDataWhenAppEnterForeground, no recent apps"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x0023:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r0.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r5 = "worker:periodFetchDataWhenAppEnterForeground, recent list size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0202
            java.lang.Object r5 = r0.next()
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo r5 = (com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo) r5
            java.lang.String r6 = r5.f239040d
            boolean r6 = r4.containsKey(r6)
            if (r6 != 0) goto L_0x003f
            java.lang.String r6 = r5.f239040d
            int r14 = r5.f239042f
            com.tencent.mm.plugin.appbrand.backgroundfetch.a r15 = com.tencent.p014mm.plugin.appbrand.config.C81661j.m100176a(r6)
            r13 = 2
            if (r15 == 0) goto L_0x01d8
            boolean r7 = r15.f239179b
            if (r7 != 0) goto L_0x0064
            goto L_0x01d8
        L_0x0064:
            int r7 = r15.f239180c
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundfetch.w> r8 = com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29444w.class
            r16 = 0
            if (r7 >= r13) goto L_0x0071
            r20 = r14
            r22 = r15
            goto L_0x00b9
        L_0x0071:
            long r18 = eb0.C31543z5.m39453c()
            di3.d r9 = di3.C86312j.m106911c(r8)
            com.tencent.mm.plugin.appbrand.backgroundfetch.w r9 = (com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29444w) r9
            long r9 = r9.mo56667NV(r6, r3)
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 > 0) goto L_0x00a7
            di3.d r7 = di3.C86312j.m106911c(r8)
            if (r7 == 0) goto L_0x00a2
            di3.d r7 = di3.C86312j.m106911c(r8)
            com.tencent.mm.plugin.appbrand.backgroundfetch.w r7 = (com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29444w) r7
            r10 = 0
            r11 = 0
            r12 = 0
            r20 = 1000(0x3e8, float:1.401E-42)
            r9 = 1
            r8 = r6
            r13 = r20
            r20 = r14
            r22 = r15
            r14 = r18
            r7.mo56668OF(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00b7
        L_0x00a2:
            r20 = r14
            r22 = r15
            goto L_0x00b7
        L_0x00a7:
            r20 = r14
            r22 = r15
            long r18 = r18 - r9
            long r7 = (long) r7
            r9 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r7 * r9
            int r9 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x00b9
        L_0x00b7:
            r7 = 1
            goto L_0x00ba
        L_0x00b9:
            r7 = 0
        L_0x00ba:
            r8 = 3
            if (r7 != 0) goto L_0x00d9
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r7[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r7[r3] = r6
            r9 = r22
            int r6 = r9.f239180c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10 = 2
            r7[r10] = r6
            java.lang.String r6 = "canPeriodFetchData, app(%s_v%d) interval(%d) not ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)
            goto L_0x01ea
        L_0x00d9:
            r9 = r22
            r10 = 2
            wi0.e0 r7 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            if (r7 == 0) goto L_0x0104
            wi0.e0 r7 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String r11 = "appInfo"
            java.lang.String[] r11 = new java.lang.String[]{r11}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r7 = r7.mo114000LL(r6, r11)
            if (r7 == 0) goto L_0x0104
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r11 = r7.mo113940m2()
            if (r11 == 0) goto L_0x0104
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r7 = r7.mo113940m2()
            boolean r7 = r7.mo113971b()
            if (r7 == 0) goto L_0x0104
            r7 = 1
            goto L_0x0105
        L_0x0104:
            r7 = 0
        L_0x0105:
            if (r7 == 0) goto L_0x0118
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r7[r3] = r6
            java.lang.String r6 = "canPeriodFetchData, app(%s_v%d) is plugin app"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)
            goto L_0x01d6
        L_0x0118:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appusage.l0 r7 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238473i
            r7.getClass()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r11 == 0) goto L_0x0127
            goto L_0x0172
        L_0x0127:
            zh3.f r7 = r7.f80165e
            java.lang.String r11 = "updateTime"
            java.lang.String[] r23 = new java.lang.String[]{r11}
            java.util.Locale r14 = java.util.Locale.US
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.String r18 = "brandId"
            r15[r2] = r18
            java.lang.String r18 = "versionType"
            r15[r3] = r18
            java.lang.String r18 = "scene"
            r15[r10] = r18
            java.lang.String r12 = "%s=? and %s=? and %s=?"
            java.lang.String r24 = java.lang.String.format(r14, r12, r15)
            java.lang.String[] r8 = new java.lang.String[r8]
            r8[r2] = r6
            java.lang.String r12 = java.lang.String.valueOf(r20)
            r8[r3] = r12
            java.lang.String r12 = java.lang.String.valueOf(r10)
            r8[r10] = r12
            r26 = 0
            r27 = 0
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r2] = r11
            java.lang.String r11 = " %s desc "
            java.lang.String r28 = java.lang.String.format(r14, r11, r12)
            java.lang.String r22 = "AppBrandLauncherLayoutItem"
            r21 = r7
            r25 = r8
            android.database.Cursor r7 = r21.query(r22, r23, r24, r25, r26, r27, r28)
            if (r7 != 0) goto L_0x0175
        L_0x0172:
            r12 = -1
            goto L_0x0186
        L_0x0175:
            boolean r8 = r7.moveToFirst()
            if (r8 == 0) goto L_0x0181
            long r11 = r7.getLong(r2)
            r12 = r11
            goto L_0x0183
        L_0x0181:
            r12 = -1
        L_0x0183:
            r7.close()
        L_0x0186:
            int r7 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x0190
            java.lang.String r7 = "hasRecentlyUsed, recently not used"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            goto L_0x01b4
        L_0x0190:
            int r7 = r9.f239181d
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r8[r2] = r9
            java.lang.String r9 = "hasRecentlyUsed, config days:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r8)
            long r7 = (long) r7
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 * r14
            long r14 = eb0.C31543z5.m39453c()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r16
            long r14 = r14 - r12
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x01b4
            r7 = 1
            goto L_0x01b5
        L_0x01b4:
            r7 = 0
        L_0x01b5:
            if (r7 != 0) goto L_0x01c7
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r7[r3] = r6
            java.lang.String r6 = "canPeriodFetchData, app(%s_v%d) recently not used"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)
            goto L_0x01ea
        L_0x01c7:
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r7[r3] = r6
            java.lang.String r6 = "canPeriodFetchData, app(%s_v%d) can period fetch data"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)
        L_0x01d6:
            r6 = 1
            goto L_0x01eb
        L_0x01d8:
            r20 = r14
            r10 = 2
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r2] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            r7[r3] = r6
            java.lang.String r6 = "canPeriodFetchData, app(%s_v%d) can not period fetch data"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)
        L_0x01ea:
            r6 = 0
        L_0x01eb:
            if (r6 == 0) goto L_0x003f
            java.lang.String r6 = r5.f239040d
            java.lang.String r5 = r5.f239041e
            r4.put(r6, r5)
            int r5 = r4.size()
            r6 = 20
            if (r5 < r6) goto L_0x003f
            java.lang.String r0 = "worker:periodFetchDataWhenAppEnterForeground, batch list full"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0202:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0211
            com.tencent.mm.plugin.appbrand.backgroundfetch.p r0 = new com.tencent.mm.plugin.appbrand.backgroundfetch.p
            r0.<init>()
            com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81557d.m100043a(r4, r0)
            goto L_0x0217
        L_0x0211:
            java.lang.String r0 = "worker:periodFetchDataWhenAppEnterForeground, currently no app needs to update period data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0217:
            return
        L_0x0218:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "periodFetchDataWhenAppEnterForeground, getHistories error."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81555b.run():void");
    }
}
