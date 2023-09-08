package com.tencent.p014mm.plugin.magicbrush.p074fs;

import com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.f */
public final class C85263f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MagicBrushStorageQuotaManager.CleanupTempFilesOnMBBIzExitParams f248416d;

    public C85263f(MagicBrushStorageQuotaManager.CleanupTempFilesOnMBBIzExitParams cleanupTempFilesOnMBBIzExitParams) {
        this.f248416d = cleanupTempFilesOnMBBIzExitParams;
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0368  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r0 = r30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[mm]start check: bizName["
            r1.append(r2)
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams r2 = r0.f248416d
            java.lang.String r2 = r2.f19956d
            r1.append(r2)
            java.lang.String r2 = "] minTemp["
            r1.append(r2)
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams r2 = r0.f248416d
            long r2 = r2.f19957e
            r1.append(r2)
            java.lang.String r2 = "] maxTemp["
            r1.append(r2)
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams r2 = r0.f248416d
            long r2 = r2.f19958f
            r1.append(r2)
            java.lang.String r2 = "] maxTotal["
            r1.append(r2)
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams r2 = r0.f248416d
            long r2 = r2.f19959g
            r1.append(r2)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.MagicBrushStorageQuotaManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams r1 = r0.f248416d
            java.lang.String r2 = r1.f19956d
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.f19960h
            java.lang.String r3 = "bizName"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.String r4 = "storageKey2Path"
            gy3.C87412m.m108594g(r1, r4)
            java.util.Set r5 = r1.keySet()
            java.lang.String r6 = "storageKey2Path.keys"
            gy3.C87412m.m108593f(r5, r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x0064:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0092
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager r8 = com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager.f248404a
            java.lang.String r9 = "it"
            gy3.C87412m.m108593f(r6, r9)
            java.lang.String r9 = "-"
            java.lang.String r9 = z04.C112550d0.m153791a0(r6, r9, r6)
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
            if (r6 != 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r7 = r6
        L_0x008b:
            r10.<init>((java.lang.String) r7)
            r8.mo118418a(r2, r9, r10)
            goto L_0x0064
        L_0x0092:
            com.tencent.mm.plugin.magicbrush.fs.g$c r1 = com.tencent.p014mm.plugin.magicbrush.p074fs.C85264g.f248417a
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams r2 = r0.f248416d
            java.lang.String r9 = r2.f19956d
            long r5 = r2.f19957e
            long r10 = r2.f19958f
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r2.f19960h
            gy3.C87412m.m108594g(r9, r3)
            gy3.C87412m.m108594g(r2, r4)
            long r3 = java.lang.System.currentTimeMillis()
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            java.lang.String r13 = "-temp"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Object r2 = r2.get(r12)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r7 = r2
        L_0x00c5:
            r8.<init>((java.lang.String) r7)
            boolean r2 = r8.mo119967g()
            java.lang.String r7 = "get magic path fail,not login"
            java.lang.String r15 = "MicroMsg.MagicBrushTempFileCleaner"
            java.lang.String r13 = "temp"
            r17 = 0
            if (r2 == 0) goto L_0x02a0
            boolean r2 = r8.mo119977o()
            if (r2 == 0) goto L_0x02a0
            java.lang.String r2 = r8.mo119971i()
            java.lang.String r8 = "bizDir.absolutePath"
            gy3.C87412m.m108593f(r2, r8)
            boolean r2 = r1.mo118429a(r2)
            if (r2 == 0) goto L_0x00ee
            goto L_0x02a0
        L_0x00ee:
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager r2 = com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager.f248404a
            r20 = r15
            long r14 = r2.mo118420c(r9, r13)
            r2 = r13
            long r12 = r10 - r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r23 = r2
            java.lang.String r2 = "checkMagicDirTempFileLimit current:"
            r8.append(r2)
            r8.append(r14)
            java.lang.String r2 = " min:"
            r8.append(r2)
            r8.append(r5)
            java.lang.String r2 = " max:"
            r8.append(r2)
            r8.append(r10)
            java.lang.String r2 = " limit:"
            r8.append(r2)
            r8.append(r12)
            java.lang.String r2 = r8.toString()
            r5 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6 = 0
            r2[r6] = r9
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r8 = 1
            r2[r8] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r8 = 2
            r2[r8] = r6
            java.lang.String r6 = "lruPruneMagicDirTempFiles %s %d %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r2)
            java.lang.String r2 = i52.C33209f.m39985a()
            r10 = -1
            if (r2 != 0) goto L_0x014f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            goto L_0x024f
        L_0x014f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r9)
            r2 = 47
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 != 0) goto L_0x024f
            int r6 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x024f
            boolean r1 = r1.mo118429a(r2)
            if (r1 == 0) goto L_0x0175
            goto L_0x024f
        L_0x0175:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r2)
            boolean r6 = r1.mo119967g()
            if (r6 == 0) goto L_0x0242
            boolean r6 = r1.mo119977o()
            if (r6 != 0) goto L_0x0188
            goto L_0x0242
        L_0x0188:
            java.util.concurrent.atomic.AtomicLong r6 = new java.util.concurrent.atomic.AtomicLong
            r6.<init>(r10)
            com.tencent.mm.sdk.platformtools.MMHandler r8 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r8.<init>((android.os.Looper) r10)
            com.tencent.mm.plugin.magicbrush.fs.i r10 = new com.tencent.mm.plugin.magicbrush.fs.i
            r10.<init>(r9, r2, r6)
            r26 = r3
            r2 = 180000(0x2bf20, double:8.8932E-319)
            r8.postDelayed(r10, r2)
            com.tencent.mm.vfs.o1 r2 = com.tencent.p014mm.plugin.magicbrush.p074fs.C85264g.f248419c
            com.tencent.mm.vfs.m1[] r1 = r1.mo119985v(r2)
            if (r1 == 0) goto L_0x0233
            int r2 = r1.length
            if (r2 != 0) goto L_0x01b0
            r2 = 1
            goto L_0x01b1
        L_0x01b0:
            r2 = 0
        L_0x01b1:
            if (r2 == 0) goto L_0x01b5
            goto L_0x0233
        L_0x01b5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "lruPruneMagicDirTempFiles listFiles done: "
            r2.append(r3)
            int r3 = r1.length
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            long r2 = r14 - r12
            com.tencent.mm.plugin.magicbrush.fs.h<T> r4 = com.tencent.p014mm.plugin.magicbrush.p074fs.C30191h.f81607d     // Catch:{ IllegalArgumentException -> 0x01d1 }
            java.util.Arrays.sort(r1, r4)     // Catch:{ IllegalArgumentException -> 0x01d1 }
        L_0x01d1:
            java.lang.String r4 = "lruPruneMagicDirTempFiles sort done"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.util.Iterator r1 = gy3.C32617c.m39769a(r1)
        L_0x01da:
            r4 = r1
            gy3.b r4 = (gy3.C32616b) r4
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x01fd
            java.lang.Object r4 = r4.next()
            com.tencent.mm.vfs.m1 r4 = (com.tencent.p014mm.vfs.C86009m1) r4
            java.lang.String r11 = r4.mo119971i()
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106447h(r11)
            if (r11 == 0) goto L_0x01f9
            long r28 = r4.mo119980r()
            long r2 = r2 - r28
        L_0x01f9:
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 > 0) goto L_0x01da
        L_0x01fd:
            long r12 = r12 + r2
            r1 = -1
            r6.compareAndSet(r1, r12)
            r8.removeCallbacks(r10)
            r3 = 2
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r4 = 0
            r1[r4] = r9
            long r10 = r6.get()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r13 = 1
            r1[r13] = r2
            java.lang.String r2 = "%s lru clean done, current: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            java.lang.Class<com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor> r1 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor r1 = (com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor) r1
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key r2 = com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor.Key.MagicTempFileClearCount
            java.lang.String r2 = r2.name()
            r11 = 0
            r1.Ov0(r2, r13, r11)
            long r1 = r6.get()
            goto L_0x0256
        L_0x0233:
            r1 = -1
            r3 = 2
            r4 = 0
            r11 = 0
            r13 = 1
            java.lang.String r6 = "no temp file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r8.removeCallbacks(r10)
            goto L_0x0256
        L_0x0242:
            r26 = r3
            r1 = r10
            r3 = 2
            r4 = 0
            r11 = 0
            r13 = 1
            java.lang.String r6 = "bizDir not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x0256
        L_0x024f:
            r26 = r3
            r1 = r10
            r3 = 2
            r4 = 0
            r11 = 0
            r13 = 1
        L_0x0256:
            int r6 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r6 < 0) goto L_0x0270
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager r8 = com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager.f248404a
            r16 = 1
            java.lang.String r10 = "temp"
            r3 = r11
            r19 = r14
            r14 = 2
            r11 = r1
            r15 = r23
            r21 = 1
            r13 = r16
            r8.mo118421d(r9, r10, r11, r13)
            goto L_0x0278
        L_0x0270:
            r3 = r11
            r19 = r14
            r15 = r23
            r14 = 2
            r21 = 1
        L_0x0278:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "checkMagicDirTempFileLimit after:"
            r8.append(r9)
            if (r6 < 0) goto L_0x0285
            goto L_0x0287
        L_0x0285:
            r1 = r19
        L_0x0287:
            r8.append(r1)
            java.lang.String r1 = " cost "
            r8.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r26
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            goto L_0x02a7
        L_0x02a0:
            r5 = r15
            r3 = 0
            r4 = 0
            r14 = 2
            r21 = 1
            r15 = r13
        L_0x02a7:
            com.tencent.mm.plugin.magicbrush.fs.g$c r1 = com.tencent.p014mm.plugin.magicbrush.p074fs.C85264g.f248417a
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams r1 = r0.f248416d
            long r1 = r1.f19959g
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = i52.C33209f.m39985a()
            if (r6 != 0) goto L_0x02bf
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            r6 = r3
            r3 = r17
            goto L_0x0339
        L_0x02bf:
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
            r10.<init>((java.lang.String) r6)
            com.tencent.mm.vfs.m1[] r6 = r10.mo119984u()
            if (r6 == 0) goto L_0x0334
            int r10 = r6.length
            r19 = r17
            r12 = 0
        L_0x02ce:
            if (r12 >= r10) goto L_0x0332
            r11 = r6[r12]
            java.lang.String r13 = r11.getName()
            java.lang.String r3 = "it.name"
            gy3.C87412m.m108593f(r13, r3)
            java.lang.String r0 = ".nomedia"
            r22 = r6
            r6 = 0
            boolean r0 = z04.C112551y.m153808h(r13, r0, r4, r14, r6)
            if (r0 != 0) goto L_0x0328
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager r0 = com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager.f248404a
            java.lang.String r13 = r11.getName()
            gy3.C87412m.m108593f(r13, r3)
            java.lang.Class<com.tencent.mm.plugin.magicbrush.k0> r16 = com.tencent.p014mm.plugin.magicbrush.C30204k0.class
            di3.d r16 = di3.C86312j.m106911c(r16)
            r4 = r16
            com.tencent.mm.plugin.magicbrush.k0 r4 = (com.tencent.p014mm.plugin.magicbrush.C30204k0) r4
            java.lang.String r14 = "MagicStorageQuota"
            d42.j r4 = r4.wt0(r14, r6)
            if (r4 == 0) goto L_0x030c
            java.lang.String r14 = "storage_size_temp"
            boolean r4 = r4.mo57965c(r13, r14)
            if (r4 == 0) goto L_0x030c
            r4 = 1
            goto L_0x030d
        L_0x030c:
            r4 = 0
        L_0x030d:
            if (r4 == 0) goto L_0x031b
            java.lang.String r4 = r11.getName()
            gy3.C87412m.m108593f(r4, r3)
            long r3 = r0.mo118420c(r4, r15)
            goto L_0x0326
        L_0x031b:
            java.lang.String r4 = r11.getName()
            gy3.C87412m.m108593f(r4, r3)
            long r3 = r0.mo118418a(r4, r15, r11)
        L_0x0326:
            long r19 = r19 + r3
        L_0x0328:
            int r12 = r12 + 1
            r0 = r30
            r3 = r6
            r6 = r22
            r4 = 0
            r14 = 2
            goto L_0x02ce
        L_0x0332:
            r6 = r3
            goto L_0x0337
        L_0x0334:
            r6 = r3
            r19 = r17
        L_0x0337:
            r3 = r19
        L_0x0339:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "checkTotalTempFileLimit current: "
            r0.append(r10)
            r0.append(r3)
            java.lang.String r10 = " max: "
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = " cost:"
            r0.append(r10)
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0368
            goto L_0x0477
        L_0x0368:
            r0 = 2
            long r10 = (long) r0
            long r1 = r1 / r10
            long r3 = r3 - r1
            java.util.List<java.lang.String> r0 = q52.C35765d.f95533c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0374:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x045e
            java.lang.Object r10 = r0.next()
            java.lang.String r10 = (java.lang.String) r10
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r11)
            java.lang.String r11 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            gy3.C87412m.m108593f(r10, r11)
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager r11 = com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager.f248404a
            long r11 = r11.mo118420c(r10, r15)
            int r13 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r13 <= 0) goto L_0x043d
            java.lang.String r13 = i52.C33209f.m39985a()
            if (r13 != 0) goto L_0x03a1
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            goto L_0x045e
        L_0x03a1:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r10)
            r13 = 47
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            com.tencent.mm.plugin.magicbrush.fs.g$c r6 = com.tencent.p014mm.plugin.magicbrush.p074fs.C85264g.f248417a
            com.tencent.mm.vfs.m1 r13 = new com.tencent.mm.vfs.m1
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r13.<init>((java.lang.String) r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r19 = r0
            java.lang.String r0 = "pruneMagicDirTempFiles "
            r14.append(r0)
            java.lang.String r0 = r13.mo119971i()
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            boolean r0 = r13.mo119967g()
            if (r0 == 0) goto L_0x043b
            boolean r0 = r13.mo119977o()
            if (r0 == 0) goto L_0x043b
            java.lang.String r0 = r13.mo119971i()
            java.lang.String r14 = "dir.absolutePath"
            gy3.C87412m.m108593f(r0, r14)
            boolean r0 = r6.mo118429a(r0)
            if (r0 == 0) goto L_0x03f7
            goto L_0x043b
        L_0x03f7:
            com.tencent.mm.vfs.o1 r0 = com.tencent.p014mm.plugin.magicbrush.p074fs.C85264g.f248419c
            com.tencent.mm.vfs.m1[] r0 = r13.mo119985v(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "pruneMagicDirTempFiles listFile done:"
            r6.append(r13)
            if (r0 == 0) goto L_0x0410
            int r13 = r0.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x0411
        L_0x0410:
            r13 = 0
        L_0x0411:
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            if (r0 == 0) goto L_0x042d
            int r6 = r0.length
            r13 = 0
        L_0x041f:
            if (r13 >= r6) goto L_0x042d
            r14 = r0[r13]
            java.lang.String r14 = r14.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r14)
            int r13 = r13 + 1
            goto L_0x041f
        L_0x042d:
            com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager r24 = com.tencent.p014mm.plugin.magicbrush.p074fs.MagicBrushStorageQuotaManager.f248404a
            r27 = 0
            r29 = 1
            java.lang.String r26 = "temp"
            r25 = r10
            r24.mo118421d(r25, r26, r27, r29)
        L_0x043b:
            long r3 = r3 - r11
            goto L_0x043f
        L_0x043d:
            r19 = r0
        L_0x043f:
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x0459
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "allMagicDir clean done, nowSize:"
            r0.append(r6)
            long r10 = r1 + r3
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0459:
            r0 = r19
            r6 = 0
            goto L_0x0374
        L_0x045e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkTotalTempFileLimit cost "
            r0.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r8
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0477:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.magicbrush.p074fs.C85263f.run():void");
    }
}
