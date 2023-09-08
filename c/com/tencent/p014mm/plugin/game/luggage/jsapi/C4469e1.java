package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import di3.C86312j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import sw1.C13794o;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.e1 */
public class C4469e1 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "queryHaowanPublish";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONArray jSONArray;
        Class cls = C13794o.class;
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            jSONArray = ((C13794o) C86312j.m106911c(cls)).mo13150DV((JSONArray) null, true);
        } else {
            JSONArray optJSONArray = e.optJSONArray("postIdList");
            jSONArray = (optJSONArray == null || optJSONArray.length() == 0) ? ((C13794o) C86312j.m106911c(cls)).mo13150DV((JSONArray) null, true) : ((C13794o) C86312j.m106911c(cls)).mo13150DV(optJSONArray, false);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", jSONArray);
        } catch (JSONException unused) {
        }
        bVar.mo6945a((String) null, jSONObject);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
