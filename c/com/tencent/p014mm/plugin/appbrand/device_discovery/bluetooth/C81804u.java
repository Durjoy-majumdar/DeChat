package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import bj0.C79708a;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import li0.C88508b;
import li0.C88509c;
import rx3.C13598b0;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u */
public final class C81804u extends C87413o implements C32226l<C81925i2, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f240030d;

    /* renamed from: e */
    public final /* synthetic */ MonitoredBluetoothDeviceInfo f240031e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81804u(boolean z, MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        super(1);
        this.f240030d = z;
        this.f240031e = monitoredBluetoothDeviceInfo;
    }

    /* renamed from: a */
    public static final void m100373a(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
        String str = monitoredBluetoothDeviceInfo.field_appId;
        C87412m.m108593f(str, "field_appId");
        C79708a aVar = C79708a.f233619a;
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "stopStatWeApp， appId: " + str);
        AppBrandMonitoredBluetoothDeviceService.f239928c.remove(str);
        AppBrandMonitoredBluetoothDeviceServiceCore appBrandMonitoredBluetoothDeviceServiceCore = AppBrandMonitoredBluetoothDeviceServiceCore.f239946a;
        String str2 = monitoredBluetoothDeviceInfo.field_appId;
        C87412m.m108593f(str2, "field_appId");
        appBrandMonitoredBluetoothDeviceServiceCore.getClass();
        aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceServiceCore", "statWeAppSuspend, appId: " + str2);
        C15618a.m14627c(new IPCString(str2), C81790k.f239997d, (C1256g) null, 4, (Object) null);
    }

    public Object invoke(Object obj) {
        C81925i2 i2Var = (C81925i2) obj;
        C87412m.m108594g(i2Var, "appService");
        if (this.f240030d) {
            C79708a.f233619a.mo109821a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, isConnected, not need stat");
        } else {
            AppBrandMonitoredBluetoothDeviceService appBrandMonitoredBluetoothDeviceService = AppBrandMonitoredBluetoothDeviceService.f239926a;
            String str = this.f240031e.field_appId;
            C87412m.m108593f(str, "field_appId");
            C79708a aVar = C79708a.f233619a;
            aVar.mo109821a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "startStatWeApp， appId: " + str);
            if (!AppBrandMonitoredBluetoothDeviceService.f239928c.add(str)) {
                aVar.mo109821a("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, already start stat");
            } else {
                C88509c cVar = i2Var.getRuntime().f238113K;
                if (cVar == null) {
                    MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = this.f240031e;
                    aVar.mo109822b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, appRunningStateController is null");
                    m100373a(monitoredBluetoothDeviceInfo);
                } else if (C88508b.DESTROYED == cVar.mo122980c()) {
                    aVar.mo109822b("MicroMsg.AppBrand.DeliverOnMonitoredBluetoothDeviceFoundTask", "doAfterDispatch, weApp is destroyed");
                    m100373a(this.f240031e);
                } else if (C88508b.SUSPEND == cVar.mo122980c()) {
                    m100373a(this.f240031e);
                } else {
                    cVar.mo122978a(new C81803t(cVar, this.f240031e));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
