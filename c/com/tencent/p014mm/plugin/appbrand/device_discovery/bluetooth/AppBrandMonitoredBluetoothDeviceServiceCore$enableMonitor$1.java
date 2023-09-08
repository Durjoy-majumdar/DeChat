package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "isOn", "Lrx3/b0;", "onBluetoothStateChange", "(Z)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceServiceCore$enableMonitor$1 */
final class AppBrandMonitoredBluetoothDeviceServiceCore$enableMonitor$1 implements C81808y {
    public static final AppBrandMonitoredBluetoothDeviceServiceCore$enableMonitor$1 INSTANCE = new AppBrandMonitoredBluetoothDeviceServiceCore$enableMonitor$1();

    public final void onBluetoothStateChange(boolean z) {
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onBluetoothStateChange, isOn: " + z);
        if (!AppBrandMonitoredBluetoothDeviceServiceCore.f239947b) {
            aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "onBluetoothStateChange, isMonitor is false");
        } else if (z) {
            List<MonitoredBluetoothDeviceInfo> f = AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114140f();
            ArrayList<MonitoredBluetoothDeviceInfo> arrayList = new ArrayList<>();
            for (T next : f) {
                if (!((MonitoredBluetoothDeviceInfo) next).field_isBlocked) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (MonitoredBluetoothDeviceInfo e : arrayList) {
                AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114139e(e);
                arrayList2.add(C13598b0.f38549a);
            }
        } else {
            for (MonitoredBluetoothDeviceInfo l : ((ConcurrentHashMap) AppBrandMonitoredBluetoothDeviceServiceCore.f239948c).values()) {
                AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114146l(l);
            }
        }
    }
}
