package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.os.PersistableBundle;
import bj0.C79708a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.headless.C81917m;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82262v;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v */
public final class C81805v implements C81917m {
    /* renamed from: a */
    public void mo114182a(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandInitConfigWC appBrandInitConfigWC) {
        MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo;
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "deliverOnBluetoothDeviceFound, runtime(" + appBrandRuntimeWC.f238147j + ')');
        PersistableBundle persistableBundle = appBrandInitConfigWC.f234809M;
        String str = null;
        PersistableBundle persistableBundle2 = persistableBundle != null ? persistableBundle.getPersistableBundle("DeviceDiscovery_bluetoothDeviceInfo") : null;
        if (persistableBundle2 != null) {
            monitoredBluetoothDeviceInfo = new MonitoredBluetoothDeviceInfo();
            monitoredBluetoothDeviceInfo.field_appId = persistableBundle2.getString("appid");
            monitoredBluetoothDeviceInfo.field_bluetoothDeviceId = persistableBundle2.getString("bluetoothDeviceId");
            monitoredBluetoothDeviceInfo.field_wechatToken = persistableBundle2.getString("deviceId");
            monitoredBluetoothDeviceInfo.field_versionType = persistableBundle2.getInt("envVersion");
            monitoredBluetoothDeviceInfo.field_entryPackage = persistableBundle2.getString("entryPackage");
        } else {
            monitoredBluetoothDeviceInfo = null;
        }
        boolean z = false;
        if ((persistableBundle != null ? persistableBundle.getInt("DeviceDiscovery_isBluetoothDeviceConnected") : 0) != 0) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("deliverOnBluetoothDeviceFound, appId: ");
        sb.append(monitoredBluetoothDeviceInfo != null ? monitoredBluetoothDeviceInfo.field_appId : null);
        sb.append(", deviceId: ");
        if (monitoredBluetoothDeviceInfo != null) {
            str = monitoredBluetoothDeviceInfo.field_bluetoothDeviceId;
        }
        sb.append(str);
        sb.append(", isConnected: ");
        sb.append(z);
        aVar.mo109821a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", sb.toString());
        if (monitoredBluetoothDeviceInfo == null || !monitoredBluetoothDeviceInfo.isValid()) {
            aVar.mo109822b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "deliverOnBluetoothDeviceFound, deviceInfo is invalid");
            return;
        }
        C81801r.m100367a(monitoredBluetoothDeviceInfo, C81783f0.START_WE_APP_SUCCESS, new C81802s(appBrandRuntimeWC));
        aVar.mo109821a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "onFound, appId: " + monitoredBluetoothDeviceInfo.field_appId + ", deviceId: " + monitoredBluetoothDeviceInfo.field_bluetoothDeviceId + ", isConnected: " + z);
        new C82262v(monitoredBluetoothDeviceInfo).mo114660p(new C81804u(z, monitoredBluetoothDeviceInfo));
    }
}
