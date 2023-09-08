package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.y0 */
public final class C4555y0 extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "openStoreEmoticonDetailPage";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Object obj = C6013c.m5893e(str).get("productId");
        String str2 = obj instanceof String ? (String) obj : null;
        if (!(str2 == null || str2.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra("extra_id", str2);
            intent.putExtra("preceding_scence", 12);
            intent.putExtra("download_entrance_scene", 12);
            C88144b.m109791i(context, "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
            if (bVar != null) {
                bVar.mo6945a("openStoreEmoticonDetailPage:ok", (JSONObject) null);
            }
        } else if (bVar != null) {
            bVar.mo6945a("openStoreEmoticonDetailPage:fail empty productId", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
