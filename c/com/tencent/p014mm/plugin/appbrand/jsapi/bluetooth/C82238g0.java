package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.Log;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g0 */
public final class C82238g0 implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ C82229d0 f241139d;

    public C82238g0(C82229d0 d0Var) {
        this.f241139d = d0Var;
    }

    /* renamed from: b */
    public final void mo113102b(String str, C88508b bVar) {
        if (C88508b.BACKGROUND == bVar && this.f241139d.f241126s.isEmpty()) {
            Log.m105924i(this.f241139d.f241115e, "onRunningStateChanged, disable");
            C82250m.C82251a.m101007a(this.f241139d, false, 1, (Object) null);
        }
    }
}
