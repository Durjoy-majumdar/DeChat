package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.i */
public final class C83067i extends C82268c<C82554k> {
    public static final int CTRL_INDEX = 1102;
    public static final String NAME = "consumeWCCoin";

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x017d A[SYNTHETIC, Splitter:B:111:0x017d] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01a7 A[SYNTHETIC, Splitter:B:127:0x01a7] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01d0 A[SYNTHETIC, Splitter:B:143:0x01d0] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012f A[Catch:{ Exception -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0131 A[Catch:{ Exception -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0134 A[Catch:{ Exception -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0152 A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0154 A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0157 A[Catch:{ Exception -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x015c  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r23, org.json.JSONObject r24, int r25) {
        /*
            r22 = this;
            r1 = r22
            r2 = r24
            r3 = r25
            r4 = r23
            com.tencent.mm.plugin.appbrand.jsapi.k r4 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82554k) r4
            java.lang.String r5 = "safeGetInt"
            java.lang.String r6 = "safeGetString"
            java.lang.String r7 = ""
            if (r4 != 0) goto L_0x0016
            goto L_0x02c3
        L_0x0016:
            if (r2 != 0) goto L_0x001a
            goto L_0x02c3
        L_0x001a:
            java.lang.String r0 = "buff"
            r9 = 0
            r10 = 1
            boolean r11 = r2.has(r0)     // Catch:{ Exception -> 0x0031 }
            if (r11 != r10) goto L_0x0026
            r11 = 1
            goto L_0x0027
        L_0x0026:
            r11 = 0
        L_0x0027:
            if (r11 == 0) goto L_0x002e
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0031 }
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r11 = r0
            goto L_0x003a
        L_0x0031:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r7, r11)
            r11 = 0
        L_0x003a:
            if (r11 == 0) goto L_0x0045
            int r0 = r11.length()
            if (r0 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r0 = 0
            goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            java.lang.String r12 = "makeReturnJson with JSONObject, put errno, e=%s"
            java.lang.String r13 = "errno"
            java.lang.String r14 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r15 = "MicroMsg.AppBrandJsApi"
            java.lang.String r8 = "fail:jsapi invalid request data"
            java.lang.String r10 = "MicroMsg.JsApiConsumeWCCoin"
            r9 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "buff is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x006f
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r5 = 0
            r0[r5] = r2
            r2 = 1
            r0[r2] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r0)
        L_0x006f:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r2.put(r13, r9)     // Catch:{ Exception -> 0x0078 }
            goto L_0x0083
        L_0x0078:
            r0 = move-exception
            r5 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
        L_0x0083:
            java.lang.String r0 = r1.mo115115p(r8, r2)
            r4.mo109647a(r3, r0)
            goto L_0x02c3
        L_0x008c:
            java.lang.String r0 = "businessId"
            boolean r9 = r2.has(r0)     // Catch:{ Exception -> 0x00a6 }
            r17 = r11
            r11 = 1
            if (r9 != r11) goto L_0x0099
            r9 = 1
            goto L_0x009a
        L_0x0099:
            r9 = 0
        L_0x009a:
            if (r9 == 0) goto L_0x00a3
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00a4
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a9
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            r9 = r0
            goto L_0x00b3
        L_0x00a6:
            r0 = move-exception
            r17 = r11
        L_0x00a9:
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r9 = 0
            r11[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r7, r11)
            r9 = 0
        L_0x00b3:
            if (r9 == 0) goto L_0x00be
            int r0 = r9.length()
            if (r0 != 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r0 = 0
            goto L_0x00bf
        L_0x00be:
            r0 = 1
        L_0x00bf:
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = "businessId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x00dd
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 101(0x65, float:1.42E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r0[r6] = r5
            r5 = 1
            r0[r5] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r0)
            goto L_0x00df
        L_0x00dd:
            r2 = 101(0x65, float:1.42E-43)
        L_0x00df:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r13, r2)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00f3
        L_0x00e8:
            r0 = move-exception
            r2 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
        L_0x00f3:
            java.lang.String r0 = r1.mo115115p(r8, r5)
            r4.mo109647a(r3, r0)
            goto L_0x02c3
        L_0x00fc:
            java.lang.String r0 = "mode"
            boolean r11 = r2.has(r0)     // Catch:{ Exception -> 0x0117 }
            r18 = r9
            r9 = 1
            if (r11 != r9) goto L_0x0109
            r9 = 1
            goto L_0x010a
        L_0x0109:
            r9 = 0
        L_0x010a:
            if (r9 == 0) goto L_0x0113
            int r0 = r2.getInt(r0)     // Catch:{ Exception -> 0x0111 }
            goto L_0x0114
        L_0x0111:
            r0 = move-exception
            goto L_0x011a
        L_0x0113:
            r0 = 0
        L_0x0114:
            r11 = r0
            r9 = 1
            goto L_0x0125
        L_0x0117:
            r0 = move-exception
            r18 = r9
        L_0x011a:
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r16 = 0
            r11[r16] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r7, r11)
            r11 = 0
        L_0x0125:
            java.lang.String r0 = "productWecoinPrice"
            boolean r9 = r2.has(r0)     // Catch:{ Exception -> 0x013d }
            r3 = 1
            if (r9 != r3) goto L_0x0131
            r3 = 1
            goto L_0x0132
        L_0x0131:
            r3 = 0
        L_0x0132:
            if (r3 == 0) goto L_0x0139
            int r0 = r2.getInt(r0)     // Catch:{ Exception -> 0x013d }
            goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            r5 = r0
            r3 = 1
            goto L_0x0149
        L_0x013d:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r16 = 0
            r9[r16] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r7, r9)
            r5 = 0
        L_0x0149:
            java.lang.String r0 = "productTitle"
            boolean r9 = r2.has(r0)     // Catch:{ Exception -> 0x0160 }
            if (r9 != r3) goto L_0x0154
            r3 = 1
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            if (r3 == 0) goto L_0x015c
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0160 }
            goto L_0x015d
        L_0x015c:
            r0 = 0
        L_0x015d:
            r9 = r0
            r3 = 1
            goto L_0x016c
        L_0x0160:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r16 = 0
            r9[r16] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r7, r9)
            r9 = 0
        L_0x016c:
            java.lang.String r0 = "productTitleInsufficient"
            boolean r3 = r2.has(r0)     // Catch:{ Exception -> 0x0188 }
            r19 = r5
            r5 = 1
            if (r3 != r5) goto L_0x017a
            r3 = 1
            goto L_0x017b
        L_0x017a:
            r3 = 0
        L_0x017b:
            if (r3 == 0) goto L_0x0184
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0182 }
            goto L_0x0185
        L_0x0182:
            r0 = move-exception
            goto L_0x018b
        L_0x0184:
            r0 = 0
        L_0x0185:
            r5 = r0
            r3 = 1
            goto L_0x0196
        L_0x0188:
            r0 = move-exception
            r19 = r5
        L_0x018b:
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r16 = 0
            r5[r16] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r7, r5)
            r5 = 0
        L_0x0196:
            java.lang.String r0 = "productWecoinRealPrice"
            boolean r3 = r2.has(r0)     // Catch:{ Exception -> 0x01b2 }
            r20 = r5
            r5 = 1
            if (r3 != r5) goto L_0x01a4
            r3 = 1
            goto L_0x01a5
        L_0x01a4:
            r3 = 0
        L_0x01a5:
            if (r3 == 0) goto L_0x01ae
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x01ac }
            goto L_0x01af
        L_0x01ac:
            r0 = move-exception
            goto L_0x01b5
        L_0x01ae:
            r0 = 0
        L_0x01af:
            r5 = r0
            r3 = 1
            goto L_0x01c0
        L_0x01b2:
            r0 = move-exception
            r20 = r5
        L_0x01b5:
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r16 = 0
            r5[r16] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r7, r5)
            r5 = 0
        L_0x01c0:
            java.lang.String r0 = "consumeTipsWording"
            boolean r3 = r2.has(r0)     // Catch:{ Exception -> 0x01d7 }
            r21 = r5
            r5 = 1
            if (r3 != r5) goto L_0x01cd
            r3 = 1
            goto L_0x01ce
        L_0x01cd:
            r3 = 0
        L_0x01ce:
            if (r3 == 0) goto L_0x01e3
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x01e4
        L_0x01d5:
            r0 = move-exception
            goto L_0x01da
        L_0x01d7:
            r0 = move-exception
            r21 = r5
        L_0x01da:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r7, r3)
        L_0x01e3:
            r0 = 0
        L_0x01e4:
            r2 = 2
            if (r11 != r2) goto L_0x027e
            if (r9 == 0) goto L_0x01f2
            int r2 = r9.length()
            if (r2 != 0) goto L_0x01f0
            goto L_0x01f2
        L_0x01f0:
            r2 = 0
            goto L_0x01f3
        L_0x01f2:
            r2 = 1
        L_0x01f3:
            if (r2 == 0) goto L_0x0233
            java.lang.String r0 = "productTitle is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0212
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 101(0x65, float:1.42E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r0[r5] = r3
            r3 = 1
            r0[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r0)
            goto L_0x0214
        L_0x0212:
            r2 = 101(0x65, float:1.42E-43)
        L_0x0214:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r3.put(r13, r2)     // Catch:{ Exception -> 0x021d }
            goto L_0x0228
        L_0x021d:
            r0 = move-exception
            r2 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r5 = 0
            r0[r5] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
        L_0x0228:
            java.lang.String r0 = r1.mo115115p(r8, r3)
            r2 = r25
            r4.mo109647a(r2, r0)
            goto L_0x02c3
        L_0x0233:
            r2 = r25
            if (r20 == 0) goto L_0x0240
            int r3 = r20.length()
            if (r3 != 0) goto L_0x023e
            goto L_0x0240
        L_0x023e:
            r3 = 0
            goto L_0x0241
        L_0x0240:
            r3 = 1
        L_0x0241:
            if (r3 == 0) goto L_0x0280
            java.lang.String r0 = "productTitleInsufficient is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0260
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 101(0x65, float:1.42E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r0[r6] = r5
            r5 = 1
            r0[r5] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r14, r0)
            goto L_0x0262
        L_0x0260:
            r3 = 101(0x65, float:1.42E-43)
        L_0x0262:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r13, r3)     // Catch:{ Exception -> 0x026b }
            goto L_0x0276
        L_0x026b:
            r0 = move-exception
            r3 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r12, r0)
        L_0x0276:
            java.lang.String r0 = r1.mo115115p(r8, r5)
            r4.mo109647a(r2, r0)
            goto L_0x02c3
        L_0x027e:
            r2 = r25
        L_0x0280:
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinRequest r3 = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.ConsumeWCCoinRequest
            r3.<init>()
            java.lang.String r5 = "<set-?>"
            r8 = r17
            gy3.C87412m.m108594g(r8, r5)
            r3.f242802d = r8
            r6 = r18
            gy3.C87412m.m108594g(r6, r5)
            r3.f242803e = r6
            r3.f242804f = r11
            if (r9 != 0) goto L_0x029a
            r9 = r7
        L_0x029a:
            r3.f242805g = r9
            if (r20 != 0) goto L_0x02a0
            r5 = r7
            goto L_0x02a2
        L_0x02a0:
            r5 = r20
        L_0x02a2:
            r3.f242806h = r5
            r5 = r19
            r3.f242807i = r5
            if (r21 != 0) goto L_0x02ac
            r5 = r7
            goto L_0x02ae
        L_0x02ac:
            r5 = r21
        L_0x02ae:
            r3.f242808j = r5
            if (r0 != 0) goto L_0x02b3
            goto L_0x02b4
        L_0x02b3:
            r7 = r0
        L_0x02b4:
            r3.f242809n = r7
            com.tencent.mm.plugin.appbrand.jsapi.wccoin.h r0 = new com.tencent.mm.plugin.appbrand.jsapi.wccoin.h
            r0.<init>(r4, r2, r1)
            android.content.Context r2 = r4.getContext()
            r4 = 0
            com.tencent.p014mm.plugin.appbrand.ipc.C81956c.m100675c(r2, r3, r0, r4)
        L_0x02c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.wccoin.C83067i.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
