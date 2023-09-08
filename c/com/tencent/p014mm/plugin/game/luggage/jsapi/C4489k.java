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
import k83.C9566b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.k */
public class C4489k extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.k$a */
    public class C4490a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f19260d;

        public C4490a(C4489k kVar, C53096b.C53097a aVar) {
            this.f19260d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            this.f19260d.mo73776a();
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.k$b */
    public static class C4491b implements C80883e<Bundle, Bundle> {
        private C4491b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("appId");
            String string2 = bundle.getString("keys");
            if (bundle.getBoolean("clearAllData")) {
                C9566b.m9247c().mo10245d().mo10252jo(string);
            } else if (!Util.isNullOrNil(string2)) {
                try {
                    C9566b.m9247c().mo10245d().mo10248Lo(string, new JSONArray(string2));
                } catch (JSONException unused) {
                }
            }
            gVar.mo894a(null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "clearGameData";
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
        Log.m105924i("MicroMsg.JsApiClearGameData", "invokeInOwn");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        C53095a aVar2 = (C53095a) aVar.f148189a;
        String str = "wx62d9035fd4fd2059";
        if (aVar2 instanceof GameWebPage) {
            GameWebPage gameWebPage = (GameWebPage) aVar2;
            String b = gameWebPage.f117923M.mo67920b();
            if (Util.isNullOrNil(b)) {
                Uri parse = Uri.parse(Util.nullAsNil(gameWebPage.mo67941t()));
                if (parse.getHost() == null || !parse.getHost().equals(WeChatHosts.domainString(C0966R.string.flk))) {
                    Log.m105924i("MicroMsg.JsApiClearGameData", "appId is null");
                    aVar.mo73778c("appid_null", (JSONObject) null);
                    return;
                }
            } else {
                str = b;
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("keys");
        boolean optBoolean = jSONObject.optBoolean("clearAllData", false);
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            bundle.putString("keys", optJSONArray.toString());
        } else if (optBoolean) {
            bundle.putBoolean("clearAll", optBoolean);
        } else {
            Log.m105924i("MicroMsg.JsApiClearGameData", "keys is null");
            aVar.mo73778c("fail", (JSONObject) null);
            return;
        }
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C4491b.class, new C4490a(this, aVar));
    }
}
