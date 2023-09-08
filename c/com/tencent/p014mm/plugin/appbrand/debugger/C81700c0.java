package com.tencent.p014mm.plugin.appbrand.debugger;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.c0 */
public class C81700c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81695a0 f239793d;

    public C81700c0(C81695a0 a0Var) {
        this.f239793d = a0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r0.f239778b.f239895q.size() <= 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r1 = r0.f239778b.f239895q.get(0);
        r1.getClass();
        r1.f239923a = java.lang.System.currentTimeMillis();
        r3.add(r1);
        r0.mo114053i(r3, false, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        r8 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            com.tencent.mm.plugin.appbrand.debugger.a0 r0 = r13.f239793d
            com.tencent.mm.plugin.appbrand.debugger.t r0 = r0.f239778b
            boolean r0 = r0.mo114111c()
            if (r0 == 0) goto L_0x0095
            com.tencent.mm.plugin.appbrand.debugger.a0 r0 = r13.f239793d
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0092 }
            long r3 = r0.f239785i     // Catch:{ all -> 0x0092 }
            long r3 = r1 - r3
            int r5 = r0.f239784h     // Catch:{ all -> 0x0092 }
            long r6 = (long) r5
            r8 = 0
            r9 = 1
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0020
            monitor-exit(r0)
            goto L_0x0087
        L_0x0020:
            r0.f239785i = r1     // Catch:{ all -> 0x0092 }
            r3 = 5000(0x1388, float:7.006E-42)
            if (r5 >= r3) goto L_0x002b
            int r5 = r5 + 1000
            r0.f239784h = r5     // Catch:{ all -> 0x0092 }
            goto L_0x002f
        L_0x002b:
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.f239784h = r3     // Catch:{ all -> 0x0092 }
        L_0x002f:
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ all -> 0x0092 }
            r3.<init>()     // Catch:{ all -> 0x0092 }
            com.tencent.mm.plugin.appbrand.debugger.t r4 = r0.f239778b     // Catch:{ all -> 0x0092 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.debugger.x> r4 = r4.f239895q     // Catch:{ all -> 0x0092 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0092 }
        L_0x003c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0092 }
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0092 }
            com.tencent.mm.plugin.appbrand.debugger.x r5 = (com.tencent.p014mm.plugin.appbrand.debugger.C81750x) r5     // Catch:{ all -> 0x0092 }
            long r6 = r5.f239923a     // Catch:{ all -> 0x0092 }
            long r6 = r1 - r6
            r10 = 5000(0x1388, double:2.4703E-320)
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x003c
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0092 }
            r5.f239923a = r1     // Catch:{ all -> 0x0092 }
            r3.add(r5)     // Catch:{ all -> 0x0092 }
            r0.mo114053i(r3, r8, r9)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)
            goto L_0x0084
        L_0x0060:
            com.tencent.mm.plugin.appbrand.debugger.t r1 = r0.f239778b     // Catch:{ all -> 0x0092 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.debugger.x> r1 = r1.f239895q     // Catch:{ all -> 0x0092 }
            int r1 = r1.size()     // Catch:{ all -> 0x0092 }
            if (r1 <= 0) goto L_0x0086
            com.tencent.mm.plugin.appbrand.debugger.t r1 = r0.f239778b     // Catch:{ all -> 0x0092 }
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.debugger.x> r1 = r1.f239895q     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0092 }
            com.tencent.mm.plugin.appbrand.debugger.x r1 = (com.tencent.p014mm.plugin.appbrand.debugger.C81750x) r1     // Catch:{ all -> 0x0092 }
            r1.getClass()     // Catch:{ all -> 0x0092 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0092 }
            r1.f239923a = r4     // Catch:{ all -> 0x0092 }
            r3.add(r1)     // Catch:{ all -> 0x0092 }
            r0.mo114053i(r3, r8, r9)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)
        L_0x0084:
            r8 = 1
            goto L_0x0087
        L_0x0086:
            monitor-exit(r0)
        L_0x0087:
            if (r8 == 0) goto L_0x0095
            java.lang.String r0 = "MicroMsg.RemoteDebugMsgMrg"
            java.lang.String r1 = "testServer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x00e9
        L_0x0092:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0095:
            com.tencent.mm.plugin.appbrand.debugger.a0 r0 = r13.f239793d
            r0.mo114055k()
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.appbrand.debugger.a0 r2 = r13.f239793d
            com.tencent.mm.plugin.appbrand.debugger.t r3 = r2.f239778b
            long r3 = r3.f239889k
            long r3 = r0 - r3
            r5 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00c8
            te3.cx4 r3 = new te3.cx4
            r3.<init>()
            com.tencent.mm.plugin.appbrand.debugger.t r4 = r2.f239778b
            te3.dw4 r5 = r4.f239880b
            r3.f132015d = r5
            int r4 = r4.mo114109a()
            r3.f132016e = r4
            r4 = 1001(0x3e9, float:1.403E-42)
            te3.lw4 r3 = com.tencent.p014mm.plugin.appbrand.debugger.C81738h0.m100295a(r4, r3)
            com.tencent.mm.plugin.appbrand.debugger.g0 r2 = r2.f239777a
            r2.mo114101b(r3)
        L_0x00c8:
            com.tencent.mm.plugin.appbrand.debugger.a0 r2 = r13.f239793d
            com.tencent.mm.plugin.appbrand.debugger.t r2 = r2.f239778b
            boolean r2 = r2.mo114112d()
            if (r2 == 0) goto L_0x00e9
            com.tencent.mm.plugin.appbrand.debugger.a0 r2 = r13.f239793d
            com.tencent.mm.plugin.appbrand.debugger.t r3 = r2.f239778b
            long r4 = r3.f239890l
            long r0 = r0 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x00e9
            int r0 = r3.mo114109a()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2.mo114054j(r0, r1)
        L_0x00e9:
            com.tencent.mm.plugin.appbrand.debugger.a0 r0 = r13.f239793d
            com.tencent.mm.plugin.appbrand.debugger.m0 r0 = r0.f239779c
            r0.getClass()
            com.tencent.mm.plugin.appbrand.debugger.p0 r1 = new com.tencent.mm.plugin.appbrand.debugger.p0
            r1.<init>(r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.C81700c0.run():void");
    }
}
