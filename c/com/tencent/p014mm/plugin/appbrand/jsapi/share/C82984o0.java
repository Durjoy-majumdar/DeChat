package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C97425j;
import gy3.C8478d0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.o0 */
public final class C82984o0 implements C97425j.C86198c {

    /* renamed from: a */
    public final /* synthetic */ String f242645a;

    /* renamed from: b */
    public final /* synthetic */ C8478d0 f242646b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f242647c;

    public C82984o0(String str, C8478d0 d0Var, Runnable runnable) {
        this.f242645a = str;
        this.f242646b = d0Var;
        this.f242647c = runnable;
    }

    /* renamed from: b */
    public final void mo115247b() {
        Log.m105918d("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShareVideoAfterSelectConversation, send video to " + this.f242645a + " done");
        C8478d0 d0Var = this.f242646b;
        int i = d0Var.f27483d + -1;
        d0Var.f27483d = i;
        if (i <= 0) {
            Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShareVideoAfterSelectConversation, send video done");
            this.f242647c.run();
        }
    }
}
