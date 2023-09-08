package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ky2.C10432i;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.f */
public final class C83482f {
    /* renamed from: a */
    public static final boolean m102439a(AppBrandInitConfigWC appBrandInitConfigWC, Integer num, String str, int i) {
        boolean e;
        Class cls = C10432i.class;
        C87412m.m108594g(appBrandInitConfigWC, "config");
        if (appBrandInitConfigWC.f234841u == 7 || appBrandInitConfigWC.f239373d1 || !(e = ((C10432i) C86312j.m106911c(cls)).mo10750e())) {
            return true;
        }
        int Oh0 = ((C10432i) C86312j.m106911c(cls)).Oh0();
        Log.m105925i("MicroMsg.AppBrandTeenModeUtils", "canLaunchAppBrand isTeenMode: %b, miniProgramOption: %d, serviceType: %d, isPluginApp: %b", Boolean.valueOf(e), Integer.valueOf(Oh0), Integer.valueOf(appBrandInitConfigWC.f234841u), Boolean.valueOf(appBrandInitConfigWC.f239373d1));
        if (Oh0 != 0) {
            return Oh0 != 2;
        }
        C68585h1 h1Var = (C68585h1) C86312j.m106911c(C68585h1.class);
        if (str == null) {
            str = "";
        }
        return h1Var.mo94243l8(str, i);
    }
}
