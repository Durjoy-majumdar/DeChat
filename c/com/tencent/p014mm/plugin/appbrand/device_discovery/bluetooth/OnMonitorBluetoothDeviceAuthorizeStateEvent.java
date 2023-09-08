package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import com.tencent.p014mm.sdk.event.IEvent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/OnMonitorBluetoothDeviceAuthorizeStateEvent;", "Lcom/tencent/mm/sdk/event/IEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.OnMonitorBluetoothDeviceAuthorizeStateEvent */
public final class OnMonitorBluetoothDeviceAuthorizeStateEvent extends IEvent {

    /* renamed from: d */
    public final String f80351d;

    /* renamed from: e */
    public final boolean f80352e;

    public OnMonitorBluetoothDeviceAuthorizeStateEvent(String str, boolean z) {
        C87412m.m108594g(str, "appId");
        this.f80351d = str;
        this.f80352e = z;
    }

    public String toString() {
        return "OnMonitorBluetoothDeviceAuthorizeStateEvent(appId='" + this.f80351d + "', authorized=" + this.f80352e + ')';
    }
}
