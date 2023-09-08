package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.z0 */
public final class C6005z0 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "openFinderTopicView";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        try {
            String string = new JSONObject(str).getString("extInfo");
            Log.m105926v("MicroMsg.JsApiOpenFinderTopicView", "openFinderTopic in mm process");
            boolean z = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("extInfo", new JSONObject(string));
                Context context2 = MMApplicationContext.getContext();
                C87412m.m108593f(context2, "getContext()");
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76793OJ(context2, jSONObject.toString());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.JsApiOpenFinderTopicView", e, "openFinderTopic exception", new Object[0]);
                z = false;
            }
            if (z) {
                if (bVar != null) {
                    bVar.mo6945a((String) null, (JSONObject) null);
                }
            } else if (bVar != null) {
                bVar.mo6945a("fail", (JSONObject) null);
            }
        } catch (JSONException e2) {
            Log.m105920e("MicroMsg.JsApiOpenFinderTopicView", "paras data error: " + e2.getMessage());
            if (bVar != null) {
                bVar.mo6945a("fail", (JSONObject) null);
            }
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
