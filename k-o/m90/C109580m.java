package m90;

/* renamed from: m90.m */
public class C109580m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109572k f328038d;

    /* renamed from: m90.m$a */
    public class C109581a implements Runnable {
        public C109581a() {
        }

        public void run() {
            C109580m.this.f328038d.f327999B.mo150355d(1);
        }
    }

    public C109580m(C109572k kVar) {
        this.f328038d = kVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|7|(1:9)|10|11|(1:13)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x007b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            m90.k r0 = r14.f328038d
            java.lang.Object r0 = r0.f328009a
            monitor-enter(r0)
            m90.k r1 = r14.f328038d     // Catch:{ all -> 0x00f2 }
            boolean r1 = m90.C109572k.m148829A(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "MicroMsg.Media.X264MP4MuxRecorder"
            java.lang.String r3 = "stopImpl result: %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f2 }
            r6 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00f2 }
            r5[r6] = r7     // Catch:{ all -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x0090
            java.lang.String r1 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r2 = "markX264CaptureSuccess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00f2 }
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00f2 }
            r6 = 985(0x3d9, double:4.867E-321)
            r8 = 39
            r10 = 1
            r5.mo175913w(r6, r8, r10)     // Catch:{ all -> 0x00f2 }
            m90.k r1 = r14.f328038d     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = r1.f328011c     // Catch:{ all -> 0x00f2 }
            android.graphics.Bitmap r2 = f72.C97842b.m126300q(r2)     // Catch:{ all -> 0x00f2 }
            m90.C109572k.m148830B(r1, r2)     // Catch:{ all -> 0x00f2 }
            m90.k r1 = r14.f328038d     // Catch:{ Exception -> 0x007b }
            java.lang.String r1 = r1.f328011c     // Catch:{ Exception -> 0x007b }
            com.tencent.mm.plugin.sight.base.a r1 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r1, r4)     // Catch:{ Exception -> 0x007b }
            if (r1 == 0) goto L_0x007b
            int r2 = r1.f273444b     // Catch:{ Exception -> 0x007b }
            int r1 = r1.f273447e     // Catch:{ Exception -> 0x007b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b }
            r3.<init>()     // Catch:{ Exception -> 0x007b }
            java.lang.String r4 = "markX264CaptureResult, bitrate:"
            r3.append(r4)     // Catch:{ Exception -> 0x007b }
            r3.append(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r4 = ", fps:"
            r3.append(r4)     // Catch:{ Exception -> 0x007b }
            r3.append(r1)     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x007b }
            java.lang.String r4 = "MicroMsg.MediaEditorIDKeyStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)     // Catch:{ Exception -> 0x007b }
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x007b }
            long r10 = (long) r2     // Catch:{ Exception -> 0x007b }
            r12 = 985(0x3d9, double:4.867E-321)
            r8 = 38
            r5 = r3
            r6 = r12
            r5.mo175913w(r6, r8, r10)     // Catch:{ Exception -> 0x007b }
            long r10 = (long) r1     // Catch:{ Exception -> 0x007b }
            r8 = 41
            r5 = r3
            r6 = r12
            r5.mo175913w(r6, r8, r10)     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            m90.k r1 = r14.f328038d     // Catch:{ all -> 0x00f2 }
            java.lang.Runnable r1 = r1.f328000C     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = "MicroMsg.Media.X264MP4MuxRecorder"
            java.lang.String r2 = "call stopCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00f2 }
            m90.k r1 = r14.f328038d     // Catch:{ all -> 0x00f2 }
            java.lang.Runnable r1 = r1.f328000C     // Catch:{ all -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)     // Catch:{ all -> 0x00f2 }
            goto L_0x00b7
        L_0x0090:
            java.lang.String r1 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r2 = "markX264CaptureFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00f2 }
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00f2 }
            r4 = 985(0x3d9, double:4.867E-321)
            r6 = 37
            r8 = 1
            r3.mo175913w(r4, r6, r8)     // Catch:{ all -> 0x00f2 }
            m90.k r1 = r14.f328038d     // Catch:{ all -> 0x00f2 }
            com.tencent.mm.plugin.sight.base.e r1 = r1.f328026r     // Catch:{ all -> 0x00f2 }
            r1.mo151875c()     // Catch:{ all -> 0x00f2 }
            m90.k r1 = r14.f328038d     // Catch:{ all -> 0x00f2 }
            j72.f$a r1 = r1.f327999B     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00b7
            m90.m$a r1 = new m90.m$a     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)     // Catch:{ all -> 0x00f2 }
        L_0x00b7:
            long r1 = w80.C102361h.f301460b     // Catch:{ all -> 0x00f2 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f0
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)     // Catch:{ all -> 0x00f2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "markX264WaitStop, waitTime:"
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            r1.append(r11)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "MicroMsg.MediaEditorIDKeyStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)     // Catch:{ all -> 0x00f2 }
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00f2 }
            r7 = 985(0x3d9, double:4.867E-321)
            r9 = 34
            r6 = r3
            r6.mo175913w(r7, r9, r11)     // Catch:{ all -> 0x00f2 }
            r4 = 985(0x3d9, double:4.867E-321)
            r6 = 35
            r8 = 1
            r3.mo175913w(r4, r6, r8)     // Catch:{ all -> 0x00f2 }
            r1 = -1
            w80.C102361h.f301460b = r1     // Catch:{ all -> 0x00f2 }
        L_0x00f0:
            monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
            return
        L_0x00f2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.C109580m.run():void");
    }
}
