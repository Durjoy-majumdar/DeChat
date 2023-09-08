package com.tencent.p014mm.plugin.appbrand.utils;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.w */
public class C40570w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f108967d;

    /* renamed from: e */
    public final /* synthetic */ String f108968e;

    /* renamed from: f */
    public final /* synthetic */ String f108969f;

    public C40570w(String str, String str2, String str3) {
        this.f108967d = str;
        this.f108968e = str2;
        this.f108969f = str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            java.lang.String r0 = r15.f108967d
            java.lang.String r1 = r15.f108968e
            java.lang.String r2 = r15.f108969f
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r3.<init>((java.lang.String) r2)
            boolean r4 = r3.mo119967g()
            r5 = 1
            r6 = 0
            java.lang.String r7 = "MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu"
            if (r4 == 0) goto L_0x003f
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r6] = r0
            java.lang.String r8 = "download already exists: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r4)
            boolean r4 = com.tencent.p014mm.plugin.appbrand.utils.C84795y.m104476b(r1, r2)
            if (r4 == 0) goto L_0x002e
            com.tencent.mm.plugin.appbrand.utils.x r1 = new com.tencent.mm.plugin.appbrand.utils.x
            r1.<init>(r0, r2)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x00f0
        L_0x002e:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            boolean r8 = r3.mo119966f()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4[r6] = r8
            java.lang.String r8 = "download already exists, but md5 not valid. deleted:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r4)
        L_0x003f:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r4 = com.tencent.p014mm.plugin.appbrand.utils.C84795y.f247223a
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            boolean r4 = r4.containsKey(r0)
            if (r4 == 0) goto L_0x0054
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r0
            java.lang.String r0 = "download ing: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r1)
            goto L_0x00f0
        L_0x0054:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r4 = com.tencent.p014mm.plugin.appbrand.utils.C84795y.f247223a
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            r4.put(r0, r8)
            r4 = 0
            java.net.URL r8 = new java.net.URL     // Catch:{ Exception -> 0x009e, all -> 0x009a }
            r8.<init>(r0)     // Catch:{ Exception -> 0x009e, all -> 0x009a }
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ Exception -> 0x009e, all -> 0x009a }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x009e, all -> 0x009a }
            java.io.OutputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106426H(r3)     // Catch:{ Exception -> 0x0097, all -> 0x0093 }
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            java.io.InputStream r11 = r8.getInputStream()     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            r10.<init>(r11)     // Catch:{ Exception -> 0x008f, all -> 0x008b }
            r11 = 16384(0x4000, float:2.2959E-41)
            byte[] r12 = new byte[r11]     // Catch:{ Exception -> 0x0089 }
        L_0x007a:
            int r13 = r10.read(r12, r6, r11)     // Catch:{ Exception -> 0x0089 }
            r14 = -1
            if (r13 == r14) goto L_0x0085
            r9.write(r12, r6, r13)     // Catch:{ Exception -> 0x0089 }
            goto L_0x007a
        L_0x0085:
            r9.flush()     // Catch:{ Exception -> 0x0089 }
            goto L_0x00af
        L_0x0089:
            r11 = move-exception
            goto L_0x00a3
        L_0x008b:
            r0 = move-exception
            r10 = r4
            goto L_0x00f2
        L_0x008f:
            r10 = move-exception
            r11 = r10
            r10 = r4
            goto L_0x00a3
        L_0x0093:
            r0 = move-exception
            r9 = r4
            r10 = r9
            goto L_0x00f2
        L_0x0097:
            r9 = move-exception
            r11 = r9
            goto L_0x00a1
        L_0x009a:
            r0 = move-exception
            r9 = r4
            r10 = r9
            goto L_0x00f3
        L_0x009e:
            r8 = move-exception
            r11 = r8
            r8 = r4
        L_0x00a1:
            r9 = r4
            r10 = r9
        L_0x00a3:
            r3.mo119966f()     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = "download file url %s "
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00f1 }
            r5[r6] = r0     // Catch:{ all -> 0x00f1 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r11, r3, r5)     // Catch:{ all -> 0x00f1 }
        L_0x00af:
            java.io.InputStream r3 = r8.getInputStream()     // Catch:{ Exception -> 0x00b7 }
            r3.close()     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00bf
        L_0x00b7:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)
        L_0x00bf:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r9)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            r8.disconnect()
            java.lang.String r3 = "download done"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r3 = com.tencent.p014mm.plugin.appbrand.utils.C84795y.f247223a
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            r3.remove(r0)
            boolean r1 = com.tencent.p014mm.plugin.appbrand.utils.C84795y.m104476b(r1, r2)
            if (r1 == 0) goto L_0x00e3
            com.tencent.mm.plugin.appbrand.utils.x r1 = new com.tencent.mm.plugin.appbrand.utils.x
            r1.<init>(r0, r2)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x00f0
        L_0x00e3:
            java.lang.String r1 = "download md5 not valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r1)
            com.tencent.mm.plugin.appbrand.utils.x r1 = new com.tencent.mm.plugin.appbrand.utils.x
            r1.<init>(r0, r4)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
        L_0x00f0:
            return
        L_0x00f1:
            r0 = move-exception
        L_0x00f2:
            r4 = r8
        L_0x00f3:
            java.io.InputStream r1 = r4.getInputStream()     // Catch:{ Exception -> 0x00fb }
            r1.close()     // Catch:{ Exception -> 0x00fb }
            goto L_0x0103
        L_0x00fb:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
        L_0x0103:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r9)
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r10)
            r4.disconnect()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C40570w.run():void");
    }
}
