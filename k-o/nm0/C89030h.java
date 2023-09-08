package nm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;

/* renamed from: nm0.h */
public class C89030h extends C82268c {
    public static final int CTRL_INDEX = 63;
    public static final String NAME = "reportKeyValue";

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb A[SYNTHETIC, Splitter:B:41:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0160 A[SYNTHETIC, Splitter:B:58:0x0160] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d5 A[Catch:{ Exception -> 0x01d2 }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r26, org.json.JSONObject r27, int r28) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r0 = r27
            r3 = r28
            java.lang.String r4 = "dataArray"
            org.json.JSONArray r4 = r0.optJSONArray(r4)
            if (r4 != 0) goto L_0x001a
            java.lang.String r0 = "fail:invalid data"
            java.lang.String r0 = r1.mo115109j(r0)
            r2.mo109647a(r3, r0)
            return
        L_0x001a:
            r5 = -1
            java.lang.String r6 = "version"
            int r5 = r0.optInt(r6, r5)
            java.lang.Class<wi0.l> r0 = wi0.C90988l.class
            com.tencent.mm.plugin.appbrand.jsapi.m r0 = r2.mo109671p(r0)
            r6 = r0
            wi0.l r6 = (wi0.C90988l) r6
            java.lang.String r7 = "MicroMsg.JsApiReportKeyValue"
            if (r6 != 0) goto L_0x003e
            java.lang.String r0 = "config is Null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            java.lang.String r0 = "fail:interrupted"
            java.lang.String r0 = r1.mo115109j(r0)
            r2.mo109647a(r3, r0)
            return
        L_0x003e:
            r8 = 0
            r9 = 0
        L_0x0040:
            int r0 = r4.length()
            if (r9 >= r0) goto L_0x0273
            org.json.JSONObject r0 = r4.getJSONObject(r9)     // Catch:{ Exception -> 0x025b }
            java.lang.String r11 = "key"
            int r11 = r0.optInt(r11)     // Catch:{ Exception -> 0x025b }
            java.lang.String r12 = "value"
            java.lang.String r12 = r0.optString(r12)     // Catch:{ Exception -> 0x025b }
            if (r11 <= 0) goto L_0x0257
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x025b }
            if (r0 != 0) goto L_0x0257
            r14 = 15496(0x3c88, float:2.1715E-41)
            java.lang.String r15 = ","
            r16 = 3
            r13 = 4
            r10 = 2
            if (r11 != r14) goto L_0x00c5
            java.lang.String r0 = java.util.regex.Pattern.quote(r15)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String[] r0 = r12.split(r0)     // Catch:{ Exception -> 0x00b6 }
            int[] r14 = new int[r13]     // Catch:{ Exception -> 0x00b6 }
            r18 = 17
            r14[r8] = r18     // Catch:{ Exception -> 0x00b6 }
            r18 = 11
            r17 = 1
            r14[r17] = r18     // Catch:{ Exception -> 0x00b6 }
            r18 = 9
            r14[r10] = r18     // Catch:{ Exception -> 0x00b6 }
            r14[r16] = r10     // Catch:{ Exception -> 0x00b6 }
            r10 = 0
            r18 = 0
        L_0x0086:
            if (r10 >= r13) goto L_0x00aa
            r19 = r14[r10]     // Catch:{ Exception -> 0x00b6 }
            r13 = r0[r19]     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r20 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)     // Catch:{ Exception -> 0x00b6 }
            int r8 = r20.length()     // Catch:{ Exception -> 0x00b6 }
            r20 = r4
            r4 = 1024(0x400, float:1.435E-42)
            if (r8 <= r4) goto L_0x00a3
            r8 = 0
            java.lang.String r4 = r13.substring(r8, r4)     // Catch:{ Exception -> 0x00b4 }
            r0[r19] = r4     // Catch:{ Exception -> 0x00b4 }
            r18 = 1
        L_0x00a3:
            int r10 = r10 + 1
            r4 = r20
            r8 = 0
            r13 = 4
            goto L_0x0086
        L_0x00aa:
            r20 = r4
            if (r18 == 0) goto L_0x00c7
            java.lang.String r0 = u24.C90599h.m113515h(r0, r15)     // Catch:{ Exception -> 0x00b4 }
            r12 = r0
            goto L_0x00c7
        L_0x00b4:
            r0 = move-exception
            goto L_0x00b9
        L_0x00b6:
            r0 = move-exception
            r20 = r4
        L_0x00b9:
            java.lang.String r4 = "modify 15496 too large string-fields, e=%s"
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x01d2 }
            r8 = 0
            r10[r8] = r0     // Catch:{ Exception -> 0x01d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r10)     // Catch:{ Exception -> 0x01d2 }
            goto L_0x00c7
        L_0x00c5:
            r20 = r4
        L_0x00c7:
            r0 = 28287(0x6e7f, float:3.9639E-41)
            if (r11 != r0) goto L_0x0159
            java.lang.String r0 = java.util.regex.Pattern.quote(r15)     // Catch:{ Exception -> 0x014d }
            java.lang.String[] r0 = r12.split(r0)     // Catch:{ Exception -> 0x014d }
            r4 = 2
            r8 = r0[r4]     // Catch:{ Exception -> 0x014d }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x014d }
            long r13 = r4.longValue()     // Catch:{ Exception -> 0x014d }
            r4 = 12
            r4 = r0[r4]     // Catch:{ Exception -> 0x014d }
            r8 = 9
            r8 = r0[r8]     // Catch:{ Exception -> 0x014d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x014d }
            long r21 = r8.longValue()     // Catch:{ Exception -> 0x014d }
            r8 = 19
            r0 = r0[r8]     // Catch:{ Exception -> 0x014d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x014d }
            long r23 = r0.longValue()     // Catch:{ Exception -> 0x014d }
            java.lang.String r0 = "appLaunch"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x014d }
            java.lang.String r8 = "28287 Report openType:%s cost:(%d - %d = %d)ms"
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = "autoReLaunch"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x010d
            goto L_0x012d
        L_0x010d:
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x014d }
            r10 = 0
            r0[r10] = r4     // Catch:{ Exception -> 0x014d }
            java.lang.Long r4 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x014d }
            r10 = 1
            r0[r10] = r4     // Catch:{ Exception -> 0x014d }
            java.lang.Long r4 = java.lang.Long.valueOf(r21)     // Catch:{ Exception -> 0x014d }
            r10 = 2
            r0[r10] = r4     // Catch:{ Exception -> 0x014d }
            long r23 = r23 - r21
            java.lang.Long r4 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x014d }
            r0[r16] = r4     // Catch:{ Exception -> 0x014d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r0)     // Catch:{ Exception -> 0x014d }
            goto L_0x0159
        L_0x012d:
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x014d }
            r10 = 0
            r0[r10] = r4     // Catch:{ Exception -> 0x014d }
            java.lang.Long r4 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x014d }
            r10 = 1
            r0[r10] = r4     // Catch:{ Exception -> 0x014d }
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x014d }
            r10 = 2
            r0[r10] = r4     // Catch:{ Exception -> 0x014d }
            long r23 = r23 - r13
            java.lang.Long r4 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x014d }
            r0[r16] = r4     // Catch:{ Exception -> 0x014d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r0)     // Catch:{ Exception -> 0x014d }
            goto L_0x0159
        L_0x014d:
            r0 = move-exception
            java.lang.String r4 = "28287 Report fail e=%s"
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x01d2 }
            r8 = 0
            r10[r8] = r0     // Catch:{ Exception -> 0x01d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r10)     // Catch:{ Exception -> 0x01d2 }
        L_0x0159:
            java.lang.String r0 = "report kv_%d{appId='%s',pkgVersion=%d,pkgDebugType=%d,value='%s'}"
            r4 = 5
            r8 = 2
            if (r5 < r8) goto L_0x01d5
            java.lang.String r8 = r26.getAppId()     // Catch:{ Exception -> 0x01d2 }
            r10 = 1
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r8 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r8, r10)     // Catch:{ Exception -> 0x01d2 }
            if (r8 != 0) goto L_0x0175
            java.lang.String r0 = "fail NULL QualitySystem instance"
            java.lang.String r0 = r1.mo115109j(r0)     // Catch:{ Exception -> 0x01d2 }
            r2.mo109647a(r3, r0)     // Catch:{ Exception -> 0x01d2 }
            return
        L_0x0175:
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x01d2 }
            r14 = 0
            r10[r14] = r13     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r13 = r26.getAppId()     // Catch:{ Exception -> 0x01d2 }
            r14 = 1
            r10[r14] = r13     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r13 = r6.f261072r     // Catch:{ Exception -> 0x01d2 }
            int r13 = r13.pkgVersion     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01d2 }
            r14 = 2
            r10[r14] = r13     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r13 = r6.f261072r     // Catch:{ Exception -> 0x01d2 }
            int r13 = r13.f238585d     // Catch:{ Exception -> 0x01d2 }
            r14 = 1
            int r13 = r13 + r14
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01d2 }
            r10[r16] = r13     // Catch:{ Exception -> 0x01d2 }
            r13 = 4
            r10[r13] = r12     // Catch:{ Exception -> 0x01d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r10)     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.report.a r0 = com.tencent.p014mm.plugin.appbrand.report.C55548a.f158170a     // Catch:{ Exception -> 0x01d2 }
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r13 = r8.f245832d     // Catch:{ Exception -> 0x01d2 }
            r14 = 0
            r10[r14] = r13     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r13 = r8.f245833e     // Catch:{ Exception -> 0x01d2 }
            r14 = 1
            r10[r14] = r13     // Catch:{ Exception -> 0x01d2 }
            int r13 = r8.f245837i     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01d2 }
            r14 = 2
            r10[r14] = r13     // Catch:{ Exception -> 0x01d2 }
            int r13 = r8.f245834f     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01d2 }
            r10[r16] = r13     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8.f245835g     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01d2 }
            r13 = 4
            r10[r13] = r8     // Catch:{ Exception -> 0x01d2 }
            r10[r4] = r12     // Catch:{ Exception -> 0x01d2 }
            r0.mo77078b(r11, r10)     // Catch:{ Exception -> 0x01d2 }
            goto L_0x0259
        L_0x01d2:
            r0 = move-exception
            goto L_0x025e
        L_0x01d5:
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x01d2 }
            r10 = 0
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r8 = r26.getAppId()     // Catch:{ Exception -> 0x01d2 }
            r10 = 1
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r8 = r6.f261072r     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8.pkgVersion     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01d2 }
            r10 = 2
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r8 = r6.f261072r     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8.f238585d     // Catch:{ Exception -> 0x01d2 }
            r10 = 1
            int r8 = r8 + r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01d2 }
            r4[r16] = r8     // Catch:{ Exception -> 0x01d2 }
            r8 = 4
            r4[r8] = r12     // Catch:{ Exception -> 0x01d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)     // Catch:{ Exception -> 0x01d2 }
            r4 = 15496(0x3c88, float:2.1715E-41)
            if (r11 != r4) goto L_0x022e
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x01d2 }
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r8 = r26.getAppId()     // Catch:{ Exception -> 0x01d2 }
            r10 = 0
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r8 = r6.f261072r     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8.pkgVersion     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01d2 }
            r10 = 1
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r8 = r6.f261072r     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8.f238585d     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8 + r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01d2 }
            r10 = 2
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            r4[r16] = r12     // Catch:{ Exception -> 0x01d2 }
            r0.mo160131h(r11, r4)     // Catch:{ Exception -> 0x01d2 }
            goto L_0x0259
        L_0x022e:
            com.tencent.mm.plugin.appbrand.report.a r0 = com.tencent.p014mm.plugin.appbrand.report.C55548a.f158170a     // Catch:{ Exception -> 0x01d2 }
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01d2 }
            java.lang.String r8 = r26.getAppId()     // Catch:{ Exception -> 0x01d2 }
            r10 = 0
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r8 = r6.f261072r     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8.pkgVersion     // Catch:{ Exception -> 0x01d2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01d2 }
            r10 = 1
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r8 = r6.f261072r     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8.f238585d     // Catch:{ Exception -> 0x01d2 }
            int r8 = r8 + r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x01d2 }
            r10 = 2
            r4[r10] = r8     // Catch:{ Exception -> 0x01d2 }
            r4[r16] = r12     // Catch:{ Exception -> 0x01d2 }
            r0.mo77078b(r11, r4)     // Catch:{ Exception -> 0x01d2 }
            goto L_0x0259
        L_0x0257:
            r20 = r4
        L_0x0259:
            r8 = 0
            goto L_0x026d
        L_0x025b:
            r0 = move-exception
            r20 = r4
        L_0x025e:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r4[r8] = r0
            java.lang.String r0 = "AppBrandComponent parse report value failed : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r4)
        L_0x026d:
            int r9 = r9 + 1
            r4 = r20
            goto L_0x0040
        L_0x0273:
            java.lang.String r0 = "ok"
            java.lang.String r0 = r1.mo115109j(r0)
            r2.mo109647a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nm0.C89030h.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
