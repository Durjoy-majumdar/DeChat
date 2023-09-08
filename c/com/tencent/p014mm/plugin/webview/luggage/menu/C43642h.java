package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import java.util.List;
import nj3.C76874e0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.h */
public class C43642h extends C43634a {
    public C43642h() {
        super(9);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        boolean z = nVar.f148261n.getBoolean("is_favorite_item", false);
        boolean z2 = nVar.f148261n.getBoolean("key_detail_can_delete", true);
        if (z && z2) {
            e0Var.mo107144g(9, context.getString(C0966R.string.f7944x1), C0966R.raw.bottomsheet_icon_del);
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        C76879j.m92732c(context, context.getString(C0966R.string.f7946x3), (List<String>) null, (List<Integer>) null, context.getString(C0966R.string.f7944x1), new C43641g(this, nVar));
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 3);
    }
}
