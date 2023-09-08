package com.tencent.p014mm.network;

/* renamed from: com.tencent.mm.network.k0 */
public final class C40382k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f108510d;

    /* renamed from: e */
    public final /* synthetic */ int f108511e;

    /* renamed from: f */
    public final /* synthetic */ String f108512f;

    public C40382k0(String str, int i, String str2) {
        this.f108510d = str;
        this.f108511e = i;
        this.f108512f = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.tencent.p014mm.network.C40380j0.f108507a
            r0.incrementAndGet()
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r5 = r14.f108510d     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r5 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            gy3.C87412m.m108592e(r4, r5)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r2 = "GET"
            r4.setRequestMethod(r2)     // Catch:{ Exception -> 0x003d }
            int r2 = r14.f108511e     // Catch:{ Exception -> 0x003d }
            int r2 = r2 * 1000
            r4.setConnectTimeout(r2)     // Catch:{ Exception -> 0x003d }
            int r2 = r14.f108511e     // Catch:{ Exception -> 0x003d }
            int r2 = r2 * 1000
            r4.setReadTimeout(r2)     // Catch:{ Exception -> 0x003d }
            r4.setUseCaches(r3)     // Catch:{ Exception -> 0x003d }
            int r2 = r4.getResponseCode()     // Catch:{ Exception -> 0x003d }
            r4.disconnect()
            java.lang.String r4 = ""
            goto L_0x0056
        L_0x003d:
            r2 = move-exception
            goto L_0x0046
        L_0x003f:
            r0 = move-exception
            goto L_0x00e8
        L_0x0042:
            r4 = move-exception
            r13 = r4
            r4 = r2
            r2 = r13
        L_0x0046:
            java.lang.String r2 = r2.getLocalizedMessage()     // Catch:{ all -> 0x00e6 }
            java.lang.String r5 = "e.localizedMessage"
            gy3.C87412m.m108593f(r2, r5)     // Catch:{ all -> 0x00e6 }
            if (r4 == 0) goto L_0x0054
            r4.disconnect()
        L_0x0054:
            r4 = r2
            r2 = 0
        L_0x0056:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
            java.lang.String r7 = r14.f108512f
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r8 = ","
            java.lang.String r9 = ";"
            java.lang.String r1 = z04.C112551y.m153816p(r7, r8, r9, r10, r11, r12)
            java.lang.String r7 = ","
            java.lang.String r8 = ";"
            java.lang.String r4 = z04.C112551y.m153814n(r4, r7, r8, r3)
            int r7 = r4.length()
            if (r7 != 0) goto L_0x0080
            r7 = 1
            goto L_0x0081
        L_0x0080:
            r7 = 0
        L_0x0081:
            if (r7 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r3 = -1
        L_0x0085:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r1 = 44
            r7.append(r1)
            java.lang.String r8 = r14.f108510d
            r7.append(r8)
            r7.append(r1)
            int r8 = r14.f108511e
            r7.append(r8)
            r7.append(r1)
            r7.append(r3)
            r7.append(r1)
            r7.append(r4)
            r7.append(r1)
            r7.append(r2)
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = ",HTTP,"
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "http check result:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MMNetCheck"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 26167(0x6637, float:3.6668E-41)
            r1.kvStat(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = com.tencent.p014mm.network.C40380j0.f108507a
            r0.decrementAndGet()
            return
        L_0x00e6:
            r0 = move-exception
            r2 = r4
        L_0x00e8:
            if (r2 == 0) goto L_0x00ed
            r2.disconnect()
        L_0x00ed:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.network.C40382k0.run():void");
    }
}
