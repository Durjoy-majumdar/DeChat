package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.sdk.platformtools.Log;
import qk0.C89687b;
import qk0.C89696k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e0 */
public final class C82233e0 implements C89687b {

    /* renamed from: a */
    public final /* synthetic */ C82229d0 f241131a;

    /* renamed from: b */
    public final /* synthetic */ String f241132b;

    public C82233e0(C82229d0 d0Var, String str) {
        this.f241131a = d0Var;
        this.f241132b = str;
    }

    /* renamed from: a */
    public final void mo114631a(C89696k kVar) {
        String str = this.f241131a.f241115e;
        Log.m105924i(str, "closeAllConnection, deviceId: " + this.f241132b + ", result: " + kVar);
    }
}
