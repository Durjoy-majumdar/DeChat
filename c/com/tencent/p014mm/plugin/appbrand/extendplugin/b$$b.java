package com.tencent.p014mm.plugin.appbrand.extendplugin;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;
import p830xc.C91165a;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.b$$b */
public class b$$b implements C82531i.C82535d {

    /* renamed from: d */
    public final /* synthetic */ C91165a.C53318a f240082d;

    public b$$b(C81823b bVar, C91165a.C53318a aVar) {
        this.f240082d = aVar;
    }

    /* renamed from: c */
    public void mo22090c() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandInvokeContext", "onForeground");
        C91165a.C53318a aVar = this.f240082d;
        if (aVar != null) {
            aVar.mo18010c();
        }
    }
}
