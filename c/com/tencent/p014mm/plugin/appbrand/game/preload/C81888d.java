package com.tencent.p014mm.plugin.appbrand.game.preload;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.sdk.platformtools.Log;
import op0.C89260f;
import p210o.C11323a;

/* renamed from: com.tencent.mm.plugin.appbrand.game.preload.d */
public class C81888d implements C89260f {

    /* renamed from: a */
    public final /* synthetic */ String f240191a;

    /* renamed from: b */
    public final /* synthetic */ C81889e f240192b;

    public C81888d(C81889e eVar, String str) {
        this.f240192b = eVar;
        this.f240191a = str;
    }

    /* renamed from: a */
    public void mo114282a(C11323a<AppBrandRuntime, Boolean> aVar) {
        Log.m105925i("MicroMsg.WAGamePreloadManager", "onResultCustomAction, module(%s)", this.f240191a);
        this.f240192b.f240204k.addAndGet(1);
    }

    /* renamed from: b */
    public void mo114283b(WxaPkgLoadProgress wxaPkgLoadProgress) {
        Log.m105925i("MicroMsg.WAGamePreloadManager", "hy: on load module progress %s", wxaPkgLoadProgress);
    }
}
