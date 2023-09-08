package com.tencent.p014mm.plugin.appbrand.pip;

import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.m0$$w;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.r */
public class C84057r implements m0$$w {

    /* renamed from: a */
    public final /* synthetic */ C84059t f245410a;

    public C84057r(C84059t tVar) {
        this.f245410a = tVar;
    }

    /* renamed from: a */
    public static boolean m103571a(C84057r rVar, String str, C83817h4 h4Var) {
        C83820i0 i0Var;
        if (C83817h4.NAVIGATE_TO == h4Var) {
            C84059t tVar = rVar.f245410a;
            if (!tVar.f245428n && (i0Var = tVar.f245427m) != null && i0Var.getCurrentUrl().equals(str)) {
                String str2 = rVar.f245410a.f245415a;
                Log.m105924i(str2, "onCreatePage, reuse " + C84059t.m103576j(rVar.f245410a.f245427m));
                return true;
            }
        } else {
            rVar.getClass();
        }
        return false;
    }
}
