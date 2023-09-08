package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.widget.AppBrandPipContainerView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.x */
public class C84067x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84059t f245449d;

    public C84067x(C84059t tVar) {
        this.f245449d = tVar;
    }

    public void run() {
        Log.m105924i(this.f245449d.f245415a, "transferTo, showTask run");
        AppBrandPipContainerView appBrandPipContainerView = this.f245449d.f245419e;
        if (appBrandPipContainerView != null) {
            appBrandPipContainerView.mo117661e(true);
            this.f245449d.f245419e.setVisibility(0);
        }
    }
}
