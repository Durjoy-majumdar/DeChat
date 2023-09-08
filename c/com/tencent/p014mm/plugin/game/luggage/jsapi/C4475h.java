package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import zw1.C16408b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.h */
public final class C4475h extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "searchChatRoomMemberByName";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        if (bVar != null) {
            JSONObject e = C6013c.m5893e(str);
            if (e == null) {
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            String optString = e.optString("chatroomName");
            String optString2 = e.optString("searchText");
            if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            String z902 = ((C16408b) C86312j.m106911c(C16408b.class)).z90(optString, optString2);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("searchResult", new JSONArray(z902));
            } catch (JSONException unused) {
                jSONObject.put("searchResult", "[]");
            }
            bVar.mo6945a((String) null, jSONObject);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
