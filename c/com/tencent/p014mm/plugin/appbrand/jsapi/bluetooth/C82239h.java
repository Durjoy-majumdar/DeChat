package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import qk0.C89694i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h */
public abstract class C82239h implements C82225c.C82226a, C89694i {

    /* renamed from: a */
    public final AppBrandRuntime f241140a;

    /* renamed from: b */
    public final String f241141b;

    /* renamed from: c */
    public volatile boolean f241142c;

    public C82239h(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f241140a = appBrandRuntime;
        this.f241141b = "MicroMsg.AppBrand.BluetoothConnectStateChangeListener#" + C82234f.f241133b.mo114635d(appBrandRuntime);
    }

    /* renamed from: a */
    public void mo114612a(String str, boolean z) {
        String str2 = this.f241141b;
        Log.m105924i(str2, "onBleConnectionStateChange, deviceId: " + str + ", connected: " + z);
        if (str != null) {
            mo114637b(str, z);
        }
    }

    /* renamed from: b */
    public abstract void mo114637b(String str, boolean z);
}
