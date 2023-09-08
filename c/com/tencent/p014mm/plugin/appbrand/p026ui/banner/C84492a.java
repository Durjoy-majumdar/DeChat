package com.tencent.p014mm.plugin.appbrand.p026ui.banner;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import di3.C86301e;
import ei3.C86522b;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.a */
public final class C84492a extends C86301e implements C84497j {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: PG */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.p026ui.banner.BannerModel mo117174PG() {
        /*
            r7 = this;
            boolean r0 = f40.C86709a0.m107522a()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x000a
            goto L_0x0057
        L_0x000a:
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.banner.c> r0 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84493c.class
            monitor-enter(r0)
            f40.o r4 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0088 }
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()     // Catch:{ all -> 0x0088 }
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_APP_BRAND_CHATTING_BANNER_INFO_STRING_SYNC     // Catch:{ all -> 0x0088 }
            java.lang.String r6 = ""
            java.lang.Object r4 = r4.mo119685f(r5, r6)     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0088 }
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 == 0) goto L_0x0027
            goto L_0x0057
        L_0x0027:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0056 }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x0056 }
            int r4 = r0.length()     // Catch:{ JSONException -> 0x0056 }
            int r5 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84493c.C84494a.f246613i     // Catch:{ JSONException -> 0x0056 }
            if (r4 == r5) goto L_0x0035
            goto L_0x0057
        L_0x0035:
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ JSONException -> 0x0056 }
            r5 = 0
        L_0x0038:
            int r6 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84493c.C84494a.f246613i     // Catch:{ JSONException -> 0x0056 }
            if (r5 >= r6) goto L_0x0047
            java.lang.String r6 = ""
            java.lang.String r6 = r0.optString(r5, r6)     // Catch:{ JSONException -> 0x0056 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x0056 }
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0047:
            r0 = r4[r3]     // Catch:{ JSONException -> 0x0056 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0056 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)     // Catch:{ JSONException -> 0x0056 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0056 }
            r4[r3] = r0     // Catch:{ JSONException -> 0x0056 }
            goto L_0x0058
        L_0x0056:
        L_0x0057:
            r4 = r1
        L_0x0058:
            if (r4 != 0) goto L_0x005b
            goto L_0x0087
        L_0x005b:
            com.tencent.mm.plugin.appbrand.ui.banner.BannerModel r1 = new com.tencent.mm.plugin.appbrand.ui.banner.BannerModel
            r1.<init>()
            com.tencent.mm.plugin.appbrand.ui.banner.c$a r0 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84493c.C84494a.appId
            r0 = r4[r2]
            java.lang.String r0 = (java.lang.String) r0
            r1.f246603d = r0
            r0 = r4[r3]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.f246604e = r0
            r0 = 2
            r0 = r4[r0]
            java.lang.String r0 = (java.lang.String) r0
            r1.f246605f = r0
            r0 = 3
            r0 = r4[r0]
            java.lang.String r0 = (java.lang.String) r0
            r1.f246606g = r0
            r0 = 4
            r0 = r4[r0]
            java.lang.String r0 = (java.lang.String) r0
            r1.f246607h = r0
        L_0x0087:
            return r1
        L_0x0088:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.banner.C84492a.mo117174PG():com.tencent.mm.plugin.appbrand.ui.banner.BannerModel");
    }
}
