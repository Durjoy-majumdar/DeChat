package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89696k;

/* renamed from: kk0.l */
public class C88188l extends C82268c {
    private static final int CTRL_INDEX = 186;
    private static final String NAME = "notifyBLECharacteristicValueChanged";

    /* renamed from: kk0.l$a */
    public class C88189a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f254987a;

        /* renamed from: b */
        public final /* synthetic */ int f254988b;

        public C88189a(C82381f fVar, int i) {
            this.f254987a = fVar;
            this.f254988b = i;
        }

        /* renamed from: a */
        public void mo114631a(C89696k kVar) {
            if (kVar.f257988a != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(kVar.f257988a));
                this.f254987a.mo109647a(this.f254988b, C88188l.this.mo115110k(kVar.f257989b, kVar.f257990c, hashMap));
                C82241i.m100982a(43);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 0);
            C82381f fVar = this.f254987a;
            int i = this.f254988b;
            C88188l lVar = C88188l.this;
            lVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            fVar.mo109647a(i, lVar.mo115114o("ok", hashMap2));
            C82241i.m100982a(42);
        }
    }

    /* renamed from: kk0.l$b */
    public class C88190b implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ String f254990a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f254991b;

        /* renamed from: c */
        public final /* synthetic */ int f254992c;

        public C88190b(String str, C82381f fVar, int i) {
            this.f254990a = str;
            this.f254991b = fVar;
            this.f254992c = i;
        }

        /* renamed from: a */
        public void mo114631a(C89696k kVar) {
            Log.m105925i("MicroMsg.JsApiNotifyBLECharacteristicValueChanged", "appId:%s notifyBLECharacteristicValueChanged result:%s", this.f254990a, kVar);
            if (kVar.f257988a != 0) {
                new HashMap().put("errCode", Integer.valueOf(kVar.f257988a));
                this.f254991b.mo109647a(this.f254992c, C88188l.this.mo115111l(kVar.f257989b, kVar.f257990c, (JSONObject) null));
                C82241i.m100982a(43);
                return;
            }
            new HashMap().put("errCode", 0);
            C82381f fVar = this.f254991b;
            int i = this.f254992c;
            C88188l lVar = C88188l.this;
            lVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, lVar.mo115115p("ok", jSONObject));
            C82241i.m100982a(42);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x028d, code lost:
        if (r7.f256605e == null) goto L_0x02a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ed  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r28, org.json.JSONObject r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = 71
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100982a(r4)
            r4 = 73
            r5 = 2
            r6 = 1
            r7 = 0
            java.lang.String r8 = "errno"
            java.lang.String r9 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r10 = "MicroMsg.AppBrandJsApi"
            java.lang.String r11 = "errCode"
            java.lang.String r12 = "MicroMsg.JsApiNotifyBLECharacteristicValueChanged"
            if (r2 != 0) goto L_0x005a
            java.lang.String r2 = "JsApiNotifyBLECharacteristicValueChanged data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r12 = 10013(0x271d, float:1.4031E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2.put(r11, r12)
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
            r2.put(r8, r5)
            java.lang.String r2 = r0.mo115114o(r11, r2)
            r1.mo109647a(r3, r2)
            r1 = 74
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r1)
            return
        L_0x005a:
            java.lang.String r13 = r28.getAppId()
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r14[r7] = r13
            java.lang.String r15 = r29.toString()
            r14[r6] = r15
            java.lang.String r15 = "appId:%s notifyBLECharacteristicValueChanged data %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r14)
            java.lang.String r14 = r28.getAppId()
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c r14 = com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a.m100947b(r14)
            if (r14 != 0) goto L_0x00b4
            java.lang.String r2 = "bleWorker is null, may not open ble"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r12 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2.put(r11, r12)
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
            r2.put(r8, r5)
            java.lang.String r2 = r0.mo115114o(r12, r2)
            r1.mo109647a(r3, r2)
            r1 = 76
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r1)
            return
        L_0x00b4:
            boolean r15 = sk0.C90216b.m112933b()
            if (r15 != 0) goto L_0x00f7
            java.lang.String r2 = "adapter is null or not enabled!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r12 = 10001(0x2711, float:1.4014E-41)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2.put(r11, r12)
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
            r2.put(r8, r5)
            java.lang.String r2 = r0.mo115114o(r11, r2)
            r1.mo109647a(r3, r2)
            r1 = 79
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r1)
            return
        L_0x00f7:
            java.lang.String r15 = "deviceId"
            java.lang.String r15 = r2.optString(r15)
            java.lang.String r4 = "serviceId"
            java.lang.String r4 = r2.optString(r4)
            java.lang.String r5 = "characteristicId"
            java.lang.String r5 = r2.optString(r5)
            java.lang.String r6 = "handle"
            boolean r16 = r2.has(r6)
            r17 = 0
            if (r16 == 0) goto L_0x011e
            int r6 = r2.getInt(r6)     // Catch:{ Exception -> 0x011d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x011d }
            goto L_0x0120
        L_0x011d:
        L_0x011e:
            r6 = r17
        L_0x0120:
            java.lang.String r7 = "state"
            boolean r7 = r2.optBoolean(r7)
            r18 = r7
            java.lang.String r7 = "indication"
            r19 = r13
            java.lang.String r13 = "type"
            java.lang.String r13 = r2.optString(r13, r7)
            r20 = r7
            java.lang.String r7 = "debug"
            r21 = r13
            r13 = 0
            boolean r7 = r2.optBoolean(r7, r13)
            r22 = r7
            java.lang.String r7 = "mainThread"
            boolean r2 = r2.optBoolean(r7, r13)
            mk0.b r7 = r14.mo114615h()
            if (r7 == 0) goto L_0x02a1
            nk0.f r7 = r7.f256136a
            java.util.Map<java.lang.String, nk0.g> r7 = r7.f256596b
            r23 = r14
            java.lang.String r14 = "MicroMsg.Ble.BleConnectMgr"
            if (r7 != 0) goto L_0x015f
            java.lang.Object[] r7 = new java.lang.Object[r13]
            java.lang.String r13 = "getCharacteristic, connectWorkers is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r13, r7)
            goto L_0x01c5
        L_0x015f:
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            java.lang.Object r7 = r7.get(r15)
            nk0.g r7 = (nk0.C89007g) r7
            if (r7 != 0) goto L_0x0172
            r13 = 0
            java.lang.Object[] r7 = new java.lang.Object[r13]
            java.lang.String r13 = "getCharacteristic, connectWorker is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r13, r7)
            goto L_0x01c5
        L_0x0172:
            android.bluetooth.BluetoothGatt r13 = r7.f256605e
            if (r13 != 0) goto L_0x0181
            java.lang.String r7 = r7.f256601a
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.String r13 = "[getCharacteristic] bluetoothGatt is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r13, r14)
            goto L_0x01c5
        L_0x0181:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r14 != 0) goto L_0x0290
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r14 == 0) goto L_0x018f
            goto L_0x0290
        L_0x018f:
            boolean r14 = sk0.C90216b.m112937f(r4)
            if (r14 != 0) goto L_0x01a0
            java.lang.String r7 = r7.f256601a
            r14 = 0
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.String r14 = "[getCharacteristics] serviceId is illegal, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r14, r13)
            goto L_0x01c5
        L_0x01a0:
            boolean r14 = sk0.C90216b.m112937f(r5)
            if (r14 != 0) goto L_0x01b1
            java.lang.String r7 = r7.f256601a
            r14 = 0
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.String r14 = "[getCharacteristics] characteristicId is illegal, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r14, r13)
            goto L_0x01c5
        L_0x01b1:
            java.util.UUID r14 = java.util.UUID.fromString(r4)
            android.bluetooth.BluetoothGattService r13 = r13.getService(r14)
            if (r13 != 0) goto L_0x01cb
            java.lang.String r7 = r7.f256601a
            r14 = 0
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.String r14 = "[getCharacteristic] bluetoothGattServices is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r14, r13)
        L_0x01c5:
            r29 = r2
            r25 = r4
            goto L_0x02a7
        L_0x01cb:
            java.util.UUID r14 = java.util.UUID.fromString(r5)
            r24 = r15
            java.lang.String r15 = "MicroMsg.Ble.BleConnectWorker"
            if (r6 == 0) goto L_0x0215
            r29 = r2
            r25 = r4
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r2 = 0
            r4[r2] = r6
            java.lang.String r2 = "[getCharacteristic] handle: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r4)
            java.util.List r2 = r13.getCharacteristics()
            java.util.Iterator r2 = r2.iterator()
        L_0x01ec:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0212
            java.lang.Object r4 = r2.next()
            android.bluetooth.BluetoothGattCharacteristic r4 = (android.bluetooth.BluetoothGattCharacteristic) r4
            java.util.UUID r13 = r4.getUuid()
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x01ec
            int r13 = r6.intValue()
            r26 = r2
            int r2 = r4.getInstanceId()
            if (r13 != r2) goto L_0x020f
            goto L_0x021d
        L_0x020f:
            r2 = r26
            goto L_0x01ec
        L_0x0212:
            r4 = r17
            goto L_0x021d
        L_0x0215:
            r29 = r2
            r25 = r4
            android.bluetooth.BluetoothGattCharacteristic r4 = r13.getCharacteristic(r14)
        L_0x021d:
            if (r4 != 0) goto L_0x022b
            java.lang.String r2 = r7.f256601a
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r4 = "[getCharacteristic] characteristics is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r7)
            goto L_0x02a9
        L_0x022b:
            qk0.c r2 = new qk0.c
            r2.<init>()
            java.util.UUID r13 = r4.getUuid()
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r13.toUpperCase()
            r2.f257949a = r13
            int r13 = r4.getProperties()
            r14 = r13 & 2
            if (r14 <= 0) goto L_0x0248
            r14 = 1
            goto L_0x0249
        L_0x0248:
            r14 = 0
        L_0x0249:
            r2.f257950b = r14
            r14 = r13 & 8
            if (r14 <= 0) goto L_0x0251
            r14 = 1
            goto L_0x0252
        L_0x0251:
            r14 = 0
        L_0x0252:
            r2.f257951c = r14
            r14 = r13 & 4
            if (r14 <= 0) goto L_0x025a
            r14 = 1
            goto L_0x025b
        L_0x025a:
            r14 = 0
        L_0x025b:
            r2.f257952d = r14
            r14 = r13 & 16
            if (r14 <= 0) goto L_0x0263
            r14 = 1
            goto L_0x0264
        L_0x0263:
            r14 = 0
        L_0x0264:
            r2.f257953e = r14
            r13 = r13 & 32
            if (r13 <= 0) goto L_0x026c
            r13 = 1
            goto L_0x026d
        L_0x026c:
            r13 = 0
        L_0x026d:
            r2.f257954f = r13
            int r13 = r4.getInstanceId()
            r2.f257955g = r13
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r13 = 0
            r14[r13] = r6
            int r4 = r4.getInstanceId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 1
            r14[r13] = r4
            java.lang.String r4 = "[getCharacteristic] handle: %d, instanceId: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r14)
            android.bluetooth.BluetoothGatt r4 = r7.f256605e
            if (r4 != 0) goto L_0x02ab
            goto L_0x02a9
        L_0x0290:
            r29 = r2
            r25 = r4
            r24 = r15
            java.lang.String r2 = r7.f256601a
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r4 = "[getCharacteristic] serviceId is null, err"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r7)
            goto L_0x02a9
        L_0x02a1:
            r29 = r2
            r25 = r4
            r23 = r14
        L_0x02a7:
            r24 = r15
        L_0x02a9:
            r2 = r17
        L_0x02ab:
            if (r2 != 0) goto L_0x02ed
            java.lang.String r2 = "bleCharacteristic is null, may not connect"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4 = 10005(0x2715, float:1.402E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r11, r4)
            java.lang.String r4 = "fail:no characteristic"
            r5 = 1509002(0x17068a, float:2.114562E-39)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r6 == 0) goto L_0x02d9
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r11 = 0
            r6[r11] = r7
            r7 = 1
            r6[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r6)
        L_0x02d9:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.put(r8, r5)
            java.lang.String r2 = r0.mo115114o(r4, r2)
            r1.mo109647a(r3, r2)
            r1 = 73
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100982a(r1)
            return
        L_0x02ed:
            boolean r4 = r2.f257953e
            if (r4 == 0) goto L_0x02f5
            boolean r7 = r2.f257954f
            if (r7 == 0) goto L_0x0307
        L_0x02f5:
            if (r4 == 0) goto L_0x0309
            boolean r4 = r2.f257954f
            if (r4 == 0) goto L_0x0309
            java.lang.String r4 = r21.toLowerCase()
            java.lang.String r7 = "notification"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0309
        L_0x0307:
            r13 = 1
            goto L_0x030a
        L_0x0309:
            r13 = 0
        L_0x030a:
            boolean r4 = r2.f257953e
            if (r4 != 0) goto L_0x0312
            boolean r7 = r2.f257954f
            if (r7 != 0) goto L_0x0324
        L_0x0312:
            if (r4 == 0) goto L_0x0326
            boolean r2 = r2.f257954f
            if (r2 == 0) goto L_0x0326
            java.lang.String r2 = r21.toLowerCase()
            r4 = r20
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0326
        L_0x0324:
            r2 = 1
            goto L_0x0327
        L_0x0326:
            r2 = 0
        L_0x0327:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r7 = 0
            r4[r7] = r19
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r13)
            r14 = 1
            r4[r14] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r14 = 2
            r4[r14] = r7
            java.lang.String r7 = "appId:%s notifyBLECharacteristicValueChanged isNotify:%b isIndicate:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r4)
            if (r13 == 0) goto L_0x0360
            ok0.f r2 = new ok0.f
            r7 = r18
            r4 = r25
            r2.<init>(r4, r5, r6, r7)
            r6 = r22
            r2.f257938f = r6
            r13 = r29
            r2.f257939g = r13
            kk0.l$a r4 = new kk0.l$a
            r4.<init>(r1, r3)
            r14 = r23
            r15 = r24
            r14.mo114614g(r15, r2, r4)
            goto L_0x0381
        L_0x0360:
            r13 = r29
            r7 = r18
            r6 = r22
            r14 = r23
            r15 = r24
            r4 = r25
            if (r2 == 0) goto L_0x0382
            ok0.e r2 = new ok0.e
            r2.<init>(r4, r5, r7)
            r2.f257938f = r6
            r2.f257939g = r13
            kk0.l$b r4 = new kk0.l$b
            r5 = r19
            r4.<init>(r5, r1, r3)
            r14.mo114614g(r15, r2, r4)
        L_0x0381:
            return
        L_0x0382:
            java.lang.String r2 = "not support notify and not support indicate..."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4 = 10007(0x2717, float:1.4023E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r11, r4)
            java.lang.String r4 = "fail:internal error"
            r5 = 1509004(0x17068c, float:2.114565E-39)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r6 == 0) goto L_0x03ae
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r11 = 0
            r6[r11] = r7
            r7 = 1
            r6[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r6)
        L_0x03ae:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.put(r8, r5)
            java.lang.String r2 = r0.mo115114o(r4, r2)
            r1.mo109647a(r3, r2)
            r1 = 82
            r2 = 73
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kk0.C88188l.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
