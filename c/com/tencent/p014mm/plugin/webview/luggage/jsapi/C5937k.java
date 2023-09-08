package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.k */
public class C5937k extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.k$a */
    public class C5938a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C43620m2.C5947b f22173d;

        public C5938a(C43620m2.C5947b bVar) {
            this.f22173d = bVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i != (C5937k.this.hashCode() & 65535)) {
                return;
            }
            if (i2 == -1) {
                this.f22173d.mo6945a((String) null, (JSONObject) null);
            } else {
                this.f22173d.mo6945a("fail", (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "batchViewCard";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("card_list");
            String optString2 = jSONObject.optString("tempalate_id");
            Intent intent = new Intent();
            intent.putExtra("card_list", optString);
            intent.putExtra("key_template_id", optString2);
            intent.putExtra("key_from_scene", 7);
            ((MMActivity) context).mmSetOnActivityResultCallback(new C5938a(bVar));
            C88144b.m109796n(context, "card", ".ui.CardViewEntranceUI", intent, hashCode() & 65535, false);
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.JsApiBatchViewCard", "paras data error: " + e.getMessage());
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
