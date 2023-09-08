package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.a0 */
public class C117792a0 extends C117793b {
    public static final int CTRL_INDEX = 890;
    public static final String NAME = "removeMapGroundOverlay";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiRemoveGroundOverlay", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiRemoveGroundOverlay", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiRemoveGroundOverlay", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        try {
            if (y.mo182862n0(jSONObject.getInt("id"))) {
                Log.m105924i("MicroMsg.JsApiRemoveGroundOverlay", "removeGroundOverlay success");
                fVar.mo109647a(i, mo115109j("ok"));
                return;
            }
            Log.m105924i("MicroMsg.JsApiRemoveGroundOverlay", "removeGroundOverlay fail");
            fVar.mo109647a(i, mo115109j("fail"));
        } catch (JSONException e) {
            Log.m105924i("MicroMsg.JsApiRemoveGroundOverlay", "");
            Log.m105921e("MicroMsg.JsApiRemoveGroundOverlay", "parse remove groundOverlay error, exception : %s", e);
            mo182575w(fVar, i, mo115109j("fail:internal error"), false, y.mo182849h());
        }
    }
}
