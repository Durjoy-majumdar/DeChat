package lk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lk0.a */
public final class C88545a {
    /* renamed from: a */
    public static final void m110421a(C82381f fVar, String str, String str2, boolean z) {
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(str, "deviceID");
        C87412m.m108594g(str2, "serverID");
        Log.m105924i("MicroMsg.BLE.BlePeripheralPublishEventFuns", "jOnBLEPeripheralConnectionStateChanged: connected = " + z + ", deviceID = " + str + ", serverID = " + str2);
        try {
            C88559k kVar = new C88559k();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", str);
            jSONObject.put("serverId", str2);
            jSONObject.put("connected", z);
            kVar.mo115163m(jSONObject.toString());
            kVar.mo115161k(fVar);
            kVar.mo115158h();
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.BLE.BlePeripheralPublishEventFuns", "BlePeripheralPublishEventFuns fail", e);
        }
    }
}
