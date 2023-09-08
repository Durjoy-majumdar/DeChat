package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import sw1.C13794o;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.d1 */
public class C4467d1 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "publishHaowanEdition";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        String str2;
        C43620m2.C5947b bVar2 = bVar;
        Class cls = C13794o.class;
        Log.m105924i("MicroMsg.JsApiPublishHaowanEdition", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar2.mo6945a("invalid_data", (JSONObject) null);
            return;
        }
        String optString = e.optString("postId");
        boolean z = true;
        boolean optBoolean = e.optBoolean("compressImg", true);
        if (!Util.isNullOrNil(optString)) {
            str2 = ((C13794o) C86312j.m106911c(cls)).mo13152TN(optString);
        } else {
            JSONArray optJSONArray = e.optJSONArray("localIds");
            int optInt = e.optInt("from");
            int optInt2 = e.optInt("postType");
            String optString2 = e.optString("extra");
            int optInt3 = e.optInt("sourceSceneId");
            int optInt4 = e.optInt("MiniGamePublish", 0);
            C13794o.C13795a aVar = new C13794o.C13795a();
            aVar.f38926a = optInt4 == 1;
            if (e.optInt("needDelAfterPost", 0) != 1) {
                z = false;
            }
            aVar.f38928c = z;
            aVar.f38927b = e.optString("videoId");
            str2 = ((C13794o) C86312j.m106911c(cls)).mo13153wC(optInt, optInt2, optJSONArray, optString2, optBoolean, optInt3, aVar);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("postId", str2);
        } catch (JSONException unused) {
        }
        bVar2.mo6945a((String) null, jSONObject);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
