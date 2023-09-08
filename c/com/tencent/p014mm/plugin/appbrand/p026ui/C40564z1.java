package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.z1 */
public class C40564z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f108960d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandProfileUI f108961e;

    public C40564z1(AppBrandProfileUI appBrandProfileUI, boolean z) {
        this.f108961e = appBrandProfileUI;
        this.f108960d = z;
    }

    public void run() {
        AppBrandNearbyShowcaseView appBrandNearbyShowcaseView;
        if (this.f108960d && (appBrandNearbyShowcaseView = this.f108961e.f246438K) != null) {
            appBrandNearbyShowcaseView.mo63420b(true);
        }
    }
}
