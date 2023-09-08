package com.tencent.p014mm.plugin.appbrand.p026ui;

import te3.C51793w7;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.l */
public class C84561l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C51793w7 f246759d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandAuthorizeUI f246760e;

    public C84561l(AppBrandAuthorizeUI appBrandAuthorizeUI, C51793w7 w7Var) {
        this.f246760e = appBrandAuthorizeUI;
        this.f246759d = w7Var;
    }

    public void run() {
        AppBrandAuthorizeUI appBrandAuthorizeUI = this.f246760e;
        appBrandAuthorizeUI.mo22483e8(appBrandAuthorizeUI.f49765q, this.f246759d);
        this.f246760e.f49761j.notifyDataSetChanged();
    }
}
