package ol0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pl0.C118080q;

/* renamed from: ol0.p */
public class C117829p extends C117793b {
    public static final int CTRL_INDEX = 525;
    public static final String NAME = "getMapIndoorFloor";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        super.mo1505u(fVar, jSONObject, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetMapActiveIndoorInfo", "data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiGetMapActiveIndoorInfo", "data:%s", jSONObject);
        C118080q y = mo182577y(fVar, jSONObject);
        if (y == null) {
            Log.m105920e("MicroMsg.JsApiGetMapActiveIndoorInfo", "mapView is null, return");
            fVar.mo109647a(i, mo115109j("fail:mapview is null"));
            return;
        }
        C118080q.C118090g O = y.mo182817O();
        HashMap hashMap = new HashMap();
        if (O != null) {
            try {
                hashMap.put("buildingId", O.f353011a);
                hashMap.put("buildingName", O.f353012b);
                List<C118080q.C118091h> list = O.f353013c;
                if (list != null && ((LinkedList) list).size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C118080q.C118091h hVar : O.f353013c) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", hVar.f353015a);
                        jSONArray.put(jSONObject2);
                    }
                    hashMap.put("floorList", jSONArray);
                }
                hashMap.put("floorIndex", Integer.valueOf(O.f353014d));
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiGetMapActiveIndoorInfo", "put JSON data error : %s", e);
            }
        }
        Log.m105925i("MicroMsg.JsApiGetMapActiveIndoorInfo", "getMapActiveIndoorInfo ok, values:%s", hashMap.toString());
        mo182575w(fVar, i, mo115112m("ok", hashMap), true, y.mo182849h());
    }
}
