package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import pj3.C47511g;
import te3.C51793w7;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$l */
public class AppBrandAuthorizeUI$$l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C51793w7 f49795d;

    /* renamed from: e */
    public final /* synthetic */ String f49796e;

    /* renamed from: f */
    public final /* synthetic */ Preference f49797f;

    /* renamed from: g */
    public final /* synthetic */ C47511g f49798g;

    /* renamed from: h */
    public final /* synthetic */ AppBrandAuthorizeUI f49799h;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$l$a */
    public class C18025a implements AppBrandAuthorizeUI$$p {
        public C18025a() {
        }

        /* renamed from: a */
        public void mo22488a(boolean z) {
            AppBrandAuthorizeUI$$l appBrandAuthorizeUI$$l = AppBrandAuthorizeUI$$l.this;
            AppBrandAuthorizeUI.m18562I7(appBrandAuthorizeUI$$l.f49799h, z, false, appBrandAuthorizeUI$$l.f49797f, appBrandAuthorizeUI$$l.f49798g, appBrandAuthorizeUI$$l.f49795d);
        }
    }

    public AppBrandAuthorizeUI$$l(AppBrandAuthorizeUI appBrandAuthorizeUI, C51793w7 w7Var, String str, Preference preference, C47511g gVar) {
        this.f49799h = appBrandAuthorizeUI;
        this.f49795d = w7Var;
        this.f49796e = str;
        this.f49797f = preference;
        this.f49798g = gVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105918d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state close");
        this.f49795d.f143898f = 2;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f49796e);
        AppBrandAuthorizeUI appBrandAuthorizeUI = this.f49799h;
        C18025a aVar = new C18025a();
        String[] strArr = AppBrandAuthorizeUI.f49731X;
        appBrandAuthorizeUI.mo22476X7(arrayList, aVar);
    }
}
