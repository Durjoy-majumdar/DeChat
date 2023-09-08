package um0;

/* renamed from: um0.c */
public class C22654c extends C90704a {
    public static final int CTRL_INDEX = 895;
    public static final String NAME = "checkTrafficCardConditions";

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00db A[Catch:{ Exception -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8 A[Catch:{ Exception -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f5 A[Catch:{ Exception -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0119 A[ADDED_TO_REGION] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35773w(com.tencent.p014mm.plugin.appbrand.jsapi.C82554k r22, int r23, android.os.IInterface r24, org.json.JSONObject r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r0 = r24
            r4 = r25
            java.lang.String r5 = ""
            r6 = 3
            java.lang.String r7 = "fail:"
            java.lang.String r8 = "errCode"
            java.lang.String r9 = "MicroMsg.JsApiCheckTrafficCardConditions"
            r10 = 1
            r11 = 2
            r12 = 0
            if (r4 != 0) goto L_0x005f
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            um0.b r4 = um0.C22653b.f65159e
            int r5 = r4.f65181a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r8, r5)
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
            r1.mo124833x(r11, r0, r5)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r4 = r4.f65182b
            r0[r12] = r4
            java.lang.String r2 = r22.getAppId()
            r0[r10] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r0[r11] = r2
            java.lang.String r2 = "deviceData is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r2, r0)
            return
        L_0x005f:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.String r14 = "issuerID"
            java.lang.String r15 = r4.optString(r14)
            java.lang.String r11 = "serviceID"
            java.lang.String r4 = r4.optString(r11)
            java.lang.String r6 = "issueCardService"
            boolean r6 = r6.equals(r4)
            r13.put(r14, r15)
            boolean r14 = r0 instanceof p349j9.C21196a
            if (r14 == 0) goto L_0x009f
            r18 = r0
            j9.a r18 = (p349j9.C21196a) r18     // Catch:{ Exception -> 0x0103 }
            java.lang.String r18 = r18.queryCplc()     // Catch:{ Exception -> 0x0103 }
            if (r6 == 0) goto L_0x0090
            r15 = r0
            j9.a r15 = (p349j9.C21196a) r15     // Catch:{ Exception -> 0x0103 }
            java.lang.String r15 = r15.checkIssueConditions(r13)     // Catch:{ Exception -> 0x0103 }
            goto L_0x0091
        L_0x0090:
            r15 = r5
        L_0x0091:
            r13.put(r11, r4)     // Catch:{ Exception -> 0x0103 }
            j9.a r0 = (p349j9.C21196a) r0     // Catch:{ Exception -> 0x0103 }
            java.lang.String r0 = r0.checkServiceStatus(r13)     // Catch:{ Exception -> 0x0103 }
            r20 = r5
        L_0x009c:
            r4 = r18
            goto L_0x00d5
        L_0x009f:
            boolean r15 = r0 instanceof com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService     // Catch:{ Exception -> 0x0103 }
            if (r15 == 0) goto L_0x00cf
            r15 = r0
            com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService r15 = (com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService) r15     // Catch:{ Exception -> 0x0103 }
            java.lang.String r18 = r15.queryCplc()     // Catch:{ Exception -> 0x0103 }
            if (r6 == 0) goto L_0x00c1
            r15 = r0
            com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService r15 = (com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService) r15     // Catch:{ Exception -> 0x0103 }
            java.lang.String r15 = r15.checkIssueConditions(r13)     // Catch:{ Exception -> 0x0103 }
            java.lang.String r12 = "issueConditions: [%s]! "
            r20 = r5
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0101 }
            r19 = 0
            r5[r19] = r15     // Catch:{ Exception -> 0x0101 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r5)     // Catch:{ Exception -> 0x0101 }
            goto L_0x00c5
        L_0x00c1:
            r20 = r5
            r15 = r20
        L_0x00c5:
            r13.put(r11, r4)     // Catch:{ Exception -> 0x0101 }
            com.tencent.mm.sdk.trafficcard.ITencentSmartcardOpenService r0 = (com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService) r0     // Catch:{ Exception -> 0x0101 }
            java.lang.String r0 = r0.checkServiceStatus(r13)     // Catch:{ Exception -> 0x0101 }
            goto L_0x009c
        L_0x00cf:
            r20 = r5
            r0 = r20
            r4 = r0
            r15 = r4
        L_0x00d5:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0101 }
            if (r5 != 0) goto L_0x00e1
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0101 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0101 }
            goto L_0x00e2
        L_0x00e1:
            r5 = 0
        L_0x00e2:
            boolean r4 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x00fe }
            if (r4 != 0) goto L_0x00ee
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fe }
            r4.<init>(r15)     // Catch:{ Exception -> 0x00fe }
            goto L_0x00ef
        L_0x00ee:
            r4 = 0
        L_0x00ef:
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00fc }
            if (r11 != 0) goto L_0x0116
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fc }
            r11.<init>(r0)     // Catch:{ Exception -> 0x00fc }
            r15 = r11
            goto L_0x0117
        L_0x00fc:
            r0 = move-exception
            goto L_0x0108
        L_0x00fe:
            r0 = move-exception
            r4 = 0
            goto L_0x0108
        L_0x0101:
            r0 = move-exception
            goto L_0x0106
        L_0x0103:
            r0 = move-exception
            r20 = r5
        L_0x0106:
            r4 = 0
            r5 = 0
        L_0x0108:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r0 = r0.getMessage()
            r12 = 0
            r11[r12] = r0
            java.lang.String r0 = "call remote interface fail: [%s] ! "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r11)
        L_0x0116:
            r15 = 0
        L_0x0117:
            if (r5 == 0) goto L_0x020b
            if (r6 == 0) goto L_0x011d
            if (r4 == 0) goto L_0x020b
        L_0x011d:
            if (r15 != 0) goto L_0x0121
            goto L_0x020b
        L_0x0121:
            java.lang.String r0 = "resultCode"
            int r11 = r5.optInt(r0)
            int r12 = r15.optInt(r0)
            if (r6 == 0) goto L_0x0132
            int r0 = r4.optInt(r0)
            goto L_0x0133
        L_0x0132:
            r0 = 0
        L_0x0133:
            r13 = 3
            int[] r15 = new int[r13]
            r17 = 0
            r15[r17] = r11
            r15[r10] = r0
            r16 = 2
            r15[r16] = r12
            r24 = r4
            r10 = 0
        L_0x0143:
            java.lang.String r4 = "data"
            if (r10 >= r13) goto L_0x01bc
            r13 = r15[r10]
            r25 = r15
            um0.b r15 = um0.C22653b.f65158d
            int r15 = r15.f65181a
            if (r13 != r15) goto L_0x0157
            int r10 = r10 + 1
            r15 = r25
            r13 = 3
            goto L_0x0143
        L_0x0157:
            if (r14 == 0) goto L_0x015e
            um0.b r6 = um0.C22653b.m26529a(r13)
            goto L_0x0162
        L_0x015e:
            um0.b r6 = um0.C22653b.m26530b(r13)
        L_0x0162:
            um0.b r10 = um0.C22653b.f65156K
            if (r6 != r10) goto L_0x0168
            um0.b r6 = um0.C22653b.f65177w
        L_0x0168:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            int r13 = r6.f65181a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10.put(r8, r13)
            if (r11 != 0) goto L_0x017f
            org.json.JSONObject r5 = r5.optJSONObject(r4)
            r10.put(r4, r5)
        L_0x017f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r5 = r6.f65182b
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r1.mo115112m(r4, r10)
            r2.mo109647a(r3, r4)
            int r2 = r6.f65181a
            java.lang.String r3 = r6.f65182b
            r4 = 2
            r1.mo124833x(r4, r2, r3)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r5 = 0
            r2[r5] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r2[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2[r4] = r0
            java.lang.String r0 = "Return code from huawei remote interface! with RetCode cplc[%s] issueConditions[%s] serviceStatus [%s] "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r2)
            return
        L_0x01bc:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            um0.b r0 = um0.C22653b.f65158d
            int r0 = r0.f65181a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.put(r8, r0)
            org.json.JSONObject r5 = r5.optJSONObject(r4)
            if (r6 == 0) goto L_0x01f4
            r0 = r24
            boolean r6 = r0.has(r4)
            if (r6 == 0) goto L_0x01f4
            java.lang.String r6 = "customData"
            org.json.JSONObject r0 = r0.optJSONObject(r4)     // Catch:{ Exception -> 0x01e4 }
            r5.put(r6, r0)     // Catch:{ Exception -> 0x01e4 }
            goto L_0x01f4
        L_0x01e4:
            r0 = move-exception
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r6[r8] = r0
            java.lang.String r0 = "checkIssueConditions do not contains data: [%s] ! "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r6)
        L_0x01f4:
            r7.put(r4, r5)
            um0.b r0 = um0.C22653b.f65158d
            java.lang.String r4 = r0.f65182b
            java.lang.String r4 = r1.mo115112m(r4, r7)
            r2.mo109647a(r3, r4)
            int r0 = r0.f65181a
            r2 = r20
            r3 = 2
            r1.mo124833x(r3, r0, r2)
            return
        L_0x020b:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            um0.b r4 = um0.C22653b.f65163i
            int r5 = r4.f65181a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r8, r5)
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
            r3 = 2
            r1.mo124833x(r3, r0, r2)
            java.lang.String r0 = "call remote interface exception."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um0.C22654c.mo35773w(com.tencent.mm.plugin.appbrand.jsapi.k, int, android.os.IInterface, org.json.JSONObject):void");
    }
}
