package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ok0.C89242h;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: kk0.n */
public class C88200n extends C82268c {
    private static final int CTRL_INDEX = 185;
    private static final String NAME = "readBLECharacteristicValue";

    /* renamed from: kk0.n$a */
    public class C88201a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f254998a;

        /* renamed from: b */
        public final /* synthetic */ int f254999b;

        public C88201a(C82381f fVar, int i) {
            this.f254998a = fVar;
            this.f254999b = i;
        }

        /* renamed from: a */
        public void mo114631a(C89696k kVar) {
            if (kVar.f257988a != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(kVar.f257988a));
                this.f254998a.mo109647a(this.f254999b, C88200n.this.mo115110k(kVar.f257989b, kVar.f257990c, hashMap));
                C82241i.m100982a(43);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 0);
            C82381f fVar = this.f254998a;
            int i = this.f254999b;
            C88200n nVar = C88200n.this;
            nVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            fVar.mo109647a(i, nVar.mo115114o("ok", hashMap2));
            C82241i.m100982a(42);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Integer num;
        C82241i.m100982a(41);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiReadBLECharacteristicValue", "JsApiReadBLECharacteristicValue data is null");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10013);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            }
            hashMap.put("errno", 101);
            fVar.mo109647a(i, mo115114o("fail:invalid data", hashMap));
            C82241i.m100983b(43, 44);
            return;
        }
        Log.m105925i("MicroMsg.JsApiReadBLECharacteristicValue", "appId:%s readBLECharacteristicValue data %s", fVar.getAppId(), jSONObject.toString());
        C82225c b = C82220a.m100947b(fVar.getAppId());
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiReadBLECharacteristicValue", "bleWorker is null, may not open ble");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap2.put("errno", 1500101);
            fVar.mo109647a(i, mo115114o("fail:not init", hashMap2));
            C82241i.m100983b(43, 46);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiReadBLECharacteristicValue", "adapter is null or not enabled!");
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap3.put("errno", 1500102);
            fVar.mo109647a(i, mo115114o("fail:not available", hashMap3));
            C82241i.m100983b(43, 48);
        } else {
            String optString = jSONObject.optString("deviceId");
            String optString2 = jSONObject.optString("serviceId");
            String optString3 = jSONObject.optString("characteristicId");
            if (jSONObject.has("handle")) {
                try {
                    num = Integer.valueOf(jSONObject.getInt("handle"));
                } catch (Exception unused) {
                }
                boolean optBoolean = jSONObject.optBoolean("debug", false);
                boolean optBoolean2 = jSONObject.optBoolean("mainThread", false);
                C89242h hVar = new C89242h(optString2, optString3, num);
                hVar.f257938f = optBoolean;
                hVar.f257939g = optBoolean2;
                b.mo114614g(optString, hVar, new C88201a(fVar, i));
            }
            num = null;
            boolean optBoolean3 = jSONObject.optBoolean("debug", false);
            boolean optBoolean22 = jSONObject.optBoolean("mainThread", false);
            C89242h hVar2 = new C89242h(optString2, optString3, num);
            hVar2.f257938f = optBoolean3;
            hVar2.f257939g = optBoolean22;
            b.mo114614g(optString, hVar2, new C88201a(fVar, i));
        }
    }
}
