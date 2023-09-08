package lk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sk0.C90215a;
import sk0.C90216b;
import tk0.C90508a;

/* renamed from: lk0.j */
public final class C88558j extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 727;
    private static final String NAME = "writeBLEPeripheralCharacteristicValue";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        C87412m.m108594g(fVar2, "env");
        if (!C90216b.m112933b()) {
            C90215a.m112929a(this, i, fVar, 10001, "fail:not available", (HashMap) null, 16, (Object) null);
            Log.m105924i("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: Ble is not available");
        } else if (jSONObject2 == null || !jSONObject2.has("serverId")) {
            int i2 = i;
            C90215a.m112929a(this, i, fVar, 10013, "fail:invalid data", (HashMap) null, 16, (Object) null);
        } else {
            C88564p b = C88567s.f255793a.mo123030b(jSONObject2.optInt("serverId"));
            if (b == null) {
                C90215a.m112929a(this, i, fVar, 10020, "fail: no server", (HashMap) null, 16, (Object) null);
            } else if (b.f255785a != C88568t.CONNECTED) {
                C90215a.m112929a(this, i, fVar, 10000, "fail:not init", (HashMap) null, 16, (Object) null);
            } else {
                try {
                    String optString = jSONObject2.optString("serviceId", "");
                    String optString2 = jSONObject2.optString("characteristicId", "");
                    boolean optBoolean = jSONObject2.optBoolean("needNotify", false);
                    int optInt = jSONObject2.optInt("callbackId", -1);
                    String optString3 = jSONObject2.optString("value");
                    Log.m105925i("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: write = " + optString3 + " serviceId = %s, characteristicId = %s, needNotify = %s, jCallbackId = %s", optString, optString2, String.valueOf(optBoolean), String.valueOf(optInt));
                    UUID a = C90508a.m113330a(optString);
                    C87412m.m108593f(a, "fromString(serviceId)");
                    UUID a2 = C90508a.m113330a(optString2);
                    C87412m.m108593f(a2, "fromString(characteristicId)");
                    C87412m.m108593f(optString3, "base64Value");
                    b.mo123026b(a, a2, optBoolean, optInt, optString3);
                    C90215a.m112930b(this, i, fVar2, (HashMap<String, Object>) null);
                } catch (JSONException e) {
                    int i3 = i;
                    Log.m105920e("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: fail: " + e);
                    C90215a.m112929a(this, i, fVar, 10013, "fail:invalid data", (HashMap) null, 16, (Object) null);
                } catch (IllegalArgumentException e2) {
                    int i4 = i;
                    Log.m105920e("MicroMsg.BLE.JsApiWriteBlePeripheralCharacteristicValue", "invoke: fail: " + e2);
                    C90215a.m112929a(this, i, fVar, 10013, "fail:invalid data", (HashMap) null, 16, (Object) null);
                }
            }
        }
    }
}
