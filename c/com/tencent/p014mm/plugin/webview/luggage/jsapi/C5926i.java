package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import ke3.C88144b;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i */
public class C5926i extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i$a */
    public class C5927a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22161d;

        public C5927a(C53096b.C53097a aVar) {
            this.f22161d = aVar;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == (C5926i.this.hashCode() & 65535)) {
                HashMap hashMap = new HashMap();
                if (intent != null) {
                    hashMap.put("card_list", Util.nullAs(intent.getStringExtra("card_list"), ""));
                }
                if (i2 == -1) {
                    this.f22161d.mo73779d(hashMap);
                    return;
                }
                if ((intent != null ? intent.getIntExtra("result_code", 2) : 2) == 2) {
                    this.f22161d.mo73777b("fail", hashMap);
                } else {
                    this.f22161d.mo73777b("cancel", hashMap);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "batchAddCard";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        String optString = aVar.f148190b.f129368c.optString("card_list");
        String string = ((C43658n) aVar.f148189a).f148261n.getString("srcUsername");
        String v = ((C43658n) aVar.f148189a).mo67943v();
        String optString2 = aVar.f148190b.f129368c.optString("consumedCardId");
        ((C43658n) aVar.f148189a).f148261n.getString("KTemplateId");
        Log.m105925i("MicroMsg.JsApiBatchAddCard", "doBatchAddCard consumedCardId %s", optString2);
        Intent intent = new Intent();
        intent.putExtra("key_in_card_list", optString);
        intent.putExtra("key_from_scene", 7);
        intent.putExtra("src_username", string);
        intent.putExtra("js_url", v);
        intent.putExtra("key_consumed_card_id", optString2);
        ((MMActivity) ((C43658n) aVar.f148189a).f148196d).mmSetOnActivityResultCallback(new C5927a(aVar));
        C88144b.m109796n(((C43658n) aVar.f148189a).f148196d, "card", ".ui.CardAddEntranceUI", intent, hashCode() & 65535, false);
    }
}
