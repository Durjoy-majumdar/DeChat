package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.j0 */
public class C117815j0 extends C117793b {
    public static final int CTRL_INDEX = 526;
    public static final String NAME = "setMapIndoorFloor";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetMapIndoorFloor", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiSetMapIndoorFloor", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiSetMapIndoorFloor", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        y.mo182821R(jSONObject.optString("buildingId"), jSONObject.optString("floorName"));
        mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
    }
}
