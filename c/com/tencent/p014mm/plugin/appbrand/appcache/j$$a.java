package com.tencent.p014mm.plugin.appbrand.appcache;

import te3.C64310db;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.j$$a */
public final /* synthetic */ class j$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f238675d;

    /* renamed from: e */
    public final /* synthetic */ int f238676e;

    /* renamed from: f */
    public final /* synthetic */ C64310db f238677f;

    public /* synthetic */ j$$a(int i, int i2, C64310db dbVar) {
        this.f238675d = i;
        this.f238676e = i2;
        this.f238677f = dbVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r3.add(new com.tencent.mars.smc.IDKey(368, 114, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        if (r3.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        r0 = new com.tencent.mars.smc.IDKey(368, 110, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f238675d
            int r1 = r11.f238676e
            te3.db r2 = r11.f238677f
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            r4 = 0
            r5 = 110(0x6e, float:1.54E-43)
            r6 = 1
            r7 = 368(0x170, float:5.16E-43)
            r8 = 0
            boolean r1 = rp0.C90077a.m112678a(r0, r1, r2)     // Catch:{ all -> 0x00df }
            r9 = 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x003e
            r1 = 4
            if (r1 != r0) goto L_0x0027
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey     // Catch:{ all -> 0x00df }
            r0.<init>((int) r7, (int) r9, (int) r6)     // Catch:{ all -> 0x00df }
            r3.add(r0)     // Catch:{ all -> 0x00df }
            goto L_0x0031
        L_0x0027:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey     // Catch:{ all -> 0x00df }
            r1 = 111(0x6f, float:1.56E-43)
            r0.<init>((int) r7, (int) r1, (int) r6)     // Catch:{ all -> 0x00df }
            r3.add(r0)     // Catch:{ all -> 0x00df }
        L_0x0031:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00de
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>((int) r7, (int) r5, (int) r6)
            goto L_0x00d3
        L_0x003e:
            java.util.LinkedList<te3.hz1> r0 = r2.f182660d     // Catch:{ all -> 0x00df }
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "MicroMsg.AppBrand.CgiBatchGetPkgDownloadInfo"
            java.lang.String r1 = "onCgiBack, response.resp_list is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x00df }
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey     // Catch:{ all -> 0x00df }
            r0.<init>((int) r7, (int) r9, (int) r6)     // Catch:{ all -> 0x00df }
            r3.add(r0)     // Catch:{ all -> 0x00df }
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00de
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>((int) r7, (int) r5, (int) r6)
            goto L_0x00d3
        L_0x005e:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00df }
        L_0x0062:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00df }
            te3.hz1 r1 = (te3.C90415hz1) r1     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x0071
            goto L_0x0062
        L_0x0071:
            int r2 = r1.f259557d     // Catch:{ all -> 0x00df }
            r10 = -2000004(0xffffffffffe17b7c, float:NaN)
            if (r2 == r10) goto L_0x00b2
            r10 = -2000011(0xffffffffffe17b75, float:NaN)
            if (r2 != r10) goto L_0x007e
            goto L_0x00b2
        L_0x007e:
            if (r2 == 0) goto L_0x0094
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey     // Catch:{ all -> 0x00df }
            r0.<init>((int) r7, (int) r9, (int) r6)     // Catch:{ all -> 0x00df }
            r3.add(r0)     // Catch:{ all -> 0x00df }
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00de
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>((int) r7, (int) r5, (int) r6)
            goto L_0x00d3
        L_0x0094:
            java.lang.String r1 = r1.f259558e     // Catch:{ all -> 0x00df }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x0062
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey     // Catch:{ all -> 0x00df }
            r1 = 113(0x71, float:1.58E-43)
            r0.<init>((int) r7, (int) r1, (int) r6)     // Catch:{ all -> 0x00df }
            r3.add(r0)     // Catch:{ all -> 0x00df }
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00de
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>((int) r7, (int) r5, (int) r6)
            goto L_0x00d3
        L_0x00b2:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey     // Catch:{ all -> 0x00df }
            r1 = 114(0x72, float:1.6E-43)
            r0.<init>((int) r7, (int) r1, (int) r6)     // Catch:{ all -> 0x00df }
            r3.add(r0)     // Catch:{ all -> 0x00df }
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00de
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>((int) r7, (int) r5, (int) r6)
            goto L_0x00d3
        L_0x00c8:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00de
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>((int) r7, (int) r5, (int) r6)
        L_0x00d3:
            r3.add(r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0.mo160124a(r3, r8)
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103836b(r4, r8, r8, r3)
        L_0x00de:
            return
        L_0x00df:
            r0 = move-exception
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x00f6
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>((int) r7, (int) r5, (int) r6)
            r3.add(r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1.mo160124a(r3, r8)
            com.tencent.p014mm.plugin.appbrand.report.C84240s.m103836b(r4, r8, r8, r3)
        L_0x00f6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.j$$a.run():void");
    }
}
