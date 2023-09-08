package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.q */
public class C117831q extends C117793b {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "getMapRegion";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetMapRegion", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiGetMapRegion", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiGetMapRegion", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        C118080q.C118084b0 projection = y.getProjection();
        if (projection == null) {
            Log.m105920e("MicroMsg.JsApiGetMapRegion", "projection is  null");
            fVar.mo109647a(i, mo115109j("fail:projection is null"));
            return;
        }
        C118080q.C118086c0 c0Var = projection.f352992a;
        if (c0Var == null) {
            Log.m105920e("MicroMsg.JsApiGetMapRegion", "visibleRegion is  null");
            fVar.mo109647a(i, mo115109j("fail:visibleRegion is null"));
            return;
        }
        C118080q.C118094k kVar = c0Var.f353000a;
        if (kVar == null) {
            Log.m105920e("MicroMsg.JsApiGetMapRegion", "latLngBounds is  null");
            fVar.mo109647a(i, mo115109j("fail:latLngBounds is null"));
            return;
        }
        C118080q.C118093j jVar = kVar.f353024a;
        C118080q.C118093j jVar2 = kVar.f353025b;
        HashMap hashMap = new HashMap();
        if (jVar != null) {
            hashMap.put("latitude", Double.valueOf(jVar.f353022a));
            hashMap.put("longitude", Double.valueOf(jVar.f353023b));
        }
        HashMap hashMap2 = new HashMap();
        if (jVar2 != null) {
            hashMap2.put("latitude", Double.valueOf(jVar2.f353022a));
            hashMap2.put("longitude", Double.valueOf(jVar2.f353023b));
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("southwest", hashMap);
        hashMap3.put("northeast", hashMap2);
        Log.m105925i("MicroMsg.JsApiGetMapRegion", "getMapRegion ok, values:%s", hashMap3.toString());
        mo182575w(fVar, i, mo115112m("ok", hashMap3), true, y.mo182849h());
    }
}
