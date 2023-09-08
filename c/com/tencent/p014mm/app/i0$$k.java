package com.tencent.p014mm.app;

import android.os.FileObserver;

/* renamed from: com.tencent.mm.app.i0$$k */
public class i0$$k extends FileObserver {

    /* renamed from: a */
    public final /* synthetic */ C80600i0 f235814a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0$$k(C80600i0 i0Var, String str) {
        super(str, 712);
        this.f235814a = i0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r6 != 512) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(int r6, java.lang.String r7) {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.app.i0 r2 = r5.f235814a
            long r2 = r2.f235803a
            long r0 = r0 - r2
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0016
            return
        L_0x0016:
            com.tencent.mm.app.i0 r0 = r5.f235814a
            java.util.HashSet<java.lang.String> r0 = r0.f235804b
            monitor-enter(r0)
            r1 = 8
            if (r6 == r1) goto L_0x0034
            r1 = 64
            if (r6 == r1) goto L_0x002c
            r1 = 128(0x80, float:1.794E-43)
            if (r6 == r1) goto L_0x006a
            r1 = 512(0x200, float:7.175E-43)
            if (r6 == r1) goto L_0x002c
            goto L_0x0071
        L_0x002c:
            com.tencent.mm.app.i0 r6 = r5.f235814a     // Catch:{ all -> 0x0073 }
            java.util.HashSet<java.lang.String> r6 = r6.f235804b     // Catch:{ all -> 0x0073 }
            r6.remove(r7)     // Catch:{ all -> 0x0073 }
            goto L_0x0071
        L_0x0034:
            java.lang.String r6 = "MicroMsg.MMCrashReporter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r1.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = "Detected trace file changed: "
            r1.append(r2)     // Catch:{ all -> 0x0073 }
            r1.append(r7)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)     // Catch:{ all -> 0x0073 }
            com.tencent.mm.app.i0 r6 = r5.f235814a     // Catch:{ all -> 0x0073 }
            android.os.ConditionVariable r6 = r6.f235807e     // Catch:{ all -> 0x0073 }
            r6.open()     // Catch:{ all -> 0x0073 }
            com.tencent.mm.app.i0 r6 = r5.f235814a     // Catch:{ all -> 0x0073 }
            com.tencent.mm.app.i0$$l r6 = r6.f235810h     // Catch:{ all -> 0x0073 }
            if (r6 != 0) goto L_0x006a
            com.tencent.mm.app.i0 r6 = r5.f235814a     // Catch:{ all -> 0x0073 }
            com.tencent.mm.app.i0$$l r1 = new com.tencent.mm.app.i0$$l     // Catch:{ all -> 0x0073 }
            r2 = 0
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0073 }
            r6.f235810h = r1     // Catch:{ all -> 0x0073 }
            com.tencent.mm.app.i0 r6 = r5.f235814a     // Catch:{ all -> 0x0073 }
            com.tencent.mm.app.i0$$l r6 = r6.f235810h     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = "MMCrashReporter_parseANRTrace"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r6, r1)     // Catch:{ all -> 0x0073 }
        L_0x006a:
            com.tencent.mm.app.i0 r6 = r5.f235814a     // Catch:{ all -> 0x0073 }
            java.util.HashSet<java.lang.String> r6 = r6.f235804b     // Catch:{ all -> 0x0073 }
            r6.add(r7)     // Catch:{ all -> 0x0073 }
        L_0x0071:
            monitor-exit(r0)     // Catch:{ all -> 0x0073 }
            return
        L_0x0073:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0073 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.i0$$k.onEvent(int, java.lang.String):void");
    }
}
