package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.g */
public class C82858g extends C83231l.C83234d {
    public C82858g(JsApiNFCStartHCE jsApiNFCStartHCE) {
    }

    /* renamed from: c */
    public void mo109497c() {
        Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo AppBrandLifeCycle onDestroy");
        String str = HCEEventLogic.f242261a;
        synchronized (HCEEventLogic.class) {
            HCEEventLogic.f242262b = true;
        }
    }
}
