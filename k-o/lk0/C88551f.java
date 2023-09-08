package lk0;

import android.bluetooth.BluetoothGattService;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONObject;
import sk0.C90215a;
import sk0.C90216b;
import tk0.C90508a;

/* renamed from: lk0.f */
public final class C88551f extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 724;
    private static final String NAME = "removeBLEPeripheralService";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "env");
        if (!C90216b.m112933b()) {
            C90215a.m112929a(this, i, fVar, 10001, "fail:not available", (HashMap) null, 16, (Object) null);
            Log.m105924i("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke: Ble is not available");
        } else if (jSONObject == null || !jSONObject.has("serverId") || !jSONObject.has("serviceId")) {
            Log.m105920e("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke data is invalid");
            C90215a.m112929a(this, i, fVar, 10013, "fail:invalid data", (HashMap) null, 16, (Object) null);
        } else {
            C88564p b = C88567s.f255793a.mo123030b(jSONObject.optInt("serverId"));
            if (b == null) {
                Log.m105924i("MicroMsg.BLE.JsApiRemoveBlePeripheralService", "invoke: retrieve a null server");
                C90215a.m112929a(this, i, fVar, 10020, "fail: no server", (HashMap) null, 16, (Object) null);
                return;
            }
            try {
                UUID a = C90508a.m113330a(jSONObject.optString("serviceId"));
                C87412m.m108593f(a, "fromString(data.optString(PARAMS_SERVICE_ID))");
                BluetoothGattService service = b.mo123025a().getService(a);
                if (service == null) {
                    C90215a.m112929a(this, i, fVar, 10004, "fail:no service", (HashMap) null, 16, (Object) null);
                } else if (b.mo123025a().removeService(service)) {
                    C90215a.m112930b(this, i, fVar, (HashMap<String, Object>) null);
                } else {
                    C90215a.m112929a(this, i, fVar, 10008, "fail: remove #" + a + " service fail", (HashMap) null, 16, (Object) null);
                }
            } catch (Exception unused) {
                C90215a.m112929a(this, i, fVar, 10013, "fail:invalid data", (HashMap) null, 16, (Object) null);
            }
        }
    }
}
