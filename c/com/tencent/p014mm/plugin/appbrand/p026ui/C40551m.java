package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.m */
public class C40551m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f108927d;

    public C40551m(AppBrandAuthorizeUI appBrandAuthorizeUI, boolean z) {
        this.f108927d = appBrandAuthorizeUI;
    }

    public void run() {
        Preference preference = new Preference(this.f108927d);
        preference.f121290w = false;
        preference.mo26273A("preference_key_tip");
        preference.f121271G = C0966R.C0971layout.f6387dg;
        AppBrandAuthorizeUI appBrandAuthorizeUI = this.f108927d;
        preference.mo69924H(appBrandAuthorizeUI.getString(C0966R.string.f7606l_, new Object[]{appBrandAuthorizeUI.f49760i.f239577f}));
        this.f108927d.f49761j.mo72531o("preference_key_tip");
        this.f108927d.f49761j.mo72527k(preference);
        this.f108927d.f49761j.notifyDataSetChanged();
    }
}
