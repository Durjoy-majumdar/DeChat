package com.tencent.p014mm.plugin.appbrand.p026ui;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import nj3.C88990b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUITranslucentWorkaroundDelegate */
class AppBrandUITranslucentWorkaroundDelegate implements C0124r, C88990b.C88992b {

    /* renamed from: d */
    public final AppBrandUI f246538d;

    /* renamed from: e */
    public boolean f246539e = false;

    /* renamed from: f */
    public boolean f246540f = false;

    public AppBrandUITranslucentWorkaroundDelegate(AppBrandUI appBrandUI) {
        this.f246538d = appBrandUI;
    }

    /* renamed from: A6 */
    public void mo117102A6() {
        this.f246539e = false;
    }

    /* renamed from: F1 */
    public void mo117103F1() {
        this.f246539e = true;
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onActivityResumed() {
        if (this.f246540f) {
            C88990b.m111193b(this.f246538d);
            this.f246540f = false;
        }
    }
}
