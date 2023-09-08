package lk0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82232e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import rx3.C13598b0;
import sk0.C90215a;
import sk0.C90216b;

/* renamed from: lk0.e */
public final class C88550e extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 721;
    private static final String NAME = "createBLEPeripheralServer";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int i2;
        ConcurrentHashMap concurrentHashMap;
        C88568t tVar = C88568t.CREATED;
        C87412m.m108594g(fVar, "env");
        if (!C90216b.m112933b()) {
            C90215a.m112929a(this, i, fVar, 10001, "fail:not available", (HashMap) null, 16, (Object) null);
            Log.m105924i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: Ble is not available");
            return;
        }
        HashMap hashMap = new HashMap();
        C88567s sVar = C88567s.f255793a;
        boolean z = true;
        boolean z2 = false;
        if (((ConcurrentHashMap) C88567s.f255794b).size() + 1 > 10) {
            Log.m105924i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: out of bound");
            C90215a.m112929a(this, i, fVar, 10008, "fail: servers count overflow", (HashMap) null, 16, (Object) null);
            return;
        }
        synchronized (sVar) {
            if (C88567s.f255795c == null) {
                C88567s.f255795c = new C88565q();
                C83231l.m102140a(fVar.getAppId(), C88567s.f255795c);
            }
            if (C88567s.f255796d == null) {
                C88567s.f255796d = new C88566r(fVar);
                C82232e.f241129a.mo114629a(fVar.getAppId(), C88567s.f255796d);
            }
            if (C88567s.f255797e) {
                i2 = -1;
            } else {
                C13598b0 b0Var = C13598b0.f38549a;
                do {
                    i2 = C90215a.m112931c();
                    concurrentHashMap = (ConcurrentHashMap) C88567s.f255794b;
                } while (concurrentHashMap.containsKey(Integer.valueOf(i2)));
                C88564p pVar = new C88564p();
                BluetoothManager e = C90216b.m112936e();
                boolean c = C90216b.m112934c() & true;
                BluetoothAdapter d = C90216b.m112935d();
                if (d != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("isPeripheralBleSupported: isMultipleAdvertisementSupported = ");
                    sb.append(d.isMultipleAdvertisementSupported());
                    sb.append("\nisOffloadedFilteringSupported = ");
                    sb.append(d.isOffloadedFilteringSupported());
                    sb.append("\nisOffloadedScanBatchingSupported = ");
                    sb.append(d.isOffloadedScanBatchingSupported());
                    sb.append("\nbluetoothLeAdvertiser != null? = ");
                    sb.append(d.getBluetoothLeAdvertiser() != null);
                    sb.append(10);
                    Log.m105918d("MicroMsg.BLE.BleHelpExt", sb.toString());
                    if (d.getBluetoothLeAdvertiser() == null) {
                        z = false;
                    }
                    z2 = z;
                }
                if (((c & z2) && C90216b.m112933b()) && e != null) {
                    pVar.f255785a = tVar;
                    pVar.f255787c = fVar;
                    pVar.f255788d = i2;
                    pVar.f255791g = new C88546b();
                    BluetoothGattServer openGattServer = e.openGattServer(MMApplicationContext.getContext(), pVar.f255791g);
                    if (openGattServer == null) {
                        pVar.f255785a = C88568t.TROUBLESOME;
                    } else {
                        pVar.f255786b = openGattServer;
                        C88546b bVar = pVar.f255791g;
                        C87412m.m108591d(bVar);
                        bVar.f255758c = pVar;
                    }
                }
                concurrentHashMap.put(Integer.valueOf(i2), pVar);
            }
        }
        C88564p b = C88567s.f255793a.mo123030b(i2);
        if (b == null || b.f255785a != tVar) {
            C90215a.m112929a(this, i, fVar, 10001, "fail:not available", (HashMap) null, 16, (Object) null);
            return;
        }
        Log.m105924i("MicroMsg.BLE.JsApiCreateBLEPeripheralServer", "invoke: serverId = " + i2);
        hashMap.put("serverId", Integer.valueOf(i2));
        C90215a.m112930b(this, i, fVar, hashMap);
    }
}
