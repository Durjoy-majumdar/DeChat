package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76874e0;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.f */
public class C43640f extends C43634a {
    public C43640f() {
        super(6);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        if (nVar.mo65805w(44)) {
            e0Var.mo107144g(6, context.getString(C0966R.string.lle), C0966R.raw.icons_outlined_link);
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        String n = nVar.f117922L.mo70848n(nVar.mo67943v());
        if (Util.isNullOrNil(n)) {
            n = nVar.mo67943v();
        }
        ClipboardHelper.setText(n);
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.llf), 0).show();
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 0);
    }
}
