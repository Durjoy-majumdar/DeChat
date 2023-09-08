package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.p026ui.wxa_container.AppBrandContainerFragmentActivity;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUI$$e */
public class AppBrandUI$$e implements AppBrandContainerFragmentActivity.C84705a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandUI f246515a;

    public AppBrandUI$$e(AppBrandUI appBrandUI) {
        this.f246515a = appBrandUI;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            AppBrandUI appBrandUI = this.f246515a;
            boolean z2 = AppBrandUI.f246480N;
            appBrandUI.mo117106V7();
            AppBrandUI appBrandUI2 = this.f246515a;
            appBrandUI2.f246485C.postDelayed(appBrandUI2.f246486D, 500);
        }
    }
}
