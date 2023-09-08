package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import xl0.C91282c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.h */
public class C82859h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JsApiNFCStartHCE f242296d;

    public C82859h(JsApiNFCStartHCE jsApiNFCStartHCE) {
        this.f242296d = jsApiNFCStartHCE;
    }

    public void run() {
        boolean z;
        boolean z2;
        Class<HCEEventLogic> cls = HCEEventLogic.class;
        JsApiNFCStartHCE jsApiNFCStartHCE = this.f242296d;
        synchronized (jsApiNFCStartHCE.f242281t) {
            z = jsApiNFCStartHCE.f242282u;
            if (!z) {
                jsApiNFCStartHCE.f242282u = true;
            }
        }
        if (z) {
            Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onStartHCEOvertime has finished, return");
            return;
        }
        String str = HCEEventLogic.f242261a;
        synchronized (cls) {
            z2 = HCEEventLogic.f242262b;
        }
        if (z2) {
            Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onStartHCEOvertime has stop, return");
            return;
        }
        Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo start HCEService overtime, expect time limit: %d seconds", 10);
        synchronized (cls) {
            HCEEventLogic.f242262b = true;
        }
        C82381f fVar = jsApiNFCStartHCE.f242275n;
        if (fVar != null) {
            C91282c.m114510a(fVar.getAppId(), 13007, -2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errCode", 13007);
        jsApiNFCStartHCE.mo115072x(C82863k.m101618a(jsApiNFCStartHCE, 13007, "fail: start HCEService failed", hashMap));
    }
}
