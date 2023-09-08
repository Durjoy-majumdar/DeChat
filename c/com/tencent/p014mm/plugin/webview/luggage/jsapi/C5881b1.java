package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53096b;
import p828wa.C53106j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b1 */
public class C5881b1 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b1$a */
    public class C5882a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f22090d;

        /* renamed from: e */
        public final /* synthetic */ C53096b.C53097a f22091e;

        public C5882a(C5881b1 b1Var, String str, C53096b.C53097a aVar) {
            this.f22090d = str;
            this.f22091e = aVar;
        }

        public void run() {
            Bundle bundle = new Bundle();
            bundle.putString("rawUrl", this.f22090d);
            bundle.putBoolean("from_find_more_friend", ((C43658n) this.f22091e.f148189a).f148261n.getBoolean("from_find_more_friend", false));
            C53106j.this.mo73792g(this.f22090d, bundle);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "openUrlWithExtraWebview";
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
        Log.m105924i("MicroMsg.JsApiOpenUrlWithExtraWebview", "invokeInOwn");
        String optString = aVar.f148190b.f129368c.optString("url");
        Log.m105925i("MicroMsg.JsApiOpenUrlWithExtraWebview", "url: %s", optString);
        if (Util.isNullOrNil(optString)) {
            aVar.mo73778c("fail", (JSONObject) null);
            return;
        }
        Uri parse = Uri.parse(optString);
        if (Util.nullAsNil(parse.getQueryParameter("not_in_game_luggage")).equals("1") || (parse.getHost() != null && !parse.getHost().equals(WeChatHosts.domainString(C0966R.string.flk)))) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", optString);
            C88144b.m109791i(((C43658n) aVar.f148189a).f148196d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            aVar.mo73776a();
            return;
        }
        MMHandlerThread.postToMainThread(new C5882a(this, optString, aVar));
        aVar.mo73776a();
    }
}
