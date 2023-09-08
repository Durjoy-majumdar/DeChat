package m22;

import com.tencent.p014mm.plugin.appbrand.jsapi.finder.C55511i;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60216z4;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: m22.f */
public class C10711f extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiOpenFinderProfile", "Invoke openFinderProfile");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("action", C55511i.NAME);
            jSONObject3.put("feedID", jSONObject.optString("feedID"));
            jSONObject3.put("finderUserName", jSONObject.optString("username"));
            jSONObject3.put("commentScene", jSONObject.optInt("commentScene"));
            jSONObject3.put("reportExtraInfo", jSONObject.optString("reportExtraInfo"));
            jSONObject2.put("extInfo", jSONObject3);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76898xr(MMApplicationContext.getContext(), jSONObject2.toString(), (C60216z4.C8821a<Object>) null);
            this.f19815f.mo5690b();
        } catch (JSONException e) {
            Log.printErrStackTrace("LiteAppJsApiOpenFinderProfile", e, "", new Object[0]);
            this.f19815f.mo5689a("fail");
        }
    }
}
