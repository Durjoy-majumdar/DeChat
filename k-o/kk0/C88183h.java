package kk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82241i;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mk0.C88738b;
import nk0.C89004f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qk0.C89689d;
import rk0.C89983c;
import sk0.C90216b;

/* renamed from: kk0.h */
public class C88183h extends C82268c {
    private static final int CTRL_INDEX = 178;
    private static final String NAME = "getBluetoothDevices";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        ArrayList<C89689d> arrayList;
        C82241i.m100982a(166);
        String appId = fVar.getAppId();
        Object[] objArr = new Object[2];
        objArr[0] = appId;
        objArr[1] = jSONObject == null ? "" : jSONObject;
        Log.m105925i("MicroMsg.JsApiGetBluetoothDevices", "appId:%s getBluetoothDevices data:%s", objArr);
        C82225c b = C82220a.m100947b(appId);
        if (b == null) {
            Log.m105920e("MicroMsg.JsApiGetBluetoothDevices", "bleWorker is null, may not open ble");
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", 10000);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            hashMap.put("errno", 1500101);
            fVar.mo109647a(i, mo115114o("fail:not init", hashMap));
            C82241i.m100983b(168, 170);
        } else if (!C90216b.m112933b()) {
            Log.m105920e("MicroMsg.JsApiGetBluetoothDevices", "adapter is null or not enabled!");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("errCode", 10001);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500102, "fail:not available");
            }
            hashMap2.put("errno", 1500102);
            fVar.mo109647a(i, mo115114o("fail:not available", hashMap2));
            C82241i.m100983b(168, 172);
        } else {
            C88738b h = b.mo114615h();
            List<C89689d> list = null;
            if (h != null) {
                C89983c cVar = h.f256137b;
                synchronized (cVar) {
                    arrayList = cVar.f258548d == null ? new ArrayList<>() : new ArrayList<>(((HashMap) cVar.f258548d).values());
                }
            } else {
                arrayList = null;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null) {
                boolean optBoolean = jSONObject != null ? jSONObject.optBoolean("useOldImpl", false) : false;
                Log.m105924i("MicroMsg.JsApiGetBluetoothDevices", "useOldImpl: " + optBoolean);
                C88738b h2 = b.mo114615h();
                if (h2 != null) {
                    C89004f fVar2 = h2.f256136a;
                    list = optBoolean ? fVar2.mo123373a() : fVar2.mo123375c(C89004f.C89005a.f256600a);
                }
                arrayList.addAll(list);
                for (C89689d a : arrayList) {
                    try {
                        jSONArray.put(a.mo124015a());
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.JsApiGetBluetoothDevices", e, "", new Object[0]);
                    }
                }
            }
            try {
                jSONObject2.put("errMsg", mo114779e() + ":ok");
                jSONObject2.put("devices", jSONArray);
            } catch (JSONException e2) {
                Log.m105921e("MicroMsg.JsApiGetBluetoothDevices", "put json value error : %s", android.util.Log.getStackTraceString(e2));
            }
            Log.m105925i("MicroMsg.JsApiGetBluetoothDevices", "retJson %s", jSONObject2);
            fVar.mo109647a(i, jSONObject2.toString());
            C82241i.m100982a(167);
        }
    }
}
