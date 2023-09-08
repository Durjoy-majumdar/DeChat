package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43603j1;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.m */
public class C43648m extends C43634a {
    public C43648m() {
        super(35);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        C43603j1 j1Var = nVar.f117917G;
        if (nVar.mo67930A() && j1Var != null) {
            e0Var.mo107144g(35, context.getString(C0966R.string.hrr), C0966R.raw.icons_outlined_multitask);
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        C43603j1 j1Var = nVar.f117917G;
        if (j1Var != null) {
            j1Var.mo67895G(true);
            C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 4);
        }
    }
}
