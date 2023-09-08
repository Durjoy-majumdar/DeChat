package com.tencent.p014mm.plugin.appbrand.extendplugin;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import p830xc.C91165a;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.b$$a */
public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81823b f240078d;

    /* renamed from: e */
    public final /* synthetic */ C0125s f240079e;

    /* renamed from: f */
    public final /* synthetic */ C91165a.C53318a f240080f;

    /* renamed from: g */
    public final /* synthetic */ C82381f f240081g;

    public /* synthetic */ b$$a(C81823b bVar, C0125s sVar, C91165a.C53318a aVar, C82381f fVar) {
        this.f240078d = bVar;
        this.f240079e = sVar;
        this.f240080f = aVar;
        this.f240081g = fVar;
    }

    public final void run() {
        C81823b bVar = this.f240078d;
        C0125s sVar = this.f240079e;
        C91165a.C53318a aVar = this.f240080f;
        C82381f fVar = this.f240081g;
        bVar.getClass();
        sVar.getLifecycle().addObserver(new AppBrandInvokeContext$4(bVar, aVar, fVar));
    }
}
