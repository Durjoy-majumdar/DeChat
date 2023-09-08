package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.f0 */
public class C117804f0 extends C117793b {
    public static final int CTRL_INDEX = 343;
    public static final String NAME = "removeMapMarkers";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.Map.JsApiRemoveMapMarkers", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.Map.JsApiRemoveMapMarkers", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.Map.JsApiRemoveMapMarkers", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("markers")) {
            try {
                JSONArray jSONArray = new JSONArray(jSONObject.optString("markers"));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    y.mo182851i(jSONArray.getString(i2));
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.Map.JsApiRemoveMapMarkers", e, "", new Object[0]);
                fVar.mo109647a(i, mo115109j("fail:internal error"));
                return;
            }
        }
        mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
    }
}
