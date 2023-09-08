package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.JsApiGetAdPushMsg;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di3.C86312j;
import kr0.C76630x0;
import lp0.C88619a;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.h */
public class C83677h extends C88619a<C83928t1> {
    public C83677h() {
        super(25);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        if (!"wxae8e93bbcb785195".equals(str)) {
            e0Var.mo107144g(this.f255896a, context.getString(C0966R.string.f360116a71), C0966R.raw.appbrand_menu_growth_care);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C86299o oVar = new C86299o();
        oVar.f250930b = "wxae8e93bbcb785195";
        oVar.f250929a = "gh_32d0f14ab3c6@app";
        oVar.f250939k = t1Var.getRuntime().mo121254q1() ? 1085 : JsApiGetAdPushMsg.CTRL_INDEX;
        oVar.f250932d = 0;
        oVar.f250931c = 0;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 32, "", Util.nowSecond(), 1, 0);
    }
}
