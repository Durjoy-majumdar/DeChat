package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kr0.C10403n0;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.h1 */
public class C5923h1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "privateOpenWeappFunctionalPage";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiPrivateOpenWeappFunctionalPage", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10719kK(jSONObject.optString("uuid"), jSONObject.optString("req_data"));
        aVar.mo73776a();
        ((C43658n) aVar.f148189a).f117944Z = true;
    }
}
