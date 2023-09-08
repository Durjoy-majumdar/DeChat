package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.plugin.appbrand.task.q$$g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.c7 */
public final class C82272c7 implements q$$g {

    /* renamed from: a */
    public final /* synthetic */ C84343y f241181a;

    /* renamed from: b */
    public final /* synthetic */ int f241182b;

    /* renamed from: c */
    public final /* synthetic */ C81879g f241183c;

    /* renamed from: d */
    public final /* synthetic */ int f241184d;

    /* renamed from: e */
    public final /* synthetic */ C82214b7 f241185e;

    public C82272c7(C84343y yVar, int i, C81879g gVar, int i2, C82214b7 b7Var) {
        this.f241181a = yVar;
        this.f241182b = i;
        this.f241183c = gVar;
        this.f241184d = i2;
        this.f241185e = b7Var;
    }

    public final void onReady() {
        boolean z = C84331q.m103953h(this.f241181a) != null;
        Log.m105924i("MicroMsg.AppBrand.PrivateJSApiPreloadMiniProgramEnv", "onReady, preloaded[" + z + ']');
        if (z) {
            C115669n.INSTANCE.mo175911u(this.f241182b, 40);
            this.f241183c.mo109647a(this.f241184d, this.f241185e.mo115109j("ok"));
            return;
        }
        this.f241183c.mo109647a(this.f241184d, this.f241185e.mo115109j("fail"));
    }
}
