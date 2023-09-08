package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.x1 */
public class C40559x1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f108949d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandProfileUI f108950e;

    public C40559x1(AppBrandProfileUI appBrandProfileUI, boolean z) {
        this.f108950e = appBrandProfileUI;
        this.f108949d = z;
    }

    public void run() {
        AppBrandNearbyShowcaseView appBrandNearbyShowcaseView;
        if (this.f108949d && (appBrandNearbyShowcaseView = this.f108950e.f246434G) != null) {
            appBrandNearbyShowcaseView.mo63420b(true);
        }
    }
}
