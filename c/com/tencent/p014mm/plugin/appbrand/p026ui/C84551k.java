package com.tencent.p014mm.plugin.appbrand.p026ui;

import te3.C51793w7;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.k */
public class C84551k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C51793w7 f246718d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandAuthorizeUI f246719e;

    public C84551k(AppBrandAuthorizeUI appBrandAuthorizeUI, C51793w7 w7Var) {
        this.f246719e = appBrandAuthorizeUI;
        this.f246718d = w7Var;
    }

    public void run() {
        AppBrandAuthorizeUI appBrandAuthorizeUI = this.f246719e;
        appBrandAuthorizeUI.mo22482d8(appBrandAuthorizeUI.f49764p, this.f246718d);
        this.f246719e.f49761j.notifyDataSetChanged();
    }
}
