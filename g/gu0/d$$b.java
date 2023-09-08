package gu0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;

public final /* synthetic */ class d$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87388d f253253d;

    /* renamed from: e */
    public final /* synthetic */ d$$f f253254e;

    /* renamed from: f */
    public final /* synthetic */ C82510g f253255f;

    public /* synthetic */ d$$b(C87388d dVar, d$$f d__f, C82510g gVar) {
        this.f253253d = dVar;
        this.f253254e = d__f;
        this.f253255f = gVar;
    }

    public final void run() {
        C87388d dVar = this.f253253d;
        d$$f d__f = this.f253254e;
        C82510g gVar = this.f253255f;
        dVar.getClass();
        C81879g gVar2 = (C81879g) gVar;
        d__f.f253270a.f262484a.notifyRuntimeReady(gVar2.getAppId(), dVar.mo121809n(gVar2), dVar.mo121808m(gVar2));
    }
}
