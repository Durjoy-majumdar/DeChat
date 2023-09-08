package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.m0 */
public class C84564m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherUI f246762d;

    public C84564m0(AppBrandLauncherUI appBrandLauncherUI) {
        this.f246762d = appBrandLauncherUI;
    }

    public void run() {
        AppBrandLauncherUI.Fragment H7;
        if (!this.f246762d.activityHasDestroyed() && !this.f246762d.isFinishing() && (H7 = this.f246762d.mo117060H7()) != null) {
            H7.mo117065L();
        }
    }
}
