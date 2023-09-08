package um0;

/* renamed from: um0.h */
public class C22659h extends C90704a {
    public static final int CTRL_INDEX = 899;
    public static final String NAME = "setDefaultTrafficCard";

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fa  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35773w(com.tencent.p014mm.plugin.appbrand.jsapi.C82554k r17, int r18, android.os.IInterface r19, org.json.JSONObject r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r0 = r19
            r4 = r20
            java.lang.String r5 = ""
            r6 = 2
            java.lang.String r7 = "fail:"
            r8 = 1
            r9 = 0
            r10 = 6
            java.lang.String r11 = "errCode"
            java.lang.String r12 = "MicroMsg.JsApiSetDefaultTrafficCard"
            if (r4 != 0) goto L_0x0060
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            um0.b r4 = um0.C22653b.f65159e
            int r5 = r4.f65181a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r11, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            java.lang.String r7 = r4.f65182b
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = r1.mo115112m(r5, r0)
            r2.mo109647a(r3, r0)
            int r0 = r4.f65181a
            java.lang.String r5 = "deviceData is null"
            r1.mo124833x(r10, r0, r5)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = r4.f65182b
            r0[r9] = r4
            java.lang.String r2 = r17.getAppId()
            r0[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r0[r6] = r2
            java.lang.String r2 = "deviceData is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r0)
            return
        L_0x0060:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.String r14 = "issuerID"
            java.lang.String r4 = r4.optString(r14)
            r13.put(r14, r4)
            java.lang.String r4 = "appID"
            java.lang.String r14 = "APP-WECHAT"
            r13.put(r4, r14)
            java.lang.String r4 = "mode"
            java.lang.String r14 = "0"
            r13.put(r4, r14)
            boolean r14 = r0 instanceof p349j9.C21196a
            if (r14 == 0) goto L_0x0087
            j9.a r0 = (p349j9.C21196a) r0     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r0 = r0.startSetDefault(r13)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0093
        L_0x0087:
            boolean r15 = r0 instanceof com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService     // Catch:{ Exception -> 0x00b4 }
            if (r15 == 0) goto L_0x0092
            com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService r0 = (com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService) r0     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r0 = r0.startSetDefault(r13)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0093
        L_0x0092:
            r0 = r5
        L_0x0093:
            java.lang.String r15 = "setDefaultCardString: [%s]! params: [%s]"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00b4 }
            r6[r9] = r0     // Catch:{ Exception -> 0x00b4 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b4 }
            r4.<init>(r13)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00b4 }
            r6[r8] = r4     // Catch:{ Exception -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r6)     // Catch:{ Exception -> 0x00b4 }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00b4 }
            if (r4 != 0) goto L_0x00c2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b4 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00c3
        L_0x00b4:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r0 = r0.getMessage()
            r4[r9] = r0
            java.lang.String r0 = "call remote interface fail: [%s] ! "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r4)
        L_0x00c2:
            r4 = 0
        L_0x00c3:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r4 != 0) goto L_0x00fa
            um0.b r4 = um0.C22653b.f65163i
            int r5 = r4.f65181a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r11, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            java.lang.String r6 = r4.f65182b
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = r1.mo115112m(r5, r0)
            r2.mo109647a(r3, r0)
            int r0 = r4.f65181a
            java.lang.String r2 = "call remote interface exception"
            r1.mo124833x(r10, r0, r2)
            java.lang.String r0 = "call remote interface exception."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            return
        L_0x00fa:
            java.lang.String r6 = "resultCode"
            int r4 = r4.optInt(r6)
            um0.b r6 = um0.C22653b.f65158d
            int r13 = r6.f65181a
            if (r4 == r13) goto L_0x014d
            if (r14 == 0) goto L_0x010d
            um0.b r5 = um0.C22653b.m26529a(r4)
            goto L_0x0111
        L_0x010d:
            um0.b r5 = um0.C22653b.m26530b(r4)
        L_0x0111:
            um0.b r6 = um0.C22653b.f65156K
            if (r5 != r6) goto L_0x0117
            um0.b r5 = um0.C22653b.f65152G
        L_0x0117:
            int r6 = r5.f65181a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r11, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            java.lang.String r7 = r5.f65182b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = r1.mo115112m(r6, r0)
            r2.mo109647a(r3, r0)
            int r0 = r5.f65181a
            java.lang.String r2 = r5.f65182b
            r1.mo124833x(r10, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r9] = r2
            java.lang.String r2 = "Return code from remote interface! with RetCode rechargeCard[%s] "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r2, r0)
            return
        L_0x014d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r0.put(r11, r4)
            java.lang.String r4 = r6.f65182b
            java.lang.String r0 = r1.mo115112m(r4, r0)
            r2.mo109647a(r3, r0)
            int r0 = r6.f65181a
            r1.mo124833x(r10, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um0.C22659h.mo35773w(com.tencent.mm.plugin.appbrand.jsapi.k, int, android.os.IInterface, org.json.JSONObject):void");
    }
}
