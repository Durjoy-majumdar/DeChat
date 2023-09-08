package ol0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.g0 */
public class C117806g0 extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "removeMapVisualLayer";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiRemoveMapVisualLayer", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiRemoveMapVisualLayer", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiRemoveMapVisualLayer", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        String optString = jSONObject.optString("layerId");
        if (TextUtils.isEmpty(optString)) {
            Log.m105920e("MicroMsg.JsApiRemoveMapVisualLayer", "layerId is empty");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else if (y.mo182852i0(optString)) {
            Log.m105924i("MicroMsg.JsApiRemoveMapVisualLayer", "removeMapVisualLayer ok");
            fVar.mo109647a(i, mo115109j("ok"));
        } else {
            Log.m105924i("MicroMsg.JsApiRemoveMapVisualLayer", "removeMapVisualLayer fail");
            fVar.mo109647a(i, mo115109j("fail"));
        }
    }
}
