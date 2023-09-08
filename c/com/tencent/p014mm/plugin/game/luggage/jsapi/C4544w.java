package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import jy1.C46587e;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.w */
public class C4544w extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "getGameWeakNetInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        C46587e eVar = C46587e.f125495a;
        boolean z = C46587e.m51909b() != 4;
        int b = C46587e.m51909b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("weakNetDetailFlags", b);
            jSONObject.put("underWeakNet", z);
        } catch (JSONException unused) {
        }
        bVar.mo6945a((String) null, jSONObject);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
