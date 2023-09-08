package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import ym0.C91508e;
import ym0.C91510h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d$a$$a */
public final /* synthetic */ class d$a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83051d.C83052a f242791d;

    /* renamed from: e */
    public final /* synthetic */ C0125s f242792e;

    /* renamed from: f */
    public final /* synthetic */ C91510h f242793f;

    /* renamed from: g */
    public final /* synthetic */ C91508e f242794g;

    public /* synthetic */ d$a$$a(C83051d.C83052a aVar, C0125s sVar, C91510h hVar, C91508e eVar) {
        this.f242791d = aVar;
        this.f242792e = sVar;
        this.f242793f = hVar;
        this.f242794g = eVar;
    }

    public final void run() {
        C83051d.C83052a aVar = this.f242791d;
        C0125s sVar = this.f242792e;
        C91510h hVar = this.f242793f;
        C91508e eVar = this.f242794g;
        aVar.getClass();
        sVar.getLifecycle().addObserver(new JsApiLoadVideoResource$1$1(aVar, hVar, eVar));
    }
}
