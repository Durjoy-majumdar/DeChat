package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.Future;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k0 */
public final class C82248k0 extends C83231l.C83234d {

    /* renamed from: d */
    public final /* synthetic */ C82229d0 f241150d;

    public C82248k0(C82229d0 d0Var) {
        this.f241150d = d0Var;
    }

    /* renamed from: c */
    public void mo109497c() {
        Log.m105924i(this.f241150d.f241115e, "onDestroy");
        C82250m.C82251a.m101007a(this.f241150d, false, 1, (Object) null);
    }

    /* renamed from: f */
    public void mo109498f() {
        Log.m105924i(this.f241150d.f241115e, "onResume");
        C82229d0 d0Var = this.f241150d;
        Future<?> future = d0Var.f241127t;
        if (future == null) {
            Log.m105924i(d0Var.f241115e, "consumeDelayDisableOnResume, disableFuture is null");
        } else if (future.isDone()) {
            Log.m105924i(d0Var.f241115e, "consumeDelayDisableOnResume, disableFuture is done");
        } else if (future.cancel(false)) {
            Log.m105924i(d0Var.f241115e, "consumeDelayDisableOnResume, canceled, do real disable");
            d0Var.mo114623d();
        }
    }
}
