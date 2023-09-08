package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.autogen.events.OpenGameCenterEvent;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.s0 */
public class C4524s0 extends C43620m2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "openGameCenter";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Log.m105925i("MicroMsg.JsApiOpenGameCenter", "JsonData = %s", str);
            OpenGameCenterEvent openGameCenterEvent = new OpenGameCenterEvent();
            OpenGameCenterEvent.C1106a aVar = openGameCenterEvent.f9383d;
            aVar.f9384a = jSONObject;
            aVar.f9385b = context;
            openGameCenterEvent.publish();
            bVar.mo6945a((String) null, (JSONObject) null);
        } catch (JSONException unused) {
            Log.m105920e("MicroMsg.JsApiOpenGameCenter", "json parse exception");
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
