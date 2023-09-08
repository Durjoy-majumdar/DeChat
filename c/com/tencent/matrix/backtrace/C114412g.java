package com.tencent.matrix.backtrace;

import com.tencent.matrix.backtrace.C114413h;

/* renamed from: com.tencent.matrix.backtrace.g */
public class C114412g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C114413h.C114415b f342976d;

    /* renamed from: e */
    public final /* synthetic */ C114413h f342977e;

    public C114412g(C114413h hVar, C114413h.C114415b bVar) {
        this.f342977e = hVar;
        this.f342976d = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            com.tencent.matrix.backtrace.h r0 = r11.f342977e
            com.tencent.matrix.backtrace.h$b r1 = r11.f342976d
            com.tencent.matrix.backtrace.k$d r2 = r0.f342982h
            int r2 = r2.ordinal()
            r3 = 0
            if (r2 == 0) goto L_0x008c
            r4 = 1
            if (r2 == r4) goto L_0x008c
            r5 = 2
            if (r2 == r5) goto L_0x0015
            goto L_0x00fe
        L_0x0015:
            int r1 = r1.ordinal()
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r2 = "Matrix.WarmUpScheduler"
            if (r1 == 0) goto L_0x006a
            if (r1 == r4) goto L_0x0047
            if (r1 == r5) goto L_0x0025
            goto L_0x00fe
        L_0x0025:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            long r8 = r0.f342983i
            long r8 = r8 / r6
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r1[r3] = r4
            java.lang.String r3 = "Schedule request consuming in %ss"
            p723vf.C118672d.m167353c(r2, r3, r1)
            android.os.Handler r1 = r0.f342980f
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            android.os.Message r2 = android.os.Message.obtain(r1, r5, r2)
            long r3 = r0.f342983i
            r1.sendMessageDelayed(r2, r3)
            goto L_0x00fe
        L_0x0047:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            long r4 = r0.f342983i
            long r4 = r4 / r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "Schedule clean-up in %ss"
            p723vf.C118672d.m167353c(r2, r3, r1)
            android.os.Handler r1 = r0.f342980f
            r2 = 3
            android.os.CancellationSignal r3 = new android.os.CancellationSignal
            r3.<init>()
            android.os.Message r2 = android.os.Message.obtain(r1, r2, r3)
            long r3 = r0.f342983i
            r1.sendMessageDelayed(r2, r3)
            goto L_0x00fe
        L_0x006a:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            long r8 = r0.f342983i
            long r8 = r8 / r6
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r1[r3] = r5
            java.lang.String r3 = "Schedule warm-up in %ss"
            p723vf.C118672d.m167353c(r2, r3, r1)
            android.os.Handler r1 = r0.f342980f
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            android.os.Message r2 = android.os.Message.obtain(r1, r4, r2)
            long r3 = r0.f342983i
            r1.sendMessageDelayed(r2, r3)
            goto L_0x00fe
        L_0x008c:
            android.content.Context r2 = r0.f342981g
            monitor-enter(r0)
            com.tencent.matrix.backtrace.h$a r4 = r0.f342978d     // Catch:{ all -> 0x0102 }
            if (r4 != 0) goto L_0x00e8
            com.tencent.matrix.backtrace.h$a r4 = new com.tencent.matrix.backtrace.h$a     // Catch:{ all -> 0x0102 }
            android.os.Handler r7 = r0.f342980f     // Catch:{ all -> 0x0102 }
            com.tencent.matrix.backtrace.k$d r8 = r0.f342982h     // Catch:{ all -> 0x0102 }
            long r9 = r0.f342983i     // Catch:{ all -> 0x0102 }
            r5 = r4
            r6 = r2
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0102 }
            r0.f342978d = r4     // Catch:{ all -> 0x0102 }
            monitor-enter(r4)     // Catch:{ all -> 0x0102 }
            java.util.Set<com.tencent.matrix.backtrace.h$b> r5 = r4.f342989f     // Catch:{ all -> 0x00e5 }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ all -> 0x00e5 }
            boolean r5 = r5.contains(r1)     // Catch:{ all -> 0x00e5 }
            if (r5 == 0) goto L_0x00af
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            goto L_0x00b7
        L_0x00af:
            java.util.Set<com.tencent.matrix.backtrace.h$b> r5 = r4.f342989f     // Catch:{ all -> 0x00e5 }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ all -> 0x00e5 }
            r5.add(r1)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
        L_0x00b7:
            java.lang.String r1 = "Matrix.WarmUpScheduler"
            java.lang.String r4 = "Register idle receiver."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0102 }
            p723vf.C118672d.m167353c(r1, r4, r3)     // Catch:{ all -> 0x0102 }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x0102 }
            r1.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r3 = "android.intent.action.SCREEN_ON"
            r1.addAction(r3)     // Catch:{ all -> 0x0102 }
            java.lang.String r3 = "android.intent.action.SCREEN_OFF"
            r1.addAction(r3)     // Catch:{ all -> 0x0102 }
            java.lang.String r3 = "android.intent.action.ACTION_POWER_CONNECTED"
            r1.addAction(r3)     // Catch:{ all -> 0x0102 }
            java.lang.String r3 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            r1.addAction(r3)     // Catch:{ all -> 0x0102 }
            com.tencent.matrix.backtrace.h$a r3 = r0.f342978d     // Catch:{ all -> 0x0102 }
            r2.registerReceiver(r3, r1)     // Catch:{ all -> 0x0102 }
            com.tencent.matrix.backtrace.h$a r1 = r0.f342978d     // Catch:{ all -> 0x0102 }
            r1.mo173586a(r2)     // Catch:{ all -> 0x0102 }
            monitor-exit(r0)
            goto L_0x00fe
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            throw r1     // Catch:{ all -> 0x0102 }
        L_0x00e8:
            monitor-enter(r4)     // Catch:{ all -> 0x0102 }
            java.util.Set<com.tencent.matrix.backtrace.h$b> r2 = r4.f342989f     // Catch:{ all -> 0x00ff }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x00ff }
            boolean r2 = r2.contains(r1)     // Catch:{ all -> 0x00ff }
            if (r2 == 0) goto L_0x00f5
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            goto L_0x00fd
        L_0x00f5:
            java.util.Set<com.tencent.matrix.backtrace.h$b> r2 = r4.f342989f     // Catch:{ all -> 0x00ff }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x00ff }
            r2.add(r1)     // Catch:{ all -> 0x00ff }
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
        L_0x00fd:
            monitor-exit(r0)
        L_0x00fe:
            return
        L_0x00ff:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0102 }
            throw r1     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.backtrace.C114412g.run():void");
    }
}
