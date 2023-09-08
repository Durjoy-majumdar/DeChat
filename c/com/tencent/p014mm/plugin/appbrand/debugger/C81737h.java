package com.tencent.p014mm.plugin.appbrand.debugger;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.h */
public class C81737h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f239870d;

    /* renamed from: e */
    public final /* synthetic */ String f239871e;

    /* renamed from: f */
    public final /* synthetic */ String f239872f;

    /* renamed from: g */
    public final /* synthetic */ Runnable f239873g;

    public C81737h(String str, String str2, String str3, Runnable runnable) {
        this.f239870d = str;
        this.f239871e = str2;
        this.f239872f = str3;
        this.f239873g = runnable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.io.OutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154242n()
            r0.append(r1)
            java.lang.String r1 = r9.f239870d
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.lang.String r2 = r9.f239871e
            r0.append(r2)
            r0.append(r1)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.append(r1)
            java.lang.String r1 = ".js"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 0
            java.lang.String r3 = r9.f239872f     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            com.tencent.mm.network.b0 r3 = com.tencent.p014mm.network.C81035d.m98963d(r3, r2)     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            r4 = 10000(0x2710, float:1.4013E-41)
            r3.mo112919d(r4)     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            r4 = 20000(0x4e20, float:2.8026E-41)
            r3.mo112923g(r4)     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            java.lang.String r4 = "GET"
            r3.mo112930l(r4)     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            r3.mo112916a()     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            if (r3 == 0) goto L_0x0058
            java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106429K(r0, r1)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            s24.C90125c.m112775b(r3, r2)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            r2.flush()     // Catch:{ Exception -> 0x0070, all -> 0x006b }
        L_0x0058:
            java.lang.String r4 = r9.f239870d     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            java.lang.String r5 = r9.f239871e     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            com.tencent.p014mm.plugin.appbrand.debugger.C81734g.m100283c(r4, r5, r0)     // Catch:{ Exception -> 0x0070, all -> 0x006b }
            s24.C90125c.m112774a(r3)
            s24.C90125c.m112774a(r2)
        L_0x0065:
            java.lang.Runnable r0 = r9.f239873g
            r0.run()
            goto L_0x009d
        L_0x006b:
            r0 = move-exception
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x009f
        L_0x0070:
            r0 = move-exception
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x007a
        L_0x0075:
            r0 = move-exception
            r3 = r2
            goto L_0x009f
        L_0x0078:
            r0 = move-exception
            r3 = r2
        L_0x007a:
            java.lang.String r4 = "MicroMsg.AppBrand.ForceOpenAppNotify"
            java.lang.String r5 = "try download autoTestInjectJs appId:%s, name:%s, url:%s, failed, exception=%s"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x009e }
            java.lang.String r7 = r9.f239870d     // Catch:{ all -> 0x009e }
            r6[r1] = r7     // Catch:{ all -> 0x009e }
            r1 = 1
            java.lang.String r7 = r9.f239871e     // Catch:{ all -> 0x009e }
            r6[r1] = r7     // Catch:{ all -> 0x009e }
            r1 = 2
            java.lang.String r7 = r9.f239872f     // Catch:{ all -> 0x009e }
            r6[r1] = r7     // Catch:{ all -> 0x009e }
            r1 = 3
            r6[r1] = r0     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)     // Catch:{ all -> 0x009e }
            s24.C90125c.m112774a(r2)
            s24.C90125c.m112774a(r3)
            goto L_0x0065
        L_0x009d:
            return
        L_0x009e:
            r0 = move-exception
        L_0x009f:
            s24.C90125c.m112774a(r2)
            s24.C90125c.m112774a(r3)
            java.lang.Runnable r1 = r9.f239873g
            r1.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.debugger.C81737h.run():void");
    }
}
