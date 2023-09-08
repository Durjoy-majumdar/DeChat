package com.tencent.p014mm.plugin.account.p024ui;

import bc0.C67216a;

/* renamed from: com.tencent.mm.plugin.account.ui.v2 */
public class C115192v2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C67216a f345232d;

    /* renamed from: e */
    public final /* synthetic */ String f345233e;

    /* renamed from: f */
    public final /* synthetic */ String f345234f;

    /* renamed from: g */
    public final /* synthetic */ String f345235g;

    /* renamed from: h */
    public final /* synthetic */ RegByMobileRegAIOUI f345236h;

    public C115192v2(RegByMobileRegAIOUI regByMobileRegAIOUI, C67216a aVar, String str, String str2, String str3) {
        this.f345236h = regByMobileRegAIOUI;
        this.f345232d = aVar;
        this.f345233e = str;
        this.f345234f = str2;
        this.f345235g = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        ((qe3.C101131z) r8.f345232d.f193010d.getReqObj()).f296026a.f227380z = r8.f345236h.f344876J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r0 = tc2.C118418g.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r0.An0("ie_reg") == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r0.mo175826kl("ie_reg");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r1 = new te3.C118437hq3();
        r1.f354039d = r8.f345233e;
        r2 = r8.f345236h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r2.f344867A == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r2 = r2.f344872F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r2 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r2.isRecycled() != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r1.f354041f = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String(com.tencent.p014mm.sdk.platformtools.BitmapUtil.Bitmap2Bytes(r8.f345236h.f344872F));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r1.f354042g = r8.f345234f;
        r1.f354040e = r8.f345235g;
        r1.f354043h = com.tencent.p014mm.sdk.platformtools.Util.getTimeZoneOffset();
        r1.f354044i = java.util.TimeZone.getDefault().getID();
        r2 = r8.f345232d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        if (r8.f345232d.isCanceled() == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.RegByMobileRegAIOUI", "%s,%s", r1.f354043h, r1.f354044i);
        r2 = new te3.lx4();
        r3 = new te3.C51018qv3();
        r3.mo73350k(r0.vu0("ie_reg"));
        r2.f354115d = r3;
        r3 = new te3.C51018qv3();
        r3.mo73350k(r0.bw0("ce_reg"));
        r2.f354116e = r3;
        r3 = new te3.C51018qv3();
        r3.mo73350k(r0.mo175821hd());
        r2.f354117f = r3;
        r3 = new te3.C51018qv3();
        r3.mo73350k(r0.b90());
        r2.f354121j = r3;
        r0 = r0.mo175819gF("ce_reg");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e1, code lost:
        if (r0 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e3, code lost:
        r3 = new te3.C51018qv3();
        r3.mo73350k(r0.getBytes());
        r2.f354122n = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = new te3.C51018qv3();
        r0.mo73350k(r1.toByteArray());
        r2.f354118g = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0101, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.RegByMobileRegAIOUI", r0, "convert to byte error ! %s", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r8.f345236h.f344876J) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            bc0.a r0 = r8.f345232d
            monitor-enter(r0)
            bc0.a r1 = r8.f345232d     // Catch:{ all -> 0x0133 }
            boolean r1 = r1.isCanceled()     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            return
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r0 = r8.f345236h
            java.lang.String r0 = r0.f344876J
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x002a
            bc0.a r0 = r8.f345232d
            com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r1 = r8.f345236h
            java.lang.String r1 = r1.f344876J
            com.tencent.mm.network.u r0 = r0.f193010d
            qe3.w$d r0 = r0.getReqObj()
            qe3.z r0 = (qe3.C101131z) r0
            te3.fd r0 = r0.f296026a
            r0.f227380z = r1
        L_0x002a:
            tc2.g r0 = tc2.C118418g.INSTANCE
            java.lang.String r1 = "ie_reg"
            boolean r1 = r0.An0(r1)
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = "ie_reg"
            r0.mo175826kl(r1)
        L_0x0039:
            te3.hq3 r1 = new te3.hq3
            r1.<init>()
            java.lang.String r2 = r8.f345233e
            r1.f354039d = r2
            com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r2 = r8.f345236h
            boolean r3 = r2.f344867A
            if (r3 == 0) goto L_0x0060
            android.graphics.Bitmap r2 = r2.f344872F
            if (r2 == 0) goto L_0x0060
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L_0x0060
            com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r2 = r8.f345236h
            android.graphics.Bitmap r2 = r2.f344872F
            byte[] r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.Bitmap2Bytes(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((byte[]) r2)
            r1.f354041f = r2
        L_0x0060:
            java.lang.String r2 = r8.f345234f
            r1.f354042g = r2
            java.lang.String r2 = r8.f345235g
            r1.f354040e = r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.getTimeZoneOffset()
            r1.f354043h = r2
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            java.lang.String r2 = r2.getID()
            r1.f354044i = r2
            bc0.a r2 = r8.f345232d
            monitor-enter(r2)
            bc0.a r3 = r8.f345232d     // Catch:{ all -> 0x0130 }
            boolean r3 = r3.isCanceled()     // Catch:{ all -> 0x0130 }
            if (r3 == 0) goto L_0x0085
            monitor-exit(r2)     // Catch:{ all -> 0x0130 }
            return
        L_0x0085:
            monitor-exit(r2)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = "MicroMsg.RegByMobileRegAIOUI"
            java.lang.String r3 = "%s,%s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r1.f354043h
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = r1.f354044i
            r7 = 1
            r4[r7] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            te3.lx4 r2 = new te3.lx4
            r2.<init>()
            te3.qv3 r3 = new te3.qv3
            r3.<init>()
            java.lang.String r4 = "ie_reg"
            byte[] r4 = r0.vu0(r4)
            r3.mo73350k(r4)
            r2.f354115d = r3
            te3.qv3 r3 = new te3.qv3
            r3.<init>()
            java.lang.String r4 = "ce_reg"
            byte[] r4 = r0.bw0(r4)
            r3.mo73350k(r4)
            r2.f354116e = r3
            te3.qv3 r3 = new te3.qv3
            r3.<init>()
            byte[] r4 = r0.mo175821hd()
            r3.mo73350k(r4)
            r2.f354117f = r3
            te3.qv3 r3 = new te3.qv3
            r3.<init>()
            byte[] r4 = r0.b90()
            r3.mo73350k(r4)
            r2.f354121j = r3
            java.lang.String r3 = "ce_reg"
            java.lang.String r0 = r0.mo175819gF(r3)
            if (r0 == 0) goto L_0x00f1
            te3.qv3 r3 = new te3.qv3
            r3.<init>()
            byte[] r0 = r0.getBytes()
            r3.mo73350k(r0)
            r2.f354122n = r3
        L_0x00f1:
            te3.qv3 r0 = new te3.qv3     // Catch:{ IOException -> 0x0100 }
            r0.<init>()     // Catch:{ IOException -> 0x0100 }
            byte[] r1 = r1.toByteArray()     // Catch:{ IOException -> 0x0100 }
            r0.mo73350k(r1)     // Catch:{ IOException -> 0x0100 }
            r2.f354118g = r0     // Catch:{ IOException -> 0x0100 }
            goto L_0x0110
        L_0x0100:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.RegByMobileRegAIOUI"
            java.lang.String r3 = "convert to byte error ! %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = r0.getMessage()
            r4[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r3, r4)
        L_0x0110:
            bc0.a r0 = r8.f345232d
            r0.mo91365T(r2)
            bc0.a r0 = r8.f345232d
            monitor-enter(r0)
            bc0.a r1 = r8.f345232d     // Catch:{ all -> 0x012d }
            boolean r1 = r1.isCanceled()     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x0122
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            return
        L_0x0122:
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            ob0.b0 r0 = f40.C86709a0.m107524d()
            bc0.a r1 = r8.f345232d
            r0.mo123460f(r1)
            return
        L_0x012d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            throw r1
        L_0x0130:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0130 }
            throw r0
        L_0x0133:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.C115192v2.run():void");
    }
}
