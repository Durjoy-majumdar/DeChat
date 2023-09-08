package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82234f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.u */
public final class C82261u extends C82268c<C81879g> {
    private static final int CTRL_INDEX = 1064;
    private static final String NAME = "setBluetoothBackgroundMode";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, service is null");
            return;
        }
        C82225c b = C82220a.m100947b(gVar.getAppId());
        if (b == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, may not open ble");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 1500101);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            gVar.mo109647a(i, mo115115p("fail:not init", jSONObject2));
        } else if (!b.f241101e) {
            Log.m105928w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, may not open ble background");
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 1500101);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            gVar.mo109647a(i, mo115115p("fail:not init", jSONObject3));
        } else if (jSONObject == null || !jSONObject.has("enable")) {
            Log.m105928w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, data is illegal, data: " + jSONObject);
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            gVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject4));
        } else {
            try {
                boolean z = jSONObject.getBoolean("enable");
                Log.m105924i("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, enable: " + z);
                AppBrandRuntime runtime = gVar.getRuntime();
                if (runtime == null) {
                    Log.m105928w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, runtime is null");
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("errno", 4);
                    } catch (Exception e4) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                    }
                    gVar.mo109647a(i, mo115115p("fail:internal error", jSONObject5));
                } else if (z) {
                    C82250m b2 = C82234f.f241133b.mo114633b(runtime);
                    try {
                        b2.mo114624j();
                        try {
                            b2.mo114620a();
                            if (BuildInfo.DEBUG) {
                                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                            }
                            JSONObject jSONObject6 = new JSONObject();
                            try {
                                jSONObject6.put("errno", 0);
                            } catch (Exception e5) {
                                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
                            }
                            gVar.mo109647a(i, mo115115p("ok", jSONObject6));
                        } catch (C82237g e6) {
                            Log.m105928w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, enable fail since " + e6);
                            gVar.mo109647a(i, mo115111l(e6.f241138e, e6.f241137d, (JSONObject) null));
                        }
                    } catch (C82237g e7) {
                        Log.m105928w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, checkCanIEnable fail since " + e7);
                        gVar.mo109647a(i, mo115111l(e7.f241138e, e7.f241137d, (JSONObject) null));
                    }
                } else {
                    C82234f.C82235a aVar = C82234f.f241133b;
                    C82250m a = aVar.mo114632a(runtime);
                    if (a != null) {
                        C82250m.C82251a.m101007a(a, false, 1, (Object) null);
                    }
                    aVar.mo114634c(runtime);
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                    }
                    JSONObject jSONObject7 = new JSONObject();
                    try {
                        jSONObject7.put("errno", 0);
                    } catch (Exception e8) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e8);
                    }
                    gVar.mo109647a(i, mo115115p("ok", jSONObject7));
                }
            } catch (JSONException e9) {
                Log.m105928w("MicroMsg.AppBrand.JsApiSetBluetoothBackgroundMode", "invoke, parse data fail since " + e9);
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject8 = new JSONObject();
                try {
                    jSONObject8.put("errno", 101);
                } catch (Exception e15) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e15);
                }
                gVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject8));
            }
        }
    }
}
