package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.game.api.GameInputConfig;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import p828wa.C53127q;
import rx3.C13598b0;
import sw1.C48472k;
import sw1.C48473l;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.u1 */
public final class C41921u1 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.u1$a */
    public static final class C41922a implements C48473l.C48475b {

        /* renamed from: a */
        public final /* synthetic */ C41921u1 f112930a;

        /* renamed from: b */
        public final /* synthetic */ C53096b<C53095a>.a f112931b;

        /* renamed from: c */
        public final /* synthetic */ String f112932c;

        public C41922a(C41921u1 u1Var, C53096b<C53095a>.a aVar, String str) {
            this.f112930a = u1Var;
            this.f112931b = aVar;
            this.f112932c = str;
        }

        /* renamed from: a */
        public void mo65760a(JSONObject jSONObject) {
            C53127q runtime;
            C48473l lVar = C48473l.C48476c.f129682a;
            lVar.f129681a.remove(this.f112932c);
            if (jSONObject != null) {
                this.f112930a.getClass();
                Log.m105924i("showInputToolView", "onFinish result = " + jSONObject);
                C53095a aVar = (C53095a) this.f112931b.f148189a;
                if (aVar != null && (runtime = aVar.getRuntime()) != null) {
                    runtime.mo73814a("GCInputDidCommit", jSONObject);
                }
            }
        }

        /* renamed from: b */
        public void mo65761b(C48472k kVar) {
            C53127q runtime;
            if (kVar != null) {
                this.f112930a.getClass();
                Log.m105924i("showInputToolView", "GameInputStateChange onChanged state = " + kVar);
                C53095a aVar = (C53095a) this.f112931b.f148189a;
                if (aVar != null && (runtime = aVar.getRuntime()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("gamecenter_identifier", this.f112932c);
                    jSONObject.put("isShow", kVar.f129680c);
                    jSONObject.put("inputHeight", kVar.f129679b);
                    jSONObject.put("contentText", kVar.f129678a);
                    C13598b0 b0Var = C13598b0.f38549a;
                    runtime.mo73814a("GCInputStateChange", jSONObject);
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "showInputToolView";
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
            String optString = jSONObject.optString("toolViewType");
            String optString2 = jSONObject.optString("gamecenter_identifier");
            String optString3 = jSONObject.optString("configdict");
            if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString3) || Util.isNullOrNil(optString2)) {
                aVar.mo73778c("invalid_params", (JSONObject) null);
            } else if (C87412m.m108589b(optString, "none")) {
                aVar.mo73776a();
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString3);
                    GameInputConfig gameInputConfig = new GameInputConfig();
                    gameInputConfig.textPlaceHolder = jSONObject2.optString("textPlaceHolder", "");
                    gameInputConfig.emoticonBoardViewType = jSONObject2.optString("emoticonBoardViewType", "");
                    gameInputConfig.contentText = jSONObject2.optString("contentText", "");
                    gameInputConfig.stickBtmIfNonEmpty = jSONObject2.optBoolean("stickBtmIfNonEmpty", false);
                    gameInputConfig.forceClearContent = jSONObject2.optBoolean("forceClearContent", false);
                    gameInputConfig.hideImgBtn = jSONObject2.optBoolean("hideImgBtn", false);
                    gameInputConfig.forceUserInterfaceStyle = jSONObject2.optInt("forceUserInterfaceStyle", 0);
                    gameInputConfig.showEmojiQuickInputView = jSONObject2.optBoolean("showEmojiQuickInputView", false);
                    gameInputConfig.canShowAtSomeoneView = jSONObject2.optBoolean("canShowAtSomeoneView", false);
                    gameInputConfig.quickEmojiList = jSONObject2.optString("quickEmojiList", "");
                    gameInputConfig.maxInputCharsCo = jSONObject2.optInt("maxInputCharsCo", 1000);
                    gameInputConfig.canSendWithoutText = jSONObject2.optBoolean("canSendWithoutText", false);
                    gameInputConfig.identifier = jSONObject2.optString("identifier", "");
                    gameInputConfig.isToolsProcess = MMApplicationContext.isToolsProcess();
                    gameInputConfig.atContentId = jSONObject2.optString("contentId", "");
                    gameInputConfig.atContext = jSONObject2.optString("context", "");
                    gameInputConfig.atLimit = jSONObject2.optInt("limit", 50);
                    gameInputConfig.maxInputCharsCount = jSONObject2.optInt("maxInputCharsCount", 1000);
                    gameInputConfig.returnKeyType = jSONObject2.optString("returnKeyType", "send");
                    gameInputConfig.identifier = optString2;
                    Intent intent = new Intent();
                    intent.putExtra("game_center_input_config", gameInputConfig);
                    intent.putExtra("game_center_input_view_type", optString);
                    C88144b.m109791i(context, "game", ".luggage.ui.circle.PostCommentDialogUI", intent, (Bundle) null);
                    C48473l lVar = C48473l.C48476c.f129682a;
                    lVar.f129681a.put(optString2, new C41922a(this, aVar, optString2));
                } catch (JSONException unused) {
                    aVar.mo73778c("configdict is not json obj", (JSONObject) null);
                }
            }
        }
    }
}
