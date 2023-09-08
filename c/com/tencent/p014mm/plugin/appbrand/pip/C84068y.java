package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.y */
public class C84068y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84059t f245450d;

    public C84068y(C84059t tVar) {
        this.f245450d = tVar;
    }

    public void run() {
        Log.m105924i(this.f245450d.f245415a, "transferTo, hideTask run");
        AppBrandPipContainerView appBrandPipContainerView = this.f245450d.f245419e;
        if (appBrandPipContainerView != null) {
            appBrandPipContainerView.setVisibility(4);
        }
    }
}
