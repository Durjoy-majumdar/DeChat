package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82262v;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.widget.recent.AppBrandRecentView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import xt0.C91343g;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$l */
public class t1$$l implements AppBrandRecentView.C85013a {

    /* renamed from: a */
    public final /* synthetic */ C83928t1 f245043a;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$l$a */
    public class C83929a implements Runnable {
        public C83929a() {
        }

        public void run() {
            t1$$l.this.f245043a.f245020d1.dismiss();
        }
    }

    public t1$$l(C83928t1 t1Var) {
        this.f245043a = t1Var;
    }

    /* renamed from: a */
    public boolean mo116539a(View view, C91343g gVar, float f, float f2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo116540b(View view, C91343g gVar, float f, float f2) {
        MMHandlerThread.postToMainThreadDelayed(new C83929a(), 100);
        gVar.getClass();
        LocalUsageInfo localUsageInfo = gVar.f261985a;
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = C82262v.CTRL_INDEX;
        appBrandStatObject.f245534g = this.f245043a.getAppId();
        ((C83285a) C83428o.f243800a).mo115583c(this.f245043a.getContext(), localUsageInfo.f239040d, (String) null, (String) null, localUsageInfo.f239042f, -1, appBrandStatObject, (AppBrandLaunchReferrer) null, (LaunchParamsOptional) null);
        return true;
    }
}
