package com.tencent.p014mm.plugin.appbrand.p026ui;

import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.h */
public class C18031h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f49832d;

    public C18031h(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f49832d = appBrandAuthorizeUI;
    }

    public void run() {
        C89779i0 i0Var = this.f49832d.f49737E;
        if (i0Var != null && i0Var.isShowing()) {
            this.f49832d.f49737E.dismiss();
            this.f49832d.f49737E = null;
        }
    }
}
