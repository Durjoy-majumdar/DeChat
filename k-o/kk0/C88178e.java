package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import ok0.C89237d;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89696k;
import rx3.C13604l;
import sk0.C90215a;
import sx3.C90364q0;

/* renamed from: kk0.e */
public final class C88178e extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 777;
    public static final String NAME = "getBLEDeviceRSSI";

    /* renamed from: kk0.e$a */
    public static final class C88179a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ String f254973a;

        /* renamed from: b */
        public final /* synthetic */ C88178e f254974b;

        /* renamed from: c */
        public final /* synthetic */ int f254975c;

        /* renamed from: d */
        public final /* synthetic */ C82381f f254976d;

        public C88179a(String str, C88178e eVar, int i, C82381f fVar) {
            this.f254973a = str;
            this.f254974b = eVar;
            this.f254975c = i;
            this.f254976d = fVar;
        }

        /* renamed from: a */
        public final void mo114631a(C89696k kVar) {
            Log.m105925i("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "appId: " + this.f254973a + ", result: " + kVar, new Object[0]);
            int i = kVar.f257988a;
            if (i == 0) {
                Object obj = kVar.f257991d;
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                if (num == null) {
                    C88178e eVar = this.f254974b;
                    Map g = C90364q0.m113148g(new C13604l("errCode", -1));
                    eVar.getClass();
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1509000, "fail:internal error");
                    }
                    g.put("errno", 1509000);
                    this.f254976d.mo109647a(this.f254975c, eVar.mo115114o("fail:internal error", g));
                    return;
                }
                C90215a.m112930b(this.f254974b, this.f254975c, this.f254976d, C90364q0.m113146e(new C13604l("RSSI", num)));
                return;
            }
            this.f254976d.mo109647a(this.f254975c, this.f254974b.mo115110k(kVar.f257989b, kVar.f257990c, C90364q0.m113148g(new C13604l("errCode", Integer.valueOf(i)))));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int i2;
        int i3;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i4 = i;
        if (fVar2 == null) {
            Log.m105929w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "env is null", new Object[0]);
        } else if (jSONObject2 == null || !jSONObject2.has("deviceId")) {
            Log.m105929w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "data is null or do not have key: deviceId", new Object[0]);
            Map g = C90364q0.m113148g(new C13604l("errCode", 10013));
            if (BuildInfo.DEBUG) {
                i2 = 101;
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            } else {
                i2 = 101;
            }
            g.put("errno", Integer.valueOf(i2));
            fVar2.mo109647a(i4, mo115114o("fail:invalid data", g));
        } else {
            String appId = fVar.getAppId();
            Log.m105925i("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "appId: " + appId + ", data: " + jSONObject2, new Object[0]);
            C82225c b = C82220a.m100947b(appId);
            if (b == null) {
                Log.m105929w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "bleWorker is null", new Object[0]);
                Map g2 = C90364q0.m113148g(new C13604l("errCode", 10000));
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
                }
                g2.put("errno", 1500101);
                fVar2.mo109647a(i4, mo115114o("fail:not init", g2));
                return;
            }
            String optString = jSONObject2.optString("deviceId");
            if (optString == null) {
                Log.m105929w("MicroMsg.AppBrand.JsApiGetBLEDeviceRSSI", "deviceId is null", new Object[0]);
                Map g3 = C90364q0.m113148g(new C13604l("errCode", 10013));
                if (BuildInfo.DEBUG) {
                    i3 = 101;
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
                } else {
                    i3 = 101;
                }
                g3.put("errno", Integer.valueOf(i3));
                fVar2.mo109647a(i4, mo115114o("fail:invalid data", g3));
                return;
            }
            b.mo114614g(optString, new C89237d(), new C88179a(appId, this, i4, fVar2));
        }
    }
}
