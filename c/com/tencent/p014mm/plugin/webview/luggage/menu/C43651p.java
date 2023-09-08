package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.p */
public class C43651p extends C43634a {
    public C43651p() {
        super(31);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        e0Var.mo107144g(31, context.getString(C0966R.string.lmh), C0966R.raw.actionbar_icon_dark_search);
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        nVar.mo67935U(true);
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 8);
    }
}
