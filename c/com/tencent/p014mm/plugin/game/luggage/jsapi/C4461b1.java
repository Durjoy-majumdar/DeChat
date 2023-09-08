package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import di3.C86312j;
import p244tt.C14088e;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.b1 */
public class C4461b1 extends C43620m2 {
    /* renamed from: b */
    public String mo5382b() {
        return "preloadLiteApp";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b.C53097a aVar) {
        ((C14088e) C86312j.m106911c(C14088e.class)).fh0(aVar.f148190b.f129368c.optString("appId"), aVar.f148190b.f129368c.has("path") ? aVar.f148190b.f129368c.optString("path") : "", "preloadLiteApp");
        aVar.mo73776a();
    }
}
