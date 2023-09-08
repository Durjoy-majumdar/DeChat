package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.text.TextUtils;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI$$c */
public final /* synthetic */ class AppBrandAuthorizeDetailUI$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeDetailUI f345389d;

    public /* synthetic */ AppBrandAuthorizeDetailUI$$c(AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI) {
        this.f345389d = appBrandAuthorizeDetailUI;
    }

    public final void run() {
        AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI = this.f345389d;
        int[] iArr = AppBrandAuthorizeDetailUI.f345375r;
        boolean z = false;
        if (appBrandAuthorizeDetailUI.getIntent() != null) {
            z = appBrandAuthorizeDetailUI.getIntent().getBooleanExtra("key_three_state", false);
        }
        if (z) {
            String str = null;
            AppBrandAuthPreference appBrandAuthPreference = new AppBrandAuthPreference(appBrandAuthorizeDetailUI, (AttributeSet) null);
            appBrandAuthorizeDetailUI.f345382j = appBrandAuthPreference;
            appBrandAuthPreference.mo26273A("both");
            if (appBrandAuthorizeDetailUI.getIntent() != null) {
                str = appBrandAuthorizeDetailUI.getIntent().getStringExtra("key_override_authorize_both_desc");
            }
            if (TextUtils.isEmpty(str)) {
                AppBrandAuthPreference appBrandAuthPreference2 = appBrandAuthorizeDetailUI.f345382j;
                appBrandAuthPreference2.f10888K = appBrandAuthPreference2.f121274d.getString(C0966R.string.f7614li);
            } else {
                appBrandAuthorizeDetailUI.f345382j.f10888K = str;
            }
            appBrandAuthorizeDetailUI.f345378f.mo72527k(appBrandAuthorizeDetailUI.f345382j);
        }
    }
}
