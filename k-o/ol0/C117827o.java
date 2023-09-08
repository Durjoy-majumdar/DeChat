package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.o */
public class C117827o extends C117793b {
    public static final int CTRL_INDEX = 144;
    public static final String NAME = "getMapCenterLocation";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetMapCenterLocation", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiGetMapCenterLocation", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiGetMapCenterLocation", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        HashMap hashMap = new HashMap();
        C118080q.C118093j mapCenter = y.getMapCenter();
        hashMap.put("latitude", Double.valueOf(mapCenter.f353022a));
        hashMap.put("longitude", Double.valueOf(mapCenter.f353023b));
        Log.m105925i("MicroMsg.JsApiGetMapCenterLocation", "ok, values:%s", hashMap.toString());
        mo182575w(fVar, i, mo115112m("ok", hashMap), true, y.mo182849h());
    }
}
