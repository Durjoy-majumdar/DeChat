package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import lu3.C88656g;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.c */
public final class C81776c implements C88656g {
    public String getKey() {
        return "EnableMonitorBluetoothDevice#" + hashCode();
    }

    public void run() {
        AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.getClass();
        C81797p pVar = C81797p.f240015a;
        pVar.getClass();
        if (!C81797p.f240022h) {
            C79708a.f233619a.mo109822b("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "enableMonitor, isSupportLE is false");
            return;
        }
        boolean z = AppBrandMonitoredBluetoothDeviceServiceCore.f239947b;
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "enableMonitor, curIsMonitor: " + z);
        if (!z) {
            AppBrandMonitoredBluetoothDeviceServiceCore.f239947b = true;
            pVar.mo114179c(AppBrandMonitoredBluetoothDeviceServiceCore$enableMonitor$1.INSTANCE);
        }
    }
}
