package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ok0.C89232a;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: kk0.a */
public class C88172a extends C82268c {
    private static final int CTRL_INDEX = 181;
    private static final String NAME = "closeBLEConnection";

    /* renamed from: kk0.a$a */
    public class C88173a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f254965a;

        /* renamed from: b */
        public final /* synthetic */ int f254966b;

        public C88173a(C82381f fVar, int i) {
            this.f254965a = fVar;
            this.f254966b = i;
        }

        /* renamed from: a */
        public void mo114631a(C89696k kVar) {
            if (kVar.f257988a != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(kVar.f257988a));
                this.f254965a.mo109647a(this.f254966b, C88172a.this.mo115110k(kVar.f257989b, kVar.f257990c, hashMap));
                C82241i.m100982a(93);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 0);
            C82381f fVar = this.f254965a;
            int i = this.f254966b;
            C88172a aVar = C88172a.this;
            aVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            fVar.mo109647a(i, aVar.mo115114o("ok", hashMap2));
            C82241i.m100982a(92);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82241i.m100982a(91);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiCloseBLEConnection", "JsApiCloseBLEConnection data is null");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10013);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            }
            hashMap.put("errno", 101);
            fVar.mo109647a(i, mo115114o("fail:invalid data", hashMap));
            C82241i.m100983b(93, 94);
            return;
        }
        Log.m105925i("MicroMsg.JsApiCloseBLEConnection", "appId:%s closeBLEConnection data %s", fVar.getAppId(), jSONObject.toString());
        C82225c b = C82220a.m100947b(fVar.getAppId());
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiCloseBLEConnection", "bleWorker is null, may not open ble");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap2.put("errno", 1500101);
            fVar.mo109647a(i, mo115114o("fail:not init", hashMap2));
            C82241i.m100983b(93, 96);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiCloseBLEConnection", "adapter is null or not enabled!");
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap3.put("errno", 1500102);
            fVar.mo109647a(i, mo115114o("fail:not available", hashMap3));
            C82241i.m100983b(93, 98);
        } else {
            String optString = jSONObject.optString("deviceId");
            boolean optBoolean = jSONObject.optBoolean("debug", false);
            boolean optBoolean2 = jSONObject.optBoolean("mainThread", true);
            C89232a aVar = new C89232a();
            aVar.f257938f = optBoolean;
            aVar.f257939g = optBoolean2;
            b.mo114614g(optString, aVar, new C88173a(fVar, i));
        }
    }
}
