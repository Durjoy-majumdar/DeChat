package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import bj0.C79708a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82793b;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.t */
public final class C82260t extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 1089;
    public static final String NAME = "operateGlobalMonitoredBluetoothDevice";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int i2;
        int i3;
        int i4;
        C90988l d0;
        WxaPkgWrappingInfo wxaPkgWrappingInfo;
        int i5;
        JSONObject jSONObject2 = jSONObject;
        int i6 = i;
        C81879g gVar = (C81879g) fVar;
        if (gVar != null) {
            C82225c b = C82220a.m100947b(gVar.getAppId());
            if (b == null) {
                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, may not open ble");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 1500101);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                gVar.mo109647a(i6, mo115115p("fail:not init", jSONObject3));
            } else if (!b.f241101e) {
                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, may not open ble background");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 1500101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                gVar.mo109647a(i6, mo115115p("fail:not init", jSONObject4));
            } else {
                Log.m105924i("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, data: " + jSONObject2);
                if (jSONObject2 == null) {
                    if (BuildInfo.DEBUG) {
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                    }
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("errno", 101);
                    } catch (Exception e3) {
                        Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                    }
                    gVar.mo109647a(i6, mo115115p("fail:jsapi invalid request data", jSONObject5));
                    return;
                }
                String optString = jSONObject2.optString("type");
                if (optString != null) {
                    int hashCode = optString.hashCode();
                    String str = "fail:internal error";
                    String str2 = "deviceId";
                    if (hashCode == -1335458389) {
                        String str3 = str;
                        String str4 = str2;
                        if (optString.equals("delete")) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                            if (optJSONObject == null) {
                                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, innerData is null");
                                if (BuildInfo.DEBUG) {
                                    i4 = 101;
                                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                                } else {
                                    i4 = 101;
                                }
                                JSONObject jSONObject6 = new JSONObject();
                                try {
                                    jSONObject6.put("errno", i4);
                                } catch (Exception e4) {
                                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                                }
                                gVar.mo109647a(i6, mo115115p("fail:jsapi invalid request data", jSONObject6));
                                return;
                            }
                            String appId = gVar.getAppId();
                            if (appId == null || appId.length() == 0) {
                                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doDelete, appId is empty");
                                if (BuildInfo.DEBUG) {
                                    i3 = 4;
                                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, str3);
                                } else {
                                    i3 = 4;
                                }
                                JSONObject jSONObject7 = new JSONObject();
                                try {
                                    jSONObject7.put("errno", i3);
                                } catch (Exception e5) {
                                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
                                }
                                gVar.mo109647a(i6, mo115115p(str3, jSONObject7));
                                return;
                            }
                            String optString2 = optJSONObject.optString(str4);
                            if (optString2 == null || optString2.length() == 0) {
                                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doDelete, wechatToken is empty");
                                if (BuildInfo.DEBUG) {
                                    i2 = 101;
                                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                                } else {
                                    i2 = 101;
                                }
                                JSONObject jSONObject8 = new JSONObject();
                                try {
                                    jSONObject8.put("errno", i2);
                                } catch (Exception e6) {
                                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e6);
                                }
                                gVar.mo109647a(i6, mo115115p("fail:jsapi invalid request data", jSONObject8));
                            }
                            AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
                            C87412m.m108593f(appId, "appId");
                            C87412m.m108593f(optString2, "wechatToken");
                            appBrandMonitoredBluetoothDeviceService.mo114121a(appId, optString2, new C1653q(gVar, i6, this));
                        }
                    } else if (hashCode != -1249367445) {
                        if (hashCode == 113762 && optString.equals("set")) {
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            if (optJSONObject2 == null) {
                                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "invoke, innerData is null");
                                if (BuildInfo.DEBUG) {
                                    i5 = 101;
                                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                                } else {
                                    i5 = 101;
                                }
                                JSONObject jSONObject9 = new JSONObject();
                                try {
                                    jSONObject9.put("errno", i5);
                                } catch (Exception e7) {
                                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e7);
                                }
                                gVar.mo109647a(i6, mo115115p("fail:jsapi invalid request data", jSONObject9));
                                return;
                            }
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("monitoredDeviceInfo");
                            if (optJSONObject3 == null) {
                                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, deviceInfoJsonObj is null");
                                if (BuildInfo.DEBUG) {
                                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                                }
                                JSONObject jSONObject10 = new JSONObject();
                                try {
                                    jSONObject10.put("errno", 101);
                                } catch (Exception e8) {
                                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e8);
                                }
                                gVar.mo109647a(i6, mo115115p("fail:jsapi invalid request data", jSONObject10));
                                return;
                            }
                            MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new MonitoredBluetoothDeviceInfo();
                            try {
                                monitoredBluetoothDeviceInfo.field_appId = optJSONObject3.getString("appid");
                                monitoredBluetoothDeviceInfo.field_bluetoothDeviceId = optJSONObject3.getString("bluetoothDeviceId");
                                monitoredBluetoothDeviceInfo.field_wechatToken = optJSONObject3.getString(str2);
                                monitoredBluetoothDeviceInfo.field_versionType = C82793b.m101536a(optJSONObject3.optString("envVersion"), C82793b.RELEASE).f242156d;
                                monitoredBluetoothDeviceInfo.field_entryPackage = optJSONObject3.optString("entryPackage");
                            } catch (Exception e9) {
                                C79708a aVar = C79708a.f233619a;
                                aVar.mo109822b("MicroMsg.AppBrand.MonitoredBluetoothDeviceInfo", "fromJson fail since " + e9);
                            }
                            AppBrandRuntime runtime = gVar.getRuntime();
                            if (runtime == null || (d0 = runtime.mo113051d0()) == null || (wxaPkgWrappingInfo = d0.f261072r) == null) {
                                String str5 = str;
                                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, curVersionType is null");
                                if (BuildInfo.DEBUG) {
                                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, str5);
                                }
                                JSONObject jSONObject11 = new JSONObject();
                                try {
                                    jSONObject11.put("errno", 4);
                                } catch (Exception e15) {
                                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e15);
                                }
                                gVar.mo109647a(i6, mo115115p(str5, jSONObject11));
                                return;
                            }
                            int i7 = wxaPkgWrappingInfo.f238585d;
                            if (!(1 == i7 || 2 == i7)) {
                                monitoredBluetoothDeviceInfo.field_versionType = 0;
                            }
                            String appId2 = gVar.getAppId();
                            if (appId2 == null || appId2.length() == 0) {
                                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, appId is empty");
                                if (BuildInfo.DEBUG) {
                                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, str);
                                }
                                JSONObject jSONObject12 = new JSONObject();
                                try {
                                    jSONObject12.put("errno", 4);
                                } catch (Exception e16) {
                                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e16);
                                }
                                gVar.mo109647a(i6, mo115115p(str, jSONObject12));
                                return;
                            }
                            monitoredBluetoothDeviceInfo.field_appId = appId2;
                            if (!monitoredBluetoothDeviceInfo.isValid()) {
                                Log.m105928w("MicroMsg.AppBrand.MonitoredBluetoothDevices", "doSet, deviceInfo is invalid");
                                if (BuildInfo.DEBUG) {
                                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                                }
                                JSONObject jSONObject13 = new JSONObject();
                                try {
                                    jSONObject13.put("errno", 101);
                                } catch (Exception e17) {
                                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                                }
                                gVar.mo109647a(i6, mo115115p("fail:jsapi invalid request data", jSONObject13));
                                return;
                            }
                            AppBrandMonitoredBluetoothDeviceService.f239926a.mo114123c(monitoredBluetoothDeviceInfo, new C1655s(gVar, i6, this));
                        }
                    } else if (optString.equals("getAll")) {
                        AppBrandMonitoredBluetoothDeviceService.f239926a.mo114122b(new C1654r(this, gVar, i6));
                    }
                }
            }
        }
    }
}
