package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82980n;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import ke3.C88144b;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.h2 */
public class C5924h2 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.h2$a */
    public class C5925a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f22158d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f22159e;

        public C5925a(C53096b.C53097a aVar, MMActivity mMActivity) {
            this.f22158d = aVar;
            this.f22159e = mMActivity;
        }

        public void mmOnActivityResult(int i, int i2, Intent intent) {
            if (i == (C5924h2.this.hashCode() & 65535)) {
                if (i2 == -1) {
                    this.f22158d.mo73776a();
                } else {
                    this.f22158d.mo73778c("cancel", (JSONObject) null);
                }
                this.f22159e.mmSetOnActivityResultCallback((MMActivity.C6739d) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return C82980n.NAME;
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
        C53096b<C43658n>.a aVar2 = aVar;
        Log.m105924i("MicroMsg.JsApiShareTimeLine", "invoke");
        MMActivity mMActivity = (MMActivity) ((C43658n) aVar2.f148189a).f148196d;
        if (mMActivity == null || mMActivity.isFinishing()) {
            Log.m105928w("MicroMsg.JsApiShareTimeLine", "activity is null or finish");
            return;
        }
        JSONObject jSONObject = aVar2.f148190b.f129368c;
        String optString = jSONObject.optString("link");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiShareTimeLine", "link is null");
            aVar2.mo73778c("invalid_params", (JSONObject) null);
            return;
        }
        String optString2 = jSONObject.optString("desc");
        if (optString2 != null) {
            if (optString2.startsWith(HttpWrapperBase.PROTOCAL_HTTP)) {
                optString2.substring(7);
            } else if (optString2.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                optString2.substring(8);
            }
        }
        String optString3 = jSONObject.optString("appid");
        String optString4 = jSONObject.optString("img_width");
        String optString5 = jSONObject.optString("img_height");
        Log.m105925i("MicroMsg.JsApiShareTimeLine", "doTimeline, rawUrl:[%s], shareUrl:[%s]", optString, optString);
        String optString6 = jSONObject.optString("type");
        String optString7 = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        String optString8 = jSONObject.optString("img_url");
        String optString9 = jSONObject.optString("src_username");
        String optString10 = jSONObject.optString("src_displayname");
        int i = -1;
        try {
            i = Integer.valueOf(optString4).intValue();
            Integer.valueOf(optString5);
        } catch (Exception unused) {
        }
        Intent intent = new Intent();
        intent.putExtra("Ksnsupload_width", i);
        intent.putExtra("Ksnsupload_height", i);
        intent.putExtra("Ksnsupload_link", optString);
        intent.putExtra("Ksnsupload_title", optString7);
        intent.putExtra("Ksnsupload_imgurl", optString8);
        if (C45628s0.m50738C(optString9)) {
            intent.putExtra("src_username", optString9);
            intent.putExtra("src_displayname", optString10);
        }
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        if (!Util.isNullOrNil(optString6) && optString6.equals("music")) {
            intent.putExtra("ksnsis_music", true);
        }
        if (!Util.isNullOrNil(optString6) && optString6.equals("video")) {
            intent.putExtra("ksnsis_video", true);
        }
        if (optString3 != null && optString3.length() > 0) {
            intent.putExtra("Ksnsupload_appid", optString3);
        }
        intent.putExtra("ShareUrlOriginal", optString);
        intent.putExtra("ShareUrlOpen", ((C43658n) aVar2.f148189a).mo67943v());
        intent.putExtra("JsAppId", ((C43658n) aVar2.f148189a).f117923M.mo67920b());
        intent.putExtra("need_result", true);
        Log.m105924i("MicroMsg.JsApiShareTimeLine", "doTimeline, start activity");
        mMActivity.mmSetOnActivityResultCallback(new C5925a(aVar2, mMActivity));
        C88144b.m109796n(mMActivity, "sns", ".ui.SnsUploadUI", intent, hashCode() & 65535, false);
    }
}
