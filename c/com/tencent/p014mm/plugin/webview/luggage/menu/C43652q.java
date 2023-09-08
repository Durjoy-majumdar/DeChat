package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5984s1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashSet;
import nj3.C76874e0;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.q */
public class C43652q extends C43634a {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.menu.q$a */
    public class C43653a extends C53099d {
        public C43653a(C43652q qVar) {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend");
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "menu:share:appmessage";
        }
    }

    public C43652q() {
        super(1);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        if (nVar.mo65805w(21)) {
            e0Var.mo107146h(this.f117893a, context.getString(C0966R.string.hre), C0966R.raw.icons_filled_share, context.getResources().getColor(C0966R.color.f2939n));
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        C5984s1.f22236f = 0;
        ((HashSet) nVar.f117924N.f118066e).add("sendAppMessage");
        nVar.f148259i.mo73815b(new C43653a(this));
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 9);
    }
}
