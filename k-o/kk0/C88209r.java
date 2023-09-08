package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import qk0.C89687b;
import qk0.C89696k;

/* renamed from: kk0.r */
public class C88209r extends C82268c {
    private static final int CTRL_INDEX = 184;
    private static final String NAME = "writeBLECharacteristicValue";

    /* renamed from: kk0.r$a */
    public class C88210a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f255009a;

        /* renamed from: b */
        public final /* synthetic */ int f255010b;

        public C88210a(C82381f fVar, int i) {
            this.f255009a = fVar;
            this.f255010b = i;
        }

        /* renamed from: a */
        public void mo114631a(C89696k kVar) {
            if (kVar.f257988a != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(kVar.f257988a));
                this.f255009a.mo109647a(this.f255010b, C88209r.this.mo115110k(kVar.f257989b, kVar.f257990c, hashMap));
                C82241i.m100982a(58);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 0);
            C82381f fVar = this.f255009a;
            int i = this.f255010b;
            C88209r rVar = C88209r.this;
            rVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            fVar.mo109647a(i, rVar.mo115114o("ok", hashMap2));
            C82241i.m100982a(58);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0140  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r20, org.json.JSONObject r21, int r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r0 = r21
            r3 = r22
            r4 = 56
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100982a(r4)
            r4 = 58
            java.lang.String r5 = "errno"
            java.lang.String r6 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r7 = "MicroMsg.AppBrandJsApi"
            java.lang.String r8 = "MicroMsg.JsApiWriteBLECharacteristicValue"
            r9 = 2
            r10 = 1
            r11 = 0
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "JsApiWriteBLECharacteristicValue data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            java.lang.String r8 = "fail:invalid data"
            r0 = 101(0x65, float:1.42E-43)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r12 == 0) goto L_0x0036
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r9[r11] = r12
            r9[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r9)
        L_0x0036:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r6.put(r5, r0)     // Catch:{ Exception -> 0x003f }
            goto L_0x004a
        L_0x003f:
            r0 = move-exception
            r5 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r5
            java.lang.String r5 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r5, r0)
        L_0x004a:
            java.lang.String r0 = r1.mo115115p(r8, r6)
            r2.mo109647a(r3, r0)
            r0 = 59
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r0)
            return
        L_0x0057:
            java.lang.String r12 = r20.getAppId()
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r11] = r12
            java.lang.String r12 = r21.toString()
            r13[r10] = r12
            java.lang.String r12 = "appId:%s writeBLECharacteristicValue data %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r13)
            java.lang.String r12 = r20.getAppId()
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c r12 = com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a.m100947b(r12)
            java.lang.String r13 = "errCode"
            if (r12 != 0) goto L_0x00b3
            java.lang.String r0 = "bleWorker is null, may not open ble"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r13, r8)
            r8 = 1500101(0x16e3c5, float:2.102089E-39)
            java.lang.String r12 = "fail:not init"
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r13 == 0) goto L_0x009f
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r9[r11] = r13
            r9[r10] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r9)
        L_0x009f:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r0.put(r5, r6)
            java.lang.String r0 = r1.mo115114o(r12, r0)
            r2.mo109647a(r3, r0)
            r0 = 61
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r0)
            return
        L_0x00b3:
            boolean r14 = sk0.C90216b.m112933b()
            if (r14 != 0) goto L_0x00f6
            java.lang.String r0 = "adapter is null or not enabled!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8 = 10001(0x2711, float:1.4014E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r13, r8)
            java.lang.String r8 = "fail:not available"
            r12 = 1500102(0x16e3c6, float:2.10209E-39)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r13 == 0) goto L_0x00e2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r9[r11] = r13
            r9[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r9)
        L_0x00e2:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r0.put(r5, r6)
            java.lang.String r0 = r1.mo115114o(r8, r0)
            r2.mo109647a(r3, r0)
            r0 = 63
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r4, r0)
            return
        L_0x00f6:
            java.lang.String r4 = "deviceId"
            java.lang.String r4 = r0.optString(r4)
            java.lang.String r5 = "serviceId"
            java.lang.String r14 = r0.optString(r5)
            java.lang.String r5 = "characteristicId"
            java.lang.String r15 = r0.optString(r5)
            java.lang.String r5 = "handle"
            boolean r6 = r0.has(r5)
            if (r6 == 0) goto L_0x011a
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x011a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x011a }
            goto L_0x011b
        L_0x011a:
            r5 = 0
        L_0x011b:
            r16 = r5
            java.lang.String r5 = "value"
            java.lang.String r18 = r0.optString(r5)
            java.lang.String r5 = "debug"
            boolean r5 = r0.optBoolean(r5, r11)
            java.lang.String r6 = "mainThread"
            boolean r6 = r0.optBoolean(r6, r11)
            java.lang.String r7 = "writeType"
            java.lang.String r0 = r0.optString(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 == 0) goto L_0x0140
        L_0x013d:
            r17 = 0
            goto L_0x015b
        L_0x0140:
            r0.getClass()
            java.lang.String r7 = "write"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L_0x0159
            java.lang.String r7 = "writeNoResponse"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0156
            goto L_0x013d
        L_0x0156:
            r17 = 2
            goto L_0x015b
        L_0x0159:
            r17 = 1
        L_0x015b:
            ok0.j r0 = new ok0.j
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r0.f257938f = r5
            r0.f257939g = r6
            kk0.r$a r5 = new kk0.r$a
            r5.<init>(r2, r3)
            r12.mo114614g(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kk0.C88209r.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
