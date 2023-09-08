package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import bl0.C67288e;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C5954n2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import sw1.C101703s;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.p0 */
public class C4510p0 extends C5954n2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.p0$a */
    public class C4511a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f19276d;

        public C4511a(C4510p0 p0Var, C53096b.C53097a aVar) {
            this.f19276d = aVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == 510) {
                if (i2 == -1) {
                    int intExtra = intent.getIntExtra("webview_callback_err", 0);
                    if (intExtra == 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("videoInfo", new JSONArray(intent.getStringExtra("key_video_info")).getJSONObject(0));
                        } catch (JSONException e) {
                            Log.m105921e("MicroMsg.JsApiLaunchGameVideoEditor", "json_err:%s", e.getMessage());
                        }
                        this.f19276d.mo73780e(jSONObject);
                    } else if (intExtra == 1) {
                        this.f19276d.mo73778c("cancel", (JSONObject) null);
                    } else if (intExtra == 2) {
                        this.f19276d.mo73778c("download_err", (JSONObject) null);
                    }
                } else {
                    this.f19276d.mo73778c("cancel", (JSONObject) null);
                }
                ((MMActivity) ((GameWebPage) this.f19276d.f148189a).f148196d).mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "launchGameVideoEditor";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
        String optString = aVar.f148190b.f129368c.optString("videoUrl");
        String optString2 = aVar.f148190b.f129368c.optString("thumbUrl");
        String optString3 = aVar.f148190b.f129368c.optString("appId");
        int optInt = aVar.f148190b.f129368c.optInt("sourceSceneId");
        if (Util.isNullOrNil(optString)) {
            aVar.mo73778c("invalid_videoUrl", (JSONObject) null);
            return;
        }
        ((C101703s) C86312j.m106911c(C101703s.class)).mo10938ZI(((GameWebPage) aVar.f148189a).f148196d, optString, optString2, optString3, C67288e.CTRL_INDEX, optInt);
        ((MMActivity) ((GameWebPage) aVar.f148189a).f148196d).mmSetOnActivityResultCallback(new C4511a(this, aVar));
    }
}
