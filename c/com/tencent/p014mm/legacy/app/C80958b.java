package com.tencent.p014mm.legacy.app;

import android.app.Application;

/* renamed from: com.tencent.mm.legacy.app.b */
public class C80958b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Application f237817d;

    public C80958b(Application application) {
        this.f237817d = application;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r7 = this;
            java.lang.Class<com.tencent.mm.legacy.app.a> r0 = com.tencent.p014mm.legacy.app.C80952a.class
            monitor-enter(r0)
            boolean r1 = com.tencent.p014mm.legacy.app.C80952a.m98837c()     // Catch:{ all -> 0x009e }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0044
            java.lang.String r1 = "MicroMsg.AccidentallyQuitMonitor"
            java.lang.String r4 = "[+] Process [%s] was quit normally last time, skip report."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x009e }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x009e }
            r2[r3] = r5     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r2)     // Catch:{ all -> 0x009e }
            monitor-enter(r0)     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.legacy.app.C80952a.f237812c = r3     // Catch:{ all -> 0x0041 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.legacy.app.C80952a.m98836b()     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "kLastCallOnStartClientVersion"
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch:{ all -> 0x0041 }
            r1.commit()     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            monitor-enter(r0)     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.legacy.app.C80952a.f237813d = r3     // Catch:{ all -> 0x003e }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.legacy.app.C80952a.m98836b()     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "kLastCallOnStopClientVersion"
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch:{ all -> 0x003e }
            r1.commit()     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            monitor-exit(r0)
            goto L_0x0093
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            throw r1     // Catch:{ all -> 0x009e }
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            throw r1     // Catch:{ all -> 0x009e }
        L_0x0044:
            monitor-enter(r0)     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.legacy.app.C80952a.f237812c = r3     // Catch:{ all -> 0x009b }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.legacy.app.C80952a.m98836b()     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "kLastCallOnStartClientVersion"
            android.content.SharedPreferences$Editor r1 = r1.remove(r4)     // Catch:{ all -> 0x009b }
            r1.commit()     // Catch:{ all -> 0x009b }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "MicroMsg.AccidentallyQuitMonitor"
            java.lang.String r4 = "[!] Process [%s] was quit accidentally last time, try to report it."
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x009e }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x009e }
            r5[r3] = r6     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r4, r5)     // Catch:{ all -> 0x009e }
            java.util.List<com.tencent.mm.legacy.app.a$e> r1 = com.tencent.p014mm.legacy.app.C80952a.f237815f     // Catch:{ all -> 0x009e }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x009e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x009e }
        L_0x006c:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x009e }
            com.tencent.mm.legacy.app.a$e r4 = (com.tencent.p014mm.legacy.app.C80952a.C80957e) r4     // Catch:{ all -> 0x009e }
            boolean r5 = r4.mo112732a()     // Catch:{ all -> 0x009e }
            if (r5 == 0) goto L_0x006c
            r4.mo112733b()     // Catch:{ all -> 0x009e }
            monitor-exit(r0)
            goto L_0x0093
        L_0x0083:
            java.lang.String r1 = "MicroMsg.AccidentallyQuitMonitor"
            java.lang.String r4 = "[!] Process [%s] was quit accidentally last time and not handled by any handlers ！！"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x009e }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x009e }
            r2[r3] = r5     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r4, r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r0)
        L_0x0093:
            android.app.Application r0 = r7.f237817d
            android.app.Application$ActivityLifecycleCallbacks r1 = com.tencent.p014mm.legacy.app.C80952a.f237816g
            r0.registerActivityLifecycleCallbacks(r1)
            return
        L_0x009b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.legacy.app.C80958b.run():void");
    }
}
