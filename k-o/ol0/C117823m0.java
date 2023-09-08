package ol0;

import android.graphics.Point;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.m0 */
public class C117823m0 extends C117793b {
    public static final int CTRL_INDEX = 892;
    public static final String NAME = "toScreenLocation";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiToScreenLocation", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiToScreenLocation", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiToScreenLocation", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        try {
            Point E = y.mo182797E(new C118080q.C118093j(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude")));
            if (E != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("x", Integer.valueOf(C88020k.m109554e(E.x)));
                hashMap.put("y", Integer.valueOf(C88020k.m109554e(E.y)));
                Log.m105925i("MicroMsg.JsApiToScreenLocation", "toScreenLocation ok values:%s", hashMap.toString());
                fVar.mo109647a(i, mo115112m("ok", hashMap));
                return;
            }
            Log.m105924i("MicroMsg.JsApiToScreenLocation", "toScreenLocation fail");
            fVar.mo109647a(i, mo115109j("fail:point is empty"));
        } catch (JSONException e) {
            Log.m105924i("MicroMsg.JsApiToScreenLocation", "");
            Log.m105921e("MicroMsg.JsApiToScreenLocation", "parse toScreenLocation error, exception : %s", e);
            mo182575w(fVar, i, mo115109j("fail:internal error"), false, y.mo182849h());
        }
    }
}
