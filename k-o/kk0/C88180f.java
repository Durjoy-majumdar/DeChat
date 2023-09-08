package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ok0.C89236c;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: kk0.f */
public class C88180f extends C82268c {
    private static final int CTRL_INDEX = 182;
    private static final String NAME = "getBLEDeviceServices";

    /* renamed from: kk0.f$a */
    public class C88181a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ String f254977a;

        /* renamed from: b */
        public final /* synthetic */ C82225c f254978b;

        /* renamed from: c */
        public final /* synthetic */ String f254979c;

        /* renamed from: d */
        public final /* synthetic */ C82381f f254980d;

        /* renamed from: e */
        public final /* synthetic */ int f254981e;

        public C88181a(String str, C82225c cVar, String str2, C82381f fVar, int i) {
            this.f254977a = str;
            this.f254978b = cVar;
            this.f254979c = str2;
            this.f254980d = fVar;
            this.f254981e = i;
        }

        /* renamed from: a */
        public void mo114631a(C89696k kVar) {
            Log.m105925i("MicroMsg.JsApiGetBLEDeviceServices", "appId:%s getBLEDeviceServices result:%s", this.f254977a, kVar);
            if (kVar.f257988a != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(kVar.f257988a));
                this.f254980d.mo109647a(this.f254981e, C88180f.this.mo115110k(kVar.f257989b, kVar.f257990c, hashMap));
                C82241i.m100982a(138);
                return;
            }
            C88180f.this.mo122576w(this.f254980d, this.f254981e, this.f254978b.mo114616i(this.f254979c, false));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82241i.m100982a(136);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetBLEDeviceServices", "getBLEDeviceServices data is null");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, mo115115p("fail:invalid data", jSONObject2));
            C82241i.m100983b(138, 139);
            return;
        }
        String appId = fVar.getAppId();
        Log.m105925i("MicroMsg.JsApiGetBLEDeviceServices", "appId:%s getBLEDeviceServices data %s", appId, jSONObject.toString());
        C82225c b = C82220a.m100947b(fVar.getAppId());
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiGetBLEDeviceServices", "bleWorker is null, may not open ble");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap.put("errno", 1500101);
            fVar.mo109647a(i, mo115114o("fail:not init", hashMap));
            C82241i.m100983b(138, 141);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiGetBLEDeviceServices", "adapter is null or not enabled!");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap2.put("errno", 1500102);
            fVar.mo109647a(i, mo115114o("fail:not available", hashMap2));
            C82241i.m100983b(138, 145);
        } else {
            String optString = jSONObject.optString("deviceId");
            boolean optBoolean = jSONObject.optBoolean("doDiscover", false);
            Log.m105925i("MicroMsg.JsApiGetBLEDeviceServices", "deviceId: %s, doDiscover: %b", optString, Boolean.valueOf(optBoolean));
            if (optBoolean) {
                b.mo114614g(optString, new C89236c(optString), new C88181a(appId, b, optString, fVar, i));
            } else {
                mo122576w(fVar, i, b.mo114616i(optString, true));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo122576w(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r17, int r18, java.util.List<qk0.C89690e> r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r4 = "errno"
            java.lang.String r5 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r6 = "MicroMsg.AppBrandJsApi"
            java.lang.String r8 = ""
            java.lang.String r9 = "errCode"
            r10 = 1
            java.lang.String r11 = "MicroMsg.JsApiGetBLEDeviceServices"
            if (r19 == 0) goto L_0x00d1
            int r13 = r19.size()
            if (r13 > 0) goto L_0x0022
            goto L_0x00d1
        L_0x0022:
            org.json.JSONArray r13 = new org.json.JSONArray
            r13.<init>()
            java.util.Iterator r14 = r19.iterator()
        L_0x002b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r14.next()
            qk0.e r0 = (qk0.C89690e) r0
            java.lang.String r15 = r0.f257965a
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 == 0) goto L_0x0045
            java.lang.String r0 = "get uuid is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            goto L_0x002b
        L_0x0045:
            org.json.JSONObject r15 = r0.f257967c     // Catch:{ JSONException -> 0x0067 }
            if (r15 != 0) goto L_0x0061
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0067 }
            r15.<init>()     // Catch:{ JSONException -> 0x0067 }
            r0.f257967c = r15     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r7 = r0.f257965a     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r12 = "uuid"
            r15.put(r12, r7)     // Catch:{ JSONException -> 0x0067 }
            org.json.JSONObject r7 = r0.f257967c     // Catch:{ JSONException -> 0x0067 }
            boolean r12 = r0.f257966b     // Catch:{ JSONException -> 0x0067 }
            java.lang.String r15 = "isPrimary"
            r7.put(r15, r12)     // Catch:{ JSONException -> 0x0067 }
        L_0x0061:
            org.json.JSONObject r0 = r0.f257967c     // Catch:{ JSONException -> 0x0067 }
            r13.put(r0)     // Catch:{ JSONException -> 0x0067 }
            goto L_0x002b
        L_0x0067:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.String r0 = r0.getMessage()
            r12 = 0
            r7[r12] = r0
            java.lang.String r0 = "JSONException %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r7)
            goto L_0x002b
        L_0x0077:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r0 = "services"
            r7.put(r0, r13)     // Catch:{ JSONException -> 0x0089 }
            r12 = 0
            r7.put(r9, r12)     // Catch:{ JSONException -> 0x0087 }
            goto L_0x0090
        L_0x0087:
            r0 = move-exception
            goto L_0x008b
        L_0x0089:
            r0 = move-exception
            r12 = 0
        L_0x008b:
            java.lang.Object[] r9 = new java.lang.Object[r12]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r8, r9)
        L_0x0090:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r8 = r7.toString()
            r0[r12] = r8
            java.lang.String r8 = "retJson %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r8, r0)
            java.lang.String r8 = "ok"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x00b4
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r9 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r0[r9] = r11
            r0[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r0)
            goto L_0x00b5
        L_0x00b4:
            r9 = 0
        L_0x00b5:
            r7.put(r4, r9)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00c4
        L_0x00b9:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r4
            java.lang.String r4 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r0)
        L_0x00c4:
            java.lang.String r0 = r1.mo115115p(r8, r7)
            r2.mo109647a(r3, r0)
            r0 = 137(0x89, float:1.92E-43)
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100982a(r0)
            return
        L_0x00d1:
            java.lang.String r7 = "not found services"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r7)
            r7 = 10004(0x2714, float:1.4019E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r9, r7)
            java.lang.String r7 = "fail:no service"
            r8 = 1500103(0x16e3c7, float:2.102092E-39)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r9 == 0) goto L_0x00f7
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r12 = 0
            r9[r12] = r11
            r9[r10] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r9)
        L_0x00f7:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r0.put(r4, r5)
            java.lang.String r0 = r1.mo115114o(r7, r0)
            r2.mo109647a(r3, r0)
            r0 = 138(0x8a, float:1.93E-43)
            r2 = 144(0x90, float:2.02E-43)
            com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i.m100983b(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kk0.C88180f.mo122576w(com.tencent.mm.plugin.appbrand.jsapi.f, int, java.util.List):void");
    }
}
