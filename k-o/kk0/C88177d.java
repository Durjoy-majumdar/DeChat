package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;

/* renamed from: kk0.d */
public class C88177d extends C82268c {
    private static final int CTRL_INDEX = 183;
    private static final String NAME = "getBLEDeviceCharacteristics";

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0214, code lost:
        if (r13.f256605e == null) goto L_0x0216;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0284  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r19, org.json.JSONObject r20, int r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            r3 = r21
            r4 = 151(0x97, float:2.12E-43)
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100982a(r4)
            r4 = 153(0x99, float:2.14E-43)
            r5 = 2
            r6 = 1
            r7 = 0
            java.lang.String r8 = "errno"
            java.lang.String r9 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r10 = "MicroMsg.AppBrandJsApi"
            java.lang.String r11 = "errCode"
            java.lang.String r12 = "MicroMsg.JsApiGetBLEDeviceCharacteristics"
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "getBLEDeviceCharacteristics data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12 = 10013(0x271d, float:1.4031E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.put(r11, r12)
            java.lang.String r11 = "fail:invalid data"
            r12 = 101(0x65, float:1.42E-43)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r13 == 0) goto L_0x0046
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r5[r7] = r13
            r5[r6] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r5)
        L_0x0046:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r0.put(r8, r5)
            java.lang.String r0 = r1.mo115114o(r11, r0)
            r2.mo109647a(r3, r0)
            r0 = 154(0x9a, float:2.16E-43)
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r0)
            return
        L_0x005a:
            java.lang.String r13 = r19.getAppId()
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r14[r7] = r13
            java.lang.String r13 = r20.toString()
            r14[r6] = r13
            java.lang.String r13 = "appId:%s getBLEDeviceCharacteristics data %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r14)
            java.lang.String r13 = r19.getAppId()
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c r13 = com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a.m100947b(r13)
            if (r13 != 0) goto L_0x00b4
            java.lang.String r0 = "bleWorker is null, may not open ble"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.put(r11, r12)
            r11 = 1500101(0x16e3c5, float:2.102089E-39)
            java.lang.String r12 = "fail:not init"
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r13 == 0) goto L_0x00a0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r5[r7] = r13
            r5[r6] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r5)
        L_0x00a0:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r0.put(r8, r5)
            java.lang.String r0 = r1.mo115114o(r12, r0)
            r2.mo109647a(r3, r0)
            r0 = 156(0x9c, float:2.19E-43)
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r0)
            return
        L_0x00b4:
            boolean r14 = sk0.C90216b.m112933b()
            if (r14 != 0) goto L_0x00f7
            java.lang.String r0 = "adapter is null or not enabled!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12 = 10001(0x2711, float:1.4014E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.put(r11, r12)
            java.lang.String r11 = "fail:not available"
            r12 = 1500102(0x16e3c6, float:2.10209E-39)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r13 == 0) goto L_0x00e3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r5[r7] = r13
            r5[r6] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r5)
        L_0x00e3:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r0.put(r8, r5)
            java.lang.String r0 = r1.mo115114o(r11, r0)
            r2.mo109647a(r3, r0)
            r0 = 158(0x9e, float:2.21E-43)
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r0)
            return
        L_0x00f7:
            java.lang.String r14 = "deviceId"
            java.lang.String r14 = r0.optString(r14)
            java.lang.String r15 = "serviceId"
            java.lang.String r0 = r0.optString(r15)
            mk0.b r13 = r13.mo114615h()
            if (r13 == 0) goto L_0x0216
            nk0.f r13 = r13.f256136a
            java.util.Map<java.lang.String, nk0.g> r13 = r13.f256596b
            java.lang.String r15 = "MicroMsg.Ble.BleConnectMgr"
            if (r13 != 0) goto L_0x011b
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r13 = "getCharacteristics, connectWorkers is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r15, r13, r0)
            goto L_0x0216
        L_0x011b:
            java.util.concurrent.ConcurrentHashMap r13 = (java.util.concurrent.ConcurrentHashMap) r13
            java.lang.Object r13 = r13.get(r14)
            nk0.g r13 = (nk0.C89007g) r13
            if (r13 != 0) goto L_0x012e
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r13 = "getCharacteristics, connectWorker is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r15, r13, r0)
            goto L_0x0216
        L_0x012e:
            android.bluetooth.BluetoothGatt r14 = r13.f256605e
            if (r14 != 0) goto L_0x013d
            java.lang.String r0 = r13.f256601a
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.String r14 = "[getCharacteristics] bluetoothGatt is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r14, r13)
            goto L_0x0216
        L_0x013d:
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r15 == 0) goto L_0x014e
            java.lang.String r0 = r13.f256601a
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.String r14 = "[getCharacteristics] serviceId is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r14, r13)
            goto L_0x0216
        L_0x014e:
            boolean r15 = sk0.C90216b.m112937f(r0)
            if (r15 != 0) goto L_0x015f
            java.lang.String r0 = r13.f256601a
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.String r14 = "[getCharacteristics] serviceId is illegal, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r14, r13)
            goto L_0x0216
        L_0x015f:
            java.util.Map<java.lang.String, java.util.List<qk0.c>> r15 = r13.f256607g
            if (r15 != 0) goto L_0x016e
            java.lang.String r0 = r13.f256601a
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.String r14 = "[getCharacteristics] bluetoothCharacteristics is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r14, r13)
            goto L_0x0216
        L_0x016e:
            java.util.concurrent.ConcurrentHashMap r15 = (java.util.concurrent.ConcurrentHashMap) r15
            java.lang.Object r16 = r15.get(r0)
            java.util.List r16 = (java.util.List) r16
            if (r16 != 0) goto L_0x0208
            java.util.UUID r4 = java.util.UUID.fromString(r0)
            android.bluetooth.BluetoothGattService r4 = r14.getService(r4)
            if (r4 != 0) goto L_0x018d
            java.lang.String r0 = r13.f256601a
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r13 = "[getCharacteristics] bluetoothGattServices is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r13, r4)
            goto L_0x0216
        L_0x018d:
            java.util.List r4 = r4.getCharacteristics()
            if (r4 != 0) goto L_0x019e
            java.lang.String r0 = r13.f256601a
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r13 = "[getCharacteristics] characteristics is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r13, r4)
            goto L_0x0216
        L_0x019e:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x01a7:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x0202
            java.lang.Object r16 = r4.next()
            android.bluetooth.BluetoothGattCharacteristic r16 = (android.bluetooth.BluetoothGattCharacteristic) r16
            qk0.c r5 = new qk0.c
            r5.<init>()
            java.util.UUID r17 = r16.getUuid()
            java.lang.String r17 = r17.toString()
            java.lang.String r6 = r17.toUpperCase()
            r5.f257949a = r6
            int r6 = r16.getProperties()
            r17 = r6 & 2
            if (r17 <= 0) goto L_0x01cf
            r7 = 1
        L_0x01cf:
            r5.f257950b = r7
            r7 = r6 & 8
            if (r7 <= 0) goto L_0x01d7
            r7 = 1
            goto L_0x01d8
        L_0x01d7:
            r7 = 0
        L_0x01d8:
            r5.f257951c = r7
            r7 = r6 & 4
            if (r7 <= 0) goto L_0x01e0
            r7 = 1
            goto L_0x01e1
        L_0x01e0:
            r7 = 0
        L_0x01e1:
            r5.f257952d = r7
            r7 = r6 & 16
            if (r7 <= 0) goto L_0x01e9
            r7 = 1
            goto L_0x01ea
        L_0x01e9:
            r7 = 0
        L_0x01ea:
            r5.f257953e = r7
            r6 = r6 & 32
            if (r6 <= 0) goto L_0x01f2
            r6 = 1
            goto L_0x01f3
        L_0x01f2:
            r6 = 0
        L_0x01f3:
            r5.f257954f = r6
            int r6 = r16.getInstanceId()
            r5.f257955g = r6
            r14.add(r5)
            r5 = 2
            r6 = 1
            r7 = 0
            goto L_0x01a7
        L_0x0202:
            r15.put(r0, r14)
            r16 = r14
            goto L_0x0212
        L_0x0208:
            java.lang.String r0 = r13.f256601a
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = "[getCharacteristics] use cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r5)
        L_0x0212:
            android.bluetooth.BluetoothGatt r0 = r13.f256605e
            if (r0 != 0) goto L_0x0218
        L_0x0216:
            r16 = 0
        L_0x0218:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r16 == 0) goto L_0x02ae
            int r4 = r16.size()
            if (r4 > 0) goto L_0x0227
            goto L_0x02ae
        L_0x0227:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Iterator r5 = r16.iterator()
        L_0x0230:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0255
            java.lang.Object r0 = r5.next()
            qk0.c r0 = (qk0.C89688c) r0
            org.json.JSONObject r0 = r0.mo124014a()     // Catch:{ JSONException -> 0x0244 }
            r4.put(r0)     // Catch:{ JSONException -> 0x0244 }
            goto L_0x0230
        L_0x0244:
            r0 = move-exception
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r6 = 0
            r7[r6] = r0
            java.lang.String r0 = "JSONException %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r7)
            goto L_0x0230
        L_0x0255:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "characteristics"
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x0266 }
            r4 = 0
            r5.put(r11, r4)     // Catch:{ JSONException -> 0x0264 }
            goto L_0x026f
        L_0x0264:
            r0 = move-exception
            goto L_0x0268
        L_0x0266:
            r0 = move-exception
            r4 = 0
        L_0x0268:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r7, r6)
        L_0x026f:
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r7 = r5.toString()
            r0[r4] = r7
            java.lang.String r7 = "retJson %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r0)
            java.lang.String r7 = "ok"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0292
            r11 = 2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r0[r4] = r11
            r0[r6] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r0)
        L_0x0292:
            r5.put(r8, r4)     // Catch:{ Exception -> 0x0296 }
            goto L_0x02a1
        L_0x0296:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r8
            java.lang.String r4 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r4, r0)
        L_0x02a1:
            java.lang.String r0 = r1.mo115115p(r7, r5)
            r2.mo109647a(r3, r0)
            r0 = 152(0x98, float:2.13E-43)
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100982a(r0)
            return
        L_0x02ae:
            java.lang.String r4 = "not found characteristic"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r4)
            r4 = 10005(0x2715, float:1.402E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r11, r4)
            java.lang.String r4 = "fail:no characteristic"
            r5 = 1509002(0x17068a, float:2.114562E-39)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r6 == 0) goto L_0x02d5
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r11 = 0
            r6[r11] = r7
            r7 = 1
            r6[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r6)
        L_0x02d5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.put(r8, r5)
            java.lang.String r0 = r1.mo115114o(r4, r0)
            r2.mo109647a(r3, r0)
            r0 = 159(0x9f, float:2.23E-43)
            r2 = 153(0x99, float:2.14E-43)
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kk0.C88177d.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
