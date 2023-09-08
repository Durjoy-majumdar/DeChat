package rm0;

/* renamed from: rm0.k */
public class C90041k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90043m f258652d;

    public C90041k(C90043m mVar) {
        this.f258652d = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r6.f258652d.f258655a.isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        js0.C88024r.m109571a().mo122468a(r6, (long) rm0.C90043m.f258654d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r1.mo115158h();
        com.tencent.p014mm.sdk.platformtools.Log.m105927v("MicroMsg.SensorJsEventPublisher", "publish next event(event : %s), list size is : %d.", r1.mo114779e(), java.lang.Integer.valueOf(r3));
        r1 = r6.f258652d.f258655a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            rm0.m r0 = r6.f258652d
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.r2> r0 = r0.f258655a
            monitor-enter(r0)
            rm0.m r1 = r6.f258652d     // Catch:{ all -> 0x0062 }
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.r2> r1 = r1.f258655a     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return
        L_0x0011:
            rm0.m r1 = r6.f258652d     // Catch:{ all -> 0x0062 }
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.r2> r1 = r1.f258655a     // Catch:{ all -> 0x0062 }
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x0062 }
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ all -> 0x0062 }
            com.tencent.mm.plugin.appbrand.jsapi.r2 r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2) r1     // Catch:{ all -> 0x0062 }
            rm0.m r3 = r6.f258652d     // Catch:{ all -> 0x0062 }
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.r2> r3 = r3.f258655a     // Catch:{ all -> 0x0062 }
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch:{ all -> 0x0062 }
            int r3 = r3.size()     // Catch:{ all -> 0x0062 }
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            r1.mo115158h()
            java.lang.String r0 = "MicroMsg.SensorJsEventPublisher"
            java.lang.String r4 = "publish next event(event : %s), list size is : %d."
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = r1.mo114779e()
            r5[r2] = r1
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r5[r1] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r4, r5)
            rm0.m r0 = r6.f258652d
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.r2> r1 = r0.f258655a
            monitor-enter(r1)
            rm0.m r0 = r6.f258652d     // Catch:{ all -> 0x005f }
            java.util.List<com.tencent.mm.plugin.appbrand.jsapi.r2> r0 = r0.f258655a     // Catch:{ all -> 0x005f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005f }
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005e
            js0.r$a r0 = js0.C88024r.m109571a()
            int r1 = rm0.C90043m.f258654d
            long r1 = (long) r1
            r0.mo122468a(r6, r1)
        L_0x005e:
            return
        L_0x005f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            throw r0
        L_0x0062:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rm0.C90041k.run():void");
    }
}
