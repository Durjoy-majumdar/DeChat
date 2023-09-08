package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h0 */
public final class C82240h0 implements C82247k {

    /* renamed from: d */
    public final /* synthetic */ C82229d0 f241143d;

    public C82240h0(C82229d0 d0Var) {
        this.f241143d = d0Var;
    }

    /* renamed from: a */
    public void mo114613a(C82228d dVar) {
        C87412m.m108594g(dVar, "newState");
        String str = this.f241143d.f241115e;
        Log.m105924i(str, "onAuthorizeStateChange, newState: " + dVar);
        if (C82228d.ALWAYS_ACCEPTED != dVar) {
            C82250m.C82251a.m101007a(this.f241143d, false, 1, (Object) null);
        }
    }
}
