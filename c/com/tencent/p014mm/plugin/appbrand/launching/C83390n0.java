package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.n0 */
public class C83390n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxaPkgWrappingInfo f243650d;

    /* renamed from: e */
    public final /* synthetic */ AppLaunchPrepareProcess f243651e;

    public C83390n0(AppLaunchPrepareProcess appLaunchPrepareProcess, WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        this.f243651e = appLaunchPrepareProcess;
        this.f243650d = wxaPkgWrappingInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
        if (r3.length() == 0) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:13:0x0037->B:14:0x0039, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess r0 = r13.f243651e
            java.lang.String r0 = r0.f243262o
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x000f
            goto L_0x002f
        L_0x000f:
            wi0.e0 r1 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()     // Catch:{ Exception -> 0x002e }
            java.lang.String r6 = "roundedSquareIconURL"
            java.lang.String r7 = "bigHeadURL"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch:{ Exception -> 0x002e }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r1.mo114000LL(r0, r6)     // Catch:{ Exception -> 0x002e }
            if (r0 != 0) goto L_0x0023
            goto L_0x002f
        L_0x0023:
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ Exception -> 0x002e }
            java.lang.String r6 = r0.field_roundedSquareIconURL     // Catch:{ Exception -> 0x002e }
            r1[r4] = r6     // Catch:{ Exception -> 0x002e }
            java.lang.String r0 = r0.field_bigHeadURL     // Catch:{ Exception -> 0x002e }
            r1[r5] = r0     // Catch:{ Exception -> 0x002e }
            goto L_0x0030
        L_0x002e:
        L_0x002f:
            r1 = r3
        L_0x0030:
            if (r1 == 0) goto L_0x0045
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0045
            int r0 = r1.length
            r6 = 0
        L_0x0037:
            if (r6 >= r0) goto L_0x0045
            r7 = r1[r6]
            java.lang.String r8 = lb0.C88394b.f255384g
            lb0.b r8 = lb0.C88394b.C88418q.f255427a
            r8.mo122794m(r7)
            int r6 = r6 + 1
            goto L_0x0037
        L_0x0045:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.appbrand.launching.AppLaunchPrepareProcess.f243224T0
            if (r0 != 0) goto L_0x004a
            goto L_0x0069
        L_0x004a:
            r6 = 0
            java.lang.String r1 = "CONFIG_KEY_LAST_RCPT_ADDRESS_CHECK_TICK"
            long r6 = r0.getLong(r1, r6)
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r6 = r8 - r6
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            r11 = 5
            long r10 = r10.toMillis(r11)
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0069
            r0.putLong(r1, r8)
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r0 == 0) goto L_0x0085
            java.lang.Class<op.f> r0 = p216op.C47389f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            op.f r0 = (p216op.C47389f) r0
            r1 = 12
            op.h r0 = r0.mo72332TD(r1)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            ob0.y r0 = (ob0.C117747y) r0
            r1.mo123460f(r0)
        L_0x0085:
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess r0 = r13.f243651e
            int r0 = r0.f243265q
            if (r5 != r0) goto L_0x00ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "XWebMMConfig."
            r0.append(r1)
            int r1 = f40.C86718e.m107549h()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0, r2)
            if (r0 == 0) goto L_0x00ab
            java.lang.String r1 = "MP_DEVELOPER"
            r0.encode((java.lang.String) r1, (boolean) r5)
        L_0x00ab:
            com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess r0 = r13.f243651e
            java.lang.String r0 = r0.f243263p
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = r13.f243650d
            java.lang.String r2 = "appId"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "wxaPkgWrappingInfo"
            gy3.C87412m.m108594g(r1, r2)
            r6 = r3
            r2 = 0
        L_0x00be:
            if (r2 != 0) goto L_0x00c2
            r7 = 1
            goto L_0x00ce
        L_0x00c2:
            if (r6 != 0) goto L_0x00ca
            java.util.LinkedList<com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo> r6 = r1.f238588g
            java.util.Iterator r6 = r6.iterator()
        L_0x00ca:
            boolean r7 = r6.hasNext()
        L_0x00ce:
            if (r7 == 0) goto L_0x018f
            if (r2 != 0) goto L_0x00d5
            r7 = r1
            r2 = 1
            goto L_0x00db
        L_0x00d5:
            java.lang.Object r7 = r6.next()
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo r7 = (com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo) r7
        L_0x00db:
            boolean r8 = r7.independent
            if (r8 == 0) goto L_0x00be
            java.lang.String r8 = r7.pkgPath
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r8 == 0) goto L_0x00be
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016f }
            r2.<init>()     // Catch:{ Exception -> 0x016f }
            java.lang.String r6 = "__APP__"
            java.lang.String r8 = r7.name     // Catch:{ Exception -> 0x016f }
            boolean r6 = gy3.C87412m.m108589b(r6, r8)     // Catch:{ Exception -> 0x016f }
            if (r6 == 0) goto L_0x00f9
            java.lang.String r6 = ""
            goto L_0x0113
        L_0x00f9:
            java.lang.String r6 = r7.name     // Catch:{ Exception -> 0x016f }
            android.util.SparseIntArray r8 = com.tencent.p014mm.plugin.appbrand.appcache.C81243g.f238641a     // Catch:{ Exception -> 0x016f }
            java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99875i(r6)     // Catch:{ Exception -> 0x016f }
            java.lang.String r8 = "/"
            boolean r8 = r6.endsWith(r8)     // Catch:{ Exception -> 0x016f }
            if (r8 == 0) goto L_0x0113
            int r8 = r6.length()     // Catch:{ Exception -> 0x016f }
            int r8 = r8 + -1
            java.lang.String r6 = r6.substring(r4, r8)     // Catch:{ Exception -> 0x016f }
        L_0x0113:
            r2.append(r6)     // Catch:{ Exception -> 0x016f }
            java.lang.String r6 = "/app-config.json"
            r2.append(r6)     // Catch:{ Exception -> 0x016f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x016f }
            java.lang.String r6 = r7.pkgPath     // Catch:{ Exception -> 0x016f }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r7 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg     // Catch:{ Exception -> 0x0140 }
            r7.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x0140 }
            r7.mo63189b()     // Catch:{ all -> 0x0136 }
            java.io.InputStream r2 = r7.mo63188a(r2)     // Catch:{ all -> 0x0136 }
            java.lang.String r2 = js0.C88016e.m109547d(r2)     // Catch:{ all -> 0x0136 }
            r7.close()     // Catch:{ Exception -> 0x0140 }
            r3 = r2
            goto L_0x0141
        L_0x0136:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x013b }
            goto L_0x013f
        L_0x013b:
            r6 = move-exception
            r2.addSuppressed(r6)     // Catch:{ Exception -> 0x0140 }
        L_0x013f:
            throw r2     // Catch:{ Exception -> 0x0140 }
        L_0x0140:
        L_0x0141:
            if (r3 == 0) goto L_0x0149
            int r2 = r3.length()     // Catch:{ Exception -> 0x016f }
            if (r2 != 0) goto L_0x014a
        L_0x0149:
            r4 = 1
        L_0x014a:
            if (r4 != 0) goto L_0x018f
            j6.h r2 = p571j6.C87884a.m109365a(r3)     // Catch:{ Exception -> 0x016f }
            j6.e r2 = r2.mo122341f()     // Catch:{ Exception -> 0x016f }
            java.lang.String r3 = "pages"
            j6.h r2 = r2.mo122344l(r3)     // Catch:{ Exception -> 0x016f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x016f }
            java.lang.String r3 = "parse(configJson).asObje…).get(\"pages\").toString()"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x016f }
            com.tencent.mm.plugin.appbrand.appcache.t0 r3 = com.tencent.p014mm.plugin.appbrand.appcache.C81354t0.f238835d     // Catch:{ Exception -> 0x016f }
            int r1 = r1.pkgVersion()     // Catch:{ Exception -> 0x016f }
            r3.yx0(r0, r1, r2)     // Catch:{ Exception -> 0x016f }
            goto L_0x018f
        L_0x016f:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updatePageIndexWithPkgInfo(appId:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") get exception:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "MicroMsg.WxaVersionPagePathIndexStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83390n0.run():void");
    }
}
