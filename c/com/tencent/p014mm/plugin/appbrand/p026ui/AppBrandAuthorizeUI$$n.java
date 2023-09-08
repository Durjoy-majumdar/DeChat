package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import pj3.C47511g;
import te3.C51793w7;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$n */
public class AppBrandAuthorizeUI$$n implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C51793w7 f49804d;

    /* renamed from: e */
    public final /* synthetic */ Preference f49805e;

    /* renamed from: f */
    public final /* synthetic */ C47511g f49806f;

    public AppBrandAuthorizeUI$$n(AppBrandAuthorizeUI appBrandAuthorizeUI, C51793w7 w7Var, Preference preference, C47511g gVar) {
        this.f49804d = w7Var;
        this.f49805e = preference;
        this.f49806f = gVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105918d("MicroMsg.AppBrandAuthorizeUI", "on cancel click!");
        this.f49804d.f143898f = 1;
        ((CheckBoxPreference) this.f49805e).mo6805K(true);
        this.f49806f.notifyDataSetChanged();
    }
}
