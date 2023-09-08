package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kk0.C88191m;
import mk0.C88738b;
import org.json.JSONObject;
import qk0.C89696k;
import sk0.C90216b;

/* renamed from: kk0.q */
public class C88208q extends C82268c {
    private static final int CTRL_INDEX = 177;
    private static final String NAME = "stopBluetoothDevicesDiscovery";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82241i.m100982a(101);
        String appId = fVar.getAppId();
        Object[] objArr = new Object[2];
        objArr[0] = appId;
        if (jSONObject == null) {
            jSONObject = "";
        }
        objArr[1] = jSONObject;
        Log.m105925i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "appId:%s stopBluetoothDevicesDiscovery data:%s", objArr);
        C82225c b = C82220a.m100947b(appId);
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "bleWorker is null, may not open ble");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap.put("errno", 1500101);
            fVar.mo109647a(i, mo115114o("fail:not init", hashMap));
            C82241i.m100983b(103, 106);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "adapter is null or not enabled!");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap2.put("errno", 1500102);
            fVar.mo109647a(i, mo115114o("fail:not available", hashMap2));
            C82241i.m100983b(103, 108);
        } else {
            C88738b h = b.mo114615h();
            C89696k d = h != null ? h.f256137b.mo124310d() : C89696k.f257969f;
            Log.m105925i("MicroMsg.JsApiStopBluetoothDevicesDiscovery", "stopBleScan result:%s", d);
            HashMap hashMap3 = new HashMap();
            if (d.f257988a != 0) {
                hashMap3.put("isDiscovering", Boolean.FALSE);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1510000, "fail");
                }
                hashMap3.put("errno", 1510000);
                fVar.mo109647a(i, mo115114o("fail", hashMap3));
                C82241i.m100982a(103);
                return;
            }
            hashMap3.put("isDiscovering", Boolean.FALSE);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            hashMap3.put("errno", 0);
            fVar.mo109647a(i, mo115114o("ok", hashMap3));
            C82241i.m100982a(102);
            C88191m.C88199h.m109856p(fVar, true, false);
        }
    }
}
