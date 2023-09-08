package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.t */
public final class C81803t implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ C88509c f240028d;

    /* renamed from: e */
    public final /* synthetic */ MonitoredBluetoothDeviceInfo f240029e;

    public C81803t(C88509c cVar, MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        this.f240028d = cVar;
        this.f240029e = monitoredBluetoothDeviceInfo;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        if (C88508b.SUSPEND == bVar) {
            C81804u.m100373a(this.f240029e);
            this.f240028d.mo122982e(this);
        }
    }
}
