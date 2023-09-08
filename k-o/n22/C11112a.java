package n22;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import zw1.C16408b;

/* renamed from: n22.a */
public class C11112a extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105924i("LiteAppJsApiChatRoomAtMember", "Invoke chatRoomAtMember");
        if (jSONObject == null) {
            this.f19815f.mo5689a("fail: data is null");
            return;
        }
        String optString = jSONObject.optString("chatRoomName");
        String optString2 = jSONObject.optString("userName");
        String optString3 = jSONObject.optString("nickName");
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2) || Util.isNullOrNil(optString3)) {
            this.f19815f.mo5689a("invalid_params");
            return;
        }
        ((C16408b) C86312j.m106911c(C16408b.class)).Vc0(optString, optString2, optString3);
        this.f19815f.mo5690b();
    }
}
