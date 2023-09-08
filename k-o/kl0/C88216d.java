package kl0;

import android.bluetooth.BluetoothAdapter;
import android.content.IntentFilter;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.IXWebBroadcastListener;
import j20.C117292a;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;
import kl0.C88212b;
import op3.C117877b;
import op3.C117882j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C11171e;

/* renamed from: kl0.d */
public class C88216d extends C82268c {
    private static final int CTRL_INDEX = 221;
    private static final String NAME = "startBeaconDiscovery";

    /* renamed from: g */
    public C83231l.C83234d f255024g = null;

    /* renamed from: h */
    public C88212b.C88213a.C88215b f255025h;

    /* renamed from: kl0.d$a */
    public class C88217a implements C88212b.C88213a.C88215b {

        /* renamed from: a */
        public C88220d f255026a = new C88220d((C88217a) null);

        /* renamed from: b */
        public C88219c f255027b = new C88219c((C88217a) null);

        /* renamed from: c */
        public final /* synthetic */ C82381f f255028c;

        public C88217a(C88216d dVar, C82381f fVar) {
            this.f255028c = fVar;
        }
    }

    /* renamed from: kl0.d$b */
    public class C88218b extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ C82381f f255029d;

        public C88218b(C82381f fVar) {
            this.f255029d = fVar;
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105924i("MicroMsg.JsApiStartBeaconDiscovery", "onDestroy");
            C83231l.m102144e(this.f255029d.getAppId(), this);
            C88212b.C88213a aVar = (C88212b.C88213a) ((ConcurrentHashMap) C88212b.f255012a).get(this.f255029d.getAppId());
            if (aVar != null) {
                aVar.mo122579a();
                C88212b.m109866a(this.f255029d.getAppId());
            }
            C88216d.this.f255024g = null;
        }
    }

    /* renamed from: kl0.d$c */
    public static class C88219c extends C82919r2 {
        private static final int CTRL_INDEX = 225;
        private static final String NAME = "onBeaconServiceChanged";

        public C88219c(C88217a aVar) {
        }
    }

    /* renamed from: kl0.d$d */
    public static class C88220d extends C82919r2 {
        private static final int CTRL_INDEX = 224;
        private static final String NAME = "onBeaconUpdated";

        public C88220d(C88217a aVar) {
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        boolean z;
        C117877b bVar;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        Log.m105925i("MicroMsg.JsApiStartBeaconDiscovery", "startBeaconDiscovery data %s", jSONObject2);
        UUID[] uuidArr = null;
        if (jSONObject2.has("uuids")) {
            try {
                JSONArray jSONArray = new JSONArray(jSONObject2.optString("uuids"));
                uuidArr = new UUID[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    String string = jSONArray.getString(i3);
                    Log.m105919d("MicroMsg.JsApiStartBeaconDiscovery", "uuid %s", string);
                    uuidArr[i3] = UUID.fromString(string);
                }
            } catch (JSONException unused) {
                Log.m105920e("MicroMsg.JsApiStartBeaconDiscovery", "get uuid error!");
            }
        }
        if (uuidArr == null || uuidArr.length <= 0) {
            Log.m105920e("MicroMsg.JsApiStartBeaconDiscovery", "serviceUuids is empty");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 11006);
            fVar2.mo109647a(i2, mo115112m("fail:invalid data", hashMap));
            return;
        }
        String appId = fVar.getAppId();
        C88212b.C88213a aVar = (C88212b.C88213a) ((ConcurrentHashMap) C88212b.f255012a).get(fVar.getAppId());
        if (aVar == null) {
            Log.m105924i("MicroMsg.JsApiStartBeaconDiscovery", "beaconWorker init");
            aVar = new C88212b.C88213a();
            ((ConcurrentHashMap) C88212b.f255012a).put(appId, aVar);
            if (C88212b.f255013b == null) {
                Log.m105924i("MicroMsg.BeaconManager", "bluetoothStateListener init");
                C88212b.f255013b = new C88211a();
                MMApplicationContext.getContext().registerReceiver(C88212b.f255013b, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            }
        }
        if (this.f255025h == null) {
            Log.m105924i("MicroMsg.JsApiStartBeaconDiscovery", "onBeaconScanCallback init");
            this.f255025h = new C88217a(this, fVar2);
        }
        if (this.f255024g == null) {
            Log.m105924i("MicroMsg.JsApiStartBeaconDiscovery", "listener init");
            this.f255024g = new C88218b(fVar2);
            C83231l.m102140a(fVar.getAppId(), this.f255024g);
        }
        aVar.f255017c = uuidArr;
        aVar.f255018d = this.f255025h;
        Log.m105925i("MicroMsg.BeaconManager", "BeaconWorker:%d start", Integer.valueOf(aVar.hashCode()));
        synchronized (aVar) {
            try {
                z = aVar.f255019e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            Log.m105925i("MicroMsg.BeaconManager", "BeaconWorker:%d, already start", Integer.valueOf(aVar.hashCode()));
            bVar = C117882j.m166284c(11003, "fail:already start");
        } else if (C11171e.m11044a(18)) {
            Log.m105920e("MicroMsg.BeaconManager", "API version is below 18!");
            bVar = C117882j.m166284c(11000, "fail:not support");
        } else {
            BluetoothAdapter bluetoothAdapter = aVar.f255015a;
            if (bluetoothAdapter == null) {
                Log.m105920e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
                bVar = C117882j.m166284c(11001, "fail:bluetooth service is unavailable");
            } else if (!bluetoothAdapter.isEnabled()) {
                Log.m105920e("MicroMsg.BeaconManager", "bluetoothAdapter is not enabled!");
                bVar = C117882j.m166284c(11001, "fail:bluetooth service is unavailable");
            } else if (aVar.f255015a.isDiscovering()) {
                Log.m105920e("MicroMsg.BeaconManager", "bluetoothAdapter is Discovering!");
                bVar = C117882j.m166284c(11003, "fail:already start");
            } else {
                ((ConcurrentHashMap) aVar.f255016b).clear();
                Log.m105924i("MicroMsg.BeaconManager", "[BluetoothTrace] start scan");
                Log.printErrStackTrace("MicroMsg.BeaconManager", new Throwable(), "[BluetoothTrace] ble scan stacktrace", new Object[0]);
                BluetoothAdapter bluetoothAdapter2 = aVar.f255015a;
                BluetoothAdapter.LeScanCallback leScanCallback = aVar.f255022h;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(leScanCallback);
                boolean booleanValue = ((Boolean) C117292a.m165364j(bluetoothAdapter2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/jsapi/ibeacon/BeaconManager$BeaconWorker", IXWebBroadcastListener.STAGE_START, "()Lcom/tencent/mm/vending/tuple/Tuple2;", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                Log.m105925i("MicroMsg.BeaconManager", "startLeScan:%b", Boolean.valueOf(booleanValue));
                if (!booleanValue) {
                    bVar = C117882j.m166284c(11005, "fail:system error");
                } else {
                    aVar.f255019e = true;
                    bVar = C117882j.m166284c(0, "");
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("errCode", bVar.mo182596a(0));
        fVar2.mo109647a(i2, mo115112m(((Integer) bVar.mo182596a(0)).intValue() == 0 ? "ok" : (String) bVar.mo182596a(1), hashMap2));
    }
}
