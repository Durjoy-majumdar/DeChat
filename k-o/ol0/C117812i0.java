package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.i0 */
public class C117812i0 extends C117793b {
    public static final int CTRL_INDEX = 690;
    public static final String NAME = "setMapCenterOffset";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetMapCenterOffset", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiSetMapCenterOffset", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiSetMapCenterOffset", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("offset");
            y.mo182805I((float) jSONArray.optDouble(0, 0.5d), (float) jSONArray.optDouble(1, 0.5d), jSONObject.optBoolean("animated", false));
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiSetMapCenterOffset", "parse offset err:%s", e);
        }
        mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
    }
}
