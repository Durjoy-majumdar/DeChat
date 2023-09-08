package com.tencent.p014mm.plugin.appbrand.page;

import p977hj.C87526a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.i4 */
public final class C83829i4 {
    /* renamed from: a */
    public static boolean m103114a(C83817h4 h4Var) {
        return (h4Var == C83817h4.APP_LAUNCH || h4Var == C83817h4.SWITCH_TAB || h4Var == C83817h4.REDIRECT_TO || h4Var == C83817h4.REWRITE_ROUTE || h4Var == C83817h4.RE_LAUNCH || h4Var == C83817h4.AUTO_RE_LAUNCH) ? false : true;
    }

    /* renamed from: b */
    public static boolean m103115b(C83817h4 h4Var) {
        return C87526a.m108857b(new C83817h4[]{C83817h4.SWITCH_TAB, C83817h4.RE_LAUNCH, C83817h4.AUTO_RE_LAUNCH}, h4Var);
    }
}
