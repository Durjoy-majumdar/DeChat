package kk0;

import com.tencent.mapsdk.internal.C113596ci;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mk0.C88738b;
import nk0.C89004f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qk0.C89689d;
import sk0.C90216b;

/* renamed from: kk0.i */
public class C88184i extends C82268c {
    private static final int CTRL_INDEX = 179;
    private static final String NAME = "getConnectedBluetoothDevices";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        ArrayList arrayList;
        List<C89689d> list;
        List<C89689d> c;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        C82241i.m100982a(191);
        Log.m105924i("MicroMsg.JsApiGetConnectedBluetoothDevices", "getConnectedBluetoothDevices!");
        Log.m105925i("MicroMsg.JsApiGetConnectedBluetoothDevices", "appId:%s getConnectedBluetoothDevices data %s", fVar.getAppId(), jSONObject.toString());
        C82225c b = C82220a.m100947b(fVar.getAppId());
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bleWorker is null, may not open ble");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap.put("errno", 1500101);
            fVar2.mo109647a(i2, mo115114o("fail:not init", hashMap));
            C82241i.m100983b(193, 195);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiGetConnectedBluetoothDevices", "adapter is null or not enabled!");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap2.put("errno", 1500102);
            fVar2.mo109647a(i2, mo115114o("fail:not available", hashMap2));
            C82241i.m100983b(193, WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA);
        } else {
            JSONArray optJSONArray = jSONObject2.optJSONArray(C113596ci.f339982a_);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                arrayList = new ArrayList(length);
                for (int i3 = 0; i3 < length; i3++) {
                    String optString = optJSONArray.optString(i3);
                    if (optString != null) {
                        arrayList.add(optString);
                    }
                }
            } else {
                arrayList = null;
            }
            boolean optBoolean = jSONObject2.optBoolean("useOldImpl", false);
            Log.m105924i("MicroMsg.JsApiGetConnectedBluetoothDevices", "useOldImpl: " + optBoolean);
            C88738b h = b.mo114615h();
            if (h != null) {
                C89004f fVar3 = h.f256136a;
                if (optBoolean) {
                    c = fVar3.mo123374b(arrayList);
                } else {
                    if (arrayList != null) {
                        fVar3.getClass();
                        if (!arrayList.isEmpty()) {
                            c = fVar3.mo123374b(arrayList);
                        }
                    }
                    c = fVar3.mo123375c(C89004f.C89005a.f256600a);
                }
                list = c;
            } else {
                list = null;
            }
            if (list == null) {
                Log.m105920e("MicroMsg.JsApiGetConnectedBluetoothDevices", "bluetoothDevices is null!");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1510000, "fail:internal error");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 1510000);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar2.mo109647a(i2, mo115115p("fail:internal error", jSONObject3));
                C82241i.m100983b(193, 198);
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (C89689d next : list) {
                String str = next.f257958b;
                String str2 = next.f257957a;
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("deviceId", str);
                    jSONObject4.put("name", str2);
                    jSONArray.put(jSONObject4);
                } catch (JSONException e2) {
                    Log.m105921e("MicroMsg.JsApiGetConnectedBluetoothDevices", "put JSON data error : %s", e2);
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put("devices", jSONArray);
            } catch (JSONException e3) {
                Log.printErrStackTrace("MicroMsg.JsApiGetConnectedBluetoothDevices", e3, "", new Object[0]);
            }
            Log.m105925i("MicroMsg.JsApiGetConnectedBluetoothDevices", "retJson %s", jSONObject5.toString());
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            try {
                jSONObject5.put("errno", 0);
            } catch (Exception e4) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
            }
            fVar2.mo109647a(i2, mo115115p("ok", jSONObject5));
            C82241i.m100982a(192);
        }
    }
}
