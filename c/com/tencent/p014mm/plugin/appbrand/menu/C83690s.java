package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import lp0.C88619a;
import nj3.C76874e0;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.s */
public class C83690s extends C88619a<C83928t1> {
    public C83690s() {
        super(23);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.f7618lm), C0966R.raw.appbrand_menu_setting);
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        String str2 = t1Var.getRuntime().mo113210l1().f234839s;
        if (!Util.isNullOrNil(str2)) {
            Intent putExtra = new Intent(context, AppBrandAuthorizeUI.class).putExtra("key_username", str2);
            putExtra.putExtra("key_app_authorize_profile", true);
            C88144b.m109791i(context, XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandAuthorizeUI", putExtra, (Bundle) null);
            C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 30, "", Util.nowSecond(), 1, 0);
        }
    }
}
