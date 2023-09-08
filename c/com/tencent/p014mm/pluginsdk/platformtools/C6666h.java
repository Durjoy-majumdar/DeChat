package com.tencent.p014mm.pluginsdk.platformtools;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mm.pluginsdk.platformtools.h */
public class C6666h {

    /* renamed from: a */
    public static final Map<String, String> f23998a = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6946a(android.content.Context r5) {
        /*
            java.lang.String r5 = m6947b(r5)
            r0 = 0
            if (r5 == 0) goto L_0x00a2
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r2 = r1.getPath()
            r3 = 0
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r3, r3)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x002c
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r2)
            android.net.Uri r1 = r1.build()
        L_0x002c:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r2.mo177799l(r1, r0)
            boolean r2 = r1.mo177810a()
            if (r2 != 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            com.tencent.mm.vfs.FileSystem$c r2 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            boolean r3 = r2.mo119948x(r1)
        L_0x0041:
            if (r3 != 0) goto L_0x0044
            goto L_0x00a2
        L_0x0044:
            java.util.Map<java.lang.String, java.lang.String> r1 = f23998a
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            boolean r3 = r2.containsKey(r5)
            if (r3 == 0) goto L_0x0057
            java.lang.Object r5 = r2.get(r5)
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00a2
        L_0x0057:
            monitor-enter(r1)
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x009f }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x006d
            r0 = r1
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x009f }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x009f }
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x009f }
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            goto L_0x00a2
        L_0x006d:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x009f }
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch:{ all -> 0x009f }
            int r2 = r2.targetSdkVersion     // Catch:{ all -> 0x009f }
            r3 = 29
            if (r2 > r3) goto L_0x0087
            vg.a r2 = p1054vg.C90793a.m113861b(r5)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0087
            vg.b r2 = r2.f260724b     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0087
            java.lang.String r0 = r2.f260727d     // Catch:{ all -> 0x009f }
        L_0x0087:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0091
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)     // Catch:{ all -> 0x009f }
        L_0x0091:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x009d
            r2 = r1
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x009f }
            r2.put(r5, r0)     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            goto L_0x00a2
        L_0x009f:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            throw r5
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.platformtools.C6666h.m6946a(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    public static String m6947b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.UpdateUtil", e, "", new Object[0]);
            return null;
        }
    }
}
