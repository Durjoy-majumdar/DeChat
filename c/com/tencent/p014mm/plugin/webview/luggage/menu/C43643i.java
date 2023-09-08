package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import di3.C86312j;
import nj3.C76874e0;
import p272xq.C102712e;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.i */
public class C43643i extends C43634a {
    public C43643i() {
        super(12);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        boolean z = nVar.f148261n.getBoolean("is_favorite_item", false);
        boolean z2 = nVar.f148261n.getBoolean("key_detail_can_delete", true);
        if (z && z2) {
            e0Var.mo107144g(12, context.getString(C0966R.string.cmy), C0966R.raw.bottomsheet_icon_addtag);
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        Intent intent = new Intent();
        intent.putExtra("key_fav_scene", 2);
        intent.putExtra("key_fav_item_id", nVar.f148261n.getLong("fav_local_id", -1));
        ((C102712e) C86312j.m106911c(C102712e.class)).F20(context, ".ui.FavTagEditUI", intent);
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 1);
    }
}
