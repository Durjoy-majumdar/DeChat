package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import k83.C9565a;
import k83.C9566b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.v */
public class C4537v extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.v$a */
    public class C4538a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f19292d;

        public C4538a(C4537v vVar, C53096b.C53097a aVar) {
            this.f19292d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("value");
            String string2 = bundle.getString("weight");
            long j = bundle.getLong("expireTime");
            String string3 = bundle.getString(DownloadInfo.FILENAME);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("weight", string2);
                jSONObject.put("expireTime", j);
                if (!Util.isNullOrNil(string)) {
                    jSONObject.put("value", string);
                } else if (!Util.isNullOrNil(string3)) {
                    jSONObject.put("value", C9566b.m9247c().mo10244b(string3));
                }
            } catch (JSONException unused) {
            }
            if (jSONObject.has("value")) {
                this.f19292d.mo73780e(jSONObject);
            } else {
                this.f19292d.mo73776a();
            }
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.v$b */
    public static class C4539b implements C80883e<Bundle, Bundle> {
        private C4539b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C9565a a = C9566b.m9247c().mo10243a(bundle.getString("appId"), bundle.getString("key"));
            Bundle bundle2 = new Bundle();
            bundle2.putString("value", a.field_value);
            bundle2.putString("weight", a.field_weight);
            bundle2.putLong("expireTime", a.field_expireTime - (System.currentTimeMillis() / 1000));
            bundle2.putString(DownloadInfo.FILENAME, a.field_localFile);
            gVar.mo894a(bundle2);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "getGameData";
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
        Log.m105924i("MicroMsg.JsApiGetGameData", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetGameData", "data is null");
            aVar.mo73778c("null_data", (JSONObject) null);
            return;
        }
        C53095a aVar2 = (C53095a) aVar.f148189a;
        String str = "wx62d9035fd4fd2059";
        if (aVar2 instanceof GameWebPage) {
            GameWebPage gameWebPage = (GameWebPage) aVar2;
            String b = gameWebPage.f117923M.mo67920b();
            if (Util.isNullOrNil(b)) {
                Uri parse = Uri.parse(Util.nullAsNil(gameWebPage.mo67941t()));
                if (parse.getHost() == null || !parse.getHost().equals(WeChatHosts.domainString(C0966R.string.flk))) {
                    Log.m105924i("MicroMsg.JsApiGetGameData", "appId is null");
                    aVar.mo73778c("appid_null", (JSONObject) null);
                    return;
                }
            } else {
                str = b;
            }
        }
        String optString = jSONObject.optString("key");
        if (Util.isNullOrNil(optString)) {
            Log.m105924i("MicroMsg.JsApiGetGameData", "key is null");
            aVar.mo73778c("null_key", (JSONObject) null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putString("key", optString);
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C4539b.class, new C4538a(this, aVar));
    }
}
