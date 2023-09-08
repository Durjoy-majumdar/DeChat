package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import org.json.JSONObject;
import p828wa.C53096b;
import pe3.C89349b;
import wy1.C53224d;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.w1 */
public class C4546w1 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "startGameLifeConversation";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105924i("MicroMsg.GameLife.JsApiStartGameLifeConversation", "invokeInMM");
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
            return;
        }
        String optString = e.optString("fromUserName");
        String optString2 = e.optString("toUserName");
        int optInt = e.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        String optString3 = e.optString("ext_info");
        Log.m105925i("MicroMsg.GameLife.JsApiStartGameLifeConversation", "fromUserName:[%s] toUserName:[%s], scene:[%d], extInfo:[%s]", optString, optString2, Integer.valueOf(optInt), optString3);
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
            bVar.mo6945a("null_data", (JSONObject) null);
            return;
        }
        ((C53224d) C86312j.m106911c(C53224d.class)).mo73895WQ(context, optString, optString2, optInt, Util.isNullOrNil(optString3) ? null : new C89349b(optString3.getBytes()), e.optString("reportInfo"));
        bVar.mo6945a((String) null, (JSONObject) null);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
