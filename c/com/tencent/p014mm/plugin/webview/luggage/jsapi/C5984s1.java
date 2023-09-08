package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import a93.C0019d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.model.C96648g;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6209b4;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.s1 */
public class C5984s1 extends C5954n2<C43658n> {

    /* renamed from: e */
    public static String f22235e;

    /* renamed from: f */
    public static int f22236f;

    /* renamed from: b */
    public String mo5382b() {
        return "sendAppMessage";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject jSONObject;
        Log.m105918d("MicroMsg.JsApiSendAppMessage", "invokeInMM");
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            bVar.mo6945a("data is null", (JSONObject) null);
            return;
        }
        int optInt = jSONObject.optInt("sendAppMessageScene", 0);
        if (optInt == 1) {
            Log.m105924i("MicroMsg.JsApiSendAppMessage", "favoriteUrl");
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            C96648g.C6033a aVar = new C96648g.C6033a();
            aVar.f22296a = jSONObject.optString("shareUrl");
            aVar.f22299d = jSONObject.optString("img_url");
            aVar.f22297b = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            aVar.f22298c = jSONObject.optString("desc");
            aVar.f22300e = jSONObject.optString("appid");
            if (context != null && (context instanceof MMActivity)) {
                DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
                aVar2.f264684i = (Activity) context;
                aVar2.f264688m = 36;
            }
            doFavoriteEvent.f264674d.f264692q = new C5974q1(this, bVar);
            C96648g.m124062a(doFavoriteEvent, aVar);
            doFavoriteEvent.publish();
            if (doFavoriteEvent.f264675e.f9046a != 0) {
                bVar.mo6945a("fail", (JSONObject) null);
            }
        } else if (optInt != 2) {
            C6209b4.m6499a(jSONObject.optString("img_url"));
            HashMap hashMap = new HashMap();
            hashMap.put("img_url", jSONObject.optString("img_url"));
            hashMap.put("desc", jSONObject.optString("desc"));
            hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
            hashMap.put("url", jSONObject.optString("shareUrl"));
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 35);
            intent.putExtra("scene_from", 2);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("webview_params", hashMap);
            intent.putExtra("Retr_Msg_Type", 2);
            C88144b.m109803u((MMActivity) context, ".ui.transmit.SelectConversationUI", intent, 1, new C5980r1(this, jSONObject, bVar, context));
        } else {
            C0019d.m10b(context, jSONObject.optString("sourceUserName"), jSONObject.optString("shareUrl"), jSONObject, bVar, (C0019d.C0021b) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
