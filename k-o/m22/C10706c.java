package m22;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60216z4;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m22.c */
public class C10706c extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiOpenChannelsActivity", "Invoke openChannelsActivity");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("action", "openFinderFeed");
            jSONObject3.put("feedID", jSONObject.optString("feedId"));
            jSONObject3.put("nonceID", jSONObject.optString("nonceId"));
            jSONObject3.put("notGetReleatedList", jSONObject.optInt("notGetReleatedList"));
            jSONObject3.put("shareScene", jSONObject.optInt("shareScene"));
            jSONObject3.put("sessionId", jSONObject.optString(""));
            jSONObject3.put("requestScene", jSONObject.optInt("requestScene", 3));
            jSONObject3.put("reportExtraInfo", jSONObject.optString("reportExtraInfo"));
            jSONObject3.put("commentScene", jSONObject.optInt("commentScene"));
            jSONObject3.put("userName", jSONObject.optString("finderUserName"));
            jSONObject2.put("extInfo", jSONObject3);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76898xr(MMApplicationContext.getContext(), jSONObject2.toString(), (C60216z4.C8821a<Object>) null);
            this.f19815f.mo5690b();
        } catch (JSONException e) {
            Log.printErrStackTrace("LiteAppJsApiOpenChannelsActivity", e, "", new Object[0]);
            this.f19815f.mo5689a("fail");
        }
    }
}
