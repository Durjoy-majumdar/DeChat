package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.PersistableBundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82819r;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask$$e;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import lp3.C46888b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q */
public class C82818q implements AppBrandPreInitTask$$e {

    /* renamed from: a */
    public final /* synthetic */ C46888b f242210a;

    /* renamed from: b */
    public final /* synthetic */ C82819r.C82820a f242211b;

    public C82818q(C82819r.C82820a aVar, C46888b bVar) {
        this.f242211b = aVar;
        this.f242210a = bVar;
    }

    /* renamed from: a */
    public void mo114042a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        if (appBrandInitConfigWC == null) {
            this.f242210a.mo72093c(null);
            return;
        }
        String optString = this.f242211b.f242215c.optString("adUxInfo", (String) null);
        if (!TextUtils.isEmpty(optString)) {
            if (appBrandInitConfigWC.f234809M == null) {
                appBrandInitConfigWC.f234809M = new PersistableBundle();
            }
            appBrandInitConfigWC.f234809M.putString("adUxInfo", optString);
            LaunchParcel launchParcel = this.f242211b.f242214b;
            appBrandInitConfigWC.f234845x0 = launchParcel.f243726S;
            appBrandInitConfigWC.f234847y0 = launchParcel.f243727T;
        }
        this.f242210a.mo72093c(appBrandInitConfigWC);
    }
}
