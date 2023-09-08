package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.g */
public final class C55527g extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 1101;
    public static final String NAME = "buyWCCoin";

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r9, org.json.JSONObject r10, int r11) {
        /*
            r8 = this;
            com.tencent.mm.plugin.appbrand.jsapi.k r9 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82554k) r9
            java.lang.String r0 = ""
            java.lang.String r1 = "safeGetString"
            if (r9 != 0) goto L_0x000a
            goto L_0x00f2
        L_0x000a:
            if (r10 != 0) goto L_0x000e
            goto L_0x00f2
        L_0x000e:
            java.lang.String r2 = "scene"
            r3 = 0
            r4 = 1
            r5 = 0
            boolean r6 = r10.has(r2)     // Catch:{ Exception -> 0x0023 }
            if (r6 != r4) goto L_0x001b
            r6 = 1
            goto L_0x001c
        L_0x001b:
            r6 = 0
        L_0x001c:
            if (r6 == 0) goto L_0x002b
            java.lang.String r2 = r10.getString(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x002c
        L_0x0023:
            r2 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r6)
        L_0x002b:
            r2 = r3
        L_0x002c:
            if (r2 == 0) goto L_0x0037
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r6 = 0
            goto L_0x0038
        L_0x0037:
            r6 = 1
        L_0x0038:
            if (r6 == 0) goto L_0x0079
            java.lang.String r10 = "MicroMsg.JsApiBuyWCCoin"
            java.lang.String r0 = "[WeCoin] doBuyWCCoin scene is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r10 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = "fail:jsapi invalid request data"
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r2 = "MicroMsg.AppBrandJsApi"
            if (r1 == 0) goto L_0x005b
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r1[r5] = r3
            r1[r4] = r0
            java.lang.String r3 = "makeReturnJson, errno: %d, reason: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r1)
        L_0x005b:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "errno"
            r1.put(r3, r10)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0070
        L_0x0066:
            r10 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r5] = r10
            java.lang.String r10 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r10, r3)
        L_0x0070:
            java.lang.String r10 = r8.mo115115p(r0, r1)
            r9.mo109647a(r11, r10)
            goto L_0x00f2
        L_0x0079:
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinRequest r6 = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.BuyWCCoinRequest
            r6.<init>()
            int r2 = java.lang.Integer.parseInt(r2)
            r6.f158112e = r2
            java.lang.String r2 = "mode"
            java.lang.String r2 = r10.optString(r2)
            java.lang.String r7 = "data.optString(\"mode\")"
            gy3.C87412m.m108593f(r2, r7)
            r6.f158114g = r2
            java.lang.String r2 = "panelShowType"
            java.lang.String r2 = r10.optString(r2)
            java.lang.String r7 = "data.optString(\"panelShowType\")"
            gy3.C87412m.m108593f(r2, r7)
            r6.f158113f = r2
            java.lang.String r2 = "productId"
            java.lang.String r2 = r10.optString(r2)
            java.lang.String r7 = "data.optString(\"productId\")"
            gy3.C87412m.m108593f(r2, r7)
            r6.f158116i = r2
            java.lang.String r2 = "agreementVersion"
            java.lang.String r2 = r10.optString(r2)
            java.lang.String r7 = "data.optString(\"agreementVersion\")"
            gy3.C87412m.m108593f(r2, r7)
            r6.f158117j = r2
            java.lang.String r2 = "customCount"
            java.lang.String r2 = r10.optString(r2)
            java.lang.String r7 = "data.optString(\"customCount\")"
            gy3.C87412m.m108593f(r2, r7)
            r6.f158115h = r2
            java.lang.String r2 = "businessId"
            boolean r7 = r10.has(r2)     // Catch:{ Exception -> 0x00d7 }
            if (r7 != r4) goto L_0x00cf
            r7 = 1
            goto L_0x00d0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            if (r7 == 0) goto L_0x00df
            java.lang.String r10 = r10.getString(r2)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00e0
        L_0x00d7:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r5] = r10
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r0, r2)
        L_0x00df:
            r10 = r3
        L_0x00e0:
            int r10 = com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToInt(r10)
            r6.f158111d = r10
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.f r10 = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.f
            r10.<init>(r9, r11, r8)
            android.content.Context r9 = r9.getContext()
            com.tencent.p014mm.plugin.appbrand.ipc.C81956c.m100675c(r9, r6, r10, r3)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C55527g.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
