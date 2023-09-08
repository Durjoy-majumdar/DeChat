package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import lp0.C88619a;
import nj3.C76874e0;
import xr0.C78972i;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.k */
public final class C83680k extends C88619a<C83928t1> {
    public C83680k() {
        super(12);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        String str2 = t1Var.getRuntime().mo113210l1().f234839s;
        int i = t1Var.getRuntime().f238149o.f239365g;
        try {
            boolean l8 = ((C68585h1) C86312j.m106911c(C68585h1.class)).mo94243l8(str2, i);
            e0Var.mo107146h(this.f255896a, l8 ? context.getString(C0966R.string.f7912w1) : context.getString(C0966R.string.f7908vx), l8 ? C0966R.raw.appbrand_menu_modify_collection_remove : C0966R.raw.appbrand_menu_modify_collection_add, 0);
            C84072q1.m103586a(str).f245463g = l8;
        } catch (Exception e) {
            e0Var.removeItem(this.f255896a);
            Log.m105921e("MicroMsg.MenuDelegate_ModifyCollection", "attachTo, query (%s %d) e = %s", str2, Integer.valueOf(i), e);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        boolean z = C84072q1.m103587b(str).f245463g;
        boolean a = C78972i.m95479a(z, context, t1Var.getRuntime().mo113210l1().f234839s, t1Var.getRuntime().f238149o.f239365g);
        int i = 2;
        C84240s.m103840f(str, t1Var.mo116162Q0(), z ? 25 : 24, "", Util.nowSecond(), a ? 1 : 2, 0);
        if (a) {
            boolean z2 = !z;
            AppBrandStatObject n1 = t1Var.getRuntime().mo121253n1();
            if (z2) {
                i = 1;
            }
            n1.f245535h = i;
        }
    }
}
