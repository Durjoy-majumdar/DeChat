package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandGuideUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.Set;
import lc3.C10485b;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.l */
public class C81508l {
    /* renamed from: a */
    public static boolean m99999a() {
        Integer num = C81506j0.f239106d;
        if (!C86709a0.m107522a()) {
            return false;
        }
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_USAGE_RECORD_HAS_FAVORITE_BOOLEAN, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: b */
    public static boolean m100000b() {
        if (!C86709a0.m107522a()) {
            return false;
        }
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_USAGE_RECORD_HAS_HISTORY_BOOLEAN, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: c */
    public static boolean m100001c() {
        if (!C86709a0.m107522a()) {
            return false;
        }
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WeAppForbiddenSwitch", 0) == 1) {
            Log.m105924i("MicroMsg.AppBrandEntranceLogic", "showInFindMore, WeAppForbiddenSwitch == 1, not show");
            return false;
        }
        if (!(m99999a() || m100000b())) {
            Set<Object> set = C81478e0.f239071d;
            return !C86709a0.m107522a() ? false : ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_SHOW_RED_DOT_ONCE_BOOLEAN, Boolean.FALSE)).booleanValue();
        }
    }

    /* renamed from: d */
    public static boolean m100002d() {
        if (!C86709a0.m107522a()) {
            return false;
        }
        return ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: e */
    public static void m100003e(boolean z, boolean z2, String str) {
        AppBrandGuideUI.C68638e yx02;
        if (C86709a0.m107522a()) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APP_BRAND_USAGE_RECORD_HAS_HISTORY_BOOLEAN;
            Boolean bool = (Boolean) i.mo119685f(aVar, (Object) null);
            boolean z3 = false;
            if (bool != null && !bool.booleanValue() && z) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN, Boolean.TRUE);
                C115669n.INSTANCE.mo160131h(14112, 1, Util.nullAsNil(""), 0L, 1, 1);
                z3 = true;
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.valueOf(z));
            if (z2 && z3 && (yx02 = C81161g2.yx0()) != null) {
                yx02.f197175d = true;
                yx02.f197176e = str;
            }
        }
    }
}
