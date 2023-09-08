package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.app.Activity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.m */
public final class C83594m {
    /* renamed from: a */
    public static final boolean m102619a(Activity activity, AppBrandInitConfig appBrandInitConfig, AppBrandStatObject appBrandStatObject) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(appBrandInitConfig, "config");
        C87412m.m108594g(appBrandStatObject, "stat");
        if (!(appBrandInitConfig instanceof AppBrandInitConfigWC)) {
            return false;
        }
        try {
            if (!C83559g.m102556b((AppBrandInitConfigWC) appBrandInitConfig, appBrandStatObject)) {
                return false;
            }
            activity.overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
