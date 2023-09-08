package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84527f3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84532g3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.page.j */
public final class C83830j {
    /* renamed from: a */
    public static final C84527f3 m103116a(Context context) {
        C84527f3 f3Var;
        C87412m.m108594g(context, "<this>");
        if (context instanceof C84527f3) {
            return (C84527f3) context;
        }
        if (context instanceof AppBrandUI) {
            AppBrandUI appBrandUI = (AppBrandUI) context;
            if (appBrandUI.f246491I == null) {
                appBrandUI.f246491I = new C84527f3(appBrandUI);
            }
            f3Var = appBrandUI.f246491I;
        } else if (context instanceof C84543i2) {
            C84543i2 i2Var = (C84543i2) context;
            if (i2Var.f246708c == null) {
                i2Var.f246708c = new C84527f3(i2Var);
            }
            f3Var = i2Var.f246708c;
        } else {
            f3Var = new C84527f3(context, C84532g3.m104119a(false));
        }
        C87412m.m108593f(f3Var, "{\n        if (this is Ap….THEME())\n        }\n    }");
        return f3Var;
    }
}
