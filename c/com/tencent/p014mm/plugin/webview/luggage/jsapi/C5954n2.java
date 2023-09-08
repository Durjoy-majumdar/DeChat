package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import com.tencent.p014mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.sdk.platformtools.Util;
import d93.C45298c;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.n2 */
public abstract class C5954n2<T extends C43658n> extends C43620m2<T> {
    /* renamed from: a */
    public void mo6949a(C53096b<T>.a aVar) {
        JSONObject jSONObject = aVar.f148190b.f129368c;
        String v = ((C43658n) aVar.f148189a).mo67943v();
        String str = null;
        C45298c cVar = ((C43658n) aVar.f148189a).f117922L;
        if (cVar != null) {
            str = cVar.mo70848n(v);
        }
        if (Util.isNullOrNil(str)) {
            str = v;
        }
        GameWebPerformanceInfo b = GameWebPerformanceInfo.m43446b(((C43658n) aVar.f148189a).mo67941t());
        if (b != null) {
            b.f108362o = 1;
        }
        try {
            jSONObject.put("currentUrl", v);
            jSONObject.put("shareUrl", str);
            CONTEXT context = aVar.f148189a;
            if (((C43658n) context).f117923M != null) {
                jSONObject.put("preVerifyAppId", ((C43658n) context).f117923M.mo67920b());
            }
            if (getClass().getName().equals(C5984s1.class.getName())) {
                jSONObject.put("sendAppMessageScene", C5984s1.f22236f);
                jSONObject.put("sourceUserName", C5984s1.f22235e);
                C5984s1.f22236f = 0;
            }
        } catch (JSONException unused) {
        }
        super.mo6949a(aVar);
    }
}
