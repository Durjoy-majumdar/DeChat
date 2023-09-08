package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.c0 */
public class C117796c0 extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "removeMapArc";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiRemoveMapArc", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiRemoveMapArc", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiRemoveMapArc", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
        } else if (jSONObject.has("id")) {
            Log.m105924i("MicroMsg.JsApiRemoveMapArc", "removeMapArc success");
            y.mo182823T(jSONObject.optInt("id"));
            fVar.mo109647a(i, mo115109j("ok"));
        } else {
            Log.m105920e("MicroMsg.JsApiRemoveMapArc", "id is empty");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        }
    }
}
