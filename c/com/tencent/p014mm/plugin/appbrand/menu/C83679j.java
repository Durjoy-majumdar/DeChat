package com.tencent.p014mm.plugin.appbrand.menu;

import ai0.C79553f;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import lp0.C88619a;
import nj3.C76874e0;
import qp0.C89784b;
import qp0.C89787d;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.j */
public class C83679j extends C88619a<C83928t1> {
    public C83679j() {
        super(22);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C89787d dVar = ((C83928t1) d1Var).getRuntime().f238293u1;
        C89784b bVar = dVar != null ? dVar.f258168a : null;
        if (bVar != null && bVar.mo67893A()) {
            int i = this.f255896a;
            String string = context.getResources().getString(C0966R.string.f360115a70);
            Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
            e0Var.mo107151k(i, string, C0966R.raw.icons_outlined_multitask, context instanceof AppBrandAdUI);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C83678i iVar = new C83678i(this, t1Var.getRuntime());
        if (!t1Var.getRuntime().f238266B1.mo118003a(t1Var.getRuntime(), true, iVar)) {
            iVar.run();
        }
        C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 29, "", Util.nowSecond(), 1, 0);
    }
}
