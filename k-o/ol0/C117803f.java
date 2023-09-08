package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.f */
public class C117803f extends C117793b {
    public static final int CTRL_INDEX = 785;
    public static final String NAME = "addMapCustomLayer";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiAddMapCustomLayer", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiAddMapCustomLayer", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiAddMapCustomLayer", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        y.mo182819P(jSONObject.optString("layerId", ""));
        mo182575w(fVar, i, mo115109j("ok"), true, y.mo182849h());
    }
}
