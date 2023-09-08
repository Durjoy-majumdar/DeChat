package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import lp0.C88620b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.b0 */
public final class C83654b0 implements C88620b<C83928t1> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g((C83928t1) d1Var, "pageView");
        ((C119157j) C119157j.f356862d).mo183870a(C83651a0.f244276d);
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g((C83928t1) d1Var, "pageView");
        return "分析当前进程SMAPS";
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g((C83928t1) d1Var, "pageView");
        return BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger();
    }
}
