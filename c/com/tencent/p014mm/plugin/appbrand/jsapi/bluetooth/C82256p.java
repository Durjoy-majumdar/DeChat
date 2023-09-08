package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fl0.C86917b;
import fl0.C86920e;
import gy3.C87412m;
import kk0.C88191m;
import qk0.C89696k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p */
public final class C82256p extends C88191m {
    public static final int CTRL_INDEX = 1094;
    public static final String NAME = "openBluetoothAdapterBackground";

    /* renamed from: w */
    public C89696k mo114640w(C82381f fVar, C89696k kVar) {
        C82225c b;
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(kVar, "result");
        Log.m105924i("MicroMsg.AppBrand.JsApiOpenBluetoothAdapterBackground", "overrideResultIfNeed, result: " + kVar);
        if ((C87412m.m108589b(C86920e.f252311a, kVar.f257990c) || C87412m.m108589b(C86917b.f252279b, kVar.f257990c)) && (b = C82220a.m100947b(fVar.getAppId())) != null) {
            b.f241101e = true;
        }
        return kVar;
    }
}
