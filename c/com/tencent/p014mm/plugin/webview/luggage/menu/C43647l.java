package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import nj3.C76874e0;
import p828wa.C53106j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.l */
public class C43647l extends C43634a {
    public C43647l() {
        super(27);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        if (nVar.f148261n.getBoolean("show_full_screen", false)) {
            e0Var.mo107144g(27, context.getString(C0966R.string.hrl), C0966R.raw.bottomsheet_icon_exit);
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        C43661n0 n0Var = nVar.f117951u;
        if (!(n0Var != null ? n0Var.mo67963j() : false) && !C53106j.this.mo73791f(true)) {
            ((Activity) nVar.f148196d).finish();
        }
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 11);
    }
}
