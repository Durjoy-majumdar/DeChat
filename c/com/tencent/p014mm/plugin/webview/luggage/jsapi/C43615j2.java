package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43657t;
import com.tencent.p014mm.sdk.platformtools.Log;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.j2 */
public class C43615j2 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "showOptionMenu";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiShowOptionMenu", "invoke");
        C43661n0 n0Var = ((C43658n) aVar.f148189a).f117951u;
        if (n0Var == null) {
            Log.m105924i("MicroMsg.JsApiShowOptionMenu", "actionBar is null");
            return;
        }
        for (C43657t next : n0Var.getMenuHelp().f117902a) {
            if (!next.f117907d) {
                next.f117906c = false;
            }
        }
        aVar.mo73776a();
    }
}
