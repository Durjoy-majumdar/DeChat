package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.GameCommOperationEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.game.luggage.page.GameWebPage;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.FileReaderHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.u */
public class C4532u extends C43620m2<GameWebPage> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.u$a */
    public class C4533a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f19288d;

        public C4533a(C4532u uVar, C53096b.C53097a aVar) {
            this.f19288d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            try {
                this.f19288d.mo73780e(new JSONObject(((Bundle) obj).getString("backResult")));
            } catch (JSONException unused) {
                this.f19288d.mo73776a();
            }
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.u$b */
    public static class C4534b implements C80883e<Bundle, Bundle> {
        private C4534b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            int i = bundle.getInt(FileReaderHelper.OPEN_FILE_FROM_CMD);
            String string = bundle.getString("param");
            Bundle bundle2 = new Bundle();
            if (i == 10002) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("webpageCount", 1);
                } catch (JSONException unused) {
                }
                bundle2.putString("backResult", jSONObject.toString());
            } else {
                GameCommOperationEvent gameCommOperationEvent = new GameCommOperationEvent();
                GameCommOperationEvent.C1072a aVar = gameCommOperationEvent.f9268d;
                aVar.f9270a = i;
                aVar.f9271b = string;
                aVar.f9272c = MMApplicationContext.getContext();
                gameCommOperationEvent.publish();
                try {
                    if (!Util.isNullOrNil(gameCommOperationEvent.f9269e.f9273a)) {
                        bundle2.putString("backResult", new JSONObject(gameCommOperationEvent.f9269e.f9273a).toString());
                    } else {
                        bundle2.putString("backResult", "");
                    }
                } catch (JSONException unused2) {
                }
            }
            gVar.mo894a(bundle2);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "getGameCommInfo";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<GameWebPage>.a aVar) {
        Log.m105924i("MicroMsg.JsApiGetGameCommInfo", "invoke");
        JSONObject jSONObject = aVar.f148190b.f129368c;
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiGetGameCommInfo", "data is null");
            aVar.mo73778c("null_data", (JSONObject) null);
            return;
        }
        int optInt = jSONObject.optInt(FileReaderHelper.OPEN_FILE_FROM_CMD, 0);
        String optString = jSONObject.optString("param");
        Bundle bundle = new Bundle();
        bundle.putInt(FileReaderHelper.OPEN_FILE_FROM_CMD, optInt);
        bundle.putString("param", optString);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 10008) {
            try {
                jSONObject2.put("page_start_time", ((GameWebPage) aVar.f148189a).f112966l1.f148165a);
                aVar.mo73780e(jSONObject2);
            } catch (JSONException unused) {
                aVar.mo73776a();
            }
        } else if (optInt == 10009) {
            ((GameWebPage) aVar.f148189a).f112967m1 = Util.getLong(optString, System.currentTimeMillis());
            aVar.mo73776a();
        } else {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C4534b.class, new C4533a(this, aVar));
        }
    }
}
