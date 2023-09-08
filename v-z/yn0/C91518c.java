package yn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: yn0.c */
public final class C91518c extends C82268c<C91527j> {
    public static final String NAME = "invokeMiniProgramAPI";

    /* renamed from: g */
    public String mo115107g() {
        return "err_msg";
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C91527j jVar = (C91527j) fVar;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(jSONObject, "data");
        jSONObject.put("htmlId", jVar.f262347d.getHtmlId());
        jVar.f262347d.mo63248m0(jSONObject);
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
        }
        jVar.mo109647a(i, mo115115p("ok", jSONObject2));
    }
}
