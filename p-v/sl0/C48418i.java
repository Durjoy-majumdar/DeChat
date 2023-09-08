package sl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import kr0.C88267e;

/* renamed from: sl0.i */
public final class C48418i extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1153;
    public static final String NAME = "nativeWXPayCgiTunnel";

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r25, org.json.JSONObject r26, int r27) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            r2 = r27
            r3 = r25
            kr0.e r3 = (kr0.C88267e) r3
            java.lang.String r4 = "makeReturnJson with JSONObject, put errno, e=%s"
            java.lang.String r5 = "errno"
            java.lang.String r6 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r7 = "MicroMsg.AppBrandJsApi"
            java.lang.String r8 = "fail:jsapi invalid request data"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r11 = "MicroMsg.JsApiNativeWXPayCgiTunnel"
            java.lang.String r12 = "start nativeWXPayCgiTunnel"
            v20.C90741c.m113809b(r11, r12, r10)
            if (r3 != 0) goto L_0x0023
            goto L_0x022f
        L_0x0023:
            if (r0 != 0) goto L_0x0027
            goto L_0x022f
        L_0x0027:
            com.tencent.mm.plugin.appbrand.page.t1 r10 = r3.mo114341l0()
            if (r10 == 0) goto L_0x0032
            java.lang.String r10 = r10.mo116162Q0()
            goto L_0x0033
        L_0x0032:
            r10 = 0
        L_0x0033:
            r17 = r10
            java.lang.String r18 = r3.getAppId()
            android.app.Activity r10 = r3.mo114344o0()
            r12 = 1000(0x3e8, float:1.401E-42)
            if (r10 == 0) goto L_0x0077
            android.content.Intent r10 = r10.getIntent()
            if (r10 == 0) goto L_0x0077
            android.os.Bundle r10 = r10.getExtras()
            if (r10 == 0) goto L_0x0077
            java.lang.String r13 = "key_appbrand_stat_object"
            java.lang.Object r13 = r10.get(r13)
            boolean r14 = r13 instanceof com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject
            if (r14 == 0) goto L_0x005b
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r13 = (com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject) r13
            int r12 = r13.f245533f
        L_0x005b:
            java.lang.String r13 = "key_appbrand_init_config"
            java.lang.Object r10 = r10.get(r13)
            boolean r13 = r10 instanceof com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC
            if (r13 == 0) goto L_0x0077
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r10 = (com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC) r10
            java.lang.String r13 = r10.f234839s
            java.lang.String r14 = "conf.username"
            gy3.C87412m.m108593f(r13, r14)
            int r10 = r10.f234802F
            r22 = r10
            r19 = r12
            r21 = r13
            goto L_0x007f
        L_0x0077:
            java.lang.String r10 = ""
            r21 = r10
            r19 = r12
            r22 = 0
        L_0x007f:
            r10 = 2
            r15 = 101(0x65, float:1.42E-43)
            r14 = 1
            java.lang.String r12 = "cgi_id"
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x01f6 }
            int r16 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r9)     // Catch:{ JSONException -> 0x01f6 }
            if (r16 > 0) goto L_0x00c7
            java.lang.String r0 = "nativeWXPayCgiTunnel cgi_id 0"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00c2 }
            v20.C90741c.m113808a(r11, r0, r12)     // Catch:{ JSONException -> 0x00c2 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x00c2 }
            if (r0 == 0) goto L_0x00a7
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ JSONException -> 0x00c2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r12     // Catch:{ JSONException -> 0x00c2 }
            r0[r14] = r8     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x00a7:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c2 }
            r12.<init>()     // Catch:{ JSONException -> 0x00c2 }
            r12.put(r5, r15)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00b9
        L_0x00b0:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r13     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x00b9:
            java.lang.String r0 = r1.mo115115p(r8, r12)     // Catch:{ JSONException -> 0x00c2 }
            r3.mo109647a(r2, r0)     // Catch:{ JSONException -> 0x00c2 }
            goto L_0x022f
        L_0x00c2:
            r25 = 101(0x65, float:1.42E-43)
            goto L_0x01f9
        L_0x00c7:
            java.lang.String r12 = "cgi_url"
            java.lang.String r13 = r0.getString(r12)     // Catch:{ JSONException -> 0x01f6 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{ JSONException -> 0x01f6 }
            if (r12 == 0) goto L_0x0106
            java.lang.String r0 = "nativeWXPayCgiTunnel cgi_url nil"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00c2 }
            v20.C90741c.m113808a(r11, r0, r12)     // Catch:{ JSONException -> 0x00c2 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x00c2 }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ JSONException -> 0x00c2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r12     // Catch:{ JSONException -> 0x00c2 }
            r0[r14] = r8     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x00eb:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c2 }
            r12.<init>()     // Catch:{ JSONException -> 0x00c2 }
            r12.put(r5, r15)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00fd
        L_0x00f4:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r13     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x00fd:
            java.lang.String r0 = r1.mo115115p(r8, r12)     // Catch:{ JSONException -> 0x00c2 }
            r3.mo109647a(r2, r0)     // Catch:{ JSONException -> 0x00c2 }
            goto L_0x022f
        L_0x0106:
            java.lang.String r12 = "cgiUrl"
            gy3.C87412m.m108593f(r13, r12)     // Catch:{ JSONException -> 0x01f6 }
            java.lang.String r12 = "/cgi-bin/mmpay-bin/tunnel_"
            boolean r12 = z04.C112551y.m153819s(r13, r12, r9)     // Catch:{ JSONException -> 0x01f6 }
            if (r12 != 0) goto L_0x0146
            java.lang.String r0 = "nativeWXPayCgiTunnel cgi_url invalid"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00c2 }
            v20.C90741c.m113808a(r11, r0, r12)     // Catch:{ JSONException -> 0x00c2 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x00c2 }
            if (r0 == 0) goto L_0x012b
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ JSONException -> 0x00c2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r12     // Catch:{ JSONException -> 0x00c2 }
            r0[r14] = r8     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x012b:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c2 }
            r12.<init>()     // Catch:{ JSONException -> 0x00c2 }
            r12.put(r5, r15)     // Catch:{ Exception -> 0x0134 }
            goto L_0x013d
        L_0x0134:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r13     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x013d:
            java.lang.String r0 = r1.mo115115p(r8, r12)     // Catch:{ JSONException -> 0x00c2 }
            r3.mo109647a(r2, r0)     // Catch:{ JSONException -> 0x00c2 }
            goto L_0x022f
        L_0x0146:
            java.lang.String r12 = "reqbuf"
            java.lang.String r20 = r0.getString(r12)     // Catch:{ JSONException -> 0x01f6 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)     // Catch:{ JSONException -> 0x01f6 }
            if (r12 == 0) goto L_0x0185
            java.lang.String r0 = "nativeWXPayCgiTunnel reqbuf nil"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00c2 }
            v20.C90741c.m113808a(r11, r0, r12)     // Catch:{ JSONException -> 0x00c2 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x00c2 }
            if (r0 == 0) goto L_0x016a
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ JSONException -> 0x00c2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r12     // Catch:{ JSONException -> 0x00c2 }
            r0[r14] = r8     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x016a:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c2 }
            r12.<init>()     // Catch:{ JSONException -> 0x00c2 }
            r12.put(r5, r15)     // Catch:{ Exception -> 0x0173 }
            goto L_0x017c
        L_0x0173:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r13     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x017c:
            java.lang.String r0 = r1.mo115115p(r8, r12)     // Catch:{ JSONException -> 0x00c2 }
            r3.mo109647a(r2, r0)     // Catch:{ JSONException -> 0x00c2 }
            goto L_0x022f
        L_0x0185:
            java.lang.String r12 = "cmd"
            java.lang.String r0 = r0.getString(r12)     // Catch:{ JSONException -> 0x01f6 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ JSONException -> 0x01f6 }
            if (r12 == 0) goto L_0x01c3
            java.lang.String r0 = "nativeWXPayCgiTunnel cmd nil"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00c2 }
            v20.C90741c.m113808a(r11, r0, r12)     // Catch:{ JSONException -> 0x00c2 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ JSONException -> 0x00c2 }
            if (r0 == 0) goto L_0x01a9
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ JSONException -> 0x00c2 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r12     // Catch:{ JSONException -> 0x00c2 }
            r0[r14] = r8     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x01a9:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c2 }
            r12.<init>()     // Catch:{ JSONException -> 0x00c2 }
            r12.put(r5, r15)     // Catch:{ Exception -> 0x01b2 }
            goto L_0x01bb
        L_0x01b2:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ JSONException -> 0x00c2 }
            r0[r9] = r13     // Catch:{ JSONException -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r0)     // Catch:{ JSONException -> 0x00c2 }
        L_0x01bb:
            java.lang.String r0 = r1.mo115115p(r8, r12)     // Catch:{ JSONException -> 0x00c2 }
            r3.mo109647a(r2, r0)     // Catch:{ JSONException -> 0x00c2 }
            goto L_0x022f
        L_0x01c3:
            java.lang.String r12 = "start send nativeWXPayCgiTunnel cgi"
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x01f6 }
            v20.C90741c.m113809b(r11, r12, r14)     // Catch:{ JSONException -> 0x01f6 }
            java.lang.Class<xz.d> r12 = p275xz.C53485d.class
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ JSONException -> 0x01f6 }
            xz.d r12 = (p275xz.C53485d) r12     // Catch:{ JSONException -> 0x01f6 }
            r23 = 1
            r14 = r16
            r25 = 101(0x65, float:1.42E-43)
            r15 = r20
            r16 = r0
            r20 = r23
            ob0.c r0 = r12.mo74152Ga(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x01f4 }
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r12 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ JSONException -> 0x01f4 }
            com.tencent.mm.ipcinvoker.wx_extension.j r12 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r12     // Catch:{ JSONException -> 0x01f4 }
            sl0.h r13 = new sl0.h     // Catch:{ JSONException -> 0x01f4 }
            r13.<init>(r3, r2, r1)     // Catch:{ JSONException -> 0x01f4 }
            r12.mo63014eH(r0, r13)     // Catch:{ JSONException -> 0x01f4 }
            goto L_0x022f
        L_0x01f4:
            goto L_0x01f9
        L_0x01f6:
            r25 = 101(0x65, float:1.42E-43)
            goto L_0x01f4
        L_0x01f9:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r12 = "mini app nativeWXPayCgiTunnel parameter error"
            v20.C90741c.m113808a(r11, r12, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0213
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r25)
            r0[r9] = r10
            r10 = 1
            r0[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r0)
            goto L_0x0214
        L_0x0213:
            r10 = 1
        L_0x0214:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r11 = 101(0x65, float:1.42E-43)
            r6.put(r5, r11)     // Catch:{ Exception -> 0x021f }
            goto L_0x0228
        L_0x021f:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r4, r0)
        L_0x0228:
            java.lang.String r0 = r1.mo115115p(r8, r6)
            r3.mo109647a(r2, r0)
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl0.C48418i.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
