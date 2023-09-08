package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.a4 */
public class C84482a4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandXWebDownloadProxyUI f246585d;

    public C84482a4(AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI) {
        this.f246585d = appBrandXWebDownloadProxyUI;
    }

    public void run() {
        AppBrandXWebDownloadProxyUI.f246573h = true;
        this.f246585d.setResult(0, new Intent());
        this.f246585d.finish();
    }
}
