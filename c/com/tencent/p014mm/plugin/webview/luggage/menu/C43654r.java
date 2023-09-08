package com.tencent.p014mm.plugin.webview.luggage.menu;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1876t4;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import java.util.HashSet;
import nj3.C76874e0;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.r */
public class C43654r extends C43634a {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.menu.r$a */
    public class C43655a extends C53099d {
        public C43655a(C43654r rVar) {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            return null;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "menu:share:timeline";
        }
    }

    public C43654r() {
        super(2);
    }

    /* renamed from: a */
    public void mo67921a(Context context, C43658n nVar, C76874e0 e0Var) {
        if (nVar.mo65805w(23)) {
            e0Var.mo107146h(2, context.getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, 0);
        }
    }

    /* renamed from: b */
    public void mo67922b(Context context, C43658n nVar, C43657t tVar) {
        ((HashSet) nVar.f117924N.f118066e).add(C82980n.NAME);
        nVar.f148259i.mo73815b(new C43655a(this));
        C115669n.INSTANCE.mo175911u(C1876t4.CTRL_INDEX, 10);
    }
}
