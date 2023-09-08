package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import lu3.C88656g;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a */
public final class C29492a implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ String f80353d;

    /* renamed from: e */
    public final /* synthetic */ int f80354e;

    public C29492a(String str, int i) {
        this.f80353d = str;
        this.f80354e = i;
    }

    public String getKey() {
        return "DeleteMonitoredBluetoothDeviceInfoFor" + this.f80353d + '#' + this.f80354e + '#' + hashCode();
    }

    public void run() {
        AppBrandMonitoredBluetoothDeviceServiceCore.f239946a.mo114137c(this.f80353d, this.f80354e);
    }
}
