package kl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kl0.C88212b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: kl0.c */
public class C33935c extends C82268c {
    private static final int CTRL_INDEX = 223;
    private static final String NAME = "getBeacons";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105918d("MicroMsg.JsApiGetBeacons", "getBeacons!");
        JSONArray jSONArray = new JSONArray();
        C88212b.C88213a aVar = (C88212b.C88213a) ((ConcurrentHashMap) C88212b.f255012a).get(fVar.getAppId());
        if (aVar != null) {
            Map<String, JSONObject> map = aVar.f255016b;
            Log.m105918d("MicroMsg.JsApiGetBeacons", "getBeaconInfo, beaconInfos: " + map);
            if (map != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
                if (concurrentHashMap.size() > 0) {
                    for (JSONObject put : concurrentHashMap.values()) {
                        jSONArray.put(put);
                    }
                }
            }
        } else {
            Log.m105920e("MicroMsg.JsApiGetBeacons", "not found device");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("beacons", jSONArray);
        fVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
