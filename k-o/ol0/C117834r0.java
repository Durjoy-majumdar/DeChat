package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;
import zi0.C91755a;

/* renamed from: ol0.r0 */
public class C117834r0 extends C117793b {
    public static final int CTRL_INDEX = 133;
    public static final String NAME = "updateMapMarkers";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.Map.JsApiUpdateMapMarkers", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.Map.JsApiUpdateMapMarkers", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.Map.JsApiUpdateMapMarkers", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        if (jSONObject.has("markers")) {
            try {
                jSONArray = new JSONArray(jSONObject.optString("markers"));
            } catch (JSONException unused) {
                jSONArray = null;
            }
            if (jSONArray == null) {
                Log.m105920e("MicroMsg.Map.JsApiUpdateMapMarkers", "markersArray is null, return");
                fVar.mo109647a(i, mo115109j("fail:internal error"));
                return;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    jSONObject2 = (JSONObject) jSONArray.get(i2);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.Map.JsApiUpdateMapMarkers", e, "", new Object[0]);
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    y.mo182885v(jSONObject2.optString("id"), mo182576x(fVar, jSONObject, jSONObject2), (C91755a) fVar.mo109668l(C91755a.class));
                }
            }
        }
        mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
    }
}
