package lk0;

import android.bluetooth.BluetoothAdapter;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import org.json.JSONObject;
import sk0.C90215a;
import sk0.C90216b;
import zt3.C119157j;

/* renamed from: lk0.i */
public final class C88556i extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 726;
    private static final String NAME = "stopBLEPeripheralAdvertising";

    /* renamed from: lk0.i$a */
    public static final class C88557a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f255777d;

        /* renamed from: e */
        public final /* synthetic */ C88556i f255778e;

        /* renamed from: f */
        public final /* synthetic */ int f255779f;

        /* renamed from: g */
        public final /* synthetic */ C82381f f255780g;

        public C88557a(JSONObject jSONObject, C88556i iVar, int i, C82381f fVar) {
            this.f255777d = jSONObject;
            this.f255778e = iVar;
            this.f255779f = i;
            this.f255780g = fVar;
        }

        public final void run() {
            C88564p b = C88567s.f255793a.mo123030b(this.f255777d.optInt("serverId"));
            if (b == null) {
                C90215a.m112929a(this.f255778e, this.f255779f, this.f255780g, 10020, "fail: no server", (HashMap) null, 16, (Object) null);
                return;
            }
            BluetoothAdapter d = C90216b.m112935d();
            if (d == null) {
                Log.m105924i("MicroMsg.BLE.JsApiStopBlePeripheralAdvertising", "invoke: adapter is null");
                C90215a.m112929a(this.f255778e, this.f255779f, this.f255780g, 10001, "fail:not available", (HashMap) null, 16, (Object) null);
                return;
            }
            b.mo123028d(d);
            C90215a.m112930b(this.f255778e, this.f255779f, this.f255780g, (HashMap<String, Object>) null);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C87412m.m108594g(fVar, "env");
        if (!C90216b.m112933b()) {
            C90215a.m112929a(this, i, fVar, 10001, "fail:not available", (HashMap) null, 16, (Object) null);
            Log.m105924i("MicroMsg.BLE.JsApiStopBlePeripheralAdvertising", "invoke: Ble is not available");
        } else if (jSONObject == null || !jSONObject.has("serverId")) {
            Log.m105920e("MicroMsg.BLE.JsApiStopBlePeripheralAdvertising", "createBLEPeripheralServer data is invalid");
            C90215a.m112929a(this, i, fVar, 10013, "fail:invalid data", (HashMap) null, 16, (Object) null);
        } else {
            ((C119157j) C119157j.f356862d).mo183876g(new C88557a(jSONObject, this, i, fVar), "MicroMsg.BLE.Peripheral");
        }
    }
}
