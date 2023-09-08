package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import c30.C26827e;
import com.tencent.p014mm.plugin.game.luggage.LuggageGameWebViewUI;
import com.tencent.p014mm.plugin.game.luggage.api.GameAtSomeoneConfig;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import iy1.C46370a;
import iy1.C46373b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import p828wa.C53104i;
import p828wa.C53127q;
import yx1.C53631b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.s1 */
public final class C41919s1 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.s1$a */
    public static final class C41920a implements C53631b.C53633b {

        /* renamed from: a */
        public final /* synthetic */ C41919s1 f112927a;

        /* renamed from: b */
        public final /* synthetic */ C53096b<C53095a>.a f112928b;

        /* renamed from: c */
        public final /* synthetic */ String f112929c;

        public C41920a(C41919s1 s1Var, C53096b<C53095a>.a aVar, String str) {
            this.f112927a = s1Var;
            this.f112928b = aVar;
            this.f112929c = str;
        }

        /* renamed from: a */
        public void mo65758a(JSONObject jSONObject) {
            C53127q runtime;
            C53631b bVar = C53631b.C53634c.f150678a;
            bVar.f150677a.remove(this.f112929c);
            if (jSONObject != null) {
                this.f112927a.getClass();
                Log.m105924i("showAtSomeoneView", "onFinish result = " + jSONObject);
                C53095a aVar = (C53095a) this.f112928b.f148189a;
                if (aVar != null && (runtime = aVar.getRuntime()) != null) {
                    runtime.mo73814a("GameAtSomeoneStateFinish", jSONObject);
                }
            }
        }

        /* renamed from: b */
        public void mo65759b(JSONObject jSONObject) {
            C53127q runtime;
            if (jSONObject != null) {
                this.f112927a.getClass();
                Log.m105924i("showAtSomeoneView", "GameAtSomeoneStateChange onChanged state = " + jSONObject);
                C53095a aVar = (C53095a) this.f112928b.f148189a;
                if (aVar != null && (runtime = aVar.getRuntime()) != null) {
                    runtime.mo73814a("GameAtSomeoneStateChange", jSONObject);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "showAtSomeoneView";
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
        if (aVar != null) {
            JSONObject jSONObject = aVar.f148190b.f129368c;
            Context context = ((C53095a) aVar.f148189a).getContext();
            if (jSONObject == null || context == null) {
                aVar.mo73778c("invalid_params", (JSONObject) null);
                return;
            }
            String optString = jSONObject.optString("gamecenterIdentifier");
            String optString2 = jSONObject.optString("configDict");
            if (Util.isNullOrNil(optString2) || Util.isNullOrNil(optString)) {
                aVar.mo73778c("invalid_params", (JSONObject) null);
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(optString2);
                GameAtSomeoneConfig gameAtSomeoneConfig = new GameAtSomeoneConfig();
                gameAtSomeoneConfig.f112889d = jSONObject2.optString("searchContentText", "");
                gameAtSomeoneConfig.f112890e = jSONObject2.optBoolean("showAtSomeoneView", false);
                gameAtSomeoneConfig.f112891f = jSONObject2.optBoolean("enableAtSomeoneService", false);
                gameAtSomeoneConfig.f112893h = jSONObject2.optString("AtList", "");
                gameAtSomeoneConfig.f112892g = MMApplicationContext.isToolsProcess();
                gameAtSomeoneConfig.f112895j = jSONObject2.optString("atContentId", "");
                gameAtSomeoneConfig.f112896n = jSONObject2.optString("atContext", "");
                gameAtSomeoneConfig.f112897o = jSONObject2.optInt("atLimit", 50);
                gameAtSomeoneConfig.f112898p = jSONObject2.optInt("bottomHeight", 0);
                gameAtSomeoneConfig.f112894i = optString;
                CONTEXT context2 = aVar.f148189a;
                if (context2 instanceof C53104i) {
                    C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.luggage.container.LuggagePage");
                    Context context3 = ((C53104i) context2).f148196d;
                    if (context3 instanceof LuggageGameWebViewUI) {
                        C26827e eVar = C46370a.f124960a;
                        LuggageGameWebViewUI luggageGameWebViewUI = (LuggageGameWebViewUI) context3;
                        C87412m.m108594g(luggageGameWebViewUI, "ctx");
                        C46370a.f124964e = gameAtSomeoneConfig;
                        C46370a.f124963d = gameAtSomeoneConfig.f112892g;
                        ((C119157j) C119157j.f356862d).mo183895z(new C46373b(luggageGameWebViewUI, gameAtSomeoneConfig));
                    }
                }
                C53631b bVar = C53631b.C53634c.f150678a;
                bVar.f150677a.put(optString, new C41920a(this, aVar, optString));
            } catch (JSONException unused) {
                aVar.mo73778c("configDict is not json obj", (JSONObject) null);
            }
        }
    }
}
