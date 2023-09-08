package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import pj3.C47511g;
import te3.C51793w7;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$m */
public class AppBrandAuthorizeUI$$m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C51793w7 f49801d;

    /* renamed from: e */
    public final /* synthetic */ Preference f49802e;

    /* renamed from: f */
    public final /* synthetic */ C47511g f49803f;

    public AppBrandAuthorizeUI$$m(AppBrandAuthorizeUI appBrandAuthorizeUI, C51793w7 w7Var, Preference preference, C47511g gVar) {
        this.f49801d = w7Var;
        this.f49802e = preference;
        this.f49803f = gVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105918d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state open");
        this.f49801d.f143898f = 1;
        ((CheckBoxPreference) this.f49802e).mo6805K(true);
        this.f49803f.notifyDataSetChanged();
    }
}
