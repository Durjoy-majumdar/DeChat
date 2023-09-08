package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.report.PageTimeReport27743;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.c */
public final class C4462c extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "addWebViewReportExtInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
        if (aVar != null) {
            Log.m105924i("addWebViewReportExtInfo", "invoke");
            JSONObject jSONObject = aVar.f148190b.f129368c;
            if (jSONObject == null) {
                Log.m105920e("addWebViewReportExtInfo", "data is null");
                aVar.mo73778c("null_data", (JSONObject) null);
                return;
            }
            String optString = jSONObject.optString("webviewReportExtInfoDict");
            if (!(optString == null || optString.length() == 0)) {
                C53095a aVar2 = (C53095a) aVar.f148189a;
                if (aVar2 instanceof C43658n) {
                    String v = ((C43658n) aVar2).mo67943v();
                    C87412m.m108593f(v, "page.url");
                    C87412m.m108593f(optString, "extInfo");
                    PageTimeReport27743 pageTimeReport27743 = PageTimeReport27743.f113093a;
                    PageTimeReport27743.f113096d.put(v, optString);
                    aVar.mo73776a();
                    return;
                }
                aVar.mo73778c("page is not LuggageMMWebPage", (JSONObject) null);
                return;
            }
            aVar.mo73778c("webviewReportExtInfoDict is null", (JSONObject) null);
        }
    }
}
