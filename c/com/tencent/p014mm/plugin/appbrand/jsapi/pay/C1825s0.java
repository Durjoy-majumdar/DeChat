package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.s0 */
public final class C1825s0 extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 1221;
    public static final String NAME = "requestWCPayRealnameVerify";

    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0379, code lost:
        r0 = r4.getRuntime().mo113026R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0384, code lost:
        if (r0 != null) goto L_0x03bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0386, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.JsApiRequestWCPayRealnameVerify", "activity is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x038d, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG == false) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x038f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x039f, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        r5.put("errno", 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x03a9, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03bc, code lost:
        r7 = com.tencent.p014mm.plugin.appbrand.C81682d.m100225e(r4.getAppId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03c4, code lost:
        if (r7 != null) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03c6, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.JsApiRequestWCPayRealnameVerify", "sysConfig is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x03ce, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG == false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03d0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03e0, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r5.put("errno", 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x03e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03ea, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x03fd, code lost:
        r12 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r4.getAppId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0405, code lost:
        if (r12 != null) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0407, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.JsApiRequestWCPayRealnameVerify", "runtime is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x040f, code lost:
        if (com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0411, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0421, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        r5.put("errno", 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x042a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x042b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x043e, code lost:
        p225rc.C89916g.m112446a(r0).mo124232f(new com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1823r0(r4, r3, r1));
        r2 = new android.content.Intent();
        r2.putExtra(r16, r22);
        r2.putExtra(r17, r18);
        r2.putExtra("packageExt", r19);
        r2.putExtra("signtype", r20);
        r2.putExtra("paySignature", r21);
        r2.putExtra("appId", r4.getAppId());
        r2.putExtra("wxapp_username", r7.f261061d);
        r2.putExtra("command_word", NAME);
        r2.putExtra("wxapp_path", r12.mo113042Z().getCurrentUrl());
        r2.putExtra("JSAPI_TYPE", "JSAPI_TYPE_TINYAPP");
        r2.putExtra("JSAPI_TYPE_TINYAPP_PARAMETER", new com.tencent.p014mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter(r5, r8));
        r2.setFlags(536870912);
        ke3.C88144b.m109795m(r0, "wallet_core", ".id_verify.WalletRealNameProcessProxyUI", r2, 34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016b  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r24, org.json.JSONObject r25, int r26) {
        /*
            r23 = this;
            r1 = r23
            r2 = r25
            r3 = r26
            r4 = r24
            com.tencent.mm.plugin.appbrand.jsapi.k r4 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82554k) r4
            java.lang.String r5 = "nonceStr"
            java.lang.String r6 = "timeStamp"
            java.lang.String r7 = "safeGetString"
            java.lang.String r8 = ""
            if (r4 != 0) goto L_0x0018
            goto L_0x04f2
        L_0x0018:
            if (r2 != 0) goto L_0x001c
            goto L_0x04f2
        L_0x001c:
            r10 = 0
            r11 = 1
            boolean r0 = r2.has(r6)     // Catch:{ Exception -> 0x0031 }
            if (r0 != r11) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r2.getString(r6)     // Catch:{ Exception -> 0x0031 }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r12 = r0
            goto L_0x003a
        L_0x0031:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r12)
            r12 = 0
        L_0x003a:
            if (r12 == 0) goto L_0x0045
            int r0 = r12.length()
            if (r0 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r0 = 0
            goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            java.lang.String r13 = "fail:jsapi invalid request data"
            java.lang.String r14 = "makeReturnJson with JSONObject, put errno, e=%s"
            java.lang.String r15 = "errno"
            java.lang.String r9 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r11 = "MicroMsg.AppBrandJsApi"
            java.lang.String r10 = "MicroMsg.JsApiRequestWCPayRealnameVerify"
            r16 = r6
            r6 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = "timeStamp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0072
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r5 = 0
            r0[r5] = r2
            r2 = 1
            r0[r2] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
        L_0x0072:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r2.put(r15, r6)     // Catch:{ Exception -> 0x007b }
            goto L_0x0086
        L_0x007b:
            r0 = move-exception
            r5 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x0086:
            java.lang.String r0 = r1.mo115115p(r13, r2)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x008f:
            r6 = 1
            boolean r0 = r2.has(r5)     // Catch:{ Exception -> 0x00a5 }
            if (r0 != r6) goto L_0x0098
            r0 = 1
            goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = r2.getString(r5)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r17 = r5
            r5 = r0
            goto L_0x00b2
        L_0x00a5:
            r0 = move-exception
            r17 = r5
            r6 = 1
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r6 = 0
            r5[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r5)
            r5 = 0
        L_0x00b2:
            if (r5 == 0) goto L_0x00bd
            int r0 = r5.length()
            if (r0 != 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r0 = 0
            goto L_0x00be
        L_0x00bd:
            r0 = 1
        L_0x00be:
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = "nonceStr is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x00dc
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 101(0x65, float:1.42E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r0[r6] = r5
            r5 = 1
            r0[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
            goto L_0x00de
        L_0x00dc:
            r2 = 101(0x65, float:1.42E-43)
        L_0x00de:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r2)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00f2
        L_0x00e7:
            r0 = move-exception
            r2 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x00f2:
            java.lang.String r0 = r1.mo115115p(r13, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x00fb:
            java.lang.String r0 = "package"
            boolean r6 = r2.has(r0)     // Catch:{ Exception -> 0x0115 }
            r18 = r5
            r5 = 1
            if (r6 != r5) goto L_0x0108
            r5 = 1
            goto L_0x0109
        L_0x0108:
            r5 = 0
        L_0x0109:
            if (r5 == 0) goto L_0x0112
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            goto L_0x0118
        L_0x0112:
            r0 = 0
        L_0x0113:
            r5 = r0
            goto L_0x0122
        L_0x0115:
            r0 = move-exception
            r18 = r5
        L_0x0118:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r6)
            r5 = 0
        L_0x0122:
            if (r5 == 0) goto L_0x012d
            int r0 = r5.length()
            if (r0 != 0) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            r0 = 0
            goto L_0x012e
        L_0x012d:
            r0 = 1
        L_0x012e:
            if (r0 == 0) goto L_0x016b
            java.lang.String r0 = "package is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x014c
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 101(0x65, float:1.42E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r0[r6] = r5
            r5 = 1
            r0[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
            goto L_0x014e
        L_0x014c:
            r2 = 101(0x65, float:1.42E-43)
        L_0x014e:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r2)     // Catch:{ Exception -> 0x0157 }
            goto L_0x0162
        L_0x0157:
            r0 = move-exception
            r2 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x0162:
            java.lang.String r0 = r1.mo115115p(r13, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x016b:
            java.lang.String r0 = "signType"
            boolean r6 = r2.has(r0)     // Catch:{ Exception -> 0x0186 }
            r19 = r5
            r5 = 1
            if (r6 != r5) goto L_0x0179
            r5 = 1
            goto L_0x017a
        L_0x0179:
            r5 = 0
        L_0x017a:
            if (r5 == 0) goto L_0x0183
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0181 }
            goto L_0x0184
        L_0x0181:
            r0 = move-exception
            goto L_0x0189
        L_0x0183:
            r0 = 0
        L_0x0184:
            r5 = r0
            goto L_0x0193
        L_0x0186:
            r0 = move-exception
            r19 = r5
        L_0x0189:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r6)
            r5 = 0
        L_0x0193:
            if (r5 == 0) goto L_0x019e
            int r0 = r5.length()
            if (r0 != 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            r0 = 0
            goto L_0x019f
        L_0x019e:
            r0 = 1
        L_0x019f:
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "signType is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x01be
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 101(0x65, float:1.42E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r0[r6] = r5
            r5 = 1
            r0[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
            goto L_0x01c0
        L_0x01be:
            r2 = 101(0x65, float:1.42E-43)
        L_0x01c0:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r2)     // Catch:{ Exception -> 0x01c9 }
            goto L_0x01d4
        L_0x01c9:
            r0 = move-exception
            r2 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x01d4:
            java.lang.String r0 = r1.mo115115p(r13, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x01dd:
            java.lang.String r0 = "paySign"
            boolean r6 = r2.has(r0)     // Catch:{ Exception -> 0x01f7 }
            r20 = r5
            r5 = 1
            if (r6 != r5) goto L_0x01ea
            r5 = 1
            goto L_0x01eb
        L_0x01ea:
            r5 = 0
        L_0x01eb:
            if (r5 == 0) goto L_0x01f4
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x01f2 }
            goto L_0x01f5
        L_0x01f2:
            r0 = move-exception
            goto L_0x01fa
        L_0x01f4:
            r0 = 0
        L_0x01f5:
            r5 = r0
            goto L_0x0204
        L_0x01f7:
            r0 = move-exception
            r20 = r5
        L_0x01fa:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r6)
            r5 = 0
        L_0x0204:
            if (r5 == 0) goto L_0x020f
            int r0 = r5.length()
            if (r0 != 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r0 = 0
            goto L_0x0210
        L_0x020f:
            r0 = 1
        L_0x0210:
            if (r0 == 0) goto L_0x024d
            java.lang.String r0 = "paySign is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x022e
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 101(0x65, float:1.42E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r0[r6] = r5
            r5 = 1
            r0[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
            goto L_0x0230
        L_0x022e:
            r2 = 101(0x65, float:1.42E-43)
        L_0x0230:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r2)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0244
        L_0x0239:
            r0 = move-exception
            r2 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x0244:
            java.lang.String r0 = r1.mo115115p(r13, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x024d:
            java.lang.String r0 = "scene"
            boolean r6 = r2.has(r0)     // Catch:{ Exception -> 0x0268 }
            r21 = r5
            r5 = 1
            if (r6 != r5) goto L_0x025b
            r5 = 1
            goto L_0x025c
        L_0x025b:
            r5 = 0
        L_0x025c:
            if (r5 == 0) goto L_0x0265
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0263 }
            goto L_0x0266
        L_0x0263:
            r0 = move-exception
            goto L_0x026b
        L_0x0265:
            r0 = 0
        L_0x0266:
            r5 = r0
            goto L_0x0275
        L_0x0268:
            r0 = move-exception
            r21 = r5
        L_0x026b:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r6)
            r5 = 0
        L_0x0275:
            if (r5 == 0) goto L_0x0280
            int r0 = r5.length()
            if (r0 != 0) goto L_0x027e
            goto L_0x0280
        L_0x027e:
            r0 = 0
            goto L_0x0281
        L_0x0280:
            r0 = 1
        L_0x0281:
            if (r0 == 0) goto L_0x02bf
            java.lang.String r0 = "scene is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x02a0
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 101(0x65, float:1.42E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r0[r6] = r5
            r5 = 1
            r0[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
            goto L_0x02a2
        L_0x02a0:
            r2 = 101(0x65, float:1.42E-43)
        L_0x02a2:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r2)     // Catch:{ Exception -> 0x02ab }
            goto L_0x02b6
        L_0x02ab:
            r0 = move-exception
            r2 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x02b6:
            java.lang.String r0 = r1.mo115115p(r13, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x02bf:
            java.lang.String r0 = "token"
            boolean r6 = r2.has(r0)     // Catch:{ Exception -> 0x02d7 }
            r22 = r12
            r12 = 1
            if (r6 != r12) goto L_0x02cd
            r6 = 1
            goto L_0x02ce
        L_0x02cd:
            r6 = 0
        L_0x02ce:
            if (r6 == 0) goto L_0x02e3
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x02d5 }
            goto L_0x02e4
        L_0x02d5:
            r0 = move-exception
            goto L_0x02da
        L_0x02d7:
            r0 = move-exception
            r22 = r12
        L_0x02da:
            r2 = 1
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r2 = 0
            r6[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r8, r6)
        L_0x02e3:
            r0 = 0
        L_0x02e4:
            if (r0 != 0) goto L_0x02e7
            goto L_0x02e8
        L_0x02e7:
            r8 = r0
        L_0x02e8:
            if (r5 == 0) goto L_0x04ba
            int r0 = r5.hashCode()
            switch(r0) {
                case -1695892960: goto L_0x0327;
                case 3208415: goto L_0x0316;
                case 1289205504: goto L_0x0305;
                case 1840570581: goto L_0x02f3;
                default: goto L_0x02f1;
            }
        L_0x02f1:
            goto L_0x04ba
        L_0x02f3:
            java.lang.String r0 = "fillCardInfoUI"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x02fd
            goto L_0x04ba
        L_0x02fd:
            java.lang.String r0 = "scene == fillCardInfoUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0379
        L_0x0305:
            java.lang.String r0 = "bindCardHomeUI"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x030f
            goto L_0x04ba
        L_0x030f:
            java.lang.String r0 = "scene == bindCardHomeUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0379
        L_0x0316:
            java.lang.String r0 = "home"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0320
            goto L_0x04ba
        L_0x0320:
            java.lang.String r0 = "scene == home"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            goto L_0x0379
        L_0x0327:
            java.lang.String r0 = "verifySMS"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0332
            goto L_0x04ba
        L_0x0332:
            int r0 = r8.length()
            if (r0 != 0) goto L_0x033a
            r0 = 1
            goto L_0x033b
        L_0x033a:
            r0 = 0
        L_0x033b:
            if (r0 == 0) goto L_0x0379
            java.lang.String r0 = "token is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x035a
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 101(0x65, float:1.42E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r0[r6] = r5
            r5 = 1
            r0[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
            goto L_0x035c
        L_0x035a:
            r2 = 101(0x65, float:1.42E-43)
        L_0x035c:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r2)     // Catch:{ Exception -> 0x0365 }
            goto L_0x0370
        L_0x0365:
            r0 = move-exception
            r2 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x0370:
            java.lang.String r0 = r1.mo115115p(r13, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x0379:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r4.getRuntime()
            android.app.Activity r0 = r0.mo113026R()
            java.lang.String r2 = "fail:internal error"
            r6 = 4
            if (r0 != 0) goto L_0x03bc
            java.lang.String r0 = "activity is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x039f
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r0[r7] = r5
            r5 = 1
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
        L_0x039f:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r6)     // Catch:{ Exception -> 0x03a8 }
            goto L_0x03b3
        L_0x03a8:
            r0 = move-exception
            r6 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 0
            r0[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x03b3:
            java.lang.String r0 = r1.mo115115p(r2, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x03bc:
            java.lang.String r7 = r4.getAppId()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r7 = com.tencent.p014mm.plugin.appbrand.C81682d.m100225e(r7)
            if (r7 != 0) goto L_0x03fd
            java.lang.String r0 = "sysConfig is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x03e0
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r0[r7] = r5
            r5 = 1
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
        L_0x03e0:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r6)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x03f4
        L_0x03e9:
            r0 = move-exception
            r6 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 0
            r0[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x03f4:
            java.lang.String r0 = r1.mo115115p(r2, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x03fd:
            java.lang.String r12 = r4.getAppId()
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r12 = com.tencent.p014mm.plugin.appbrand.C81682d.m100222b(r12)
            if (r12 != 0) goto L_0x043e
            java.lang.String r0 = "runtime is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0421
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r0[r7] = r5
            r5 = 1
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
        L_0x0421:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r15, r6)     // Catch:{ Exception -> 0x042a }
            goto L_0x0435
        L_0x042a:
            r0 = move-exception
            r6 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 0
            r0[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x0435:
            java.lang.String r0 = r1.mo115115p(r2, r5)
            r4.mo109647a(r3, r0)
            goto L_0x04f2
        L_0x043e:
            rc.g r2 = p225rc.C89916g.m112446a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.pay.r0 r6 = new com.tencent.mm.plugin.appbrand.jsapi.pay.r0
            r6.<init>(r4, r3, r1)
            r2.mo124232f(r6)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r3 = r16
            r9 = r22
            r2.putExtra(r3, r9)
            r3 = r17
            r6 = r18
            r2.putExtra(r3, r6)
            java.lang.String r3 = "packageExt"
            r6 = r19
            r2.putExtra(r3, r6)
            java.lang.String r3 = "signtype"
            r6 = r20
            r2.putExtra(r3, r6)
            java.lang.String r3 = "paySignature"
            r6 = r21
            r2.putExtra(r3, r6)
            java.lang.String r3 = r4.getAppId()
            java.lang.String r4 = "appId"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r7.f261061d
            java.lang.String r4 = "wxapp_username"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "command_word"
            java.lang.String r4 = "requestWCPayRealnameVerify"
            r2.putExtra(r3, r4)
            com.tencent.mm.plugin.appbrand.page.m0 r3 = r12.mo113042Z()
            java.lang.String r3 = r3.getCurrentUrl()
            java.lang.String r4 = "wxapp_path"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "JSAPI_TYPE"
            java.lang.String r4 = "JSAPI_TYPE_TINYAPP"
            r2.putExtra(r3, r4)
            com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter r3 = new com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter
            r3.<init>(r5, r8)
            java.lang.String r4 = "JSAPI_TYPE_TINYAPP_PARAMETER"
            r2.putExtra(r4, r3)
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r2.setFlags(r3)
            r3 = 34
            java.lang.String r4 = "wallet_core"
            java.lang.String r5 = ".id_verify.WalletRealNameProcessProxyUI"
            ke3.C88144b.m109795m(r0, r4, r5, r2, r3)
            goto L_0x04f2
        L_0x04ba:
            java.lang.String r0 = "scene not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            java.lang.String r2 = "fail scene not support"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x04d7
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0[r5] = r6
            r6 = 1
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r9, r0)
            goto L_0x04d8
        L_0x04d7:
            r5 = 0
        L_0x04d8:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r6.put(r15, r5)     // Catch:{ Exception -> 0x04e1 }
            goto L_0x04eb
        L_0x04e1:
            r0 = move-exception
            r7 = r0
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r5] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r14, r0)
        L_0x04eb:
            java.lang.String r0 = r1.mo115115p(r2, r6)
            r4.mo109647a(r3, r0)
        L_0x04f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1825s0.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
