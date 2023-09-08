package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b0 */
public final class C82224b0 extends C87413o implements C32226l<WCBluetoothBackgroundApp, Boolean> {

    /* renamed from: d */
    public static final C82224b0 f241099d = new C82224b0();

    public C82224b0() {
        super(1);
    }

    public Object invoke(Object obj) {
        WCBluetoothBackgroundApp wCBluetoothBackgroundApp = (WCBluetoothBackgroundApp) obj;
        C87412m.m108594g(wCBluetoothBackgroundApp, "app");
        return Boolean.valueOf(AppBrandProcessesManager.f246131g.mo116962a().mo111387b(wCBluetoothBackgroundApp.f80383d, wCBluetoothBackgroundApp.f80384e) == null);
    }
}
