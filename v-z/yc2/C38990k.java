package yc2;

/* renamed from: yc2.k */
public final class C38990k {

    /* renamed from: a */
    public static boolean f105043a;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        f105043a = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", false, java.lang.Long.valueOf(java.lang.System.nanoTime() - r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", java.lang.Boolean.valueOf(f105043a), java.lang.Long.valueOf(java.lang.System.nanoTime() - r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0091, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x005f */
    static {
        /*
            java.lang.String r0 = "QSDT, result: %b, time: %d ns"
            java.lang.String r1 = "MicroMsg.NormalMsgSource.QSDTH"
            long r2 = java.lang.System.nanoTime()
            r4 = 2
            r5 = 1
            r6 = 0
            f105043a = r6     // Catch:{ all -> 0x005f }
            java.lang.Class<android.app.ActivityManager$RecentTaskInfo> r7 = android.app.ActivityManager.RecentTaskInfo.class
            java.lang.String r8 = "instanceId"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ all -> 0x005f }
            r7.setAccessible(r5)     // Catch:{ all -> 0x005f }
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x005f }
            android.content.Context r8 = r8.getApplicationContext()     // Catch:{ all -> 0x005f }
            java.lang.String r9 = "activity"
            java.lang.Object r8 = r8.getSystemService(r9)     // Catch:{ all -> 0x005f }
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8     // Catch:{ all -> 0x005f }
            java.util.List r8 = r8.getRecentTasks(r5, r4)     // Catch:{ all -> 0x005f }
            if (r8 == 0) goto L_0x0044
            int r9 = r8.size()     // Catch:{ all -> 0x005f }
            if (r9 != 0) goto L_0x0035
            goto L_0x0044
        L_0x0035:
            java.lang.Object r8 = r8.get(r6)     // Catch:{ all -> 0x005f }
            android.app.ActivityManager$RecentTaskInfo r8 = (android.app.ActivityManager.RecentTaskInfo) r8     // Catch:{ all -> 0x005f }
            int r7 = r7.getInt(r8)     // Catch:{ all -> 0x005f }
            if (r7 <= 0) goto L_0x0046
            f105043a = r5     // Catch:{ all -> 0x005f }
            goto L_0x0046
        L_0x0044:
            f105043a = r6     // Catch:{ all -> 0x005f }
        L_0x0046:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r7 = f105043a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r4[r6] = r7
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r4[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r4)
            goto L_0x0077
        L_0x005f:
            f105043a = r6     // Catch:{ all -> 0x0078 }
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r4[r6] = r7
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r4[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r4)
        L_0x0077:
            return
        L_0x0078:
            r7 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r8 = f105043a
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4[r6] = r8
            long r8 = java.lang.System.nanoTime()
            long r8 = r8 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r4[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yc2.C38990k.<clinit>():void");
    }
}
