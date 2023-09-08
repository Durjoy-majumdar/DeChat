package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.modeltools.C43741b;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.n */
public class C43649n extends C43634a {

    /* renamed from: b */
    public C43741b f117901b = new C43741b();

    public C43649n() {
        super(7);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        e0Var.mo107146h(7, context.getString(C0966R.string.llj), C0966R.raw.bottomsheet_icon_brower, context.getResources().getColor(C0966R.color.f2956ac));
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        String n = nVar.f117922L.mo70848n(nVar.mo67943v());
        if (Util.isNullOrNil(n)) {
            n = nVar.mo67943v();
        }
        if (context instanceof Activity) {
            this.f117901b.mo68050c((Activity) context, n);
        }
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 6);
    }
}
