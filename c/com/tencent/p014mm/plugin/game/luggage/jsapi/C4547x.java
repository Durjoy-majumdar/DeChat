package com.tencent.p014mm.plugin.game.luggage.jsapi;

import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.x */
public class C4547x extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "getLiteAppSwitch";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[Catch:{ JSONException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[Catch:{ JSONException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078 A[Catch:{ JSONException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be A[Catch:{ JSONException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0 A[Catch:{ JSONException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9 A[Catch:{ JSONException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb A[Catch:{ JSONException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa A[Catch:{ JSONException -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb A[Catch:{ JSONException -> 0x0116 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5384d(android.content.Context r23, java.lang.String r24, com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2.C5947b r25) {
        /*
            r22 = this;
            r1 = r25
            java.lang.String r0 = ","
            java.lang.String r2 = "needPkg"
            java.lang.String r3 = "appId"
            java.lang.String r4 = "MicroMsg.JsApiGetLiteAppSwitch"
            java.lang.Class<tt.e> r5 = p244tt.C14088e.class
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r7 = 0
            r8 = 0
            org.json.JSONObject r9 = com.tencent.p014mm.plugin.webview.luggage.util.C6013c.m5893e(r24)     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r10 = "switch"
            if (r9 == 0) goto L_0x010a
            boolean r11 = r9.has(r3)     // Catch:{ JSONException -> 0x0116 }
            if (r11 != 0) goto L_0x0024
            goto L_0x010a
        L_0x0024:
            java.lang.String r3 = r9.getString(r3)     // Catch:{ JSONException -> 0x0116 }
            di3.d r11 = di3.C86312j.m106911c(r5)     // Catch:{ JSONException -> 0x0116 }
            tt.e r11 = (p244tt.C14088e) r11     // Catch:{ JSONException -> 0x0116 }
            boolean r11 = r11.mo13530uu(r3)     // Catch:{ JSONException -> 0x0116 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()     // Catch:{ JSONException -> 0x0116 }
            r13 = 1
            if (r12 != 0) goto L_0x003e
            if (r11 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r12 = 0
            goto L_0x003f
        L_0x003e:
            r12 = 1
        L_0x003f:
            java.lang.String r14 = "isLiteAppCanOpen value: %s"
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ JSONException -> 0x0116 }
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x0116 }
            r15[r8] = r16     // Catch:{ JSONException -> 0x0116 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r14, r15)     // Catch:{ JSONException -> 0x0116 }
            boolean r14 = r9.has(r2)     // Catch:{ JSONException -> 0x0116 }
            if (r14 == 0) goto L_0x0057
            boolean r2 = r9.getBoolean(r2)     // Catch:{ JSONException -> 0x0116 }
            goto L_0x0058
        L_0x0057:
            r2 = 1
        L_0x0058:
            di3.d r9 = di3.C86312j.m106911c(r5)     // Catch:{ JSONException -> 0x0116 }
            tt.e r9 = (p244tt.C14088e) r9     // Catch:{ JSONException -> 0x0116 }
            com.tencent.liteapp.storage.WxaLiteAppInfo r9 = r9.mo13509NR(r3)     // Catch:{ JSONException -> 0x0116 }
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ JSONException -> 0x0116 }
            r16 = 1293(0x50d, double:6.39E-321)
            r18 = 80
            r20 = 1
            r14 = r15
            r23 = r15
            r15 = r16
            r17 = r18
            r19 = r20
            r14.mo175913w(r15, r17, r19)     // Catch:{ JSONException -> 0x0116 }
            if (r12 == 0) goto L_0x00b1
            r15 = 1293(0x50d, double:6.39E-321)
            r17 = 81
            r19 = 1
            r14 = r23
            r14.mo175913w(r15, r17, r19)     // Catch:{ JSONException -> 0x0116 }
            if (r9 != 0) goto L_0x00b1
            di3.d r14 = di3.C86312j.m106911c(r5)     // Catch:{ JSONException -> 0x0116 }
            tt.e r14 = (p244tt.C14088e) r14     // Catch:{ JSONException -> 0x0116 }
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r14 = r14.mo13512Tg()     // Catch:{ JSONException -> 0x0116 }
            if (r14 != 0) goto L_0x009a
            di3.d r14 = di3.C86312j.m106911c(r5)     // Catch:{ JSONException -> 0x0116 }
            tt.e r14 = (p244tt.C14088e) r14     // Catch:{ JSONException -> 0x0116 }
            r14.Mk0()     // Catch:{ JSONException -> 0x0116 }
        L_0x009a:
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ JSONException -> 0x0116 }
            tt.e r5 = (p244tt.C14088e) r5     // Catch:{ JSONException -> 0x0116 }
            r5.u50(r3, r7)     // Catch:{ JSONException -> 0x0116 }
            if (r2 == 0) goto L_0x00b1
            r15 = 1293(0x50d, double:6.39E-321)
            r17 = 82
            r19 = 1
            r14 = r23
            r14.mo175913w(r15, r17, r19)     // Catch:{ JSONException -> 0x0116 }
            r12 = 0
        L_0x00b1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0116 }
            r5.<init>()     // Catch:{ JSONException -> 0x0116 }
            r5.append(r3)     // Catch:{ JSONException -> 0x0116 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0116 }
            if (r2 == 0) goto L_0x00c0
            r2 = 1
            goto L_0x00c1
        L_0x00c0:
            r2 = 0
        L_0x00c1:
            r5.append(r2)     // Catch:{ JSONException -> 0x0116 }
            r5.append(r0)     // Catch:{ JSONException -> 0x0116 }
            if (r12 == 0) goto L_0x00cb
            r0 = 1
            goto L_0x00cc
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            r5.append(r0)     // Catch:{ JSONException -> 0x0116 }
            r0 = 20982(0x51f6, float:2.9402E-41)
            java.lang.String r2 = r5.toString()     // Catch:{ JSONException -> 0x0116 }
            r3 = r23
            r3.kvStat(r0, r2)     // Catch:{ JSONException -> 0x0116 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0116 }
            r0.<init>()     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r2 = "debug:false, coolassist:"
            r0.append(r2)     // Catch:{ JSONException -> 0x0116 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()     // Catch:{ JSONException -> 0x0116 }
            r0.append(r2)     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r2 = ", enable:"
            r0.append(r2)     // Catch:{ JSONException -> 0x0116 }
            r0.append(r11)     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r2 = ",info:"
            r0.append(r2)     // Catch:{ JSONException -> 0x0116 }
            if (r9 != 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r13 = 0
        L_0x00fc:
            r0.append(r13)     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0116 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ JSONException -> 0x0116 }
            r6.put(r10, r12)     // Catch:{ JSONException -> 0x0116 }
            goto L_0x011e
        L_0x010a:
            java.lang.String r0 = "invalid appId"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)     // Catch:{ JSONException -> 0x0116 }
            r6.put(r10, r8)     // Catch:{ JSONException -> 0x0116 }
            r1.mo6945a(r7, r6)     // Catch:{ JSONException -> 0x0116 }
            return
        L_0x0116:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)
        L_0x011e:
            r1.mo6945a(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.jsapi.C4547x.mo5384d(android.content.Context, java.lang.String, com.tencent.mm.plugin.webview.luggage.jsapi.m2$b):void");
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
