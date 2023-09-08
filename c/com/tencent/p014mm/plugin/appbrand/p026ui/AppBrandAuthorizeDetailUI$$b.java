package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$b */
public final /* synthetic */ class AppBrandAuthorizeDetailUI$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeDetailUI f345388d;

    public /* synthetic */ AppBrandAuthorizeDetailUI$$b(AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI) {
        this.f345388d = appBrandAuthorizeDetailUI;
    }

    public final void run() {
        AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI = this.f345388d;
        int[] iArr = AppBrandAuthorizeDetailUI.f345375r;
        appBrandAuthorizeDetailUI.getClass();
        AppBrandAuthPreference appBrandAuthPreference = new AppBrandAuthPreference(appBrandAuthorizeDetailUI, (AttributeSet) null);
        appBrandAuthorizeDetailUI.f345381i = appBrandAuthPreference;
        appBrandAuthPreference.mo26273A("foreground");
        AppBrandAuthPreference appBrandAuthPreference2 = appBrandAuthorizeDetailUI.f345381i;
        appBrandAuthPreference2.f10888K = appBrandAuthPreference2.f121274d.getString(C0966R.string.f7615lj);
        appBrandAuthorizeDetailUI.f345378f.mo72527k(appBrandAuthorizeDetailUI.f345381i);
    }
}
