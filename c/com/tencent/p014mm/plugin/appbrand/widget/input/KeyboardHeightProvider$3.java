package com.tencent.p014mm.plugin.appbrand.widget.input;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.KeyboardHeightProvider$3 */
class KeyboardHeightProvider$3 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C84978r1 f247590d;

    public KeyboardHeightProvider$3(C84978r1 r1Var) {
        this.f247590d = r1Var;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onPaused() {
        this.f247590d.mo117856b();
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onResumed() {
        this.f247590d.mo117858d();
    }
}
