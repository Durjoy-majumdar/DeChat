package io0;

import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;

public final /* synthetic */ class g$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83127a f254144d;

    public /* synthetic */ g$$b(C83127a aVar) {
        this.f254144d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.a r0 = r9.f254144d
            boolean r1 = r0.f242927g
            java.lang.String r2 = r0.f242924d
            java.lang.String r3 = "startVOIPOnCallIdle, hasStopOnCallBusy: %b"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r7 = 0
            r5[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
            if (r1 != 0) goto L_0x0019
            goto L_0x0065
        L_0x0019:
            r0.f242927g = r7
            monitor-enter(r0)
            yc.t r1 = r0.f242929i     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0022
            monitor-exit(r0)
            goto L_0x0065
        L_0x0022:
            java.lang.String r1 = r0.f242924d     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "startVOIPIfForeground, LivePusher:%s"
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0066 }
            yc.t r5 = r0.f242929i     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = r5.mo109508b()     // Catch:{ all -> 0x0066 }
            r3[r7] = r5     // Catch:{ all -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x0066 }
            yc.t r1 = r0.f242929i     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.mo109507a()     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0064
            java.util.Set<yc.t> r1 = r0.f242930j     // Catch:{ all -> 0x0066 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0066 }
        L_0x0042:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0066 }
            yc.t r2 = (p1066yc.C91424t) r2     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x0042
            java.lang.String r3 = r0.f242924d     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = "startVOIPIfForeground, LivePlayer:%s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0066 }
            java.lang.String r8 = r2.mo109508b()     // Catch:{ all -> 0x0066 }
            r6[r7] = r8     // Catch:{ all -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r6)     // Catch:{ all -> 0x0066 }
            r2.mo109507a()     // Catch:{ all -> 0x0066 }
            goto L_0x0042
        L_0x0064:
            monitor-exit(r0)
        L_0x0065:
            return
        L_0x0066:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io0.g$$b.run():void");
    }
}
