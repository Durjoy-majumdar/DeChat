package kk0;

import android.os.ParcelUuid;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.mapsdk.internal.C113596ci;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import kk0.C88191m;
import mk0.C88736a;
import mk0.C88738b;
import org.json.JSONArray;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89695j;
import qk0.C89696k;
import rk0.C89983c;
import sk0.C90216b;

/* renamed from: kk0.p */
public class C88204p extends C82268c {
    private static final int CTRL_INDEX = 176;
    private static final String NAME = "startBluetoothDevicesDiscovery";

    /* renamed from: kk0.p$a */
    public class C88205a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f255005a;

        /* renamed from: b */
        public final /* synthetic */ int f255006b;

        public C88205a(C82381f fVar, int i) {
            this.f255005a = fVar;
            this.f255006b = i;
        }

        /* renamed from: a */
        public void mo114631a(C89696k kVar) {
            Log.m105925i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "[onScanResult]result:%s", kVar);
            if (kVar.f257988a != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(kVar.f257988a));
                hashMap.put("isDiscovering", Boolean.FALSE);
                this.f255005a.mo109647a(this.f255006b, C88204p.this.mo115110k(kVar.f257989b, kVar.f257990c, hashMap));
                C82241i.m100982a(13);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 0);
            hashMap2.put("isDiscovering", Boolean.TRUE);
            C82381f fVar = this.f255005a;
            int i = this.f255006b;
            C88204p pVar = C88204p.this;
            pVar.getClass();
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap2.put("errno", 0);
            fVar.mo109647a(i, pVar.mo115114o("ok", hashMap2));
            C82241i.m100982a(12);
        }
    }

    /* renamed from: kk0.p$b */
    public class C88206b implements C89695j {

        /* renamed from: a */
        public final /* synthetic */ C82381f f255008a;

        public C88206b(C88204p pVar, C82381f fVar) {
            this.f255008a = fVar;
        }
    }

    /* renamed from: kk0.p$c */
    public static class C88207c extends C82919r2 {
        private static final int CTRL_INDEX = 190;
        private static final String NAME = "onBluetoothDeviceFound";
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        ArrayList arrayList;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C82241i.m100982a(11);
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "startBluetoothDevicesDiscovery data is null");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10013);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            }
            hashMap.put("errno", 101);
            fVar2.mo109647a(i2, mo115114o("fail:invalid data", hashMap));
            C82241i.m100983b(13, 14);
            return;
        }
        Log.m105925i("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "appId:%s startBluetoothDevicesDiscovery data:%s", fVar.getAppId(), jSONObject2);
        C82225c b = C82220a.m100947b(fVar.getAppId());
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap2.put("errno", 1500101);
            fVar2.mo109647a(i2, mo115114o("fail:not init", hashMap2));
            C82241i.m100983b(13, 16);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "adapter is null or not enabled!");
            HashMap hashMap3 = new HashMap();
            hashMap3.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap3.put("errno", 1500102);
            fVar2.mo109647a(i2, mo115114o("fail:not available", hashMap3));
            C82241i.m100983b(13, 18);
        } else {
            boolean optBoolean = jSONObject2.optBoolean("allowDuplicatesKey");
            int optInt = jSONObject2.optInt("interval");
            String optString = jSONObject2.optString("powerLevel", FirebaseAnalytics.C113379b.MEDIUM);
            Log.m105924i("MicroMsg.Ble.BleConfig", "isDefaultRefreshCache, defaultRefreshCache: " + C88736a.f256125g);
            boolean optBoolean2 = jSONObject2.optBoolean("refreshCache", C88736a.f256125g);
            boolean optBoolean3 = jSONObject2.optBoolean("scanWorkaround", true);
            if (jSONObject2.has(C113596ci.f339982a_)) {
                arrayList = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(jSONObject2.optString(C113596ci.f339982a_));
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        arrayList.add(new ScanFilterCompat((String) null, (String) null, ParcelUuid.fromString(jSONArray.getString(i3).toUpperCase()), (ParcelUuid) null, (ParcelUuid) null, (byte[]) null, (byte[]) null, -1, (byte[]) null, (byte[]) null, (ScanFilterCompat.C82257a) null));
                    }
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.JsApiStartBluetoothDevicesDiscovery", "get uuid error!");
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("isDiscovering", Boolean.FALSE);
                    hashMap4.put("errCode", 10004);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:no service");
                    }
                    hashMap4.put("errno", 101);
                    fVar2.mo109647a(i2, mo115114o("fail:no service", hashMap4));
                    C82241i.m100982a(13);
                    return;
                }
            } else {
                arrayList = null;
            }
            C88736a.C88737a aVar = new C88736a.C88737a();
            aVar.f256131a = optInt;
            aVar.f256132b = optBoolean;
            aVar.f256133c = optString;
            aVar.f256134d = optBoolean2;
            aVar.f256135e = optBoolean3;
            C88736a aVar2 = new C88736a(aVar);
            if (b.mo114615h() != null) {
                Log.m105925i("MicroMsg.Ble.BleManager", "initBleConfig:%s", aVar2);
                synchronized (C88736a.class) {
                    try {
                        C88736a.f256124f = aVar2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C88205a aVar3 = new C88205a(fVar2, i2);
            C88206b bVar = new C88206b(this, fVar2);
            C88738b h = b.mo114615h();
            if (h != null) {
                C89983c cVar = h.f256137b;
                synchronized (cVar) {
                    C89983c.C89987d dVar = new C89983c.C89987d(aVar3, arrayList, bVar);
                    cVar.f258555k = dVar;
                    cVar.mo124309c(dVar);
                }
            }
            C88191m.C88199h.m109856p(fVar2, true, true);
        }
    }
}
