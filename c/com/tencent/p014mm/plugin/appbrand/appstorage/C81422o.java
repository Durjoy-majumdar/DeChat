package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.o */
public final class C81422o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandStorageQuotaManager.CleanupTempFilesOnExitParams f238953d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandStorageQuotaManager.C81402a f238954e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandStorageQuotaManager.CleanupTempFilesOnExitParams f238955f;

    public C81422o(AppBrandStorageQuotaManager.CleanupTempFilesOnExitParams cleanupTempFilesOnExitParams, AppBrandStorageQuotaManager.C81402a aVar, AppBrandStorageQuotaManager.CleanupTempFilesOnExitParams cleanupTempFilesOnExitParams2) {
        this.f238953d = cleanupTempFilesOnExitParams;
        this.f238954e = aVar;
        this.f238955f = cleanupTempFilesOnExitParams2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03b0, code lost:
        if (gy3.C87412m.m108589b(r6, r2.f236565i) != false) goto L_0x03bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r0 = r34
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r2 = r0.f238953d
            boolean r3 = r2.f10875i
            r8 = 1
            java.lang.String r9 = "usr"
            java.lang.String r10 = "store"
            java.lang.String r11 = "temp"
            if (r3 == 0) goto L_0x007a
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$a r3 = r0.f238954e
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct r2 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.C81402a.m99846a(r3, r2)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r3 = r0.f238955f
            java.lang.String r12 = "DirPrefix"
            java.lang.String r13 = "tmp"
            java.lang.String r13 = r2.mo86045b(r12, r13, r8)
            r2.f236565i = r13
            boolean r3 = r3.f10879p
            if (r3 == 0) goto L_0x0031
            r13 = 1
            goto L_0x0033
        L_0x0031:
            r13 = 0
        L_0x0033:
            r2.f236571o = r13
            r1.put(r11, r2)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$a r3 = r0.f238954e
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r13 = r0.f238953d
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct r3 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.C81402a.m99846a(r3, r13)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r13 = r0.f238955f
            java.lang.String r14 = r3.mo86045b(r12, r10, r8)
            r3.f236565i = r14
            boolean r13 = r13.f10879p
            if (r13 == 0) goto L_0x004f
            r13 = 1
            goto L_0x0051
        L_0x004f:
            r13 = 0
        L_0x0051:
            r3.f236571o = r13
            java.lang.String r13 = "saved_temp"
            r1.put(r13, r3)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$a r3 = r0.f238954e
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r13 = r0.f238953d
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct r3 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.C81402a.m99846a(r3, r13)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r13 = r0.f238955f
            java.lang.String r12 = r3.mo86045b(r12, r9, r8)
            r3.f236565i = r12
            boolean r12 = r13.f10879p
            if (r12 == 0) goto L_0x0070
            r12 = 1
            goto L_0x0072
        L_0x0070:
            r12 = 0
        L_0x0072:
            r3.f236571o = r12
            java.lang.String r12 = "normal_none_flatten"
            r1.put(r12, r3)
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = "[mm]start check: appId["
            r3.append(r12)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r12 = r0.f238953d
            java.lang.String r12 = r12.f10870d
            r3.append(r12)
            java.lang.String r12 = "] minTemp["
            r3.append(r12)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r12 = r0.f238953d
            long r12 = r12.f10871e
            r3.append(r12)
            java.lang.String r12 = "] maxTemp["
            r3.append(r12)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r12 = r0.f238953d
            long r12 = r12.f10872f
            r3.append(r12)
            java.lang.String r12 = "] maxTotal["
            r3.append(r12)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r12 = r0.f238953d
            long r12 = r12.f10873g
            r3.append(r12)
            r12 = 93
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r13 = "MicroMsg.AppBrandStorageQuotaManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager r3 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.f238916a
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r3 = r0.f238953d
            java.lang.String r14 = r3.f10870d
            java.util.HashMap<java.lang.String, java.lang.String> r15 = r3.f10874h
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r3.f10880q
            java.lang.String r12 = "appId"
            gy3.C87412m.m108594g(r14, r12)
            java.lang.String r4 = "storageKey2Path"
            gy3.C87412m.m108594g(r15, r4)
            java.lang.String r5 = "supportRuntimeSpaceStaticsMap"
            gy3.C87412m.m108594g(r3, r5)
            java.util.Set r5 = r15.keySet()
            java.lang.String r6 = "storageKey2Path.keys"
            gy3.C87412m.m108593f(r5, r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x00e7:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = ""
            r21 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r23 = r9
            if (r6 == 0) goto L_0x016c
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager r8 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.f238916a
            java.lang.String r9 = "it"
            gy3.C87412m.m108593f(r6, r9)
            java.lang.Object r9 = r1.get(r6)
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct r9 = (com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct) r9
            r25 = r5
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.Object r26 = r15.get(r6)
            java.lang.String r26 = (java.lang.String) r26
            if (r26 != 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r7 = r26
        L_0x0115:
            r5.<init>((java.lang.String) r7)
            if (r9 != 0) goto L_0x0120
            r27 = r2
            r26 = r3
            r3 = r1
            goto L_0x0150
        L_0x0120:
            java.lang.Object r7 = r3.get(r14)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0134
            boolean r7 = r7.contains(r6)
            r26 = r3
            r3 = 1
            if (r7 != r3) goto L_0x0136
            r24 = 1
            goto L_0x0138
        L_0x0134:
            r26 = r3
        L_0x0136:
            r24 = 0
        L_0x0138:
            if (r24 == 0) goto L_0x0149
            r3 = r1
            r27 = r2
            long r1 = r8.mo113686c(r14, r6)
            double r1 = (double) r1
            double r1 = r1 / r21
            long r1 = iy3.C60641c.m70922c(r1)
            goto L_0x014e
        L_0x0149:
            r3 = r1
            r27 = r2
            r1 = -1
        L_0x014e:
            r9.f236570n = r1
        L_0x0150:
            long r1 = r8.mo113684a(r14, r6, r5)
            if (r9 != 0) goto L_0x0157
            goto L_0x0160
        L_0x0157:
            double r1 = (double) r1
            double r1 = r1 / r21
            long r1 = iy3.C60641c.m70922c(r1)
            r9.f236564h = r1
        L_0x0160:
            r1 = r3
            r9 = r23
            r5 = r25
            r3 = r26
            r2 = r27
            r8 = 1
            goto L_0x00e7
        L_0x016c:
            r3 = r1
            r27 = r2
            com.tencent.mm.plugin.appbrand.appstorage.q$b r1 = com.tencent.p014mm.plugin.appbrand.appstorage.C81429q.f238972a
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r2 = r0.f238953d
            java.lang.String r5 = r2.f10870d
            long r8 = r2.f10871e
            long r14 = r2.f10872f
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r2.f10874h
            gy3.C87412m.m108594g(r5, r12)
            gy3.C87412m.m108594g(r2, r4)
            long r25 = java.lang.System.currentTimeMillis()
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            java.lang.Object r2 = r2.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r7 = r2
        L_0x0191:
            r4.<init>((java.lang.String) r7)
            boolean r2 = r4.mo119967g()
            if (r2 == 0) goto L_0x035b
            boolean r2 = r4.mo119977o()
            if (r2 == 0) goto L_0x035b
            java.lang.String r2 = r4.mo119971i()
            java.lang.String r4 = "appDir.absolutePath"
            gy3.C87412m.m108593f(r2, r4)
            boolean r2 = r1.mo113749a(r2)
            if (r2 == 0) goto L_0x01b1
            goto L_0x035b
        L_0x01b1:
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager r2 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.f238916a
            long r11 = r2.mo113686c(r5, r11)
            if (r27 != 0) goto L_0x01bc
            r2 = r27
            goto L_0x01c7
        L_0x01bc:
            double r6 = (double) r11
            double r6 = r6 / r21
            long r6 = iy3.C60641c.m70922c(r6)
            r2 = r27
            r2.f236564h = r6
        L_0x01c7:
            long r6 = r14 - r8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r27 = r10
            java.lang.String r10 = "checkAppDirTempFileLimit current:"
            r4.append(r10)
            r4.append(r11)
            java.lang.String r10 = " min:"
            r4.append(r10)
            r4.append(r8)
            java.lang.String r8 = " max:"
            r4.append(r8)
            r4.append(r14)
            java.lang.String r8 = " limit:"
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "MicroMsg.AppBrandTempFileCleaner"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            r4 = 3
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r4 = 0
            r9[r4] = r5
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r14 = 1
            r9[r14] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r14 = 2
            r9[r14] = r4
            java.lang.String r14 = "lruPruneAppDirTempFiles %s %d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r14 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.f241503f
            java.lang.String r14 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.f238909a
            r9.append(r14)
            r9.append(r5)
            r14 = 47
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            boolean r14 = android.text.TextUtils.isEmpty(r5)
            if (r14 != 0) goto L_0x0312
            int r14 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x0312
            boolean r1 = r1.mo113749a(r9)
            if (r1 == 0) goto L_0x023c
            goto L_0x0312
        L_0x023c:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r9)
            boolean r14 = r1.mo119967g()
            if (r14 == 0) goto L_0x0307
            boolean r14 = r1.mo119977o()
            if (r14 != 0) goto L_0x024f
            goto L_0x0307
        L_0x024f:
            java.util.concurrent.atomic.AtomicLong r14 = new java.util.concurrent.atomic.AtomicLong
            r21 = r11
            r10 = -1
            r14.<init>(r10)
            com.tencent.mm.sdk.platformtools.MMHandler r10 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r10.<init>((android.os.Looper) r11)
            com.tencent.mm.plugin.appbrand.appstorage.s r11 = new com.tencent.mm.plugin.appbrand.appstorage.s
            r11.<init>(r5, r9, r14)
            r28 = 1000(0x3e8, double:4.94E-321)
            java.lang.Class<h81.h> r9 = h81.C32735h.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            h81.h r9 = (h81.C32735h) r9
            h81.h$c r15 = h81.C32735h.C32737c.clicfg_android_appbrand_tempfile_cleanup_timeout
            r4 = 180(0xb4, float:2.52E-43)
            int r4 = r9.mo58779Qe(r15, r4)
            r9 = r13
            long r12 = (long) r4
            long r12 = r12 * r28
            r10.postDelayed(r11, r12)
            com.tencent.mm.vfs.o1 r4 = com.tencent.p014mm.plugin.appbrand.appstorage.C81429q.f238974c
            com.tencent.mm.vfs.m1[] r1 = r1.mo119985v(r4)
            if (r1 == 0) goto L_0x02ff
            int r4 = r1.length
            if (r4 != 0) goto L_0x028c
            r4 = 1
            goto L_0x028d
        L_0x028c:
            r4 = 0
        L_0x028d:
            if (r4 == 0) goto L_0x0290
            goto L_0x02ff
        L_0x0290:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "lruPruneAppDirTempFiles listFiles done: "
            r4.append(r12)
            int r12 = r1.length
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            long r12 = r21 - r6
            com.tencent.mm.plugin.appbrand.appstorage.r<T> r4 = com.tencent.p014mm.plugin.appbrand.appstorage.C29346r.f80108d     // Catch:{ IllegalArgumentException -> 0x02ac }
            java.util.Arrays.sort(r1, r4)     // Catch:{ IllegalArgumentException -> 0x02ac }
        L_0x02ac:
            java.lang.String r4 = "lruPruneAppDirTempFiles sort done"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            java.util.Iterator r1 = gy3.C32617c.m39769a(r1)
        L_0x02b5:
            r4 = r1
            gy3.b r4 = (gy3.C32616b) r4
            boolean r28 = r4.hasNext()
            if (r28 == 0) goto L_0x02da
            java.lang.Object r4 = r4.next()
            com.tencent.mm.vfs.m1 r4 = (com.tencent.p014mm.vfs.C86009m1) r4
            java.lang.String r28 = r4.mo119971i()
            boolean r28 = com.tencent.p014mm.vfs.C86013q1.m106447h(r28)
            if (r28 == 0) goto L_0x02d4
            long r28 = r4.mo119980r()
            long r12 = r12 - r28
        L_0x02d4:
            r19 = 0
            int r4 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r4 > 0) goto L_0x02b5
        L_0x02da:
            long r6 = r6 + r12
            r12 = -1
            r14.compareAndSet(r12, r6)
            r10.removeCallbacks(r11)
            r1 = 2
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r1 = 0
            r6[r1] = r5
            long r10 = r14.get()
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r7 = 1
            r6[r7] = r1
            java.lang.String r1 = "%s lru clean done, current: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r6)
            long r6 = r14.get()
            r12 = r6
            goto L_0x0317
        L_0x02ff:
            r12 = -1
            java.lang.String r1 = "no temp file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x0317
        L_0x0307:
            r21 = r11
            r9 = r13
            r12 = -1
            java.lang.String r1 = "appDir not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x0317
        L_0x0312:
            r21 = r11
            r9 = r13
            r12 = -1
        L_0x0317:
            r6 = 0
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0332
            if (r2 != 0) goto L_0x0320
            goto L_0x0324
        L_0x0320:
            r6 = 1
            r2.f236568l = r6
        L_0x0324:
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager r28 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.f238916a
            r33 = 1
            java.lang.String r30 = "temp"
            r29 = r5
            r31 = r12
            r28.mo113690g(r29, r30, r31, r33)
        L_0x0332:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkAppDirTempFileLimit after:"
            r5.append(r6)
            if (r1 < 0) goto L_0x0340
            r11 = r12
            goto L_0x0342
        L_0x0340:
            r11 = r21
        L_0x0342:
            r5.append(r11)
            java.lang.String r1 = " cost "
            r5.append(r1)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r25
            r5.append(r6)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x0360
        L_0x035b:
            r9 = r13
            r2 = r27
            r27 = r10
        L_0x0360:
            com.tencent.mm.plugin.appbrand.appstorage.q$b r1 = com.tencent.p014mm.plugin.appbrand.appstorage.C81429q.f238972a
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager$CleanupTempFilesOnExitParams r5 = r0.f238953d
            long r5 = r5.f10873g
            r1.mo113750b(r5, r2)
            java.util.Collection r1 = r3.values()
            java.lang.String r2 = "key2ReportStruct.values"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0376:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0560
            java.lang.Object r2 = r1.next()
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct r2 = (com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "report "
            r3.append(r5)
            java.lang.String r5 = r2.mo1006q()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            r2.mo86054n()
            java.lang.String r3 = r2.f236565i
            r5 = r27
            boolean r3 = gy3.C87412m.m108589b(r5, r3)
            if (r3 != 0) goto L_0x03ba
            java.lang.String r3 = r2.f236565i
            r6 = r23
            boolean r3 = gy3.C87412m.m108589b(r6, r3)
            if (r3 == 0) goto L_0x03b3
            goto L_0x03bc
        L_0x03b3:
            r27 = r5
            r14 = 2
            r16 = 0
            goto L_0x055c
        L_0x03ba:
            r6 = r23
        L_0x03bc:
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager r3 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandStorageQuotaManager.f238916a
            long r7 = r2.f236571o
            r10 = 1
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x03b3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "report idkey[1654]  dir["
            r3.append(r7)
            java.lang.String r8 = r2.f236565i
            r3.append(r8)
            java.lang.String r8 = "]  fileOccupation["
            r3.append(r8)
            long r12 = r2.f236564h
            r3.append(r12)
            java.lang.String r8 = "] runtimeFileOccupation["
            r3.append(r8)
            long r12 = r2.f236570n
            r3.append(r12)
            r8 = 93
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            long r12 = r2.f236564h
            r27 = r5
            long r4 = r2.f236570n
            r3 = 1654(0x676, float:2.318E-42)
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x040d
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 0
            r2.mo175911u(r3, r4)
            r14 = 2
            r16 = 0
            goto L_0x0555
        L_0x040d:
            r4 = 0
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1
            r5.mo175911u(r3, r12)
            long r4 = r2.f236564h
            r16 = 0
            int r13 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x0554
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            rx3.l r5 = new rx3.l
            r18 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            java.lang.Double r13 = java.lang.Double.valueOf(r18)
            r14 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r5.<init>(r13, r8)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r13 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 4
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4617315517961601024(0x4014000000000000, double:5.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4621819117588971520(0x4024000000000000, double:10.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 6
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4626322717216342016(0x4034000000000000, double:20.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4629137466983448576(0x403e000000000000, double:30.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 8
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4632233691727265792(0x4049000000000000, double:50.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 9
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4634626229029306368(0x4051800000000000, double:70.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 10
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 11
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            rx3.l r5 = new rx3.l
            r19 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            java.lang.Double r8 = java.lang.Double.valueOf(r19)
            r15 = 12
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5.<init>(r8, r15)
            r4.add(r5)
            long r10 = r2.f236564h
            long r12 = r2.f236570n
            long r12 = r10 - r12
            float r5 = (float) r12
            float r8 = (float) r10
            float r5 = r5 / r8
            float r5 = java.lang.Math.abs(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0511:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0537
            java.lang.Object r8 = r4.next()
            rx3.l r8 = (rx3.C13604l) r8
            double r10 = (double) r5
            A r12 = r8.f38555d
            java.lang.Number r12 = (java.lang.Number) r12
            double r12 = r12.doubleValue()
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 > 0) goto L_0x0511
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            B r8 = r8.f38556e
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r4.mo175911u(r3, r8)
        L_0x0537:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r2 = r2.f236565i
            r4.append(r2)
            java.lang.String r2 = "] diffPercent "
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            goto L_0x0555
        L_0x0554:
            r14 = 2
        L_0x0555:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 13
            r2.mo175911u(r3, r4)
        L_0x055c:
            r23 = r6
            goto L_0x0376
        L_0x0560:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C81422o.run():void");
    }
}
