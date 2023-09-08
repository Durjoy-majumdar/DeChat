package ol0;

import android.graphics.Color;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88020k;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.k0 */
public class C117818k0 extends C117793b {
    public static final int CTRL_INDEX = 860;
    public static final String NAME = "setMapIndoorMaskColor";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiSetMapIndoorMaskColor", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiSetMapIndoorMaskColor", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiSetMapIndoorMaskColor", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        String optString = jSONObject.optString("maskColor", "#000000");
        int parseColor = Color.parseColor("#000000");
        try {
            parseColor = C88020k.m109562m(optString);
        } catch (Exception unused) {
        }
        y.setIndoorMaskColor(parseColor);
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
