package kl0;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentHashMap;
import kl0.C88212b;
import kl0.C88216d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kl0.a */
public class C88211a extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        boolean z;
        if (intent == null) {
            Log.m105924i("MicroMsg.BeaconManager", "Receive intent failed");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            int state = defaultAdapter.getState();
            Log.m105925i("MicroMsg.BeaconManager", "state:%d", Integer.valueOf(state));
            boolean z2 = state == 12;
            boolean z3 = C88212b.f255014c;
            if ((z3 && !z2) || (!z3 && z2)) {
                for (C88212b.C88213a aVar : ((ConcurrentHashMap) C88212b.f255012a).values()) {
                    synchronized (aVar) {
                        z = aVar.f255019e;
                    }
                    if (z && !z2) {
                        aVar.mo122579a();
                    }
                    C88212b.C88213a.C88215b bVar = aVar.f255018d;
                    if (bVar != null) {
                        C88216d.C88217a aVar2 = (C88216d.C88217a) bVar;
                        Log.m105925i("MicroMsg.JsApiStartBeaconDiscovery", "onBluetoothStateChange:%b", Boolean.valueOf(z2));
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("available", z2);
                            jSONObject.put("discovering", false);
                        } catch (JSONException e) {
                            Log.m105921e("MicroMsg.JsApiStartBeaconDiscovery", "put JSON data error : %s", e);
                        }
                        Log.m105919d("MicroMsg.JsApiStartBeaconDiscovery", "OnBeaconServiceChangedEvent %s", jSONObject.toString());
                        C88216d.C88219c cVar = aVar2.f255027b;
                        C82381f fVar = aVar2.f255028c;
                        int componentId = fVar.getComponentId();
                        cVar.mo115161k(fVar);
                        cVar.f242409h = componentId;
                        cVar.f242407f = jSONObject.toString();
                        cVar.mo115158h();
                    }
                }
            }
            C88212b.f255014c = z2;
        }
    }
}
