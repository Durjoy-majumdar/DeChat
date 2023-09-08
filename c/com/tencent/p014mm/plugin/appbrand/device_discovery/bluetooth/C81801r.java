package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.os.PersistableBundle;
import com.tencent.p014mm.autogen.mmdata.rpt.BLEDeviceMonitorStruct;
import com.tencent.p014mm.plugin.appbrand.utils.C2044o0;
import di0.C86299o;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.r */
public final class C81801r {
    /* renamed from: a */
    public static final void m100367a(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo, C81783f0 f0Var, C81772a0 a0Var) {
        C87412m.m108594g(monitoredBluetoothDeviceInfo, "<this>");
        C87412m.m108594g(f0Var, "event");
        C87412m.m108594g(a0Var, "context");
        BLEDeviceMonitorStruct bLEDeviceMonitorStruct = new BLEDeviceMonitorStruct();
        bLEDeviceMonitorStruct.f236365d = (long) f0Var.f239983d;
        String str = monitoredBluetoothDeviceInfo.field_appId;
        C87412m.m108593f(str, "field_appId");
        bLEDeviceMonitorStruct.f236366e = bLEDeviceMonitorStruct.mo86045b("AppId", C2044o0.m1995a(str), true);
        bLEDeviceMonitorStruct.f236367f = (long) monitoredBluetoothDeviceInfo.field_versionType;
        String str2 = monitoredBluetoothDeviceInfo.field_entryPackage;
        C87412m.m108593f(str2, "field_entryPackage");
        bLEDeviceMonitorStruct.f236371j = bLEDeviceMonitorStruct.mo86045b("EntryPackage", C2044o0.m1995a(str2), true);
        String str3 = monitoredBluetoothDeviceInfo.field_wechatToken;
        C87412m.m108593f(str3, "field_wechatToken");
        bLEDeviceMonitorStruct.f236369h = bLEDeviceMonitorStruct.mo86045b("Sn", C2044o0.m1995a(str3), true);
        String str4 = monitoredBluetoothDeviceInfo.field_bluetoothDeviceId;
        C87412m.m108593f(str4, "field_bluetoothDeviceId");
        bLEDeviceMonitorStruct.f236370i = bLEDeviceMonitorStruct.mo86045b("BluetoothDeviceid", C2044o0.m1995a(str4), true);
        C81785g0 c = a0Var.mo114164c();
        if (c != null) {
            bLEDeviceMonitorStruct.f236368g = (long) c.f239990d;
        }
        Integer b = a0Var.mo114163b();
        if (b != null) {
            bLEDeviceMonitorStruct.f236374m = (long) b.intValue();
        }
        String d = a0Var.mo114165d();
        if (d != null) {
            bLEDeviceMonitorStruct.f236372k = bLEDeviceMonitorStruct.mo86045b("SessionId", C2044o0.m1995a(d), true);
        }
        String a = a0Var.mo114162a();
        if (a != null) {
            bLEDeviceMonitorStruct.f236373l = bLEDeviceMonitorStruct.mo86045b("InstanceId", C2044o0.m1995a(a), true);
        }
        bLEDeviceMonitorStruct.mo86054n();
    }

    /* renamed from: b */
    public static final C86299o m100368b(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo, boolean z) {
        C87412m.m108594g(monitoredBluetoothDeviceInfo, "<this>");
        C86299o oVar = new C86299o();
        oVar.f250930b = monitoredBluetoothDeviceInfo.field_appId;
        oVar.f250931c = monitoredBluetoothDeviceInfo.field_versionType;
        oVar.f250936h = monitoredBluetoothDeviceInfo.field_entryPackage;
        oVar.f250939k = 1217;
        PersistableBundle persistableBundle = new PersistableBundle();
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("appid", monitoredBluetoothDeviceInfo.field_appId);
        persistableBundle2.putString("bluetoothDeviceId", monitoredBluetoothDeviceInfo.field_bluetoothDeviceId);
        persistableBundle2.putString("deviceId", monitoredBluetoothDeviceInfo.field_wechatToken);
        persistableBundle2.putInt("envVersion", monitoredBluetoothDeviceInfo.field_versionType);
        persistableBundle2.putString("entryPackage", monitoredBluetoothDeviceInfo.field_entryPackage);
        persistableBundle.putPersistableBundle("DeviceDiscovery_bluetoothDeviceInfo", persistableBundle2);
        persistableBundle.putInt("DeviceDiscovery_isBluetoothDeviceConnected", z ? 1 : 0);
        oVar.f250938j = persistableBundle;
        return oVar;
    }
}
