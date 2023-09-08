package com.tencent.p014mm.plugin.appbrand.menu;

import ai0.C79553f;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C85036x2;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import lp0.C88619a;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.m */
public final class C83682m extends C88619a<C83928t1> {
    public C83682m() {
        super(27);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g((C83928t1) d1Var, "pageView");
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        if (!(context instanceof AppBrandAdUI) && e0Var != null) {
            e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.f7829sw), C0966R.raw.icons_outlined_refresh);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(t1Var, "pageView");
        C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 40, "", Util.nowSecond(), 1, 0);
        C83681l lVar = new C83681l(t1Var);
        C85036x2 x2Var = t1Var.getRuntime().f238266B1;
        AppBrandRuntimeWC J1 = t1Var.getRuntime();
        C87412m.m108593f(J1, "pageView.runtime");
        if (!x2Var.mo118003a(J1, false, lVar)) {
            lVar.run();
        }
    }
}
