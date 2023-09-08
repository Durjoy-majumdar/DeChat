package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import ky1.C46803a;
import p828wa.C53095a;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.l */
public class C41915l extends C43620m2<C53095a> {
    /* renamed from: b */
    public String mo5382b() {
        return "closeJsCore";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
        Log.m105924i("MicroMsg.JsApiCloseJsCore", "invokeInOwn");
        if (C46803a.m52100d() != null) {
            C46803a.m52100d().mo72023a();
        }
    }
}
