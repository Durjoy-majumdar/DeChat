package com.tencent.p014mm.plugin.appbrand.launching.precondition;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.q */
public final class C83430q {
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AppBrand.Launching.CheckPkgLogic", "checkIsPagePathIncludedForAppPreLaunch(appId:%s, appVersion:%d, enterPath:%s) return true", r8, java.lang.Integer.valueOf(r9), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r6.close();
        r8 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m102386a(java.lang.String r8, com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionInfo r9, java.lang.String r10, com.tencent.p014mm.plugin.appbrand.appcache.C81396z3 r11) {
        /*
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "indexStorage"
            gy3.C87412m.m108594g(r11, r0)
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x0017
            int r2 = r10.length()
            if (r2 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r2 = 0
            goto L_0x0018
        L_0x0017:
            r2 = 1
        L_0x0018:
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x001b:
            if (r9 != 0) goto L_0x001e
            return r0
        L_0x001e:
            int r2 = r9.f239452d
            boolean r11 = r11.y00(r8, r2, r10)
            if (r11 != 0) goto L_0x00f8
            int r9 = r9.f239452d
            java.lang.String r11 = "MicroMsg.AppBrand.Launching.CheckPkgLogic"
            java.lang.String r10 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99875i(r10)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x0037
        L_0x0034:
            r8 = 0
            goto L_0x00f6
        L_0x0037:
            r2 = 2
            r3 = 3
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()     // Catch:{ Exception -> 0x00e3 }
            com.tencent.mm.plugin.appbrand.appcache.h3 r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g     // Catch:{ Exception -> 0x00e3 }
            java.util.List r4 = r4.mo113540v(r8, r9)     // Catch:{ Exception -> 0x00e3 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x00e3 }
        L_0x0046:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x00e3 }
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x00e3 }
            com.tencent.mm.plugin.appbrand.appcache.z2 r5 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r5     // Catch:{ Exception -> 0x00e3 }
            if (r5 == 0) goto L_0x0046
            java.lang.String r6 = r5.field_pkgPath     // Catch:{ Exception -> 0x00e3 }
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)     // Catch:{ Exception -> 0x00e3 }
            if (r6 == 0) goto L_0x0046
            java.lang.String r6 = r5.field_pkgPath     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.m99520c(r6)     // Catch:{ Exception -> 0x00e3 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00e3 }
            if (r7 != 0) goto L_0x0046
            java.lang.String r7 = r5.field_versionMd5     // Catch:{ Exception -> 0x00e3 }
            boolean r7 = u24.C90599h.m113509b(r6, r7)     // Catch:{ Exception -> 0x00e3 }
            if (r7 != 0) goto L_0x0078
            java.lang.String r7 = r5.field_NewMd5     // Catch:{ Exception -> 0x00e3 }
            boolean r6 = u24.C90599h.m113509b(r6, r7)     // Catch:{ Exception -> 0x00e3 }
            if (r6 == 0) goto L_0x0046
        L_0x0078:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg r6 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r5 = r5.field_pkgPath     // Catch:{ Exception -> 0x00e3 }
            r6.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x00e3 }
            r6.mo63189b()     // Catch:{ all -> 0x00d9 }
            java.lang.String r5 = "/app-config.json"
            java.io.InputStream r5 = r6.mo63188a(r5)     // Catch:{ all -> 0x00d9 }
            java.lang.String r5 = js0.C88016e.m109547d(r5)     // Catch:{ all -> 0x00d9 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00d9 }
            if (r7 != 0) goto L_0x00d4
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00d9 }
            r7.<init>(r5)     // Catch:{ all -> 0x00d9 }
            java.lang.String r5 = "page"
            org.json.JSONObject r5 = r7.optJSONObject(r5)     // Catch:{ all -> 0x00d9 }
            if (r5 == 0) goto L_0x00d4
            java.util.Iterator r5 = r5.keys()     // Catch:{ all -> 0x00d9 }
            if (r5 == 0) goto L_0x00bb
            if (r10 != 0) goto L_0x00a9
            goto L_0x00bb
        L_0x00a9:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x00d9 }
            if (r7 == 0) goto L_0x00bb
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x00d9 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x00d9 }
            if (r7 == 0) goto L_0x00a9
            r5 = 1
            goto L_0x00bc
        L_0x00bb:
            r5 = 0
        L_0x00bc:
            if (r5 == 0) goto L_0x00d4
            java.lang.String r4 = "checkIsPagePathIncludedForAppPreLaunch(appId:%s, appVersion:%d, enterPath:%s) return true"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d9 }
            r5[r0] = r8     // Catch:{ all -> 0x00d9 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00d9 }
            r5[r1] = r7     // Catch:{ all -> 0x00d9 }
            r5[r2] = r10     // Catch:{ all -> 0x00d9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r5)     // Catch:{ all -> 0x00d9 }
            r6.close()     // Catch:{ Exception -> 0x00e3 }
            r8 = 1
            goto L_0x00f6
        L_0x00d4:
            r6.close()     // Catch:{ Exception -> 0x00e3 }
            goto L_0x0046
        L_0x00d9:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x00de }
            goto L_0x00e2
        L_0x00de:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ Exception -> 0x00e3 }
        L_0x00e2:
            throw r4     // Catch:{ Exception -> 0x00e3 }
        L_0x00e3:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r3[r1] = r8
            r3[r2] = r10
            java.lang.String r8 = "checkIsPagePathIncludedForAppPreLaunch(appId:%s, appVersion:%d, enterPath:%s) get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r8, r3)
            goto L_0x0034
        L_0x00f6:
            if (r8 == 0) goto L_0x00f9
        L_0x00f8:
            r0 = 1
        L_0x00f9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.precondition.C83430q.m102386a(java.lang.String, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo, java.lang.String, com.tencent.mm.plugin.appbrand.appcache.z3):boolean");
    }
}
