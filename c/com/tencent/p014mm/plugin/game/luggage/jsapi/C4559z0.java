package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.autogen.events.GameJsApiCommandEvent;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.FileReaderHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.z0 */
public class C4559z0 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "operateGameCenterMsg";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject jSONObject;
        Log.m105924i("MicroMsg.JsApiOperateGameCenterMsg", "invokeInMM");
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            Log.m105924i("MicroMsg.JsApiOperateGameCenterMsg", "data is null");
            bVar.mo6945a("invalid_data", (JSONObject) null);
            return;
        }
        int optInt = jSONObject.optInt(FileReaderHelper.OPEN_FILE_FROM_CMD);
        JSONObject optJSONObject = jSONObject.optJSONObject("param");
        GameJsApiCommandEvent gameJsApiCommandEvent = new GameJsApiCommandEvent();
        GameJsApiCommandEvent.C1076a aVar = gameJsApiCommandEvent.f9284d;
        aVar.f9286a = optInt;
        aVar.f9287b = optJSONObject.toString();
        gameJsApiCommandEvent.publish();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("result", Util.nullAsNil(gameJsApiCommandEvent.f9285e.f9288a));
        } catch (JSONException unused2) {
        }
        bVar.mo6945a((String) null, jSONObject2);
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
