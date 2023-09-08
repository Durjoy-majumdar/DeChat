package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.h0 */
public class C117809h0 extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "setMapBoundary";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiSetMapBoundary", "data is null");
            fVar2.mo109647a(i2, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiSetMapBoundary", "data:%s", jSONObject2);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiSetMapBoundary", "mapView is null, return");
            fVar2.mo109647a(i2, mo115109j("fail:mapview is null"));
            return;
        }
        C118080q.C118094k kVar = new C118080q.C118094k();
        if (jSONObject2.has("southwest")) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("southwest");
            kVar.f353024a = new C118080q.C118093j(optJSONObject.optDouble("latitude", 0.0d), optJSONObject.optDouble("longitude", 0.0d));
        }
        if (jSONObject2.has("northeast")) {
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("northeast");
            kVar.f353025b = new C118080q.C118093j(optJSONObject2.optDouble("latitude", 0.0d), optJSONObject2.optDouble("longitude", 0.0d));
        }
        if (kVar.f353025b == null || kVar.f353024a == null) {
            Log.m105920e("MicroMsg.JsApiSetMapBoundary", "data is invalid");
            fVar.mo109647a(i2, mo115109j("fail:data is invalid"));
        } else if (y.mo182844g0(kVar)) {
            Log.m105924i("MicroMsg.JsApiSetMapBoundary", "setMapBoundary success");
            fVar.mo109647a(i2, mo115109j("ok"));
        } else {
            Log.m105920e("MicroMsg.JsApiSetMapBoundary", "data is invalid");
            fVar.mo109647a(i2, mo115109j("fail:setMapBoundary is fail"));
        }
    }
}
