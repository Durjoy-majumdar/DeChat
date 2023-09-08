package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONObject;
import p008bq.C0363p0;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.e */
public final class C4468e extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "browseEmoticonView";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Class cls = C0363p0.class;
        JSONObject e = C6013c.m5893e(str);
        if (e != null && context != null && bVar != null) {
            String optString = e.optString("md5");
            String optString2 = e.optString("product_id");
            if (Util.isNullOrNil(optString)) {
                bVar.mo6945a("invalid_params", (JSONObject) null);
                return;
            }
            IEmojiInfo r2 = ((C0363p0) C86312j.m106911c(cls)).mo403r2(optString);
            if (r2 == null) {
                C87412m.m108593f(optString, "md5");
                C87412m.m108593f(optString2, "productId");
                r2 = ((C0363p0) C86312j.m106911c(cls)).mo404zE();
                r2.mo62687p1(84);
                r2.mo62655c0(r2.getExtFlag() | 1);
                r2.mo62634E(optString2);
                r2.setMd5(optString);
            }
            Intent intent = new Intent();
            intent.putExtra("custom_smiley_preview_md5", optString);
            intent.putExtra("emoji_info", r2);
            intent.putExtra("custom_smiley_preview_productid", optString2);
            C88144b.m109795m(context, "emoji", ".ui.CustomSmileyPreviewUI", intent, 1111);
            bVar.mo6945a((String) null, (JSONObject) null);
        } else if (bVar != null) {
            bVar.mo6945a("invalid_params", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
