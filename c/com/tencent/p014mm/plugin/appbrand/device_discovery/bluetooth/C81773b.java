package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import java.util.concurrent.ConcurrentHashMap;
import lu3.C88656g;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.b */
public final class C81773b implements C88656g {
    public String getKey() {
        return "DisableMonitorBluetoothDevice#" + hashCode();
    }

    public void run() {
        AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.getClass();
        C81797p.f240015a.getClass();
        if (!C81797p.f240022h) {
            C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "enableMonitor, isSupportLE is false");
            return;
        }
        boolean z = AppBrandMonitoredBluetoothDeviceServiceCore.f239947b;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "disableMonitor, curIsMonitor: " + z);
        if (z) {
            for (MonitoredBluetoothDeviceInfo l : ((ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239948c).values()) {
                AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114146l(l);
            }
            C81797p.f240015a.mo114179c((C81808y) null);
            AppBrandMonitoredBluetoothDeviceServiceCore.f239947b = false;
        }
    }
}
