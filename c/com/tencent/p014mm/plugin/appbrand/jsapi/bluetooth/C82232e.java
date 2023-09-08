package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88021l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e */
public final class C82232e {

    /* renamed from: a */
    public static final C82232e f241129a = new C82232e();

    /* renamed from: b */
    public static final C88021l<String, C82247k> f241130b = new C88021l<>();

    /* renamed from: a */
    public final void mo114629a(String str, C82247k kVar) {
        Log.m105924i("MicroMsg.AppBrand.BluetoothAuthorizeStateQuickAccess", "addListener, appId: " + str);
        if (str != null && kVar != null) {
            f241130b.mo122464e(str, kVar);
        }
    }

    /* renamed from: b */
    public final void mo114630b(String str, C82247k kVar) {
        Log.m105924i("MicroMsg.AppBrand.BluetoothAuthorizeStateQuickAccess", "removeListener, appId: " + str);
        if (str != null && kVar != null) {
            f241130b.mo122465f(str, kVar);
        }
    }
}
