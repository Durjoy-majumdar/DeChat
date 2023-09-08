package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bj0.C79708a;
import kotlin.Metadata;
import sk0.C90216b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/device_discovery/bluetooth/BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1", "Landroid/content/BroadcastReceiver;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1 */
public final class C81769xff31332d extends BroadcastReceiver {
    /* renamed from: a */
    public final void mo114152a() {
        BluetoothAdapter d = C90216b.m112935d();
        Boolean bool = null;
        Integer valueOf = d != null ? Integer.valueOf(d.getState()) : null;
        if (valueOf == null) {
            C79708a.f233619a.mo109822b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "get#isCurBluetoothOn, state is null");
        } else if (12 == valueOf.intValue()) {
            bool = Boolean.TRUE;
        } else if (10 == valueOf.intValue()) {
            bool = Boolean.FALSE;
        } else {
            C79708a aVar = C79708a.f233619a;
            aVar.mo109822b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "get#isCurBluetoothOn, state: " + valueOf);
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            C81808y yVar = C81797p.f240018d;
            if (yVar != null) {
                yVar.onBluetoothStateChange(booleanValue);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo114152a();
    }
}
