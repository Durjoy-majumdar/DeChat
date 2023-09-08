package kk0;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82223b;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82232e;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import mk0.C88736a;
import mk0.C88738b;
import org.json.JSONException;
import org.json.JSONObject;
import qk0.C89692g;
import qk0.C89693h;
import qk0.C89694i;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: kk0.m */
public class C88191m extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 173;
    public static final String NAME = "openBluetoothAdapter";

    /* renamed from: kk0.m$a */
    public class C88192a implements C82225c.C82226a {

        /* renamed from: a */
        public final /* synthetic */ C82381f f254994a;

        public C88192a(C88191m mVar, C82381f fVar) {
            this.f254994a = fVar;
        }

        public void onBluetoothStateChange(boolean z) {
            C88199h.m109856p(this.f254994a, z, false);
        }
    }

    /* renamed from: kk0.m$b */
    public class C88193b implements C89694i {

        /* renamed from: a */
        public final /* synthetic */ C82381f f254995a;

        public C88193b(C88191m mVar, C82381f fVar) {
            this.f254995a = fVar;
        }

        /* renamed from: a */
        public void mo114612a(String str, boolean z) {
            C82381f fVar = this.f254995a;
            synchronized (C88197f.class) {
                if (fVar == null) {
                    Log.m105920e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLEConnectionStateChangedEvent dispatch fail, service is null");
                    return;
                }
                C88197f fVar2 = new C88197f();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.remove("deviceId");
                    jSONObject.put("deviceId", str);
                    jSONObject.remove("connected");
                    jSONObject.put("connected", z);
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e);
                }
                int componentId = fVar.getComponentId();
                fVar2.mo115161k(fVar);
                fVar2.f242409h = componentId;
                fVar2.f242407f = jSONObject.toString();
                fVar2.mo115158h();
                Log.m105925i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLEConnectionStateChangedEvent %s", jSONObject.toString());
            }
        }
    }

    /* renamed from: kk0.m$c */
    public class C88194c implements C89693h {

        /* renamed from: a */
        public final /* synthetic */ C82381f f254996a;

        public C88194c(C88191m mVar, C82381f fVar) {
            this.f254996a = fVar;
        }

        /* renamed from: a */
        public void mo122577a(String str, String str2, String str3, String str4) {
            C82381f fVar = this.f254996a;
            if (fVar == null) {
                Log.m105920e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLECharacteristicValueChangeEvent dispatch fail, service is null");
                return;
            }
            C88196e eVar = new C88196e();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.remove("value");
                jSONObject.put("value", str4);
                jSONObject.remove("deviceId");
                jSONObject.put("deviceId", str);
                jSONObject.remove("serviceId");
                jSONObject.put("serviceId", str2);
                jSONObject.remove("characteristicId");
                jSONObject.put("characteristicId", str3);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e);
            }
            int componentId = fVar.getComponentId();
            eVar.mo115161k(fVar);
            eVar.f242409h = componentId;
            eVar.f242407f = jSONObject.toString();
            eVar.mo115158h();
            Log.m105925i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBLECharacteristicValueChangeEvent %s", jSONObject.toString());
        }
    }

    /* renamed from: kk0.m$d */
    public class C88195d implements C89692g {

        /* renamed from: a */
        public final /* synthetic */ C82381f f254997a;

        public C88195d(C88191m mVar, C82381f fVar) {
            this.f254997a = fVar;
        }
    }

    /* renamed from: kk0.m$e */
    public static class C88196e extends C82919r2 {
        private static final int CTRL_INDEX = 187;
        private static final String NAME = "onBLECharacteristicValueChange";
    }

    /* renamed from: kk0.m$f */
    public static class C88197f extends C82919r2 {
        private static final int CTRL_INDEX = 188;
        private static final String NAME = "onBLEConnectionStateChanged";
    }

    /* renamed from: kk0.m$g */
    public static class C88198g extends C82919r2 {
        private static final int CTRL_INDEX = -2;
        private static final String NAME = "onBLEMTUChange";

        public C88198g(C88192a aVar) {
        }
    }

    /* renamed from: kk0.m$h */
    public static class C88199h extends C82919r2 {
        private static final int CTRL_INDEX = 189;
        private static final String NAME = "onBluetoothAdapterStateChange";

        /* renamed from: p */
        public static void m109856p(C82381f fVar, boolean z, boolean z2) {
            if (fVar == null) {
                Log.m105920e("MicroMsg.JsApiOpenBluetoothAdapter", "OnBluetoothAdapterStateChangeEvent dispatch fail, service is null");
                return;
            }
            C88199h hVar = new C88199h();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.remove("available");
                jSONObject.put("available", z);
                jSONObject.remove("discovering");
                jSONObject.put("discovering", z2);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiOpenBluetoothAdapter", "put JSON data error : %s", e);
            }
            int componentId = fVar.getComponentId();
            hVar.mo115161k(fVar);
            hVar.f242409h = componentId;
            hVar.f242407f = jSONObject.toString();
            hVar.mo115158h();
            Log.m105925i("MicroMsg.JsApiOpenBluetoothAdapter", "OnBluetoothAdapterStateChange %s", jSONObject.toString());
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C89696k kVar;
        C82241i.m100982a(0);
        String appId = fVar.getAppId();
        Log.m105925i("MicroMsg.JsApiOpenBluetoothAdapter", "appid:%s openBluetoothAdapter!", appId);
        C88192a aVar = new C88192a(this, fVar);
        C88193b bVar = new C88193b(this, fVar);
        C88194c cVar = new C88194c(this, fVar);
        C88195d dVar = new C88195d(this, fVar);
        Map<String, C82225c> map = C82220a.f241093a;
        synchronized (C82220a.class) {
            Log.m105925i("MicroMsg.Ble.BleManager", "open appId:%s", appId);
            if (!C90216b.m112934c()) {
                Log.m105920e("MicroMsg.Ble.BleManager", "api version is below 18");
                kVar = C89696k.f257978o;
            } else {
                if (!((HashMap) C82220a.f241093a).containsKey(appId)) {
                    C82225c cVar2 = new C82225c(appId);
                    synchronized (cVar2) {
                        C88738b bVar2 = new C88738b(MMApplicationContext.getContext());
                        cVar2.f241102f = bVar2;
                        bVar2.mo123178a();
                        cVar2.f241102f.f256136a.f256597c = new C82223b(cVar2);
                    }
                    ((CopyOnWriteArrayList) cVar2.f241103g).add(aVar);
                    ((CopyOnWriteArrayList) cVar2.f241104h).add(bVar);
                    C88738b h = cVar2.mo114615h();
                    if (h != null) {
                        h.f256136a.f256598d = cVar;
                    }
                    C88738b h2 = cVar2.mo114615h();
                    if (h2 != null) {
                        h2.f256136a.f256599e = dVar;
                    }
                    ((HashMap) C82220a.f241093a).put(appId, cVar2);
                    C83231l.m102140a(appId, cVar2);
                    C82232e.f241129a.mo114629a(appId, cVar2);
                    C82220a.m100948c();
                } else {
                    Log.m105925i("MicroMsg.Ble.BleManager", "already open appId:%s", appId);
                }
                if (!C90216b.m112933b()) {
                    Log.m105920e("MicroMsg.Ble.BleManager", "bluetooth not enable, err");
                    kVar = C89696k.f257972i;
                } else {
                    kVar = C89696k.f257968e;
                }
            }
        }
        C89696k w = mo114640w(fVar, kVar);
        HashMap hashMap = new HashMap();
        int i2 = w.f257988a;
        if (i2 == 0) {
            if (jSONObject != null) {
                Log.m105924i("MicroMsg.JsApiOpenBluetoothAdapter", "doSomeGlobalConfigAfterOpenBluetoothAdapter, data: " + jSONObject);
                if (jSONObject.has("refreshCache")) {
                    try {
                        boolean z = jSONObject.getBoolean("refreshCache");
                        Log.m105924i("MicroMsg.Ble.BleConfig", "setDefaultRefreshCache, defaultRefreshCache: " + z);
                        C88736a.f256125g = z;
                    } catch (JSONException unused) {
                    }
                }
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap.put("errno", 0);
            fVar.mo109647a(i, mo115114o("ok", hashMap));
            C82241i.m100982a(1);
        } else if (i2 == 10001) {
            hashMap.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap.put("errno", 1500102);
            fVar.mo109647a(i, mo115114o("fail:not available", hashMap));
            C82241i.m100983b(2, 7);
        } else if (i2 != 10009) {
            hashMap.put("errCode", Integer.valueOf(i2));
            fVar.mo109647a(i, mo115110k(w.f257989b, w.f257990c, hashMap));
            C82241i.m100982a(2);
        } else {
            hashMap.put("errCode", 10009);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500105, "fail:system not support");
            }
            hashMap.put("errno", 1500105);
            fVar.mo109647a(i, mo115114o("fail:system not support", hashMap));
            C82241i.m100983b(2, 8);
        }
    }

    /* renamed from: w */
    public C89696k mo114640w(C82381f fVar, C89696k kVar) {
        return kVar;
    }
}
