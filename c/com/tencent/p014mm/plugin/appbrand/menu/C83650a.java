package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import dm0.C86343a;
import lp0.C88619a;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.a */
public class C83650a extends C88619a<C83928t1> {
    public C83650a() {
        super(13);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        e0Var.mo107144g(13, context.getString(C0966R.string.a74), C0966R.raw.icons_outlined_mini_program2);
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        AppBrandInitConfigWC M1 = t1Var.getRuntime().mo113210l1();
        if (S1 != null) {
            String str2 = "";
            String str3 = t1Var.getRuntime().mo121253n1() != null ? t1Var.getRuntime().mo113210l1().f234837q : str2;
            MMToClientEvent.m100655q(t1Var.getAppId(), new C86343a(t1Var));
            WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
            bVar.f239557a = S1.f261062e;
            bVar.f239566j = 3;
            if (t1Var.f244558J != null) {
                str2 = t1Var.mo116162Q0();
            }
            bVar.f239567k = str2;
            bVar.f239564h = S1.f261072r.f238585d;
            bVar.f239563g = S1.f261072r.pkgVersion;
            AppBrandProfileUI.m104017R7(context, M1.f234839s, 3, str3, true, bVar.mo113977a(), (Bundle) null, ActivityStarterIpcDelegate.m893a(context));
            C84240s.m103840f(str, t1Var.mo116162Q0(), 6, "", Util.nowSecond(), 1, 0);
        }
    }
}
