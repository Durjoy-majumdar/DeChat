package com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i */
public final class C81787i extends C87413o implements C32226l<C81785g0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MonitoredBluetoothDeviceInfo f239992d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81787i(MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        super(1);
        this.f239992d = monitoredBluetoothDeviceInfo;
    }

    public Object invoke(Object obj) {
        C81785g0 g0Var = (C81785g0) obj;
        C87412m.m108594g(g0Var, "runningState");
        C81801r.m100367a(this.f239992d, C81783f0.START_WE_APP, new C81786h(g0Var));
        return C13598b0.f38549a;
    }
}
