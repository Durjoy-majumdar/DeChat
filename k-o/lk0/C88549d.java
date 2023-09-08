package lk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import sk0.C90215a;
import sk0.C90216b;

/* renamed from: lk0.d */
public final class C88549d extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 722;
    private static final String NAME = "closeBLEPeripheralServer";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "env");
        if (!C90216b.m112933b()) {
            C90215a.m112929a(this, i, fVar, 10001, "fail:not available", (HashMap) null, 16, (Object) null);
            Log.m105924i("MicroMsg.BLE.JsApiCloseBlePeripheralServer", "invoke: Ble is not available");
        } else if (jSONObject == null || !jSONObject.has("serverId")) {
            Log.m105920e("MicroMsg.BLE.JsApiCloseBlePeripheralServer", "createBLEPeripheralServer data is invalid");
            C90215a.m112929a(this, i, fVar, 10013, "fail:invalid data", (HashMap) null, 16, (Object) null);
        } else {
            int optInt = jSONObject.optInt("serverId");
            C88567s sVar = C88567s.f255793a;
            boolean z = false;
            if (!C88567s.f255797e) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C88567s.f255794b;
                C88564p pVar = (C88564p) concurrentHashMap.get(Integer.valueOf(optInt));
                if (pVar != null) {
                    pVar.mo123027c();
                    if (concurrentHashMap.remove(Integer.valueOf(optInt)) != null) {
                        z = true;
                    }
                }
            }
            if (z) {
                C90215a.m112930b(this, i, fVar, (HashMap<String, Object>) null);
                return;
            }
            Log.m105924i("MicroMsg.BLE.JsApiCloseBlePeripheralServer", "invoke: fail: #" + optInt + " server is not exists");
            C90215a.m112929a(this, i, fVar, 10020, "fail: no server", (HashMap) null, 16, (Object) null);
        }
    }
}
