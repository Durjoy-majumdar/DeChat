package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import mk0.C88738b;
import org.json.JSONObject;
import sk0.C90216b;

/* renamed from: kk0.g */
public class C88182g extends C82268c {
    private static final int CTRL_INDEX = 175;
    private static final String NAME = "getBluetoothAdapterState";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82241i.m100982a(126);
        Log.m105925i("MicroMsg.JsApiGetBluetoothAdapterState", "appId:%s getBluetoothAdapterState", fVar.getAppId());
        C82225c b = C82220a.m100947b(fVar.getAppId());
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiGetBluetoothAdapterState", "bleWorker is null, may not open ble");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap.put("errno", 1500101);
            fVar.mo109647a(i, mo115114o("fail:not init", hashMap));
            C82241i.m100983b(128, 130);
            return;
        }
        boolean b2 = C90216b.m112933b();
        C88738b h = b.mo114615h();
        boolean z = h != null ? h.f256137b.f258549e.get() : false;
        Log.m105924i("MicroMsg.JsApiGetBluetoothAdapterState", "availableState : " + b2 + ",discoveringState : " + z);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("available", Boolean.valueOf(b2));
        hashMap2.put("discovering", Boolean.valueOf(z));
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        hashMap2.put("errno", 0);
        fVar.mo109647a(i, mo115114o("ok", hashMap2));
        C82241i.m100982a(127);
    }
}
