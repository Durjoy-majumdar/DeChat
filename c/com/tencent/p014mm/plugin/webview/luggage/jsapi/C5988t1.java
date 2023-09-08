package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.C5871a0;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.t1 */
public class C5988t1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "setBounceBackground";
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
        Log.m105924i("MicroMsg.JsApiSetBounceBackground", "invokeInOwn");
        String optString = aVar.f148190b.f129368c.optString("backgroundColor");
        if (Util.isNullOrNil(optString)) {
            aVar.mo73778c("invalid_data", (JSONObject) null);
            return;
        }
        C43658n nVar = (C43658n) aVar.f148189a;
        nVar.f117925P.post(new C5871a0(nVar, optString));
        aVar.mo73776a();
    }
}
