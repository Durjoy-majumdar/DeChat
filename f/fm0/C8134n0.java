package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88020k;
import org.json.JSONObject;

/* renamed from: fm0.n0 */
public class C8134n0 extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 198;
    public static final String NAME = "setNavigationBarColor";

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        int i2;
        C81879g gVar = (C81879g) fVar;
        try {
            int m = C88020k.m109562m(jSONObject.getString("frontColor"));
            int m2 = C88020k.m109562m(jSONObject.getString("backgroundColor"));
            jSONObject.optDouble("alpha", 1.0d);
            JSONObject optJSONObject = jSONObject.optJSONObject("animation");
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("duration");
                str = optJSONObject.optString("timingFunc");
                i2 = optInt;
            } else {
                str = "";
                i2 = 0;
            }
            C86959m0 m0Var = new C86959m0(this, gVar, i, i2, m, m2, str);
            if ((gVar instanceof C83780d1) || !gVar.getRuntime().mo113039X0()) {
                gVar.mo109673t(m0Var);
            } else {
                gVar.getRuntime().mo113020N0(m0Var);
            }
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            gVar.mo109647a(i, mo115115p("ok", jSONObject2));
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.JsApiSetNavigationBarColor", "Color parse error");
            gVar.mo109647a(i, mo115109j("fail:invalid color"));
        }
    }
}
