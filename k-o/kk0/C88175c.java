package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ok0.C89233b;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: kk0.c */
public class C88175c extends C82268c {
    private static final int CTRL_INDEX = 180;
    private static final String NAME = "createBLEConnection";

    /* renamed from: kk0.c$a */
    public class C88176a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ String f254968a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f254969b;

        /* renamed from: c */
        public final /* synthetic */ int f254970c;

        /* renamed from: d */
        public final /* synthetic */ String f254971d;

        public C88176a(String str, C82381f fVar, int i, String str2) {
            this.f254968a = str;
            this.f254969b = fVar;
            this.f254970c = i;
            this.f254971d = str2;
        }

        /* renamed from: a */
        public void mo114631a(C89696k kVar) {
            Log.m105925i("MicroMsg.JsApiCreateBLEConnection", "appId:%s createBLEConnection result:%s", this.f254968a, kVar);
            if (kVar.f257988a != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(kVar.f257988a));
                this.f254969b.mo109647a(this.f254970c, C88175c.this.mo115110k(kVar.f257989b, kVar.f257990c, hashMap));
                C88175c.this.mo114639w(this.f254969b, this.f254971d, false);
                C82241i.m100982a(27);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 0);
            C82381f fVar = this.f254969b;
            int i = this.f254970c;
            C88175c cVar = C88175c.this;
            cVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            fVar.mo109647a(i, cVar.mo115114o("ok", hashMap2));
            C88175c.this.mo114639w(this.f254969b, this.f254971d, true);
            C82241i.m100982a(26);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C82241i.m100982a(25);
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiCreateBLEConnection", "createBLEConnection data is null, err");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10013);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            }
            hashMap.put("errno", 101);
            fVar2.mo109647a(i2, mo115114o("fail:invalid data", hashMap));
            return;
        }
        String appId = fVar.getAppId();
        Log.m105925i("MicroMsg.JsApiCreateBLEConnection", "appId:%s createBLEConnection data %s", appId, jSONObject.toString());
        C82225c b = C82220a.m100947b(fVar.getAppId());
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiCreateBLEConnection", "bleWorker is null, may not open ble");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap2.put("errno", 1500101);
            fVar2.mo109647a(i2, mo115114o("fail:not init", hashMap2));
            C82241i.m100983b(27, 30);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiCreateBLEConnection", "bleWorker is disable, may not open ble");
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap3.put("errno", 1500102);
            fVar2.mo109647a(i2, mo115114o("fail:not available", hashMap3));
            C82241i.m100983b(27, 32);
        } else {
            boolean optBoolean = jSONObject2.optBoolean("debug", false);
            boolean optBoolean2 = jSONObject2.optBoolean("mainThread", true);
            boolean optBoolean3 = jSONObject2.optBoolean("autoConnect", false);
            String optString = jSONObject2.optString("transport", "LE");
            long optLong = jSONObject2.optLong("discoverDelay", 0);
            String optString2 = jSONObject2.optString("connectionPriority", (String) null);
            String optString3 = jSONObject2.optString("deviceId");
            boolean optBoolean4 = jSONObject2.optBoolean("doDiscover", true);
            Log.m105925i("MicroMsg.JsApiCreateBLEConnection", "deviceId: %s, doDiscover: %b", optString3, Boolean.valueOf(optBoolean4));
            C89233b bVar = new C89233b(optString3);
            bVar.f257938f = optBoolean;
            bVar.f257939g = optBoolean2;
            bVar.f257107o = optBoolean3;
            bVar.f257108p = optString;
            bVar.f257109q = optLong;
            bVar.f257110r = optString2;
            bVar.f257111s = optBoolean4;
            b.mo114614g(optString3, bVar, new C88176a(appId, fVar, i, optString3));
        }
    }

    /* renamed from: w */
    public void mo114639w(C82381f fVar, String str, boolean z) {
        throw null;
    }
}
