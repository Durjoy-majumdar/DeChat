package com.tencent.p014mm.plugin.appbrand.extendplugin;

import co0.C80127b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;
import p830xc.C91165a;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.b$$c */
public class b$$c implements C82531i.C82533b {

    /* renamed from: d */
    public final /* synthetic */ C91165a.C53318a f240083d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f240084e;

    public b$$c(C81823b bVar, C91165a.C53318a aVar, C82381f fVar) {
        this.f240083d = aVar;
        this.f240084e = fVar;
    }

    /* renamed from: b */
    public void mo22089b() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandInvokeContext", "onBackground");
        C91165a.C53318a aVar = this.f240083d;
        if (aVar != null) {
            aVar.mo18009a(C80127b.m97436b(this.f240084e.getAppId()));
        }
    }
}
