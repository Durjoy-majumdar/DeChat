package com.tencent.p014mm.plugin.appbrand.page;

import fm0.C8133c0;
import fm0.C86925a0;
import fm0.C86963n;
import fm0.C86968p;
import fm0.C86971p1;

/* renamed from: com.tencent.mm.plugin.appbrand.page.h4 */
public enum C83817h4 {
    APP_LAUNCH("appLaunch"),
    NAVIGATE_TO(C86968p.NAME),
    NAVIGATE_BACK(C86963n.NAME),
    REDIRECT_TO(C86925a0.NAME),
    REWRITE_ROUTE(C8133c0.NAME),
    RE_LAUNCH("reLaunch"),
    AUTO_RE_LAUNCH("autoReLaunch"),
    SWITCH_TAB(C86971p1.NAME),
    DISMISS_PIP("dismissPip");
    

    /* renamed from: d */
    public final String f244671d;

    /* access modifiers changed from: public */
    C83817h4(String str) {
        this.f244671d = str;
    }

    public String toString() {
        return this.f244671d;
    }
}
