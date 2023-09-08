package j22;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C10403n0;
import org.json.JSONObject;

/* renamed from: j22.c */
public class C9275c extends C4770c {
    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiPreloadMiniProgramEnv", "Invoke preloadMiniProgramEnv");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        String optString = jSONObject.optString("appId");
        if (Util.isNullOrNil(optString)) {
            this.f19815f.mo5689a("fail: params error");
            return;
        }
        ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10718hK(optString);
        this.f19815f.mo5690b();
    }
}
