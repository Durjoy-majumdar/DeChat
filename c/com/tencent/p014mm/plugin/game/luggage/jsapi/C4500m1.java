package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6209b4;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.m1 */
public class C4500m1 extends C5954n2<GameWebPage> {
    /* renamed from: b */
    public String mo5382b() {
        return "sendGameNameCard";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject jSONObject;
        Log.m105918d("MicroMsg.JsApiSendGameNameCard", "invokeInMM");
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            bVar.mo6945a("data is null", (JSONObject) null);
            return;
        }
        C6209b4.m6499a(jSONObject.optString("img_url"));
        HashMap hashMap = new HashMap();
        hashMap.put("img_url", jSONObject.optString("img_url"));
        hashMap.put("desc", jSONObject.optString("desc"));
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        hashMap.put("url", jSONObject.optString("shareUrl"));
        hashMap.put("nickname", jSONObject.optString("card_nick_name"));
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 2);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("webview_params", hashMap);
        intent.putExtra("is_game_card", true);
        intent.putExtra("Retr_Msg_Type", 2);
        C88144b.m109803u((MMActivity) context, ".ui.transmit.SelectConversationUI", intent, 1, new C4498l1(this, jSONObject, bVar, context));
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
    }
}
