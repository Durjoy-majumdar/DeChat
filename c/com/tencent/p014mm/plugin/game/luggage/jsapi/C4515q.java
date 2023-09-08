package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.q */
public class C4515q extends C43620m2 {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.q$a */
    public class C4516a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f19279d;

        /* renamed from: e */
        public final /* synthetic */ Context f19280e;

        public C4516a(C4515q qVar, C43620m2.C5947b bVar, Context context) {
            this.f19279d = bVar;
            this.f19280e = context;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == 1137) {
                if (i2 == -1) {
                    String stringExtra = intent.getStringExtra("ret_info");
                    if ("0".equals(stringExtra)) {
                        this.f19279d.mo6945a((String) null, (JSONObject) null);
                    } else {
                        this.f19279d.mo6945a(stringExtra, (JSONObject) null);
                    }
                } else {
                    this.f19279d.mo6945a("cancel", (JSONObject) null);
                }
                ((MMActivity) this.f19280e).mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "downloadGameVideo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("videoUrl", "");
            if (Util.isNullOrNil(optString)) {
                bVar.mo6945a("videoUrl is null", (JSONObject) null);
                return;
            }
            String optString2 = jSONObject.optString("thumbUrl", "");
            if (Util.isNullOrNil(optString2)) {
                bVar.mo6945a("thumbUrl is null", (JSONObject) null);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("game_from", 11);
            intent.putExtra("video_url", optString);
            intent.putExtra("thumb_url", optString2);
            ((MMActivity) context).mmSetOnActivityResultCallback(new C4516a(this, bVar, context));
            C88144b.m109795m(context, "game", ".media.GameVideoDownloadUI", intent, 1137);
        } catch (JSONException unused) {
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
    }
}
