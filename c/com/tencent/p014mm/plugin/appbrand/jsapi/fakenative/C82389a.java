package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84537h4;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.a */
public final class C82389a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f241441d;

    /* renamed from: e */
    public final /* synthetic */ C88267e f241442e;

    /* renamed from: f */
    public final /* synthetic */ int f241443f;

    /* renamed from: g */
    public final /* synthetic */ C82390b f241444g;

    public C82389a(AppBrandRuntimeWC appBrandRuntimeWC, C88267e eVar, int i, C82390b bVar) {
        this.f241441d = appBrandRuntimeWC;
        this.f241442e = eVar;
        this.f241443f = i;
        this.f241444g = bVar;
    }

    public final void run() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f241441d;
        C84560k4 k4Var = appBrandRuntimeWC.f238154s;
        if (k4Var == null) {
            this.f241442e.mo109647a(this.f241443f, this.f241444g.mo115109j("fail: timeout"));
        } else if (k4Var instanceof C84537h4) {
            appBrandRuntimeWC.mo113058h0();
            this.f241442e.mo109647a(this.f241443f, this.f241444g.mo115109j("ok"));
        } else {
            this.f241442e.mo109647a(this.f241443f, this.f241444g.mo115109j("fail: screenshot invalid"));
        }
    }
}
