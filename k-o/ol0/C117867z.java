package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.z */
public class C117867z extends C117793b {
    public static final int CTRL_INDEX = 141;
    public static final String NAME = "moveToMapLocation";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiMoveToMapLocation", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiMoveToMapLocation", "moveToMapLocation data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiMoveToMapLocation", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("latitude") || jSONObject.has("longitude")) {
            y.mo182807J(Util.getDouble(jSONObject.optString("latitude"), 0.0d), Util.getDouble(jSONObject.optString("longitude"), 0.0d));
        } else {
            y.mo182833c();
        }
        mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
    }
}
