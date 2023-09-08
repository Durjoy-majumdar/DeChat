package n22;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import org.json.JSONObject;
import pe3.C89349b;
import wy1.C53221c;

/* renamed from: n22.e */
public class C11116e extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105924i("LiteAppJsApiStartGameLifeConversation", "Invoke startGameLifeConversation");
        if (jSONObject == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        String optString = jSONObject.optString("fromUserName");
        String optString2 = jSONObject.optString("toUserName");
        int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        String optString3 = jSONObject.optString("ext_info");
        Log.m105925i("LiteAppJsApiStartGameLifeConversation", "fromUserName:[%s] toUserName:[%s], scene:[%d], extInfo:[%s]", optString, optString2, Integer.valueOf(optInt), optString3);
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
            this.f19815f.mo5689a("invalid_params");
            return;
        }
        ((C53221c) C86312j.m106911c(C53221c.class)).mo73895WQ(MMApplicationContext.getContext(), optString, optString2, optInt, Util.isNullOrNil(optString3) ? null : new C89349b(optString3.getBytes()), (String) null);
        this.f19815f.mo5690b();
    }
}
