package com.tencent.p014mm.plugin.appbrand.ipc;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.d */
public final class C55465d {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r2 = (r2 = r2.getRunningTasks(1)).get(0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Intent m63113a(android.content.Context r5) {
        /*
            java.lang.String r0 = "MicroMsg.AppBrand.AppBrandLaunchMMSingleTaskUIHelper"
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r5, r1)
            r1 = 0
            java.lang.Class<android.app.ActivityManager> r2 = android.app.ActivityManager.class
            java.lang.Object r2 = p385u2.C111105a.m151502d(r5, r2)     // Catch:{ Exception -> 0x0077 }
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch:{ Exception -> 0x0077 }
            r3 = 0
            if (r2 == 0) goto L_0x0025
            r4 = 1
            java.util.List r2 = r2.getRunningTasks(r4)     // Catch:{ Exception -> 0x0077 }
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0077 }
            android.app.ActivityManager$RunningTaskInfo r2 = (android.app.ActivityManager.RunningTaskInfo) r2     // Catch:{ Exception -> 0x0077 }
            if (r2 == 0) goto L_0x0025
            android.content.ComponentName r2 = r2.baseActivity     // Catch:{ Exception -> 0x0077 }
            goto L_0x0026
        L_0x0025:
            r2 = r1
        L_0x0026:
            if (r2 != 0) goto L_0x0029
            return r1
        L_0x0029:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ Exception -> 0x0077 }
            if (r5 == 0) goto L_0x0041
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r5 = r5.getActivityInfo(r2, r4)     // Catch:{ Exception -> 0x0077 }
            if (r5 == 0) goto L_0x0041
            java.lang.String r5 = r5.taskAffinity     // Catch:{ Exception -> 0x0077 }
            if (r5 == 0) goto L_0x0041
            java.lang.String r4 = ".AppBrandUI"
            boolean r3 = z04.C112550d0.m153801u(r5, r4, r3)     // Catch:{ Exception -> 0x0077 }
        L_0x0041:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0077 }
            r5.<init>()     // Catch:{ Exception -> 0x0077 }
            java.lang.String r4 = "provideExtrasForSmoothBack, curStackBaseUI: "
            r5.append(r4)     // Catch:{ Exception -> 0x0077 }
            r5.append(r2)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r2 = ", curInAppBrandStack: "
            r5.append(r2)     // Catch:{ Exception -> 0x0077 }
            r5.append(r3)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0077 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ Exception -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            java.lang.String r5 = "provideExtrasForSmoothBack, provide"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ Exception -> 0x0077 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0077 }
            r5.<init>()     // Catch:{ Exception -> 0x0077 }
            r2 = 268468224(0x10008000, float:2.5342157E-29)
            r5.addFlags(r2)     // Catch:{ Exception -> 0x0077 }
            r1 = r5
            goto L_0x008c
        L_0x0071:
            java.lang.String r5 = "provideExtrasForSmoothBack, not need"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ Exception -> 0x0077 }
            goto L_0x008c
        L_0x0077:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "provideExtrasForSmoothBack fail since "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.ipc.C55465d.m63113a(android.content.Context):android.content.Intent");
    }
}
