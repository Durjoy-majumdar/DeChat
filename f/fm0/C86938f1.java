package fm0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84726c2;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: fm0.f1 */
public final class C86938f1 extends C82268c<C81879g> {
    private static final int CTRL_INDEX = 1066;
    private static final String NAME = "setVisualEffectOnCapture";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        if (gVar != null) {
            C84726c2 c2Var = null;
            String optString = jSONObject != null ? jSONObject.optString("visualEffect", "none") : null;
            Log.m105924i("MicroMsg.AppBrand.JsApiSetVisualEffectOnCapture", "invoke, visualEffect: " + optString);
            AppBrandRuntime runtime = gVar.getRuntime();
            if (runtime == null) {
                Log.m105928w("MicroMsg.AppBrand.SafeScreenShotRecordSwitcher", "get, runtime is null");
            } else {
                c2Var = runtime.f238140c1;
            }
            if (c2Var == null) {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                gVar.mo109647a(i, mo115115p("fail:internal error", jSONObject2));
            } else if (C87412m.m108589b(optString, "hidden")) {
                ((C119157j) C119157j.f356862d).mo183895z(new C86932d1(c2Var));
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 0);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                gVar.mo109647a(i, mo115115p("ok", jSONObject3));
            } else if (C87412m.m108589b(optString, "none")) {
                ((C119157j) C119157j.f356862d).mo183895z(new C86935e1(c2Var));
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 0);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                gVar.mo109647a(i, mo115115p("ok", jSONObject4));
            } else {
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("errno", 101);
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                }
                gVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject5));
            }
        }
    }
}
