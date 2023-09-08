package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$a */
public final /* synthetic */ class AppBrandAuthorizeDetailUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeDetailUI f345387d;

    public /* synthetic */ AppBrandAuthorizeDetailUI$$a(AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI) {
        this.f345387d = appBrandAuthorizeDetailUI;
    }

    public final void run() {
        AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI = this.f345387d;
        int[] iArr = AppBrandAuthorizeDetailUI.f345375r;
        appBrandAuthorizeDetailUI.getClass();
        AppBrandAuthPreference appBrandAuthPreference = new AppBrandAuthPreference(appBrandAuthorizeDetailUI, (AttributeSet) null);
        appBrandAuthorizeDetailUI.f345380h = appBrandAuthPreference;
        appBrandAuthPreference.mo26273A("none");
        AppBrandAuthPreference appBrandAuthPreference2 = appBrandAuthorizeDetailUI.f345380h;
        appBrandAuthPreference2.f10888K = appBrandAuthPreference2.f121274d.getString(C0966R.string.f7616lk);
        appBrandAuthorizeDetailUI.f345378f.mo72527k(appBrandAuthorizeDetailUI.f345380h);
    }
}
