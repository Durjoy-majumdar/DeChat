package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import di3.C86312j;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.q0 */
public final class C4517q0 extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "notifyAccountState";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (bVar != null && context != null) {
            JSONObject e = C6013c.m5893e(str);
            if (e == null) {
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            int optInt = e.optInt("state", -1);
            if (optInt == -1) {
                bVar.mo6945a("state is null", (JSONObject) null);
                return;
            }
            ((C48478n) C86312j.m106911c(C48478n.class)).mo65687jZ(optInt);
            bVar.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
