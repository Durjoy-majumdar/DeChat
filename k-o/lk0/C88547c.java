package lk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import fy3.C32226l;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;
import sk0.C90215a;

/* renamed from: lk0.c */
public final class C88547c extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 723;
    private static final String NAME = "addBLEPeripheralService";

    /* renamed from: lk0.c$a */
    public static final class C88548a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88547c f255759d;

        /* renamed from: e */
        public final /* synthetic */ int f255760e;

        /* renamed from: f */
        public final /* synthetic */ C82381f f255761f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88548a(C88547c cVar, int i, C82381f fVar) {
            super(1);
            this.f255759d = cVar;
            this.f255760e = i;
            this.f255761f = fVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C90215a.m112930b(this.f255759d, this.f255760e, this.f255761f, (HashMap<String, Object>) null);
            } else {
                C90215a.m112929a(this.f255759d, this.f255760e, this.f255761f, 10008, "fail:system error, add service fail", (HashMap) null, 16, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020c  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r25, org.json.JSONObject r26, int r27) {
        /*
            r24 = this;
            r3 = r25
            r1 = r26
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r3, r0)
            boolean r0 = sk0.C90216b.m112933b()
            java.lang.String r9 = "MicroMsg.BLE.JsApiAddBlePeripheralService"
            if (r0 != 0) goto L_0x0028
            r4 = 10001(0x2711, float:1.4014E-41)
            r6 = 0
            r7 = 16
            r8 = 0
            java.lang.String r5 = "fail:not available"
            r1 = r24
            r2 = r27
            r3 = r25
            sk0.C90215a.m112929a(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "invoke: Ble is not open"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            return
        L_0x0028:
            java.lang.String r0 = ", hex = "
            java.lang.String r2 = "value"
            java.lang.String r4 = "permission"
            java.lang.String r5 = "read"
            java.lang.String r6 = "write"
            java.lang.String r7 = "uuid"
            r8 = 0
            if (r1 != 0) goto L_0x003e
            goto L_0x01f2
        L_0x003e:
            java.lang.String r10 = "service"
            org.json.JSONObject r10 = r1.optJSONObject(r10)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r11 = r10.optString(r7)     // Catch:{ Exception -> 0x01e5 }
            java.util.UUID r11 = tk0.C90508a.m113330a(r11)     // Catch:{ Exception -> 0x01e5 }
            android.bluetooth.BluetoothGattService r12 = new android.bluetooth.BluetoothGattService     // Catch:{ Exception -> 0x01e5 }
            r12.<init>(r11, r8)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r11 = "characteristics"
            org.json.JSONArray r10 = r10.optJSONArray(r11)     // Catch:{ Exception -> 0x01e5 }
            if (r10 != 0) goto L_0x005d
            r2 = r12
            goto L_0x01e3
        L_0x005d:
            int r11 = r10.length()     // Catch:{ Exception -> 0x01e5 }
            org.json.JSONObject[] r13 = new org.json.JSONObject[r11]     // Catch:{ Exception -> 0x01e5 }
            r14 = 0
        L_0x0064:
            java.lang.String r15 = "null cannot be cast to non-null type org.json.JSONObject"
            if (r14 >= r11) goto L_0x007b
            java.lang.Object r16 = r10.get(r14)     // Catch:{ Exception -> 0x01e5 }
            if (r16 == 0) goto L_0x0075
            org.json.JSONObject r16 = (org.json.JSONObject) r16     // Catch:{ Exception -> 0x01e5 }
            r13[r14] = r16     // Catch:{ Exception -> 0x01e5 }
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0075:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x01e5 }
            r0.<init>(r15)     // Catch:{ Exception -> 0x01e5 }
            throw r0     // Catch:{ Exception -> 0x01e5 }
        L_0x007b:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x01e5 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x01e5 }
            r14 = 0
        L_0x0081:
            if (r14 >= r11) goto L_0x01c6
            r8 = r13[r14]     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r17 = r8.optString(r7)     // Catch:{ Exception -> 0x01e5 }
            r18 = r11
            java.lang.String r11 = "properties"
            org.json.JSONObject r11 = r8.optJSONObject(r11)     // Catch:{ Exception -> 0x01e5 }
            r19 = r13
            r13 = 0
            boolean r20 = r11.optBoolean(r6, r13)     // Catch:{ Exception -> 0x01e5 }
            boolean r21 = r11.optBoolean(r5, r13)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r3 = "notify"
            boolean r3 = r11.optBoolean(r3, r13)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r1 = "indicate"
            boolean r1 = r11.optBoolean(r1, r13)     // Catch:{ Exception -> 0x01e5 }
            r22 = r12
            java.lang.String r12 = "writeNoResponse"
            boolean r11 = r11.optBoolean(r12, r13)     // Catch:{ Exception -> 0x01e5 }
            if (r20 == 0) goto L_0x00b7
            r12 = 8
            goto L_0x00b8
        L_0x00b7:
            r12 = 0
        L_0x00b8:
            if (r21 == 0) goto L_0x00bc
            r12 = r12 | 2
        L_0x00bc:
            if (r3 == 0) goto L_0x00c0
            r12 = r12 | 16
        L_0x00c0:
            if (r1 == 0) goto L_0x00c4
            r12 = r12 | 32
        L_0x00c4:
            if (r11 == 0) goto L_0x00c8
            r12 = r12 | 4
        L_0x00c8:
            org.json.JSONObject r1 = r8.optJSONObject(r4)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r3 = "readable"
            r11 = 0
            boolean r3 = r1.optBoolean(r3, r11)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r13 = "writeable"
            boolean r13 = r1.optBoolean(r13, r11)     // Catch:{ Exception -> 0x01e5 }
            r20 = r14
            java.lang.String r14 = "readEncryptionRequired"
            boolean r14 = r1.optBoolean(r14, r11)     // Catch:{ Exception -> 0x01e5 }
            r21 = r10
            java.lang.String r10 = "writeEncryptionRequired"
            boolean r1 = r1.optBoolean(r10, r11)     // Catch:{ Exception -> 0x01e5 }
            if (r13 == 0) goto L_0x00f1
            r3 = r3 | 16
        L_0x00f1:
            if (r1 == 0) goto L_0x00f7
            r1 = r3 | 32
            r3 = r1 | 64
        L_0x00f7:
            if (r14 == 0) goto L_0x00fd
            r1 = r3 | 2
            r3 = r1 | 4
        L_0x00fd:
            android.bluetooth.BluetoothGattCharacteristic r1 = new android.bluetooth.BluetoothGattCharacteristic     // Catch:{ Exception -> 0x01e5 }
            java.util.UUID r10 = tk0.C90508a.m113330a(r17)     // Catch:{ Exception -> 0x01e5 }
            r1.<init>(r10, r12, r3)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r3 = r8.optString(r2)     // Catch:{ Exception -> 0x01e5 }
            r10 = 2
            byte[] r11 = android.util.Base64.decode(r3, r10)     // Catch:{ Exception -> 0x01e5 }
            byte[] r11 = sk0.C90216b.m112932a(r11)     // Catch:{ Exception -> 0x01e5 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e5 }
            r12.<init>()     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r13 = "parseData characteristic : base64 = "
            r12.append(r13)     // Catch:{ Exception -> 0x01e5 }
            r12.append(r3)     // Catch:{ Exception -> 0x01e5 }
            r12.append(r0)     // Catch:{ Exception -> 0x01e5 }
            r12.append(r11)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r3 = r12.toString()     // Catch:{ Exception -> 0x01e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)     // Catch:{ Exception -> 0x01e5 }
            r1.setValue(r11)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r3 = "descriptors"
            org.json.JSONArray r3 = r8.optJSONArray(r3)     // Catch:{ Exception -> 0x01e5 }
            if (r3 == 0) goto L_0x01ad
            int r8 = r3.length()     // Catch:{ Exception -> 0x01e5 }
            org.json.JSONObject[] r11 = new org.json.JSONObject[r8]     // Catch:{ Exception -> 0x01e5 }
            r12 = 0
        L_0x0140:
            if (r12 >= r8) goto L_0x0155
            java.lang.Object r13 = r3.get(r12)     // Catch:{ Exception -> 0x01e5 }
            if (r13 == 0) goto L_0x014f
            org.json.JSONObject r13 = (org.json.JSONObject) r13     // Catch:{ Exception -> 0x01e5 }
            r11[r12] = r13     // Catch:{ Exception -> 0x01e5 }
            int r12 = r12 + 1
            goto L_0x0140
        L_0x014f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x01e5 }
            r0.<init>(r15)     // Catch:{ Exception -> 0x01e5 }
            throw r0     // Catch:{ Exception -> 0x01e5 }
        L_0x0155:
            r3 = 0
        L_0x0156:
            if (r3 >= r8) goto L_0x01ad
            r12 = r11[r3]     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r13 = r12.optString(r7)     // Catch:{ Exception -> 0x01e5 }
            org.json.JSONObject r14 = r12.optJSONObject(r4)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r12 = r12.optString(r2)     // Catch:{ Exception -> 0x01e5 }
            boolean r17 = r14.optBoolean(r6)     // Catch:{ Exception -> 0x01e5 }
            boolean r14 = r14.optBoolean(r5)     // Catch:{ Exception -> 0x01e5 }
            if (r17 == 0) goto L_0x0172
            r14 = r14 | 16
        L_0x0172:
            android.bluetooth.BluetoothGattDescriptor r10 = new android.bluetooth.BluetoothGattDescriptor     // Catch:{ Exception -> 0x01e5 }
            java.util.UUID r13 = tk0.C90508a.m113330a(r13)     // Catch:{ Exception -> 0x01e5 }
            r10.<init>(r13, r14)     // Catch:{ Exception -> 0x01e5 }
            r13 = 2
            byte[] r14 = android.util.Base64.decode(r12, r13)     // Catch:{ Exception -> 0x01e5 }
            byte[] r14 = sk0.C90216b.m112932a(r14)     // Catch:{ Exception -> 0x01e5 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e5 }
            r13.<init>()     // Catch:{ Exception -> 0x01e5 }
            r23 = r2
            java.lang.String r2 = "parseData descriptor: base64 = "
            r13.append(r2)     // Catch:{ Exception -> 0x01e5 }
            r13.append(r12)     // Catch:{ Exception -> 0x01e5 }
            r13.append(r0)     // Catch:{ Exception -> 0x01e5 }
            r13.append(r14)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r2 = r13.toString()     // Catch:{ Exception -> 0x01e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)     // Catch:{ Exception -> 0x01e5 }
            r10.setValue(r14)     // Catch:{ Exception -> 0x01e5 }
            r1.addDescriptor(r10)     // Catch:{ Exception -> 0x01e5 }
            int r3 = r3 + 1
            r2 = r23
            r10 = 2
            goto L_0x0156
        L_0x01ad:
            r23 = r2
            r2 = r21
            r2.add(r1)     // Catch:{ Exception -> 0x01e5 }
            int r14 = r20 + 1
            r3 = r25
            r1 = r26
            r10 = r2
            r11 = r18
            r13 = r19
            r12 = r22
            r2 = r23
            r8 = 0
            goto L_0x0081
        L_0x01c6:
            r2 = r10
            r22 = r12
            java.util.Iterator r0 = r2.iterator()     // Catch:{ Exception -> 0x01e5 }
        L_0x01cd:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x01e5 }
            if (r1 == 0) goto L_0x01e1
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x01e5 }
            android.bluetooth.BluetoothGattCharacteristic r1 = (android.bluetooth.BluetoothGattCharacteristic) r1     // Catch:{ Exception -> 0x01e5 }
            r2 = r22
            r2.addCharacteristic(r1)     // Catch:{ Exception -> 0x01e5 }
            r22 = r2
            goto L_0x01cd
        L_0x01e1:
            r2 = r22
        L_0x01e3:
            r12 = r2
            goto L_0x01f3
        L_0x01e5:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "parseData: fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r1)
        L_0x01f2:
            r12 = 0
        L_0x01f3:
            if (r12 != 0) goto L_0x020c
            java.lang.String r0 = "createBLEPeripheralService data is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            r4 = 10013(0x271d, float:1.4031E-41)
            r6 = 0
            r7 = 16
            r8 = 0
            java.lang.String r5 = "fail:invalid data"
            r1 = r24
            r2 = r27
            r3 = r25
            sk0.C90215a.m112929a(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x020c:
            gy3.C87412m.m108591d(r26)
            java.lang.String r0 = "serverId"
            r1 = r26
            int r0 = r1.optInt(r0)
            lk0.s r1 = lk0.C88567s.f255793a
            lk0.p r1 = r1.mo123030b(r0)
            if (r1 != 0) goto L_0x0246
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invoke: retrieve a null server by #"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r4 = 10020(0x2724, float:1.4041E-41)
            r6 = 0
            r7 = 16
            r8 = 0
            java.lang.String r5 = "fail: no server"
            r1 = r24
            r2 = r27
            r3 = r25
            sk0.C90215a.m112929a(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0246:
            lk0.c$a r0 = new lk0.c$a
            r2 = r24
            r3 = r25
            r4 = r27
            r0.<init>(r2, r4, r3)
            android.bluetooth.BluetoothGattServer r3 = r1.mo123025a()
            boolean r3 = r3.addService(r12)
            if (r3 != 0) goto L_0x0260
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.invoke(r3)
        L_0x0260:
            java.util.Map<java.util.UUID, rx3.l<fy3.l<java.lang.Boolean, rx3.b0>, java.util.Timer>> r1 = r1.f255790f
            java.util.UUID r3 = r12.getUuid()
            java.lang.String r4 = "service.uuid"
            gy3.C87412m.m108593f(r3, r4)
            rx3.l r4 = new rx3.l
            r7 = 3000(0xbb8, double:1.482E-320)
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Timer r11 = new java.util.Timer
            r5 = 0
            r11.<init>(r5)
            lk0.o r6 = new lk0.o
            r6.<init>(r0)
            r5 = r11
            r5.schedule(r6, r7, r9)
            r4.<init>(r0, r11)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lk0.C88547c.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
