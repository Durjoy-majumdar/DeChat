package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.f1 */
public class C6236f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f22997d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f22998e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f22999f;

    public C6236f1(MsgHandler msgHandler, String str, C13851h1 h1Var) {
        this.f22999f = msgHandler;
        this.f22997d = str;
        this.f22998e = h1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "get_install_state:no"
            java.lang.String r2 = "versionName"
            java.lang.String r3 = ", versionName = "
            java.lang.String r4 = ", version = "
            java.lang.String r5 = ", packageInfo = "
            java.lang.String r6 = "doGetInstallState, packageName = "
            java.lang.String r7 = "null"
            java.lang.String r8 = "it is not batch get install state"
            java.lang.String r9 = "MicroMsg.MsgHandler"
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            java.lang.String r13 = r0.f22997d     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            r12.<init>(r13)     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            int r13 = r12.length()     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            if (r13 <= 0) goto L_0x00ca
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            r13.<init>()     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            r14.<init>()     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            r15 = 0
            r16 = 0
        L_0x002f:
            int r10 = r12.length()     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            if (r15 >= r10) goto L_0x009d
            java.lang.String r10 = r12.getString(r15)     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r11 = r0.f22999f     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            android.content.Context r11 = r11.f22697d     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            if (r11 == 0) goto L_0x0044
            android.content.pm.PackageInfo r11 = js0.C9512b.m9207a(r11, r10)     // Catch:{ JSONException -> 0x00d5, Exception -> 0x00ce }
            goto L_0x0045
        L_0x0044:
            r11 = 0
        L_0x0045:
            if (r11 != 0) goto L_0x004b
            r17 = r7
            r7 = 0
            goto L_0x004f
        L_0x004b:
            r17 = r7
            int r7 = r11.versionCode     // Catch:{ JSONException -> 0x00d7, Exception -> 0x00d0 }
        L_0x004f:
            if (r11 != 0) goto L_0x0056
            r18 = r12
            r12 = r17
            goto L_0x005a
        L_0x0056:
            r18 = r12
            java.lang.String r12 = r11.versionName     // Catch:{ JSONException -> 0x00d7, Exception -> 0x00d0 }
        L_0x005a:
            r19 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.<init>()     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.append(r6)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.append(r10)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.append(r5)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.append(r11)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.append(r4)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.append(r7)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.append(r3)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r8.append(r12)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            if (r16 != 0) goto L_0x0086
            if (r7 <= 0) goto L_0x0086
            r16 = 1
        L_0x0086:
            r13.put(r10, r7)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r14.put(r10, r12)     // Catch:{ JSONException -> 0x009b, Exception -> 0x0099 }
            r7 = 0
            com.tencent.p014mm.pluginsdk.model.app.C6648d0.m6937a(r10, r7)     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            int r15 = r15 + 1
            r7 = r17
            r12 = r18
            r8 = r19
            goto L_0x002f
        L_0x0099:
            r7 = 0
            goto L_0x00c4
        L_0x009b:
            r7 = 0
            goto L_0x00c7
        L_0x009d:
            r17 = r7
            r19 = r8
            r7 = 0
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            r8.<init>()     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            java.lang.String r10 = "result"
            r8.put(r10, r13)     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            r8.put(r2, r14)     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            if (r16 == 0) goto L_0x00bb
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r10 = r0.f22999f     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            t83.h1 r11 = r0.f22998e     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            java.lang.String r12 = "get_install_state:yes"
            r10.mo7210k5(r11, r12, r8)     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            goto L_0x00c3
        L_0x00bb:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = r0.f22999f     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            t83.h1 r10 = r0.f22998e     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
            r11 = 0
            r8.mo7210k5(r10, r1, r11)     // Catch:{ JSONException -> 0x00c7, Exception -> 0x00c4 }
        L_0x00c3:
            return
        L_0x00c4:
            r8 = r19
            goto L_0x00d1
        L_0x00c7:
            r8 = r19
            goto L_0x00d8
        L_0x00ca:
            r17 = r7
            r7 = 0
            goto L_0x00db
        L_0x00ce:
            r17 = r7
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            goto L_0x00db
        L_0x00d5:
            r17 = r7
        L_0x00d7:
            r7 = 0
        L_0x00d8:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
        L_0x00db:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = r0.f22999f
            android.content.Context r8 = r8.f22697d
            if (r8 == 0) goto L_0x00e8
            java.lang.String r10 = r0.f22997d
            android.content.pm.PackageInfo r11 = js0.C9512b.m9207a(r8, r10)
            goto L_0x00e9
        L_0x00e8:
            r11 = 0
        L_0x00e9:
            if (r11 != 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            int r7 = r11.versionCode
        L_0x00ee:
            if (r11 != 0) goto L_0x00f3
            r8 = r17
            goto L_0x00f5
        L_0x00f3:
            java.lang.String r8 = r11.versionName
        L_0x00f5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = r0.f22997d
            r10.append(r6)
            r10.append(r5)
            r10.append(r11)
            r10.append(r4)
            r10.append(r7)
            r10.append(r3)
            r10.append(r8)
            java.lang.String r3 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            if (r11 != 0) goto L_0x0126
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r2 = r0.f22999f
            t83.h1 r3 = r0.f22998e
            r4 = 0
            r2.mo7210k5(r3, r1, r4)
            goto L_0x0146
        L_0x0126:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.put(r2, r8)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r2 = r0.f22999f
            t83.h1 r3 = r0.f22998e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "get_install_state:yes_"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r2.mo7210k5(r3, r4, r1)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6236f1.run():void");
    }
}
