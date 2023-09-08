package com.tencent.p014mm.plugin.appbrand.extendplugin;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import co0.C80127b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import p830xc.C91165a;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.AppBrandInvokeContext$4 */
class AppBrandInvokeContext$4 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C91165a.C53318a f240068d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f240069e;

    public AppBrandInvokeContext$4(C81823b bVar, C91165a.C53318a aVar, C82381f fVar) {
        this.f240068d = aVar;
        this.f240069e = fVar;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onDestroyed() {
        C91165a.C53318a aVar = this.f240068d;
        if (aVar != null) {
            aVar.onDestroy();
        }
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onPaused() {
        C91165a.C53318a aVar = this.f240068d;
        if (aVar != null) {
            aVar.mo18009a(C80127b.m97436b(this.f240069e.getAppId()));
        }
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onResumed() {
        C91165a.C53318a aVar = this.f240068d;
        if (aVar != null) {
            aVar.mo18010c();
        }
    }
}
