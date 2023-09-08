package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import ke3.C88144b;
import org.json.JSONObject;
import p749xh.C66261f3;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g1 */
public class C5917g1 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g1$a */
    public class C5918a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22148d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f22149e;

        public C5918a(C53096b.C53097a aVar, MMActivity mMActivity) {
            this.f22148d = aVar;
            this.f22149e = mMActivity;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == (C5917g1.this.hashCode() & 65535)) {
                if (i2 == -1) {
                    this.f22148d.mo73776a();
                } else if (i2 != 0) {
                    this.f22148d.mo73778c("fail", (JSONObject) null);
                } else {
                    this.f22148d.mo73778c("cancel", (JSONObject) null);
                }
                this.f22149e.mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "previewVideo";
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
        Log.m105924i("MicroMsg.GameJsApiPreviewVideo", "invoke");
        if (Util.isNullOrNil(aVar.f148190b.f129368c.optString(C66261f3.COL_LOCALID))) {
            Log.m105924i("MicroMsg.GameJsApiPreviewVideo", "data is invalid");
            aVar.mo73778c("invalid_data", (JSONObject) null);
            return;
        }
        String optString = aVar.f148190b.f129368c.optString(C66261f3.COL_LOCALID);
        Log.m105925i("MicroMsg.GameJsApiPreviewVideo", "localId:%s", optString);
        MMActivity mMActivity = (MMActivity) ((C43658n) aVar.f148189a).f148196d;
        mMActivity.mmSetOnActivityResultCallback(new C5918a(aVar, mMActivity));
        Intent intent = new Intent();
        if (Util.nullAsNil(optString).trim().startsWith("weixin://bgmixid/")) {
            intent.putExtra("game_bg_mix_fake_local_id", Util.nullAsNil(optString).trim());
            C88144b.m109795m(mMActivity, "game", ".media.background.GameFakeVideoUI", intent, hashCode() & 65535);
            return;
        }
        WebViewJSSDKFileItem a = C6013c.m5889a(optString);
        if (a == null || TextUtils.isEmpty(a.f283024g) || !C86013q1.m106450k(a.f283024g)) {
            Log.m105921e("MicroMsg.GameJsApiPreviewVideo", "the item is null or the File item not exist for localId: %s", optString);
            aVar.mo73778c("fail", (JSONObject) null);
            return;
        }
        intent.putExtra("key_video_path", a.f283024g);
        C88144b.m109795m(mMActivity, "card", ".ui.CardGiftVideoUI", intent, hashCode() & 65535);
    }
}
