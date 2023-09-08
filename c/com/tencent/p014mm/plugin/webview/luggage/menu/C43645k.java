package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.FavUrlTask;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5984s1;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashSet;
import nj3.C76874e0;
import pb1.C47453t0;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.k */
public class C43645k extends C43634a {

    /* renamed from: b */
    public C75018a.C75024d f117900b = new C43646a(this);

    /* renamed from: com.tencent.mm.plugin.webview.luggage.menu.k$a */
    public class C43646a implements C75018a.C75024d {
        public C43646a(C43645k kVar) {
        }

        /* renamed from: a */
        public void mo7429a() {
            FavUrlTask favUrlTask = new FavUrlTask();
            favUrlTask.f283014f = 2;
            favUrlTask.mo114395c();
        }
    }

    public C43645k() {
        super(3);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        if (!nVar.f148261n.getBoolean("is_favorite_item", false)) {
            e0Var.mo107146h(3, context.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0);
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("msg_id", nVar.f148261n.getLong("msg_id", Long.MIN_VALUE));
        bundle.putString("sns_local_id", nVar.f148261n.getString("sns_local_id"));
        bundle.putInt("news_svr_id", nVar.f148261n.getInt("news_svr_id", 0));
        bundle.putString("news_svr_tweetid", nVar.f148261n.getString("news_svr_tweetid"));
        bundle.putInt("message_index", nVar.f148261n.getInt("message_index", 0));
        String v = nVar.mo67943v();
        String t = nVar.mo67941t();
        bundle.putString("rawUrl", t);
        if (!Util.isNullOrNil(t) && t.endsWith("#rd")) {
            String substring = t.substring(0, t.length() - 3);
            if (!Util.isNullOrNil(v) && !v.startsWith(substring)) {
                bundle.putString("rawUrl", v);
                bundle.putLong("msg_id", Long.MIN_VALUE);
            }
        } else if (!Util.isNullOrNil(v) && !v.startsWith(t)) {
            bundle.putString("rawUrl", v);
            bundle.putLong("msg_id", Long.MIN_VALUE);
            bundle.putString("sns_local_id", "");
        }
        bundle.putString("preChatName", nVar.f148261n.getString("preChatName"));
        bundle.putInt("preMsgIndex", nVar.f148261n.getInt("preMsgIndex", 0));
        bundle.putString("prePublishId", nVar.f148261n.getString("prePublishId"));
        bundle.putString("preUsername", nVar.f148261n.getString("preUsername"));
        FavUrlTask favUrlTask = new FavUrlTask();
        favUrlTask.f283014f = 1;
        favUrlTask.f283015g = bundle;
        favUrlTask.mo114396f();
        if (favUrlTask.f283016h) {
            C5984s1.f22236f = 1;
            ((HashSet) nVar.f117924N.f118066e).add("sendAppMessage");
            nVar.f148259i.mo73815b(new C43644j(this));
        } else {
            ((C47453t0) C86312j.m106911c(C47453t0.class)).mo72473I2(favUrlTask.f283018j, 35, (Activity) context, this.f117900b);
        }
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 2);
    }
}
