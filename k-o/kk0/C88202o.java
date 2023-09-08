package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import ok0.C89243i;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89696k;
import rx3.C13604l;
import sk0.C90215a;
import sk0.C90216b;
import sx3.C90364q0;

/* renamed from: kk0.o */
public final class C88202o extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 738;
    private static final String NAME = "setBLEMTU";

    /* renamed from: kk0.o$a */
    public static final class C88203a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ String f255001a;

        /* renamed from: b */
        public final /* synthetic */ C88202o f255002b;

        /* renamed from: c */
        public final /* synthetic */ int f255003c;

        /* renamed from: d */
        public final /* synthetic */ C82381f f255004d;

        public C88203a(String str, C88202o oVar, int i, C82381f fVar) {
            this.f255001a = str;
            this.f255002b = oVar;
            this.f255003c = i;
            this.f255004d = fVar;
        }

        /* renamed from: a */
        public final void mo114631a(C89696k kVar) {
            Log.m105919d("MicroMsg.JsApiSetBLEMtu", "invoke: appid %s setMtuSize result = %s", this.f255001a, kVar);
            Object obj = kVar.f257991d;
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int i = kVar.f257988a;
            if (i != 0) {
                this.f255004d.mo109647a(this.f255003c, num != null ? this.f255002b.mo115110k(kVar.f257989b, kVar.f257990c, C90364q0.m113148g(new C13604l("errCode", Integer.valueOf(i)))) : this.f255002b.mo115110k(kVar.f257989b, kVar.f257990c, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(i)), new C13604l("mtu", num))));
            } else if (num != null) {
                C90215a.m112930b(this.f255002b, this.f255003c, this.f255004d, C90364q0.m113146e(new C13604l("mtu", num)));
            } else {
                C90215a.m112930b(this.f255002b, this.f255003c, this.f255004d, (HashMap<String, Object>) null);
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C87412m.m108594g(fVar2, "service");
        if (jSONObject2 == null || !jSONObject2.has("deviceId") || !jSONObject2.has("mtu")) {
            Log.m105920e("MicroMsg.JsApiSetBLEMtu", "setBLEMTU data is null, err");
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
        C87412m.m108593f(appId, "service.appId");
        Log.m105925i("MicroMsg.JsApiSetBLEMtu", "appId:%s setBLEMTU data %s", appId, jSONObject.toString());
        C82225c b = C82220a.m100947b(fVar.getAppId());
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiSetBLEMtu", "bleWorker is null, may not open ble");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap2.put("errno", 1500101);
            fVar2.mo109647a(i2, mo115114o("fail:not init", hashMap2));
            C82241i.m100983b(27, 30);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiSetBLEMtu", "bleWorker is disable, may not open ble");
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap3.put("errno", 1500102);
            fVar2.mo109647a(i2, mo115114o("fail:not available", hashMap3));
            C82241i.m100983b(27, 32);
        } else {
            String optString = jSONObject2.optString("deviceId");
            b.mo114614g(optString, new C89243i(Integer.valueOf(jSONObject2.optInt("mtu")), optString), new C88203a(appId, this, i2, fVar2));
        }
    }
}
