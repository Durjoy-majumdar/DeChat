package jr0;

/* renamed from: jr0.a */
public final class C88013a {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m109543a() {
        /*
            java.util.Map<java.lang.String, java.lang.String> r0 = com.tencent.p014mm.plugin.appbrand.keylogger.C83229q.f243077a
            r0 = 2
            java.lang.String r1 = "Luggage.KeyStepUtils"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r1, r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.lang.String r4 = "WeAppLaunch"
            r2[r3] = r4
            java.lang.String r4 = "KeyStepLoggerSwitch_%s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.String r4 = ""
            java.lang.String r0 = r0.getString(r2, r4)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0040 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0040 }
            java.lang.String r0 = "keepTime"
            long r4 = r2.getLong(r0)     // Catch:{ JSONException -> 0x0040 }
            java.lang.String r0 = "openTime"
            long r6 = r2.getLong(r0)     // Catch:{ JSONException -> 0x0040 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0040 }
            r10 = 0
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            long r8 = r8 - r6
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0057
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 != 0) goto L_0x0057
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0057
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 != 0) goto L_0x0057
            boolean r0 = com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell.f239772d
            if (r0 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jr0.C88013a.m109543a():boolean");
    }
}
