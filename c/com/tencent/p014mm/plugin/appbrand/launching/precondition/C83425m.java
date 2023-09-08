package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.luggage.sdk.launching.C80245f;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84128k0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.m */
public final class C83425m extends C83410a implements C83429p {

    /* renamed from: j */
    public Intent f243792j;

    /* renamed from: n */
    public LaunchParcel f243793n;

    /* renamed from: o */
    public int f243794o = 0;

    public C83425m(AppBrandLaunchProxyUI appBrandLaunchProxyUI, boolean z) {
        setBaseContext(appBrandLaunchProxyUI);
        this.f243762f = z;
    }

    /* renamed from: b */
    public void mo115699b(Intent intent, Bundle bundle) {
        Class<KSProcessWeAppLaunch> cls = KSProcessWeAppLaunch.class;
        if (getBaseContext() != null && (getBaseContext() instanceof Activity)) {
            Activity activity = (Activity) getBaseContext();
            C85864g1.m106129d(activity.getWindow());
            C85864g1.m106127b(activity.getWindow(), true);
        }
        this.f243792j = intent;
        LaunchParcel launchParcel = (LaunchParcel) intent.getParcelableExtra("extra_launch_parcel");
        if (launchParcel == null) {
            mo115709e((AppBrandInitConfigWC) null, (AppBrandStatObject) null);
            return;
        }
        ((Activity) getBaseContext()).overridePendingTransition(0, 0);
        this.f243793n = launchParcel;
        String str = launchParcel.f243731e;
        if (Util.isNullOrNil(str)) {
            str = C83435s.m102390g(launchParcel);
        }
        String e = C84201i.m103808e(launchParcel, str, false);
        C84201i.m103809f(launchParcel, e, str);
        C84128k0.f245602a.mo116794d(launchParcel, e);
        if (C84186b0.m103776e()) {
            C84186b0.f245919a.mo116883k(str, e);
            C83226n.m102133j(cls, str);
            C83226n.m102124a(cls, str, String.format("Network:%s", new Object[]{NetStatusUtil.getNetTypeString(this)}));
        }
        this.f243764h = launchParcel;
        C2039g2.m1988b(new C83421k(this, launchParcel, e));
    }

    /* renamed from: c */
    public boolean mo115700c() {
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public void mo115709e(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        try {
            LaunchParcel launchParcel = this.f243793n;
            if (!(launchParcel == null || launchParcel.f243749z == null)) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("KEY_PRECONDITION_RESULT", appBrandInitConfigWC);
                this.f243793n.f243749z.mo111345a(bundle);
            }
            if (appBrandInitConfigWC != null) {
                appBrandInitConfigWC.f239375f1 = this.f243792j.getStringExtra("extra_launch_source_process_name");
            }
            super.mo115709e(appBrandInitConfigWC, appBrandStatObject);
            LaunchParcel launchParcel2 = this.f243793n;
            if (launchParcel2 != null) {
                C80245f.m97632b(launchParcel2.f243749z);
            }
        } catch (Throwable th) {
            LaunchParcel launchParcel3 = this.f243793n;
            if (launchParcel3 != null) {
                C80245f.m97632b(launchParcel3.f243749z);
            }
            throw th;
        }
    }

    /* renamed from: i */
    public boolean mo115713i(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        Class<?> cls;
        try {
            cls = Class.forName(Util.nullAsNil(this.f243792j.getStringExtra("extra_launch_source_context")));
        } catch (Exception unused) {
            cls = null;
        }
        if (cls == null || !AppBrandUI.class.isAssignableFrom(cls)) {
            return super.mo115713i(appBrandInitConfigWC, appBrandStatObject);
        }
        return false;
    }

    public void onDestroy() {
        mo115708d();
    }

    public void onPause() {
        if (!mo115707b()) {
            if (!(mo115706a() && ((AppBrandLaunchProxyUI) getBaseContext()).isDestroyed())) {
                mo115712h(new C83411b(this));
            }
        }
    }

    public void onResume() {
        boolean z = true;
        int i = this.f243794o + 1;
        this.f243794o = i;
        if (i > 1 && !mo115707b()) {
            if (!mo115706a() || !((AppBrandLaunchProxyUI) getBaseContext()).isDestroyed()) {
                z = false;
            }
            if (!z) {
                mo115712h(new C83411b(this));
            }
        }
    }
}
