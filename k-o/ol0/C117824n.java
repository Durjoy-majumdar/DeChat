package ol0;

import android.graphics.Point;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.n */
public class C117824n extends C117793b {
    public static final int CTRL_INDEX = 893;
    public static final String NAME = "fromScreenLocation";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiFromScreenLocation", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiFromScreenLocation", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiFromScreenLocation", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        try {
            int i2 = jSONObject.getInt("x");
            int i3 = jSONObject.getInt("y");
            Point point = new Point();
            point.x = C88020k.m109553d(i2);
            point.y = C88020k.m109553d(i3);
            Log.m105925i("MicroMsg.JsApiFromScreenLocation", "x:%d, y:%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
            C118080q.C118093j fromScreenLocation = y.fromScreenLocation(point);
            if (fromScreenLocation != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("latitude", Double.valueOf(fromScreenLocation.f353022a));
                hashMap.put("longitude", Double.valueOf(fromScreenLocation.f353023b));
                Log.m105925i("MicroMsg.JsApiFromScreenLocation", "fromScreenLocation ok values:%s", hashMap.toString());
                fVar.mo109647a(i, mo115112m("ok", hashMap));
                return;
            }
            Log.m105924i("MicroMsg.JsApiFromScreenLocation", "fromScreenLocation fail");
            fVar.mo109647a(i, mo115109j("fail:location is empty"));
        } catch (JSONException e) {
            Log.m105924i("MicroMsg.JsApiFromScreenLocation", "");
            Log.m105921e("MicroMsg.JsApiFromScreenLocation", "parse fromScreenLocation error, exception : %s", e);
            mo182575w(fVar, i, mo115109j("fail:internal error"), false, y.mo182849h());
        }
    }
}
