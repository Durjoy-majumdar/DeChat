package lk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82228d;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82232e;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82247k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: lk0.r */
public final class C88566r implements C82247k {

    /* renamed from: d */
    public final /* synthetic */ C82381f f255792d;

    public C88566r(C82381f fVar) {
        this.f255792d = fVar;
    }

    /* renamed from: a */
    public void mo114613a(C82228d dVar) {
        C87412m.m108594g(dVar, "newState");
        Log.m105924i("MicroMsg.BLE.PeripheralBleServerManager", "onAuthorizeStateChange, newState: " + dVar);
        if (C82228d.REJECTED == dVar) {
            C82232e.f241129a.mo114630b(this.f255792d.getAppId(), this);
            C88567s sVar = C88567s.f255793a;
            C88567s.f255797e = true;
            C88567s.f255793a.mo123029a();
            C88567s.f255796d = null;
            C88567s.f255797e = false;
        }
    }
}
