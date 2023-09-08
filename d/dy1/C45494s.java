package dy1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.game.api.GameInputConfig;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import ke3.C88144b;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import sw1.C48472k;
import sw1.C48473l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Ldy1/s;", "Lcom/tencent/mm/plugin/lite/api/c;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: dy1.s */
public final class C45494s extends C4770c {

    /* renamed from: dy1.s$a */
    public static final class C45495a implements C48473l.C48475b {

        /* renamed from: a */
        public final /* synthetic */ String f123144a;

        public C45495a(String str) {
            this.f123144a = str;
        }

        /* renamed from: a */
        public void mo65760a(JSONObject jSONObject) {
            C48473l lVar = C48473l.C48476c.f129682a;
            lVar.f129681a.remove(this.f123144a);
            if (jSONObject != null) {
                Log.m105924i("showInputToolView", "onFinish result = " + jSONObject);
                LiteAppCenter.onEventTriggered("GCInputDidCommit", jSONObject.toString());
            }
        }

        /* renamed from: b */
        public void mo65761b(C48472k kVar) {
            if (kVar != null) {
                Log.m105924i("showInputToolView", "GameInputStateChange onChanged state = " + kVar);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gamecenter_identifier", this.f123144a);
                jSONObject.put("isShow", kVar.f129680c);
                jSONObject.put("inputHeight", kVar.f129679b);
                jSONObject.put("contentText", kVar.f129678a);
                LiteAppCenter.onEventTriggered("GCInputStateChange", jSONObject.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Context d = mo5676d();
        if (jSONObject == null || d == null) {
            this.f19815f.mo5689a("invalid_params");
            return;
        }
        String optString = jSONObject.optString("toolViewType");
        String optString2 = jSONObject.optString("gamecenter_identifier");
        String optString3 = jSONObject.optString("configdict");
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString3) || Util.isNullOrNil(optString2)) {
            this.f19815f.mo5689a("invalid_params");
        } else if (C87412m.m108589b(optString, "none")) {
            this.f19815f.mo5689a("none");
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
                C88144b.m109791i(d, "game", ".luggage.ui.circle.PostCommentDialogUI", intent, (Bundle) null);
                C48473l lVar = C48473l.C48476c.f129682a;
                lVar.f129681a.put(optString2, new C45495a(optString2));
            } catch (JSONException unused) {
                this.f19815f.mo5689a("configdict is not json obj");
            }
        }
    }
}
