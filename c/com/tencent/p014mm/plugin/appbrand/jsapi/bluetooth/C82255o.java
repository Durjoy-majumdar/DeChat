package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kk0.C88175c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o */
public final class C82255o extends C88175c {
    /* renamed from: w */
    public void mo114639w(C82381f fVar, String str, boolean z) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(str, "deviceId");
        Log.m105924i("MicroMsg.AppBrand.JsApiCreateBLEConnectionWC", "onCreateConnectionDone, deviceId: " + str + ", isSuccess: " + z);
        if (z) {
            String appId = fVar.getAppId();
            if (appId == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiCreateBLEConnectionWC", "onCreateConnectionDone, appId is null");
            } else {
                AppBrandMonitoredBluetoothDeviceService.f239926a.mo114124d(appId, str);
            }
        }
    }
}
