package kl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kl0.C88212b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kl0.e */
public class C88221e extends C82268c {
    private static final int CTRL_INDEX = 222;
    private static final String NAME = "stopBeaconDiscovery";

    /* renamed from: kl0.e$b */
    public static class C88223b extends C82919r2 {
        private static final int CTRL_INDEX = 225;
        private static final String NAME = "onBeaconServiceChanged";

        public C88223b(C88222a aVar) {
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.JsApiStopBeaconDiscovery", "stopBeaconDiscovery!");
        C88212b.C88213a aVar = (C88212b.C88213a) ((ConcurrentHashMap) C88212b.f255012a).get(fVar.getAppId());
        if (aVar == null) {
            Log.m105920e("MicroMsg.JsApiStopBeaconDiscovery", "beaconWorker is null");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 11004);
            fVar.mo109647a(i, mo115112m("fail:not start", hashMap));
            return;
        }
        if (aVar.mo122579a()) {
            C88212b.m109866a(fVar.getAppId());
            new HashMap().put("errCode", 0);
            fVar.mo109647a(i, mo115109j("ok"));
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 11004);
            fVar.mo109647a(i, mo115112m("fail:not start", hashMap2));
        }
        C88223b bVar = new C88223b((C88222a) null);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("available", C88212b.f255014c);
            jSONObject2.put("discovering", false);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiStopBeaconDiscovery", "put JSON data error : %s", e);
        }
        Log.m105925i("MicroMsg.JsApiStopBeaconDiscovery", "OnBeaconServiceChangedEvent %s", jSONObject2.toString());
        int componentId = fVar.getComponentId();
        bVar.mo115161k(fVar);
        bVar.f242409h = componentId;
        bVar.f242407f = jSONObject2.toString();
        bVar.mo115158h();
    }
}
