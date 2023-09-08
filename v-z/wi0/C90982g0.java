package wi0;

/* renamed from: wi0.g0 */
public final class C90982g0 {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012 A[Catch:{ JSONException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0011 A[Catch:{ JSONException -> 0x006f }, RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionInfo m114149a(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L_0x000e
            int r3 = r4.length()     // Catch:{ JSONException -> 0x006f }
            if (r3 != 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r3 = 0
            goto L_0x000f
        L_0x000e:
            r3 = 1
        L_0x000f:
            if (r3 == 0) goto L_0x0012
            return r2
        L_0x0012:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006f }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x006f }
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r4 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo
            r4.<init>()
            r4.f239452d = r0
            java.lang.String r0 = "module_list"
            java.lang.String r0 = r3.optString(r0)
            java.util.List r0 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo.m100126a(r0)
            r4.f239460o = r0
            java.lang.String r0 = "widget_list"
            java.lang.String r0 = r3.optString(r0)
            java.util.List r0 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaWidgetInfo.m100128a(r0)
            r4.f239465t = r0
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r0 = r4.f239460o
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            r0 = r0 ^ r1
            r4.f239461p = r0
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "entrance_module"
            java.lang.String r0 = r3.optString(r0)
            goto L_0x004b
        L_0x0049:
            java.lang.String r0 = ""
        L_0x004b:
            r4.f239462q = r0
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo> r0 = r4.f239465t
            java.lang.String r1 = "separated_plugin_list"
            java.lang.String r1 = r3.optString(r1)
            r2 = 22
            java.util.List r0 = com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo.m100124b(r0, r1, r2)
            r4.f239458j = r0
            java.lang.String r0 = "client_js_ext_info"
            java.lang.String r0 = r3.optString(r0)
            r4.f239463r = r0
            java.lang.String r0 = "device_orientation"
            java.lang.String r0 = r3.optString(r0)
            r4.f239456h = r0
            return r4
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wi0.C90982g0.m114149a(java.lang.String):com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo");
    }
}
